package z2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            if (b.j(r9) != 2) {
                b.z(parcel, r9);
            } else {
                str = b.e(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new k(str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
