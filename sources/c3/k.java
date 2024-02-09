package c3;

import android.os.Parcel;
import android.os.Parcelable;
import h2.k0;
import i2.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        int i10 = 0;
        k0 k0Var = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 != 2) {
                b.z(parcel, r9);
            } else {
                k0Var = (k0) b.d(parcel, r9, k0.CREATOR);
            }
        }
        b.i(parcel, A);
        return new j(i10, k0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
