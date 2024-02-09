package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static long f1575a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f1576b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f1577c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f1578d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f1579e;

    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f1575a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f1576b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f1577c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f1578d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f1579e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
