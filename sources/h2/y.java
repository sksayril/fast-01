package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;
import java.util.ArrayList;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        int i10 = 0;
        ArrayList<n> arrayList = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 != 2) {
                b.z(parcel, r9);
            } else {
                arrayList = b.h(parcel, r9, n.CREATOR);
            }
        }
        b.i(parcel, A);
        return new t(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
