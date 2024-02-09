package com.google.android.gms.common.api.internal;

final class p implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ q f5016m;

    p(q qVar) {
        this.f5016m = qVar;
    }

    public final void run() {
        r rVar = this.f5016m.f5017a;
        rVar.f5019d.e(rVar.f5019d.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
