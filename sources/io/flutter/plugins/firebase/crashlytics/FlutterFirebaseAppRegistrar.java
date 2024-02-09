package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import w3.c;
import z4.h;

@Keep
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    public List<c<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-cls", "3.4.6"));
    }
}
