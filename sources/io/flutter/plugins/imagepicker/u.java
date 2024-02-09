package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.p;
import java.util.ArrayList;
import java.util.List;
import k7.a;
import k7.i;

public final /* synthetic */ class u {

    class a implements p.j<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10608b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10607a = arrayList;
            this.f10608b = eVar;
        }

        public void b(Throwable th) {
            this.f10608b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(List<String> list) {
            this.f10607a.add(0, list);
            this.f10608b.a(this.f10607a);
        }
    }

    class b implements p.j<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10610b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10609a = arrayList;
            this.f10610b = eVar;
        }

        public void b(Throwable th) {
            this.f10610b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(List<String> list) {
            this.f10609a.add(0, list);
            this.f10610b.a(this.f10609a);
        }
    }

    class c implements p.j<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10612b;

        c(ArrayList arrayList, a.e eVar) {
            this.f10611a = arrayList;
            this.f10612b = eVar;
        }

        public void b(Throwable th) {
            this.f10612b.a(p.a(th));
        }

        /* renamed from: c */
        public void a(List<String> list) {
            this.f10611a.add(0, list);
            this.f10612b.a(this.f10611a);
        }
    }

    public static i<Object> a() {
        return p.g.f10595d;
    }

    public static /* synthetic */ void b(p.f fVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.b((p.l) arrayList.get(0), (p.h) arrayList.get(1), (p.e) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(p.f fVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.c((p.l) arrayList.get(0), (p.n) arrayList.get(1), (p.e) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void d(p.f fVar, Object obj, a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.a((p.i) arrayList.get(0), (p.e) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    public static /* synthetic */ void e(p.f fVar, Object obj, a.e eVar) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, fVar.d());
        } catch (Throwable th) {
            arrayList = p.a(th);
        }
        eVar.a(arrayList);
    }

    public static void f(k7.c cVar, p.f fVar) {
        k7.a aVar = new k7.a(cVar, "dev.flutter.pigeon.ImagePickerApi.pickImages", a(), cVar.d());
        if (fVar != null) {
            aVar.e(new q(fVar));
        } else {
            aVar.e((a.d) null);
        }
        k7.a aVar2 = new k7.a(cVar, "dev.flutter.pigeon.ImagePickerApi.pickVideos", a(), cVar.d());
        if (fVar != null) {
            aVar2.e(new r(fVar));
        } else {
            aVar2.e((a.d) null);
        }
        k7.a aVar3 = new k7.a(cVar, "dev.flutter.pigeon.ImagePickerApi.pickMedia", a());
        if (fVar != null) {
            aVar3.e(new s(fVar));
        } else {
            aVar3.e((a.d) null);
        }
        k7.a aVar4 = new k7.a(cVar, "dev.flutter.pigeon.ImagePickerApi.retrieveLostResults", a(), cVar.d());
        if (fVar != null) {
            aVar4.e(new t(fVar));
        } else {
            aVar4.e((a.d) null);
        }
    }
}
