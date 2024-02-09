package t2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.d;
import i2.b;
import java.util.List;

public final class w0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        List A2 = s0.A();
        String str = null;
        String str2 = null;
        String str3 = null;
        b0 b0Var = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel, r9);
                    break;
                case 2:
                    i11 = b.t(parcel, r9);
                    break;
                case 3:
                    str = b.e(parcel, r9);
                    break;
                case 4:
                    str2 = b.e(parcel, r9);
                    break;
                case 5:
                    i12 = b.t(parcel, r9);
                    break;
                case 6:
                    str3 = b.e(parcel, r9);
                    break;
                case 7:
                    b0Var = (b0) b.d(parcel, r9, b0.CREATOR);
                    break;
                case 8:
                    A2 = b.h(parcel, r9, d.CREATOR);
                    break;
                default:
                    b.z(parcel, r9);
                    break;
            }
        }
        b.i(parcel, A);
        return new b0(i10, i11, str, str2, str3, i12, A2, b0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b0[i10];
    }
}
