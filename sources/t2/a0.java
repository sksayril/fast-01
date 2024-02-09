package t2;

import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import w2.v;

final class a0 extends v {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final w f12335c;

    a0(w wVar) {
        this.f12335c = wVar;
    }

    public final void W0(LocationAvailability locationAvailability) {
        this.f12335c.zza().c(new y(this, locationAvailability));
    }

    public final void Z2(LocationResult locationResult) {
        this.f12335c.zza().c(new x(this, locationResult));
    }

    /* access modifiers changed from: package-private */
    public final a0 e3(c cVar) {
        this.f12335c.b(cVar);
        return this;
    }

    public final void f() {
        this.f12335c.zza().c(new z(this));
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f12335c.zza().a();
    }
}
