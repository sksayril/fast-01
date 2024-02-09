package h2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class a1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f9105a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f9106b;

    public a1(c cVar, int i10) {
        this.f9106b = cVar;
        this.f9105a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f9106b;
        if (iBinder == null) {
            c.d0(cVar, 16);
            return;
        }
        synchronized (cVar.f9123n) {
            c cVar2 = this.f9106b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f9124o = (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new q0(iBinder) : (m) queryLocalInterface;
        }
        this.f9106b.e0(0, (Bundle) null, this.f9105a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9106b.f9123n) {
            this.f9106b.f9124o = null;
        }
        Handler handler = this.f9106b.f9121l;
        handler.sendMessage(handler.obtainMessage(6, this.f9105a, 1));
    }
}
