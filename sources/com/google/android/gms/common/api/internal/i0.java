package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import g2.p;

final class i0 extends p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f4997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j0 f4998b;

    i0(j0 j0Var, Dialog dialog) {
        this.f4998b = j0Var;
        this.f4997a = dialog;
    }

    public final void a() {
        this.f4998b.f5002n.o();
        if (this.f4997a.isShowing()) {
            this.f4997a.dismiss();
        }
    }
}
