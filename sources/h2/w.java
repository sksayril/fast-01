package h2;

import android.os.Bundle;
import f2.a;

public class w implements a.d {

    /* renamed from: c  reason: collision with root package name */
    public static final w f9262c = c().a();

    /* renamed from: b  reason: collision with root package name */
    private final String f9263b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f9264a;

        /* synthetic */ a(z zVar) {
        }

        public w a() {
            return new w(this.f9264a, (a0) null);
        }
    }

    /* synthetic */ w(String str, a0 a0Var) {
        this.f9263b = str;
    }

    public static a c() {
        return new a((z) null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f9263b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return o.a(this.f9263b, ((w) obj).f9263b);
    }

    public final int hashCode() {
        return o.b(this.f9263b);
    }
}
