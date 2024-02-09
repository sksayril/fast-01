package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class y1 extends w0 implements w1 {
    y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void p(Bundle bundle) {
        Parcel B = B();
        y0.d(B, bundle);
        Y(1, B);
    }
}
