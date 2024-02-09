package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class z1 extends z0 implements w1 {
    public z1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        y0.f(parcel);
        p((Bundle) y0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
