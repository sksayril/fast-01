package e2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class d0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        boolean z9 = false;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                z9 = b.k(parcel, r9);
            } else if (j10 == 2) {
                str = b.e(parcel, r9);
            } else if (j10 == 3) {
                i10 = b.t(parcel, r9);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                i11 = b.t(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new c0(z9, str, i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
