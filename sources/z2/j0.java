package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.b;
import java.util.ArrayList;

public final class j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        LatLng latLng = null;
        ArrayList<n> arrayList = null;
        double d10 = 0.0d;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 2:
                    latLng = (LatLng) b.d(parcel2, r9, LatLng.CREATOR);
                    break;
                case 3:
                    d10 = b.n(parcel2, r9);
                    break;
                case 4:
                    f10 = b.p(parcel2, r9);
                    break;
                case 5:
                    i10 = b.t(parcel2, r9);
                    break;
                case 6:
                    i11 = b.t(parcel2, r9);
                    break;
                case 7:
                    f11 = b.p(parcel2, r9);
                    break;
                case 8:
                    z9 = b.k(parcel2, r9);
                    break;
                case 9:
                    z10 = b.k(parcel2, r9);
                    break;
                case 10:
                    arrayList = b.h(parcel2, r9, n.CREATOR);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new f(latLng, d10, f10, i10, i11, f11, z9, z10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
