package y2;

import android.graphics.Bitmap;
import android.os.Parcel;
import o2.b;
import u2.o;
import u2.p;

public abstract class a0 extends o implements b0 {
    public a0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            p.b(parcel);
            M1((Bitmap) p.a(parcel, Bitmap.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            b J = b.a.J(parcel.readStrongBinder());
            p.b(parcel);
            l1(J);
        }
        parcel2.writeNoException();
        return true;
    }
}
