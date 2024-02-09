package c9;

import android.os.Build;
import b9.h0;
import j8.a;
import j8.g;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class b extends a implements h0 {
    private volatile Object _preHandler = this;

    public b() {
        super(h0.f3454b);
    }

    private final Method I() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z9 = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z9 = true;
            }
            if (z9) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void F(g gVar, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            Method I = I();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke = I != null ? I.invoke((Object) null, new Object[0]) : null;
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
