package h2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static int f9194a = 4225;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9195b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static l1 f9196c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f9197d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9198e = false;

    public static int a() {
        return f9194a;
    }

    public static i b(Context context) {
        synchronized (f9195b) {
            if (f9196c == null) {
                f9196c = new l1(context.getApplicationContext(), f9198e ? c().getLooper() : context.getMainLooper());
            }
        }
        return f9196c;
    }

    public static HandlerThread c() {
        synchronized (f9195b) {
            HandlerThread handlerThread = f9197d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f9197d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f9197d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(h1 h1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z9) {
        d(new h1(str, str2, i10, z9), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(h1 h1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
