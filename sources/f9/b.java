package f9;

import f9.d;
import g8.m;
import g8.s;
import java.util.Arrays;
import kotlin.jvm.internal.l;

public abstract class b<S extends d<?>> {

    /* renamed from: m  reason: collision with root package name */
    private S[] f8808m;

    /* renamed from: n  reason: collision with root package name */
    private int f8809n;

    /* renamed from: o  reason: collision with root package name */
    private int f8810o;

    /* access modifiers changed from: protected */
    public final S b() {
        S s9;
        synchronized (this) {
            S[] sArr = this.f8808m;
            if (sArr == null) {
                sArr = d(2);
                this.f8808m = sArr;
            } else if (this.f8809n >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                l.d(copyOf, "copyOf(this, newSize)");
                this.f8808m = (d[]) copyOf;
                sArr = (d[]) copyOf;
            }
            int i10 = this.f8810o;
            do {
                s9 = sArr[i10];
                if (s9 == null) {
                    s9 = c();
                    sArr[i10] = s9;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                l.c(s9, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s9.a(this));
            this.f8810o = i10;
            this.f8809n++;
        }
        return s9;
    }

    /* access modifiers changed from: protected */
    public abstract S c();

    /* access modifiers changed from: protected */
    public abstract S[] d(int i10);

    /* access modifiers changed from: protected */
    public final void e(S s9) {
        int i10;
        j8.d[] b10;
        synchronized (this) {
            int i11 = this.f8809n - 1;
            this.f8809n = i11;
            if (i11 == 0) {
                this.f8810o = 0;
            }
            l.c(s9, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s9.b(this);
        }
        for (j8.d dVar : b10) {
            if (dVar != null) {
                m.a aVar = m.f8970m;
                dVar.resumeWith(m.a(s.f8976a));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final S[] f() {
        return this.f8808m;
    }
}
