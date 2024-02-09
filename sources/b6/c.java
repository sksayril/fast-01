package b6;

import java.util.Map;
import o5.f;
import u5.b;
import u5.e;
import w5.a;
import w5.d;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final w5.c f3414a = new w5.c(a.f12981o);

    private void a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[(i14 / i15)];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f3414a.a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (d unused) {
            throw o5.d.a();
        }
    }

    public e b(b bVar, Map<o5.e, ?> map) {
        int i10;
        byte[] a10 = new a(bVar).a();
        a(a10, 0, 10, 10, 0);
        byte b10 = a10[0] & 15;
        if (b10 == 2 || b10 == 3 || b10 == 4) {
            byte[] bArr = a10;
            a(bArr, 20, 84, 40, 1);
            a(bArr, 20, 84, 40, 2);
            i10 = 94;
        } else if (b10 == 5) {
            byte[] bArr2 = a10;
            a(bArr2, 20, 68, 56, 1);
            a(bArr2, 20, 68, 56, 2);
            i10 = 78;
        } else {
            throw f.a();
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(a10, 0, bArr3, 0, 10);
        System.arraycopy(a10, 20, bArr3, 10, bArr3.length - 10);
        return b.a(bArr3, b10);
    }
}
