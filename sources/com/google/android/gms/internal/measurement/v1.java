package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import o2.b;

public interface v1 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(w1 w1Var);

    void getAppInstanceId(w1 w1Var);

    void getCachedAppInstanceId(w1 w1Var);

    void getConditionalUserProperties(String str, String str2, w1 w1Var);

    void getCurrentScreenClass(w1 w1Var);

    void getCurrentScreenName(w1 w1Var);

    void getGmpAppId(w1 w1Var);

    void getMaxUserProperties(String str, w1 w1Var);

    void getSessionId(w1 w1Var);

    void getTestFlag(w1 w1Var, int i10);

    void getUserProperties(String str, String str2, boolean z9, w1 w1Var);

    void initForTests(Map map);

    void initialize(b bVar, f2 f2Var, long j10);

    void isDataCollectionEnabled(w1 w1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, w1 w1Var, long j10);

    void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j10);

    void onActivityDestroyed(b bVar, long j10);

    void onActivityPaused(b bVar, long j10);

    void onActivityResumed(b bVar, long j10);

    void onActivitySaveInstanceState(b bVar, w1 w1Var, long j10);

    void onActivityStarted(b bVar, long j10);

    void onActivityStopped(b bVar, long j10);

    void performAction(Bundle bundle, w1 w1Var, long j10);

    void registerOnMeasurementEventListener(c2 c2Var);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(b bVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z9);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c2 c2Var);

    void setInstanceIdProvider(d2 d2Var);

    void setMeasurementEnabled(boolean z9, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, b bVar, boolean z9, long j10);

    void unregisterOnMeasurementEventListener(c2 c2Var);
}
