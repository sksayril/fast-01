package io.flutter.plugins.camera;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class o0 {

    /* renamed from: y  reason: collision with root package name */
    static String f10222y = "VideoRenderer";

    /* renamed from: a  reason: collision with root package name */
    private final int[] f10223a = new int[1];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f10224b = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: c  reason: collision with root package name */
    private final int[] f10225c = {2, 1, 0, 0, 3, 2};

    /* renamed from: d  reason: collision with root package name */
    private int f10226d;

    /* renamed from: e  reason: collision with root package name */
    private int f10227e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f10228f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private int f10229g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f10230h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f10231i = 0;

    /* renamed from: j  reason: collision with root package name */
    EGLDisplay f10232j;

    /* renamed from: k  reason: collision with root package name */
    EGLContext f10233k;

    /* renamed from: l  reason: collision with root package name */
    EGLSurface f10234l;

    /* renamed from: m  reason: collision with root package name */
    private Thread f10235m;

    /* renamed from: n  reason: collision with root package name */
    private final Surface f10236n;

    /* renamed from: o  reason: collision with root package name */
    SurfaceTexture f10237o;

    /* renamed from: p  reason: collision with root package name */
    private Surface f10238p;

    /* renamed from: q  reason: collision with root package name */
    private HandlerThread f10239q;

    /* renamed from: r  reason: collision with root package name */
    final Object f10240r = new Object();

    /* renamed from: s  reason: collision with root package name */
    Boolean f10241s = Boolean.FALSE;

    /* renamed from: t  reason: collision with root package name */
    final int f10242t;

    /* renamed from: u  reason: collision with root package name */
    final int f10243u;

    /* renamed from: v  reason: collision with root package name */
    private int f10244v = 0;

    /* renamed from: w  reason: collision with root package name */
    private final Object f10245w = new Object();

    /* renamed from: x  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f10246x;

    class a implements SurfaceTexture.OnFrameAvailableListener {
        a() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            synchronized (o0.this.f10240r) {
                if (o0.this.f10241s.booleanValue()) {
                    Log.w(o0.f10222y, "Frame available before processing other frames. dropping frames");
                }
                o0 o0Var = o0.this;
                o0Var.f10241s = Boolean.TRUE;
                o0Var.f10240r.notifyAll();
            }
        }
    }

    class b extends Thread {
        b() {
        }

        public void run() {
            o0 o0Var;
            o0.this.c();
            while (!Thread.interrupted()) {
                try {
                    synchronized (o0.this.f10240r) {
                        while (!o0.this.f10241s.booleanValue()) {
                            o0.this.f10240r.wait(500);
                        }
                        o0Var = o0.this;
                        o0Var.f10241s = Boolean.FALSE;
                    }
                    o0Var.f10237o.updateTexImage();
                    float[] fArr = new float[16];
                    o0.this.f10237o.getTransformMatrix(fArr);
                    o0 o0Var2 = o0.this;
                    o0Var2.e(o0Var2.f10242t, o0Var2.f10243u, fArr);
                } catch (InterruptedException unused) {
                    Log.d(o0.f10222y, "thread interrupted while waiting for frames");
                    return;
                }
            }
        }
    }

    public o0(Surface surface, int i10, int i11, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10236n = surface;
        this.f10243u = i11;
        this.f10242t = i10;
        this.f10246x = uncaughtExceptionHandler;
        k();
        Log.d(f10222y, "VideoRenderer setup complete");
    }

    private void a() {
        GLES20.glDeleteBuffers(2, this.f10228f, 0);
        GLES20.glDeleteTextures(1, this.f10223a, 0);
        EGL14.eglDestroyContext(this.f10232j, this.f10233k);
        EGL14.eglDestroySurface(this.f10232j, this.f10234l);
        GLES20.glDeleteProgram(this.f10226d);
    }

    private void d(int i10) {
        GLES20.glDeleteShader(i10);
    }

    private int h(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    private void k() {
        Log.d(f10222y, "Starting OpenGL Thread");
        b bVar = new b();
        this.f10235m = bVar;
        bVar.setUncaughtExceptionHandler(this.f10246x);
        this.f10235m.start();
    }

    public void b() {
        this.f10235m.interrupt();
        this.f10239q.quitSafely();
        a();
        this.f10237o.release();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        synchronized (this.f10245w) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.f10232j = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    throw new RuntimeException("eglInitialize(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                } else if (EGL14.eglQueryString(this.f10232j, 12373).contains("EGL_ANDROID_presentation_time")) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.f10232j, n0.b() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        int eglGetError = EGL14.eglGetError();
                        if (eglGetError == 12288) {
                            this.f10233k = EGL14.eglCreateContext(this.f10232j, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            int eglGetError2 = EGL14.eglGetError();
                            if (eglGetError2 == 12288) {
                                this.f10234l = EGL14.eglCreateWindowSurface(this.f10232j, eGLConfigArr[0], this.f10236n, new int[]{12344}, 0);
                                int eglGetError3 = EGL14.eglGetError();
                                if (eglGetError3 == 12288) {
                                    EGLDisplay eGLDisplay = this.f10232j;
                                    EGLSurface eGLSurface = this.f10234l;
                                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f10233k)) {
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f10224b.length * 4);
                                        allocateDirect.order(ByteOrder.nativeOrder());
                                        allocateDirect.asFloatBuffer().put(this.f10224b);
                                        allocateDirect.asFloatBuffer().position(0);
                                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f10225c.length * 4);
                                        allocateDirect2.order(ByteOrder.nativeOrder());
                                        allocateDirect2.asIntBuffer().put(this.f10225c);
                                        allocateDirect2.position(0);
                                        int h10 = h(35633, "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }");
                                        int h11 = h(35632, " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }");
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.f10226d = glCreateProgram;
                                        GLES20.glAttachShader(glCreateProgram, h10);
                                        GLES20.glAttachShader(this.f10226d, h11);
                                        GLES20.glLinkProgram(this.f10226d);
                                        d(h10);
                                        d(h11);
                                        this.f10227e = GLES20.glGetAttribLocation(this.f10226d, "vertexPosition");
                                        this.f10229g = GLES20.glGetAttribLocation(this.f10226d, "uvs");
                                        this.f10230h = GLES20.glGetUniformLocation(this.f10226d, "texMatrix");
                                        this.f10231i = GLES20.glGetUniformLocation(this.f10226d, "mvp");
                                        GLES20.glGenBuffers(2, this.f10228f, 0);
                                        GLES20.glBindBuffer(34962, this.f10228f[0]);
                                        GLES20.glBufferData(34962, this.f10224b.length * 4, allocateDirect, 35048);
                                        GLES20.glBindBuffer(34963, this.f10228f[1]);
                                        GLES20.glBufferData(34963, this.f10225c.length * 4, allocateDirect2, 35048);
                                        GLES20.glGenTextures(1, this.f10223a, 0);
                                        GLES20.glBindTexture(36197, this.f10223a[0]);
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(g());
                                        this.f10237o = surfaceTexture;
                                        surfaceTexture.setDefaultBufferSize(this.f10242t, this.f10243u);
                                        HandlerThread handlerThread = new HandlerThread("FrameHandlerThread");
                                        this.f10239q = handlerThread;
                                        handlerThread.start();
                                        this.f10238p = new Surface(this.f10237o);
                                        this.f10237o.setOnFrameAvailableListener(new a(), new Handler(this.f10239q.getLooper()));
                                        this.f10245w.notifyAll();
                                    } else {
                                        throw new RuntimeException("eglMakeCurrent(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                    }
                                } else {
                                    throw new RuntimeException(GLUtils.getEGLErrorString(eglGetError3));
                                }
                            } else {
                                throw new RuntimeException(GLUtils.getEGLErrorString(eglGetError2));
                            }
                        } else {
                            throw new RuntimeException(GLUtils.getEGLErrorString(eglGetError));
                        }
                    } else {
                        throw new RuntimeException(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                    }
                } else {
                    throw new RuntimeException("cannot configure OpenGL. missing EGL_ANDROID_presentation_time");
                }
            } else {
                throw new RuntimeException("eglDisplay == EGL14.EGL_NO_DISPLAY: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            }
        }
    }

    public void e(int i10, int i11, float[] fArr) {
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glUseProgram(this.f10226d);
        GLES20.glUniformMatrix4fv(this.f10230h, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f10231i, 1, false, i(), 0);
        GLES20.glBindBuffer(34962, this.f10228f[0]);
        GLES20.glBindBuffer(34963, this.f10228f[1]);
        GLES20.glEnableVertexAttribArray(this.f10227e);
        GLES20.glVertexAttribPointer(this.f10227e, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(this.f10229g);
        GLES20.glVertexAttribPointer(this.f10229g, 2, 5126, false, 20, 12);
        GLES20.glDrawElements(4, 6, 5125, 0);
        EGLExt.eglPresentationTimeANDROID(this.f10232j, this.f10234l, SystemClock.uptimeMillis() * 1000000);
        if (!EGL14.eglSwapBuffers(this.f10232j, this.f10234l)) {
            String str = f10222y;
            Log.w(str, "eglSwapBuffers() " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    public Surface f() {
        Surface surface;
        synchronized (this.f10245w) {
            while (true) {
                surface = this.f10238p;
                if (surface == null) {
                    this.f10245w.wait();
                }
            }
        }
        return surface;
    }

    public int g() {
        return this.f10223a[0];
    }

    public float[] i() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, (float) this.f10244v, 0.0f, 0.0f, 1.0f);
        return fArr;
    }

    public void j(int i10) {
        this.f10244v = i10;
    }
}
