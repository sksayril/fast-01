package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class g0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        IBinder iBinder = null;
        boolean z9 = false;
        float f10 = 0.0f;
        boolean z10 = true;
        float f11 = 0.0f;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                iBinder = b.s(parcel, r9);
            } else if (j10 == 3) {
                z9 = b.k(parcel, r9);
            } else if (j10 == 4) {
                f10 = b.p(parcel, r9);
            } else if (j10 == 5) {
                z10 = b.k(parcel, r9);
            } else if (j10 != 6) {
                b.z(parcel, r9);
            } else {
                f11 = b.p(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new a0(iBinder, z9, f10, z10, f11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
