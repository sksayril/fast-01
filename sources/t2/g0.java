package t2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import h2.d;
import i2.b;
import java.util.ArrayList;

public final class g0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        LocationRequest locationRequest = null;
        ArrayList<d> arrayList = null;
        String str = null;
        String str2 = null;
        long j10 = Long.MAX_VALUE;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j11 = b.j(r9);
            if (j11 == 1) {
                locationRequest = (LocationRequest) b.d(parcel2, r9, LocationRequest.CREATOR);
            } else if (j11 != 5) {
                switch (j11) {
                    case 8:
                        z9 = b.k(parcel2, r9);
                        break;
                    case 9:
                        z10 = b.k(parcel2, r9);
                        break;
                    case 10:
                        str = b.e(parcel2, r9);
                        break;
                    case 11:
                        z11 = b.k(parcel2, r9);
                        break;
                    case 12:
                        z12 = b.k(parcel2, r9);
                        break;
                    case 13:
                        str2 = b.e(parcel2, r9);
                        break;
                    case 14:
                        j10 = b.w(parcel2, r9);
                        break;
                    default:
                        b.z(parcel2, r9);
                        break;
                }
            } else {
                arrayList = b.h(parcel2, r9, d.CREATOR);
            }
        }
        b.i(parcel2, A);
        return new f0(locationRequest, arrayList, z9, z10, str, z11, z12, str2, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f0[i10];
    }
}
