package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

public final /* synthetic */ class r6 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ o6 f5560a;

    public /* synthetic */ r6(o6 o6Var) {
        this.f5560a = o6Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f5560a.d(sharedPreferences, str);
    }
}
