package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class i0 extends c<Long> implements a0.h, RandomAccess, a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final i0 f1964p;

    /* renamed from: n  reason: collision with root package name */
    private long[] f1965n;

    /* renamed from: o  reason: collision with root package name */
    private int f1966o;

    static {
        i0 i0Var = new i0(new long[0], 0);
        f1964p = i0Var;
        i0Var.m();
    }

    i0() {
        this(new long[10], 0);
    }

    private i0(long[] jArr, int i10) {
        this.f1965n = jArr;
        this.f1966o = i10;
    }

    private void g(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f1966o)) {
            throw new IndexOutOfBoundsException(y(i10));
        }
        long[] jArr = this.f1965n;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f1965n, i10, jArr2, i10 + 1, this.f1966o - i10);
            this.f1965n = jArr2;
        }
        this.f1965n[i10] = j10;
        this.f1966o++;
        this.modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f1966o) {
            throw new IndexOutOfBoundsException(y(i10));
        }
    }

    private String y(int i10) {
        return "Index:" + i10 + ", Size:" + this.f1966o;
    }

    /* renamed from: A */
    public Long remove(int i10) {
        c();
        k(i10);
        long[] jArr = this.f1965n;
        long j10 = jArr[i10];
        int i11 = this.f1966o;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f1966o--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: B */
    public Long set(int i10, Long l10) {
        return Long.valueOf(C(i10, l10.longValue()));
    }

    public long C(int i10, long j10) {
        c();
        k(i10);
        long[] jArr = this.f1965n;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i10 = i0Var.f1966o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f1966o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f1965n;
            if (i12 > jArr.length) {
                this.f1965n = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(i0Var.f1965n, 0, this.f1965n, this.f1966o, i0Var.f1966o);
            this.f1966o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i10, Long l10) {
        g(i10, l10.longValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f1966o != i0Var.f1966o) {
            return false;
        }
        long[] jArr = i0Var.f1965n;
        for (int i10 = 0; i10 < this.f1966o; i10++) {
            if (this.f1965n[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Long l10) {
        i(l10.longValue());
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f1966o; i11++) {
            i10 = (i10 * 31) + a0.f(this.f1965n[i11]);
        }
        return i10;
    }

    public void i(long j10) {
        c();
        int i10 = this.f1966o;
        long[] jArr = this.f1965n;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f1965n = jArr2;
        }
        long[] jArr3 = this.f1965n;
        int i11 = this.f1966o;
        this.f1966o = i11 + 1;
        jArr3[i11] = j10;
    }

    /* renamed from: l */
    public Long get(int i10) {
        return Long.valueOf(o(i10));
    }

    public long o(int i10) {
        k(i10);
        return this.f1965n[i10];
    }

    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f1966o; i10++) {
            if (obj.equals(Long.valueOf(this.f1965n[i10]))) {
                long[] jArr = this.f1965n;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f1966o - i10) - 1);
                this.f1966o--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            long[] jArr = this.f1965n;
            System.arraycopy(jArr, i11, jArr, i10, this.f1966o - i11);
            this.f1966o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f1966o;
    }

    /* renamed from: z */
    public a0.h q(int i10) {
        if (i10 >= this.f1966o) {
            return new i0(Arrays.copyOf(this.f1965n, i10), this.f1966o);
        }
        throw new IllegalArgumentException();
    }
}
