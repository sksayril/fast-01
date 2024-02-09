package h2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import n2.c;

public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9258a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9259b;

    /* renamed from: c  reason: collision with root package name */
    private static String f9260c;

    /* renamed from: d  reason: collision with root package name */
    private static int f9261d;

    public static int a(Context context) {
        b(context);
        return f9261d;
    }

    private static void b(Context context) {
        synchronized (f9258a) {
            if (!f9259b) {
                f9259b = true;
                try {
                    Bundle bundle = c.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f9260c = bundle.getString("com.google.app.id");
                        f9261d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            }
        }
    }
}
