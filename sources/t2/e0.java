package t2;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel, r9);
                    break;
                case 2:
                    iBinder = b.s(parcel, r9);
                    break;
                case 3:
                    iBinder2 = b.s(parcel, r9);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.d(parcel, r9, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = b.e(parcel, r9);
                    break;
                case 6:
                    str2 = b.e(parcel, r9);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new d0(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
