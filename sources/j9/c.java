package j9;

import b9.l;
import g8.s;
import g9.h0;
import kotlin.jvm.internal.m;
import r8.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f10876a = a.f10882m;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f10877b = new h0("STATE_REG");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f10878c = new h0("STATE_COMPLETED");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f10879d = new h0("STATE_CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f10880e = new h0("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final h0 f10881f = new h0("PARAM_CLAUSE_0");

    static final class a extends m implements q {

        /* renamed from: m  reason: collision with root package name */
        public static final a f10882m = new a();

        a() {
            super(3);
        }

        /* renamed from: b */
        public final Void a(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final d a(int i10) {
        if (i10 == 0) {
            return d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return d.REREGISTER;
        }
        if (i10 == 2) {
            return d.CANCELLED;
        }
        if (i10 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* access modifiers changed from: private */
    public static final boolean h(l<? super s> lVar, r8.l<? super Throwable, s> lVar2) {
        Object j10 = lVar.j(s.f8976a, (Object) null, lVar2);
        if (j10 == null) {
            return false;
        }
        lVar.n(j10);
        return true;
    }
}
