package g2;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import r2.b;
import r2.c;

public interface d extends IInterface {

    public static abstract class a extends b implements d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        public final boolean e3(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            c.b(parcel);
            I1((Status) c.a(parcel, Status.CREATOR));
            return true;
        }
    }

    void I1(Status status);
}
