package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.b;

public final class n0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        float f12 = 0.0f;
        float f13 = 0.5f;
        float f14 = 0.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 2:
                    latLng = (LatLng) b.d(parcel2, r9, LatLng.CREATOR);
                    break;
                case 3:
                    str = b.e(parcel2, r9);
                    break;
                case 4:
                    str2 = b.e(parcel2, r9);
                    break;
                case 5:
                    iBinder = b.s(parcel2, r9);
                    break;
                case 6:
                    f10 = b.p(parcel2, r9);
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
                    z11 = b.k(parcel2, r9);
                    break;
                case 11:
                    f12 = b.p(parcel2, r9);
                    break;
                case 12:
                    f13 = b.p(parcel2, r9);
                    break;
                case 13:
                    f14 = b.p(parcel2, r9);
                    break;
                case 14:
                    f15 = b.p(parcel2, r9);
                    break;
                case 15:
                    f16 = b.p(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new m(latLng, str, str2, iBinder, f10, f11, z9, z10, z11, f12, f13, f14, f15, f16);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
