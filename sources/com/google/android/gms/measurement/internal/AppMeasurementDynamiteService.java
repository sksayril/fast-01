package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.w1;
import h2.p;
import java.util.Map;
import o2.d;

@DynamiteApi
public class AppMeasurementDynamiteService extends u1 {

    /* renamed from: c  reason: collision with root package name */
    m6 f5830c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, t7> f5831d = new p.a();

    class a implements u7 {

        /* renamed from: a  reason: collision with root package name */
        private c2 f5832a;

        a(c2 c2Var) {
            this.f5832a = c2Var;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f5832a.y0(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                m6 m6Var = AppMeasurementDynamiteService.this.f5830c;
                if (m6Var != null) {
                    m6Var.k().K().b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    class b implements t7 {

        /* renamed from: a  reason: collision with root package name */
        private c2 f5834a;

        b(c2 c2Var) {
            this.f5834a = c2Var;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f5834a.y0(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                m6 m6Var = AppMeasurementDynamiteService.this.f5830c;
                if (m6Var != null) {
                    m6Var.k().K().b("Event listener threw exception", e10);
                }
            }
        }
    }

    private final void J() {
        if (this.f5830c == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void Y(w1 w1Var, String str) {
        J();
        this.f5830c.K().Q(w1Var, str);
    }

    public void beginAdUnitExposure(String str, long j10) {
        J();
        this.f5830c.x().y(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        J();
        this.f5830c.G().W(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        J();
        this.f5830c.G().Q((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) {
        J();
        this.f5830c.x().C(str, j10);
    }

    public void generateEventId(w1 w1Var) {
        J();
        long O0 = this.f5830c.K().O0();
        J();
        this.f5830c.K().O(w1Var, O0);
    }

    public void getAppInstanceId(w1 w1Var) {
        J();
        this.f5830c.i().C(new h7(this, w1Var));
    }

    public void getCachedAppInstanceId(w1 w1Var) {
        J();
        Y(w1Var, this.f5830c.G().h0());
    }

    public void getConditionalUserProperties(String str, String str2, w1 w1Var) {
        J();
        this.f5830c.i().C(new ia(this, w1Var, str, str2));
    }

    public void getCurrentScreenClass(w1 w1Var) {
        J();
        Y(w1Var, this.f5830c.G().i0());
    }

    public void getCurrentScreenName(w1 w1Var) {
        J();
        Y(w1Var, this.f5830c.G().j0());
    }

    public void getGmpAppId(w1 w1Var) {
        J();
        Y(w1Var, this.f5830c.G().k0());
    }

    public void getMaxUserProperties(String str, w1 w1Var) {
        J();
        this.f5830c.G();
        p.f(str);
        J();
        this.f5830c.K().N(w1Var, 25);
    }

    public void getSessionId(w1 w1Var) {
        J();
        y7 G = this.f5830c.G();
        G.i().C(new y8(G, w1Var));
    }

    public void getTestFlag(w1 w1Var, int i10) {
        J();
        if (i10 == 0) {
            this.f5830c.K().Q(w1Var, this.f5830c.G().l0());
        } else if (i10 == 1) {
            this.f5830c.K().O(w1Var, this.f5830c.G().g0().longValue());
        } else if (i10 == 2) {
            oc K = this.f5830c.K();
            double doubleValue = this.f5830c.G().e0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                w1Var.p(bundle);
            } catch (RemoteException e10) {
                K.f6276a.k().K().b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.f5830c.K().N(w1Var, this.f5830c.G().f0().intValue());
        } else if (i10 == 4) {
            this.f5830c.K().S(w1Var, this.f5830c.G().d0().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z9, w1 w1Var) {
        J();
        this.f5830c.i().C(new i8(this, w1Var, str, str2, z9));
    }

    public void initForTests(Map map) {
        J();
    }

    public void initialize(o2.b bVar, f2 f2Var, long j10) {
        m6 m6Var = this.f5830c;
        if (m6Var == null) {
            this.f5830c = m6.b((Context) p.j((Context) d.Y(bVar)), f2Var, Long.valueOf(j10));
        } else {
            m6Var.k().K().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(w1 w1Var) {
        J();
        this.f5830c.i().C(new kc(this, w1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        J();
        this.f5830c.G().Y(str, str2, bundle, z9, z10, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, w1 w1Var, long j10) {
        Bundle bundle2;
        J();
        p.f(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f5830c.i().C(new i9(this, w1Var, new i0(str2, new d0(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, o2.b bVar, o2.b bVar2, o2.b bVar3) {
        J();
        Object obj = null;
        Object Y = bVar == null ? null : d.Y(bVar);
        Object Y2 = bVar2 == null ? null : d.Y(bVar2);
        if (bVar3 != null) {
            obj = d.Y(bVar3);
        }
        this.f5830c.k().y(i10, true, false, str, Y, Y2, obj);
    }

    public void onActivityCreated(o2.b bVar, Bundle bundle, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityCreated((Activity) d.Y(bVar), bundle);
        }
    }

    public void onActivityDestroyed(o2.b bVar, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityDestroyed((Activity) d.Y(bVar));
        }
    }

    public void onActivityPaused(o2.b bVar, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityPaused((Activity) d.Y(bVar));
        }
    }

    public void onActivityResumed(o2.b bVar, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityResumed((Activity) d.Y(bVar));
        }
    }

    public void onActivitySaveInstanceState(o2.b bVar, w1 w1Var, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        Bundle bundle = new Bundle();
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivitySaveInstanceState((Activity) d.Y(bVar), bundle);
        }
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f5830c.k().K().b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(o2.b bVar, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityStarted((Activity) d.Y(bVar));
        }
    }

    public void onActivityStopped(o2.b bVar, long j10) {
        J();
        f9 f9Var = this.f5830c.G().f6731c;
        if (f9Var != null) {
            this.f5830c.G().n0();
            f9Var.onActivityStopped((Activity) d.Y(bVar));
        }
    }

    public void performAction(Bundle bundle, w1 w1Var, long j10) {
        J();
        w1Var.p((Bundle) null);
    }

    public void registerOnMeasurementEventListener(c2 c2Var) {
        t7 t7Var;
        J();
        synchronized (this.f5831d) {
            t7Var = this.f5831d.get(Integer.valueOf(c2Var.zza()));
            if (t7Var == null) {
                t7Var = new b(c2Var);
                this.f5831d.put(Integer.valueOf(c2Var.zza()), t7Var);
            }
        }
        this.f5830c.G().K(t7Var);
    }

    public void resetAnalyticsData(long j10) {
        J();
        y7 G = this.f5830c.G();
        G.S((String) null);
        G.i().C(new s8(G, j10));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        J();
        if (bundle == null) {
            this.f5830c.k().F().a("Conditional user property must not be null");
        } else {
            this.f5830c.G().G(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        J();
        y7 G = this.f5830c.G();
        G.i().F(new e8(G, bundle, j10));
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        J();
        this.f5830c.G().F(bundle, -20, j10);
    }

    public void setCurrentScreen(o2.b bVar, String str, String str2, long j10) {
        J();
        this.f5830c.H().G((Activity) d.Y(bVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z9) {
        J();
        y7 G = this.f5830c.G();
        G.u();
        G.i().C(new k8(G, z9));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        J();
        y7 G = this.f5830c.G();
        G.i().C(new b8(G, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(c2 c2Var) {
        J();
        a aVar = new a(c2Var);
        if (this.f5830c.i().I()) {
            this.f5830c.G().L(aVar);
        } else {
            this.f5830c.i().C(new jb(this, aVar));
        }
    }

    public void setInstanceIdProvider(d2 d2Var) {
        J();
    }

    public void setMeasurementEnabled(boolean z9, long j10) {
        J();
        this.f5830c.G().Q(Boolean.valueOf(z9));
    }

    public void setMinimumSessionDuration(long j10) {
        J();
    }

    public void setSessionTimeoutDuration(long j10) {
        J();
        y7 G = this.f5830c.G();
        G.i().C(new m8(G, j10));
    }

    public void setUserId(String str, long j10) {
        J();
        y7 G = this.f5830c.G();
        if (str == null || !TextUtils.isEmpty(str)) {
            G.i().C(new g8(G, str));
            G.b0((String) null, "_id", str, true, j10);
            return;
        }
        G.f6276a.k().K().a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, o2.b bVar, boolean z9, long j10) {
        J();
        this.f5830c.G().b0(str, str2, d.Y(bVar), z9, j10);
    }

    public void unregisterOnMeasurementEventListener(c2 c2Var) {
        t7 remove;
        J();
        synchronized (this.f5831d) {
            remove = this.f5831d.remove(Integer.valueOf(c2Var.zza()));
        }
        if (remove == null) {
            remove = new b(c2Var);
        }
        this.f5830c.G().u0(remove);
    }
}
