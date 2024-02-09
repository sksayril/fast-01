package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i2.b;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        Status status = null;
        j jVar = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                status = (Status) b.d(parcel, r9, Status.CREATOR);
            } else if (j10 != 2) {
                b.z(parcel, r9);
            } else {
                jVar = (j) b.d(parcel, r9, j.CREATOR);
            }
        }
        b.i(parcel, A);
        return new i(status, jVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
