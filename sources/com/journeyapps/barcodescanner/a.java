package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import m6.n;
import m6.o;
import m6.p;
import m6.r;
import n6.g;
import n6.i;
import n6.j;
import n6.l;
import n6.m;
import n6.q;
import s5.k;

public class a extends ViewGroup {
    /* access modifiers changed from: private */
    public static final String M = a.class.getSimpleName();
    private Rect A;
    /* access modifiers changed from: private */
    public p B;
    private Rect C = null;
    private Rect D = null;
    private p E = null;
    private double F = 0.1d;
    private q G = null;
    private boolean H = false;
    private final SurfaceHolder.Callback I = new b();
    private final Handler.Callback J = new c();
    private n K = new d();
    /* access modifiers changed from: private */
    public final f L = new e();

    /* renamed from: m  reason: collision with root package name */
    private g f7580m;

    /* renamed from: n  reason: collision with root package name */
    private WindowManager f7581n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Handler f7582o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7583p = false;

    /* renamed from: q  reason: collision with root package name */
    private SurfaceView f7584q;

    /* renamed from: r  reason: collision with root package name */
    private TextureView f7585r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7586s = false;

    /* renamed from: t  reason: collision with root package name */
    private o f7587t;

    /* renamed from: u  reason: collision with root package name */
    private int f7588u = -1;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public List<f> f7589v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private m f7590w;

    /* renamed from: x  reason: collision with root package name */
    private i f7591x = new i();

    /* renamed from: y  reason: collision with root package name */
    private p f7592y;

    /* renamed from: z  reason: collision with root package name */
    private p f7593z;

    /* renamed from: com.journeyapps.barcodescanner.a$a  reason: collision with other inner class name */
    class C0102a implements TextureView.SurfaceTextureListener {
        C0102a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            p unused = a.this.B = new p(i10, i11);
            a.this.C();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class b implements SurfaceHolder.Callback {
        b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                Log.e(a.M, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            p unused = a.this.B = new p(i11, i12);
            a.this.C();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            p unused = a.this.B = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.zxing_prewiew_size_ready) {
                a.this.w((p) message.obj);
                return true;
            } else if (i10 == k.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                if (!a.this.r()) {
                    return false;
                }
                a.this.u();
                a.this.L.b(exc);
                return false;
            } else if (i10 != k.zxing_camera_closed) {
                return false;
            } else {
                a.this.L.e();
                return false;
            }
        }
    }

    class d implements n {
        d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            a.this.z();
        }

