package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import k4.a;
import n1.g;
import w3.c;
import w3.r;
import z4.h;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.c(g.class).g(LIBRARY_NAME).b(r.i(Context.class)).e(a.f10965a).c(), h.b(LIBRARY_NAME, "18.1.8")});
    }
}
