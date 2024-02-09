package j2;

import android.os.IBinder;
import android.os.Parcel;
import h2.t;
import r2.c;

public final class a extends r2.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void e3(t tVar) {
        Parcel B = B();
        c.c(B, tVar);
        Y(1, B);
    }
}
