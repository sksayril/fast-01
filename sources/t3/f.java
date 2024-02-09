package t3;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import h2.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.k;
import l2.l;
import w3.g;
import w3.o;
import w3.x;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f12407k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, f> f12408l = new p.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f12409a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12410b;

    /* renamed from: c  reason: collision with root package name */
    private final n f12411c;

    /* renamed from: d  reason: collision with root package name */
    private final o f12412d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f12413e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f12414f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final x<y4.a> f12415g;

    /* renamed from: h  reason: collision with root package name */
    private final s4.b<r4.f> f12416h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f12417i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<g> f12418j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z9);
    }

    @TargetApi(14)
    private static class b implements a.C0087a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f12419a = new AtomicReference<>();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f12419a.get() == null) {
                    b bVar = new b();
                    if (f12419a.compareAndSet((Object) null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z9) {
            synchronized (f.f12407k) {
                Iterator it = new ArrayList(f.f12408l.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f12413e.get()) {
                        fVar.C(z9);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f12420b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f12421a;

        public c(Context context) {
            this.f12421a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f12420b.get() == null) {
                c cVar = new c(context);
                if (f12420b.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f12421a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (f.f12407k) {
                for (f d10 : f.f12408l.values()) {
                    d10.t();
                }
            }
            c();
        }
    }

    protected f(Context context, String str, n nVar) {
        this.f12409a = (Context) p.j(context);
        this.f12410b = p.f(str);
        this.f12411c = (n) p.j(nVar);
        o b10 = FirebaseInitProvider.b();
        f5.c.b("Firebase");
        f5.c.b("ComponentDiscovery");
        List<s4.b<ComponentRegistrar>> b11 = g.c(context, ComponentDiscoveryService.class).b();
        f5.c.a();
        f5.c.b("Runtime");
        o.b g10 = o.m(x3.k.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(w3.c.s(context, Context.class, new Class[0])).b(w3.c.s(this, f.class, new Class[0])).b(w3.c.s(nVar, n.class, new Class[0])).g(new f5.b());
        if (androidx.core.os.o.a(context) && FirebaseInitProvider.c()) {
            g10.b(w3.c.s(b10, o.class, new Class[0]));
        }
        o e10 = g10.e();
        this.f12412d = e10;
        f5.c.a();
        this.f12415g = new x<>(new d(this, context));
        this.f12416h = e10.e(r4.f.class);
        g(new e(this));
        f5.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(boolean z9) {
        if (!z9) {
            this.f12416h.get().k();
        }
    }

    private static String B(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void C(boolean z9) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a10 : this.f12417i) {
            a10.a(z9);
        }
    }

    private void D() {
        for (g a10 : this.f12418j) {
            a10.a(this.f12410b, this.f12411c);
        }
    }

    private void i() {
        p.n(!this.f12414f.get(), "FirebaseApp was deleted");
    }

    private static List<String> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f12407k) {
            for (f q9 : f12408l.values()) {
                arrayList.add(q9.q());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<f> n(Context context) {
        ArrayList arrayList;
        synchronized (f12407k) {
            arrayList = new ArrayList(f12408l.values());
        }
        return arrayList;
    }

    public static f o() {
        f fVar;
        synchronized (f12407k) {
            fVar = f12408l.get("[DEFAULT]");
            if (fVar != null) {
                fVar.f12416h.get().k();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + l.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    public static f p(String str) {
        f fVar;
        String str2;
        synchronized (f12407k) {
            fVar = f12408l.get(B(str));
            if (fVar != null) {
                fVar.f12416h.get().k();
            } else {
                List<String> l10 = l();
                if (l10.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", l10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    public void t() {
        if (!androidx.core.os.o.a(this.f12409a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f12409a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f12412d.p(y());
        this.f12416h.get().k();
    }

    public static f u(Context context) {
        synchronized (f12407k) {
            if (f12408l.containsKey("[DEFAULT]")) {
                f o10 = o();
                return o10;
            }
            n a10 = n.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            f v9 = v(context, a10);
            return v9;
        }
    }

    public static f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static f w(Context context, n nVar, String str) {
        f fVar;
        b.c(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f12407k) {
            Map<String, f> map = f12408l;
            boolean z9 = !map.containsKey(B);
            p.n(z9, "FirebaseApp name " + B + " already exists!");
            p.k(context, "Application context cannot be null.");
            fVar = new f(context, B, nVar);
            map.put(B, fVar);
        }
        fVar.t();
        return fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ y4.a z(Context context) {
        return new y4.a(context, s(), (q4.c) this.f12412d.a(q4.c.class));
    }

    public void E(boolean z9) {
        boolean z10;
        i();
        if (this.f12413e.compareAndSet(!z9, z9)) {
            boolean d10 = com.google.android.gms.common.api.internal.a.b().d();
            if (z9 && d10) {
                z10 = true;
            } else if (!z9 && d10) {
                z10 = false;
            } else {
                return;
            }
            C(z10);
        }
    }

    public void F(Boolean bool) {
        i();
        this.f12415g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f12410b.equals(((f) obj).q());
    }

    public void g(a aVar) {
        i();
        if (this.f12413e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f12417i.add(aVar);
    }

    public void h(g gVar) {
        i();
        p.j(gVar);
        this.f12418j.add(gVar);
    }

    public int hashCode() {
        return this.f12410b.hashCode();
    }

    public void j() {
        if (this.f12414f.compareAndSet(false, true)) {
            synchronized (f12407k) {
                f12408l.remove(this.f12410b);
            }
            D();
        }
    }

    public <T> T k(Class<T> cls) {
        i();
        return this.f12412d.a(cls);
    }

    public Context m() {
        i();
        return this.f12409a;
    }

    public String q() {
        i();
        return this.f12410b;
    }

    public n r() {
        i();
        return this.f12411c;
    }

    public String s() {
        return l2.c.a(q().getBytes(Charset.defaultCharset())) + "+" + l2.c.a(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return h2.o.c(this).a("name", this.f12410b).a("options", this.f12411c).toString();
    }

    public boolean x() {
        i();
        return this.f12415g.get().b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
