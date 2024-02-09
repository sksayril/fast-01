package b9;

import g8.k;
import h9.b;
import j8.d;
import j8.f;
import r8.l;
import r8.p;

public enum l0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3461a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                b9.l0[] r0 = b9.l0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b9.l0 r1 = b9.l0.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                b9.l0 r1 = b9.l0.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                b9.l0 r1 = b9.l0.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                b9.l0 r1 = b9.l0.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f3461a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b9.l0.a.<clinit>():void");
        }
    }

    public final <T> void invoke(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        int i10 = a.f3461a[ordinal()];
        if (i10 == 1) {
            h9.a.c(lVar, dVar);
        } else if (i10 == 2) {
            f.a(lVar, dVar);
        } else if (i10 == 3) {
            b.a(lVar, dVar);
        } else if (i10 != 4) {
            throw new k();
        }
    }

    public final <R, T> void invoke(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r9, d<? super T> dVar) {
        int i10 = a.f3461a[ordinal()];
        if (i10 == 1) {
            h9.a.e(pVar, r9, dVar, (l) null, 4, (Object) null);
        } else if (i10 == 2) {
            f.b(pVar, r9, dVar);
        } else if (i10 == 3) {
            b.b(pVar, r9, dVar);
        } else if (i10 != 4) {
            throw new k();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
