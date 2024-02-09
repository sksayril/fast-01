package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import i2.b;

public final class k0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                latLng = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 != 3) {
                b.z(parcel, r9);
            } else {
                latLng2 = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            }
        }
        b.i(parcel, A);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
