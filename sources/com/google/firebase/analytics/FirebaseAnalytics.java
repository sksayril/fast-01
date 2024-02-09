package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.measurement.internal.h9;
import com.google.firebase.installations.b;
import d3.m;
import h2.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f7188b;

    /* renamed from: a  reason: collision with root package name */
    private final h2 f7189a;

    private FirebaseAnalytics(h2 h2Var) {
        p.j(h2Var);
        this.f7189a = h2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f7188b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f7188b == null) {
                    f7188b = new FirebaseAnalytics(h2.e(context));
                }
            }
        }
        return f7188b;
    }

    @Keep
    public static h9 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        h2 f10 = h2.f(context, (String) null, (String) null, (String) null, bundle);
        if (f10 == null) {
            return null;
        }
        return new a(f10);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) m.b(b.n().a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f7189a.j(activity, str, str2);
    }
}
