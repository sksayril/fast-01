package androidx.core.util;

public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1673a;

    /* renamed from: b  reason: collision with root package name */
    private int f1674b;

    public f(int i10) {
        if (i10 > 0) {
            this.f1673a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t9) {
        for (int i10 = 0; i10 < this.f1674b; i10++) {
            if (this.f1673a[i10] == t9) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t9) {
        if (!c(t9)) {
            int i10 = this.f1674b;
            Object[] objArr = this.f1673a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t9;
            this.f1674b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i10 = this.f1674b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f1673a;
        T t9 = tArr[i11];
        tArr[i11] = null;
        this.f1674b = i10 - 1;
        return t9;
    }
}
