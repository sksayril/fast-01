package l8;

import h8.b;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.l;

final class c<T extends Enum<T>> extends b<T> implements a<T>, Serializable {

    /* renamed from: n  reason: collision with root package name */
    private final T[] f11180n;

    public c(T[] tArr) {
        l.e(tArr, "entries");
        this.f11180n = tArr;
    }

    public int c() {
        return this.f11180n.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return d((Enum) obj);
    }

    public boolean d(T t9) {
        l.e(t9, "element");
        return ((Enum) j.m(this.f11180n, t9.ordinal())) == t9;
    }

    /* renamed from: f */
    public T get(int i10) {
        b.f9412m.a(i10, this.f11180n.length);
        return this.f11180n[i10];
    }

    public int g(T t9) {
        l.e(t9, "element");
        int ordinal = t9.ordinal();
        if (((Enum) j.m(this.f11180n, ordinal)) == t9) {
            return ordinal;
        }
        return -1;
    }

    public int i(T t9) {
        l.e(t9, "element");
        return indexOf(t9);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return g((Enum) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return i((Enum) obj);
    }
}
