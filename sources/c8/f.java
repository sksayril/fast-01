package c8;

import c8.a;
import java.util.ArrayList;
import java.util.Map;
import k7.a;
import k7.c;
import k7.i;

public final /* synthetic */ class f {
    public static i<Object> a() {
        return a.c.f3868d;
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.c((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.d((String) arrayList2.get(0), (a.d) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            bVar.b();
            arrayList.add(0, (Object) null);
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void f(c cVar, a.b bVar) {
        k7.a aVar = new k7.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.canLaunchUrl", a());
        if (bVar != null) {
            aVar.e(new b(bVar));
        } else {
            aVar.e((a.d) null);
        }
        k7.a aVar2 = new k7.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.launchUrl", a());
        if (bVar != null) {
            aVar2.e(new c(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        k7.a aVar3 = new k7.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.openUrlInWebView", a());
        if (bVar != null) {
            aVar3.e(new d(bVar));
        } else {
            aVar3.e((a.d) null);
        }
        k7.a aVar4 = new k7.a(cVar, "dev.flutter.pigeon.UrlLauncherApi.closeWebView", a());
        if (bVar != null) {
            aVar4.e(new e(bVar));
        } else {
            aVar4.e((a.d) null);
        }
    }
}
