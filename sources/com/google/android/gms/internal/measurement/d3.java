package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;
import o2.d;

final class d3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Bundle f5183q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ Activity f5184r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ h2.c f5185s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d3(h2.c cVar, Bundle bundle, Activity activity) {
        super(h2.this);
        this.f5185s = cVar;
        this.f5183q = bundle;
        this.f5184r = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Bundle bundle;
        if (this.f5183q != null) {
            bundle = new Bundle();
            if (this.f5183q.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f5183q.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((v1) p.j(h2.this.f5297i)).onActivityCreated(d.e3(this.f5184r), bundle, this.f5299n);
    }
}
