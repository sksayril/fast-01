package j2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e2.d;
import g2.c;
import h2.h;
import h2.w;
import r2.f;

public final class e extends h {
    private final w I;

    public e(Context context, Looper looper, h2.e eVar, w wVar, c cVar, g2.h hVar) {
        super(context, looper, 270, eVar, cVar, hVar);
        this.I = wVar;
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        return this.I.d();
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        return true;
    }

    public final int g() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final d[] v() {
        return f.f12081b;
    }
}
