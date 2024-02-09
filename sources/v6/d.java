package v6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import k7.d;

public class d extends BroadcastReceiver implements d.C0170d {

    /* renamed from: m  reason: collision with root package name */
    private final Context f12740m;

    /* renamed from: n  reason: collision with root package name */
    private final a f12741n;

    /* renamed from: o  reason: collision with root package name */
    private d.b f12742o;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f12743p = new Handler(Looper.getMainLooper());

    /* renamed from: q  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f12744q;

    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        public void onAvailable(Network network) {
            d.this.i();
        }

        public void onLost(Network network) {
            d.this.j("none");
        }
    }

    public d(Context context, a aVar) {
        this.f12740m = context;
        this.f12741n = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f12742o.a(this.f12741n.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        this.f12742o.a(str);
    }

    /* access modifiers changed from: private */
    public void i() {
        this.f12743p.post(new b(this));
    }

    /* access modifiers changed from: private */
    public void j(String str) {
        this.f12743p.post(new c(this, str));
    }

    public void a(Object obj, d.b bVar) {
        this.f12742o = bVar;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f12744q = new a();
            this.f12741n.a().registerDefaultNetworkCallback(this.f12744q);
            return;
        }
        this.f12740m.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f12740m.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f12744q != null) {
            this.f12741n.a().unregisterNetworkCallback(this.f12744q);
            this.f12744q = null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        d.b bVar = this.f12742o;
        if (bVar != null) {
            bVar.a(this.f12741n.b());
        }
    }
}
