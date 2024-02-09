package u2;

import android.os.IBinder;
import android.os.Parcel;
import z2.y;

public final class l extends a implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final y N0(int i10, int i11, int i12) {
        Parcel J = J();
        J.writeInt(i10);
        J.writeInt(i11);
        J.writeInt(i12);
        Parcel B = B(1, J);
        y yVar = (y) p.a(B, y.CREATOR);
        B.recycle();
        return yVar;
    }
}
