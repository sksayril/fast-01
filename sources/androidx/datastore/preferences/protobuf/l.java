package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.u1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class l implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final k f2025a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.t1$b[] r0 = androidx.datastore.preferences.protobuf.t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2026a = r0
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f2026a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l.a.<clinit>():void");
        }
    }

    private l(k kVar) {
        k kVar2 = (k) a0.b(kVar, "output");
        this.f2025a = kVar2;
        kVar2.f2002a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f2002a;
        return lVar != null ? lVar : new l(kVar);
    }

    private <V> void Q(int i10, boolean z9, V v9, k0.a<Boolean, V> aVar) {
        this.f2025a.W0(i10, 2);
        this.f2025a.Y0(k0.b(aVar, Boolean.valueOf(z9), v9));
        k0.e(this.f2025a, aVar, Boolean.valueOf(z9), v9);
    }

    private <V> void R(int i10, k0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i11] = intValue.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v9 = map.get(Integer.valueOf(i13));
            this.f2025a.W0(i10, 2);
            this.f2025a.Y0(k0.b(aVar, Integer.valueOf(i13), v9));
            k0.e(this.f2025a, aVar, Integer.valueOf(i13), v9);
        }
    }

    private <V> void S(int i10, k0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i11] = longValue.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v9 = map.get(Long.valueOf(j10));
            this.f2025a.W0(i10, 2);
            this.f2025a.Y0(k0.b(aVar, Long.valueOf(j10), v9));
            k0.e(this.f2025a, aVar, Long.valueOf(j10), v9);
        }
    }

    private <K, V> void T(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f2026a[aVar.f2016a.ordinal()]) {
            case 1:
                V v9 = map.get(Boolean.FALSE);
                if (v9 != null) {
                    Q(i10, false, v9, aVar);
                }
                V v10 = map.get(Boolean.TRUE);
                if (v10 != null) {
                    Q(i10, true, v10, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2016a);
        }
    }

    private <V> void U(int i10, k0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v9 = map.get(str2);
            this.f2025a.W0(i10, 2);
            this.f2025a.Y0(k0.b(aVar, str2, v9));
            k0.e(this.f2025a, aVar, str2, v9);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f2025a.U0(i10, (String) obj);
        } else {
            this.f2025a.o0(i10, (h) obj);
        }
    }

    public void A(int i10, float f10) {
        this.f2025a.y0(i10, f10);
    }

    public void B(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            while (i11 < list.size()) {
                V(i10, g0Var.u(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.U0(i10, list.get(i11));
            i11++;
        }
    }

    public void C(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            O(i10, list.get(i11), g1Var);
        }
    }

    public void D(int i10) {
        this.f2025a.W0(i10, 4);
    }

    public void E(int i10, String str) {
        this.f2025a.U0(i10, str);
    }

    public void F(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.Q(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.R0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.Q0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void G(int i10, long j10) {
        this.f2025a.Z0(i10, j10);
    }

    public void H(int i10, int i11) {
        this.f2025a.s0(i10, i11);
    }

    public void I(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.y(list.get(i13).longValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.H0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.G0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void J(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.l(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.t0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.s0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void K(int i10, List<Double> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.j(list.get(i13).doubleValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.r0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.q0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public <K, V> void L(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f2025a.e0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f2025a.W0(i10, 2);
            this.f2025a.Y0(k0.b(aVar, next.getKey(), next.getValue()));
            k0.e(this.f2025a, aVar, next.getKey(), next.getValue());
        }
    }

    public void M(int i10, int i11) {
        this.f2025a.Q0(i10, i11);
    }

    public void N(int i10, List<h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f2025a.o0(i10, list.get(i11));
        }
    }

    public void O(int i10, Object obj, g1 g1Var) {
        this.f2025a.B0(i10, (r0) obj, g1Var);
    }

    public void a(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.w(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.F0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.E0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void b(int i10, List<Float> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.r(list.get(i13).floatValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.z0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.y0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public void c(int i10, long j10) {
        this.f2025a.G0(i10, j10);
    }

    public void d(int i10, boolean z9) {
        this.f2025a.k0(i10, z9);
    }

    public void e(int i10, int i11) {
        this.f2025a.X0(i10, i11);
    }

    public final void f(int i10, Object obj) {
        if (obj instanceof h) {
            this.f2025a.L0(i10, (h) obj);
        } else {
            this.f2025a.K0(i10, (r0) obj);
        }
    }

    public void g(int i10, int i11) {
        this.f2025a.M0(i10, i11);
    }

    public void h(int i10) {
        this.f2025a.W0(i10, 3);
    }

    public void i(int i10, int i11) {
        this.f2025a.E0(i10, i11);
    }

    public void j(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.p(list.get(i13).longValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.x0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.w0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void k(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.M(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.N0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.M0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void l(int i10, h hVar) {
        this.f2025a.o0(i10, hVar);
    }

    public void m(int i10, int i11) {
        this.f2025a.u0(i10, i11);
    }

    public void n(int i10, double d10) {
        this.f2025a.q0(i10, d10);
    }

    public void o(int i10, long j10) {
        this.f2025a.O0(i10, j10);
    }

    public void p(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.O(list.get(i13).longValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.P0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.O0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void q(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.n(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.v0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.u0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void r(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.Z(list.get(i13).longValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.a1(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.Z0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void s(int i10, Object obj, g1 g1Var) {
        this.f2025a.I0(i10, (r0) obj, g1Var);
    }

    public void t(int i10, List<Boolean> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.e(list.get(i13).booleanValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.l0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.k0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public void u(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.X(list.get(i13).intValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.Y0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.X0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void v(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f2025a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += k.S(list.get(i13).longValue());
            }
            this.f2025a.Y0(i12);
            while (i11 < list.size()) {
                this.f2025a.T0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f2025a.S0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void w(int i10, long j10) {
        this.f2025a.w0(i10, j10);
    }

    public u1.a x() {
        return u1.a.ASCENDING;
    }

    public void y(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), g1Var);
        }
    }

    public void z(int i10, long j10) {
        this.f2025a.S0(i10, j10);
    }
}
