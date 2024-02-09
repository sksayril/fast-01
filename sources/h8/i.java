package h8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.l;

class i extends h {
    public static <T> List<T> b(T[] tArr) {
        l.e(tArr, "<this>");
        List<T> a10 = k.a(tArr);
        l.d(a10, "asList(this)");
        return a10;
    }

    public static final <T> T[] c(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        l.e(tArr, "<this>");
        l.e(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c(objArr, objArr2, i10, i11, i12);
    }

    public static final <T> void e(T[] tArr, T t9, int i10, int i11) {
        l.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t9);
    }

    public static <T> T[] f(T[] tArr, T t9) {
        l.e(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t9;
        l.d(copyOf, "result");
        return copyOf;
    }

    public static final <T> void g(T[] tArr, Comparator<? super T> comparator) {
        l.e(tArr, "<this>");
        l.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
