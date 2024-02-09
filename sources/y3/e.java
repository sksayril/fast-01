package y3;

import a4.b;
import android.os.Bundle;
import java.util.Locale;
import u3.a;
import z3.g;

class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private b f13237a;

    /* renamed from: b  reason: collision with root package name */
    private b f13238b;

    e() {
    }

    private static void b(b bVar, String str, Bundle bundle) {
        if (bVar != null) {
            bVar.S(str, bundle);
        }
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f13237a : this.f13238b, str, bundle);
    }

    public void a(int i10, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i10), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(b bVar) {
        this.f13238b = bVar;
    }

    public void e(b bVar) {
        this.f13237a = bVar;
    }
}
