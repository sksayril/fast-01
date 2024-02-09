package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class e2 extends w0 implements c2 {
    e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void y0(String str, String str2, Bundle bundle, long j10) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.d(B, bundle);
        B.writeLong(j10);
        Y(1, B);
    }

    public final int zza() {
        Parcel J = J(2, B());
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