        public void a(int i10) {
            a.this.f7582o.postDelayed(new b(this), 250);
        }
    }

    class e implements f {
        e() {
        }

        public void a() {
            for (f a10 : a.this.f7589v) {
                a10.a();
            }
        }

        public void b(Exception exc) {
            for (f b10 : a.this.f7589v) {
                b10.b(exc);
            }
        }

        public void c() {
            for (f c10 : a.this.f7589v) {
                c10.c();
            }
        }

        public void d() {
            for (f d10 : a.this.f7589v) {
                d10.d();
            }
        }

        public void e() {
            for (f e10 : a.this.f7589v) {
                e10.e();
            }
        }
    }

    public interface f {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    public a(Context context) {
        super(context);
        p(context, (AttributeSet) null, 0, 0);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(context, attributeSet, 0, 0);
    }

    private void A() {
        View view;
        if (this.f7583p) {
            TextureView textureView = new TextureView(getContext());
            this.f7585r = textureView;
            textureView.setSurfaceTextureListener(D());
            view = this.f7585r;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f7584q = surfaceView;
            surfaceView.getHolder().addCallback(this.I);
            view = this.f7584q;
        }
        addView(view);
    }

    private void B(j jVar) {
        if (!this.f7586s && this.f7580m != null) {
            Log.i(M, "Starting preview");
            this.f7580m.z(jVar);
            this.f7580m.B();
            this.f7586s = true;
            x();
            this.L.c();
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        Rect rect;
        j jVar;
        p pVar = this.B;
        if (pVar != null && this.f7593z != null && (rect = this.A) != null) {
            if (this.f7584q == null || !pVar.equals(new p(rect.width(), this.A.height()))) {
                TextureView textureView = this.f7585r;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f7593z != null) {
                        this.f7585r.setTransform(l(new p(this.f7585r.getWidth(), this.f7585r.getHeight()), this.f7593z));
                    }
                    jVar = new j(this.f7585r.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                jVar = new j(this.f7584q.getHolder());
            }
            B(jVar);
        }
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener D() {
        return new C0102a();
    }

    private int getDisplayRotation() {
        return this.f7581n.getDefaultDisplay().getRotation();
    }

    private void j() {
        p pVar;
        m mVar;
        p pVar2 = this.f7592y;
        if (pVar2 == null || (pVar = this.f7593z) == null || (mVar = this.f7590w) == null) {
            this.D = null;
            this.C = null;
            this.A = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = pVar.f11243m;
        int i11 = pVar.f11244n;
        int i12 = pVar2.f11243m;
        int i13 = pVar2.f11244n;
        Rect d10 = mVar.d(pVar);
        if (d10.width() > 0 && d10.height() > 0) {
            this.A = d10;
            this.C = k(new Rect(0, 0, i12, i13), this.A);
            Rect rect = new Rect(this.C);
            Rect rect2 = this.A;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = new Rect((rect.left * i10) / this.A.width(), (rect.top * i11) / this.A.height(), (rect.right * i10) / this.A.width(), (rect.bottom * i11) / this.A.height());
            this.D = rect3;
            if (rect3.width() <= 0 || this.D.height() <= 0) {
                this.D = null;
                this.C = null;
                Log.w(M, "Preview frame is too small");
                return;
            }
            this.L.a();
        }
    }

    private void m(p pVar) {
        this.f7592y = pVar;
        g gVar = this.f7580m;
        if (gVar != null && gVar.n() == null) {
            m mVar = new m(getDisplayRotation(), pVar);
            this.f7590w = mVar;
            mVar.e(getPreviewScalingStrategy());
            this.f7580m.x(this.f7590w);
            this.f7580m.m();
            boolean z9 = this.H;
            if (z9) {
                this.f7580m.A(z9);
            }
        }
    }

    private void o() {
        if (this.f7580m != null) {
            Log.w(M, "initCamera called twice");
            return;
        }
        g n10 = n();
        this.f7580m = n10;
        n10.y(this.f7582o);
        this.f7580m.u();
        this.f7588u = getDisplayRotation();
    }

    private void p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f7581n = (WindowManager) context.getSystemService("window");
        this.f7582o = new Handler(this.J);
        this.f7587t = new o();
    }

    /* access modifiers changed from: private */
    public void w(p pVar) {
        this.f7593z = pVar;
        if (this.f7592y != null) {
            j();
            requestLayout();
            C();
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        if (r() && getDisplayRotation() != this.f7588u) {
            u();
            y();
        }
    }

    public g getCameraInstance() {
        return this.f7580m;
    }

    public i getCameraSettings() {
        return this.f7591x;
    }

    public Rect getFramingRect() {
        return this.C;
    }

    public p getFramingRectSize() {
        return this.E;
    }

    public double getMarginFraction() {
        return this.F;
    }

    public Rect getPreviewFramingRect() {
        return this.D;
    }

    public q getPreviewScalingStrategy() {
        q qVar = this.G;
        return qVar != null ? qVar : this.f7585r != null ? new l() : new n6.n();
    }

    public p getPreviewSize() {
        return this.f7593z;
    }

    public void i(f fVar) {
        this.f7589v.add(fVar);
    }

    /* access modifiers changed from: protected */
    public Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.E != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.E.f11243m) / 2), Math.max(0, (rect3.height() - this.E.f11244n) / 2));
            return rect3;
        }
        int min = (int) Math.min(((double) rect3.width()) * this.F, ((double) rect3.height()) * this.F);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* access modifiers changed from: protected */
    public Matrix l(p pVar, p pVar2) {
        float f10;
        float f11 = ((float) pVar.f11243m) / ((float) pVar.f11244n);
        float f12 = ((float) pVar2.f11243m) / ((float) pVar2.f11244n);
        float f13 = 1.0f;
        if (f11 < f12) {
            f13 = f12 / f11;
            f10 = 1.0f;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = pVar.f11243m;
        int i11 = pVar.f11244n;
        matrix.postTranslate((((float) i10) - (((float) i10) * f13)) / 2.0f, (((float) i11) - (((float) i11) * f10)) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: protected */
    public g n() {
        g gVar = new g(getContext());
        gVar.w(this.f7591x);
        return gVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        m(new p(i12 - i10, i13 - i11));
        SurfaceView surfaceView = this.f7584q;
        if (surfaceView != null) {
            Rect rect = this.A;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f7585r;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.H);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void q(AttributeSet attributeSet) {
        q oVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s5.o.f12212i);
        int dimension = (int) obtainStyledAttributes.getDimension(s5.o.f12214k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(s5.o.f12213j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.E = new p(dimension, dimension2);
        }
        this.f7583p = obtainStyledAttributes.getBoolean(s5.o.f12216m, true);
        int integer = obtainStyledAttributes.getInteger(s5.o.f12215l, -1);
        if (integer == 1) {
            oVar = new l();
        } else if (integer == 2) {
            oVar = new n6.n();
        } else {
            if (integer == 3) {
                oVar = new n6.o();
            }
            obtainStyledAttributes.recycle();
        }
        this.G = oVar;
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return this.f7580m != null;
    }

    public boolean s() {
        g gVar = this.f7580m;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f7591x = iVar;
    }

    public void setFramingRectSize(p pVar) {
        this.E = pVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 < 0.5d) {
            this.F = d10;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(q qVar) {
        this.G = qVar;
    }

    public void setTorch(boolean z9) {
        this.H = z9;
        g gVar = this.f7580m;
        if (gVar != null) {
            gVar.A(z9);
        }
    }

    public void setUseTextureView(boolean z9) {
        this.f7583p = z9;
    }

    public boolean t() {
        return this.f7586s;
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        r.a();
        Log.d(M, "pause()");
        this.f7588u = -1;
        g gVar = this.f7580m;
        if (gVar != null) {
            gVar.l();
            this.f7580m = null;
            this.f7586s = false;
        } else {
            this.f7582o.sendEmptyMessage(k.zxing_camera_closed);
        }
        if (this.B == null && (surfaceView = this.f7584q) != null) {
            surfaceView.getHolder().removeCallback(this.I);
        }
        if (this.B == null && (textureView = this.f7585r) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f7592y = null;
        this.f7593z = null;
        this.D = null;
        this.f7587t.f();
        this.L.d();
    }

    public void v() {
        g cameraInstance = getCameraInstance();
        u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    public void y() {
        r.a();
        Log.d(M, "resume()");
        o();
        if (this.B != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f7584q;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.I);
            } else {
                TextureView textureView = this.f7585r;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.f7585r.getSurfaceTexture(), this.f7585r.getWidth(), this.f7585r.getHeight());
                    } else {
                        this.f7585r.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.f7587t.e(getContext(), this.K);
    }
}
