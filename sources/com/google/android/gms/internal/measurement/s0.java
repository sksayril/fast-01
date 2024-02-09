package com.google.android.gms.internal.measurement;

import java.util.List;

public final class s0 extends z {
    public final r b(String str, s6 s6Var, List<r> list) {
        if (str == null || str.isEmpty() || !s6Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        r c10 = s6Var.c(str);
        if (c10 instanceof m) {
            return ((m) c10).a(s6Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
