package c5;

import android.content.ServiceConnection;
import android.os.Messenger;
import kotlin.jvm.internal.l;
import t3.c;
import t3.m;

public interface h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3743a = a.f3744a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f3744a = new a();

        private a() {
        }

        public final h0 a() {
            Object k10 = m.a(c.f12403a).k(h0.class);
            l.d(k10, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (h0) k10;
        }
    }

    void a(Messenger messenger, ServiceConnection serviceConnection);
}
