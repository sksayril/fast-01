package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1462a = aVar.p(iconCompat.f1462a, 1);
        iconCompat.f1464c = aVar.j(iconCompat.f1464c, 2);
        iconCompat.f1465d = aVar.r(iconCompat.f1465d, 3);
        iconCompat.f1466e = aVar.p(iconCompat.f1466e, 4);
        iconCompat.f1467f = aVar.p(iconCompat.f1467f, 5);
        iconCompat.f1468g = (ColorStateList) aVar.r(iconCompat.f1468g, 6);
        iconCompat.f1470i = aVar.t(iconCompat.f1470i, 7);
        iconCompat.f1471j = aVar.t(iconCompat.f1471j, 8);
        iconCompat.v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.w(aVar.f());
        int i10 = iconCompat.f1462a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1464c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1465d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1466e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1467f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1468g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1470i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1471j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
