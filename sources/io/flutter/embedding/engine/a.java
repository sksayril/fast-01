package io.flutter.embedding.engine;

import a7.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import d8.h;
import io.flutter.embedding.engine.systemchannels.f;
import io.flutter.embedding.engine.systemchannels.g;
import io.flutter.embedding.engine.systemchannels.i;
import io.flutter.embedding.engine.systemchannels.j;
import io.flutter.embedding.engine.systemchannels.m;
import io.flutter.embedding.engine.systemchannels.n;
import io.flutter.embedding.engine.systemchannels.o;
import io.flutter.embedding.engine.systemchannels.p;
import io.flutter.embedding.engine.systemchannels.q;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y6.a;

public class a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f9798a;

    /* renamed from: b  reason: collision with root package name */
    private final j7.a f9799b;

    /* renamed from: c  reason: collision with root package name */
    private final y6.a f9800c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9801d;

    /* renamed from: e  reason: collision with root package name */
    private final l7.a f9802e;

    /* renamed from: f  reason: collision with root package name */
    private final io.flutter.embedding.engine.systemchannels.a f9803f;

    /* renamed from: g  reason: collision with root package name */
    private final io.flutter.embedding.engine.systemchannels.b f9804g;

    /* renamed from: h  reason: collision with root package name */
    private final f f9805h;

    /* renamed from: i  reason: collision with root package name */
    private final g f9806i;

    /* renamed from: j  reason: collision with root package name */
    private final io.flutter.embedding.engine.systemchannels.h f9807j;

    /* renamed from: k  reason: collision with root package name */
    private final i f9808k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final m f9809l;

    /* renamed from: m  reason: collision with root package name */
    private final j f9810m;

    /* renamed from: n  reason: collision with root package name */
    private final n f9811n;

    /* renamed from: o  reason: collision with root package name */
    private final o f9812o;

    /* renamed from: p  reason: collision with root package name */
    private final p f9813p;

    /* renamed from: q  reason: collision with root package name */
    private final q f9814q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final io.flutter.plugin.platform.q f9815r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final Set<b> f9816s;

    /* renamed from: t  reason: collision with root package name */
    private final b f9817t;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    class C0152a implements b {
        C0152a() {
        }

        public void a() {
        }

        public void b() {
            x6.b.f("FlutterEngine", "onPreEngineRestart()");
            for (b b10 : a.this.f9816s) {
                b10.b();
            }
            a.this.f9815r.m0();
            a.this.f9809l.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, (String[]) null);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z9) {
        this(context, dVar, flutterJNI, qVar, strArr, z9, false);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z9, boolean z10) {
        this(context, dVar, flutterJNI, qVar, strArr, z9, z10, (d) null);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.q qVar, String[] strArr, boolean z9, boolean z10, d dVar2) {
        AssetManager assetManager;
        this.f9816s = new HashSet();
        this.f9817t = new C0152a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        x6.a e10 = x6.a.e();
        flutterJNI = flutterJNI == null ? e10.d().a() : flutterJNI;
        this.f9798a = flutterJNI;
        y6.a aVar = new y6.a(flutterJNI, assetManager);
        this.f9800c = aVar;
        aVar.p();
        z6.a a10 = x6.a.e().a();
        this.f9803f = new io.flutter.embedding.engine.systemchannels.a(aVar, flutterJNI);
        io.flutter.embedding.engine.systemchannels.b bVar = new io.flutter.embedding.engine.systemchannels.b(aVar);
        this.f9804g = bVar;
        this.f9805h = new f(aVar);
        g gVar = new g(aVar);
        this.f9806i = gVar;
        this.f9807j = new io.flutter.embedding.engine.systemchannels.h(aVar);
        this.f9808k = new i(aVar);
        this.f9810m = new j(aVar);
        this.f9809l = new m(aVar, z10);
        this.f9811n = new n(aVar);
        this.f9812o = new o(aVar);
        this.f9813p = new p(aVar);
        this.f9814q = new q(aVar);
        if (a10 != null) {
            a10.f(bVar);
        }
        l7.a aVar2 = new l7.a(context, gVar);
        this.f9802e = aVar2;
        dVar = dVar == null ? e10.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f9817t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e10.a());
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f9799b = new j7.a(flutterJNI);
        this.f9815r = qVar;
        qVar.g0();
        this.f9801d = new c(context.getApplicationContext(), this, dVar, dVar2);
        aVar2.d(context.getResources().getConfiguration());
        if (z9 && dVar.d()) {
            i7.a.a(this);
        }
        h.c(context, this);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, String[] strArr, boolean z9) {
        this(context, dVar, flutterJNI, new io.flutter.plugin.platform.q(), strArr, z9);
    }

    public a(Context context, String[] strArr) {
        this(context, (d) null, (FlutterJNI) null, strArr, true);
    }

    private void f() {
        x6.b.f("FlutterEngine", "Attaching to JNI.");
        this.f9798a.attachToNative();
        if (!x()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean x() {
        return this.f9798a.isAttached();
    }

    public void a(float f10, float f11, float f12) {
        this.f9798a.updateDisplayMetrics(0, f10, f11, f12);
    }

    public void e(b bVar) {
        this.f9816s.add(bVar);
    }

    public void g() {
        x6.b.f("FlutterEngine", "Destroying.");
        for (b a10 : this.f9816s) {
            a10.a();
        }
        this.f9801d.c();
        this.f9815r.i0();
        this.f9800c.q();
        this.f9798a.removeEngineLifecycleListener(this.f9817t);
        this.f9798a.setDeferredComponentManager((z6.a) null);
        this.f9798a.detachFromNativeAndReleaseResources();
        if (x6.a.e().a() != null) {
            x6.a.e().a().d();
            this.f9804g.c((z6.a) null);
        }
    }

    public io.flutter.embedding.engine.systemchannels.a h() {
        return this.f9803f;
    }

    public d7.b i() {
        return this.f9801d;
    }

    public y6.a j() {
        return this.f9800c;
    }

    public f k() {
        return this.f9805h;
    }

    public l7.a l() {
        return this.f9802e;
    }

    public io.flutter.embedding.engine.systemchannels.h m() {
        return this.f9807j;
    }

    public i n() {
        return this.f9808k;
    }

    public j o() {
        return this.f9810m;
    }

    public io.flutter.plugin.platform.q p() {
        return this.f9815r;
    }

    public c7.b q() {
        return this.f9801d;
    }

    public j7.a r() {
        return this.f9799b;
    }

    public m s() {
        return this.f9809l;
    }

    public n t() {
        return this.f9811n;
    }

    public o u() {
        return this.f9812o;
    }

    public p v() {
        return this.f9813p;
    }

    public q w() {
        return this.f9814q;
    }

    /* access modifiers changed from: package-private */
    public a y(Context context, a.c cVar, String str, List<String> list, io.flutter.plugin.platform.q qVar, boolean z9, boolean z10) {
        a.c cVar2 = cVar;
        if (x()) {
            String str2 = str;
            return new a(context, (d) null, this.f9798a.spawn(cVar2.f13282c, cVar2.f13281b, str, list), qVar, (String[]) null, z9, z10);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
}
