package z2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class s0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        v vVar = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                f10 = b.p(parcel, r9);
            } else if (j10 == 3) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 4) {
                i11 = b.t(parcel, r9);
            } else if (j10 == 5) {
                z9 = b.k(parcel, r9);
            } else if (j10 != 6) {
                b.z(parcel, r9);
            } else {
                vVar = (v) b.d(parcel, r9, v.CREATOR);
            }
        }
        b.i(parcel, A);
        return new w(f10, i10, i11, z9, vVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
