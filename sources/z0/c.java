package z0;

import a1.b;
import android.location.Address;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import k7.j;
import k7.k;
import k7.s;

final class c implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final a f13465m;

    /* renamed from: n  reason: collision with root package name */
    private k f13466n;

    c(a aVar) {
        this.f13465m = aVar;
    }

    private void a(j jVar, k.d dVar) {
        String str = (String) jVar.a("address");
        String str2 = (String) jVar.a("localeIdentifier");
        if (str == null || str.isEmpty()) {
            dVar.b("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", (Object) null);
        }
        try {
            List<Address> b10 = this.f13465m.b(str, a1.c.a(str2));
            if (b10 != null) {
                if (!b10.isEmpty()) {
                    dVar.a(b.c(b10));
                    return;
                }
            }
            dVar.b("NOT_FOUND", String.format("No coordinates found for '%s'", new Object[]{str}), (Object) null);
        } catch (IOException unused) {
            dVar.b("IO_ERROR", String.format("A network error occurred trying to lookup the address ''.", new Object[]{str}), (Object) null);
        }
    }

    private void b(j jVar, k.d dVar) {
        j jVar2 = jVar;
        k.d dVar2 = dVar;
        double doubleValue = ((Double) jVar2.a("latitude")).doubleValue();
        double doubleValue2 = ((Double) jVar2.a("longitude")).doubleValue();
        try {
            List<Address> c10 = this.f13465m.c(doubleValue, doubleValue2, a1.c.a((String) jVar2.a("localeIdentifier")));
            if (c10 != null) {
                if (!c10.isEmpty()) {
                    dVar2.a(b.b(c10));
                    return;
                }
            }
            dVar2.b("NOT_FOUND", String.format("No address information found for supplied coordinates (latitude: %f, longitude: %f).", new Object[]{Double.valueOf(doubleValue), Double.valueOf(doubleValue2)}), (Object) null);
        } catch (IOException unused) {
            dVar2.b("IO_ERROR", String.format("A network error occurred trying to lookup the supplied coordinates (latitude: %f, longitude: %f).", new Object[]{Double.valueOf(doubleValue), Double.valueOf(doubleValue2)}), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(k7.c cVar) {
        if (this.f13466n != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            d();
        }
        k kVar = new k(cVar, "flutter.baseflow.com/geocoding", s.f11011b, cVar.d());
        this.f13466n = kVar;
        kVar.e(this);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        k kVar = this.f13466n;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e((k.c) null);
        this.f13466n = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        if (str.equals("placemarkFromCoordinates")) {
            b(jVar, dVar);
        } else if (!str.equals("locationFromAddress")) {
            dVar.c();
        } else {
            a(jVar, dVar);
        }
    }
}
