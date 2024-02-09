package c3;

import android.os.Parcel;
import android.os.Parcelable;
import h2.m0;
import i2.b;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        e2.b bVar = null;
        m0 m0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                bVar = (e2.b) b.d(parcel, r9, e2.b.CREATOR);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                m0Var = (m0) b.d(parcel, r9, m0.CREATOR);
            }
        }
        b.i(parcel, A);
        return new l(i10, bVar, m0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
