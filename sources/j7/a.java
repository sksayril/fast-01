package j7;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.e;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class a implements io.flutter.view.e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f10814a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f10815b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    private Surface f10816c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f10817d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f10818e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private final Set<WeakReference<e.b>> f10819f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final b f10820g;

    /* renamed from: j7.a$a  reason: collision with other inner class name */
    class C0162a implements b {
        C0162a() {
        }

        public void c() {
            boolean unused = a.this.f10817d = false;
        }

        public void f() {
            boolean unused = a.this.f10817d = true;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f10822a;

        /* renamed from: b  reason: collision with root package name */
        public final d f10823b;

        /* renamed from: c  reason: collision with root package name */
        public final c f10824c;

        public b(Rect rect, d dVar) {
            this.f10822a = rect;
            this.f10823b = dVar;
            this.f10824c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f10822a = rect;
            this.f10823b = dVar;
            this.f10824c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int encodedValue;

        private c(int i10) {
            this.encodedValue = i10;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int encodedValue;

        private d(int i10) {
            this.encodedValue = i10;
        }
    }

    static final class e implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final long f10825m;

        /* renamed from: n  reason: collision with root package name */
        private final FlutterJNI f10826n;

        e(long j10, FlutterJNI flutterJNI) {
            this.f10825m = j10;
            this.f10826n = flutterJNI;
        }

        public void run() {
            if (this.f10826n.isAttached()) {
                x6.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f10825m + ").");
                this.f10826n.unregisterTexture(this.f10825m);
            }
        }
    }

    final class f implements e.c, e.b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f10827a;

        /* renamed from: b  reason: collision with root package name */
        private final SurfaceTextureWrapper f10828b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f10829c;

        /* renamed from: d  reason: collision with root package name */
        private e.b f10830d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public e.a f10831e;

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f10832f;

        /* renamed from: g  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f10833g = new b();

        /* renamed from: j7.a$f$a  reason: collision with other inner class name */
        class C0163a implements Runnable {
            C0163a() {
            }

            public void run() {
                if (f.this.f10831e != null) {
                    f.this.f10831e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!f.this.f10829c && a.this.f10814a.isAttached()) {
                    f fVar = f.this;
                    a.this.m(fVar.f10827a);
                }
            }
        }

        f(long j10, SurfaceTexture surfaceTexture) {
            C0163a aVar = new C0163a();
            this.f10832f = aVar;
            this.f10827a = j10;
            this.f10828b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            d().setOnFrameAvailableListener(this.f10833g, new Handler());
        }

        private void i() {
            a.this.r(this);
        }

        public void a() {
            if (!this.f10829c) {
                x6.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f10827a + ").");
                this.f10828b.release();
                a.this.y(this.f10827a);
                i();
                this.f10829c = true;
            }
        }

        public void b(e.b bVar) {
            this.f10830d = bVar;
        }

        public void c(e.a aVar) {
            this.f10831e = aVar;
        }

        public SurfaceTexture d() {
            return this.f10828b.surfaceTexture();
        }

        public long e() {
            return this.f10827a;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                if (!this.f10829c) {
                    a.this.f10818e.post(new e(this.f10827a, a.this.f10814a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper j() {
            return this.f10828b;
        }

        public void onTrimMemory(int i10) {
            e.b bVar = this.f10830d;
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            }
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public float f10837a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f10838b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f10839c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f10840d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f10841e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f10842f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f10843g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f10844h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f10845i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f10846j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f10847k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f10848l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f10849m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f10850n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f10851o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f10852p = -1;

        /* renamed from: q  reason: collision with root package name */
        public List<b> f10853q = new ArrayList();

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f10838b > 0 && this.f10839c > 0 && this.f10837a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0162a aVar = new C0162a();
        this.f10820g = aVar;
        this.f10814a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    private void i() {
        Iterator<WeakReference<e.b>> it = this.f10819f.iterator();
        while (it.hasNext()) {
            if (((e.b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    public void m(long j10) {
        this.f10814a.markTextureFrameAvailable(j10);
    }

    private void p(long j10, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f10814a.registerTexture(j10, surfaceTextureWrapper);
    }

    /* access modifiers changed from: private */
    public void y(long j10) {
        this.f10814a.unregisterTexture(j10);
    }

    public e.c a() {
        x6.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void g(b bVar) {
        this.f10814a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f10817d) {
            bVar.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(e.b bVar) {
        i();
        this.f10819f.add(new WeakReference(bVar));
    }

    public void j(ByteBuffer byteBuffer, int i10) {
        this.f10814a.dispatchPointerDataPacket(byteBuffer, i10);
    }

    public boolean k() {
        return this.f10817d;
    }

    public boolean l() {
        return this.f10814a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i10) {
        Iterator<WeakReference<e.b>> it = this.f10819f.iterator();
        while (it.hasNext()) {
            e.b bVar = (e.b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public e.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f10815b.getAndIncrement(), surfaceTexture);
        x6.b.f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.e());
        p(fVar.e(), fVar.j());
        h(fVar);
        return fVar;
    }

    public void q(b bVar) {
        this.f10814a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* access modifiers changed from: package-private */
    public void r(e.b bVar) {
        for (WeakReference next : this.f10819f) {
            if (next.get() == bVar) {
                this.f10819f.remove(next);
                return;
            }
        }
    }

    public void s(boolean z9) {
        this.f10814a.setSemanticsEnabled(z9);
    }

    public void t(g gVar) {
        g gVar2 = gVar;
        if (gVar.a()) {
            x6.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f10838b + " x " + gVar2.f10839c + "\nPadding - L: " + gVar2.f10843g + ", T: " + gVar2.f10840d + ", R: " + gVar2.f10841e + ", B: " + gVar2.f10842f + "\nInsets - L: " + gVar2.f10847k + ", T: " + gVar2.f10844h + ", R: " + gVar2.f10845i + ", B: " + gVar2.f10846j + "\nSystem Gesture Insets - L: " + gVar2.f10851o + ", T: " + gVar2.f10848l + ", R: " + gVar2.f10849m + ", B: " + gVar2.f10849m + "\nDisplay Features: " + gVar2.f10853q.size());
            int[] iArr = new int[(gVar2.f10853q.size() * 4)];
            int[] iArr2 = new int[gVar2.f10853q.size()];
            int[] iArr3 = new int[gVar2.f10853q.size()];
            for (int i10 = 0; i10 < gVar2.f10853q.size(); i10++) {
                b bVar = gVar2.f10853q.get(i10);
                int i11 = i10 * 4;
                Rect rect = bVar.f10822a;
                iArr[i11] = rect.left;
                iArr[i11 + 1] = rect.top;
                iArr[i11 + 2] = rect.right;
                iArr[i11 + 3] = rect.bottom;
                iArr2[i10] = bVar.f10823b.encodedValue;
                iArr3[i10] = bVar.f10824c.encodedValue;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f10814a;
            flutterJNI.setViewportMetrics(gVar2.f10837a, gVar2.f10838b, gVar2.f10839c, gVar2.f10840d, gVar2.f10841e, gVar2.f10842f, gVar2.f10843g, gVar2.f10844h, gVar2.f10845i, gVar2.f10846j, gVar2.f10847k, gVar2.f10848l, gVar2.f10849m, gVar2.f10850n, gVar2.f10851o, gVar2.f10852p, iArr, iArr2, iArr4);
        }
    }

    public void u(Surface surface, boolean z9) {
        if (this.f10816c != null && !z9) {
            v();
        }
        this.f10816c = surface;
        this.f10814a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f10814a.onSurfaceDestroyed();
        this.f10816c = null;
        if (this.f10817d) {
            this.f10820g.c();
        }
        this.f10817d = false;
    }

    public void w(int i10, int i11) {
        this.f10814a.onSurfaceChanged(i10, i11);
    }

    public void x(Surface surface) {
        this.f10816c = surface;
        this.f10814a.onSurfaceWindowChanged(surface);
    }
}
