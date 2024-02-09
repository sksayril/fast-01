package l6;

import java.util.ArrayList;
import java.util.List;
import o5.j;
import o5.q;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final u5.b f11154a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f11155b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    private final int f11156c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11157d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11158e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11159f;

    /* renamed from: g  reason: collision with root package name */
    private final float f11160g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f11161h;

    /* renamed from: i  reason: collision with root package name */
    private final q f11162i;

    b(u5.b bVar, int i10, int i11, int i12, int i13, float f10, q qVar) {
        this.f11154a = bVar;
        this.f11156c = i10;
        this.f11157d = i11;
        this.f11158e = i12;
        this.f11159f = i13;
        this.f11160g = f10;
        this.f11161h = new int[3];
        this.f11162i = qVar;
    }

    private static float a(int[] iArr, int i10) {
        return ((float) (i10 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    private float b(int i10, int i11, int i12, int i13) {
        u5.b bVar = this.f11154a;
        int n10 = bVar.n();
        int[] iArr = this.f11161h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.h(i11, i14) && iArr[1] <= i12) {
            iArr[1] = iArr[1] + 1;
            i14--;
        }
        if (i14 < 0 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i14 >= 0 && !bVar.h(i11, i14) && iArr[0] <= i12) {
            iArr[0] = iArr[0] + 1;
            i14--;
        }
        if (iArr[0] > i12) {
            return Float.NaN;
        }
        int i15 = i10 + 1;
        while (i15 < n10 && bVar.h(i11, i15) && iArr[1] <= i12) {
            iArr[1] = iArr[1] + 1;
            i15++;
        }
        if (i15 == n10 || iArr[1] > i12) {
            return Float.NaN;
        }
        while (i15 < n10 && !bVar.h(i11, i15) && iArr[2] <= i12) {
            iArr[2] = iArr[2] + 1;
            i15++;
        }
        if (iArr[2] <= i12 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i13) * 5 < i13 * 2 && d(iArr)) {
            return a(iArr, i15);
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f10 = this.f11160g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - ((float) iArr[i10])) >= f11) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[1] * 2, i12);
        if (Float.isNaN(b10)) {
            return null;
        }
        float f10 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (a next : this.f11155b) {
            if (next.f(f10, b10, a10)) {
                return next.g(b10, a10, f10);
            }
        }
        a aVar = new a(a10, b10, f10);
        this.f11155b.add(aVar);
        q qVar = this.f11162i;
        if (qVar == null) {
            return null;
        }
        qVar.a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    public a c() {
        a e10;
        a e11;
        int i10 = this.f11156c;
        int i11 = this.f11159f;
        int i12 = this.f11158e + i10;
        int i13 = this.f11157d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f11154a.h(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f11154a.h(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else if (d(iArr) && (e11 = e(iArr, i15, i16)) != null) {
                    return e11;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (e10 = e(iArr, i15, i12)) != null) {
                return e10;
            }
        }
        if (!this.f11155b.isEmpty()) {
            return this.f11155b.get(0);
        }
        throw j.a();
    }
}
