package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    AbstractSSEHandler() {
    }

    public final void d(String str) {
        ServerSideEncryptionResult l10 = l();
        if (l10 != null) {
            l10.d(str);
        }
    }

    public final void e(String str) {
        ServerSideEncryptionResult l10 = l();
        if (l10 != null) {
            l10.e(str);
        }
    }

    public final void f(String str) {
        ServerSideEncryptionResult l10 = l();
        if (l10 != null) {
            l10.f(str);
        }
    }

    /* access modifiers changed from: protected */
    public abstract ServerSideEncryptionResult l();
}
