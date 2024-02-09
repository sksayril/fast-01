package e2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                str = b.e(parcel, r9);
            } else if (j10 == 2) {
                z9 = b.k(parcel, r9);
            } else if (j10 == 3) {
                z10 = b.k(parcel, r9);
            } else if (j10 == 4) {
                iBinder = b.s(parcel, r9);
            } else if (j10 != 5) {
                b.z(parcel, r9);
            } else {
                z11 = b.k(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new a0(str, z9, z10, iBinder, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
