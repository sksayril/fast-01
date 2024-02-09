package c6;

import java.util.Collection;
import java.util.Map;
import o5.e;
import o5.m;
import o5.n;
import u5.a;

public final class j extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f3837b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final p[] f3838a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(java.util.Map<o5.e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            o5.e r0 = o5.e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            o5.a r1 = o5.a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            c6.e r1 = new c6.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            o5.a r1 = o5.a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            c6.l r1 = new c6.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            o5.a r1 = o5.a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            c6.f r1 = new c6.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            o5.a r1 = o5.a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            c6.q r3 = new c6.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            c6.e r3 = new c6.e
            r3.<init>()
            r0.add(r3)
            c6.f r3 = new c6.f
            r3.<init>()
            r0.add(r3)
            c6.q r3 = new c6.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            c6.p[] r3 = f3837b
            java.lang.Object[] r3 = r0.toArray(r3)
            c6.p[] r3 = (c6.p[]) r3
            r2.f3838a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.j.<init>(java.util.Map):void");
    }

    public n a(int i10, a aVar, Map<e, ?> map) {
        boolean z9;
        int[] q9 = p.q(aVar);
        p[] pVarArr = this.f3838a;
        int i11 = 0;
        while (i11 < pVarArr.length) {
            try {
                n n10 = pVarArr[i11].n(i10, aVar, q9, map);
                boolean z10 = n10.b() == o5.a.EAN_13 && n10.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(o5.a.UPC_A)) {
                        z9 = false;
                        if (z10 || !z9) {
                            return n10;
                        }
                        n nVar = new n(n10.f().substring(1), n10.c(), n10.e(), o5.a.UPC_A);
                        nVar.g(n10.d());
                        return nVar;
                    }
                }
                z9 = true;
                if (z10) {
                }
                return n10;
            } catch (m unused) {
                i11++;
            }
        }
        throw o5.j.a();
    }

    public void c() {
        for (p c10 : this.f3838a) {
            c10.c();
        }
    }
}
