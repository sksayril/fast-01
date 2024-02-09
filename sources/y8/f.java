package y8;

import java.util.Iterator;
import kotlin.jvm.internal.l;

class f extends e {

    public static final class a implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f13323a;

        public a(Iterator it) {
            this.f13323a = it;
        }

        public Iterator<T> iterator() {
            return this.f13323a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        l.e(it, "<this>");
        return b(new a(it));
    }

    public static final <T> b<T> b(b<? extends T> bVar) {
        l.e(bVar, "<this>");
        return bVar instanceof a ? bVar : new a(bVar);
    }
}
