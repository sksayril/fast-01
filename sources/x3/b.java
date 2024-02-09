package x3;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

public final /* synthetic */ class b implements s4.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f13180a = new b();

    private /* synthetic */ b() {
    }

    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }
}
