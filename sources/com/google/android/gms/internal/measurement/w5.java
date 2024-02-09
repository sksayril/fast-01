package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class w5 {
    public static <V> V a(v5<V> v5Var) {
        long clearCallingIdentity;
        try {
            return v5Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = v5Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
