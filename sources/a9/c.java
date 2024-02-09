package a9;

import java.text.DecimalFormat;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f55a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f56b;

    static {
        Class<b> cls = b.class;
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f56b = threadLocalArr;
    }

    public static final boolean a() {
        return f55a;
    }
}
