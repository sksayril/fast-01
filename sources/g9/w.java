package g9;

import b9.c2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f9041a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f9042b = i0.f("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c  reason: collision with root package name */
    public static final c2 f9043c;

    static {
        w wVar = new w();
        f9041a = wVar;
        f9043c = wVar.a();
    }

    private w() {
    }

    private final c2 a() {
        T t9;
        c2 e10;
        Class<v> cls = v.class;
        try {
            List<v> c10 = f9042b ? l.f9002a.c() : h.e(f.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = c10.iterator();
            if (!it.hasNext()) {
                t9 = null;
            } else {
                t9 = it.next();
                if (it.hasNext()) {
                    int c11 = ((v) t9).c();
                    do {
                        T next = it.next();
                        int c12 = ((v) next).c();
                        if (c11 < c12) {
                            t9 = next;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            }
            v vVar = (v) t9;
            return (vVar == null || (e10 = x.e(vVar, c10)) == null) ? x.b((Throwable) null, (String) null, 3, (Object) null) : e10;
        } catch (Throwable th) {
            return x.b(th, (String) null, 2, (Object) null);
        }
    }
}
