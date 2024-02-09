package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

class h extends g {

    public static final class a implements Iterable<T>, s8.a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f13324m;

        public a(b bVar) {
            this.f13324m = bVar;
        }

        public Iterator<T> iterator() {
            return this.f13324m.iterator();
        }
    }

    public static <T> Iterable<T> c(b<? extends T> bVar) {
        l.e(bVar, "<this>");
        return new a(bVar);
    }

    public static <T, R> b<R> d(b<? extends T> bVar, r8.l<? super T, ? extends R> lVar) {
        l.e(bVar, "<this>");
        l.e(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        l.e(bVar, "<this>");
        Iterator<? extends T> it = bVar.iterator();
        if (!it.hasNext()) {
            return n.c();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m.b(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
