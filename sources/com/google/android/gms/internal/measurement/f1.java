package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

public abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static f1 f5220a = new i1();

    public static synchronized f1 a() {
        f1 f1Var;
        synchronized (f1.class) {
            f1Var = f5220a;
        }
        return f1Var;
    }

    public abstract URLConnection b(URL url, String str);
}
