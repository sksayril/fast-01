package o5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import k6.a;
import p5.b;

public final class i implements l {

    /* renamed from: c  reason: collision with root package name */
    private static final l[] f11621c = new l[0];

    /* renamed from: a  reason: collision with root package name */
    private Map<e, ?> f11622a;

    /* renamed from: b  reason: collision with root package name */
    private l[] f11623b;

    private n a(c cVar) {
        l[] lVarArr = this.f11623b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                try {
                    return lVarArr[i11].d(cVar, this.f11622a);
                } catch (m unused) {
                    i11++;
                }
            }
            Map<e, ?> map = this.f11622a;
            if (map != null && map.containsKey(e.ALSO_INVERTED)) {
                cVar.a().e();
                l[] lVarArr2 = this.f11623b;
                int length2 = lVarArr2.length;
                while (i10 < length2) {
                    try {
                        return lVarArr2[i10].d(cVar, this.f11622a);
                    } catch (m unused2) {
                        i10++;
                    }
                }
            }
        }
        throw j.a();
    }

    public n b(c cVar) {
        if (this.f11623b == null) {
            f((Map<e, ?>) null);
        }
        return a(cVar);
    }

    public void c() {
        l[] lVarArr = this.f11623b;
        if (lVarArr != null) {
            for (l c10 : lVarArr) {
                c10.c();
            }
        }
    }

    public n d(c cVar, Map<e, ?> map) {
        f(map);
        return a(cVar);
    }

    public n e(c cVar) {
        f((Map<e, ?>) null);
        return a(cVar);
    }

    public void f(Map<e, ?> map) {
        this.f11622a = map;
        boolean z9 = true;
        boolean z10 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z9 = false;
            }
            if (z9 && !z10) {
                arrayList.add(new c6.i(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new x5.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new g6.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new a6.a());
            }
            if (z9 && z10) {
                arrayList.add(new c6.i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new c6.i(map));
            }
            arrayList.add(new a());
            arrayList.add(new x5.a());
            arrayList.add(new b());
            arrayList.add(new g6.b());
            arrayList.add(new a6.a());
            if (z10) {
                arrayList.add(new c6.i(map));
            }
        }
        this.f11623b = (l[]) arrayList.toArray(f11621c);
    }
}
