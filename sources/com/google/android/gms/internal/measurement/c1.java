package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class c1 extends w0 implements a1 {
    c1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle p(Bundle bundle) {
        Parcel B = B();
        y0.d(B, bundle);
        Parcel J = J(1, B);
        Bundle bundle2 = (Bundle) y0.a(J, Bundle.CREATOR);
        J.recycle();
        return bundle2;
    }
}
