package i4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.internal.common.b0;
import com.google.firebase.crashlytics.internal.common.k0;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.crashlytics.internal.common.x;
import com.google.firebase.crashlytics.internal.common.y;
import d3.i;
import d3.j;
import d3.k;
import d3.m;
import f4.b;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import z3.g;

public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9472a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f9473b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final g f9474c;

    /* renamed from: d  reason: collision with root package name */
    private final w f9475d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final a f9476e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final k f9477f;

    /* renamed from: g  reason: collision with root package name */
    private final x f9478g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<d> f9479h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<k<d>> f9480i = new AtomicReference<>(new k());

    class a implements i<Void, Void> {
        a() {
        }

        /* renamed from: b */
        public j<Void> a(Void voidR) {
            JSONObject a10 = f.this.f9477f.a(f.this.f9473b, true);
            if (a10 != null) {
                d b10 = f.this.f9474c.b(a10);
                f.this.f9476e.c(b10.f9461c, a10);
                f.this.q(a10, "Loaded settings: ");
                f fVar = f.this;
                boolean unused = fVar.r(fVar.f9473b.f9488f);
                f.this.f9479h.set(b10);
                ((k) f.this.f9480i.get()).e(b10);
            }
            return m.e(null);
        }
    }

    f(Context context, j jVar, w wVar, g gVar, a aVar, k kVar, x xVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f9479h = atomicReference;
        this.f9472a = context;
        this.f9473b = jVar;
        this.f9475d = wVar;
        this.f9474c = gVar;
        this.f9476e = aVar;
        this.f9477f = kVar;
        this.f9478g = xVar;
        atomicReference.set(b.b(wVar));
    }

    public static f l(Context context, String str, b0 b0Var, b bVar, String str2, String str3, g4.f fVar, x xVar) {
        String g10 = b0Var.g();
        k0 k0Var = new k0();
        g gVar = new g(k0Var);
        a aVar = new a(fVar);
        c cVar = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h10 = b0Var.h();
        String i10 = b0Var.i();
        String j10 = b0Var.j();
        String h11 = com.google.firebase.crashlytics.internal.common.i.h(com.google.firebase.crashlytics.internal.common.i.m(context), str, str3, str2);
        return new f(context, new j(str, h10, i10, j10, b0Var, h11, str3, str2, y.determineFrom(g10).getId()), k0Var, gVar, aVar, cVar, xVar);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                return null;
            }
            JSONObject b10 = this.f9476e.b();
            if (b10 != null) {
                d b11 = this.f9474c.b(b10);
                if (b11 != null) {
                    q(b10, "Loaded cached settings: ");
                    long a10 = this.f9475d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar)) {
                        if (b11.a(a10)) {
                            g.f().i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        g.f().i("Returning cached settings.");
                        return b11;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = b11;
                        g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    g.f().e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                g.f().b("No cached settings data found.");
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            g.f().e("Failed to get cached settings", e);
            return dVar;
        }
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.q(this.f9472a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        g f10 = g.f();
        f10.b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.internal.common.i.q(this.f9472a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public j<d> a() {
        return this.f9480i.get().a();
    }

    public d b() {
        return this.f9479h.get();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return !n().equals(this.f9473b.f9488f);
    }

    public j<Void> o(e eVar, Executor executor) {
        d m10;
        if (k() || (m10 = m(eVar)) == null) {
            d m11 = m(e.IGNORE_CACHE_EXPIRATION);
            if (m11 != null) {
                this.f9479h.set(m11);
                this.f9480i.get().e(m11);
            }
            return this.f9478g.k(executor).s(executor, new a());
        }
        this.f9479h.set(m10);
        this.f9480i.get().e(m10);
        return m.e(null);
    }

    public j<Void> p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
