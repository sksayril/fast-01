package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class l5 extends ContentObserver {
    l5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z9) {
        i5.f5342e.set(true);
    }
}
