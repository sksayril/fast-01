package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import i2.b;

public final class d0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        float f10 = 0.0f;
        LatLng latLng = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j10 = b.j(r9);
            if (j10 == 2) {
                latLng = (LatLng) b.d(parcel, r9, LatLng.CREATOR);
            } else if (j10 == 3) {
                f10 = b.p(parcel, r9);
            } else if (j10 == 4) {
                f11 = b.p(parcel, r9);
            } else if (j10 != 5) {
                b.z(parcel, r9);
            } else {
                f12 = b.p(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new CameraPosition(latLng, f10, f11, f12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
