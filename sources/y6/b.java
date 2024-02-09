package y6;

import java.nio.ByteBuffer;
import y6.c;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c f13284m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f13285n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f13286o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c.f f13287p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f13288q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f13289r;

    public /* synthetic */ b(c cVar, String str, int i10, c.f fVar, ByteBuffer byteBuffer, long j10) {
        this.f13284m = cVar;
        this.f13285n = str;
        this.f13286o = i10;
        this.f13287p = fVar;
        this.f13288q = byteBuffer;
        this.f13289r = j10;
    }

    public final void run() {
        this.f13284m.m(this.f13285n, this.f13286o, this.f13287p, this.f13288q, this.f13289r);
    }
}
