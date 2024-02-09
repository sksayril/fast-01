package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.b;

public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                d10 = b.n(parcel, r9);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                d11 = b.n(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new LatLng(d10, d11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLng[i10];
    }
}
