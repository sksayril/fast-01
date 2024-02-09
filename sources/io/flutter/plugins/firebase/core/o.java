package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import k7.a;
import k7.i;
import k7.r;

public final /* synthetic */ class o {

    class a implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10336b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10335a = arrayList;
            this.f10336b = eVar;
        }

        public void b(Throwable th) {
            this.f10336b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f10335a.add(0, (Object) null);
            this.f10336b.a(this.f10335a);
        }
    }

    class b implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10338b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10337a = arrayList;
            this.f10338b = eVar;
        }

        public void b(Throwable th) {
            this.f10338b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f10337a.add(0, (Object) null);
            this.f10338b.a(this.f10337a);
        }
    }

    class c implements p.g<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10340b;

        c(ArrayList arrayList, a.e eVar) {
            this.f10339a = arrayList;
            this.f10340b = eVar;
        }

        public void b(Throwable th) {
            this.f10340b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f10339a.add(0, (Object) null);
            this.f10340b.a(this.f10339a);
        }
    }

    public static i<Object> a() {
        return new r();
    }

    public static /* synthetic */ void b(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.d((String) arrayList.get(0), (Boolean) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(p.a aVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        aVar.e((String) arrayList.get(0), (Boolean) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    public static void e(k7.c cVar, p.a aVar) {
        k7.a aVar2 = new k7.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a());
        if (aVar != null) {
            aVar2.e(new l(aVar));
        } else {
            aVar2.e((a.d) null);
        }
        k7.a aVar3 = new k7.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a());
        if (aVar != null) {
            aVar3.e(new m(aVar));
        } else {
            aVar3.e((a.d) null);
        }
        k7.a aVar4 = new k7.a(cVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a());
        if (aVar != null) {
            aVar4.e(new n(aVar));
        } else {
            aVar4.e((a.d) null);
        }
    }
}
