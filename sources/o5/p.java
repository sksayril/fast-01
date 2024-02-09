package o5;

import v5.a;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final float f11639a;

    /* renamed from: b  reason: collision with root package name */
    private final float f11640b;

    public p(float f10, float f11) {
        this.f11639a = f10;
        this.f11640b = f11;
    }

    private static float a(p pVar, p pVar2, p pVar3) {
        float f10 = pVar2.f11639a;
        float f11 = pVar2.f11640b;
        return ((pVar3.f11639a - f10) * (pVar.f11640b - f11)) - ((pVar3.f11640b - f11) * (pVar.f11639a - f10));
    }

    public static float b(p pVar, p pVar2) {
        return a.a(pVar.f11639a, pVar.f11640b, pVar2.f11639a, pVar2.f11640b);
    }

    public static void e(p[] pVarArr) {
        p pVar;
        p pVar2;
        p pVar3;
        float b10 = b(pVarArr[0], pVarArr[1]);
        float b11 = b(pVarArr[1], pVarArr[2]);
        float b12 = b(pVarArr[0], pVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            pVar3 = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar = pVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            pVar3 = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar = pVarArr[1];
        } else {
            pVar3 = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar = pVarArr[2];
        }
        if (a(pVar2, pVar3, pVar) < 0.0f) {
            p pVar4 = pVar;
            pVar = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar3;
        pVarArr[2] = pVar;
    }

    public final float c() {
        return this.f11639a;
    }

    public final float d() {
        return this.f11640b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f11639a == pVar.f11639a && this.f11640b == pVar.f11640b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11639a) * 31) + Float.floatToIntBits(this.f11640b);
    }

    public final String toString() {
        return "(" + this.f11639a + ',' + this.f11640b + ')';
    }
}
