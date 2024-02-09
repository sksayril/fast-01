package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import java.util.List;
import k7.a;
import k7.i;

public final /* synthetic */ class t {

    class a implements p.g<p.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10383a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10384b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10383a = arrayList;
            this.f10384b = eVar;
        }

        public void b(Throwable th) {
            this.f10384b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(p.f fVar) {
            this.f10383a.add(0, fVar);
            this.f10384b.a(this.f10383a);
        }
    }

    class b implements p.g<List<p.f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10386b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10385a = arrayList;
            this.f10386b = eVar;
        }

        public void b(Throwable th) {
            this.f10386b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(List<p.f> list) {
            this.f10385a.add(0, list);
            this.f10386b.a(this.f10385a);
        }
    }

    class c implements p.g<p.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10388b;

        c(ArrayList arrayList, a.e eVar) {
            this.f10387a = arrayList;
            this.f10388b = eVar;
        }

        public void b(Throwable th) {
            this.f10388b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(p.e eVar) {
            this.f10387a.add(0, eVar);
            this.f10388b.a(this.f10387a);
        }
    }

    public static i<Object> a() {
        return p.c.f10341d;
    }

    public static /* synthetic */ void b(p.b bVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.a((String) arrayList.get(0), (p.e) arrayList.get(1), new a(new ArrayList(), eVar));
    }

    public static void e(k7.c cVar, p.b bVar) {
        k7.a aVar = new k7.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a());
        if (bVar != null) {
            aVar.e(new q(bVar));
        } else {
            aVar.e((a.d) null);
        }
        k7.a aVar2 = new k7.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a());
        if (bVar != null) {
            aVar2.e(new r(bVar));
        } else {
            aVar2.e((a.d) null);
        }
        k7.a aVar3 = new k7.a(cVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a());
        if (bVar != null) {
            aVar3.e(new s(bVar));
        } else {
            aVar3.e((a.d) null);
        }
    }
}
