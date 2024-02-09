package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h2.p;

class i5 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    private static final String f6120d = i5.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zb f6121a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6122b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6123c;

    i5(zb zbVar) {
        p.j(zbVar);
        this.f6121a = zbVar;
    }

    public final void b() {
        this.f6121a.o0();
        this.f6121a.i().m();
        if (!this.f6122b) {
            this.f6121a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6123c = this.f6121a.f0().z();
            this.f6121a.k().J().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6123c));
            this.f6122b = true;
        }
    }

    public final void c() {
        this.f6121a.o0();
        this.f6121a.i().m();
        this.f6121a.i().m();
        if (this.f6122b) {
            this.f6121a.k().J().a("Unregistering connectivity change receiver");
            this.f6122b = false;
            this.f6123c = false;
            try {
                this.f6121a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f6121a.k().F().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f6121a.o0();
        String action = intent.getAction();
        this.f6121a.k().J().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean z9 = this.f6121a.f0().z();
            if (this.f6123c != z9) {
                this.f6123c = z9;
                this.f6121a.i().C(new l5(this, z9));
                return;
            }
            return;
        }
        this.f6121a.k().K().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
