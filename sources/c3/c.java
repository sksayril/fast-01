package c3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                i11 = b.t(parcel, r9);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                intent = (Intent) b.d(parcel, r9, Intent.CREATOR);
            }
        }
        b.i(parcel, A);
        return new b(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
