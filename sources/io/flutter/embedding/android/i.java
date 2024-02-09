package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import j7.c;
import x6.b;

public class i extends TextureView implements c {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f9720m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f9721n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9722o;

    /* renamed from: p  reason: collision with root package name */
    private j7.a f9723p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Surface f9724q;

    /* renamed from: r  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f9725r;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = i.this.f9720m = true;
            if (i.this.f9721n) {
                i.this.l();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = i.this.f9720m = false;
            if (i.this.f9721n) {
                i.this.m();
            }
            if (i.this.f9724q == null) {
                return true;
            }
            i.this.f9724q.release();
            Surface unused2 = i.this.f9724q = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f9721n) {
                i.this.k(i10, i11);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, (AttributeSet) null);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9720m = false;
        this.f9721n = false;
        this.f9722o = false;
        this.f9725r = new a();
        n();
    }

    /* access modifiers changed from: private */
    public void k(int i10, int i11) {
        if (this.f9723p != null) {
            b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
            this.f9723p.w(i10, i11);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    public void l() {
        if (this.f9723p == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f9724q;
        if (surface != null) {
            surface.release();
            this.f9724q = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f9724q = surface2;
        this.f9723p.u(surface2, this.f9722o);
        this.f9722o = false;
    }

    /* access modifiers changed from: private */
    public void m() {
        j7.a aVar = this.f9723p;
        if (aVar != null) {
            aVar.v();
            Surface surface = this.f9724q;
            if (surface != null) {
                surface.release();
                this.f9724q = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void n() {
        setSurfaceTextureListener(this.f9725r);
    }

    public void b() {
        if (this.f9723p != null) {
            this.f9723p = null;
            this.f9722o = true;
            this.f9721n = false;
            return;
        }
        b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public void c(j7.a aVar) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f9723p != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f9723p.v();
        }
        this.f9723p = aVar;
        this.f9721n = true;
        if (this.f9720m) {
            b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    public void d() {
        if (this.f9723p != null) {
            if (getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                m();
            }
            this.f9723p = null;
            this.f9721n = false;
            return;
        }
        b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public j7.a getAttachedRenderer() {
        return this.f9723p;
    }

    public void setRenderSurface(Surface surface) {
        this.f9724q = surface;
    }
}
