package kotlin.coroutines.jvm.internal;

import j8.d;
import j8.g;

public final class c implements d<Object> {

    /* renamed from: m  reason: collision with root package name */
    public static final c f11056m = new c();

    private c() {
    }

    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
