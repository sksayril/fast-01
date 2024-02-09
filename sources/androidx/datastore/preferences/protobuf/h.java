package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final h f1926n = new j(a0.f1886c);

    /* renamed from: o  reason: collision with root package name */
    private static final f f1927o = (d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: p  reason: collision with root package name */
    private static final Comparator<h> f1928p = new b();

    /* renamed from: m  reason: collision with root package name */
    private int f1929m = 0;

    class a extends c {

        /* renamed from: m  reason: collision with root package name */
        private int f1930m = 0;

        /* renamed from: n  reason: collision with root package name */
        private final int f1931n;

        a() {
            this.f1931n = h.this.size();
        }

        public byte a() {
            int i10 = this.f1930m;
            if (i10 < this.f1931n) {
                this.f1930m = i10 + 1;
                return h.this.y(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f1930m < this.f1931n;
        }
    }

    static class b implements Comparator<h> {
        b() {
        }

        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g A = hVar.iterator();
            g A2 = hVar2.iterator();
            while (A.hasNext() && A2.hasNext()) {
                int compare = Integer.compare(h.H(A.a()), h.H(A2.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    static abstract class c implements g {
        c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    private static final class e extends j {

        /* renamed from: r  reason: collision with root package name */
        private final int f1933r;

        /* renamed from: s  reason: collision with root package name */
        private final int f1934s;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.g(i10, i10 + i11, bArr.length);
            this.f1933r = i10;
            this.f1934s = i11;
        }

        /* access modifiers changed from: protected */
        public int P() {
            return this.f1933r;
        }

        public byte d(int i10) {
            h.f(i10, size());
            return this.f1937q[this.f1933r + i10];
        }

        /* access modifiers changed from: protected */
        public void o(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f1937q, P() + i10, bArr, i11, i12);
        }

        public int size() {
            return this.f1934s;
        }

        /* access modifiers changed from: package-private */
        public byte y(int i10) {
            return this.f1937q[this.f1933r + i10];
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface g extends Iterator<Byte> {
        byte a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$h  reason: collision with other inner class name */
    static final class C0039h {

        /* renamed from: a  reason: collision with root package name */
        private final k f1935a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f1936b;

        private C0039h(int i10) {
            byte[] bArr = new byte[i10];
            this.f1936b = bArr;
            this.f1935a = k.g0(bArr);
        }

        /* synthetic */ C0039h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f1935a.c();
            return new j(this.f1936b);
        }

        public k b() {
            return this.f1935a;
        }
    }

    static abstract class i extends h {
        i() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return h.super.iterator();
        }
    }

    private static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        protected final byte[] f1937q;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f1937q = bArr;
        }

        public final i C() {
            return i.j(this.f1937q, P(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int D(int i10, int i11, int i12) {
            return a0.i(i10, this.f1937q, P() + i11, i12);
        }

        public final h F(int i10, int i11) {
            int g10 = h.g(i10, i11, size());
            return g10 == 0 ? h.f1926n : new e(this.f1937q, P() + i10, g10);
        }

        /* access modifiers changed from: protected */
        public final String J(Charset charset) {
            return new String(this.f1937q, P(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void N(g gVar) {
            gVar.a(this.f1937q, P(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean O(h hVar, int i10, int i11) {
            if (i11 <= hVar.size()) {
                int i12 = i10 + i11;
                if (i12 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
                } else if (!(hVar instanceof j)) {
                    return hVar.F(i10, i12).equals(F(0, i11));
                } else {
                    j jVar = (j) hVar;
                    byte[] bArr = this.f1937q;
                    byte[] bArr2 = jVar.f1937q;
                    int P = P() + i11;
                    int P2 = P();
                    int P3 = jVar.P() + i10;
                    while (P2 < P) {
                        if (bArr[P2] != bArr2[P3]) {
                            return false;
                        }
                        P2++;
                        P3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int P() {
            return 0;
        }

        public byte d(int i10) {
            return this.f1937q[i10];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int E = E();
            int E2 = jVar.E();
            if (E == 0 || E2 == 0 || E == E2) {
                return O(jVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void o(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f1937q, i10, bArr, i11, i12);
        }

        public int size() {
            return this.f1937q.length;
        }

        /* access modifiers changed from: package-private */
        public byte y(int i10) {
            return this.f1937q[i10];
        }

        public final boolean z() {
            int P = P();
            return s1.n(this.f1937q, P, size() + P);
        }
    }

    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    h() {
    }

    static C0039h B(int i10) {
        return new C0039h(i10, (a) null);
    }

    /* access modifiers changed from: private */
    public static int H(byte b10) {
        return b10 & 255;
    }

    static h L(byte[] bArr) {
        return new j(bArr);
    }

    static h M(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static h i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static h k(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new j(f1927o.a(bArr, i10, i11));
    }

    public static h l(String str) {
        return new j(str.getBytes(a0.f1884a));
    }

    /* renamed from: A */
    public g iterator() {
        return new a();
    }

    public abstract i C();

    /* access modifiers changed from: protected */
    public abstract int D(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int E() {
        return this.f1929m;
    }

    public abstract h F(int i10, int i11);

    public final byte[] G() {
        int size = size();
        if (size == 0) {
            return a0.f1886c;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }

    public final String I(Charset charset) {
        return size() == 0 ? "" : J(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String J(Charset charset);

    public final String K() {
        return I(a0.f1884a);
    }

    /* access modifiers changed from: package-private */
    public abstract void N(g gVar);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f1929m;
        if (i10 == 0) {
            int size = size();
            i10 = D(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f1929m = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public abstract void o(byte[] bArr, int i10, int i11, int i12);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* access modifiers changed from: package-private */
    public abstract byte y(int i10);

    public abstract boolean z();
}
