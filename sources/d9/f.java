package d9;

import g8.s;
import r8.l;

public final class f {
    public static final <E> d<E> a(int i10, a aVar, l<? super E, s> lVar) {
        d<E> bVar;
        if (i10 != -2) {
            boolean z9 = false;
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    z9 = true;
                }
                if (z9) {
                    return new k(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i10, lVar) : new k(i10, aVar, lVar) : new b(Integer.MAX_VALUE, lVar);
            } else {
                bVar = aVar == a.SUSPEND ? new b<>(0, lVar) : new k<>(1, aVar, lVar);
            }
        } else {
            bVar = aVar == a.SUSPEND ? new b<>(d.f8263a.a(), lVar) : new k<>(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
