package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import o2.b;

public final class x1 extends w0 implements v1 {
    x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) {
        Parcel B = B();
        B.writeString(str);
        B.writeLong(j10);
        Y(23, B);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.d(B, bundle);
        Y(9, B);
    }

    public final void endAdUnitExposure(String str, long j10) {
        Parcel B = B();
        B.writeString(str);
        B.writeLong(j10);
        Y(24, B);
    }

    public final void generateEventId(w1 w1Var) {
        Parcel B = B();
        y0.c(B, w1Var);
        Y(22, B);
    }

    public final void getCachedAppInstanceId(w1 w1Var) {
        Parcel B = B();
        y0.c(B, w1Var);
        Y(19, B);
    }

    public final void getConditionalUserProperties(String str, String str2, w1 w1Var) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.c(B, w1Var);
        Y(10, B);
    }

    public final void getCurrentScreenClass(w1 w1Var) {
        Parcel B = B();
        y0.c(B, w1Var);
        Y(17, B);
    }

    public final void getCurrentScreenName(w1 w1Var) {
        Parcel B = B();
        y0.c(B, w1Var);
        Y(16, B);
    }

    public final void getGmpAppId(w1 w1Var) {
        Parcel B = B();
        y0.c(B, w1Var);
        Y(21, B);
    }

    public final void getMaxUserProperties(String str, w1 w1Var) {
        Parcel B = B();
        B.writeString(str);
        y0.c(B, w1Var);
        Y(6, B);
    }

    public final void getUserProperties(String str, String str2, boolean z9, w1 w1Var) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.e(B, z9);
        y0.c(B, w1Var);
        Y(5, B);
    }

    public final void initialize(b bVar, f2 f2Var, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        y0.d(B, f2Var);
        B.writeLong(j10);
        Y(1, B);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j10) {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        y0.d(B, bundle);
        y0.e(B, z9);
        y0.e(B, z10);
        B.writeLong(j10);
        Y(2, B);
    }

    public final void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3) {
        Parcel B = B();
        B.writeInt(i10);
        B.writeString(str);
        y0.c(B, bVar);
        y0.c(B, bVar2);
        y0.c(B, bVar3);
        Y(33, B);
    }

    public final void onActivityCreated(b bVar, Bundle bundle, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        y0.d(B, bundle);
        B.writeLong(j10);
        Y(27, B);
    }

    public final void onActivityDestroyed(b bVar, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeLong(j10);
        Y(28, B);
    }

    public final void onActivityPaused(b bVar, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeLong(j10);
        Y(29, B);
    }

    public final void onActivityResumed(b bVar, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeLong(j10);
        Y(30, B);
    }

    public final void onActivitySaveInstanceState(b bVar, w1 w1Var, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        y0.c(B, w1Var);
        B.writeLong(j10);
        Y(31, B);
    }

    public final void onActivityStarted(b bVar, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeLong(j10);
        Y(25, B);
    }

    public final void onActivityStopped(b bVar, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeLong(j10);
        Y(26, B);
    }

    public final void registerOnMeasurementEventListener(c2 c2Var) {
        Parcel B = B();
        y0.c(B, c2Var);
        Y(35, B);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel B = B();
        y0.d(B, bundle);
        B.writeLong(j10);
        Y(8, B);
    }

    public final void setCurrentScreen(b bVar, String str, String str2, long j10) {
        Parcel B = B();
        y0.c(B, bVar);
        B.writeString(str);
        B.writeString(str2);
        B.writeLong(j10);
        Y(15, B);
    }

    public final void setDataCollectionEnabled(boolean z9) {
        Parcel B = B();
        y0.e(B, z9);
        Y(39, B);
    }
}
