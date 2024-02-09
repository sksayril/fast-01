package androidx.core.content.res;

final class l {

    /* renamed from: k  reason: collision with root package name */
    static final l f1439k = k(b.f1405c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f1440a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1441b;

    /* renamed from: c  reason: collision with root package name */
    private final float f1442c;

    /* renamed from: d  reason: collision with root package name */
    private final float f1443d;

    /* renamed from: e  reason: collision with root package name */
    private final float f1444e;

    /* renamed from: f  reason: collision with root package name */
    private final float f1445f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f1446g;

    /* renamed from: h  reason: collision with root package name */
    private final float f1447h;

    /* renamed from: i  reason: collision with root package name */
    private final float f1448i;

    /* renamed from: j  reason: collision with root package name */
    private final float f1449j;

    private l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f1445f = f10;
        this.f1440a = f11;
        this.f1441b = f12;
        this.f1442c = f13;
        this.f1443d = f14;
        this.f1444e = f15;
        this.f1446g = fArr;
        this.f1447h = f16;
        this.f1448i = f17;
        this.f1449j = f18;
    }

    static l k(float[] fArr, float f10, float f11, float f12, boolean z9) {
        float f13 = f10;
        float[][] fArr2 = b.f1403a;
        float f14 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f15 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f16 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f17 = (f12 / 10.0f) + 0.8f;
        float d10 = ((double) f17) >= 0.9d ? b.d(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float exp = z9 ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f13) - 42.0f) / 92.0f))) * 0.2777778f)) * f17;
        double d11 = (double) exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * f13) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (f19 * f13) + (0.1f * f20 * f20 * ((float) Math.cbrt(((double) f13) * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = (double) h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f14)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f16)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(h10, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d10, f17, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f1440a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f1443d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f1447h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f1448i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f1445f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f1441b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f1444e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f1442c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f1446g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f1449j;
    }
}
