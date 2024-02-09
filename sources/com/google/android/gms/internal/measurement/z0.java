package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class z0 extends Binder implements IInterface {
    protected z0(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z9;
        if (i10 > 16777215) {
            z9 = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z9 = false;
        }
        if (z9) {
            return true;
        }
        return B(i10, parcel, parcel2, i11);
    }
}
