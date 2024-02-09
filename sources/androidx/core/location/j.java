package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.core.util.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final int f1530a;

    /* renamed from: b  reason: collision with root package name */
    final long f1531b;

    /* renamed from: c  reason: collision with root package name */
    final long f1532c;

    /* renamed from: d  reason: collision with root package name */
    final long f1533d;

    /* renamed from: e  reason: collision with root package name */
    final int f1534e;

    /* renamed from: f  reason: collision with root package name */
    final float f1535f;

    /* renamed from: g  reason: collision with root package name */
    final long f1536g;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Class<?> f1537a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f1538b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f1539c;

        /* renamed from: d  reason: collision with root package name */
        private static Method f1540d;

        /* renamed from: e  reason: collision with root package name */
        private static Method f1541e;

        /* renamed from: f  reason: collision with root package name */
        private static Method f1542f;

        public static Object a(j jVar, String str) {
            try {
                if (f1537a == null) {
                    f1537a = Class.forName("android.location.LocationRequest");
                }
                if (f1538b == null) {
                    Method declaredMethod = f1537a.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});
                    f1538b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f1538b.invoke((Object) null, new Object[]{str, Long.valueOf(jVar.b()), Float.valueOf(jVar.e()), Boolean.FALSE});
                if (invoke == null) {
                    return null;
                }
                if (f1539c == null) {
                    Method declaredMethod2 = f1537a.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});
                    f1539c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f1539c.invoke(invoke, new Object[]{Integer.valueOf(jVar.g())});
                if (f1540d == null) {
                    Method declaredMethod3 = f1537a.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});
                    f1540d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f1540d.invoke(invoke, new Object[]{Long.valueOf(jVar.f())});
                if (jVar.d() < Integer.MAX_VALUE) {
                    if (f1541e == null) {
                        Method declaredMethod4 = f1537a.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});
                        f1541e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f1541e.invoke(invoke, new Object[]{Integer.valueOf(jVar.d())});
                }
                if (jVar.a() < Long.MAX_VALUE) {
                    if (f1542f == null) {
                        Method declaredMethod5 = f1537a.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});
                        f1542f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f1542f.invoke(invoke, new Object[]{Long.valueOf(jVar.a())});
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    private static class b {
        public static LocationRequest a(j jVar) {
            return new LocationRequest.Builder(jVar.b()).setQuality(jVar.g()).setMinUpdateIntervalMillis(jVar.f()).setDurationMillis(jVar.a()).setMaxUpdates(jVar.d()).setMinUpdateDistanceMeters(jVar.e()).setMaxUpdateDelayMillis(jVar.c()).build();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private long f1543a;

        /* renamed from: b  reason: collision with root package name */
        private int f1544b = 102;

        /* renamed from: c  reason: collision with root package name */
        private long f1545c = Long.MAX_VALUE;

        /* renamed from: d  reason: collision with root package name */
        private int f1546d = Integer.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        private long f1547e = -1;

        /* renamed from: f  reason: collision with root package name */
        private float f1548f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        private long f1549g = 0;

        public c(long j10) {
            b(j10);
        }

        public j a() {
            h.l((this.f1543a == Long.MAX_VALUE && this.f1547e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f1543a;
            return new j(j10, this.f1544b, this.f1545c, this.f1546d, Math.min(this.f1547e, j10), this.f1548f, this.f1549g);
        }

        public c b(long j10) {
            this.f1543a = h.f(j10, 0, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public c c(float f10) {
            this.f1548f = f10;
            this.f1548f = h.d(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public c d(int i10) {
            h.b(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f1544b = i10;
            return this;
        }
    }

    j(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f1531b = j10;
        this.f1530a = i10;
        this.f1532c = j12;
        this.f1533d = j11;
        this.f1534e = i11;
        this.f1535f = f10;
        this.f1536g = j13;
    }

    public long a() {
        return this.f1533d;
    }

    public long b() {
        return this.f1531b;
    }

    public long c() {
        return this.f1536g;
    }

    public int d() {
        return this.f1534e;
    }

    public float e() {
        return this.f1535f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1530a == jVar.f1530a && this.f1531b == jVar.f1531b && this.f1532c == jVar.f1532c && this.f1533d == jVar.f1533d && this.f1534e == jVar.f1534e && Float.compare(jVar.f1535f, this.f1535f) == 0 && this.f1536g == jVar.f1536g;
    }

    public long f() {
        long j10 = this.f1532c;
        return j10 == -1 ? this.f1531b : j10;
    }

    public int g() {
        return this.f1530a;
    }

    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        long j10 = this.f1531b;
        long j11 = this.f1532c;
        return (((this.f1530a * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @SuppressLint({"NewApi"})
    public LocationRequest i(String str) {
        return Build.VERSION.SDK_INT >= 31 ? h() : (LocationRequest) a.a(this, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r6.f1531b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r6.f1531b
            androidx.core.util.j.b(r1, r0)
            int r1 = r6.f1530a
            r2 = 100
            if (r1 == r2) goto L_0x0034
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0031
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            java.lang.String r1 = " LOW_POWER"
            goto L_0x0039
        L_0x0031:
            java.lang.String r1 = " BALANCED"
            goto L_0x0039
        L_0x0034:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L_0x0039
        L_0x0037:
            java.lang.String r1 = "PASSIVE"
        L_0x0039:
            r0.append(r1)
        L_0x003c:
            long r1 = r6.f1533d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r6.f1533d
            androidx.core.util.j.b(r1, r0)
        L_0x004c:
            int r1 = r6.f1534e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L_0x005d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r6.f1534e
            r0.append(r1)
        L_0x005d:
            long r1 = r6.f1532c
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0075
            long r3 = r6.f1531b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0075
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r6.f1532c
            androidx.core.util.j.b(r1, r0)
        L_0x0075:
            float r1 = r6.f1535f
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r6.f1535f
            r0.append(r1)
        L_0x0088:
            long r1 = r6.f1536g
            r3 = 2
            long r1 = r1 / r3
            long r3 = r6.f1531b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x009d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r6.f1536g
            androidx.core.util.j.b(r1, r0)
        L_0x009d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.j.toString():java.lang.String");
    }
}
