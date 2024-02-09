package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f8905a;

    /* renamed from: b  reason: collision with root package name */
    private final p f8906b;

    public q(p pVar) {
        this.f8906b = pVar;
    }

    public final void a(Context context) {
        this.f8905a = context;
    }

    public final synchronized void b() {
        Context context = this.f8905a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f8905a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f8906b.a();
            b();
        }
    }
}
