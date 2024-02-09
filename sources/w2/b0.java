package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i2.b;
import java.util.ArrayList;

public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        boolean z9 = false;
        ArrayList<LocationRequest> arrayList = null;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 1) {
                arrayList = b.h(parcel, r9, LocationRequest.CREATOR);
            } else if (j10 == 2) {
                z9 = b.k(parcel, r9);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                z10 = b.k(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new g(arrayList, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
