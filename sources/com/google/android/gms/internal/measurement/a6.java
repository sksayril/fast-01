package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class a6 extends ContentObserver {
    a6(y5 y5Var, Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z9) {
        f6.m();
    }
}
