package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel2, r9);
                    break;
                case 2:
                    i11 = b.t(parcel2, r9);
                    break;
                case 3:
                    i12 = b.t(parcel2, r9);
                    break;
                case 4:
                    j10 = b.w(parcel2, r9);
                    break;
                case 5:
                    j11 = b.w(parcel2, r9);
                    break;
                case 6:
                    str = b.e(parcel2, r9);
                    break;
                case 7:
                    str2 = b.e(parcel2, r9);
                    break;
                case 8:
                    i13 = b.t(parcel2, r9);
                    break;
                case 9:
                    i14 = b.t(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new n(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
