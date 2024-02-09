package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        IBinder iBinder = null;
        Float f10 = null;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 3) {
                iBinder = b.s(parcel, r9);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                f10 = b.q(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new d(i10, iBinder, f10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
