package u0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f12464a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f12465b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f12466c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f12467d;

    @SuppressLint({"NewApi"})
    public static void a(String str, int i10) {
        try {
            if (f12466c == null) {
                c.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        try {
            if (f12466c == null) {
                f12466c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f12466c.invoke((Object) null, new Object[]{Long.valueOf(f12464a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(String str, int i10) {
        try {
            if (f12467d == null) {
                c.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        try {
            if (f12467d == null) {
                f12467d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f12467d.invoke((Object) null, new Object[]{Long.valueOf(f12464a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f12465b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f12465b == null) {
                f12464a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f12465b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f12465b.invoke((Object) null, new Object[]{Long.valueOf(f12464a)})).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }
}
