package o5;

public final class g extends h {

    /* renamed from: c  reason: collision with root package name */
    private final h f11618c;

    public g(h hVar) {
        super(hVar.d(), hVar.a());
        this.f11618c = hVar;
    }

    public byte[] b() {
        byte[] b10 = this.f11618c.b();
        int d10 = d() * a();
        byte[] bArr = new byte[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bArr[i10] = (byte) (255 - (b10[i10] & 255));
        }
        return bArr;
    }

    public byte[] c(int i10, byte[] bArr) {
        byte[] c10 = this.f11618c.c(i10, bArr);
        int d10 = d();
        for (int i11 = 0; i11 < d10; i11++) {
            c10[i11] = (byte) (255 - (c10[i11] & 255));
        }
        return c10;
    }

    public h e() {
        return this.f11618c;
    }

    public boolean f() {
        return this.f11618c.f();
    }

    public h g() {
        return new g(this.f11618c.g());
    }
}
