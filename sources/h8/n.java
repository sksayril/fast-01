package h8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

class n extends m {
    public static <T> List<T> c() {
        return x.f9427m;
    }

    public static <T> int d(List<? extends T> list) {
        l.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> e(T... tArr) {
        l.e(tArr, "elements");
        return tArr.length > 0 ? i.b(tArr) : c();
    }

    public static <T> List<T> f(T... tArr) {
        l.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new d(tArr, true));
    }

    public static final <T> List<T> g(List<? extends T> list) {
        l.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : m.b(list.get(0)) : c();
    }

    public static void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
