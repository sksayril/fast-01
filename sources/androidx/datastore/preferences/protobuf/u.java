package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class u<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final u f2089d = new u(true);

    /* renamed from: a  reason: collision with root package name */
    private final j1<T, Object> f2090a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2091b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2092c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2093a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2094b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.t1$b[] r0 = androidx.datastore.preferences.protobuf.t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2094b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.t1$b r2 = androidx.datastore.preferences.protobuf.t1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2094b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t1$b r3 = androidx.datastore.preferences.protobuf.t1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2094b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t1$b r4 = androidx.datastore.preferences.protobuf.t1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2094b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t1$b r5 = androidx.datastore.preferences.protobuf.t1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2094b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t1$b r6 = androidx.datastore.preferences.protobuf.t1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f2094b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t1$b r7 = androidx.datastore.preferences.protobuf.t1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f2094b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t1$b r8 = androidx.datastore.preferences.protobuf.t1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f2094b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t1$b r9 = androidx.datastore.preferences.protobuf.t1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f2094b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.t1$b r10 = androidx.datastore.preferences.protobuf.t1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.t1$c[] r9 = androidx.datastore.preferences.protobuf.t1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f2093a = r9
                androidx.datastore.preferences.protobuf.t1$c r10 = androidx.datastore.preferences.protobuf.t1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f2093a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.t1$c r9 = androidx.datastore.preferences.protobuf.t1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f2093a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.t1$c r1 = androidx.datastore.preferences.protobuf.t1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u.a.<clinit>():void");
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean f();

        int getNumber();

        t1.b h();

        boolean isPacked();

        t1.c o();

        r0.a p(r0.a aVar, r0 r0Var);
    }

    private u() {
        this.f2090a = j1.q(16);
    }

    private u(j1<T, Object> j1Var) {
        this.f2090a = j1Var;
        t();
    }

    private u(boolean z9) {
        this(j1.q(0));
        t();
    }

    static void A(k kVar, t1.b bVar, Object obj) {
        switch (a.f2094b[bVar.ordinal()]) {
            case 1:
                kVar.r0(((Double) obj).doubleValue());
                return;
            case 2:
                kVar.z0(((Float) obj).floatValue());
                return;
            case 3:
                kVar.H0(((Long) obj).longValue());
                return;
            case 4:
                kVar.a1(((Long) obj).longValue());
                return;
            case 5:
                kVar.F0(((Integer) obj).intValue());
                return;
            case 6:
                kVar.x0(((Long) obj).longValue());
                return;
            case 7:
                kVar.v0(((Integer) obj).intValue());
                return;
            case 8:
                kVar.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                kVar.C0((r0) obj);
                return;
            case 10:
                kVar.J0((r0) obj);
                return;
            case 11:
                if (!(obj instanceof h)) {
                    kVar.V0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof h)) {
                    kVar.m0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                kVar.Y0(((Integer) obj).intValue());
                return;
            case 14:
                kVar.N0(((Integer) obj).intValue());
                return;
            case 15:
                kVar.P0(((Long) obj).longValue());
                return;
            case 16:
                kVar.R0(((Integer) obj).intValue());
                return;
            case 17:
                kVar.T0(((Long) obj).longValue());
                return;
            case 18:
                kVar.t0(obj instanceof a0.c ? ((a0.c) obj).getNumber() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        kVar.p0((h) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(t1.b bVar, int i10, Object obj) {
        int V = k.V(i10);
        if (bVar == t1.b.GROUP) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(t1.b bVar, Object obj) {
        switch (a.f2094b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.Z(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((r0) obj);
            case 10:
                return obj instanceof d0 ? k.B((d0) obj) : k.G((r0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.U((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.X(((Integer) obj).intValue());
            case 14:
                return k.M(((Integer) obj).intValue());
            case 15:
                return k.O(((Long) obj).longValue());
            case 16:
                return k.Q(((Integer) obj).intValue());
            case 17:
                return k.S(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).getNumber()) : k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        t1.b h10 = bVar.h();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(h10, number, obj);
        }
        int i10 = 0;
        List<Object> list = (List) obj;
        if (bVar.isPacked()) {
            for (Object e10 : list) {
                i10 += e(h10, e10);
            }
            return k.V(number) + i10 + k.K(i10);
        }
        for (Object d10 : list) {
            i10 += d(h10, number, d10);
        }
        return i10;
    }

    public static <T extends b<T>> u<T> h() {
        return f2089d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.o() != t1.c.MESSAGE || bVar.f() || bVar.isPacked()) {
            return f(bVar, value);
        }
        boolean z9 = value instanceof d0;
        int number = ((b) entry.getKey()).getNumber();
        return z9 ? k.z(number, (d0) value) : k.D(number, (r0) value);
    }

    static int m(t1.b bVar, boolean z9) {
        if (z9) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.o() == t1.c.MESSAGE) {
            boolean f10 = bVar.f();
            Object value = entry.getValue();
            if (f10) {
                for (r0 n10 : (List) value) {
                    if (!n10.n()) {
                        return false;
                    }
                }
            } else if (value instanceof r0) {
                if (!((r0) value).n()) {
                    return false;
                }
            } else if (value instanceof d0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static boolean r(t1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f2093a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof r0) || (obj instanceof d0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        Object obj;
        j1<T, Object> j1Var;
        Object i10;
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof d0) {
            value = ((d0) value).f();
        }
        if (bVar.f()) {
            Object i11 = i(bVar);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) i11).add(c(c10));
            }
            this.f2090a.put(bVar, i11);
            return;
        }
        if (bVar.o() != t1.c.MESSAGE || (i10 = i(bVar)) == null) {
            j1Var = this.f2090a;
            obj = c(value);
        } else {
            obj = bVar.p(((r0) i10).e(), (r0) value).a();
            j1Var = this.f2090a;
        }
        j1Var.put(bVar, obj);
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    private void y(t1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(k kVar, t1.b bVar, int i10, Object obj) {
        if (bVar == t1.b.GROUP) {
            kVar.A0(i10, (r0) obj);
            return;
        }
        kVar.W0(i10, m(bVar, false));
        A(kVar, bVar, obj);
    }

    public void a(T t9, Object obj) {
        List list;
        if (t9.f()) {
            y(t9.h(), obj);
            Object i10 = i(t9);
            if (i10 == null) {
                list = new ArrayList();
                this.f2090a.put(t9, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public u<T> clone() {
        u<T> w9 = w();
        for (int i10 = 0; i10 < this.f2090a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f2090a.j(i10);
            w9.x((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry next : this.f2090a.m()) {
            w9.x((b) next.getKey(), next.getValue());
        }
        w9.f2092c = this.f2092c;
        return w9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.f2090a.equals(((u) obj).f2090a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.f2092c ? new d0.c(this.f2090a.h().iterator()) : this.f2090a.h().iterator();
    }

    public int hashCode() {
        return this.f2090a.hashCode();
    }

    public Object i(T t9) {
        Object obj = this.f2090a.get(t9);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2090a.k(); i11++) {
            i10 += k(this.f2090a.j(i11));
        }
        for (Map.Entry<T, Object> k10 : this.f2090a.m()) {
            i10 += k(k10);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2090a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f2090a.j(i11);
            i10 += f((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry next : this.f2090a.m()) {
            i10 += f((b) next.getKey(), next.getValue());
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f2090a.isEmpty();
    }

    public boolean o() {
        return this.f2091b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f2090a.k(); i10++) {
            if (!q(this.f2090a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q9 : this.f2090a.m()) {
            if (!q(q9)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f2092c ? new d0.c(this.f2090a.entrySet().iterator()) : this.f2090a.entrySet().iterator();
    }

    public void t() {
        if (!this.f2091b) {
            this.f2090a.p();
            this.f2091b = true;
        }
    }

    public void u(u<T> uVar) {
        for (int i10 = 0; i10 < uVar.f2090a.k(); i10++) {
            v(uVar.f2090a.j(i10));
        }
        for (Map.Entry<T, Object> v9 : uVar.f2090a.m()) {
            v(v9);
        }
    }

    public void x(T t9, Object obj) {
        if (!t9.f()) {
            y(t9.h(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y9 : arrayList) {
                y(t9.h(), y9);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof d0) {
            this.f2092c = true;
        }
        this.f2090a.put(t9, obj);
    }
}
