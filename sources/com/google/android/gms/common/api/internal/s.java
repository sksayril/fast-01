package com.google.android.gms.common.api.internal;

import e2.d;
import g2.b;
import g2.n;
import h2.o;

final class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f5031a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f5032b;

    /* synthetic */ s(b bVar, d dVar, n nVar) {
        this.f5031a = bVar;
        this.f5032b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            return o.a(this.f5031a, sVar.f5031a) && o.a(this.f5032b, sVar.f5032b);
        }
    }

    public final int hashCode() {
        return o.b(this.f5031a, this.f5032b);
    }

    public final String toString() {
        return o.c(this).a("key", this.f5031a).a("feature", this.f5032b).toString();
    }
}
