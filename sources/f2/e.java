package f2;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.r;
import f2.a;
import f2.a.d;
import g2.b;
import g2.c0;
import g2.j;
import g2.o;
import h2.e;
import h2.p;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import l2.k;

public abstract class e<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8736a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8737b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8738c;

    /* renamed from: d  reason: collision with root package name */
    private final a.d f8739d;

    /* renamed from: e  reason: collision with root package name */
    private final b f8740e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f8741f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8742g;

    /* renamed from: h  reason: collision with root package name */
    private final f f8743h;

    /* renamed from: i  reason: collision with root package name */
    private final j f8744i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f8745j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8746c = new C0136a().a();

        /* renamed from: a  reason: collision with root package name */
        public final j f8747a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f8748b;

        /* renamed from: f2.e$a$a  reason: collision with other inner class name */
        public static class C0136a {

            /* renamed from: a  reason: collision with root package name */
            private j f8749a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f8750b;

            public a a() {
                if (this.f8749a == null) {
                    this.f8749a = new g2.a();
                }
                if (this.f8750b == null) {
                    this.f8750b = Looper.getMainLooper();
                }
                return new a(this.f8749a, this.f8750b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f8747a = jVar;
            this.f8748b = looper;
        }
    }

    public e(Activity activity, a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    private e(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        p.k(context, "Null context is not permitted.");
        p.k(aVar, "Api must not be null.");
        p.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f8736a = context.getApplicationContext();
        String str = null;
        if (k.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f8737b = str;
        this.f8738c = aVar;
        this.f8739d = dVar;
        this.f8741f = aVar2.f8748b;
        b a10 = b.a(aVar, dVar, str);
        this.f8740e = a10;
        this.f8743h = new o(this);
        com.google.android.gms.common.api.internal.b x9 = com.google.android.gms.common.api.internal.b.x(this.f8736a);
        this.f8745j = x9;
        this.f8742g = x9.m();
        this.f8744i = aVar2.f8747a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.k.u(activity, x9, a10);
        }
        x9.b(this);
    }

    public e(Context context, a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    private final d3.j p(int i10, g gVar) {
        d3.k kVar = new d3.k();
        this.f8745j.F(this, i10, gVar, kVar, this.f8744i);
        return kVar.a();
    }

    /* access modifiers changed from: protected */
    public e.a f() {
        Account account;
        GoogleSignInAccount b10;
        GoogleSignInAccount b11;
        e.a aVar = new e.a();
        a.d dVar = this.f8739d;
        if (!(dVar instanceof a.d.b) || (b11 = ((a.d.b) dVar).b()) == null) {
            a.d dVar2 = this.f8739d;
            account = dVar2 instanceof a.d.C0135a ? ((a.d.C0135a) dVar2).a() : null;
        } else {
            account = b11.d();
        }
        aVar.d(account);
        a.d dVar3 = this.f8739d;
        aVar.c((!(dVar3 instanceof a.d.b) || (b10 = ((a.d.b) dVar3).b()) == null) ? Collections.emptySet() : b10.z());
        aVar.e(this.f8736a.getClass().getName());
        aVar.b(this.f8736a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> d3.j<TResult> g(g<A, TResult> gVar) {
        return p(2, gVar);
    }

    public <TResult, A extends a.b> d3.j<TResult> h(g<A, TResult> gVar) {
        return p(0, gVar);
    }

    public <A extends a.b> d3.j<Void> i(f<A, ?> fVar) {
        p.j(fVar);
        p.k(fVar.f4973a.b(), "Listener has already been released.");
        p.k(fVar.f4974b.a(), "Listener has already been released.");
        return this.f8745j.z(this, fVar.f4973a, fVar.f4974b, fVar.f4975c);
    }

    public d3.j<Boolean> j(c.a<?> aVar, int i10) {
        p.k(aVar, "Listener key cannot be null.");
        return this.f8745j.A(this, aVar, i10);
    }

    public final b<O> k() {
        return this.f8740e;
    }

    /* access modifiers changed from: protected */
    public String l() {
        return this.f8737b;
    }

    public final int m() {
        return this.f8742g;
    }

    public final a.f n(Looper looper, r rVar) {
        Looper looper2 = looper;
        a.f a10 = ((a.C0134a) p.j(this.f8738c.a())).a(this.f8736a, looper2, f().a(), this.f8739d, rVar, rVar);
        String l10 = l();
        if (l10 != null && (a10 instanceof h2.c)) {
            ((h2.c) a10).P(l10);
        }
        if (l10 != null && (a10 instanceof g2.g)) {
            ((g2.g) a10).r(l10);
        }
        return a10;
    }

    public final c0 o(Context context, Handler handler) {
        return new c0(context, handler, f().a());
    }
}
