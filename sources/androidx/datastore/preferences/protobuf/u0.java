package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u1;
import f.j;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class u0<T> implements g1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f2095r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f2096s = r1.B();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f2097a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f2098b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2099c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2100d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f2101e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2102f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2103g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2104h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2105i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f2106j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2107k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2108l;

    /* renamed from: m  reason: collision with root package name */
    private final w0 f2109m;

    /* renamed from: n  reason: collision with root package name */
    private final h0 f2110n;

    /* renamed from: o  reason: collision with root package name */
    private final n1<?, ?> f2111o;

    /* renamed from: p  reason: collision with root package name */
    private final q<?> f2112p;

    /* renamed from: q  reason: collision with root package name */
    private final m0 f2113q;

    private u0(int[] iArr, Object[] objArr, int i10, int i11, r0 r0Var, boolean z9, boolean z10, int[] iArr2, int i12, int i13, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        this.f2097a = iArr;
        this.f2098b = objArr;
        this.f2099c = i10;
        this.f2100d = i11;
        this.f2103g = r0Var instanceof y;
        this.f2104h = z9;
        this.f2102f = qVar != null && qVar.e(r0Var);
        this.f2105i = z10;
        this.f2106j = iArr2;
        this.f2107k = i12;
        this.f2108l = i13;
        this.f2109m = w0Var;
        this.f2110n = h0Var;
        this.f2111o = n1Var;
        this.f2112p = qVar;
        this.f2101e = r0Var;
        this.f2113q = m0Var;
    }

    private static boolean A(Object obj, int i10, g1 g1Var) {
        return g1Var.e(r1.A(obj, R(i10)));
    }

    private <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) r1.A(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 s9 = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!s9.e(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean C(T t9, int i10, int i11) {
        Map<?, ?> g10 = this.f2113q.g(r1.A(t9, R(i10)));
        if (g10.isEmpty()) {
            return true;
        }
        if (this.f2113q.f(r(i11)).f2018c.getJavaType() != t1.c.MESSAGE) {
            return true;
        }
        g1<?> g1Var = null;
        for (Object next : g10.values()) {
            if (g1Var == null) {
                g1Var = c1.a().d(next.getClass());
            }
            if (!g1Var.e(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t9, T t10, int i10) {
        long Y = (long) (Y(i10) & 1048575);
        return r1.x(t9, Y) == r1.x(t10, Y);
    }

    private boolean E(T t9, int i10, int i11) {
        return r1.x(t9, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> G(Object obj, long j10) {
        return (List) r1.A(obj, j10);
    }

    private static <T> long H(T t9, long j10) {
        return r1.y(t9, j10);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.u.b<ET>> void I(androidx.datastore.preferences.protobuf.n1<UT, UB> r17, androidx.datastore.preferences.protobuf.q<ET> r18, T r19, androidx.datastore.preferences.protobuf.f1 r20, androidx.datastore.preferences.protobuf.p r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.s()     // Catch:{ all -> 0x056b }
            int r3 = r8.X(r1)     // Catch:{ all -> 0x056b }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f2107k
        L_0x001e:
            int r1 = r8.f2108l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f2106j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f2102f     // Catch:{ all -> 0x056b }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            androidx.datastore.preferences.protobuf.r0 r2 = r8.f2101e     // Catch:{ all -> 0x056b }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x056b }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            androidx.datastore.preferences.protobuf.u r1 = r18.d(r19)     // Catch:{ all -> 0x056b }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x056b }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.D()     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x056b }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f2107k
        L_0x0079:
            int r1 = r8.f2108l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f2106j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.i0(r3)     // Catch:{ all -> 0x056b }
            int r2 = h0(r4)     // Catch:{ a -> 0x0524 }
            switch(r2) {
                case 0: goto L_0x04f9;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04b8;
                case 6: goto L_0x04ab;
                case 7: goto L_0x049e;
                case 8: goto L_0x0499;
                case 9: goto L_0x0468;
                case 10: goto L_0x045c;
                case 11: goto L_0x0450;
                case 12: goto L_0x0438;
                case 13: goto L_0x042c;
                case 14: goto L_0x0420;
                case 15: goto L_0x0414;
                case 16: goto L_0x0408;
                case 17: goto L_0x03d1;
                case 18: goto L_0x03c5;
                case 19: goto L_0x03b9;
                case 20: goto L_0x03ad;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0395;
                case 23: goto L_0x0389;
                case 24: goto L_0x037d;
                case 25: goto L_0x0371;
                case 26: goto L_0x036c;
                case 27: goto L_0x035a;
                case 28: goto L_0x034b;
                case 29: goto L_0x033f;
                case 30: goto L_0x032c;
                case 31: goto L_0x0320;
                case 32: goto L_0x0314;
                case 33: goto L_0x0308;
                case 34: goto L_0x02fc;
                case 35: goto L_0x02ed;
                case 36: goto L_0x02de;
                case 37: goto L_0x02cf;
                case 38: goto L_0x02c0;
                case 39: goto L_0x02b1;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0293;
                case 42: goto L_0x0284;
                case 43: goto L_0x0275;
                case 44: goto L_0x025e;
                case 45: goto L_0x024f;
                case 46: goto L_0x0240;
                case 47: goto L_0x0231;
                case 48: goto L_0x0222;
                case 49: goto L_0x020c;
                case 50: goto L_0x01fb;
                case 51: goto L_0x01ea;
                case 52: goto L_0x01d9;
                case 53: goto L_0x01c8;
                case 54: goto L_0x01b7;
                case 55: goto L_0x01a6;
                case 56: goto L_0x0195;
                case 57: goto L_0x0184;
                case 58: goto L_0x0173;
                case 59: goto L_0x016e;
                case 60: goto L_0x0137;
                case 61: goto L_0x012a;
                case 62: goto L_0x011a;
                case 63: goto L_0x00f7;
                case 64: goto L_0x00e7;
                case 65: goto L_0x00d7;
                case 66: goto L_0x00c7;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ a -> 0x0524 }
        L_0x009b:
            if (r13 != 0) goto L_0x0507
            java.lang.Object r1 = r17.n()     // Catch:{ a -> 0x0524 }
            goto L_0x0506
        L_0x00a3:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r2 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.P(r2, r11)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
        L_0x00b2:
            r8.f0(r10, r1, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x00b7:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.m()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00c7:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.k()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00d7:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.u()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00e7:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.E()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x00f7:
            int r2 = r20.d()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.a0$e r5 = r8.q(r3)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x010e
            boolean r5 = r5.a(r2)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0108
            goto L_0x010e
        L_0x0108:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.i1.L(r1, r2, r13, r9)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x010e:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x011a:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.A()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x012a:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.h r2 = r20.y()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0137:
            boolean r2 = r8.E(r10, r1, r3)     // Catch:{ a -> 0x0524 }
            if (r2 == 0) goto L_0x015a
            long r5 = R(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.r1.A(r10, r5)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r5 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r5 = r0.a(r5, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.a0.h(r2, r5)     // Catch:{ a -> 0x0524 }
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x015a:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r2 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            r8.e0(r10, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x016e:
            r8.b0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0173:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            boolean r2 = r20.r()     // Catch:{ a -> 0x0524 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0184:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.q()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x0195:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.h()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01a6:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            int r2 = r20.B()     // Catch:{ a -> 0x0524 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01b7:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.f()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01c8:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            long r6 = r20.K()     // Catch:{ a -> 0x0524 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01d9:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x0524 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01ea:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x0524 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x00b2
        L_0x01fb:
            java.lang.Object r4 = r8.r(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.J(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x020c:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r6 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.Z(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0222:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x022c:
            r0.l(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0231:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x023b:
            r0.c(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0240:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x024a:
            r0.J(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x024f:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x0259:
            r0.j(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x025e:
            androidx.datastore.preferences.protobuf.h0 r2 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0524 }
            r0.O(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.a0$e r3 = r8.q(r3)     // Catch:{ a -> 0x0524 }
        L_0x026f:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.i1.A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0275:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x027f:
            r0.n(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0284:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x028e:
            r0.o(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0293:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x029d:
            r0.g(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02a2:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02ac:
            r0.M(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02b1:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02bb:
            r0.N(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02c0:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02ca:
            r0.v(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02cf:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02d9:
            r0.I(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02de:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02e8:
            r0.z(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02ed:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
        L_0x02f7:
            r0.G(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x02fc:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x022c
        L_0x0308:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x023b
        L_0x0314:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x024a
        L_0x0320:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x0259
        L_0x032c:
            androidx.datastore.preferences.protobuf.h0 r2 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0524 }
            r0.O(r2)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.a0$e r3 = r8.q(r3)     // Catch:{ a -> 0x0524 }
            goto L_0x026f
        L_0x033f:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x027f
        L_0x034b:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            r0.F(r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x035a:
            androidx.datastore.preferences.protobuf.g1 r5 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.a0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x036c:
            r8.c0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0371:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x028e
        L_0x037d:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x029d
        L_0x0389:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02ac
        L_0x0395:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02bb
        L_0x03a1:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02ca
        L_0x03ad:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02d9
        L_0x03b9:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02e8
        L_0x03c5:
            androidx.datastore.preferences.protobuf.h0 r1 = r8.f2110n     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x02f7
        L_0x03d1:
            boolean r1 = r8.y(r10, r3)     // Catch:{ a -> 0x0524 }
            if (r1 == 0) goto L_0x03f4
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.r1.A(r10, r1)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r2 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.P(r2, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.a0.h(r1, r2)     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
        L_0x03ef:
            androidx.datastore.preferences.protobuf.r1.O(r10, r2, r1)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x03f4:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r4 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r4 = r0.P(r4, r11)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
        L_0x0403:
            r8.e0(r10, r3)     // Catch:{ a -> 0x0524 }
            goto L_0x000d
        L_0x0408:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.m()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0414:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.k()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0420:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.u()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x042c:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.E()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0438:
            int r2 = r20.d()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.a0$e r5 = r8.q(r3)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0448
            boolean r5 = r5.a(r2)     // Catch:{ a -> 0x0524 }
            if (r5 == 0) goto L_0x0108
        L_0x0448:
            long r4 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r4, r2)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0450:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.A()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x045c:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.h r4 = r20.y()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0468:
            boolean r1 = r8.y(r10, r3)     // Catch:{ a -> 0x0524 }
            if (r1 == 0) goto L_0x0488
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.r1.A(r10, r1)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r2 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r2 = r0.a(r2, r11)     // Catch:{ a -> 0x0524 }
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.a0.h(r1, r2)     // Catch:{ a -> 0x0524 }
            long r2 = R(r4)     // Catch:{ a -> 0x0524 }
            goto L_0x03ef
        L_0x0488:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.g1 r4 = r8.s(r3)     // Catch:{ a -> 0x0524 }
            java.lang.Object r4 = r0.a(r4, r11)     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.O(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0499:
            r8.b0(r10, r4, r0)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x049e:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            boolean r4 = r20.r()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.E(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04ab:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.q()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04b8:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.h()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04c5:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            int r4 = r20.B()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.M(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04d2:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.f()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04df:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            long r4 = r20.K()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.N(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04ec:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.L(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x04f9:
            long r1 = R(r4)     // Catch:{ a -> 0x0524 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x0524 }
            androidx.datastore.preferences.protobuf.r1.K(r10, r1, r4)     // Catch:{ a -> 0x0524 }
            goto L_0x0403
        L_0x0506:
            r13 = r1
        L_0x0507:
            boolean r1 = r9.m(r13, r0)     // Catch:{ a -> 0x0524 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f2107k
        L_0x050f:
            int r1 = r8.f2108l
            if (r0 >= r1) goto L_0x051e
            int[] r1 = r8.f2106j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x050f
        L_0x051e:
            if (r13 == 0) goto L_0x0523
            r9.o(r10, r13)
        L_0x0523:
            return
        L_0x0524:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x056b }
            if (r1 == 0) goto L_0x0547
            boolean r1 = r20.D()     // Catch:{ all -> 0x056b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f2107k
        L_0x0532:
            int r1 = r8.f2108l
            if (r0 >= r1) goto L_0x0541
            int[] r1 = r8.f2106j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0532
        L_0x0541:
            if (r13 == 0) goto L_0x0546
            r9.o(r10, r13)
        L_0x0546:
            return
        L_0x0547:
            if (r13 != 0) goto L_0x054e
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x056b }
            r13 = r1
        L_0x054e:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x056b }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f2107k
        L_0x0556:
            int r1 = r8.f2108l
            if (r0 >= r1) goto L_0x0565
            int[] r1 = r8.f2106j
            r1 = r1[r0]
            java.lang.Object r13 = r8.n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0556
        L_0x0565:
            if (r13 == 0) goto L_0x056a
            r9.o(r10, r13)
        L_0x056a:
            return
        L_0x056b:
            r0 = move-exception
            int r1 = r8.f2107k
        L_0x056e:
            int r2 = r8.f2108l
            if (r1 >= r2) goto L_0x057d
            int[] r2 = r8.f2106j
            r2 = r2[r1]
            java.lang.Object r13 = r8.n(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x056e
        L_0x057d:
            if (r13 == 0) goto L_0x0582
            r9.o(r10, r13)
        L_0x0582:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.I(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.q, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.p):void");
    }

    private final <K, V> void J(Object obj, int i10, Object obj2, p pVar, f1 f1Var) {
        long R = R(i0(i10));
        Object A = r1.A(obj, R);
        if (A == null) {
            A = this.f2113q.b(obj2);
            r1.O(obj, R, A);
        } else if (this.f2113q.d(A)) {
            Object b10 = this.f2113q.b(obj2);
            this.f2113q.a(b10, A);
            r1.O(obj, R, b10);
            A = b10;
        }
        f1Var.b(this.f2113q.h(A), this.f2113q.f(obj2), pVar);
    }

    private void K(T t9, T t10, int i10) {
        long R = R(i0(i10));
        if (y(t10, i10)) {
            Object A = r1.A(t9, R);
            Object A2 = r1.A(t10, R);
            if (A != null && A2 != null) {
                A2 = a0.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            r1.O(t9, R, A2);
            e0(t9, i10);
        }
    }

    private void L(T t9, T t10, int i10) {
        int i02 = i0(i10);
        int Q = Q(i10);
        long R = R(i02);
        if (E(t10, Q, i10)) {
            Object A = r1.A(t9, R);
            Object A2 = r1.A(t10, R);
            if (A != null && A2 != null) {
                A2 = a0.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            r1.O(t9, R, A2);
            f0(t9, Q, i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        androidx.datastore.preferences.protobuf.r1.O(r6, r1, androidx.datastore.preferences.protobuf.r1.A(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        androidx.datastore.preferences.protobuf.r1.M(r6, r1, androidx.datastore.preferences.protobuf.r1.x(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        androidx.datastore.preferences.protobuf.r1.N(r6, r1, androidx.datastore.preferences.protobuf.r1.y(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        e0(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        androidx.datastore.preferences.protobuf.r1.O(r6, r1, androidx.datastore.preferences.protobuf.r1.A(r7, r1));
        f0(r6, r3, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(T r6, T r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.i0(r8)
            long r1 = R(r0)
            int r3 = r5.Q(r8)
            int r0 = h0(r0)
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009c;
                case 6: goto L_0x0095;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x0066;
                case 12: goto L_0x005f;
                case 13: goto L_0x0058;
                case 14: goto L_0x0050;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0074;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x0033;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x001c;
                case 61: goto L_0x0015;
                case 62: goto L_0x0015;
                case 63: goto L_0x0015;
                case 64: goto L_0x0015;
                case 65: goto L_0x0015;
                case 66: goto L_0x0015;
                case 67: goto L_0x0015;
                case 68: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e4
        L_0x0015:
            boolean r0 = r5.E(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0027
        L_0x001c:
            r5.L(r6, r7, r8)
            goto L_0x00e4
        L_0x0021:
            boolean r0 = r5.E(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0027:
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.r1.A(r7, r1)
            androidx.datastore.preferences.protobuf.r1.O(r6, r1, r7)
            r5.f0(r6, r3, r8)
            goto L_0x00e4
        L_0x0033:
            androidx.datastore.preferences.protobuf.m0 r8 = r5.f2113q
            androidx.datastore.preferences.protobuf.i1.F(r8, r6, r7, r1)
            goto L_0x00e4
        L_0x003a:
            androidx.datastore.preferences.protobuf.h0 r8 = r5.f2110n
            r8.d(r6, r7, r1)
            goto L_0x00e4
        L_0x0041:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0049:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x0050:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0058:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x005f:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0065:
            goto L_0x00a9
        L_0x0066:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x006d:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x007f
        L_0x0074:
            r5.K(r6, r7, r8)
            goto L_0x00e4
        L_0x0079:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x007f:
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.r1.A(r7, r1)
            androidx.datastore.preferences.protobuf.r1.O(r6, r1, r7)
            goto L_0x00e1
        L_0x0087:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            boolean r7 = androidx.datastore.preferences.protobuf.r1.p(r7, r1)
            androidx.datastore.preferences.protobuf.r1.E(r6, r1, r7)
            goto L_0x00e1
        L_0x0095:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00a3:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            int r7 = androidx.datastore.preferences.protobuf.r1.x(r7, r1)
            androidx.datastore.preferences.protobuf.r1.M(r6, r1, r7)
            goto L_0x00e1
        L_0x00b1:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00b8:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00be:
            long r3 = androidx.datastore.preferences.protobuf.r1.y(r7, r1)
            androidx.datastore.preferences.protobuf.r1.N(r6, r1, r3)
            goto L_0x00e1
        L_0x00c6:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            float r7 = androidx.datastore.preferences.protobuf.r1.w(r7, r1)
            androidx.datastore.preferences.protobuf.r1.L(r6, r1, r7)
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r5.y(r7, r8)
            if (r0 == 0) goto L_0x00e4
            double r3 = androidx.datastore.preferences.protobuf.r1.v(r7, r1)
            androidx.datastore.preferences.protobuf.r1.K(r6, r1, r3)
        L_0x00e1:
            r5.e0(r6, r8)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.M(java.lang.Object, java.lang.Object, int):void");
    }

    static <T> u0<T> N(Class<T> cls, p0 p0Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        return p0Var instanceof e1 ? P((e1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var) : O((k1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    static <T> u0<T> O(k1 k1Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        boolean z9 = k1Var.b() == b1.PROTO3;
        t[] e10 = k1Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e10.length <= 0) {
                int[] d10 = k1Var.d();
                if (d10 == null) {
                    d10 = f2095r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f2095r;
                    int[] iArr3 = f2095r;
                    int[] iArr4 = new int[(d10.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new u0(iArr, objArr, 0, 0, k1Var.c(), z9, true, iArr4, d10.length, d10.length + iArr2.length, w0Var, h0Var, n1Var, qVar, m0Var);
                }
                t tVar = e10[0];
                throw null;
            }
            t tVar2 = e10[0];
            throw null;
        }
        t tVar3 = e10[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> androidx.datastore.preferences.protobuf.u0<T> P(androidx.datastore.preferences.protobuf.e1 r36, androidx.datastore.preferences.protobuf.w0 r37, androidx.datastore.preferences.protobuf.h0 r38, androidx.datastore.preferences.protobuf.n1<?, ?> r39, androidx.datastore.preferences.protobuf.q<?> r40, androidx.datastore.preferences.protobuf.m0 r41) {
        /*
            androidx.datastore.preferences.protobuf.b1 r0 = r36.b()
            androidx.datastore.preferences.protobuf.b1 r1 = androidx.datastore.preferences.protobuf.b1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f2095r
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f2096s
            java.lang.Object[] r18 = r36.d()
            androidx.datastore.preferences.protobuf.r0 r19 = r36.c()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = d0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = d0(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = d0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = d0(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            androidx.datastore.preferences.protobuf.u0 r0 = new androidx.datastore.preferences.protobuf.u0
            androidx.datastore.preferences.protobuf.r0 r9 = r36.c()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.P(androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.w0, androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.q, androidx.datastore.preferences.protobuf.m0):androidx.datastore.preferences.protobuf.u0");
    }

    private int Q(int i10) {
        return this.f2097a[i10];
    }

    private static long R(int i10) {
        return (long) (i10 & 1048575);
    }

    private static <T> boolean S(T t9, long j10) {
        return ((Boolean) r1.A(t9, j10)).booleanValue();
    }

    private static <T> double T(T t9, long j10) {
        return ((Double) r1.A(t9, j10)).doubleValue();
    }

    private static <T> float U(T t9, long j10) {
        return ((Float) r1.A(t9, j10)).floatValue();
    }

    private static <T> int V(T t9, long j10) {
        return ((Integer) r1.A(t9, j10)).intValue();
    }

    private static <T> long W(T t9, long j10) {
        return ((Long) r1.A(t9, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f2099c || i10 > this.f2100d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f2097a[i10 + 2];
    }

    private <E> void Z(Object obj, long j10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.C(this.f2110n.e(obj, j10), g1Var, pVar);
    }

    private <E> void a0(Object obj, int i10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.H(this.f2110n.e(obj, R(i10)), g1Var, pVar);
    }

    private void b0(Object obj, int i10, f1 f1Var) {
        long R;
        Object y9;
        if (x(i10)) {
            R = R(i10);
            y9 = f1Var.L();
        } else if (this.f2103g) {
            R = R(i10);
            y9 = f1Var.p();
        } else {
            R = R(i10);
            y9 = f1Var.y();
        }
        r1.O(obj, R, y9);
    }

    private void c0(Object obj, int i10, f1 f1Var) {
        if (x(i10)) {
            f1Var.x(this.f2110n.e(obj, R(i10)));
        } else {
            f1Var.t(this.f2110n.e(obj, R(i10)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t9, int i10) {
        if (!this.f2104h) {
            int Y = Y(i10);
            long j10 = (long) (Y & 1048575);
            r1.M(t9, j10, r1.x(t9, j10) | (1 << (Y >>> 20)));
        }
    }

    private void f0(T t9, int i10, int i11) {
        r1.M(t9, (long) (Y(i11) & 1048575), i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f2097a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Q = Q(i13);
            if (i10 == Q) {
                return i13;
            }
            if (i10 < Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int i0(int i10) {
        return this.f2097a[i10 + 1];
    }

    private boolean j(T t9, T t10, int i10) {
        return y(t9, i10) == y(t10, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0(T r18, androidx.datastore.preferences.protobuf.u1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f2102f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.q<?> r3 = r0.f2112p
            androidx.datastore.preferences.protobuf.u r3 = r3.c(r1)
            boolean r5 = r3.n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f2097a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f2096s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.i0(r10)
            int r13 = r0.Q(r10)
            int r14 = h0(r12)
            boolean r15 = r0.f2104h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f2097a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            androidx.datastore.preferences.protobuf.q<?> r9 = r0.f2112p
            int r9 = r9.a(r5)
            if (r9 > r13) goto L_0x0081
            androidx.datastore.preferences.protobuf.q<?> r9 = r0.f2112p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = R(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g1 r5 = r0.s(r10)
            r2.O(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = W(r1, r5)
            r2.z(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.M(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = W(r1, r5)
            r2.o(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.g(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.H(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.e(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.h r4 = (androidx.datastore.preferences.protobuf.h) r4
            r2.l(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g1 r5 = r0.s(r10)
            r2.s(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.n0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = S(r1, r5)
            r2.d(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.m(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = W(r1, r5)
            r2.w(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = V(r1, r5)
            r2.i(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = W(r1, r5)
            r2.G(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = W(r1, r5)
            r2.c(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = U(r1, r5)
            r2.A(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = T(r1, r5)
            r2.n(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g1 r6 = r0.s(r10)
            androidx.datastore.preferences.protobuf.i1.U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            androidx.datastore.preferences.protobuf.i1.b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.i1.b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.g1 r6 = r0.s(r10)
            androidx.datastore.preferences.protobuf.i1.X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.i1.N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.i1.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g1 r5 = r0.s(r10)
            r2.O(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.z(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.M(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.o(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.g(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.H(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.e(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.h r4 = (androidx.datastore.preferences.protobuf.h) r4
            r2.l(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.g1 r5 = r0.s(r10)
            r2.s(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.n0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = k(r1, r5)
            r2.d(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.m(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.w(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.i(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.G(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.c(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = p(r1, r5)
            r2.A(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = l(r1, r5)
            r2.n(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            androidx.datastore.preferences.protobuf.q<?> r4 = r0.f2112p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            androidx.datastore.preferences.protobuf.n1<?, ?> r3 = r0.f2111o
            r0.o0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.j0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    private static <T> boolean k(T t9, long j10) {
        return r1.p(t9, j10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d0, code lost:
        r14.O(r7, androidx.datastore.preferences.protobuf.r1.A(r13, R(r6)), s(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ef, code lost:
        r14.z(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0402, code lost:
        r14.M(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        r14.o(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0428, code lost:
        r14.g(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043b, code lost:
        r14.H(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044e, code lost:
        r14.e(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0459, code lost:
        r14.l(r7, (androidx.datastore.preferences.protobuf.h) androidx.datastore.preferences.protobuf.r1.A(r13, R(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046e, code lost:
        r14.s(r7, androidx.datastore.preferences.protobuf.r1.A(r13, R(r6)), s(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        n0(r7, androidx.datastore.preferences.protobuf.r1.A(r13, R(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a0, code lost:
        r14.d(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b3, code lost:
        r14.m(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c5, code lost:
        r14.w(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r14.i(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e9, code lost:
        r14.G(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04fb, code lost:
        r14.c(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        r14.A(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051f, code lost:
        r14.n(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k0(T r13, androidx.datastore.preferences.protobuf.u1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f2102f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            androidx.datastore.preferences.protobuf.q<?> r0 = r12.f2112p
            androidx.datastore.preferences.protobuf.u r0 = r0.c(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f2097a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0526
            int r6 = r12.i0(r5)
            int r7 = r12.Q(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            androidx.datastore.preferences.protobuf.q<?> r8 = r12.f2112p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            androidx.datastore.preferences.protobuf.q<?> r8 = r12.f2112p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = h0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04b7;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0492;
                case 8: goto L_0x047f;
                case 9: goto L_0x0468;
                case 10: goto L_0x0453;
                case 11: goto L_0x0440;
                case 12: goto L_0x042d;
                case 13: goto L_0x041a;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f4;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ca;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0391;
                case 21: goto L_0x037e;
                case 22: goto L_0x036b;
                case 23: goto L_0x0358;
                case 24: goto L_0x0345;
                case 25: goto L_0x0332;
                case 26: goto L_0x031f;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e2;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0296;
                case 34: goto L_0x0283;
                case 35: goto L_0x0270;
                case 36: goto L_0x025d;
                case 37: goto L_0x024a;
                case 38: goto L_0x0237;
                case 39: goto L_0x0224;
                case 40: goto L_0x0211;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b2;
                case 46: goto L_0x019f;
                case 47: goto L_0x018c;
                case 48: goto L_0x0179;
                case 49: goto L_0x0162;
                case 50: goto L_0x0155;
                case 51: goto L_0x0145;
                case 52: goto L_0x0135;
                case 53: goto L_0x0125;
                case 54: goto L_0x0115;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00bd;
                case 62: goto L_0x00ad;
                case 63: goto L_0x009d;
                case 64: goto L_0x008d;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0522
        L_0x0055:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x03d0
        L_0x005d:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = W(r13, r8)
            goto L_0x03ef
        L_0x006d:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x0402
        L_0x007d:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = W(r13, r8)
            goto L_0x0415
        L_0x008d:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x0428
        L_0x009d:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x043b
        L_0x00ad:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x044e
        L_0x00bd:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0459
        L_0x00c5:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x046e
        L_0x00cd:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0485
        L_0x00d5:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            boolean r6 = S(r13, r8)
            goto L_0x04a0
        L_0x00e5:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x04b3
        L_0x00f5:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = W(r13, r8)
            goto L_0x04c5
        L_0x0105:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = V(r13, r8)
            goto L_0x04d7
        L_0x0115:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = W(r13, r8)
            goto L_0x04e9
        L_0x0125:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = W(r13, r8)
            goto L_0x04fb
        L_0x0135:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            float r6 = U(r13, r8)
            goto L_0x050d
        L_0x0145:
            boolean r8 = r12.E(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            double r8 = T(r13, r8)
            goto L_0x051f
        L_0x0155:
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            r12.m0(r14, r7, r6, r5)
            goto L_0x0522
        L_0x0162:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g1 r8 = r12.s(r5)
            androidx.datastore.preferences.protobuf.i1.U(r7, r6, r14, r8)
            goto L_0x0522
        L_0x0179:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.b0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x018c:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.a0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x019f:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Z(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01b2:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Y(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01c5:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Q(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01d8:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.d0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01eb:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.N(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01fe:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.R(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0211:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.S(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0224:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.V(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0237:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.e0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x024a:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.W(r7, r6, r14, r9)
            goto L_0x0522
        L_0x025d:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.T(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0270:
            int r7 = r12.Q(r5)
            long r10 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.P(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0283:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.b0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0296:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.a0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02a9:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Z(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02bc:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Y(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02cf:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.Q(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02e2:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.d0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02f5:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.O(r7, r6, r14)
            goto L_0x0522
        L_0x0308:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g1 r8 = r12.s(r5)
            androidx.datastore.preferences.protobuf.i1.X(r7, r6, r14, r8)
            goto L_0x0522
        L_0x031f:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.c0(r7, r6, r14)
            goto L_0x0522
        L_0x0332:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.N(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0345:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.R(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0358:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.S(r7, r6, r14, r4)
            goto L_0x0522
        L_0x036b:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.V(r7, r6, r14, r4)
            goto L_0x0522
        L_0x037e:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.e0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0391:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.W(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03a4:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.T(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03b7:
            int r7 = r12.Q(r5)
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.i1.P(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03ca:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x03d0:
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            androidx.datastore.preferences.protobuf.g1 r8 = r12.s(r5)
            r14.O(r7, r6, r8)
            goto L_0x0522
        L_0x03e1:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = H(r13, r8)
        L_0x03ef:
            r14.z(r7, r8)
            goto L_0x0522
        L_0x03f4:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x0402:
            r14.M(r7, r6)
            goto L_0x0522
        L_0x0407:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = H(r13, r8)
        L_0x0415:
            r14.o(r7, r8)
            goto L_0x0522
        L_0x041a:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x0428:
            r14.g(r7, r6)
            goto L_0x0522
        L_0x042d:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x043b:
            r14.H(r7, r6)
            goto L_0x0522
        L_0x0440:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x044e:
            r14.e(r7, r6)
            goto L_0x0522
        L_0x0453:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0459:
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            androidx.datastore.preferences.protobuf.h r6 = (androidx.datastore.preferences.protobuf.h) r6
            r14.l(r7, r6)
            goto L_0x0522
        L_0x0468:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x046e:
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            androidx.datastore.preferences.protobuf.g1 r8 = r12.s(r5)
            r14.s(r7, r6, r8)
            goto L_0x0522
        L_0x047f:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0485:
            long r8 = R(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r13, r8)
            r12.n0(r7, r6, r14)
            goto L_0x0522
        L_0x0492:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            boolean r6 = k(r13, r8)
        L_0x04a0:
            r14.d(r7, r6)
            goto L_0x0522
        L_0x04a5:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x04b3:
            r14.m(r7, r6)
            goto L_0x0522
        L_0x04b7:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = H(r13, r8)
        L_0x04c5:
            r14.w(r7, r8)
            goto L_0x0522
        L_0x04c9:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            int r6 = w(r13, r8)
        L_0x04d7:
            r14.i(r7, r6)
            goto L_0x0522
        L_0x04db:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = H(r13, r8)
        L_0x04e9:
            r14.G(r7, r8)
            goto L_0x0522
        L_0x04ed:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            long r8 = H(r13, r8)
        L_0x04fb:
            r14.c(r7, r8)
            goto L_0x0522
        L_0x04ff:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            float r6 = p(r13, r8)
        L_0x050d:
            r14.A(r7, r6)
            goto L_0x0522
        L_0x0511:
            boolean r8 = r12.y(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = R(r6)
            double r8 = l(r13, r8)
        L_0x051f:
            r14.n(r7, r8)
        L_0x0522:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0526:
            if (r2 == 0) goto L_0x053c
            androidx.datastore.preferences.protobuf.q<?> r3 = r12.f2112p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x053a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0526
        L_0x053a:
            r2 = r1
            goto L_0x0526
        L_0x053c:
            androidx.datastore.preferences.protobuf.n1<?, ?> r0 = r12.f2111o
            r12.o0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.k0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    private static <T> double l(T t9, long j10) {
        return r1.v(t9, j10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d6, code lost:
        r12.O(r5, androidx.datastore.preferences.protobuf.r1.A(r11, R(r4)), s(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f5, code lost:
        r12.z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        r12.M(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r12.o(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042e, code lost:
        r12.g(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0441, code lost:
        r12.H(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0454, code lost:
        r12.e(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        r12.l(r5, (androidx.datastore.preferences.protobuf.h) androidx.datastore.preferences.protobuf.r1.A(r11, R(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0474, code lost:
        r12.s(r5, androidx.datastore.preferences.protobuf.r1.A(r11, R(r4)), s(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        n0(r5, androidx.datastore.preferences.protobuf.r1.A(r11, R(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a6, code lost:
        r12.d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b9, code lost:
        r12.m(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r12.w(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04dd, code lost:
        r12.i(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        r12.G(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0501, code lost:
        r12.c(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r12.A(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0525, code lost:
        r12.n(r5, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l0(T r11, androidx.datastore.preferences.protobuf.u1 r12) {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.n1<?, ?> r0 = r10.f2111o
            r10.o0(r0, r11, r12)
            boolean r0 = r10.f2102f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.q<?> r0 = r10.f2112p
            androidx.datastore.preferences.protobuf.u r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f2097a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x052c
            int r4 = r10.i0(r3)
            int r5 = r10.Q(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.q<?> r6 = r10.f2112p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.q<?> r6 = r10.f2112p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = h0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cf;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04ab;
                case 7: goto L_0x0498;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x0459;
                case 11: goto L_0x0446;
                case 12: goto L_0x0433;
                case 13: goto L_0x0420;
                case 14: goto L_0x040d;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03bd;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0397;
                case 21: goto L_0x0384;
                case 22: goto L_0x0371;
                case 23: goto L_0x035e;
                case 24: goto L_0x034b;
                case 25: goto L_0x0338;
                case 26: goto L_0x0325;
                case 27: goto L_0x030e;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02e8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02af;
                case 33: goto L_0x029c;
                case 34: goto L_0x0289;
                case 35: goto L_0x0276;
                case 36: goto L_0x0263;
                case 37: goto L_0x0250;
                case 38: goto L_0x023d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0217;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b8;
                case 46: goto L_0x01a5;
                case 47: goto L_0x0192;
                case 48: goto L_0x017f;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014b;
                case 52: goto L_0x013b;
                case 53: goto L_0x012b;
                case 54: goto L_0x011b;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00db;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00cb;
                case 61: goto L_0x00c3;
                case 62: goto L_0x00b3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x0093;
                case 65: goto L_0x0083;
                case 66: goto L_0x0073;
                case 67: goto L_0x0063;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0528
        L_0x005b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x03d6
        L_0x0063:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = W(r11, r6)
            goto L_0x03f5
        L_0x0073:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x0408
        L_0x0083:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = W(r11, r6)
            goto L_0x041b
        L_0x0093:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x042e
        L_0x00a3:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x0441
        L_0x00b3:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x0454
        L_0x00c3:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x045f
        L_0x00cb:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x0474
        L_0x00d3:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x048b
        L_0x00db:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            boolean r4 = S(r11, r6)
            goto L_0x04a6
        L_0x00eb:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x04b9
        L_0x00fb:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = W(r11, r6)
            goto L_0x04cb
        L_0x010b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = V(r11, r6)
            goto L_0x04dd
        L_0x011b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = W(r11, r6)
            goto L_0x04ef
        L_0x012b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = W(r11, r6)
            goto L_0x0501
        L_0x013b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            float r4 = U(r11, r6)
            goto L_0x0513
        L_0x014b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            double r6 = T(r11, r6)
            goto L_0x0525
        L_0x015b:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            r10.m0(r12, r5, r4, r3)
            goto L_0x0528
        L_0x0168:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g1 r6 = r10.s(r3)
            androidx.datastore.preferences.protobuf.i1.U(r5, r4, r12, r6)
            goto L_0x0528
        L_0x017f:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.b0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0192:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.a0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01a5:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Z(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01b8:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Y(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01cb:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Q(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01de:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.d0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01f1:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.N(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0204:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.R(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0217:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.S(r5, r4, r12, r7)
            goto L_0x0528
        L_0x022a:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.V(r5, r4, r12, r7)
            goto L_0x0528
        L_0x023d:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.e0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0250:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.W(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0263:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.T(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0276:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.P(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0289:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.b0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x029c:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.a0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02af:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Z(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02c2:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Y(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02d5:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.Q(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02e8:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.d0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02fb:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.O(r5, r4, r12)
            goto L_0x0528
        L_0x030e:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.g1 r6 = r10.s(r3)
            androidx.datastore.preferences.protobuf.i1.X(r5, r4, r12, r6)
            goto L_0x0528
        L_0x0325:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.c0(r5, r4, r12)
            goto L_0x0528
        L_0x0338:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.N(r5, r4, r12, r8)
            goto L_0x0528
        L_0x034b:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.R(r5, r4, r12, r8)
            goto L_0x0528
        L_0x035e:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.S(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0371:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.V(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0384:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.e0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0397:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.W(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03aa:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.T(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03bd:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.i1.P(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03d0:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x03d6:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            androidx.datastore.preferences.protobuf.g1 r6 = r10.s(r3)
            r12.O(r5, r4, r6)
            goto L_0x0528
        L_0x03e7:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = H(r11, r6)
        L_0x03f5:
            r12.z(r5, r6)
            goto L_0x0528
        L_0x03fa:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x0408:
            r12.M(r5, r4)
            goto L_0x0528
        L_0x040d:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = H(r11, r6)
        L_0x041b:
            r12.o(r5, r6)
            goto L_0x0528
        L_0x0420:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x042e:
            r12.g(r5, r4)
            goto L_0x0528
        L_0x0433:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x0441:
            r12.H(r5, r4)
            goto L_0x0528
        L_0x0446:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x0454:
            r12.e(r5, r4)
            goto L_0x0528
        L_0x0459:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x045f:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            androidx.datastore.preferences.protobuf.h r4 = (androidx.datastore.preferences.protobuf.h) r4
            r12.l(r5, r4)
            goto L_0x0528
        L_0x046e:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x0474:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            androidx.datastore.preferences.protobuf.g1 r6 = r10.s(r3)
            r12.s(r5, r4, r6)
            goto L_0x0528
        L_0x0485:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x048b:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r1.A(r11, r6)
            r10.n0(r5, r4, r12)
            goto L_0x0528
        L_0x0498:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            boolean r4 = k(r11, r6)
        L_0x04a6:
            r12.d(r5, r4)
            goto L_0x0528
        L_0x04ab:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x04b9:
            r12.m(r5, r4)
            goto L_0x0528
        L_0x04bd:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = H(r11, r6)
        L_0x04cb:
            r12.w(r5, r6)
            goto L_0x0528
        L_0x04cf:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            int r4 = w(r11, r6)
        L_0x04dd:
            r12.i(r5, r4)
            goto L_0x0528
        L_0x04e1:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = H(r11, r6)
        L_0x04ef:
            r12.G(r5, r6)
            goto L_0x0528
        L_0x04f3:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            long r6 = H(r11, r6)
        L_0x0501:
            r12.c(r5, r6)
            goto L_0x0528
        L_0x0505:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            float r4 = p(r11, r6)
        L_0x0513:
            r12.A(r5, r4)
            goto L_0x0528
        L_0x0517:
            boolean r6 = r10.y(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = R(r4)
            double r6 = l(r11, r6)
        L_0x0525:
            r12.n(r5, r6)
        L_0x0528:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x052c:
            if (r2 == 0) goto L_0x0543
            androidx.datastore.preferences.protobuf.q<?> r11 = r10.f2112p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0541
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x052c
        L_0x0541:
            r2 = r1
            goto L_0x052c
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.l0(java.lang.Object, androidx.datastore.preferences.protobuf.u1):void");
    }

    private boolean m(T t9, T t10, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                return j(t9, t10, i10) && Double.doubleToLongBits(r1.v(t9, R)) == Double.doubleToLongBits(r1.v(t10, R));
            case 1:
                return j(t9, t10, i10) && Float.floatToIntBits(r1.w(t9, R)) == Float.floatToIntBits(r1.w(t10, R));
            case 2:
                return j(t9, t10, i10) && r1.y(t9, R) == r1.y(t10, R);
            case 3:
                return j(t9, t10, i10) && r1.y(t9, R) == r1.y(t10, R);
            case 4:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 5:
                return j(t9, t10, i10) && r1.y(t9, R) == r1.y(t10, R);
            case 6:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 7:
                return j(t9, t10, i10) && r1.p(t9, R) == r1.p(t10, R);
            case 8:
                return j(t9, t10, i10) && i1.K(r1.A(t9, R), r1.A(t10, R));
            case 9:
                return j(t9, t10, i10) && i1.K(r1.A(t9, R), r1.A(t10, R));
            case 10:
                return j(t9, t10, i10) && i1.K(r1.A(t9, R), r1.A(t10, R));
            case 11:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 12:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 13:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 14:
                return j(t9, t10, i10) && r1.y(t9, R) == r1.y(t10, R);
            case 15:
                return j(t9, t10, i10) && r1.x(t9, R) == r1.x(t10, R);
            case 16:
                return j(t9, t10, i10) && r1.y(t9, R) == r1.y(t10, R);
            case 17:
                return j(t9, t10, i10) && i1.K(r1.A(t9, R), r1.A(t10, R));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case j.f8662o3 /*23*/:
            case j.f8667p3 /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.f8692u3 /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return i1.K(r1.A(t9, R), r1.A(t10, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t9, t10, i10) && i1.K(r1.A(t9, R), r1.A(t10, R));
            default:
                return true;
        }
    }

    private <K, V> void m0(u1 u1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            u1Var.L(i10, this.f2113q.f(r(i11)), this.f2113q.g(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub, n1<UT, UB> n1Var) {
        a0.e q9;
        int Q = Q(i10);
        Object A = r1.A(obj, R(i0(i10)));
        if (A == null || (q9 = q(i10)) == null) {
            return ub;
        }
        return o(i10, Q, this.f2113q.h(A), q9, ub, n1Var);
    }

    private void n0(int i10, Object obj, u1 u1Var) {
        if (obj instanceof String) {
            u1Var.E(i10, (String) obj);
        } else {
            u1Var.l(i10, (h) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub, n1<UT, UB> n1Var) {
        k0.a<?, ?> f10 = this.f2113q.f(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n1Var.n();
                }
                h.C0039h B = h.B(k0.b(f10, next.getKey(), next.getValue()));
                try {
                    k0.e(B.b(), f10, next.getKey(), next.getValue());
                    n1Var.d(ub, i11, B.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private <UT, UB> void o0(n1<UT, UB> n1Var, T t9, u1 u1Var) {
        n1Var.t(n1Var.g(t9), u1Var);
    }

    private static <T> float p(T t9, long j10) {
        return r1.w(t9, j10);
    }

    private a0.e q(int i10) {
        return (a0.e) this.f2098b[((i10 / 3) * 2) + 1];
    }

    private Object r(int i10) {
        return this.f2098b[(i10 / 3) * 2];
    }

    private g1 s(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.f2098b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1 d10 = c1.a().d((Class) this.f2098b[i11 + 1]);
        this.f2098b[i11] = d10;
        return d10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e0, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f2, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0203, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0214, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0225, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0236, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0247, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0258, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025a, code lost:
        r2.putInt(r1, (long) r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025e, code lost:
        r4 = (androidx.datastore.preferences.protobuf.k.V(r9) + androidx.datastore.preferences.protobuf.k.X(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030f, code lost:
        if ((r7 & r14) != 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0311, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.s(r9, (androidx.datastore.preferences.protobuf.r0) r2.getObject(r1, r12), s(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0328, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.R(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0335, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.P(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033c, code lost:
        if ((r7 & r14) != 0) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033e, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.N(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0345, code lost:
        if ((r7 & r14) != 0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0347, code lost:
        r4 = androidx.datastore.preferences.protobuf.k.L(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034c, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0356, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.k(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0363, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.W(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036a, code lost:
        if ((r7 & r14) != 0) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036c, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.g(r9, (androidx.datastore.preferences.protobuf.h) r2.getObject(r1, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0379, code lost:
        if ((r7 & r14) != 0) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x037b, code lost:
        r3 = androidx.datastore.preferences.protobuf.i1.o(r9, r2.getObject(r1, r12), s(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a6, code lost:
        if ((r7 & r14) != 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a8, code lost:
        r3 = androidx.datastore.preferences.protobuf.k.d(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0403, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (E(r1, r9, r5) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (E(r1, r9, r5) != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (E(r1, r9, r5) != false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (E(r1, r9, r5) != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b9, code lost:
        if (E(r1, r9, r5) != false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (E(r1, r9, r5) != false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0174, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0186, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0198, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01aa, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bc, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ce, code lost:
        if (r0.f2105i != false) goto L_0x025a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int t(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f2096s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f2097a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0409
            int r8 = r0.i0(r5)
            int r9 = r0.Q(r5)
            int r10 = h0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f2097a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f2105i
            if (r11 == 0) goto L_0x0055
            androidx.datastore.preferences.protobuf.v r11 = androidx.datastore.preferences.protobuf.v.DOUBLE_LIST_PACKED
            int r11 = r11.id()
            if (r10 < r11) goto L_0x0055
            androidx.datastore.preferences.protobuf.v r11 = androidx.datastore.preferences.protobuf.v.SINT64_LIST_PACKED
            int r11 = r11.id()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f2097a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = R(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x03f7;
                case 1: goto L_0x03ed;
                case 2: goto L_0x03df;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03c3;
                case 5: goto L_0x03b9;
                case 6: goto L_0x03af;
                case 7: goto L_0x03a4;
                case 8: goto L_0x0388;
                case 9: goto L_0x0377;
                case 10: goto L_0x0368;
                case 11: goto L_0x035b;
                case 12: goto L_0x034e;
                case 13: goto L_0x0343;
                case 14: goto L_0x033a;
                case 15: goto L_0x032d;
                case 16: goto L_0x0320;
                case 17: goto L_0x030d;
                case 18: goto L_0x02fe;
                case 19: goto L_0x02f2;
                case 20: goto L_0x02e6;
                case 21: goto L_0x02da;
                case 22: goto L_0x02ce;
                case 23: goto L_0x02fe;
                case 24: goto L_0x02f2;
                case 25: goto L_0x02c2;
                case 26: goto L_0x02b7;
                case 27: goto L_0x02a8;
                case 28: goto L_0x029d;
                case 29: goto L_0x0291;
                case 30: goto L_0x0284;
                case 31: goto L_0x02f2;
                case 32: goto L_0x02fe;
                case 33: goto L_0x0277;
                case 34: goto L_0x026a;
                case 35: goto L_0x024a;
                case 36: goto L_0x0239;
                case 37: goto L_0x0228;
                case 38: goto L_0x0217;
                case 39: goto L_0x0206;
                case 40: goto L_0x01f5;
                case 41: goto L_0x01e4;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c0;
                case 44: goto L_0x01ae;
                case 45: goto L_0x019c;
                case 46: goto L_0x018a;
                case 47: goto L_0x0178;
                case 48: goto L_0x0166;
                case 49: goto L_0x0156;
                case 50: goto L_0x0146;
                case 51: goto L_0x0138;
                case 52: goto L_0x012c;
                case 53: goto L_0x011c;
                case 54: goto L_0x010c;
                case 55: goto L_0x00fc;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e3;
                case 58: goto L_0x00db;
                case 59: goto L_0x00bd;
                case 60: goto L_0x00b5;
                case 61: goto L_0x00ad;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0095;
                case 64: goto L_0x008d;
                case 65: goto L_0x0085;
                case 66: goto L_0x0079;
                case 67: goto L_0x006d;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x030a
        L_0x0065:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0311
        L_0x006d:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = W(r1, r12)
            goto L_0x0328
        L_0x0079:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = V(r1, r12)
            goto L_0x0335
        L_0x0085:
            boolean r8 = r0.E(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            goto L_0x033e
        L_0x008d:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0347
        L_0x0095:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = V(r1, r12)
            goto L_0x0356
        L_0x00a1:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = V(r1, r12)
            goto L_0x0363
        L_0x00ad:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x036c
        L_0x00b5:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x037b
        L_0x00bd:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.h
            if (r4 == 0) goto L_0x00d3
            androidx.datastore.preferences.protobuf.h r3 = (androidx.datastore.preferences.protobuf.h) r3
            int r3 = androidx.datastore.preferences.protobuf.k.g(r9, r3)
            goto L_0x0309
        L_0x00d3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.k.T(r9, r3)
            goto L_0x0309
        L_0x00db:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x03a8
        L_0x00e3:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.k.m(r9, r3)
            goto L_0x034c
        L_0x00f0:
            boolean r8 = r0.E(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            int r3 = androidx.datastore.preferences.protobuf.k.o(r9, r3)
            goto L_0x0309
        L_0x00fc:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = V(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.v(r9, r3)
            goto L_0x0309
        L_0x010c:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = W(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.Y(r9, r3)
            goto L_0x0309
        L_0x011c:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = W(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.x(r9, r3)
            goto L_0x0309
        L_0x012c:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = androidx.datastore.preferences.protobuf.k.q(r9, r8)
            goto L_0x0309
        L_0x0138:
            boolean r3 = r0.E(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.k.i(r9, r3)
            goto L_0x0309
        L_0x0146:
            androidx.datastore.preferences.protobuf.m0 r3 = r0.f2113q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.r(r5)
            int r3 = r3.c(r9, r4, r8)
            goto L_0x0309
        L_0x0156:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.g1 r4 = r0.s(r5)
            int r3 = androidx.datastore.preferences.protobuf.i1.j(r9, r3, r4)
            goto L_0x0309
        L_0x0166:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.t(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0178:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.r(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x018a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x019c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01ae:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.e(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.w(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01d2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.b(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0206:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.l(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0217:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.y(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.n(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0239:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x024a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.f2105i
            if (r4 == 0) goto L_0x025e
        L_0x025a:
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x025e:
            int r4 = androidx.datastore.preferences.protobuf.k.V(r9)
            int r8 = androidx.datastore.preferences.protobuf.k.X(r3)
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x034c
        L_0x026a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.i1.s(r9, r3, r4)
            goto L_0x0309
        L_0x0277:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.q(r9, r3, r4)
            goto L_0x0309
        L_0x0284:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.d(r9, r3, r4)
            goto L_0x0309
        L_0x0291:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.v(r9, r3, r4)
            goto L_0x0309
        L_0x029d:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.c(r9, r3)
            goto L_0x0309
        L_0x02a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.g1 r4 = r0.s(r5)
            int r3 = androidx.datastore.preferences.protobuf.i1.p(r9, r3, r4)
            goto L_0x0309
        L_0x02b7:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.u(r9, r3)
            goto L_0x0309
        L_0x02c2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.i1.a(r9, r3, r4)
            goto L_0x0309
        L_0x02ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.k(r9, r3, r4)
            goto L_0x0309
        L_0x02da:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.x(r9, r3, r4)
            goto L_0x0309
        L_0x02e6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.m(r9, r3, r4)
            goto L_0x0309
        L_0x02f2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.f(r9, r3, r4)
            goto L_0x0309
        L_0x02fe:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.i1.h(r9, r3, r4)
        L_0x0309:
            int r6 = r6 + r3
        L_0x030a:
            r10 = 0
            goto L_0x0403
        L_0x030d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.r0 r3 = (androidx.datastore.preferences.protobuf.r0) r3
            androidx.datastore.preferences.protobuf.g1 r4 = r0.s(r5)
            int r3 = androidx.datastore.preferences.protobuf.k.s(r9, r3, r4)
            goto L_0x0309
        L_0x0320:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            long r3 = r2.getLong(r1, r12)
        L_0x0328:
            int r3 = androidx.datastore.preferences.protobuf.k.R(r9, r3)
            goto L_0x0309
        L_0x032d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0335:
            int r3 = androidx.datastore.preferences.protobuf.k.P(r9, r3)
            goto L_0x0309
        L_0x033a:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x030a
        L_0x033e:
            int r3 = androidx.datastore.preferences.protobuf.k.N(r9, r3)
            goto L_0x0309
        L_0x0343:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0347:
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.k.L(r9, r3)
        L_0x034c:
            int r6 = r6 + r4
            goto L_0x030a
        L_0x034e:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0356:
            int r3 = androidx.datastore.preferences.protobuf.k.k(r9, r3)
            goto L_0x0309
        L_0x035b:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0363:
            int r3 = androidx.datastore.preferences.protobuf.k.W(r9, r3)
            goto L_0x0309
        L_0x0368:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x036c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.h r3 = (androidx.datastore.preferences.protobuf.h) r3
            int r3 = androidx.datastore.preferences.protobuf.k.g(r9, r3)
            goto L_0x0309
        L_0x0377:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x037b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.g1 r4 = r0.s(r5)
            int r3 = androidx.datastore.preferences.protobuf.i1.o(r9, r3, r4)
            goto L_0x0309
        L_0x0388:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.h
            if (r4 == 0) goto L_0x039c
            androidx.datastore.preferences.protobuf.h r3 = (androidx.datastore.preferences.protobuf.h) r3
            int r3 = androidx.datastore.preferences.protobuf.k.g(r9, r3)
            goto L_0x0309
        L_0x039c:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.k.T(r9, r3)
            goto L_0x0309
        L_0x03a4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x03a8:
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.k.d(r9, r3)
            goto L_0x0309
        L_0x03af:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            r10 = 0
            int r3 = androidx.datastore.preferences.protobuf.k.m(r9, r10)
            goto L_0x0402
        L_0x03b9:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0403
            int r3 = androidx.datastore.preferences.protobuf.k.o(r9, r3)
            goto L_0x0402
        L_0x03c3:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.v(r9, r3)
            goto L_0x0402
        L_0x03d1:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.Y(r9, r3)
            goto L_0x0402
        L_0x03df:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.k.x(r9, r3)
            goto L_0x0402
        L_0x03ed:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = androidx.datastore.preferences.protobuf.k.q(r9, r8)
            goto L_0x0402
        L_0x03f7:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.k.i(r9, r3)
        L_0x0402:
            int r6 = r6 + r3
        L_0x0403:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x0409:
            androidx.datastore.preferences.protobuf.n1<?, ?> r2 = r0.f2111o
            int r2 = r0.v(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f2102f
            if (r2 == 0) goto L_0x041f
            androidx.datastore.preferences.protobuf.q<?> r2 = r0.f2112p
            androidx.datastore.preferences.protobuf.u r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x041f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.t(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ec, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0210, code lost:
        r2.putInt(r1, (long) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        r6 = (androidx.datastore.preferences.protobuf.k.V(r8) + androidx.datastore.preferences.protobuf.k.X(r7)) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0299, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.s(r8, (androidx.datastore.preferences.protobuf.r0) androidx.datastore.preferences.protobuf.r1.A(r1, r9), s(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bb, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.R(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ca, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.P(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d5, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.N(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e0, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.L(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ef, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.k(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fe, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.W(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0309, code lost:
        r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030d, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.g(r8, (androidx.datastore.preferences.protobuf.h) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031a, code lost:
        r6 = androidx.datastore.preferences.protobuf.i1.o(r8, androidx.datastore.preferences.protobuf.r1.A(r1, r9), s(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        if ((r6 instanceof androidx.datastore.preferences.protobuf.h) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x033e, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.d(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034a, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.m(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0356, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.o(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0366, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.v(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0376, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.Y(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0386, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.x(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0392, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.q(r8, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x039e, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.i(r8, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a6, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if ((r6 instanceof androidx.datastore.preferences.protobuf.h) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r6 = androidx.datastore.preferences.protobuf.k.T(r8, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0184, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b9, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        if (r0.f2105i != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int u(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f2096s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f2097a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x03aa
            int r6 = r15.i0(r4)
            int r7 = h0(r6)
            int r8 = r15.Q(r4)
            long r9 = R(r6)
            androidx.datastore.preferences.protobuf.v r6 = androidx.datastore.preferences.protobuf.v.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r7 < r6) goto L_0x0038
            androidx.datastore.preferences.protobuf.v r6 = androidx.datastore.preferences.protobuf.v.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f2097a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0398;
                case 1: goto L_0x038c;
                case 2: goto L_0x037c;
                case 3: goto L_0x036c;
                case 4: goto L_0x035c;
                case 5: goto L_0x0350;
                case 6: goto L_0x0344;
                case 7: goto L_0x0338;
                case 8: goto L_0x0328;
                case 9: goto L_0x0314;
                case 10: goto L_0x0303;
                case 11: goto L_0x02f4;
                case 12: goto L_0x02e5;
                case 13: goto L_0x02da;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02b1;
                case 17: goto L_0x029c;
                case 18: goto L_0x0291;
                case 19: goto L_0x0288;
                case 20: goto L_0x027f;
                case 21: goto L_0x0276;
                case 22: goto L_0x026d;
                case 23: goto L_0x0291;
                case 24: goto L_0x0288;
                case 25: goto L_0x0264;
                case 26: goto L_0x025b;
                case 27: goto L_0x024e;
                case 28: goto L_0x0245;
                case 29: goto L_0x023c;
                case 30: goto L_0x0233;
                case 31: goto L_0x0288;
                case 32: goto L_0x0291;
                case 33: goto L_0x022a;
                case 34: goto L_0x0220;
                case 35: goto L_0x0200;
                case 36: goto L_0x01ef;
                case 37: goto L_0x01de;
                case 38: goto L_0x01cd;
                case 39: goto L_0x01bc;
                case 40: goto L_0x01ab;
                case 41: goto L_0x019a;
                case 42: goto L_0x0188;
                case 43: goto L_0x0176;
                case 44: goto L_0x0164;
                case 45: goto L_0x0152;
                case 46: goto L_0x0140;
                case 47: goto L_0x012e;
                case 48: goto L_0x011c;
                case 49: goto L_0x010e;
                case 50: goto L_0x00fe;
                case 51: goto L_0x00f6;
                case 52: goto L_0x00ee;
                case 53: goto L_0x00e2;
                case 54: goto L_0x00d6;
                case 55: goto L_0x00ca;
                case 56: goto L_0x00c2;
                case 57: goto L_0x00ba;
                case 58: goto L_0x00b2;
                case 59: goto L_0x009a;
                case 60: goto L_0x0092;
                case 61: goto L_0x008a;
                case 62: goto L_0x007e;
                case 63: goto L_0x0072;
                case 64: goto L_0x006a;
                case 65: goto L_0x0062;
                case 66: goto L_0x0056;
                case 67: goto L_0x004a;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03a6
        L_0x0042:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02a2
        L_0x004a:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = W(r1, r9)
            goto L_0x02bb
        L_0x0056:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = V(r1, r9)
            goto L_0x02ca
        L_0x0062:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02d5
        L_0x006a:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02e0
        L_0x0072:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = V(r1, r9)
            goto L_0x02ef
        L_0x007e:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = V(r1, r9)
            goto L_0x02fe
        L_0x008a:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0309
        L_0x0092:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x031a
        L_0x009a:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.h
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            goto L_0x030d
        L_0x00aa:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.k.T(r8, r6)
            goto L_0x0299
        L_0x00b2:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x033e
        L_0x00ba:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x034a
        L_0x00c2:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0356
        L_0x00ca:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = V(r1, r9)
            goto L_0x0366
        L_0x00d6:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = W(r1, r9)
            goto L_0x0376
        L_0x00e2:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = W(r1, r9)
            goto L_0x0386
        L_0x00ee:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0392
        L_0x00f6:
            boolean r6 = r15.E(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x039e
        L_0x00fe:
            androidx.datastore.preferences.protobuf.m0 r6 = r0.f2113q
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
            java.lang.Object r9 = r15.r(r4)
            int r6 = r6.c(r8, r7, r9)
            goto L_0x0299
        L_0x010e:
            java.util.List r6 = G(r1, r9)
            androidx.datastore.preferences.protobuf.g1 r7 = r15.s(r4)
            int r6 = androidx.datastore.preferences.protobuf.i1.j(r8, r6, r7)
            goto L_0x0299
        L_0x011c:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.t(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x012e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.r(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0140:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0152:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0164:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.e(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0176:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.w(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0188:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.b(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x019a:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ab:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.l(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01cd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.y(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01de:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.n(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ef:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0200:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.i1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f2105i
            if (r9 == 0) goto L_0x0214
        L_0x0210:
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0214:
            int r6 = androidx.datastore.preferences.protobuf.k.V(r8)
            int r8 = androidx.datastore.preferences.protobuf.k.X(r7)
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0299
        L_0x0220:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.s(r8, r6, r3)
            goto L_0x0299
        L_0x022a:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.q(r8, r6, r3)
            goto L_0x0299
        L_0x0233:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.d(r8, r6, r3)
            goto L_0x0299
        L_0x023c:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.v(r8, r6, r3)
            goto L_0x0299
        L_0x0245:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.c(r8, r6)
            goto L_0x0299
        L_0x024e:
            java.util.List r6 = G(r1, r9)
            androidx.datastore.preferences.protobuf.g1 r7 = r15.s(r4)
            int r6 = androidx.datastore.preferences.protobuf.i1.p(r8, r6, r7)
            goto L_0x0299
        L_0x025b:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.u(r8, r6)
            goto L_0x0299
        L_0x0264:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.a(r8, r6, r3)
            goto L_0x0299
        L_0x026d:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.k(r8, r6, r3)
            goto L_0x0299
        L_0x0276:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.x(r8, r6, r3)
            goto L_0x0299
        L_0x027f:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.m(r8, r6, r3)
            goto L_0x0299
        L_0x0288:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.f(r8, r6, r3)
            goto L_0x0299
        L_0x0291:
            java.util.List r6 = G(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.i1.h(r8, r6, r3)
        L_0x0299:
            int r5 = r5 + r6
            goto L_0x03a6
        L_0x029c:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02a2:
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
            androidx.datastore.preferences.protobuf.r0 r6 = (androidx.datastore.preferences.protobuf.r0) r6
            androidx.datastore.preferences.protobuf.g1 r7 = r15.s(r4)
            int r6 = androidx.datastore.preferences.protobuf.k.s(r8, r6, r7)
            goto L_0x0299
        L_0x02b1:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = androidx.datastore.preferences.protobuf.r1.y(r1, r9)
        L_0x02bb:
            int r6 = androidx.datastore.preferences.protobuf.k.R(r8, r6)
            goto L_0x0299
        L_0x02c0:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = androidx.datastore.preferences.protobuf.r1.x(r1, r9)
        L_0x02ca:
            int r6 = androidx.datastore.preferences.protobuf.k.P(r8, r6)
            goto L_0x0299
        L_0x02cf:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02d5:
            int r6 = androidx.datastore.preferences.protobuf.k.N(r8, r13)
            goto L_0x0299
        L_0x02da:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02e0:
            int r6 = androidx.datastore.preferences.protobuf.k.L(r8, r3)
            goto L_0x0299
        L_0x02e5:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = androidx.datastore.preferences.protobuf.r1.x(r1, r9)
        L_0x02ef:
            int r6 = androidx.datastore.preferences.protobuf.k.k(r8, r6)
            goto L_0x0299
        L_0x02f4:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = androidx.datastore.preferences.protobuf.r1.x(r1, r9)
        L_0x02fe:
            int r6 = androidx.datastore.preferences.protobuf.k.W(r8, r6)
            goto L_0x0299
        L_0x0303:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0309:
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
        L_0x030d:
            androidx.datastore.preferences.protobuf.h r6 = (androidx.datastore.preferences.protobuf.h) r6
            int r6 = androidx.datastore.preferences.protobuf.k.g(r8, r6)
            goto L_0x0299
        L_0x0314:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x031a:
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
            androidx.datastore.preferences.protobuf.g1 r7 = r15.s(r4)
            int r6 = androidx.datastore.preferences.protobuf.i1.o(r8, r6, r7)
            goto L_0x0299
        L_0x0328:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.r1.A(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.h
            if (r7 == 0) goto L_0x00aa
            goto L_0x00a8
        L_0x0338:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x033e:
            int r6 = androidx.datastore.preferences.protobuf.k.d(r8, r11)
            goto L_0x0299
        L_0x0344:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x034a:
            int r6 = androidx.datastore.preferences.protobuf.k.m(r8, r3)
            goto L_0x0299
        L_0x0350:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0356:
            int r6 = androidx.datastore.preferences.protobuf.k.o(r8, r13)
            goto L_0x0299
        L_0x035c:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = androidx.datastore.preferences.protobuf.r1.x(r1, r9)
        L_0x0366:
            int r6 = androidx.datastore.preferences.protobuf.k.v(r8, r6)
            goto L_0x0299
        L_0x036c:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = androidx.datastore.preferences.protobuf.r1.y(r1, r9)
        L_0x0376:
            int r6 = androidx.datastore.preferences.protobuf.k.Y(r8, r6)
            goto L_0x0299
        L_0x037c:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = androidx.datastore.preferences.protobuf.r1.y(r1, r9)
        L_0x0386:
            int r6 = androidx.datastore.preferences.protobuf.k.x(r8, r6)
            goto L_0x0299
        L_0x038c:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0392:
            int r6 = androidx.datastore.preferences.protobuf.k.q(r8, r12)
            goto L_0x0299
        L_0x0398:
            boolean r6 = r15.y(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x039e:
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.k.i(r8, r6)
            goto L_0x0299
        L_0x03a6:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x03aa:
            androidx.datastore.preferences.protobuf.n1<?, ?> r2 = r0.f2111o
            int r1 = r15.v(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.u(java.lang.Object):int");
    }

    private <UT, UB> int v(n1<UT, UB> n1Var, T t9) {
        return n1Var.h(n1Var.g(t9));
    }

    private static <T> int w(T t9, long j10) {
        return r1.x(t9, j10);
    }

    private static boolean x(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean y(T t9, int i10) {
        if (this.f2104h) {
            int i02 = i0(i10);
            long R = R(i02);
            switch (h0(i02)) {
                case 0:
                    return r1.v(t9, R) != 0.0d;
                case 1:
                    return r1.w(t9, R) != 0.0f;
                case 2:
                    return r1.y(t9, R) != 0;
                case 3:
                    return r1.y(t9, R) != 0;
                case 4:
                    return r1.x(t9, R) != 0;
                case 5:
                    return r1.y(t9, R) != 0;
                case 6:
                    return r1.x(t9, R) != 0;
                case 7:
                    return r1.p(t9, R);
                case 8:
                    Object A = r1.A(t9, R);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof h) {
                        return !h.f1926n.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return r1.A(t9, R) != null;
                case 10:
                    return !h.f1926n.equals(r1.A(t9, R));
                case 11:
                    return r1.x(t9, R) != 0;
                case 12:
                    return r1.x(t9, R) != 0;
                case 13:
                    return r1.x(t9, R) != 0;
                case 14:
                    return r1.y(t9, R) != 0;
                case 15:
                    return r1.x(t9, R) != 0;
                case 16:
                    return r1.y(t9, R) != 0;
                case 17:
                    return r1.A(t9, R) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int Y = Y(i10);
            return (r1.x(t9, (long) (Y & 1048575)) & (1 << (Y >>> 20))) != 0;
        }
    }

    private boolean z(T t9, int i10, int i11, int i12) {
        return this.f2104h ? y(t9, i10) : (i11 & i12) != 0;
    }

    public void a(T t9, T t10) {
        Objects.requireNonNull(t10);
        for (int i10 = 0; i10 < this.f2097a.length; i10 += 3) {
            M(t9, t10, i10);
        }
        if (!this.f2104h) {
            i1.G(this.f2111o, t9, t10);
            if (this.f2102f) {
                i1.E(this.f2112p, t9, t10);
            }
        }
    }

    public void b(T t9, f1 f1Var, p pVar) {
        Objects.requireNonNull(pVar);
        I(this.f2111o, this.f2112p, t9, f1Var, pVar);
    }

    public void c(T t9, u1 u1Var) {
        if (u1Var.x() == u1.a.DESCENDING) {
            l0(t9, u1Var);
        } else if (this.f2104h) {
            k0(t9, u1Var);
        } else {
            j0(t9, u1Var);
        }
    }

    public void d(T t9) {
        int i10;
        int i11 = this.f2107k;
        while (true) {
            i10 = this.f2108l;
            if (i11 >= i10) {
                break;
            }
            long R = R(i0(this.f2106j[i11]));
            Object A = r1.A(t9, R);
            if (A != null) {
                r1.O(t9, R, this.f2113q.e(A));
            }
            i11++;
        }
        int length = this.f2106j.length;
        while (i10 < length) {
            this.f2110n.c(t9, (long) this.f2106j[i10]);
            i10++;
        }
        this.f2111o.j(t9);
        if (this.f2102f) {
            this.f2112p.f(t9);
        }
    }

    public final boolean e(T t9) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2107k; i13++) {
            int i14 = this.f2106j[i13];
            int Q = Q(i14);
            int i02 = i0(i14);
            if (!this.f2104h) {
                int i15 = this.f2097a[i14 + 2];
                int i16 = 1048575 & i15;
                i10 = 1 << (i15 >>> 20);
                if (i16 != i11) {
                    i12 = f2096s.getInt(t9, (long) i16);
                    i11 = i16;
                }
            } else {
                i10 = 0;
            }
            if (F(i02) && !z(t9, i14, i12, i10)) {
                return false;
            }
            int h02 = h0(i02);
            if (h02 != 9 && h02 != 17) {
                if (h02 != 27) {
                    if (h02 == 60 || h02 == 68) {
                        if (E(t9, Q, i14) && !A(t9, i02, s(i14))) {
                            return false;
                        }
                    } else if (h02 != 49) {
                        if (h02 == 50 && !C(t9, i02, i14)) {
                            return false;
                        }
                    }
                }
                if (!B(t9, i02, i14)) {
                    return false;
                }
            } else if (z(t9, i14, i12, i10) && !A(t9, i02, s(i14))) {
                return false;
            }
        }
        return !this.f2102f || this.f2112p.c(t9).p();
    }

    public boolean f(T t9, T t10) {
        int length = this.f2097a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t9, t10, i10)) {
                return false;
            }
        }
        if (!this.f2111o.g(t9).equals(this.f2111o.g(t10))) {
            return false;
        }
        if (this.f2102f) {
            return this.f2112p.c(t9).equals(this.f2112p.c(t10));
        }
        return true;
    }

    public int g(T t9) {
        return this.f2104h ? u(t9) : t(t9);
    }

    public T h() {
        return this.f2109m.a(this.f2101e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = V(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r2 = r2 * 53;
        r3 = W(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = r2 * 53;
        r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) androidx.datastore.preferences.protobuf.r1.A(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = androidx.datastore.preferences.protobuf.a0.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = androidx.datastore.preferences.protobuf.a0.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int i(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f2097a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.i0(r1)
            int r4 = r8.Q(r1)
            long r5 = R(r3)
            int r3 = h0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00cf;
                case 21: goto L_0x00cf;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00cf;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00cf;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00cf;
                case 30: goto L_0x00cf;
                case 31: goto L_0x00cf;
                case 32: goto L_0x00cf;
                case 33: goto L_0x00cf;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00cf;
                case 36: goto L_0x00cf;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00cf;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00cf;
                case 43: goto L_0x00cf;
                case 44: goto L_0x00cf;
                case 45: goto L_0x00cf;
                case 46: goto L_0x00cf;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00cf;
                case 49: goto L_0x00cf;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00bb;
                case 52: goto L_0x00ae;
                case 53: goto L_0x00a0;
                case 54: goto L_0x0099;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0128
        L_0x001e:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x002d:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0034:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x003c:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0043:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0049:
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00cf
        L_0x0059:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x005f:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d5
        L_0x0067:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00e8
        L_0x006f:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = S(r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x008b:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0091:
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x0127
        L_0x0099:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x00a6:
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            goto L_0x0123
        L_0x00ae:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = U(r9, r5)
            goto L_0x0114
        L_0x00bb:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = T(r9, r5)
            goto L_0x011f
        L_0x00c8:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e0
        L_0x00cf:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5)
        L_0x00d5:
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00da:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5)
            if (r3 == 0) goto L_0x00e4
        L_0x00e0:
            int r7 = r3.hashCode()
        L_0x00e4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00e8:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.r1.p(r9, r5)
        L_0x00fb:
            int r3 = androidx.datastore.preferences.protobuf.a0.c(r3)
            goto L_0x0127
        L_0x0100:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r1.x(r9, r5)
            goto L_0x0127
        L_0x0107:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r1.y(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.r1.w(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0127
        L_0x0119:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.r1.v(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = androidx.datastore.preferences.protobuf.a0.f(r3)
        L_0x0127:
            int r2 = r2 + r3
        L_0x0128:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.n1<?, ?> r0 = r8.f2111o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f2102f
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.q<?> r0 = r8.f2112p
            androidx.datastore.preferences.protobuf.u r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.i(java.lang.Object):int");
    }
}
