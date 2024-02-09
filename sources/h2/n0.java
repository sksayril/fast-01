package h2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class n0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        IBinder iBinder = null;
        e2.b bVar = null;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                iBinder = b.s(parcel, r9);
            } else if (j10 == 3) {
                bVar = (e2.b) b.d(parcel, r9, e2.b.CREATOR);
            } else if (j10 == 4) {
                z9 = b.k(parcel, r9);
            } else if (j10 != 5) {
                b.z(parcel, r9);
            } else {
                z10 = b.k(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new m0(i10, iBinder, bVar, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m0[i10];
    }
}
