package d1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import f2.i;
import java.security.SecureRandom;
import java.util.Objects;
import w2.e;
import w2.f;
import w2.g;
import w2.h;

class j implements p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7684a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f7685b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final w2.b f7686c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final w f7687d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7688e = s();

    /* renamed from: f  reason: collision with root package name */
    private final s f7689f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public c1.a f7690g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public x f7691h;

    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7692a;

        a(Context context) {
            this.f7692a = context;
        }

        public synchronized void a(LocationAvailability locationAvailability) {
            if (!locationAvailability.d() && !j.this.r(this.f7692a) && j.this.f7690g != null) {
                j.this.f7690g.a(c1.b.locationServicesDisabled);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void b(com.google.android.gms.location.LocationResult r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                d1.j r0 = d1.j.this     // Catch:{ all -> 0x004c }
                d1.x r0 = r0.f7691h     // Catch:{ all -> 0x004c }
                if (r0 != 0) goto L_0x0034
                java.lang.String r2 = "FlutterGeolocator"
                java.lang.String r0 = "LocationCallback was called with empty locationResult or no positionChangedCallback was registered."
                android.util.Log.e(r2, r0)     // Catch:{ all -> 0x004c }
                d1.j r2 = d1.j.this     // Catch:{ all -> 0x004c }
                w2.b r2 = r2.f7686c     // Catch:{ all -> 0x004c }
                d1.j r0 = d1.j.this     // Catch:{ all -> 0x004c }
                w2.e r0 = r0.f7685b     // Catch:{ all -> 0x004c }
                r2.b(r0)     // Catch:{ all -> 0x004c }
                d1.j r2 = d1.j.this     // Catch:{ all -> 0x004c }
                c1.a r2 = r2.f7690g     // Catch:{ all -> 0x004c }
                if (r2 == 0) goto L_0x0032
                d1.j r2 = d1.j.this     // Catch:{ all -> 0x004c }
                c1.a r2 = r2.f7690g     // Catch:{ all -> 0x004c }
                c1.b r0 = c1.b.errorWhileAcquiringPosition     // Catch:{ all -> 0x004c }
                r2.a(r0)     // Catch:{ all -> 0x004c }
            L_0x0032:
                monitor-exit(r1)
                return
            L_0x0034:
                android.location.Location r2 = r2.d()     // Catch:{ all -> 0x004c }
                d1.j r0 = d1.j.this     // Catch:{ all -> 0x004c }
                d1.w r0 = r0.f7687d     // Catch:{ all -> 0x004c }
                r0.b(r2)     // Catch:{ all -> 0x004c }
                d1.j r0 = d1.j.this     // Catch:{ all -> 0x004c }
                d1.x r0 = r0.f7691h     // Catch:{ all -> 0x004c }
                r0.a(r2)     // Catch:{ all -> 0x004c }
                monitor-exit(r1)
                return
            L_0x004c:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.j.a.b(com.google.android.gms.location.LocationResult):void");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7694a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                d1.l[] r0 = d1.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7694a = r0
                d1.l r1 = d1.l.lowest     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7694a     // Catch:{ NoSuchFieldError -> 0x001d }
                d1.l r1 = d1.l.low     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7694a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d1.l r1 = d1.l.medium     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.j.b.<clinit>():void");
        }
    }

    public j(Context context, s sVar) {
        this.f7684a = context;
        this.f7686c = f.b(context);
        this.f7689f = sVar;
        this.f7687d = new w(context, sVar);
        this.f7685b = new a(context);
    }

    private static LocationRequest o(s sVar) {
        if (Build.VERSION.SDK_INT < 33) {
            return p(sVar);
        }
        LocationRequest.a aVar = new LocationRequest.a(0);
        if (sVar != null) {
            aVar.g(y(sVar.a()));
            aVar.c(sVar.c());
            aVar.f(sVar.c());
            aVar.e((float) sVar.b());
        }
        return aVar.a();
    }

    private static LocationRequest p(s sVar) {
        LocationRequest d10 = LocationRequest.d();
        if (sVar != null) {
            d10.G(y(sVar.a()));
            d10.F(sVar.c());
            d10.E(sVar.c() / 2);
            d10.H((float) sVar.b());
        }
        return d10;
    }

    private static g q(LocationRequest locationRequest) {
        g.a aVar = new g.a();
        aVar.a(locationRequest);
        return aVar.b();
    }

    private synchronized int s() {
        return new SecureRandom().nextInt(65536);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(c1.a aVar, Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        if (aVar != null) {
            aVar.a(c1.b.errorWhileAcquiringPosition);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void u(t tVar, d3.j jVar) {
        if (!jVar.q()) {
            tVar.a(c1.b.locationServicesDisabled);
        }
        h hVar = (h) jVar.n();
        if (hVar != null) {
            w2.j b10 = hVar.b();
            boolean z9 = true;
            boolean z10 = b10 != null && b10.i();
            boolean z11 = b10 != null && b10.l();
            if (!z10 && !z11) {
                z9 = false;
            }
            tVar.b(z9);
            return;
        }
        tVar.a(c1.b.locationServicesDisabled);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(h hVar) {
        x(this.f7689f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(Activity activity, c1.a aVar, Exception exc) {
        if (exc instanceof i) {
            if (activity == null) {
                aVar.a(c1.b.locationServicesDisabled);
                return;
            }
            i iVar = (i) exc;
            if (iVar.b() == 6) {
                try {
                    iVar.c(activity, this.f7688e);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        } else if (((f2.b) exc).b() == 8502) {
            x(this.f7689f);
            return;
        }
        aVar.a(c1.b.locationServicesDisabled);
    }

    @SuppressLint({"MissingPermission"})
    private void x(s sVar) {
        LocationRequest o10 = o(sVar);
        this.f7687d.d();
        this.f7686c.a(o10, this.f7685b, Looper.getMainLooper());
    }

    private static int y(l lVar) {
        int i10 = b.f7694a[lVar.ordinal()];
        if (i10 == 1) {
            return 105;
        }
        if (i10 != 2) {
            return i10 != 3 ? 100 : 102;
        }
        return 104;
    }

    public boolean a(int i10, int i11) {
        if (i10 == this.f7688e) {
            if (i11 == -1) {
                s sVar = this.f7689f;
                if (sVar == null || this.f7691h == null || this.f7690g == null) {
                    return false;
                }
                x(sVar);
                return true;
            }
            c1.a aVar = this.f7690g;
            if (aVar != null) {
                aVar.a(c1.b.locationServicesDisabled);
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public void b(Activity activity, x xVar, c1.a aVar) {
        this.f7691h = xVar;
        this.f7690g = aVar;
        f.d(this.f7684a).d(q(o(this.f7689f))).h(new h(this)).e(new g(this, activity, aVar));
    }

    @SuppressLint({"MissingPermission"})
    public void c(x xVar, c1.a aVar) {
        d3.j<Location> c10 = this.f7686c.c();
        Objects.requireNonNull(xVar);
        c10.h(new i(xVar)).e(new f(aVar));
    }

    public void d(t tVar) {
        f.d(this.f7684a).d(new g.a().b()).b(new e(tVar));
    }

    public void e() {
        this.f7687d.e();
        this.f7686c.b(this.f7685b);
    }

    public /* synthetic */ boolean r(Context context) {
        return o.a(this, context);
    }
}
