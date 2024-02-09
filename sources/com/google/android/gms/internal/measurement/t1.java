package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class t1 extends z1 {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Bundle> f5614c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5615d;

    public static <T> T Y(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received" + ": %s, %s", new Object[]{canonicalName, canonicalName2}), e10);
            throw e10;
        }
    }

    public final Bundle J(long j10) {
        Bundle bundle;
        synchronized (this.f5614c) {
            if (!this.f5615d) {
                try {
                    this.f5614c.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f5614c.get();
        }
        return bundle;
    }

    public final Long e3(long j10) {
        return (Long) Y(J(j10), Long.class);
    }

    public final String f3(long j10) {
        return (String) Y(J(j10), String.class);
    }

    public final void p(Bundle bundle) {
        synchronized (this.f5614c) {
            try {
                this.f5614c.set(bundle);
                this.f5615d = true;
                this.f5614c.notify();
            } catch (Throwable th) {
                this.f5614c.notify();
                throw th;
            }
        }
    }
}
