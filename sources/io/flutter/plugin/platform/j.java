package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import d8.h;
import io.flutter.view.e;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(23)
class j extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private int f10090m;

    /* renamed from: n  reason: collision with root package name */
    private int f10091n;

    /* renamed from: o  reason: collision with root package name */
    private int f10092o;

    /* renamed from: p  reason: collision with root package name */
    private int f10093p;

    /* renamed from: q  reason: collision with root package name */
    private int f10094q;

    /* renamed from: r  reason: collision with root package name */
    private int f10095r;

    /* renamed from: s  reason: collision with root package name */
    private SurfaceTexture f10096s;

    /* renamed from: t  reason: collision with root package name */
    private Surface f10097t;

    /* renamed from: u  reason: collision with root package name */
    private io.flutter.embedding.android.a f10098u;

    /* renamed from: v  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f10099v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final AtomicLong f10100w;

    /* renamed from: x  reason: collision with root package name */
    private final e.a f10101x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f10102y;

    /* renamed from: z  reason: collision with root package name */
    private final e.b f10103z;

    class a implements e.a {
        a() {
        }

        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                j.this.f10100w.decrementAndGet();
            }
        }
    }

    class b implements e.b {
        b() {
        }

        public void onTrimMemory(int i10) {
            if (i10 == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = j.this.f10102y = true;
            }
        }
    }

    class c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f10106m;

        c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f10106m = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f10106m;
            j jVar = j.this;
            onFocusChangeListener.onFocusChange(jVar, h.d(jVar));
        }
    }

    public j(Context context) {
        super(context);
        this.f10100w = new AtomicLong(0);
        this.f10101x = new a();
        this.f10102y = false;
        this.f10103z = new b();
        setWillNotDraw(false);
    }

    public j(Context context, e.c cVar) {
        this(context);
        cVar.c(this.f10101x);
        cVar.b(this.f10103z);
        l(cVar.d());
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f10100w.incrementAndGet();
        }
    }

    private void g() {
        if (this.f10102y) {
            Surface surface = this.f10097t;
            if (surface != null) {
                surface.release();
            }
            this.f10097t = c(this.f10096s);
            this.f10102y = false;
        }
    }

    private boolean n() {
        return Build.VERSION.SDK_INT != 29 || this.f10100w.get() <= 0;
    }

    /* access modifiers changed from: protected */
    public Surface c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int d() {
        return this.f10095r;
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.f10097t;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (!surface.isValid()) {
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture = this.f10096s;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                str = "Invalid texture. The platform view cannot be displayed.";
            } else if (!n()) {
                invalidate();
                return;
            } else {
                g();
                Canvas lockHardwareCanvas = this.f10097t.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    f();
                    return;
                } finally {
                    this.f10097t.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
        x6.b.b("PlatformViewWrapper", str);
    }

    public int e() {
        return this.f10094q;
    }

    public void h() {
        this.f10096s = null;
        Surface surface = this.f10097t;
        if (surface != null) {
            surface.release();
            this.f10097t = null;
        }
    }

    public void i(int i10, int i11) {
        this.f10094q = i10;
        this.f10095r = i11;
        SurfaceTexture surfaceTexture = this.f10096s;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    public void j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f10092o = layoutParams.leftMargin;
        this.f10093p = layoutParams.topMargin;
    }

    public void k(View.OnFocusChangeListener onFocusChangeListener) {
        o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f10099v == null) {
            c cVar = new c(onFocusChangeListener);
            this.f10099v = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    @SuppressLint({"NewApi"})
    public void l(SurfaceTexture surfaceTexture) {
        int i10;
        if (Build.VERSION.SDK_INT < 23) {
            x6.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f10096s = surfaceTexture;
        int i11 = this.f10094q;
        if (i11 > 0 && (i10 = this.f10095r) > 0) {
            surfaceTexture.setDefaultBufferSize(i11, i10);
        }
        Surface surface = this.f10097t;
        if (surface != null) {
            surface.release();
        }
        Surface c10 = c(surfaceTexture);
        this.f10097t = c10;
        Canvas lockHardwareCanvas = c10.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            f();
        } finally {
            this.f10097t.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void m(io.flutter.embedding.android.a aVar) {
        this.f10098u = aVar;
    }

    public void o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f10099v) != null) {
            this.f10099v = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f10098u == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f10092o;
            this.f10090m = i11;
            i10 = this.f10093p;
            this.f10091n = i10;
            f10 = (float) i11;
        } else if (action != 2) {
            f10 = (float) this.f10092o;
            i10 = this.f10093p;
        } else {
            matrix.postTranslate((float) this.f10090m, (float) this.f10091n);
            this.f10090m = this.f10092o;
            this.f10091n = this.f10093p;
            return this.f10098u.g(motionEvent, matrix);
        }
        matrix.postTranslate(f10, (float) i10);
        return this.f10098u.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }
}
