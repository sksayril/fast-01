package t2;

import java.util.NoSuchElementException;

abstract class o0 extends v0 {

    /* renamed from: m  reason: collision with root package name */
    private final int f12374m;

    /* renamed from: n  reason: collision with root package name */
    private int f12375n;

    protected o0(int i10, int i11) {
        m0.b(i11, i10, "index");
        this.f12374m = i10;
        this.f12375n = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object b(int i10);

    public final boolean hasNext() {
        return this.f12375n < this.f12374m;
    }

    public final boolean hasPrevious() {
        return this.f12375n > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f12375n;
            this.f12375n = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f12375n;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f12375n - 1;
            this.f12375n = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f12375n - 1;
    }
}
