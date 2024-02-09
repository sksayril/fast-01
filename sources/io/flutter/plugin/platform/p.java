package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.l;
import io.flutter.plugin.platform.q;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q.a f10115m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ r f10116n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ float f10117o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ l.b f10118p;

    public /* synthetic */ p(q.a aVar, r rVar, float f10, l.b bVar) {
        this.f10115m = aVar;
        this.f10116n = rVar;
        this.f10117o = f10;
        this.f10118p = bVar;
    }

    public final void run() {
        this.f10115m.k(this.f10116n, this.f10117o, this.f10118p);
    }
}
