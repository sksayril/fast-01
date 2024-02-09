package g9;

import g9.o0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.l;

public class n0<T extends o0 & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9011b = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    private T[] f9012a;

    private final T[] f() {
        T[] tArr = this.f9012a;
        if (tArr == null) {
            T[] tArr2 = new o0[4];
            this.f9012a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            l.d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (o0[]) copyOf;
            this.f9012a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i10) {
        f9011b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 < c()) {
                T[] tArr = this.f9012a;
                l.b(tArr);
                int i12 = i11 + 1;
                if (i12 < c()) {
                    T t9 = tArr[i12];
                    l.b(t9);
                    T t10 = tArr[i11];
                    l.b(t10);
                    if (((Comparable) t9).compareTo(t10) < 0) {
                        i11 = i12;
                    }
                }
                T t11 = tArr[i10];
                l.b(t11);
                T t12 = tArr[i11];
                l.b(t12);
                if (((Comparable) t11).compareTo(t12) > 0) {
                    m(i10, i11);
                    i10 = i11;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f9012a;
            l.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t9 = tArr[i11];
            l.b(t9);
            T t10 = tArr[i10];
            l.b(t10);
            if (((Comparable) t9).compareTo(t10) > 0) {
                m(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f9012a;
        l.b(tArr);
        T t9 = tArr[i11];
        l.b(t9);
        T t10 = tArr[i10];
        l.b(t10);
        tArr[i10] = t9;
        tArr[i11] = t10;
        t9.g(i10);
        t10.g(i11);
    }

    public final void a(T t9) {
        t9.n(this);
        o0[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t9;
        t9.g(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f9012a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f9011b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t9) {
        boolean z9;
        synchronized (this) {
            if (t9.m() == null) {
                z9 = false;
            } else {
                h(t9.i());
                z9 = true;
            }
        }
        return z9;
    }

    public final T h(int i10) {
        T[] tArr = this.f9012a;
        l.b(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t9 = tArr[i10];
                l.b(t9);
                T t10 = tArr[i11];
                l.b(t10);
                if (((Comparable) t9).compareTo(t10) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t11 = tArr[c()];
        l.b(t11);
        t11.n((n0<?>) null);
        t11.g(-1);
        tArr[c()] = null;
        return t11;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
