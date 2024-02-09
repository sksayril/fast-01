package com.google.android.gms.internal.measurement;

final class m9 extends l9 {
    private m9() {
        super();
    }

    private static <E> y8<E> e(Object obj, long j10) {
        return (y8) ac.B(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j10) {
        y8 e10 = e(obj, j10);
        y8 e11 = e(obj2, j10);
        int size = e10.size();
        int size2 = e11.size();
        if (size > 0 && size2 > 0) {
            if (!e10.b()) {
                e10 = e10.e(size2 + size);
            }
            e10.addAll(e11);
        }
        if (size > 0) {
            e11 = e10;
        }
        ac.j(obj, j10, e11);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j10) {
        e(obj, j10).s();
    }
}
