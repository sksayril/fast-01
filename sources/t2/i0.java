package t2;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        f0 f0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i10 = 1;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel, r9);
                    break;
                case 2:
                    f0Var = (f0) b.d(parcel, r9, f0.CREATOR);
                    break;
                case 3:
                    iBinder = b.s(parcel, r9);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.d(parcel, r9, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.s(parcel, r9);
                    break;
                case 6:
                    iBinder3 = b.s(parcel, r9);
                    break;
                case 8:
                    str = b.e(parcel, r9);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new h0(i10, f0Var, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
