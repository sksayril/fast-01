package u5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o5.e;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f12518a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f12519b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f12520c = Charset.forName("GB2312");

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f12521d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f12522e;

    static {
        Charset defaultCharset = Charset.defaultCharset();
        f12518a = defaultCharset;
        Charset forName = Charset.forName("SJIS");
        f12519b = forName;
        Charset forName2 = Charset.forName("EUC_JP");
        f12521d = forName2;
        f12522e = forName.equals(defaultCharset) || forName2.equals(defaultCharset);
    }

    public static Charset a(byte[] bArr, Map<e, ?> map) {
        byte[] bArr2 = bArr;
        Map<e, ?> map2 = map;
        if (map2 != null) {
            e eVar = e.CHARACTER_SET;
            if (map2.containsKey(eVar)) {
                return Charset.forName(map2.get(eVar).toString());
            }
        }
        boolean z9 = true;
        int i10 = 0;
        if (bArr2.length > 2 && ((bArr2[0] == -2 && bArr2[1] == -1) || (bArr2[0] == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z10 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i11 = 0;
        boolean z11 = true;
        boolean z12 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z9 || z11 || z12)) {
            byte b10 = bArr2[i12] & 255;
            if (z12) {
                byte b11 = b10 & 128;
                if (i13 > 0) {
                    if (b11 != 0) {
                        i13--;
                    }
                } else if (b11 != 0) {
                    if ((b10 & 64) != 0) {
                        i13++;
                        if ((b10 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((b10 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((b10 & 8) == 0) {
                                    i17++;
                                }
                            }
                        }
                    }
                }
                z12 = false;
            }
            if (z9) {
                if (b10 > Byte.MAX_VALUE && b10 < 160) {
                    z9 = false;
                } else if (b10 > 159 && (b10 < 192 || b10 == 215 || b10 == 247)) {
                    i19++;
                }
            }
            if (z11) {
                if (i14 > 0) {
                    if (b10 >= 64 && b10 != Byte.MAX_VALUE && b10 <= 252) {
                        i14--;
                    }
                } else if (!(b10 == 128 || b10 == 160 || b10 > 239)) {
                    if (b10 <= 160 || b10 >= 224) {
                        if (b10 > Byte.MAX_VALUE) {
                            i14++;
                            int i22 = i20 + 1;
                            if (i22 > i10) {
                                i10 = i22;
                                i20 = i10;
                            } else {
                                i20 = i22;
                            }
                        } else {
                            i20 = 0;
                        }
                        i21 = 0;
                    } else {
                        i11++;
                        int i23 = i21 + 1;
                        if (i23 > i18) {
                            i18 = i23;
                            i21 = i18;
                        } else {
                            i21 = i23;
                        }
                        i20 = 0;
                    }
                }
                z11 = false;
            }
            i12++;
            bArr2 = bArr;
        }
        if (z12 && i13 > 0) {
            z12 = false;
        }
        if (z11 && i14 > 0) {
            z11 = false;
        }
        return (!z12 || (!z10 && (i15 + i16) + i17 <= 0)) ? (!z11 || (!f12522e && i18 < 3 && i10 < 3)) ? (!z9 || !z11) ? z9 ? StandardCharsets.ISO_8859_1 : z11 ? f12519b : z12 ? StandardCharsets.UTF_8 : f12518a : (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? StandardCharsets.ISO_8859_1 : f12519b : f12519b : StandardCharsets.UTF_8;
    }
}
