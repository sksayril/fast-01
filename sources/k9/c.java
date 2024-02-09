package k9;

import g9.h0;

public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f11037a = new h0("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final h0 f11038b = new h0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z9) {
        return new b(z9);
    }

    public static /* synthetic */ a b(boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return a(z9);
    }
}
