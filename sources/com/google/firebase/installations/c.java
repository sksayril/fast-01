package com.google.firebase.installations;

import t3.l;

public class c extends l {

    /* renamed from: m  reason: collision with root package name */
    private final a f7461m;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public c(a aVar) {
        this.f7461m = aVar;
    }

    public c(String str, a aVar) {
        super(str);
        this.f7461m = aVar;
    }
}
