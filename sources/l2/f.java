package l2;

import android.content.Context;
import android.util.Log;
import h2.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f11111a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            p.j(context);
            p.j(th);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
