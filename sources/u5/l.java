package u5;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final float f12509a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12510b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12511c;

    /* renamed from: d  reason: collision with root package name */
    private final float f12512d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12513e;

    /* renamed from: f  reason: collision with root package name */
    private final float f12514f;

    /* renamed from: g  reason: collision with root package name */
    private final float f12515g;

    /* renamed from: h  reason: collision with root package name */
    private final float f12516h;

    /* renamed from: i  reason: collision with root package name */
    private final float f12517i;

    private l(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f12509a = f10;
        this.f12510b = f13;
        this.f12511c = f16;
        this.f12512d = f11;
        this.f12513e = f14;
        this.f12514f = f17;
        this.f12515g = f12;
        this.f12516h = f15;
        this.f12517i = f18;
    }

    public static l b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static l c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static l d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new l(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new l((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public l a() {
        float f10 = this.f12513e;
        float f11 = this.f12517i;
        float f12 = this.f12514f;
        float f13 = this.f12516h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f12515g;
        float f16 = this.f12512d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f12511c;
        float f20 = this.f12510b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f12509a;
        return new l(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    /* access modifiers changed from: package-private */
    public l e(l lVar) {
        l lVar2 = lVar;
        float f10 = this.f12509a;
        float f11 = lVar2.f12509a;
        float f12 = this.f12512d;
        float f13 = lVar2.f12510b;
        float f14 = this.f12515g;
        float f15 = lVar2.f12511c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = lVar2.f12512d;
        float f18 = lVar2.f12513e;
        float f19 = lVar2.f12514f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = lVar2.f12515g;
        float f22 = lVar2.f12516h;
        float f23 = lVar2.f12517i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f12510b;
        float f26 = f24;
        float f27 = this.f12513e;
        float f28 = f20;
        float f29 = this.f12516h;
        float f30 = (f25 * f11) + (f27 * f13) + (f29 * f15);
        float f31 = (f29 * f23) + (f25 * f21) + (f27 * f22);
        float f32 = this.f12511c;
        float f33 = this.f12514f;
        float f34 = (f11 * f32) + (f13 * f33);
        float f35 = this.f12517i;
        float f36 = (f32 * f21) + (f33 * f22) + (f35 * f23);
        return new l(f16, f28, f26, f30, (f25 * f17) + (f27 * f18) + (f29 * f19), f31, (f15 * f35) + f34, (f17 * f32) + (f18 * f33) + (f19 * f35), f36);
    }

    public void f(float[] fArr) {
        float[] fArr2 = fArr;
        float f10 = this.f12509a;
        float f11 = this.f12510b;
        float f12 = this.f12511c;
        float f13 = this.f12512d;
        float f14 = this.f12513e;
        float f15 = this.f12514f;
        float f16 = this.f12515g;
        float f17 = this.f12516h;
        float f18 = this.f12517i;
        int length = fArr2.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr2[i10];
            int i11 = i10 + 1;
            float f20 = fArr2[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr2[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr2[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
