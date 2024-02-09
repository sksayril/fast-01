package h2;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import e2.e;
import f2.a;
import f2.f;
import g2.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class h<T extends IInterface> extends c<T> implements a.f {
    private final e F;
    private final Set G;
    private final Account H;

    @Deprecated
    protected h(Context context, Looper looper, int i10, e eVar, f.a aVar, f.b bVar) {
        this(context, looper, i10, eVar, (c) aVar, (g2.h) bVar);
    }

    protected h(Context context, Looper looper, int i10, e eVar, c cVar, g2.h hVar) {
        this(context, looper, i.b(context), e.m(), i10, eVar, (c) p.j(cVar), (g2.h) p.j(hVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected h(android.content.Context r11, android.os.Looper r12, h2.i r13, e2.e r14, int r15, h2.e r16, g2.c r17, g2.h r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            h2.g0 r3 = new h2.g0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            h2.h0 r0 = new h2.h0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.h()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.F = r0
            android.accounts.Account r1 = r16.a()
            r9.H = r1
            java.util.Set r0 = r16.c()
            java.util.Set r0 = r10.k0(r0)
            r9.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.<init>(android.content.Context, android.os.Looper, h2.i, e2.e, int, h2.e, g2.c, g2.h):void");
    }

    private final Set k0(Set set) {
        Set<Scope> j02 = j0(set);
        for (Scope contains : j02) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return j02;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> C() {
        return this.G;
    }

    public Set<Scope> d() {
        return n() ? this.G : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> j0(Set<Scope> set) {
        return set;
    }

    public final Account u() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public final Executor w() {
        return null;
    }
}
