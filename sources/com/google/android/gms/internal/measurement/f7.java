package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class f7 implements Serializable, Iterable<Byte> {

    /* renamed from: n  reason: collision with root package name */
    public static final f7 f5243n = new p7(r8.f5564d);

    /* renamed from: o  reason: collision with root package name */
    private static final m7 f5244o = new s7();

    /* renamed from: p  reason: collision with root package name */
    private static final Comparator<f7> f5245p = new h7();

    /* renamed from: m  reason: collision with root package name */
    private int f5246m = 0;

    f7() {
    }

    static o7 C(int i10) {
        return new o7(i10);
    }

    static /* synthetic */ int f(byte b10) {
        return b10 & 255;
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

    public static f7 k(String str) {
        return new p7(str.getBytes(r8.f5562b));
    }

    public static f7 l(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new p7(f5244o.a(bArr, i10, i11));
    }

    public abstract int A();

    /* access modifiers changed from: protected */
    public abstract int B(int i10, int i11, int i12);

    public final String D() {
        return A() == 0 ? "" : o(r8.f5562b);
    }

    public abstract boolean E();

    public abstract byte c(int i10);

    /* access modifiers changed from: protected */
    public final int d() {
        return this.f5246m;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f5246m;
        if (i10 == 0) {
            int A = A();
            i10 = B(A, 0, A);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f5246m = i10;
        }
        return i10;
    }

    public abstract f7 i(int i10, int i11);

    public /* synthetic */ Iterator iterator() {
        return new i7(this);
    }

    /* access modifiers changed from: protected */
    public abstract String o(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(A());
        if (A() <= 50) {
            str = pb.a(this);
        } else {
            str = pb.a(i(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: package-private */
    public abstract void y(g7 g7Var);

    /* access modifiers changed from: package-private */
    public abstract byte z(int i10);
}
