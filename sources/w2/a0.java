package w2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;
import t2.b0;

public final class a0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        String str = null;
        b0 b0Var = null;
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j11 = b.j(r9);
            if (j11 == 1) {
                j10 = b.w(parcel, r9);
            } else if (j11 == 2) {
                i10 = b.t(parcel, r9);
            } else if (j11 == 3) {
                z9 = b.k(parcel, r9);
            } else if (j11 == 4) {
                str = b.e(parcel, r9);
            } else if (j11 != 5) {
                b.z(parcel, r9);
            } else {
                b0Var = (b0) b.d(parcel, r9, b0.CREATOR);
            }
        }
        b.i(parcel, A);
        return new d(j10, i10, z9, str, b0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
