package e2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                i10 = b.t(parcel, r9);
            } else if (j10 == 2) {
                i11 = b.t(parcel, r9);
            } else if (j10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, r9, PendingIntent.CREATOR);
            } else if (j10 != 4) {
                b.z(parcel, r9);
            } else {
                str = b.e(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new b(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
