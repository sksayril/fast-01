package x3;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import s4.b;

public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f13181a = new c();

    private /* synthetic */ c() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }
}
