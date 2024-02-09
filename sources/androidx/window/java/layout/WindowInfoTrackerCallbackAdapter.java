package androidx.window.java.layout;

import android.app.Activity;
import androidx.core.util.a;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import b9.j1;
import b9.k0;
import b9.l0;
import b9.r1;
import e9.b;
import g8.s;
import j8.d;
import j8.g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;

public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, r1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        l.e(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, a<T> aVar, b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, i.d(k0.a(j1.a(executor)), (g) null, (l0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, (d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            s sVar = s.f8976a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            r1 r1Var = this.consumerToJobMap.get(aVar);
            if (r1Var != null) {
                r1.a.a(r1Var, (CancellationException) null, 1, (Object) null);
            }
            r1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        l.e(activity, "activity");
        l.e(executor, "executor");
        l.e(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> aVar) {
        l.e(aVar, "consumer");
        removeListener(aVar);
    }

    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        l.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
