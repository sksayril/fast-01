package c6;

import e6.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import o5.a;
import o5.e;
import o5.j;
import o5.m;
import o5.n;

public final class i extends k {

    /* renamed from: b  reason: collision with root package name */
    private static final k[] f3835b = new k[0];

    /* renamed from: a  reason: collision with root package name */
    private final k[] f3836a;

    public i(Map<e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        boolean z9 = (map == null || map.get(e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new j(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new c(z9));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new d());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new h());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new d6.e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new j(map));
            arrayList.add(new c());
            arrayList.add(new a());
            arrayList.add(new d());
            arrayList.add(new b());
            arrayList.add(new h());
            arrayList.add(new d6.e());
            arrayList.add(new d());
        }
        this.f3836a = (k[]) arrayList.toArray(f3835b);
    }

    public n a(int i10, u5.a aVar, Map<e, ?> map) {
        k[] kVarArr = this.f3836a;
        int i11 = 0;
        while (i11 < kVarArr.length) {
            try {
                return kVarArr[i11].a(i10, aVar, map);
            } catch (m unused) {
                i11++;
            }
        }
        throw j.a();
    }

    public void c() {
        for (k c10 : this.f3836a) {
            c10.c();
        }
    }
}
