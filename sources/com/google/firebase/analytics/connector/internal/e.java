package com.google.firebase.analytics.connector.internal;

import a3.a;
import android.os.Bundle;

final class e implements a.C0000a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f f7203a;

    public e(f fVar) {
        this.f7203a = fVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str != null && a.e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            this.f7203a.f7204a.a(3, bundle2);
        }
    }
}
