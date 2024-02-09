package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class ya extends za {
    ya(int i10) {
        super(i10);
    }

    public final void f() {
        if (!o()) {
            for (int i10 = 0; i10 < g(); i10++) {
                Map.Entry h10 = h(i10);
                if (((k8) h10.getKey()).d()) {
                    h10.setValue(Collections.unmodifiableList((List) h10.getValue()));
                }
            }
            for (Map.Entry entry : j()) {
                if (((k8) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }
}
