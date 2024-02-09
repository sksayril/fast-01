package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

final class f9 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ y7 f6029m;

    f9(y7 y7Var) {
        this.f6029m = y7Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5 A[SYNTHETIC, Splitter:B:45:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0143 A[Catch:{ RuntimeException -> 0x01d1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[Catch:{ RuntimeException -> 0x01d1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.google.android.gms.measurement.internal.f9 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.y7 r3 = r1.f6029m
            r3.m()
            com.google.android.gms.measurement.internal.y7 r3 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.oc r3 = r3.h()     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r4 = com.google.android.gms.internal.measurement.vf.a()     // Catch:{ RuntimeException -> 0x01d1 }
            r6 = 1
            if (r4 == 0) goto L_0x0028
            com.google.android.gms.measurement.internal.y7 r4 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.g r4 = r4.d()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.E0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r4 = r4.r(r7)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r4 == 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            boolean r7 = com.google.android.gms.internal.measurement.ee.a()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x003f
            com.google.android.gms.measurement.internal.y7 r7 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.g r7 = r7.d()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.k0.Z0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r7 = r7.r(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            boolean r8 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r9 = "Activity created with data 'referrer' without required params"
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "utm_medium"
            java.lang.String r12 = "utm_source"
            java.lang.String r13 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r8 == 0) goto L_0x0054
        L_0x0052:
            r3 = 0
            goto L_0x00c1
        L_0x0054:
            boolean r8 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            if (r7 == 0) goto L_0x0064
            java.lang.String r8 = "gbraid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
        L_0x0064:
            boolean r8 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "utm_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "dclid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            java.lang.String r8 = "srsltid"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
            if (r4 == 0) goto L_0x0098
            java.lang.String r8 = "sfmc_id"
            boolean r8 = r2.contains(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 != 0) goto L_0x00a4
        L_0x0098:
            com.google.android.gms.measurement.internal.x4 r3 = r3.k()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.E()     // Catch:{ RuntimeException -> 0x01d1 }
            r3.a(r9)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x0052
        L_0x00a4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r14 = "https://google.com/search?"
            r8.<init>(r14)     // Catch:{ RuntimeException -> 0x01d1 }
            r8.append(r2)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r8 = r8.toString()     // Catch:{ RuntimeException -> 0x01d1 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ RuntimeException -> 0x01d1 }
            android.os.Bundle r3 = r3.B(r8, r4, r7)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r3 == 0) goto L_0x00c1
            java.lang.String r4 = "referrer"
            r3.putString(r10, r4)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x00c1:
            java.lang.String r4 = "_cmp"
            if (r18 == 0) goto L_0x013b
            com.google.android.gms.measurement.internal.y7 r7 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.oc r7 = r7.h()     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r8 = com.google.android.gms.internal.measurement.vf.a()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.y7 r8 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.g r8 = r8.d()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.k0.E0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r8 = r8.r(r14)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r8 == 0) goto L_0x00e1
            r8 = 1
            goto L_0x00e2
        L_0x00e1:
            r8 = 0
        L_0x00e2:
            boolean r14 = com.google.android.gms.internal.measurement.ee.a()     // Catch:{ RuntimeException -> 0x01d1 }
            if (r14 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.y7 r14 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.g r14 = r14.d()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.k0.Z0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r5 = r14.r(r5)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x00fa
            r5 = r19
            r14 = 1
            goto L_0x00fd
        L_0x00fa:
            r5 = r19
            r14 = 0
        L_0x00fd:
            android.os.Bundle r5 = r7.B(r5, r8, r14)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x013b
            java.lang.String r7 = "intent"
            r5.putString(r10, r7)     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r7 = r5.containsKey(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 != 0) goto L_0x012c
            if (r3 == 0) goto L_0x012c
            boolean r7 = r3.containsKey(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r7 == 0) goto L_0x012c
            java.lang.String r7 = "_cer"
            java.lang.String r8 = "gclid=%s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r14 = r3.getString(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            r16 = 0
            r10[r16] = r14     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ RuntimeException -> 0x01d1 }
            r5.putString(r7, r8)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x012e
        L_0x012c:
            r16 = 0
        L_0x012e:
            com.google.android.gms.measurement.internal.y7 r7 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            r7.y0(r0, r4, r5)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.y7 r7 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.yc r7 = r7.f6742n     // Catch:{ RuntimeException -> 0x01d1 }
            r7.b(r0, r5)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x013d
        L_0x013b:
            r16 = 0
        L_0x013d:
            boolean r5 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r5 == 0) goto L_0x0144
            return
        L_0x0144:
            com.google.android.gms.measurement.internal.y7 r5 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.x4 r5 = r5.k()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.E()     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r7 = "Activity created with referrer"
            r5.b(r7, r2)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.y7 r5 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.g r5 = r5.d()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.f6198l0     // Catch:{ RuntimeException -> 0x01d1 }
            boolean r5 = r5.r(r7)     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r7 = "_ldl"
            java.lang.String r8 = "auto"
            if (r5 == 0) goto L_0x018a
            if (r3 == 0) goto L_0x0174
            com.google.android.gms.measurement.internal.y7 r2 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            r2.y0(r0, r4, r3)     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.y7 r2 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.yc r2 = r2.f6742n     // Catch:{ RuntimeException -> 0x01d1 }
            r2.b(r0, r3)     // Catch:{ RuntimeException -> 0x01d1 }
            goto L_0x0183
        L_0x0174:
            com.google.android.gms.measurement.internal.y7 r0 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.E()     // Catch:{ RuntimeException -> 0x01d1 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.b(r3, r2)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x0183:
            com.google.android.gms.measurement.internal.y7 r0 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            r2 = 0
            r0.a0(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x01d1 }
            return
        L_0x018a:
            boolean r0 = r2.contains(r15)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r2.contains(r13)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r2.contains(r12)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            boolean r0 = r2.contains(r11)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 == 0) goto L_0x01b4
        L_0x01b2:
            r5 = 1
            goto L_0x01b5
        L_0x01b4:
            r5 = 0
        L_0x01b5:
            if (r5 != 0) goto L_0x01c5
            com.google.android.gms.measurement.internal.y7 r0 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()     // Catch:{ RuntimeException -> 0x01d1 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.E()     // Catch:{ RuntimeException -> 0x01d1 }
            r0.a(r9)     // Catch:{ RuntimeException -> 0x01d1 }
            return
        L_0x01c5:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ RuntimeException -> 0x01d1 }
            if (r0 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.y7 r0 = r1.f6029m     // Catch:{ RuntimeException -> 0x01d1 }
            r0.a0(r8, r7, r2, r6)     // Catch:{ RuntimeException -> 0x01d1 }
        L_0x01d0:
            return
        L_0x01d1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.y7 r1 = r1.f6029m
            com.google.android.gms.measurement.internal.x4 r1 = r1.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f9.a(com.google.android.gms.measurement.internal.f9, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f6029m.k().J().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null) {
                    if (uri.isHierarchical()) {
                        this.f6029m.h();
                        this.f6029m.i().C(new j9(this, bundle == null, uri, oc.d0(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    }
                }
            }
        } catch (RuntimeException e10) {
            this.f6029m.k().F().b("Throwable caught in onActivityCreated", e10);
        } catch (Throwable th) {
            this.f6029m.r().E(activity, bundle);
            throw th;
        }
        this.f6029m.r().E(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f6029m.r().D(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f6029m.r().P(activity);
        gb t9 = this.f6029m.t();
        t9.i().C(new ib(t9, t9.a().b()));
    }

    public final void onActivityResumed(Activity activity) {
        gb t9 = this.f6029m.t();
        t9.i().C(new kb(t9, t9.a().b()));
        this.f6029m.r().R(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f6029m.r().Q(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
