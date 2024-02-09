package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class i8<T extends k8<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final i8 f5356d = new i8(true);

    /* renamed from: a  reason: collision with root package name */
    final za<T, Object> f5357a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5358b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5359c;

    private i8() {
        this.f5357a = za.b(16);
    }

    private i8(za<T, Object> zaVar) {
        this.f5357a = zaVar;
        q();
    }

    private i8(boolean z9) {
        this(za.b(0));
        q();
    }

    public static int b(k8<?> k8Var, Object obj) {
        hc a10 = k8Var.a();
        int zza = k8Var.zza();
        if (!k8Var.d()) {
            return c(a10, zza, obj);
        }
        List<Object> list = (List) obj;
        int i10 = 0;
        if (!k8Var.c()) {
            for (Object c10 : list) {
                i10 += c(a10, zza, c10);
            }
            return i10;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            for (Object d10 : list) {
                i10 += d(a10, d10);
            }
            return y7.w0(zza) + i10 + y7.z0(i10);
        }
    }

    static int c(hc hcVar, int i10, Object obj) {
        int w02 = y7.w0(i10);
        if (hcVar == hc.GROUP) {
            r8.g((da) obj);
            w02 <<= 1;
        }
        return w02 + d(hcVar, obj);
    }

    private static int d(hc hcVar, Object obj) {
        switch (h8.f5308b[hcVar.ordinal()]) {
            case 1:
                return y7.c(((Double) obj).doubleValue());
            case 2:
                return y7.d(((Float) obj).floatValue());
            case 3:
                return y7.e0(((Long) obj).longValue());
            case 4:
                return y7.r0(((Long) obj).longValue());
            case 5:
                return y7.k0(((Integer) obj).intValue());
            case 6:
                return y7.W(((Long) obj).longValue());
            case 7:
                return y7.g0(((Integer) obj).intValue());
            case 8:
                return y7.j(((Boolean) obj).booleanValue());
            case 9:
                return y7.F((da) obj);
            case 10:
                return obj instanceof c9 ? y7.h((c9) obj) : y7.X((da) obj);
            case 11:
                return obj instanceof f7 ? y7.E((f7) obj) : y7.G((String) obj);
            case 12:
                return obj instanceof f7 ? y7.E((f7) obj) : y7.k((byte[]) obj);
            case 13:
                return y7.z0(((Integer) obj).intValue());
            case 14:
                return y7.o0(((Integer) obj).intValue());
            case 15:
                return y7.j0(((Long) obj).longValue());
            case 16:
                return y7.s0(((Integer) obj).intValue());
            case 17:
                return y7.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof v8 ? y7.b0(((v8) obj).zza()) : y7.b0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry<T, Object> entry) {
        k8 k8Var = (k8) entry.getKey();
        Object value = entry.getValue();
        if (k8Var.b() != rc.MESSAGE || k8Var.d() || k8Var.c()) {
            return b(k8Var, value);
        }
        boolean z9 = value instanceof c9;
        int zza = ((k8) entry.getKey()).zza();
        return z9 ? y7.g(zza, (c9) value) : y7.A(zza, (da) value);
    }

    private final Object f(T t9) {
        Object obj = this.f5357a.get(t9);
        if (!(obj instanceof c9)) {
            return obj;
        }
        c9 c9Var = (c9) obj;
        return c9.e();
    }

    private static Object g(Object obj) {
        if (obj instanceof la) {
            return ((la) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends k8<T>> i8<T> i() {
        return f5356d;
    }

    private final void j(T t9, Object obj) {
        if (!t9.d()) {
            n(t9, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                n(t9, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof c9) {
            this.f5359c = true;
        }
        this.f5357a.put(t9, obj);
    }

    private final void k(Map.Entry<T, Object> entry) {
        k8 k8Var = (k8) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c9) {
            c9 c9Var = (c9) value;
            value = c9.e();
        }
        if (k8Var.d()) {
            Object f10 = f(k8Var);
            if (f10 == null) {
                f10 = new ArrayList();
            }
            for (Object g10 : (List) value) {
                ((List) f10).add(g(g10));
            }
            this.f5357a.put(k8Var, f10);
        } else if (k8Var.b() == rc.MESSAGE) {
            Object f11 = f(k8Var);
            if (f11 == null) {
                this.f5357a.put(k8Var, g(value));
            } else {
                this.f5357a.put(k8Var, f11 instanceof la ? k8Var.l((la) f11, (la) value) : k8Var.j(((da) f11).b(), (da) value).l());
            }
        } else {
            this.f5357a.put(k8Var, g(value));
        }
    }

    private static boolean l(Object obj) {
        if (obj instanceof fa) {
            return ((fa) obj).e();
        }
        if (obj instanceof c9) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.v8) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r5.zza()), r5.a().zzb(), r6.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.c9) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void n(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.hc r0 = r5.a()
            com.google.android.gms.internal.measurement.r8.e(r6)
            int[] r1 = com.google.android.gms.internal.measurement.h8.f5307a
            com.google.android.gms.internal.measurement.rc r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003f;
                case 4: goto L_0x003c;
                case 5: goto L_0x0039;
                case 6: goto L_0x0036;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = 0
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.da
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.c9
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0023:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.v8
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x002c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.f7
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0018
        L_0x0034:
            r0 = 1
            goto L_0x0047
        L_0x0036:
            boolean r0 = r6 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r6 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r6 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.hc r5 = r5.a()
            com.google.android.gms.internal.measurement.rc r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i8.n(com.google.android.gms.internal.measurement.k8, java.lang.Object):void");
    }

    private static <T extends k8<T>> boolean o(Map.Entry<T, Object> entry) {
        k8 k8Var = (k8) entry.getKey();
        if (k8Var.b() != rc.MESSAGE) {
            return true;
        }
        boolean d10 = k8Var.d();
        Object value = entry.getValue();
        if (!d10) {
            return l(value);
        }
        for (Object l10 : (List) value) {
            if (!l(l10)) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5357a.g(); i11++) {
            i10 += e(this.f5357a.h(i11));
        }
        for (Map.Entry<T, Object> e10 : this.f5357a.j()) {
            i10 += e(e10);
        }
        return i10;
    }

    public final /* synthetic */ Object clone() {
        i8 i8Var = new i8();
        for (int i10 = 0; i10 < this.f5357a.g(); i10++) {
            Map.Entry<T, Object> h10 = this.f5357a.h(i10);
            i8Var.j((k8) h10.getKey(), h10.getValue());
        }
        for (Map.Entry next : this.f5357a.j()) {
            i8Var.j((k8) next.getKey(), next.getValue());
        }
        i8Var.f5359c = this.f5359c;
        return i8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        return this.f5357a.equals(((i8) obj).f5357a);
    }

    public final void h(i8<T> i8Var) {
        for (int i10 = 0; i10 < i8Var.f5357a.g(); i10++) {
            k(i8Var.f5357a.h(i10));
        }
        for (Map.Entry<T, Object> k10 : i8Var.f5357a.j()) {
            k(k10);
        }
    }

    public final int hashCode() {
        return this.f5357a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> m() {
        return this.f5359c ? new h9(this.f5357a.m().iterator()) : this.f5357a.m().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f5359c ? new h9(this.f5357a.entrySet().iterator()) : this.f5357a.entrySet().iterator();
    }

    public final void q() {
        if (!this.f5358b) {
            for (int i10 = 0; i10 < this.f5357a.g(); i10++) {
                Map.Entry<T, Object> h10 = this.f5357a.h(i10);
                if (h10.getValue() instanceof p8) {
                    ((p8) h10.getValue()).G();
                }
            }
            this.f5357a.f();
            this.f5358b = true;
        }
    }

    public final boolean r() {
        return this.f5358b;
    }

    public final boolean s() {
        for (int i10 = 0; i10 < this.f5357a.g(); i10++) {
            if (!o(this.f5357a.h(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> o10 : this.f5357a.j()) {
            if (!o(o10)) {
                return false;
            }
        }
        return true;
    }
}
