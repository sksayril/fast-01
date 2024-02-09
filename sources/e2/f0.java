package e2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class f0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        boolean z9 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                str = b.e(parcel, r9);
            } else if (j10 == 2) {
                iBinder = b.s(parcel, r9);
            } else if (j10 == 3) {
                z9 = b.k(parcel, r9);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                z10 = b.k(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new e0(str, iBinder, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e0[i10];
    }
}
