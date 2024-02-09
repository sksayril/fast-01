package io.flutter.plugins.googlemaps;

import android.content.Context;
import k7.c;
import k7.j;
import k7.k;
import x2.e;
import x2.g;

final class k implements g, k.c {

    /* renamed from: p  reason: collision with root package name */
    private static k.d f10489p;

    /* renamed from: m  reason: collision with root package name */
    private final k7.k f10490m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f10491n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10492o = false;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10493a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                x2.e$a[] r0 = x2.e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10493a = r0
                x2.e$a r1 = x2.e.a.LATEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10493a     // Catch:{ NoSuchFieldError -> 0x001d }
                x2.e$a r1 = x2.e.a.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.k.a.<clinit>():void");
        }
    }

    k(Context context, c cVar) {
        this.f10491n = context;
        k7.k kVar = new k7.k(cVar, "plugins.flutter.dev/google_maps_android_initializer");
        this.f10490m = kVar;
        kVar.e(this);
    }

    private void b(String str, k.d dVar) {
        e.a aVar;
        if (this.f10492o || f10489p != null) {
            dVar.b("Renderer already initialized", "Renderer initialization called multiple times", (Object) null);
            return;
        }
        f10489p = dVar;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1109880953:
                if (str.equals("latest")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1106578487:
                if (str.equals("legacy")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                aVar = e.a.LATEST;
                break;
            case 1:
                aVar = e.a.LEGACY;
                break;
            case 2:
                c((e.a) null);
                return;
            default:
                f10489p.b("Invalid renderer type", "Renderer initialization called with invalid renderer type", (Object) null);
                f10489p = null;
                return;
        }
        c(aVar);
    }

    public void a(e.a aVar) {
        k.d dVar;
        String str;
        this.f10492o = true;
        if (f10489p != null) {
            int i10 = a.f10493a[aVar.ordinal()];
            if (i10 == 1) {
                dVar = f10489p;
                str = "latest";
            } else if (i10 != 2) {
                f10489p.b("Unknown renderer type", "Initialized with unknown renderer type", (Object) null);
                f10489p = null;
            } else {
                dVar = f10489p;
                str = "legacy";
            }
            dVar.a(str);
            f10489p = null;
        }
    }

    public void c(e.a aVar) {
        e.b(this.f10491n, aVar, this);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        if (!str.equals("initializer#preferRenderer")) {
            dVar.c();
        } else {
            b((String) jVar.a("value"), dVar);
        }
    }
}
