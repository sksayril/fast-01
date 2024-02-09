package e2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j11 = b.j(r9);
            if (j11 == 1) {
                str = b.e(parcel, r9);
            } else if (j11 == 2) {
                i10 = b.t(parcel, r9);
            } else if (j11 != 3) {
                b.z(parcel, r9);
            } else {
                j10 = b.w(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new d(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
