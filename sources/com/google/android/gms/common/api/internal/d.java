package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import h2.p;

public class d {
    public static <L> c<L> a(L l10, Looper looper, String str) {
        p.k(l10, "Listener must not be null");
        p.k(looper, "Looper must not be null");
        p.k(str, "Listener type must not be null");
        return new c<>(looper, l10, str);
    }

    public static <L> c.a<L> b(L l10, String str) {
        p.k(l10, "Listener must not be null");
        p.k(str, "Listener type must not be null");
        p.g(str, "Listener type must not be empty");
        return new c.a<>(l10, str);
    }
}
