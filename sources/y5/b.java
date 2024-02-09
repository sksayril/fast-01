package y5;

import y5.e;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f13247a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f13248b;

    private b(int i10, byte[] bArr) {
        this.f13247a = i10;
        this.f13248b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        e.c d10 = eVar.d();
        e.b[] a10 = d10.a();
        int i10 = 0;
        for (e.b a11 : a10) {
            i10 += a11.a();
        }
        b[] bVarArr = new b[i10];
        int i11 = 0;
        for (e.b bVar : a10) {
            int i12 = 0;
            while (i12 < bVar.a()) {
                int b10 = bVar.b();
                bVarArr[i11] = new b(b10, new byte[(d10.b() + b10)]);
                i12++;
                i11++;
            }
        }
        int length = bVarArr[0].f13248b.length - d10.b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                bVarArr[i16].f13248b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z9 = eVar.i() == 24;
        int i17 = z9 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            bVarArr[i18].f13248b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = bVarArr[0].f13248b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z9 ? (i19 + 8) % i11 : i19;
                bVarArr[i20].f13248b[(!z9 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public byte[] a() {
        return this.f13248b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f13247a;
    }
}
