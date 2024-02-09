package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.d1;

public final class s5 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f6535a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t5 f6536b;

    s5(t5 t5Var, String str) {
        this.f6536b = t5Var;
        this.f6535a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f6536b.f6578a.k().K().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            a1 J = d1.J(iBinder);
            if (J == null) {
                this.f6536b.f6578a.k().K().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f6536b.f6578a.k().J().a("Install Referrer Service connected");
            this.f6536b.f6578a.i().C(new v5(this, J, this));
        } catch (RuntimeException e10) {
            this.f6536b.f6578a.k().K().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6536b.f6578a.k().J().a("Install Referrer Service disconnected");
    }
}
