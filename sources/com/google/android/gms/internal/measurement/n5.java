package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class n5 {

    /* renamed from: a  reason: collision with root package name */
    private static UserManager f5463a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f5464b = (!a());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5465c = false;

    private n5() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(android.content.Context r3) {
        /*
            boolean r0 = f5464b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.n5> r0 = com.google.android.gms.internal.measurement.n5.class
            monitor-enter(r0)
            boolean r2 = f5464b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = e(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f5464b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.n5.d(android.content.Context):boolean");
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z9;
        boolean z10 = true;
        int i10 = 1;
        while (true) {
            z9 = false;
            if (i10 > 2) {
                break;
            }
            if (f5463a == null) {
                f5463a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f5463a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z10 = false;
                }
                z9 = z10;
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                f5463a = null;
                i10++;
            }
        }
        if (z9) {
            f5463a = null;
        }
        return z9;
    }
}
