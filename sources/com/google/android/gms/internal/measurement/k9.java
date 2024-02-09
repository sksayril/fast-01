package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

final class k9 extends l9 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f5402c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private k9() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.j9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.j9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.j9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.i9
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.j9 r0 = new com.google.android.gms.internal.measurement.j9
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.oa
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.y8
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.y8 r0 = (com.google.android.gms.internal.measurement.y8) r0
            com.google.android.gms.internal.measurement.y8 r6 = r0.e(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.ac.j(r3, r4, r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f5402c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            com.google.android.gms.internal.measurement.ac.j(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.vb
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.j9 r1 = new com.google.android.gms.internal.measurement.j9
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.vb r0 = (com.google.android.gms.internal.measurement.vb) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.oa
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.y8
            if (r1 == 0) goto L_0x007a
            r1 = r0
            com.google.android.gms.internal.measurement.y8 r1 = (com.google.android.gms.internal.measurement.y8) r1
            boolean r2 = r1.b()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.y8 r0 = r1.e(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k9.e(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> f(Object obj, long j10) {
        return (List) ac.B(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j10) {
        List f10 = f(obj2, j10);
        List e10 = e(obj, j10, f10.size());
        int size = e10.size();
        int size2 = f10.size();
        if (size > 0 && size2 > 0) {
            e10.addAll(f10);
        }
        if (size > 0) {
            f10 = e10;
        }
        ac.j(obj, j10, f10);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j10) {
        Object obj2;
        List list = (List) ac.B(obj, j10);
        if (list instanceof i9) {
            obj2 = ((i9) list).p();
        } else if (!f5402c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof oa) || !(list instanceof y8)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                y8 y8Var = (y8) list;
                if (y8Var.b()) {
                    y8Var.s();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        ac.j(obj, j10, obj2);
    }
}
