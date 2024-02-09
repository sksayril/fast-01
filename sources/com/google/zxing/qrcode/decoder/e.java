package com.google.zxing.qrcode.decoder;

import java.util.Map;
import o5.f;
import u5.b;
import w5.a;
import w5.c;
import w5.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final c f7541a = new c(a.f12978l);

    private void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f7541a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (d unused) {
            throw o5.d.a();
        }
    }

    private u5.e b(a aVar, Map<o5.e, ?> map) {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b c10 : b10) {
            i10 += c10.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar : b10) {
            byte[] a10 = bVar.a();
            int c11 = bVar.c();
            a(a10, c11);
            int i12 = 0;
            while (i12 < c11) {
                bArr[i11] = a10[i12];
                i12++;
                i11++;
            }
        }
        return d.a(bArr, e10, d10, map);
    }

    public u5.e c(b bVar, Map<o5.e, ?> map) {
        o5.d e10;
        a aVar = new a(bVar);
        f fVar = null;
        try {
            return b(aVar, map);
        } catch (f e11) {
            f fVar2 = e11;
            e10 = null;
            fVar = fVar2;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                u5.e b10 = b(aVar, map);
                b10.n(new i(true));
                return b10;
            } catch (o5.d | f unused) {
                if (fVar != null) {
                    throw fVar;
                }
                throw e10;
            }
        } catch (o5.d e12) {
            e10 = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            u5.e b102 = b(aVar, map);
            b102.n(new i(true));
            return b102;
        }
    }
}
