package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 != 2) {
                b.z(parcel, r9);
            } else {
                str = b.e(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new d(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
