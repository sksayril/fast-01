package com.almoullim.background_location;

import android.content.Context;
import c7.a;
import d7.c;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class a implements c7.a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    public static final C0084a f3903m = new C0084a((g) null);

    /* renamed from: com.almoullim.background_location.a$a  reason: collision with other inner class name */
    public static final class C0084a {
        private C0084a() {
        }

        public /* synthetic */ C0084a(g gVar) {
            this();
        }
    }

    public void onAttachedToActivity(c cVar) {
        l.e(cVar, "binding");
        b a10 = b.f3904u.a();
        a10.l(cVar);
        cVar.b(a10);
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "binding");
        b a10 = b.f3904u.a();
        Context a11 = bVar.a();
        l.d(a11, "getApplicationContext(...)");
        k7.c b10 = bVar.b();
        l.d(b10, "getBinaryMessenger(...)");
        a10.h(a11, b10);
    }

    public void onDetachedFromActivity() {
        b.f3904u.a().l((c) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        b.f3904u.a().i();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        l.e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
