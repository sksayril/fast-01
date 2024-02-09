package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c7.a;
import d3.j;
import d3.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k7.k;
import t3.f;

public class n implements FlutterFirebasePlugin, c7.a, k.c {

    /* renamed from: m  reason: collision with root package name */
    private k f10413m;

    class a extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f10414m;

        a(boolean z9) {
            this.f10414m = z9;
            put("unsentReports", Boolean.valueOf(z9));
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f10416m;

        b(boolean z9) {
            this.f10416m = z9;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z9));
        }
    }

    class c extends HashMap<String, Object> {
        c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(f.o())));
        }
    }

    class d extends HashMap<String, Object> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f f10419m;

        d(f fVar) {
            this.f10419m = fVar;
            if (fVar.q().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(f.o())));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void A(d3.k kVar) {
        try {
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(d3.k kVar, f fVar) {
        try {
            kVar.c(new d(fVar));
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void C(Map map, d3.k kVar) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().f((String) obj);
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void D(k.d dVar, j jVar) {
        if (jVar.q()) {
            dVar.a(jVar.n());
            return;
        }
        Exception m10 = jVar.m();
        dVar.b("firebase_crashlytics", m10 != null ? m10.getMessage() : "An unknown error occurred", (Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(Map map, d3.k kVar) {
        FlutterError flutterError;
        try {
            com.google.firebase.crashlytics.a d10 = com.google.firebase.crashlytics.a.d();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("buildId");
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            if (str4.length() > 0) {
                com.google.firebase.crashlytics.b.b(str4);
            }
            if (str2 != null) {
                d10.k("flutter_error_reason", "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            d10.k("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj5 = map.get("stackTraceElements");
            Objects.requireNonNull(obj5);
            for (Map s9 : (List) obj5) {
                StackTraceElement s10 = s(s9);
                if (s10 != null) {
                    arrayList.add(s10);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                d10.f(str3);
            }
            if (booleanValue) {
                com.google.firebase.crashlytics.b.a(flutterError);
            } else {
                d10.g(flutterError);
            }
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void F(d3.k kVar) {
        try {
            com.google.firebase.crashlytics.a.d().h();
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(Map map, d3.k kVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().i((Boolean) obj);
            kVar.c(new c());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void H(Map map, d3.k kVar) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            com.google.firebase.crashlytics.a.d().k((String) obj, (String) obj2);
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void I(Map map, d3.k kVar) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().l((String) obj);
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    private j<Void> J(Map<String, Object> map) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(map, kVar));
        return kVar.a();
    }

    private j<Void> K(Map<String, Object> map) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, map, kVar));
        return kVar.a();
    }

    private j<Void> L() {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(kVar));
        return kVar.a();
    }

    private j<Map<String, Object>> M(Map<String, Object> map) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, map, kVar));
        return kVar.a();
    }

    private j<Void> N(Map<String, Object> map) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(map, kVar));
        return kVar.a();
    }

    private j<Void> O(Map<String, Object> map) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(map, kVar));
        return kVar.a();
    }

    private j<Map<String, Object>> o() {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, kVar));
        return kVar.a();
    }

    private void p() {
        new Handler(Looper.myLooper()).postDelayed(d.f10394m, 50);
    }

    private j<Void> q() {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(kVar));
        return kVar.a();
    }

    private j<Map<String, Object>> r() {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, kVar));
        return kVar.a();
    }

    private StackTraceElement s(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get("line");
            String str3 = map.get("class");
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void u(k7.c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_crashlytics");
        this.f10413m = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* access modifiers changed from: private */
    public boolean v(f fVar) {
        SharedPreferences t9 = t(fVar.m());
        if (t9.contains("firebase_crashlytics_collection_enabled")) {
            return t9.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!fVar.x()) {
            return false;
        }
        com.google.firebase.crashlytics.a.d().j(true);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(d3.k kVar) {
        try {
            kVar.c(new a(((Boolean) m.a(com.google.firebase.crashlytics.a.d().a())).booleanValue()));
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void x() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y(d3.k kVar) {
        try {
            com.google.firebase.crashlytics.a.d().b();
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(d3.k kVar) {
        try {
            kVar.c(new b(com.google.firebase.crashlytics.a.d().c()));
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public j<Void> didReinitializeFirebaseCore() {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(kVar));
        return kVar.a();
    }

    public j<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        d3.k kVar = new d3.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, kVar, fVar));
        return kVar.a();
    }

    public void onAttachedToEngine(a.b bVar) {
        u(bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f10413m;
        if (kVar != null) {
            kVar.e((k.c) null);
            this.f10413m = null;
        }
    }

    public void onMethodCall(k7.j jVar, k.d dVar) {
        j jVar2;
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2094964816:
                if (str.equals("Crashlytics#didCrashOnPreviousExecution")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1437158995:
                if (str.equals("Crashlytics#recordError")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1025128541:
                if (str.equals("Crashlytics#checkForUnsentReports")) {
                    c10 = 2;
                    break;
                }
                break;
            case -424770276:
                if (str.equals("Crashlytics#sendUnsentReports")) {
                    c10 = 3;
                    break;
                }
                break;
            case -108157790:
                if (str.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 28093114:
                if (str.equals("Crashlytics#log")) {
                    c10 = 5;
                    break;
                }
                break;
            case 108415030:
                if (str.equals("Crashlytics#setCustomKey")) {
                    c10 = 6;
                    break;
                }
                break;
            case 213629529:
                if (str.equals("Crashlytics#deleteUnsentReports")) {
                    c10 = 7;
                    break;
                }
                break;
            case 679831756:
                if (str.equals("Crashlytics#setUserIdentifier")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1219454365:
                if (str.equals("Crashlytics#crash")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                jVar2 = r();
                break;
            case 1:
                jVar2 = K((Map) jVar.b());
                break;
            case 2:
                jVar2 = o();
                break;
            case 3:
                jVar2 = L();
                break;
            case 4:
                jVar2 = M((Map) jVar.b());
                break;
            case 5:
                jVar2 = J((Map) jVar.b());
                break;
            case 6:
                jVar2 = N((Map) jVar.b());
                break;
            case 7:
                jVar2 = q();
                break;
            case 8:
                jVar2 = O((Map) jVar.b());
                break;
            case 9:
                p();
                return;
            default:
                dVar.c();
                return;
        }
        jVar2.b(new a(dVar));
    }
}
