package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class s5 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p5 f5588a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s5(p5 p5Var, Handler handler) {
        super((Handler) null);
        this.f5588a = p5Var;
    }

    public final void onChange(boolean z9) {
        this.f5588a.e();
    }
}
