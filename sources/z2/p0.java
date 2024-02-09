package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.b;
import java.util.ArrayList;

public final class p0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList<LatLng> arrayList2 = null;
        ArrayList<n> arrayList3 = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i12 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 2:
                    arrayList2 = b.h(parcel, r9, LatLng.CREATOR);
                    break;
                case 3:
                    b.v(parcel, r9, arrayList, p0.class.getClassLoader());
                    break;
                case 4:
                    f10 = b.p(parcel, r9);
                    break;
                case 5:
                    i10 = b.t(parcel, r9);
                    break;
                case 6:
                    i11 = b.t(parcel, r9);
                    break;
                case 7:
                    f11 = b.p(parcel, r9);
                    break;
                case 8:
                    z9 = b.k(parcel, r9);
                    break;
                case 9:
                    z10 = b.k(parcel, r9);
                    break;
                case 10:
                    z11 = b.k(parcel, r9);
                    break;
                case 11:
                    i12 = b.t(parcel, r9);
                    break;
                case 12:
                    arrayList3 = b.h(parcel, r9, n.CREATOR);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new p(arrayList2, arrayList, f10, i10, i11, f11, z9, z10, z11, i12, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
