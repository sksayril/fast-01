package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f1884a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f1885b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1886c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f1887d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f1888e;

    public interface a extends i<Boolean> {
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
        T a(int i10);
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends i<Float> {
    }

    public interface g extends i<Integer> {
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void m();

        i<E> q(int i10);

        boolean x();
    }

    static {
        byte[] bArr = new byte[0];
        f1886c = bArr;
        f1887d = ByteBuffer.wrap(bArr);
        f1888e = i.h(bArr);
    }

    static <T> T a(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    static <T> T b(T t9, String str) {
        Objects.requireNonNull(t9, str);
        return t9;
    }

    public static int c(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return s1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((r0) obj).e().c((r0) obj2).g();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f1884a);
    }
}
