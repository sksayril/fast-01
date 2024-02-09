package t2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i2.b;

public final class y0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        Status status = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            if (b.j(r9) != 1) {
                b.z(parcel, r9);
            } else {
                status = (Status) b.d(parcel, r9, Status.CREATOR);
            }
        }
        b.i(parcel, A);
        return new x0(status);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new x0[i10];
    }
}
