package com.google.firebase.crashlytics.internal.common;

import com.google.auto.value.AutoValue;
import d4.f0;
import java.io.File;

@AutoValue
public abstract class u {
    public static u a(f0 f0Var, String str, File file) {
        return new b(f0Var, str, file);
    }

    public abstract f0 b();

    public abstract File c();

    public abstract String d();
}
