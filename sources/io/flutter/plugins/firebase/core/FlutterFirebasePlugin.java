package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import d3.j;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t3.f;

@Keep
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    j<Void> didReinitializeFirebaseCore();

    j<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar);
}
