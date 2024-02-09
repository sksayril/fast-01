package z2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class t0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        w wVar = null;
        double d10 = 0.0d;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                wVar = (w) b.d(parcel, r9, w.CREATOR);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                d10 = b.n(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new x(wVar, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
