package x0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c7.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k7.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class a implements c7.a, k.c {

    /* renamed from: p  reason: collision with root package name */
    public static final C0224a f13046p = new C0224a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private k f13047m;

    /* renamed from: n  reason: collision with root package name */
    private Context f13048n;

    /* renamed from: o  reason: collision with root package name */
    private final List<b> f13049o = n.e(new b(c.google, "Google Maps", "com.google.android.apps.maps"), new b(c.googleGo, "Google Maps Go", "com.google.android.apps.mapslite"), new b(c.amap, "Amap", "com.autonavi.minimap"), new b(c.baidu, "Baidu Maps", "com.baidu.BaiduMap"), new b(c.waze, "Waze", "com.waze"), new b(c.yandexNavi, "Yandex Navigator", "ru.yandex.yandexnavi"), new b(c.yandexMaps, "Yandex Maps", "ru.yandex.yandexmaps"), new b(c.citymapper, "Citymapper", "com.citymapper.app.release"), new b(c.mapswithme, "MAPS.ME", "com.mapswithme.maps.pro"), new b(c.osmand, "OsmAnd", "net.osmand"), new b(c.osmandplus, "OsmAnd+", "net.osmand.plus"), new b(c.doubleGis, "2GIS", "ru.dublgis.dgismobile"), new b(c.tencent, "Tencent (QQ Maps)", "com.tencent.map"), new b(c.here, "HERE WeGo", "com.here.app.maps"), new b(c.petal, "Petal Maps", "com.huawei.maps.app"), new b(c.tomtomgo, "TomTom Go", "com.tomtom.gplay.navapp"));

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public static final class C0224a {
        private C0224a() {
        }

        public /* synthetic */ C0224a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getPackageManager();
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0023 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<x0.b> a() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f13048n
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.getInstalledApplications(r1)
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0018
            java.util.List r0 = h8.n.c()
            return r0
        L_0x0018:
            java.util.List<x0.b> r2 = r9.f13049o
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0023:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            r5 = r4
            x0.b r5 = (x0.b) r5
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x0038
        L_0x0036:
            r5 = 0
            goto L_0x0055
        L_0x0038:
            java.util.Iterator r6 = r0.iterator()
        L_0x003c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0036
            java.lang.Object r7 = r6.next()
            android.content.pm.ApplicationInfo r7 = (android.content.pm.ApplicationInfo) r7
            java.lang.String r7 = r7.packageName
            java.lang.String r8 = r5.b()
            boolean r7 = kotlin.jvm.internal.l.a(r7, r8)
            if (r7 == 0) goto L_0x003c
            r5 = 1
        L_0x0055:
            if (r5 == 0) goto L_0x0023
            r3.add(r4)
            goto L_0x0023
        L_0x005b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.a():java.util.List");
    }

    private final boolean b(String str) {
        List<b> a10 = a();
        if ((a10 instanceof Collection) && a10.isEmpty()) {
            return false;
        }
        for (b a11 : a10) {
            if (l.a(a11.a().name(), str)) {
                return true;
            }
        }
        return false;
    }

    private final void c(c cVar, String str, k.d dVar) {
        T t9;
        boolean z9;
        Context context = this.f13048n;
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            Iterator<T> it = this.f13049o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t9 = null;
                    break;
                }
                t9 = it.next();
                if (((b) t9).a() == cVar) {
                    z9 = true;
                    continue;
                } else {
                    z9 = false;
                    continue;
                }
                if (z9) {
                    break;
                }
            }
            b bVar = (b) t9;
            if (bVar != null) {
                intent.setPackage(bVar.b());
            }
            context.startActivity(intent);
        }
        dVar.a((Object) null);
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        this.f13047m = new k(bVar.b(), "map_launcher");
        this.f13048n = bVar.a();
        k kVar = this.f13047m;
        if (kVar != null) {
            kVar.e(this);
        }
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        k kVar = this.f13047m;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
        this.f13047m = null;
        this.f13048n = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r0.equals("showDirections") == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r0.equals("showMarker") == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        r6 = r6.f10997b;
        kotlin.jvm.internal.l.c(r6, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        r6 = (java.util.Map) r6;
        r0 = r6.get("mapType");
        kotlin.jvm.internal.l.c(r0, "null cannot be cast to non-null type kotlin.String");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (b((java.lang.String) r0) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        r7.b("MAP_NOT_AVAILABLE", "Map is not installed on a device", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        r0 = r6.get("mapType");
        kotlin.jvm.internal.l.c(r0, "null cannot be cast to non-null type kotlin.String");
        r0 = x0.c.valueOf((java.lang.String) r0);
        r6 = r6.get("url");
        kotlin.jvm.internal.l.c(r6, "null cannot be cast to non-null type kotlin.String");
        c(r0, (java.lang.String) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r6, k7.k.d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.l.e(r6, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.l.e(r7, r0)
            java.lang.String r0 = r6.f10996a
            if (r0 == 0) goto L_0x00c5
            int r1 = r0.hashCode()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<*, *>"
            java.lang.String r3 = "mapType"
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            switch(r1) {
                case -1346420969: goto L_0x00a0;
                case 593783191: goto L_0x005c;
                case 1818544049: goto L_0x0053;
                case 2005082491: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00c5
        L_0x001d:
            java.lang.String r6 = "getInstalledMaps"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0027
            goto L_0x00c5
        L_0x0027:
            java.util.List r6 = r5.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = h8.o.i(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x003a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r6.next()
            x0.b r1 = (x0.b) r1
            java.util.Map r1 = r1.c()
            r0.add(r1)
            goto L_0x003a
        L_0x004e:
            r7.a(r0)
            goto L_0x00c8
        L_0x0053:
            java.lang.String r1 = "showDirections"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x00c5
        L_0x005c:
            java.lang.String r1 = "showMarker"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x00c5
        L_0x0065:
            java.lang.Object r6 = r6.f10997b
            kotlin.jvm.internal.l.c(r6, r2)
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r6.get(r3)
            kotlin.jvm.internal.l.c(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.b(r0)
            if (r0 != 0) goto L_0x0084
            r6 = 0
            java.lang.String r0 = "MAP_NOT_AVAILABLE"
            java.lang.String r1 = "Map is not installed on a device"
            r7.b(r0, r1, r6)
            return
        L_0x0084:
            java.lang.Object r0 = r6.get(r3)
            kotlin.jvm.internal.l.c(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            x0.c r0 = x0.c.valueOf(r0)
            java.lang.String r1 = "url"
            java.lang.Object r6 = r6.get(r1)
            kotlin.jvm.internal.l.c(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            r5.c(r0, r6, r7)
            goto L_0x00c8
        L_0x00a0:
            java.lang.String r1 = "isMapAvailable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a9
            goto L_0x00c5
        L_0x00a9:
            java.lang.Object r6 = r6.f10997b
            kotlin.jvm.internal.l.c(r6, r2)
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r6 = r6.get(r3)
            kotlin.jvm.internal.l.c(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r5.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.a(r6)
            goto L_0x00c8
        L_0x00c5:
            r7.c()
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.a.onMethodCall(k7.j, k7.k$d):void");
    }
}
