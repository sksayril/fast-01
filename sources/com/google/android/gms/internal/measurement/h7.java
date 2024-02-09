package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class h7 implements Comparator<f7> {
    h7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        f7 f7Var2 = (f7) obj2;
        l7 l7Var = (l7) f7Var.iterator();
        l7 l7Var2 = (l7) f7Var2.iterator();
        while (l7Var.hasNext() && l7Var2.hasNext()) {
            int compareTo = Integer.valueOf(f7.f(l7Var.zza())).compareTo(Integer.valueOf(f7.f(l7Var2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(f7Var.A()).compareTo(Integer.valueOf(f7Var2.A()));
    }
}
