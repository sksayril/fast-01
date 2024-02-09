package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import d3.j;
import d3.k;
import d3.m;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import t3.f;

@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static j<Void> didReinitializeFirebaseCore() {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(kVar));
        return kVar.a();
    }

    static j<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(fVar, kVar));
        return kVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(k kVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> value : registeredPlugins.entrySet()) {
                m.a(((FlutterFirebasePlugin) value.getValue()).didReinitializeFirebaseCore());
            }
            kVar.c(null);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(f fVar, k kVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), m.a(((FlutterFirebasePlugin) next.getValue()).getPluginConstantsForFirebaseApp(fVar)));
            }
            kVar.c(hashMap);
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
