package y2;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import u2.o;
import u2.p;

public abstract class m extends o implements n {
    public m() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        p.b(parcel);
        E((LatLng) p.a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
