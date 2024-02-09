package b9;

import g9.h0;

public final class z1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f3521a = new h0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f3522b = new h0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f3523c = new h0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f3524d = new h0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f3525e = new h0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a1 f3526f = new a1(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final a1 f3527g = new a1(true);

    public static final Object g(Object obj) {
        return obj instanceof m1 ? new n1((m1) obj) : obj;
    }

    public static final Object h(Object obj) {
        m1 m1Var;
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        return (n1Var == null || (m1Var = n1Var.f3471a) == null) ? obj : m1Var;
    }
}
