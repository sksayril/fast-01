package h2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e2.d;
import i2.b;

public final class e1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        f fVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                bundle = b.a(parcel, r9);
            } else if (j10 == 2) {
                dVarArr = (d[]) b.g(parcel, r9, d.CREATOR);
            } else if (j10 == 3) {
                i10 = b.t(parcel, r9);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                fVar = (f) b.d(parcel, r9, f.CREATOR);
            }
        }
        b.i(parcel, A);
        return new d1(bundle, dVarArr, i10, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d1[i10];
    }
}
