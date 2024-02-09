package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class ac {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f5086a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f5087b = c7.a();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f5088c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f5089d;

    /* renamed from: e  reason: collision with root package name */
    private static final c f5090e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f5091f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f5092g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f5093h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f5094i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f5095j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f5096k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f5097l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f5098m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f5099n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f5100o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f5101p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f5102q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f5103r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f5104s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f5105t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f5106u;

    /* renamed from: v  reason: collision with root package name */
    private static final int f5107v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f5108w;

    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        public final void b(Object obj, long j10, byte b10) {
            if (ac.f5108w) {
                ac.u(obj, j10, b10);
            } else {
                ac.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z9) {
            if (ac.f5108w) {
                ac.u(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                ac.y(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        public final boolean k(Object obj, long j10) {
            return ac.f5108w ? ac.D(obj, j10) : ac.E(obj, j10);
        }
    }

    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        public final void b(Object obj, long j10, byte b10) {
            if (ac.f5108w) {
                ac.u(obj, j10, b10);
            } else {
                ac.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z9) {
            if (ac.f5108w) {
                ac.u(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                ac.y(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        public final boolean k(Object obj, long j10) {
            return ac.f5108w ? ac.D(obj, j10) : ac.E(obj, j10);
        }
    }

    private static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f5109a;

        c(Unsafe unsafe) {
            this.f5109a = unsafe;
        }

        public abstract double a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f5109a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f5109a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z9);

        public final boolean h() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f5109a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                ac.l(th);
                return false;
            }
        }

        public abstract float i(Object obj, long j10);

        public final boolean j() {
            Unsafe unsafe = this.f5109a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return ac.C() != null;
            } catch (Throwable th) {
                ac.l(th);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j10);

        public final int l(Object obj, long j10) {
            return this.f5109a.getInt(obj, j10);
        }

        public final long m(Object obj, long j10) {
            return this.f5109a.getLong(obj, j10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = p()
            f5086a = r6
            java.lang.Class r7 = com.google.android.gms.internal.measurement.c7.a()
            f5087b = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = A(r7)
            f5088c = r7
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = A(r8)
            f5089d = r8
            if (r6 == 0) goto L_0x003a
            if (r7 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.ac$a r7 = new com.google.android.gms.internal.measurement.ac$a
            r7.<init>(r6)
            goto L_0x003b
        L_0x0032:
            if (r8 == 0) goto L_0x003a
            com.google.android.gms.internal.measurement.ac$b r7 = new com.google.android.gms.internal.measurement.ac$b
            r7.<init>(r6)
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            f5090e = r7
            r6 = 0
            if (r7 != 0) goto L_0x0042
            r8 = 0
            goto L_0x0046
        L_0x0042:
            boolean r8 = r7.j()
        L_0x0046:
            f5091f = r8
            if (r7 != 0) goto L_0x004c
            r8 = 0
            goto L_0x0050
        L_0x004c:
            boolean r8 = r7.h()
        L_0x0050:
            f5092g = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = o(r8)
            long r8 = (long) r8
            f5093h = r8
            int r10 = o(r5)
            long r10 = (long) r10
            f5094i = r10
            int r5 = s(r5)
            long r10 = (long) r5
            f5095j = r10
            int r5 = o(r4)
            long r10 = (long) r5
            f5096k = r10
            int r4 = s(r4)
            long r4 = (long) r4
            f5097l = r4
            int r4 = o(r3)
            long r4 = (long) r4
            f5098m = r4
            int r3 = s(r3)
            long r3 = (long) r3
            f5099n = r3
            int r3 = o(r2)
            long r3 = (long) r3
            f5100o = r3
            int r2 = s(r2)
            long r2 = (long) r2
            f5101p = r2
            int r2 = o(r1)
            long r2 = (long) r2
            f5102q = r2
            int r1 = s(r1)
            long r1 = (long) r1
            f5103r = r1
            int r1 = o(r0)
            long r1 = (long) r1
            f5104s = r1
            int r0 = s(r0)
            long r0 = (long) r0
            f5105t = r0
            java.lang.reflect.Field r0 = C()
            if (r0 == 0) goto L_0x00bf
            if (r7 != 0) goto L_0x00b8
            goto L_0x00bf
        L_0x00b8:
            sun.misc.Unsafe r1 = r7.f5109a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00c1
        L_0x00bf:
            r0 = -1
        L_0x00c1:
            f5106u = r0
            r0 = 7
            long r0 = r0 & r8
            int r1 = (int) r0
            f5107v = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00d2
            r6 = 1
        L_0x00d2:
            f5108w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ac.<clinit>():void");
    }

    private ac() {
    }

    private static boolean A(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class<?> cls3 = f5087b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Object B(Object obj, long j10) {
        return f5090e.f5109a.getObject(obj, j10);
    }

    /* access modifiers changed from: private */
    public static Field C() {
        Field d10 = d(Buffer.class, "effectiveDirectAddress");
        if (d10 != null) {
            return d10;
        }
        Field d11 = d(Buffer.class, "address");
        if (d11 == null || d11.getType() != Long.TYPE) {
            return null;
        }
        return d11;
    }

    static /* synthetic */ boolean D(Object obj, long j10) {
        return ((byte) (t(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) (t(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j10) {
        return f5090e.k(obj, j10);
    }

    static double a(Object obj, long j10) {
        return f5090e.a(obj, j10);
    }

    static <T> T b(Class<T> cls) {
        try {
            return f5086a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j10, double d10) {
        f5090e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f5090e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f5090e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f5090e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f5090e.f5109a.putObject(obj, j10, obj2);
    }

    static /* synthetic */ void l(Throwable th) {
        Logger logger = Logger.getLogger(ac.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    static void m(byte[] bArr, long j10, byte b10) {
        f5090e.b(bArr, f5093h + j10, b10);
    }

    static float n(Object obj, long j10) {
        return f5090e.i(obj, j10);
    }

    private static int o(Class<?> cls) {
        if (f5092g) {
            return f5090e.f5109a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zb());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int s(Class<?> cls) {
        if (f5092g) {
            return f5090e.f5109a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j10) {
        return f5090e.l(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int t9 = t(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (t9 & (~(255 << i10))));
    }

    static void v(Object obj, long j10, boolean z9) {
        f5090e.g(obj, j10, z9);
    }

    static boolean w() {
        return f5092g;
    }

    static long x(Object obj, long j10) {
        return f5090e.m(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (t(obj, j11) & (~(255 << i10))));
    }

    static boolean z() {
        return f5091f;
    }
}
