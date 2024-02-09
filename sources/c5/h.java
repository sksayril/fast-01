package c5;

import android.util.Log;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import s4.b;
import z8.c;

public final class h implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3741b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final b<n1.g> f3742a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public h(b<n1.g> bVar) {
        l.e(bVar, "transportFactoryProvider");
        this.f3742a = bVar;
    }

    /* access modifiers changed from: private */
    public final byte[] c(a0 a0Var) {
        String a10 = b0.f3647a.c().a(a0Var);
        l.d(a10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + a10);
        byte[] bytes = a10.getBytes(c.f13614b);
        l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public void a(a0 a0Var) {
        l.e(a0Var, "sessionEvent");
        this.f3742a.get().a("FIREBASE_APPQUALITY_SESSION", a0.class, n1.b.b("json"), new g(this)).b(n1.c.d(a0Var));
    }
}
