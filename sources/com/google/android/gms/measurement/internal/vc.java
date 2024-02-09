package com.google.android.gms.measurement.internal;

public final /* synthetic */ class vc implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ m6 f6638m;

    public /* synthetic */ vc(m6 m6Var) {
        this.f6638m = m6Var;
    }

    public final void run() {
        m6 m6Var = this.f6638m;
        if (!m6Var.K().U0()) {
            m6Var.k().K().a("registerTrigger called but app not eligible");
            return;
        }
        y7 G = m6Var.G();
        G.getClass();
        new Thread(new wc(G)).start();
    }
}
