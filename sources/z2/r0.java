package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            if (b.j(r9) != 2) {
                b.z(parcel, r9);
            } else {
                iBinder = b.s(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new v(iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
