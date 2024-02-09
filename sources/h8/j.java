package h8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

class j extends i {
    public static final <T> boolean h(T[] tArr, T t9) {
        l.e(tArr, "<this>");
        return n(tArr, t9) >= 0;
    }

    public static <T> List<T> i(T[] tArr) {
        l.e(tArr, "<this>");
        return (List) j(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C j(T[] tArr, C c10) {
        l.e(tArr, "<this>");
        l.e(c10, "destination");
        for (T t9 : tArr) {
            if (t9 != null) {
                c10.add(t9);
            }
        }
        return c10;
    }

    public static Integer k(int[] iArr) {
        l.e(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <T> int l(T[] tArr) {
        l.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T m(T[] tArr, int i10) {
        l.e(tArr, "<this>");
        if (i10 < 0 || i10 > l(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final <T> int n(T[] tArr, T t9) {
        l.e(tArr, "<this>");
        int i10 = 0;
        if (t9 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (l.a(t9, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static char o(char[] cArr) {
        l.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T p(T[] tArr) {
        l.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }
}
