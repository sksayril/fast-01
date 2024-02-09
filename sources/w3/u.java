package w3;

import java.util.Map;
import q4.a;
import q4.b;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f12938m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ a f12939n;

    public /* synthetic */ u(Map.Entry entry, a aVar) {
        this.f12938m = entry;
        this.f12939n = aVar;
    }

    public final void run() {
        ((b) this.f12938m.getKey()).a(this.f12939n);
    }
}
