package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import j7.c;

public class h extends SurfaceView implements c {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f9711m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f9712n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9713o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f9714p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public j7.a f9715q;

    /* renamed from: r  reason: collision with root package name */
    private final SurfaceHolder.Callback f9716r;

    /* renamed from: s  reason: collision with root package name */
    private final j7.b f9717s;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            x6.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (h.this.f9714p) {
                h.this.j(i11, i12);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            x6.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = h.this.f9712n = true;
            if (h.this.f9714p) {
                h.this.k();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            x6.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = h.this.f9712n = false;
            if (h.this.f9714p) {
                h.this.l();
            }
        }
    }

    class b implements j7.b {
        b() {
        }

        public void c() {
        }

        public void f() {
            x6.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            h.this.setAlpha(1.0f);
            if (h.this.f9715q != null) {
                h.this.f9715q.q(this);
            }
        }
    }

    private h(Context context, AttributeSet attributeSet, boolean z9) {
        super(context, attributeSet);
        this.f9712n = false;
        this.f9713o = false;
        this.f9714p = false;
        this.f9716r = new a();
        this.f9717s = new b();
        this.f9711m = z9;
        m();
    }

    public h(Context context, boolean z9) {
        this(context, (AttributeSet) null, z9);
    }

    /* access modifiers changed from: private */
    public void j(int i10, int i11) {
        if (this.f9715q != null) {
            x6.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
            this.f9715q.w(i10, i11);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f9715q == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f9715q.u(getHolder().getSurface(), this.f9713o);
    }

    /* access modifiers changed from: private */
    public void l() {
        j7.a aVar = this.f9715q;
        if (aVar != null) {
            aVar.v();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        if (this.f9711m) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f9716r);
        setAlpha(0.0f);
    }

    public void b() {
        if (this.f9715q != null) {
            this.f9715q = null;
            this.f9713o = true;
            this.f9714p = false;
            return;
        }
        x6.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public void c(j7.a aVar) {
        x6.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f9715q != null) {
            x6.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f9715q.v();
            this.f9715q.q(this.f9717s);
        }
        this.f9715q = aVar;
        this.f9714p = true;
        aVar.g(this.f9717s);
        if (this.f9712n) {
            x6.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f9713o = false;
    }

    public void d() {
        if (this.f9715q != null) {
            if (getWindowToken() != null) {
                x6.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                l();
            }
            setAlpha(0.0f);
            this.f9715q.q(this.f9717s);
            this.f9715q = null;
            this.f9714p = false;
            return;
        }
        x6.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public j7.a getAttachedRenderer() {
        return this.f9715q;
    }
}
