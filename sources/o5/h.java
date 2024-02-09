package o5;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f11619a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11620b;

    protected h(int i10, int i11) {
        this.f11619a = i10;
        this.f11620b = i11;
    }

    public final int a() {
        return this.f11620b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f11619a;
    }

    public h e() {
        return new g(this);
    }

    public boolean f() {
        return false;
    }

    public h g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f11619a;
        byte[] bArr = new byte[i10];
        StringBuilder sb = new StringBuilder(this.f11620b * (i10 + 1));
        for (int i11 = 0; i11 < this.f11620b; i11++) {
            bArr = c(i11, bArr);
            for (int i12 = 0; i12 < this.f11619a; i12++) {
                byte b10 = bArr[i12] & 255;
                sb.append(b10 < 64 ? '#' : b10 < 128 ? '+' : b10 < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
