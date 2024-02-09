package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import i2.b;

public final class h0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                latLng = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 == 3) {
                latLng2 = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 == 4) {
                latLng3 = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 == 5) {
                latLng4 = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 != 6) {
                b.z(parcel, r9);
            } else {
                latLngBounds = (LatLngBounds) b.d(parcel, r9, LatLngBounds.CREATOR);
            }
        }
        b.i(parcel, A);
        return new c0(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
