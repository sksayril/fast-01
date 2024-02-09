package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class a2 extends z0 implements c2 {
    public a2() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            long readLong = parcel.readLong();
            y0.f(parcel);
            y0(parcel.readString(), parcel.readString(), (Bundle) y0.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        }
        return true;
    }
}
