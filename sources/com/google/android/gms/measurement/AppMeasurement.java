package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.measurement.internal.h9;
import com.google.android.gms.measurement.internal.m6;
import com.google.android.gms.measurement.internal.m7;
import h2.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    private static volatile AppMeasurement f5822b;

    /* renamed from: a  reason: collision with root package name */
    private final a f5823a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            p.j(bundle);
            this.mAppId = (String) m7.a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) m7.a(bundle, "origin", cls2, null);
            this.mName = (String) m7.a(bundle, "name", cls2, null);
            this.mValue = m7.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) m7.a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) m7.a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) m7.a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) m7.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) m7.a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) m7.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) m7.a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) m7.a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) m7.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) m7.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) m7.a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) m7.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    private static abstract class a implements h9 {
        private a() {
        }
    }

    private AppMeasurement(h9 h9Var) {
        this.f5823a = new c(h9Var);
    }

    private AppMeasurement(m6 m6Var) {
        this.f5823a = new a(m6Var);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f5822b == null) {
            synchronized (AppMeasurement.class) {
                if (f5822b == null) {
                    h9 b10 = b(context, (Bundle) null);
                    if (b10 != null) {
                        f5822b = new AppMeasurement(b10);
                    } else {
                        f5822b = new AppMeasurement(m6.b(context, new f2(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                    }
                }
            }
        }
        return f5822b;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.h9 b(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            com.google.android.gms.measurement.internal.h9 r7 = (com.google.android.gms.measurement.internal.h9) r7     // Catch:{  }
            return r7
        L_0x0023:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.h9");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f5823a.c(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f5823a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f5823a.k(str);
    }

    @Keep
    public long generateEventId() {
        return this.f5823a.zza();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f5823a.f();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b10 = this.f5823a.b(str, str2);
        ArrayList arrayList = new ArrayList(b10 == null ? 0 : b10.size());
        for (Bundle conditionalUserProperty : b10) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f5823a.h();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f5823a.g();
    }

    @Keep
    public String getGmpAppId() {
        return this.f5823a.e();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f5823a.i(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z9) {
        return this.f5823a.d(str, str2, z9);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f5823a.j(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        p.j(conditionalUserProperty);
        a aVar = this.f5823a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            m7.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.p(bundle);
    }
}
