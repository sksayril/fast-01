package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.b;
import java.util.ArrayList;

public final class q0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        ArrayList<LatLng> arrayList = null;
        d dVar = null;
        d dVar2 = null;
        ArrayList<n> arrayList2 = null;
        ArrayList<x> arrayList3 = null;
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 2:
                    arrayList = b.h(parcel2, r9, LatLng.CREATOR);
                    break;
                case 3:
                    f10 = b.p(parcel2, r9);
                    break;
                case 4:
                    i10 = b.t(parcel2, r9);
                    break;
                case 5:
                    f11 = b.p(parcel2, r9);
                    break;
                case 6:
                    z9 = b.k(parcel2, r9);
                    break;
                case 7:
                    z10 = b.k(parcel2, r9);
                    break;
                case 8:
                    z11 = b.k(parcel2, r9);
                    break;
                case 9:
                    dVar = (d) b.d(parcel2, r9, d.CREATOR);
                    break;
                case 10:
                    dVar2 = (d) b.d(parcel2, r9, d.CREATOR);
                    break;
                case 11:
                    i11 = b.t(parcel2, r9);
                    break;
                case 12:
                    arrayList2 = b.h(parcel2, r9, n.CREATOR);
                    break;
                case 13:
                    arrayList3 = b.h(parcel2, r9, x.CREATOR);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new r(arrayList, f10, i10, f11, z9, z10, z11, dVar, dVar2, i11, arrayList2, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
