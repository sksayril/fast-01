package f2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import f2.a.d;
import f2.f;
import g2.h;
import h2.c;
import h2.j;
import h2.p;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final C0134a f8730a;

    /* renamed from: b  reason: collision with root package name */
    private final g f8731b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8732c;

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    public static abstract class C0134a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, h2.e eVar, O o10, f.a aVar, f.b bVar) {
            return b(context, looper, eVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, h2.e eVar, O o10, g2.c cVar, h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8733a = new c((n) null);

        /* renamed from: f2.a$d$a  reason: collision with other inner class name */
        public interface C0135a extends d {
            Account a();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(n nVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        void c(j jVar, Set<Scope> set);

        Set<Scope> d();

        void e(String str);

        boolean f();

        int g();

        boolean h();

        e2.d[] i();

        String j();

        String k();

        void l(c.e eVar);

        void m();

        boolean n();

        void p(c.C0142c cVar);
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0134a<C, O> aVar, g<C> gVar) {
        p.k(aVar, "Cannot construct an Api with a null ClientBuilder");
        p.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f8732c = str;
        this.f8730a = aVar;
        this.f8731b = gVar;
    }

    public final C0134a a() {
        return this.f8730a;
    }

    public final String b() {
        return this.f8732c;
    }
}
