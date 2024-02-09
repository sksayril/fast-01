package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.df;
import h2.p;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6290a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f6291b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6292c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ k5 f6293d;

    public m5(k5 k5Var, String str, Bundle bundle) {
        this.f6293d = k5Var;
        p.f(str);
        this.f6290a = str;
    }

    private final String c(Bundle bundle) {
        z4 F;
        Class<?> cls;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    if (df.a()) {
                        if (this.f6293d.d().r(k0.M0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                                jSONArray.put(jSONObject);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                                jSONArray.put(jSONObject);
                            } else {
                                if (obj instanceof int[]) {
                                    jSONObject.put("v", Arrays.toString((int[]) obj));
                                    str = "ia";
                                } else if (obj instanceof long[]) {
                                    jSONObject.put("v", Arrays.toString((long[]) obj));
                                    str = "la";
                                } else if (obj instanceof Double) {
                                    jSONObject.put("v", String.valueOf(obj));
                                    jSONObject.put("t", "d");
                                    jSONArray.put(jSONObject);
                                } else {
                                    F = this.f6293d.k().F();
                                    cls = obj.getClass();
                                    F.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                                }
                                jSONObject.put("t", str);
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                        jSONArray.put(jSONObject);
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                        jSONArray.put(jSONObject);
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", "d");
                        jSONArray.put(jSONObject);
                    } else {
                        F = this.f6293d.k().F();
                        cls = obj.getClass();
                        F.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                    }
                } catch (JSONException e10) {
                    this.f6293d.k().F().b("Cannot serialize bundle value to SharedPreferences", e10);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:62|63|74) */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r14.f6293d.k().F().a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0127 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r14 = this;
            android.os.Bundle r0 = r14.f6292c
            if (r0 != 0) goto L_0x0154
            com.google.android.gms.measurement.internal.k5 r0 = r14.f6293d
            android.content.SharedPreferences r0 = r0.E()
            java.lang.String r1 = r14.f6290a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x014c
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x013d }
            r1.<init>()     // Catch:{ JSONException -> 0x013d }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013d }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x013d }
            r0 = 0
            r3 = 0
        L_0x001f:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x013d }
            if (r3 >= r4) goto L_0x013a
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r9 = 100
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            if (r8 == r9) goto L_0x007b
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 == r9) goto L_0x0071
            r9 = 115(0x73, float:1.61E-43)
            if (r8 == r9) goto L_0x0067
            r9 = 3352(0xd18, float:4.697E-42)
            if (r8 == r9) goto L_0x005d
            r9 = 3445(0xd75, float:4.827E-42)
            if (r8 == r9) goto L_0x0053
            goto L_0x0084
        L_0x0053:
            java.lang.String r8 = "la"
            boolean r8 = r6.equals(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r8 == 0) goto L_0x0084
            r7 = 4
            goto L_0x0084
        L_0x005d:
            java.lang.String r8 = "ia"
            boolean r8 = r6.equals(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r8 == 0) goto L_0x0084
            r7 = 3
            goto L_0x0084
        L_0x0067:
            java.lang.String r8 = "s"
            boolean r8 = r6.equals(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r8 == 0) goto L_0x0084
            r7 = 0
            goto L_0x0084
        L_0x0071:
            java.lang.String r8 = "l"
            boolean r8 = r6.equals(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r8 == 0) goto L_0x0084
            r7 = 2
            goto L_0x0084
        L_0x007b:
            java.lang.String r8 = "d"
            boolean r8 = r6.equals(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r8 == 0) goto L_0x0084
            r7 = 1
        L_0x0084:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x011f
            if (r7 == r13) goto L_0x0113
            if (r7 == r12) goto L_0x0107
            if (r7 == r11) goto L_0x00d4
            if (r7 == r10) goto L_0x00a1
            com.google.android.gms.measurement.internal.k5 r4 = r14.f6293d     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x00a1:
            boolean r6 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r6 == 0) goto L_0x0136
            com.google.android.gms.measurement.internal.k5 r6 = r14.f6293d     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.g r6 = r6.d()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.M0     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            boolean r6 = r6.r(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r6 == 0) goto L_0x0136
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            long[] r7 = new long[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r8 = 0
        L_0x00c5:
            if (r8 >= r4) goto L_0x00d0
            long r9 = r6.optLong(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            int r8 = r8 + 1
            goto L_0x00c5
        L_0x00d0:
            r1.putLongArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x00d4:
            boolean r6 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r6 == 0) goto L_0x0136
            com.google.android.gms.measurement.internal.k5 r6 = r14.f6293d     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.g r6 = r6.d()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.M0     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            boolean r6 = r6.r(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            if (r6 == 0) goto L_0x0136
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r6.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            int r4 = r6.length()     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            int[] r7 = new int[r4]     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r8 = 0
        L_0x00f8:
            if (r8 >= r4) goto L_0x0103
            int r9 = r6.optInt(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            int r8 = r8 + 1
            goto L_0x00f8
        L_0x0103:
            r1.putIntArray(r5, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x0107:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x0113:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x011f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x0127 }
            goto L_0x0136
        L_0x0127:
            com.google.android.gms.measurement.internal.k5 r4 = r14.f6293d     // Catch:{ JSONException -> 0x013d }
            com.google.android.gms.measurement.internal.x4 r4 = r4.k()     // Catch:{ JSONException -> 0x013d }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ JSONException -> 0x013d }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.a(r5)     // Catch:{ JSONException -> 0x013d }
        L_0x0136:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x013a:
            r14.f6292c = r1     // Catch:{ JSONException -> 0x013d }
            goto L_0x014c
        L_0x013d:
            com.google.android.gms.measurement.internal.k5 r0 = r14.f6293d
            com.google.android.gms.measurement.internal.x4 r0 = r0.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.a(r1)
        L_0x014c:
            android.os.Bundle r0 = r14.f6292c
            if (r0 != 0) goto L_0x0154
            android.os.Bundle r0 = r14.f6291b
            r14.f6292c = r0
        L_0x0154:
            android.os.Bundle r0 = r14.f6292c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m5.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f6293d.E().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f6290a);
        } else {
            edit.putString(this.f6290a, c(bundle));
        }
        edit.apply();
        this.f6292c = bundle;
    }
}