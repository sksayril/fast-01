package com.lyokone.location;

import android.util.Log;
import k7.c;
import k7.d;

class d implements d.C0170d {

    /* renamed from: m  reason: collision with root package name */
    private a f7654m;

    /* renamed from: n  reason: collision with root package name */
    private k7.d f7655n;

    d() {
    }

    public void a(Object obj, d.b bVar) {
        a aVar = this.f7654m;
        aVar.f7641y = bVar;
        if (aVar.f7629m == null) {
            bVar.b("NO_ACTIVITY", (String) null, (Object) null);
        } else if (!aVar.h()) {
            this.f7654m.r();
        } else {
            this.f7654m.w();
        }
    }

    public void b(Object obj) {
        a aVar = this.f7654m;
        aVar.f7630n.b(aVar.f7634r);
        this.f7654m.f7641y = null;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        this.f7654m = aVar;
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        if (this.f7655n != null) {
            Log.wtf("StreamHandlerImpl", "Setting a method call handler before the last was disposed.");
            e();
        }
        k7.d dVar = new k7.d(cVar, "lyokone/locationstream");
        this.f7655n = dVar;
        dVar.d(this);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        k7.d dVar = this.f7655n;
        if (dVar == null) {
            Log.d("StreamHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        dVar.d((d.C0170d) null);
        this.f7655n = null;
    }
}
