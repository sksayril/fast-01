package e5;

import a9.d;
import a9.e;
import android.content.Context;
import android.os.Bundle;
import e5.h;
import g8.s;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final a f8447b = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f8448a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(Context context) {
        l.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f8448a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        if (this.f8448a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f8448a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public Double b() {
        if (this.f8448a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f8448a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    public a9.b c() {
        if (this.f8448a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return a9.b.g(d.h(this.f8448a.getInt("firebase_sessions_sessions_restart_timeout"), e.SECONDS));
        }
        return null;
    }

    public Object d(j8.d<? super s> dVar) {
        return h.a.a(this, dVar);
    }
}
