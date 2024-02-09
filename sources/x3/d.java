package x3;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import s4.b;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f13182a = new d();

    private /* synthetic */ d() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }
}
