package com.google.firebase.crashlytics;

import android.annotation.SuppressLint;
import z3.g;

public final class b {
    @SuppressLint({"VisibleForTests"})
    public static void a(Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            a.d().f7260a.p(th);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static void b(String str) {
        a.d().f7260a.w("com.crashlytics.flutter.build-id.0", str);
    }
}
