package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class w0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                z9 = b.k(parcel, r9);
            } else if (j10 == 3) {
                z10 = b.k(parcel, r9);
            } else if (j10 == 4) {
                i11 = b.t(parcel, r9);
            } else if (j10 != 5) {
                b.z(parcel, r9);
            } else {
                i12 = b.t(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new r(i10, z9, z10, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
