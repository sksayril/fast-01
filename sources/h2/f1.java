package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class f1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    rVar = (r) b.d(parcel, r9, r.CREATOR);
                    break;
                case 2:
                    z9 = b.k(parcel, r9);
                    break;
                case 3:
                    z10 = b.k(parcel, r9);
                    break;
                case 4:
                    iArr = b.c(parcel, r9);
                    break;
                case 5:
                    i10 = b.t(parcel, r9);
                    break;
                case 6:
                    iArr2 = b.c(parcel, r9);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new f(rVar, z9, z10, iArr, i10, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
