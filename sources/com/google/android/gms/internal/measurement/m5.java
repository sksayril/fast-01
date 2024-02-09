package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import p3.g;
import p3.k;

final class m5 extends m6 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5443a;

    /* renamed from: b  reason: collision with root package name */
    private final k<g<z5>> f5444b;

    m5(Context context, k<g<z5>> kVar) {
        Objects.requireNonNull(context, "Null context");
        this.f5443a = context;
        this.f5444b = kVar;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f5443a;
    }

    /* access modifiers changed from: package-private */
    public final k<g<z5>> b() {
        return this.f5444b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m6) {
            m6 m6Var = (m6) obj;
            if (this.f5443a.equals(m6Var.a())) {
                k<g<z5>> kVar = this.f5444b;
                k<g<z5>> b10 = m6Var.b();
                return kVar != null ? kVar.equals(b10) : b10 == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f5443a.hashCode() ^ 1000003) * 1000003;
        k<g<z5>> kVar = this.f5444b;
        return hashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5443a);
        String valueOf2 = String.valueOf(this.f5444b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
