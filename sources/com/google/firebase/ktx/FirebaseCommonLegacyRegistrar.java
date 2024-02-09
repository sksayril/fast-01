package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import w3.c;
import z4.h;

@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public List<c<?>> getComponents() {
        return m.b(h.b("fire-core-ktx", "20.4.2"));
    }
}
