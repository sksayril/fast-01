package w2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    z9 = b.k(parcel, r9);
                    break;
                case 2:
                    z10 = b.k(parcel, r9);
                    break;
                case 3:
                    z11 = b.k(parcel, r9);
                    break;
                case 4:
                    z12 = b.k(parcel, r9);
                    break;
                case 5:
                    z13 = b.k(parcel, r9);
                    break;
                case 6:
                    z14 = b.k(parcel, r9);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new j(z9, z10, z11, z12, z13, z14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
