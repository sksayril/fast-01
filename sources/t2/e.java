package t2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class e extends Binder implements IInterface {
    protected e(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return B(i10, parcel, parcel2, i11);
    }
}
