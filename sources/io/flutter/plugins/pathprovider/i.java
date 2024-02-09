package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.a;
import java.util.ArrayList;
import k7.a;
import k7.c;
import k7.r;

public final /* synthetic */ class i {
    public static k7.i<Object> a() {
        return new r();
    }

    public static /* synthetic */ void b(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.a());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void c(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.e());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void d(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.c());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void e(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.b());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void f(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.g());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void g(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, bVar.d());
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static /* synthetic */ void h(a.b bVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.f(arrayList2.get(0) == null ? null : a.c.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = a.a(th);
        }
        eVar.a(arrayList);
    }

    public static void i(c cVar, a.b bVar) {
        k7.a aVar = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", a(), cVar.d());
        if (bVar != null) {
            aVar.e(new b(bVar));
        } else {
            aVar.e((a.d) null);
        }
        k7.a aVar2 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", a(), cVar.d());
        if (bVar != null) {
            aVar2.e(new c(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        k7.a aVar3 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", a(), cVar.d());
        if (bVar != null) {
            aVar3.e(new d(bVar));
        } else {
            aVar3.e((a.d) null);
        }
        k7.a aVar4 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", a(), cVar.d());
        if (bVar != null) {
            aVar4.e(new e(bVar));
        } else {
            aVar4.e((a.d) null);
        }
        k7.a aVar5 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", a(), cVar.d());
        if (bVar != null) {
            aVar5.e(new f(bVar));
        } else {
            aVar5.e((a.d) null);
        }
        k7.a aVar6 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", a(), cVar.d());
        if (bVar != null) {
            aVar6.e(new g(bVar));
        } else {
            aVar6.e((a.d) null);
        }
        k7.a aVar7 = new k7.a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", a(), cVar.d());
        if (bVar != null) {
            aVar7.e(new h(bVar));
        } else {
            aVar7.e((a.d) null);
        }
    }
}
