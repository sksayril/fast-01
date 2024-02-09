package c9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g8.m;
import g8.n;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3885a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            m.a aVar = m.f8970m;
            obj = m.a(new c(a(Looper.getMainLooper(), true), (String) null, 2, (g) null));
        } catch (Throwable th) {
            m.a aVar2 = m.f8970m;
            obj = m.a(n.a(th));
        }
        if (!m.c(obj)) {
            dVar = obj;
        }
        f3885a = dVar;
    }

    public static final Handler a(Looper looper, boolean z9) {
        Object newInstance;
        if (!z9) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            l.c(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            Class cls = Handler.class;
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
                newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
