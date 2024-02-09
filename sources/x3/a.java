package x3;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import s4.b;

public final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f13179a = new a();

    private /* synthetic */ a() {
    }

    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }
}
