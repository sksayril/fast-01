package w2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j12 = b.j(r9);
            if (j12 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j12 == 2) {
                i11 = b.t(parcel, r9);
            } else if (j12 == 3) {
                j10 = b.w(parcel, r9);
            } else if (j12 != 4) {
                b.z(parcel, r9);
            } else {
                j11 = b.w(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new o(i10, i11, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
