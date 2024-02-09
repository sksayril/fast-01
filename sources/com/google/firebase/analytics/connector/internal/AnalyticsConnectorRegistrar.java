package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import q4.d;
import t3.f;
import u3.a;
import w3.c;
import w3.r;
import z4.h;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.c(a.class).b(r.i(f.class)).b(r.i(Context.class)).b(r.i(d.class)).e(b.f7197a).d().c(), h.b("fire-analytics", "21.5.0")});
    }
}
