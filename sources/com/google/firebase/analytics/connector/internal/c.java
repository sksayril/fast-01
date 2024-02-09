package com.google.firebase.analytics.connector.internal;

import a3.a;
import android.os.Bundle;

final class c implements a.C0000a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f7198a;

    public c(d dVar) {
        this.f7198a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f7198a.f7199a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", a.a(str2));
            this.f7198a.f7200b.a(2, bundle2);
        }
    }
}
