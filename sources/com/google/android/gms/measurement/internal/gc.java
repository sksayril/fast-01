package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class gc implements qc {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zb f6070a;

    gc(zb zbVar) {
        this.f6070a = zbVar;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f6070a.i().C(new fc(this, str, str2, bundle));
        } else if (this.f6070a.f6792l != null) {
            this.f6070a.f6792l.k().F().b("AppId not known when logging event", str2);
        }
    }
}
