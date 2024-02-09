package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;

public abstract class SdkInputStream extends InputStream implements MetricAware {
    @Deprecated
    public final boolean a() {
        InputStream g10 = g();
        if (g10 instanceof MetricAware) {
            return ((MetricAware) g10).a();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public final void e() {
        if (Thread.interrupted()) {
            try {
                b();
            } catch (IOException e10) {
                LogFactory.b(getClass()).b("FYI", e10);
            }
            throw new AbortedException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract InputStream g();
}
