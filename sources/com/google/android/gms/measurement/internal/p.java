package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.fd;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.ld;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.u4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.a;

final class p extends yb {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f6405f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f6406g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f6407h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f6408i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f6409j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f6410k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f6411l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f6412m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f6413n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f6414o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d  reason: collision with root package name */
    private final v f6415d = new v(this, zza(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final sb f6416e = new sb(a());

    p(zb zbVar) {
        super(zbVar);
    }

    private final long F(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            k().F().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object L(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            k().F().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                k().F().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            k().F().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T M(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.s<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.A()     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x002c, all -> 0x002a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0028 }
            if (r4 != 0) goto L_0x0020
            com.google.android.gms.measurement.internal.x4 r4 = r2.k()     // Catch:{ SQLiteException -> 0x0028 }
            com.google.android.gms.measurement.internal.z4 r4 = r4.J()     // Catch:{ SQLiteException -> 0x0028 }
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r0
        L_0x0020:
            java.lang.Object r4 = r5.a(r3)     // Catch:{ SQLiteException -> 0x0028 }
            r3.close()
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002e
        L_0x002a:
            r4 = move-exception
            goto L_0x0043
        L_0x002c:
            r4 = move-exception
            r3 = r0
        L_0x002e:
            com.google.android.gms.measurement.internal.x4 r5 = r2.k()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0040
            r3.close()
        L_0x0040:
            return r0
        L_0x0041:
            r4 = move-exception
            r0 = r3
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.M(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.s):java.lang.Object");
    }

    private final String O(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return str2;
        } catch (SQLiteException e10) {
            k().F().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void S(ContentValues contentValues, String str, Object obj) {
        h2.p.f(str);
        h2.p.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final void X(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase A = A();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                k().G().b("Value of the primary key is not set.", x4.u(str2));
                return;
            }
            if (((long) A.update(str, contentValues, str2 + " = ?", new String[]{asString})) == 0 && A.insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                k().F().c("Failed to insert/update table (got -1). key", x4.u(str), x4.u(str2));
            }
        } catch (SQLiteException e10) {
            k().F().d("Error storing into table. key", x4.u(str), x4.u(str2), e10);
        }
    }

    private final boolean e0(String str, int i10, m3 m3Var) {
        t();
        m();
        h2.p.f(str);
        h2.p.j(m3Var);
        Integer num = null;
        if (m3Var.S().isEmpty()) {
            z4 K = k().K();
            Object u9 = x4.u(str);
            Integer valueOf = Integer.valueOf(i10);
            if (m3Var.Y()) {
                num = Integer.valueOf(m3Var.O());
            }
            K.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", u9, valueOf, String.valueOf(num));
            return false;
        }
        byte[] n10 = m3Var.n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", m3Var.Y() ? Integer.valueOf(m3Var.O()) : null);
        contentValues.put("event_name", m3Var.S());
        contentValues.put("session_scoped", m3Var.Z() ? Boolean.valueOf(m3Var.W()) : null);
        contentValues.put("data", n10);
        try {
            if (A().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            k().F().b("Failed to insert event filter (got -1). appId", x4.u(str));
            return true;
        } catch (SQLiteException e10) {
            k().F().c("Error storing event filter. appId", x4.u(str), e10);
            return false;
        }
    }

    private final boolean f0(String str, int i10, p3 p3Var) {
        t();
        m();
        h2.p.f(str);
        h2.p.j(p3Var);
        Integer num = null;
        if (p3Var.O().isEmpty()) {
            z4 K = k().K();
            Object u9 = x4.u(str);
            Integer valueOf = Integer.valueOf(i10);
            if (p3Var.S()) {
                num = Integer.valueOf(p3Var.q());
            }
            K.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", u9, valueOf, String.valueOf(num));
            return false;
        }
        byte[] n10 = p3Var.n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", p3Var.S() ? Integer.valueOf(p3Var.q()) : null);
        contentValues.put("property_name", p3Var.O());
        contentValues.put("session_scoped", p3Var.T() ? Boolean.valueOf(p3Var.R()) : null);
        contentValues.put("data", n10);
        try {
            if (A().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            k().F().b("Failed to insert property filter (got -1). appId", x4.u(str));
            return false;
        } catch (SQLiteException e10) {
            k().F().c("Error storing property filter. appId", x4.u(str), e10);
            return false;
        }
    }

    private final boolean t0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long w0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            k().F().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean y0(String str, List<Integer> list) {
        h2.p.f(str);
        t();
        m();
        SQLiteDatabase A = A();
        try {
            long w02 = w0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, d().t(str, k0.H)));
            if (w02 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append("(" + TextUtils.join(",", arrayList) + ")");
            sb.append(" order by rowid desc limit -1 offset ?)");
            return A.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            k().F().c("Database error querying filters. appId", x4.u(str), e10);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase A() {
        m();
        try {
            return this.f6415d.getWritableDatabase();
        } catch (SQLiteException e10) {
            k().K().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.e A0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            h2.p.f(r30)
            h2.p.f(r31)
            r29.m()
            r29.t()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.A()     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r3 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r3 != 0) goto L_0x0054
            java.lang.String r3 = ""
        L_0x0054:
            r10 = r29
            r16 = r3
            java.lang.Object r5 = r10.L(r9, r2)     // Catch:{ SQLiteException -> 0x00ee }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ee }
            if (r0 == 0) goto L_0x0065
            r20 = 1
            goto L_0x0067
        L_0x0065:
            r20 = 0
        L_0x0067:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.jc r0 = r29.n()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.i0> r2 = com.google.android.gms.measurement.internal.i0.CREATOR     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.B(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r22 = r0
            com.google.android.gms.measurement.internal.i0 r22 = (com.google.android.gms.measurement.internal.i0) r22     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.jc r0 = r29.n()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.B(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r25 = r0
            com.google.android.gms.measurement.internal.i0 r25 = (com.google.android.gms.measurement.internal.i0) r25     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.jc r0 = r29.n()     // Catch:{ SQLiteException -> 0x00ee }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ee }
            android.os.Parcelable r0 = r0.B(r1, r2)     // Catch:{ SQLiteException -> 0x00ee }
            r28 = r0
            com.google.android.gms.measurement.internal.i0 r28 = (com.google.android.gms.measurement.internal.i0) r28     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.nc r17 = new com.google.android.gms.measurement.internal.nc     // Catch:{ SQLiteException -> 0x00ee }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.e r0 = new com.google.android.gms.measurement.internal.e     // Catch:{ SQLiteException -> 0x00ee }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ee }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ee }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.x4 r1 = r29.k()     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r30)     // Catch:{ SQLiteException -> 0x00ee }
            com.google.android.gms.measurement.internal.w4 r4 = r29.f()     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r4 = r4.g(r7)     // Catch:{ SQLiteException -> 0x00ee }
            r1.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ee }
        L_0x00ea:
            r9.close()
            return r0
        L_0x00ee:
            r0 = move-exception
            goto L_0x0100
        L_0x00f0:
            r0 = move-exception
            r10 = r29
            goto L_0x0120
        L_0x00f4:
            r0 = move-exception
            r10 = r29
            goto L_0x0100
        L_0x00f8:
            r0 = move-exception
            r10 = r29
            goto L_0x0121
        L_0x00fc:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0100:
            com.google.android.gms.measurement.internal.x4 r1 = r29.k()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r30)     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.w4 r4 = r29.f()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r4.g(r7)     // Catch:{ all -> 0x011f }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x011e
            r9.close()
        L_0x011e:
            return r8
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r8 = r9
        L_0x0121:
            if (r8 == 0) goto L_0x0126
            r8.close()
        L_0x0126:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.A0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003b
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            com.google.android.gms.measurement.internal.x4 r3 = r6.k()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.B():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.e0 B0(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            h2.p.f(r26)
            h2.p.f(r27)
            r25.m()
            r25.t()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.A()     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0122, all -> 0x0120 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 != 0) goto L_0x005a
            r14.close()
            return r18
        L_0x005a:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r2 = 0
            if (r1 == 0) goto L_0x0072
            r16 = r2
            goto L_0x0078
        L_0x0072:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r16 = r0
        L_0x0078:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r1 == 0) goto L_0x0082
            r0 = r18
            goto L_0x008a
        L_0x0082:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
        L_0x008a:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x0094
            r19 = r18
            goto L_0x009e
        L_0x0094:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r19 = r1
        L_0x009e:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00a8
            r20 = r18
            goto L_0x00b2
        L_0x00a8:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r20 = r1
        L_0x00b2:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 != 0) goto L_0x00cd
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cb }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cb }
            r21 = r1
            goto L_0x00cf
        L_0x00cb:
            r0 = move-exception
            goto L_0x0125
        L_0x00cd:
            r21 = r18
        L_0x00cf:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            if (r8 == 0) goto L_0x00d9
            r8 = r2
            goto L_0x00de
        L_0x00d9:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r8 = r1
        L_0x00de:
            com.google.android.gms.measurement.internal.e0 r22 = new com.google.android.gms.measurement.internal.e0     // Catch:{ SQLiteException -> 0x011c, all -> 0x0116 }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x010c
            com.google.android.gms.measurement.internal.x4 r0 = r25.k()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.x4.u(r26)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
            r0.b(r1, r2)     // Catch:{ SQLiteException -> 0x0112, all -> 0x0110 }
        L_0x010c:
            r23.close()
            return r22
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            r14 = r23
            goto L_0x0125
        L_0x0116:
            r0 = move-exception
            r23 = r14
        L_0x0119:
            r18 = r23
            goto L_0x0149
        L_0x011c:
            r0 = move-exception
            r23 = r14
            goto L_0x0125
        L_0x0120:
            r0 = move-exception
            goto L_0x0149
        L_0x0122:
            r0 = move-exception
            r14 = r18
        L_0x0125:
            com.google.android.gms.measurement.internal.x4 r1 = r25.k()     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r26)     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.w4 r4 = r25.f()     // Catch:{ all -> 0x0146 }
            r5 = r27
            java.lang.String r4 = r4.c(r5)     // Catch:{ all -> 0x0146 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0146 }
            if (r14 == 0) goto L_0x0145
            r14.close()
        L_0x0145:
            return r18
        L_0x0146:
            r0 = move-exception
            r18 = r14
        L_0x0149:
            if (r18 == 0) goto L_0x014e
            r18.close()
        L_0x014e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.B0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.e0");
    }

    public final int C(String str, String str2) {
        h2.p.f(str);
        h2.p.f(str2);
        m();
        t();
        try {
            return A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            k().F().d("Error deleting conditional property", x4.u(str), f().g(str2), e10);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0127 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x012b A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x015f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0180 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018f A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e8 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ea A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0244 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0246 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0264 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0266 A[Catch:{ SQLiteException -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x027e A[Catch:{ SQLiteException -> 0x0293 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.h6 C0(java.lang.String r42) {
        /*
            r41 = this;
            r1 = r42
            h2.p.f(r42)
            r41.m()
            r41.t()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r41.A()     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String r34 = "sgtm_upload_enabled"
            java.lang.String r35 = "target_os_version"
            java.lang.String r36 = "session_stitching_token_hash"
            java.lang.String r37 = "ad_services_version"
            java.lang.String r38 = "unmatched_first_open_without_ad_id"
            java.lang.String r39 = "npa_metadata_value"
            java.lang.String r40 = "attribution_eligibility_status"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40}     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02a1, all -> 0x029d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            if (r4 != 0) goto L_0x0077
            r3.close()
            return r2
        L_0x0077:
            com.google.android.gms.measurement.internal.h6 r4 = new com.google.android.gms.measurement.internal.h6     // Catch:{ SQLiteException -> 0x0299, all -> 0x0295 }
            r5 = r41
            com.google.android.gms.measurement.internal.zb r6 = r5.f6637b     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.m6 r6 = r6.h0()     // Catch:{ SQLiteException -> 0x0293 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0293 }
            r4.x(r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0293 }
            r4.M(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.S(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.h0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.j0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.f0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.F(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.B(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.d0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.X(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x00e5
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r6 = 0
            goto L_0x00e6
        L_0x00e5:
            r6 = 1
        L_0x00e6:
            r4.y(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.U(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.O(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.L(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.E(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.A(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.b0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x012b
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0130
        L_0x012b:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0130:
            r4.c(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.J(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.I(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.R(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.P(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0168
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r6 = 0
            goto L_0x0169
        L_0x0168:
            r6 = 1
        L_0x0169:
            r4.g(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 24
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.e(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 25
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0180
            r6 = 0
            goto L_0x0184
        L_0x0180:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0184:
            r4.Z(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 26
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01a1
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x0293 }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.f(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01a1:
            boolean r6 = com.google.android.gms.internal.measurement.pf.a()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.f6224y0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.A(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 != 0) goto L_0x01bf
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.f6220w0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.r(r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01c8
        L_0x01bf:
            r6 = 28
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.V(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01c8:
            boolean r6 = com.google.android.gms.internal.measurement.bg.a()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.A0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.r(r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ee
            r6 = 29
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x01ea
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x01ea
            r6 = 1
            goto L_0x01eb
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            r4.C(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x01ee:
            r6 = 30
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.n0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 31
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.l0(r6)     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = com.google.android.gms.internal.measurement.df.a()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.L0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.A(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0224
            r6 = 32
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.b(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r6 = 35
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0293 }
            r4.w(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0224:
            boolean r6 = com.google.android.gms.internal.measurement.fd.a()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.Y0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.A(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x024a
            r6 = 33
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 != 0) goto L_0x0246
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0246
            r6 = 1
            goto L_0x0247
        L_0x0246:
            r6 = 0
        L_0x0247:
            r4.G(r6)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x024a:
            boolean r6 = com.google.android.gms.internal.measurement.kd.a()     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            com.google.android.gms.measurement.internal.g r6 = r41.d()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.k0.T0     // Catch:{ SQLiteException -> 0x0293 }
            boolean r6 = r6.A(r1, r7)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x0275
            r6 = 34
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r7 == 0) goto L_0x0266
            r0 = r2
            goto L_0x0272
        L_0x0266:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0293 }
            if (r6 == 0) goto L_0x026d
            goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0272:
            r4.d(r0)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x0275:
            r4.o()     // Catch:{ SQLiteException -> 0x0293 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0293 }
            if (r0 == 0) goto L_0x028f
            com.google.android.gms.measurement.internal.x4 r0 = r41.k()     // Catch:{ SQLiteException -> 0x0293 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ SQLiteException -> 0x0293 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r42)     // Catch:{ SQLiteException -> 0x0293 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0293 }
        L_0x028f:
            r3.close()
            return r4
        L_0x0293:
            r0 = move-exception
            goto L_0x02a5
        L_0x0295:
            r0 = move-exception
            r5 = r41
            goto L_0x02bd
        L_0x0299:
            r0 = move-exception
            r5 = r41
            goto L_0x02a5
        L_0x029d:
            r0 = move-exception
            r5 = r41
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r5 = r41
            r3 = r2
        L_0x02a5:
            com.google.android.gms.measurement.internal.x4 r4 = r41.k()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.x4.u(r42)     // Catch:{ all -> 0x02bc }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x02bb
            r3.close()
        L_0x02bb:
            return r2
        L_0x02bc:
            r0 = move-exception
        L_0x02bd:
            r2 = r3
        L_0x02be:
            if (r2 == 0) goto L_0x02c3
            r2.close()
        L_0x02c3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.C0(java.lang.String):com.google.android.gms.measurement.internal.h6");
    }

    public final long D(s4 s4Var) {
        m();
        t();
        h2.p.j(s4Var);
        h2.p.f(s4Var.G3());
        byte[] n10 = s4Var.n();
        long z9 = n().z(n10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s4Var.G3());
        contentValues.put("metadata_fingerprint", Long.valueOf(z9));
        contentValues.put("metadata", n10);
        try {
            A().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return z9;
        } catch (SQLiteException e10) {
            k().F().c("Error storing raw event metadata. appId", x4.u(s4Var.G3()), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.r D0(java.lang.String r12) {
        /*
            r11 = this;
            h2.p.f(r12)
            r11.m()
            r11.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.A()     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r10 = 0
            r5[r10] = r12     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006a, all -> 0x0068 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0066 }
            if (r2 != 0) goto L_0x0033
            r1.close()
            return r0
        L_0x0033:
            byte[] r2 = r1.getBlob(r10)     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r3 = r1.getString(r9)     // Catch:{ SQLiteException -> 0x0066 }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x0066 }
            boolean r5 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0066 }
            if (r5 == 0) goto L_0x0057
            com.google.android.gms.measurement.internal.x4 r5 = r11.k()     // Catch:{ SQLiteException -> 0x0066 }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r12)     // Catch:{ SQLiteException -> 0x0066 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x0066 }
        L_0x0057:
            if (r2 != 0) goto L_0x005d
            r1.close()
            return r0
        L_0x005d:
            com.google.android.gms.measurement.internal.r r5 = new com.google.android.gms.measurement.internal.r     // Catch:{ SQLiteException -> 0x0066 }
            r5.<init>(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0066 }
            r1.close()
            return r5
        L_0x0066:
            r2 = move-exception
            goto L_0x006c
        L_0x0068:
            r12 = move-exception
            goto L_0x0085
        L_0x006a:
            r2 = move-exception
            r1 = r0
        L_0x006c:
            com.google.android.gms.measurement.internal.x4 r3 = r11.k()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.x4.u(r12)     // Catch:{ all -> 0x0083 }
            r3.c(r4, r12, r2)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            return r0
        L_0x0083:
            r12 = move-exception
            r0 = r1
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()
        L_0x008a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.D0(java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    public final long E(String str) {
        h2.p.f(str);
        m();
        t();
        try {
            return (long) A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, d().t(str, k0.f6209r))))});
        } catch (SQLiteException e10) {
            k().F().c("Error deleting over the limit events. appId", x4.u(str), e10);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.pc E0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            h2.p.f(r19)
            h2.p.f(r20)
            r18.m()
            r18.t()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.A()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0080 }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r11 = r18
            java.lang.Object r7 = r11.L(r10, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r7 != 0) goto L_0x004d
            r10.close()
            return r9
        L_0x004d:
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.pc r0 = new com.google.android.gms.measurement.internal.pc     // Catch:{ SQLiteException -> 0x0076 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0076 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.x4 r1 = r18.k()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r19)     // Catch:{ SQLiteException -> 0x0076 }
            r1.b(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
        L_0x0072:
            r10.close()
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0088
        L_0x0078:
            r0 = move-exception
            r11 = r18
            goto L_0x00a8
        L_0x007c:
            r0 = move-exception
            r11 = r18
            goto L_0x0088
        L_0x0080:
            r0 = move-exception
            r11 = r18
            goto L_0x00a9
        L_0x0084:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0088:
            com.google.android.gms.measurement.internal.x4 r1 = r18.k()     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r19)     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.measurement.internal.w4 r4 = r18.f()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = r4.g(r8)     // Catch:{ all -> 0x00a7 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x00a6
            r10.close()
        L_0x00a6:
            return r9
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            r9 = r10
        L_0x00a9:
            if (r9 == 0) goto L_0x00ae
            r9.close()
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.E0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.pc");
    }

    public final z F0(String str) {
        if (!kd.a() || !d().r(k0.T0)) {
            return z.f6758f;
        }
        h2.p.j(str);
        m();
        t();
        return z.c(O("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.n4, java.lang.Long> G(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.m()
            r7.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.A()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.x4 r8 = r7.k()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.J()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0035:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0071 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.internal.measurement.n4$a r4 = com.google.android.gms.internal.measurement.n4.c0()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.ga r2 = com.google.android.gms.measurement.internal.jc.E(r4, r2)     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.n4$a r2 = (com.google.android.gms.internal.measurement.n4.a) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.da r2 = r2.l()     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.p8 r2 = (com.google.android.gms.internal.measurement.p8) r2     // Catch:{ IOException -> 0x005b }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.n4) r2     // Catch:{ IOException -> 0x005b }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r8
        L_0x005b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.x4 r3 = r7.k()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x0071 }
            r3.d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0071 }
            r1.close()
            return r0
        L_0x0071:
            r8 = move-exception
            goto L_0x0077
        L_0x0073:
            r8 = move-exception
            goto L_0x008c
        L_0x0075:
            r8 = move-exception
            r1 = r0
        L_0x0077:
            com.google.android.gms.measurement.internal.x4 r9 = r7.k()     // Catch:{ all -> 0x008a }
            com.google.android.gms.measurement.internal.z4 r9 = r9.F()     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            return r0
        L_0x008a:
            r8 = move-exception
            r0 = r1
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()
        L_0x0091:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.G(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<m3>> G0(String str, String str2) {
        t();
        m();
        h2.p.f(str);
        h2.p.f(str2);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<m3>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    m3 m3Var = (m3) ((p8) ((m3.a) jc.E(m3.P(), cursor.getBlob(1))).l());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(m3Var);
                } catch (IOException e10) {
                    k().F().c("Failed to merge filter. appId", x4.u(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            k().F().c("Database error querying filters. appId", x4.u(str), e11);
            Map<Integer, List<m3>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final q H(long j10, String str, long j11, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        h2.p.f(str);
        m();
        t();
        String[] strArr = {str};
        q qVar = new q();
        Cursor cursor = null;
        try {
            SQLiteDatabase A = A();
            cursor = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                k().K().b("Not updating daily counts, app is not known. appId", x4.u(str));
                cursor.close();
                return qVar;
            }
            if (cursor.getLong(0) == j10) {
                qVar.f6450b = cursor.getLong(1);
                qVar.f6449a = cursor.getLong(2);
                qVar.f6451c = cursor.getLong(3);
                qVar.f6452d = cursor.getLong(4);
                qVar.f6453e = cursor.getLong(5);
            }
            if (z9) {
                qVar.f6450b += j11;
            }
            if (z10) {
                qVar.f6449a += j11;
            }
            if (z11) {
                qVar.f6451c += j11;
            }
            if (z12) {
                qVar.f6452d += j11;
            }
            if (z13) {
                qVar.f6453e += j11;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j10));
            contentValues.put("daily_public_events_count", Long.valueOf(qVar.f6449a));
            contentValues.put("daily_events_count", Long.valueOf(qVar.f6450b));
            contentValues.put("daily_conversions_count", Long.valueOf(qVar.f6451c));
            contentValues.put("daily_error_events_count", Long.valueOf(qVar.f6452d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(qVar.f6453e));
            A.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return qVar;
        } catch (SQLiteException e10) {
            k().F().c("Error updating daily counts. appId", x4.u(str), e10);
            if (cursor != null) {
                cursor.close();
            }
            return qVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final p7 H0(String str) {
        h2.p.j(str);
        m();
        t();
        if (!kd.a() || !d().r(k0.T0)) {
            return p7.e(O("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        p7 p7Var = (p7) M("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, o.f6366a);
        return p7Var == null ? p7.f6429c : p7Var;
    }

    public final q I(long j10, String str, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return H(j10, str, 1, false, false, z11, false, z13);
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<p3>> I0(String str, String str2) {
        t();
        m();
        h2.p.f(str);
        h2.p.f(str2);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = A().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<p3>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    p3 p3Var = (p3) ((p8) ((p3.a) jc.E(p3.M(), cursor.getBlob(1))).l());
                    int i10 = cursor.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(p3Var);
                } catch (IOException e10) {
                    k().F().c("Failed to merge filter", x4.u(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            k().F().c("Database error querying filters. appId", x4.u(str), e11);
            Map<Integer, List<p3>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<rb> J0(String str) {
        h2.p.f(str);
        m();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = A().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                arrayList.add(new rb(string, cursor.getLong(1), cursor.getInt(2)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            k().F().c("Error querying trigger uris. appId", x4.u(str), e10);
            List<rb> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void K0(String str, String str2) {
        h2.p.f(str);
        h2.p.f(str2);
        m();
        t();
        try {
            A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            k().F().d("Error deleting user property. appId", x4.u(str), f().g(str2), e10);
        }
    }

    public final List<pc> L0(String str) {
        h2.p.f(str);
        m();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j10 = cursor.getLong(2);
                Object L = L(cursor, 3);
                if (L == null) {
                    k().F().b("Read invalid user property value, ignoring it. appId", x4.u(str));
                } else {
                    arrayList.add(new pc(str, str2, string, j10, L));
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            k().F().c("Error querying user properties. appId", x4.u(str), e10);
            List<pc> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, u4> M0(String str) {
        t();
        m();
        h2.p.f(str);
        Cursor cursor = null;
        try {
            cursor = A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, u4> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            a aVar = new a();
            do {
                int i10 = cursor.getInt(0);
                try {
                    aVar.put(Integer.valueOf(i10), (u4) ((p8) ((u4.a) jc.E(u4.Y(), cursor.getBlob(1))).l()));
                } catch (IOException e10) {
                    k().F().d("Failed to merge filter results. appId, audienceId, error", x4.u(str), Integer.valueOf(i10), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            k().F().c("Database error querying filter results. appId", x4.u(str), e11);
            Map<Integer, u4> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String N(long r5) {
        /*
            r4 = this;
            r4.m()
            r4.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.A()     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003e, all -> 0x003c }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.x4 r6 = r4.k()     // Catch:{ SQLiteException -> 0x003a }
            com.google.android.gms.measurement.internal.z4 r6 = r6.J()     // Catch:{ SQLiteException -> 0x003a }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r0
        L_0x0032:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003a }
            r5.close()
            return r6
        L_0x003a:
            r6 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0055
        L_0x003e:
            r6 = move-exception
            r5 = r0
        L_0x0040:
            com.google.android.gms.measurement.internal.x4 r1 = r4.k()     // Catch:{ all -> 0x0053 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x0052
            r5.close()
        L_0x0052:
            return r0
        L_0x0053:
            r6 = move-exception
            r0 = r5
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.N(long):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<m3>> N0(String str) {
        h2.p.f(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<m3>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    m3 m3Var = (m3) ((p8) ((m3.a) jc.E(m3.P(), cursor.getBlob(1))).l());
                    if (m3Var.X()) {
                        int i10 = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(m3Var);
                    }
                } catch (IOException e10) {
                    k().F().c("Failed to merge filter. appId", x4.u(str), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e11) {
            k().F().c("Database error querying filters. appId", x4.u(str), e11);
            Map<Integer, List<m3>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> O0(String str) {
        t();
        m();
        h2.p.f(str);
        a aVar = new a();
        Cursor cursor = null;
        try {
            cursor = A().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
            if (!cursor.moveToFirst()) {
                Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                int i10 = cursor.getInt(0);
                List list = (List) aVar.get(Integer.valueOf(i10));
                if (list == null) {
                    list = new ArrayList();
                    aVar.put(Integer.valueOf(i10), list);
                }
                list.add(Integer.valueOf(cursor.getInt(1)));
            } while (cursor.moveToNext());
            cursor.close();
            return aVar;
        } catch (SQLiteException e10) {
            k().F().c("Database error querying scoped filters. appId", x4.u(str), e10);
            Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x017f A[EDGE_INSN: B:89:0x017f->B:77:0x017f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.s4, java.lang.Long>> P(java.lang.String r19, int r20, int r21) {
        /*
            r18 = this;
            r1 = r21
            r18.m()
            r18.t()
            r2 = 1
            r3 = 0
            if (r20 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            h2.p.a(r0)
            if (r1 <= 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            h2.p.a(r0)
            h2.p.f(r19)
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r18.A()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r6 = "queue"
            java.lang.String r0 = "rowid"
            java.lang.String r7 = "data"
            java.lang.String r8 = "retry_count"
            java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0185 }
            r9[r3] = r19     // Catch:{ SQLiteException -> 0x0185 }
            r10 = 0
            r11 = 0
            java.lang.String r12 = "rowid"
            java.lang.String r13 = java.lang.String.valueOf(r20)     // Catch:{ SQLiteException -> 0x0185 }
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0185 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0185 }
            if (r0 != 0) goto L_0x004e
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0185 }
            r4.close()
            return r0
        L_0x004e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0185 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0185 }
            r6 = 0
        L_0x0054:
            long r7 = r4.getLong(r3)     // Catch:{ SQLiteException -> 0x0185 }
            byte[] r0 = r4.getBlob(r2)     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.measurement.internal.jc r9 = r18.n()     // Catch:{ IOException -> 0x0163 }
            byte[] r0 = r9.h0(r0)     // Catch:{ IOException -> 0x0163 }
            boolean r9 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0185 }
            if (r9 != 0) goto L_0x006e
            int r9 = r0.length     // Catch:{ SQLiteException -> 0x0185 }
            int r9 = r9 + r6
            if (r9 > r1) goto L_0x017f
        L_0x006e:
            com.google.android.gms.internal.measurement.s4$a r9 = com.google.android.gms.internal.measurement.s4.D3()     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.ga r9 = com.google.android.gms.measurement.internal.jc.E(r9, r0)     // Catch:{ IOException -> 0x0150 }
            com.google.android.gms.internal.measurement.s4$a r9 = (com.google.android.gms.internal.measurement.s4.a) r9     // Catch:{ IOException -> 0x0150 }
            boolean r10 = com.google.android.gms.internal.measurement.kd.a()     // Catch:{ SQLiteException -> 0x0185 }
            if (r10 == 0) goto L_0x012c
            com.google.android.gms.measurement.internal.g r10 = r18.d()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.k0.X0     // Catch:{ SQLiteException -> 0x0185 }
            boolean r10 = r10.r(r11)     // Catch:{ SQLiteException -> 0x0185 }
            if (r10 == 0) goto L_0x012c
            boolean r10 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x0185 }
            if (r10 != 0) goto L_0x012c
            java.lang.Object r10 = r5.get(r3)     // Catch:{ SQLiteException -> 0x0185 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.Object r10 = r10.first     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.s4 r10 = (com.google.android.gms.internal.measurement.s4) r10     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.da r11 = r9.l()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.p8 r11 = (com.google.android.gms.internal.measurement.p8) r11     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.s4 r11 = (com.google.android.gms.internal.measurement.s4) r11     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r12 = r10.i0()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r13 = r11.i0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0185 }
            if (r12 == 0) goto L_0x0129
            java.lang.String r12 = r10.h0()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r13 = r11.h0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0185 }
            if (r12 == 0) goto L_0x0129
            boolean r12 = r10.y0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r13 = r11.y0()     // Catch:{ SQLiteException -> 0x0185 }
            if (r12 != r13) goto L_0x0129
            java.lang.String r12 = r10.j0()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r13 = r11.j0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r12 = r12.equals(r13)     // Catch:{ SQLiteException -> 0x0185 }
            if (r12 == 0) goto L_0x0129
            java.util.List r10 = r10.w0()     // Catch:{ SQLiteException -> 0x0185 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ SQLiteException -> 0x0185 }
        L_0x00de:
            boolean r12 = r10.hasNext()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r13 = "_npa"
            r14 = -1
            if (r12 == 0) goto L_0x00ff
            java.lang.Object r12 = r10.next()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.w4 r12 = (com.google.android.gms.internal.measurement.w4) r12     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r2 = r12.c0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r2 = r13.equals(r2)     // Catch:{ SQLiteException -> 0x0185 }
            if (r2 == 0) goto L_0x00fd
            long r16 = r12.X()     // Catch:{ SQLiteException -> 0x0185 }
            goto L_0x0101
        L_0x00fd:
            r2 = 1
            goto L_0x00de
        L_0x00ff:
            r16 = r14
        L_0x0101:
            java.util.List r2 = r11.w0()     // Catch:{ SQLiteException -> 0x0185 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLiteException -> 0x0185 }
        L_0x0109:
            boolean r10 = r2.hasNext()     // Catch:{ SQLiteException -> 0x0185 }
            if (r10 == 0) goto L_0x0123
            java.lang.Object r10 = r2.next()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.w4 r10 = (com.google.android.gms.internal.measurement.w4) r10     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r11 = r10.c0()     // Catch:{ SQLiteException -> 0x0185 }
            boolean r11 = r13.equals(r11)     // Catch:{ SQLiteException -> 0x0185 }
            if (r11 == 0) goto L_0x0109
            long r14 = r10.X()     // Catch:{ SQLiteException -> 0x0185 }
        L_0x0123:
            int r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 0
        L_0x012a:
            if (r2 == 0) goto L_0x017f
        L_0x012c:
            r2 = 2
            boolean r10 = r4.isNull(r2)     // Catch:{ SQLiteException -> 0x0185 }
            if (r10 != 0) goto L_0x013a
            int r2 = r4.getInt(r2)     // Catch:{ SQLiteException -> 0x0185 }
            r9.r0(r2)     // Catch:{ SQLiteException -> 0x0185 }
        L_0x013a:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0185 }
            int r6 = r6 + r0
            com.google.android.gms.internal.measurement.da r0 = r9.l()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.p8) r0     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.internal.measurement.s4 r0 = (com.google.android.gms.internal.measurement.s4) r0     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0185 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0185 }
            r5.add(r0)     // Catch:{ SQLiteException -> 0x0185 }
            goto L_0x0173
        L_0x0150:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r2 = r18.k()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r7 = "Failed to merge queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r19)     // Catch:{ SQLiteException -> 0x0185 }
        L_0x015f:
            r2.c(r7, r8, r0)     // Catch:{ SQLiteException -> 0x0185 }
            goto L_0x0173
        L_0x0163:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r2 = r18.k()     // Catch:{ SQLiteException -> 0x0185 }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ SQLiteException -> 0x0185 }
            java.lang.String r7 = "Failed to unzip queued bundle. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r19)     // Catch:{ SQLiteException -> 0x0185 }
            goto L_0x015f
        L_0x0173:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0185 }
            if (r0 == 0) goto L_0x017f
            if (r6 <= r1) goto L_0x017c
            goto L_0x017f
        L_0x017c:
            r2 = 1
            goto L_0x0054
        L_0x017f:
            r4.close()
            return r5
        L_0x0183:
            r0 = move-exception
            goto L_0x01a1
        L_0x0185:
            r0 = move-exception
            com.google.android.gms.measurement.internal.x4 r1 = r18.k()     // Catch:{ all -> 0x0183 }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = "Error querying bundles. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.x4.u(r19)     // Catch:{ all -> 0x0183 }
            r1.c(r2, r3, r0)     // Catch:{ all -> 0x0183 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0183 }
            if (r4 == 0) goto L_0x01a0
            r4.close()
        L_0x01a0:
            return r0
        L_0x01a1:
            if (r4 == 0) goto L_0x01a6
            r4.close()
        L_0x01a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.P(java.lang.String, int, int):java.util.List");
    }

    public final void P0() {
        t();
        A().beginTransaction();
    }

    public final List<e> Q(String str, String str2, String str3) {
        h2.p.f(str);
        m();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return R(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void Q0() {
        t();
        A().endTransaction();
    }

    public final List<e> R(String str, String[] strArr) {
        m();
        t();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z9 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object L = L(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z9 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j10 = cursor.getLong(6);
                    jc n10 = n();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator creator = i0.CREATOR;
                    long j11 = cursor.getLong(8);
                    long j12 = cursor.getLong(10);
                    boolean z10 = z9;
                    e eVar = r3;
                    e eVar2 = new e(string, string2, new nc(string3, j12, L, string2), j11, z10, string4, (i0) n10.B(blob, creator), j10, (i0) n().B(cursor.getBlob(9), creator), cursor.getLong(11), (i0) n().B(cursor.getBlob(12), creator));
                    arrayList.add(eVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    k().F().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e10) {
            k().F().b("Error querying conditional user property value", e10);
            List<e> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void R0() {
        int delete;
        m();
        t();
        if (t0()) {
            long a10 = r().f5897e.a();
            long b10 = a().b();
            if (Math.abs(b10 - a10) > k0.A.a(null).longValue()) {
                r().f5897e.b(b10);
                m();
                t();
                if (t0() && (delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(a().a()), String.valueOf(g.L())})) > 0) {
                    k().J().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final void S0() {
        t();
        A().setTransactionSuccessful();
    }

    public final void T(e0 e0Var) {
        h2.p.j(e0Var);
        m();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e0Var.f5980a);
        contentValues.put("name", e0Var.f5981b);
        contentValues.put("lifetime_count", Long.valueOf(e0Var.f5982c));
        contentValues.put("current_bundle_count", Long.valueOf(e0Var.f5983d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e0Var.f5985f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e0Var.f5986g));
        contentValues.put("last_bundled_day", e0Var.f5987h);
        contentValues.put("last_sampled_complex_event_id", e0Var.f5988i);
        contentValues.put("last_sampling_rate", e0Var.f5989j);
        contentValues.put("current_session_count", Long.valueOf(e0Var.f5984e));
        Boolean bool = e0Var.f5990k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (A().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                k().F().b("Failed to insert/update event aggregates (got -1). appId", x4.u(e0Var.f5980a));
            }
        } catch (SQLiteException e10) {
            k().F().c("Error storing event aggregates. appId", x4.u(e0Var.f5980a), e10);
        }
    }

    public final boolean T0() {
        return w0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final void U(h6 h6Var) {
        h2.p.j(h6Var);
        m();
        t();
        String t02 = h6Var.t0();
        h2.p.j(t02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t02);
        contentValues.put("app_instance_id", h6Var.u0());
        contentValues.put("gmp_app_id", h6Var.j());
        contentValues.put("resettable_device_id_hash", h6Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(h6Var.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(h6Var.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(h6Var.i0()));
        contentValues.put("app_version", h6Var.h());
        contentValues.put("app_store", h6Var.v0());
        contentValues.put("gmp_version", Long.valueOf(h6Var.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(h6Var.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(h6Var.r()));
        contentValues.put("day", Long.valueOf(h6Var.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(h6Var.T()));
        contentValues.put("daily_events_count", Long.valueOf(h6Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(h6Var.K()));
        contentValues.put("config_fetched_time", Long.valueOf(h6Var.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(h6Var.e0()));
        contentValues.put("app_version_int", Long.valueOf(h6Var.z()));
        contentValues.put("firebase_instance_id", h6Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(h6Var.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(h6Var.W()));
        contentValues.put("health_monitor_sample", h6Var.k());
        contentValues.put("android_id", Long.valueOf(h6Var.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(h6Var.q()));
        contentValues.put("admob_app_id", h6Var.r0());
        contentValues.put("dynamite_version", Long.valueOf(h6Var.c0()));
        contentValues.put("session_stitching_token", h6Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(h6Var.t()));
        contentValues.put("target_os_version", Long.valueOf(h6Var.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(h6Var.o0()));
        if (df.a() && d().A(t02, k0.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(h6Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(h6Var.D()));
        }
        if (fd.a() && d().A(t02, k0.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(h6Var.u()));
        }
        List<String> n10 = h6Var.n();
        if (n10 != null) {
            if (n10.isEmpty()) {
                k().K().b("Safelisted events should not be an empty list. appId", t02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n10));
            }
        }
        if (ld.a() && d().r(k0.f6216u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (kd.a() && d().A(t02, k0.T0)) {
            contentValues.put("npa_metadata_value", h6Var.q0());
        }
        try {
            SQLiteDatabase A = A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{t02})) == 0 && A.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                k().F().b("Failed to insert/update app (got -1). appId", x4.u(t02));
            }
        } catch (SQLiteException e10) {
            k().F().c("Error storing app. appId", x4.u(t02), e10);
        }
    }

    public final boolean U0() {
        return w0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final void V(String str, z zVar) {
        if (kd.a() && d().r(k0.T0)) {
            h2.p.j(str);
            h2.p.j(zVar);
            m();
            t();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", zVar.i());
            X("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean V0() {
        return w0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final void W(String str, p7 p7Var) {
        h2.p.j(str);
        h2.p.j(p7Var);
        m();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", p7Var.v());
        if (!kd.a() || !d().r(k0.T0)) {
            try {
                if (A().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                    k().F().b("Failed to insert/update consent setting (got -1). appId", x4.u(str));
                }
            } catch (SQLiteException e10) {
                k().F().c("Error storing consent setting. appId, error", x4.u(str), e10);
            }
        } else {
            contentValues.put("consent_source", Integer.valueOf(p7Var.b()));
            X("consent_settings", "app_id", contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0164, code lost:
        r8.c(r10, r11, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(java.lang.String r18, java.util.List<com.google.android.gms.internal.measurement.l3> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "app_id=? and audience_id=?"
            java.lang.String r4 = "event_filters"
            java.lang.String r5 = "app_id=?"
            java.lang.String r6 = "property_filters"
            h2.p.j(r19)
            r8 = 0
        L_0x0012:
            int r9 = r19.size()
            if (r8 >= r9) goto L_0x00d0
            java.lang.Object r9 = r2.get(r8)
            com.google.android.gms.internal.measurement.l3 r9 = (com.google.android.gms.internal.measurement.l3) r9
            com.google.android.gms.internal.measurement.p8$b r9 = r9.B()
            com.google.android.gms.internal.measurement.l3$a r9 = (com.google.android.gms.internal.measurement.l3.a) r9
            int r11 = r9.x()
            if (r11 == 0) goto L_0x0095
            r11 = 0
        L_0x002b:
            int r12 = r9.x()
            if (r11 >= r12) goto L_0x0095
            com.google.android.gms.internal.measurement.m3 r12 = r9.A(r11)
            com.google.android.gms.internal.measurement.p8$b r12 = r12.B()
            com.google.android.gms.internal.measurement.m3$a r12 = (com.google.android.gms.internal.measurement.m3.a) r12
            java.lang.Object r13 = r12.clone()
            com.google.android.gms.internal.measurement.p8$b r13 = (com.google.android.gms.internal.measurement.p8.b) r13
            com.google.android.gms.internal.measurement.m3$a r13 = (com.google.android.gms.internal.measurement.m3.a) r13
            java.lang.String r14 = r12.B()
            java.lang.String r14 = com.google.android.gms.measurement.internal.q7.b(r14)
            if (r14 == 0) goto L_0x0052
            r13.z(r14)
            r14 = 1
            goto L_0x0053
        L_0x0052:
            r14 = 0
        L_0x0053:
            r15 = 0
        L_0x0054:
            int r7 = r12.x()
            if (r15 >= r7) goto L_0x0081
            com.google.android.gms.internal.measurement.n3 r7 = r12.A(r15)
            java.lang.String r16 = r7.P()
            java.lang.String r10 = com.google.android.gms.measurement.internal.s7.a(r16)
            if (r10 == 0) goto L_0x007e
            com.google.android.gms.internal.measurement.p8$b r7 = r7.B()
            com.google.android.gms.internal.measurement.n3$a r7 = (com.google.android.gms.internal.measurement.n3.a) r7
            com.google.android.gms.internal.measurement.n3$a r7 = r7.x(r10)
            com.google.android.gms.internal.measurement.da r7 = r7.l()
            com.google.android.gms.internal.measurement.p8 r7 = (com.google.android.gms.internal.measurement.p8) r7
            com.google.android.gms.internal.measurement.n3 r7 = (com.google.android.gms.internal.measurement.n3) r7
            r13.y(r15, r7)
            r14 = 1
        L_0x007e:
            int r15 = r15 + 1
            goto L_0x0054
        L_0x0081:
            if (r14 == 0) goto L_0x0092
            com.google.android.gms.internal.measurement.l3$a r9 = r9.y(r11, r13)
            com.google.android.gms.internal.measurement.da r7 = r9.l()
            com.google.android.gms.internal.measurement.p8 r7 = (com.google.android.gms.internal.measurement.p8) r7
            com.google.android.gms.internal.measurement.l3 r7 = (com.google.android.gms.internal.measurement.l3) r7
            r2.set(r8, r7)
        L_0x0092:
            int r11 = r11 + 1
            goto L_0x002b
        L_0x0095:
            int r7 = r9.B()
            if (r7 == 0) goto L_0x00cc
            r7 = 0
        L_0x009c:
            int r10 = r9.B()
            if (r7 >= r10) goto L_0x00cc
            com.google.android.gms.internal.measurement.p3 r10 = r9.C(r7)
            java.lang.String r11 = r10.O()
            java.lang.String r11 = com.google.android.gms.measurement.internal.r7.a(r11)
            if (r11 == 0) goto L_0x00c9
            com.google.android.gms.internal.measurement.p8$b r10 = r10.B()
            com.google.android.gms.internal.measurement.p3$a r10 = (com.google.android.gms.internal.measurement.p3.a) r10
            com.google.android.gms.internal.measurement.p3$a r10 = r10.x(r11)
            com.google.android.gms.internal.measurement.l3$a r9 = r9.z(r7, r10)
            com.google.android.gms.internal.measurement.da r10 = r9.l()
            com.google.android.gms.internal.measurement.p8 r10 = (com.google.android.gms.internal.measurement.p8) r10
            com.google.android.gms.internal.measurement.l3 r10 = (com.google.android.gms.internal.measurement.l3) r10
            r2.set(r8, r10)
        L_0x00c9:
            int r7 = r7 + 1
            goto L_0x009c
        L_0x00cc:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x00d0:
            r17.t()
            r17.m()
            h2.p.f(r18)
            h2.p.j(r19)
            android.database.sqlite.SQLiteDatabase r7 = r17.A()
            r7.beginTransaction()
            r17.t()     // Catch:{ all -> 0x0236 }
            r17.m()     // Catch:{ all -> 0x0236 }
            h2.p.f(r18)     // Catch:{ all -> 0x0236 }
            android.database.sqlite.SQLiteDatabase r8 = r17.A()     // Catch:{ all -> 0x0236 }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0236 }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x0236 }
            r8.delete(r6, r5, r10)     // Catch:{ all -> 0x0236 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0236 }
            r10[r11] = r0     // Catch:{ all -> 0x0236 }
            r8.delete(r4, r5, r10)     // Catch:{ all -> 0x0236 }
            java.util.Iterator r5 = r19.iterator()     // Catch:{ all -> 0x0236 }
        L_0x0104:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0236 }
            if (r8 == 0) goto L_0x0203
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.l3 r8 = (com.google.android.gms.internal.measurement.l3) r8     // Catch:{ all -> 0x0236 }
            r17.t()     // Catch:{ all -> 0x0236 }
            r17.m()     // Catch:{ all -> 0x0236 }
            h2.p.f(r18)     // Catch:{ all -> 0x0236 }
            h2.p.j(r8)     // Catch:{ all -> 0x0236 }
            boolean r9 = r8.U()     // Catch:{ all -> 0x0236 }
            if (r9 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.x4 r8 = r17.k()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.K()     // Catch:{ all -> 0x0236 }
            java.lang.String r9 = "Audience with no ID. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.x4.u(r18)     // Catch:{ all -> 0x0236 }
            r8.b(r9, r10)     // Catch:{ all -> 0x0236 }
            goto L_0x0104
        L_0x0134:
            int r9 = r8.q()     // Catch:{ all -> 0x0236 }
            java.util.List r10 = r8.S()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0236 }
        L_0x0140:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0236 }
            if (r11 == 0) goto L_0x0168
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.m3 r11 = (com.google.android.gms.internal.measurement.m3) r11     // Catch:{ all -> 0x0236 }
            boolean r11 = r11.Y()     // Catch:{ all -> 0x0236 }
            if (r11 != 0) goto L_0x0140
            com.google.android.gms.measurement.internal.x4 r8 = r17.k()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.K()     // Catch:{ all -> 0x0236 }
            java.lang.String r10 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r18)     // Catch:{ all -> 0x0236 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0236 }
        L_0x0164:
            r8.c(r10, r11, r9)     // Catch:{ all -> 0x0236 }
            goto L_0x0104
        L_0x0168:
            java.util.List r10 = r8.T()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0236 }
        L_0x0170:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0236 }
            if (r11 == 0) goto L_0x0195
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.p3 r11 = (com.google.android.gms.internal.measurement.p3) r11     // Catch:{ all -> 0x0236 }
            boolean r11 = r11.S()     // Catch:{ all -> 0x0236 }
            if (r11 != 0) goto L_0x0170
            com.google.android.gms.measurement.internal.x4 r8 = r17.k()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.K()     // Catch:{ all -> 0x0236 }
            java.lang.String r10 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.x4.u(r18)     // Catch:{ all -> 0x0236 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0236 }
            goto L_0x0164
        L_0x0195:
            java.util.List r10 = r8.S()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0236 }
        L_0x019d:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0236 }
            if (r11 == 0) goto L_0x01b1
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.m3 r11 = (com.google.android.gms.internal.measurement.m3) r11     // Catch:{ all -> 0x0236 }
            boolean r11 = r1.e0(r0, r9, r11)     // Catch:{ all -> 0x0236 }
            if (r11 != 0) goto L_0x019d
            r10 = 0
            goto L_0x01b2
        L_0x01b1:
            r10 = 1
        L_0x01b2:
            if (r10 == 0) goto L_0x01cf
            java.util.List r8 = r8.T()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0236 }
        L_0x01bc:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x0236 }
            if (r11 == 0) goto L_0x01cf
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.p3 r11 = (com.google.android.gms.internal.measurement.p3) r11     // Catch:{ all -> 0x0236 }
            boolean r11 = r1.f0(r0, r9, r11)     // Catch:{ all -> 0x0236 }
            if (r11 != 0) goto L_0x01bc
            r10 = 0
        L_0x01cf:
            if (r10 != 0) goto L_0x01ff
            r17.t()     // Catch:{ all -> 0x0236 }
            r17.m()     // Catch:{ all -> 0x0236 }
            h2.p.f(r18)     // Catch:{ all -> 0x0236 }
            android.database.sqlite.SQLiteDatabase r8 = r17.A()     // Catch:{ all -> 0x0236 }
            r10 = 2
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x0236 }
            r12 = 0
            r11[r12] = r0     // Catch:{ all -> 0x0236 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0236 }
            r13 = 1
            r11[r13] = r12     // Catch:{ all -> 0x0236 }
            r8.delete(r6, r3, r11)     // Catch:{ all -> 0x0236 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0236 }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x0236 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0236 }
            r12 = 1
            r10[r12] = r9     // Catch:{ all -> 0x0236 }
            r8.delete(r4, r3, r10)     // Catch:{ all -> 0x0236 }
            goto L_0x0104
        L_0x01ff:
            r11 = 0
            r12 = 1
            goto L_0x0104
        L_0x0203:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0236 }
            r3.<init>()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r2 = r19.iterator()     // Catch:{ all -> 0x0236 }
        L_0x020c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0236 }
            if (r4 == 0) goto L_0x022c
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0236 }
            com.google.android.gms.internal.measurement.l3 r4 = (com.google.android.gms.internal.measurement.l3) r4     // Catch:{ all -> 0x0236 }
            boolean r5 = r4.U()     // Catch:{ all -> 0x0236 }
            if (r5 == 0) goto L_0x0227
            int r4 = r4.q()     // Catch:{ all -> 0x0236 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0236 }
            goto L_0x0228
        L_0x0227:
            r4 = 0
        L_0x0228:
            r3.add(r4)     // Catch:{ all -> 0x0236 }
            goto L_0x020c
        L_0x022c:
            r1.y0(r0, r3)     // Catch:{ all -> 0x0236 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0236 }
            r7.endTransaction()
            return
        L_0x0236:
            r0 = move-exception
            r7.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.Y(java.lang.String, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public final void Z(List<Long> list) {
        m();
        t();
        h2.p.j(list);
        h2.p.l(list.size());
        if (t0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (w0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                k().K().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                A().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                k().F().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final boolean a0(s4 s4Var, boolean z9) {
        z4 F;
        Object u9;
        String str;
        m();
        t();
        h2.p.j(s4Var);
        h2.p.f(s4Var.G3());
        h2.p.m(s4Var.W0());
        R0();
        long a10 = a().a();
        if (s4Var.a3() < a10 - g.L() || s4Var.a3() > g.L() + a10) {
            k().K().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", x4.u(s4Var.G3()), Long.valueOf(a10), Long.valueOf(s4Var.a3()));
        }
        try {
            byte[] f02 = n().f0(s4Var.n());
            k().J().b("Saving bundle, size", Integer.valueOf(f02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", s4Var.G3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(s4Var.a3()));
            contentValues.put("data", f02);
            contentValues.put("has_realtime", Integer.valueOf(z9 ? 1 : 0));
            if (s4Var.d1()) {
                contentValues.put("retry_count", Integer.valueOf(s4Var.h2()));
            }
            try {
                if (A().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                k().F().b("Failed to insert bundle (got -1). appId", x4.u(s4Var.G3()));
                return false;
            } catch (SQLiteException e10) {
                e = e10;
                F = k().F();
                u9 = x4.u(s4Var.G3());
                str = "Error storing bundle. appId";
                F.c(str, u9, e);
                return false;
            }
        } catch (IOException e11) {
            e = e11;
            F = k().F();
            u9 = x4.u(s4Var.G3());
            str = "Data loss. Failed to serialize bundle. appId";
            F.c(str, u9, e);
            return false;
        }
    }

    public final boolean b0(e eVar) {
        h2.p.j(eVar);
        m();
        t();
        String str = eVar.f5969m;
        h2.p.j(str);
        if (E0(str, eVar.f5971o.f6359n) == null) {
            if (w0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f5970n);
        contentValues.put("name", eVar.f5971o.f6359n);
        S(contentValues, "value", h2.p.j(eVar.f5971o.d()));
        contentValues.put("active", Boolean.valueOf(eVar.f5973q));
        contentValues.put("trigger_event_name", eVar.f5974r);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f5976t));
        h();
        contentValues.put("timed_out_event", oc.o0(eVar.f5975s));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f5972p));
        h();
        contentValues.put("triggered_event", oc.o0(eVar.f5977u));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f5971o.f6360o));
        contentValues.put("time_to_live", Long.valueOf(eVar.f5978v));
        h();
        contentValues.put("expired_event", oc.o0(eVar.f5979w));
        try {
            if (A().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                k().F().b("Failed to insert/update conditional user property (got -1)", x4.u(str));
            }
        } catch (SQLiteException e10) {
            k().F().c("Error storing conditional user property", x4.u(str), e10);
        }
        return true;
    }

    public final boolean c0(a0 a0Var, long j10, boolean z9) {
        m();
        t();
        h2.p.j(a0Var);
        h2.p.f(a0Var.f5839a);
        byte[] n10 = n().C(a0Var).n();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a0Var.f5839a);
        contentValues.put("name", a0Var.f5840b);
        contentValues.put("timestamp", Long.valueOf(a0Var.f5842d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", n10);
        contentValues.put("realtime", Integer.valueOf(z9 ? 1 : 0));
        try {
            if (A().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            k().F().b("Failed to insert raw event (got -1). appId", x4.u(a0Var.f5839a));
            return false;
        } catch (SQLiteException e10) {
            k().F().c("Error storing raw event. appId", x4.u(a0Var.f5839a), e10);
            return false;
        }
    }

    public final boolean d0(pc pcVar) {
        h2.p.j(pcVar);
        m();
        t();
        if (E0(pcVar.f6444a, pcVar.f6446c) == null) {
            if (oc.I0(pcVar.f6446c)) {
                if (w0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{pcVar.f6444a}) >= ((long) d().p(pcVar.f6444a, k0.I, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(pcVar.f6446c)) {
                if (w0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{pcVar.f6444a, pcVar.f6445b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pcVar.f6444a);
        contentValues.put("origin", pcVar.f6445b);
        contentValues.put("name", pcVar.f6446c);
        contentValues.put("set_timestamp", Long.valueOf(pcVar.f6447d));
        S(contentValues, "value", pcVar.f6448e);
        try {
            if (A().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                k().F().b("Failed to insert/update user property (got -1). appId", x4.u(pcVar.f6444a));
            }
        } catch (SQLiteException e10) {
            k().F().c("Error storing user property. appId", x4.u(pcVar.f6444a), e10);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean g0(String str, Bundle bundle) {
        m();
        t();
        byte[] n10 = n().C(new a0(this.f6276a, "", str, "dep", 0, 0, bundle)).n();
        k().J().c("Saving default event parameters, appId, data size", f().c(str), Integer.valueOf(n10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", n10);
        try {
            if (A().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            k().F().b("Failed to insert default event parameters (got -1). appId", x4.u(str));
            return false;
        } catch (SQLiteException e10) {
            k().F().c("Error storing default event parameters. appId", x4.u(str), e10);
            return false;
        }
    }

    public final boolean h0(String str, rb rbVar) {
        m();
        t();
        h2.p.j(rbVar);
        h2.p.f(str);
        long a10 = a().a();
        if (rbVar.f6529n < a10 - g.L() || rbVar.f6529n > g.L() + a10) {
            k().K().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", x4.u(str), Long.valueOf(a10), Long.valueOf(rbVar.f6529n));
        }
        k().J().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", rbVar.f6528m);
        contentValues.put("source", Integer.valueOf(rbVar.f6530o));
        contentValues.put("timestamp_millis", Long.valueOf(rbVar.f6529n));
        try {
            if (A().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            k().F().b("Failed to insert trigger URI (got -1). appId", x4.u(str));
            return false;
        } catch (SQLiteException e10) {
            k().F().c("Error storing trigger URI. appId", x4.u(str), e10);
            return false;
        }
    }

    public final boolean i0(String str, Long l10, long j10, n4 n4Var) {
        m();
        t();
        h2.p.j(n4Var);
        h2.p.f(str);
        h2.p.j(l10);
        byte[] n10 = n4Var.n();
        k().J().c("Saving complex main event, appId, data size", f().c(str), Integer.valueOf(n10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", n10);
        try {
            if (A().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            k().F().b("Failed to insert complex main event (got -1). appId", x4.u(str));
            return false;
        } catch (SQLiteException e10) {
            k().F().c("Error storing complex main event. appId", x4.u(str), e10);
            return false;
        }
    }

    public final long u0(String str) {
        h2.p.f(str);
        return F("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    public final long v0(String str, String str2) {
        long F;
        String str3 = str;
        String str4 = str2;
        h2.p.f(str);
        h2.p.f(str2);
        m();
        t();
        SQLiteDatabase A = A();
        A.beginTransaction();
        long j10 = 0;
        try {
            try {
                F = F("select " + str4 + " from app2 where app_id=?", new String[]{str3}, -1);
                if (F == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (A.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        k().F().c("Failed to insert column (got -1). appId", x4.u(str), str4);
                        A.endTransaction();
                        return -1;
                    }
                    F = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    k().F().d("Error inserting column. appId", x4.u(str), str4, e);
                    A.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    th = th;
                    A.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + F));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    k().F().c("Failed to update column (got 0). appId", x4.u(str), str4);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return F;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = F;
                k().F().d("Error inserting column. appId", x4.u(str), str4, e);
                A.endTransaction();
                return j10;
            }
        } catch (SQLiteException e12) {
            e = e12;
            k().F().d("Error inserting column. appId", x4.u(str), str4, e);
            A.endTransaction();
            return j10;
        } catch (Throwable th2) {
            th = th2;
            A.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final long x() {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (SQLiteException e10) {
            k().F().b("Error querying raw events", e10);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        r13 = r22;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v3 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v5 android.database.Cursor), (r2v0 android.database.Cursor) binds: [B:1:0x0011, B:2:?, B:4:0x0019, B:18:0x008f, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.pc> x0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            h2.p.f(r23)
            r22.m()
            r22.t()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00f9 }
            r12 = r23
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f5, all -> 0x00f9 }
            if (r6 != 0) goto L_0x0034
            r6 = r24
            r3.add(r6)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            goto L_0x0036
        L_0x0034:
            r6 = r24
        L_0x0036:
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r7 != 0) goto L_0x0055
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
        L_0x0055:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            android.database.sqlite.SQLiteDatabase r13 = r22.A()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r14 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r15 = new java.lang.String[]{r3, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            if (r3 != 0) goto L_0x008f
            r2.close()
            return r1
        L_0x008f:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00ab
            com.google.android.gms.measurement.internal.x4 r0 = r22.k()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r13 = r22
            goto L_0x00e6
        L_0x00ab:
            r3 = 0
            java.lang.String r8 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 1
            long r9 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x00f9 }
            r3 = 2
            r13 = r22
            java.lang.Object r11 = r13.L(r2, r3)     // Catch:{ SQLiteException -> 0x00ef }
            java.lang.String r3 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00ef }
            if (r11 != 0) goto L_0x00d4
            com.google.android.gms.measurement.internal.x4 r5 = r22.k()     // Catch:{ SQLiteException -> 0x00ec }
            com.google.android.gms.measurement.internal.z4 r5 = r5.F()     // Catch:{ SQLiteException -> 0x00ec }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.x4.u(r23)     // Catch:{ SQLiteException -> 0x00ec }
            r5.d(r6, r7, r3, r0)     // Catch:{ SQLiteException -> 0x00ec }
            goto L_0x00e0
        L_0x00d4:
            com.google.android.gms.measurement.internal.pc r14 = new com.google.android.gms.measurement.internal.pc     // Catch:{ SQLiteException -> 0x00ec }
            r5 = r14
            r6 = r23
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00ec }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x00ec }
        L_0x00e0:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ec }
            if (r5 != 0) goto L_0x00ea
        L_0x00e6:
            r2.close()
            return r1
        L_0x00ea:
            r6 = r3
            goto L_0x008f
        L_0x00ec:
            r0 = move-exception
            r6 = r3
            goto L_0x0104
        L_0x00ef:
            r0 = move-exception
            goto L_0x0104
        L_0x00f1:
            r0 = move-exception
            r13 = r22
            goto L_0x0104
        L_0x00f5:
            r0 = move-exception
            r13 = r22
            goto L_0x0102
        L_0x00f9:
            r0 = move-exception
            r13 = r22
            goto L_0x0120
        L_0x00fd:
            r0 = move-exception
            r13 = r22
            r12 = r23
        L_0x0102:
            r6 = r24
        L_0x0104:
            com.google.android.gms.measurement.internal.x4 r1 = r22.k()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.z4 r1 = r1.F()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.x4.u(r23)     // Catch:{ all -> 0x011f }
            r1.d(r3, r4, r6, r0)     // Catch:{ all -> 0x011f }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x011e
            r2.close()
        L_0x011e:
            return r0
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            if (r2 == 0) goto L_0x0125
            r2.close()
        L_0x0125:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.x0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long y() {
        return F("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long z() {
        return F("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle z0(java.lang.String r8) {
        /*
            r7 = this;
            r7.m()
            r7.t()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.A()     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00ba, all -> 0x00b8 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.x4 r8 = r7.k()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.z4 r8 = r8.J()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x002e:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.n4$a r3 = com.google.android.gms.internal.measurement.n4.c0()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.ga r2 = com.google.android.gms.measurement.internal.jc.E(r3, r2)     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.n4$a r2 = (com.google.android.gms.internal.measurement.n4.a) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.da r2 = r2.l()     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.p8 r2 = (com.google.android.gms.internal.measurement.p8) r2     // Catch:{ IOException -> 0x00a0 }
            com.google.android.gms.internal.measurement.n4 r2 = (com.google.android.gms.internal.measurement.n4) r2     // Catch:{ IOException -> 0x00a0 }
            r7.n()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.List r8 = r2.f0()     // Catch:{ SQLiteException -> 0x00b6 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00b6 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00b6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00b6 }
        L_0x0054:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.internal.measurement.p4 r3 = (com.google.android.gms.internal.measurement.p4) r3     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = r3.f0()     // Catch:{ SQLiteException -> 0x00b6 }
            boolean r5 = r3.i0()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0072
            double r5 = r3.J()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0072:
            boolean r5 = r3.j0()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0080
            float r3 = r3.U()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x0080:
            boolean r5 = r3.m0()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x008e
            java.lang.String r3 = r3.g0()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x008e:
            boolean r5 = r3.k0()     // Catch:{ SQLiteException -> 0x00b6 }
            if (r5 == 0) goto L_0x0054
            long r5 = r3.a0()     // Catch:{ SQLiteException -> 0x00b6 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00b6 }
            goto L_0x0054
        L_0x009c:
            r1.close()
            return r2
        L_0x00a0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.x4 r3 = r7.k()     // Catch:{ SQLiteException -> 0x00b6 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()     // Catch:{ SQLiteException -> 0x00b6 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r8)     // Catch:{ SQLiteException -> 0x00b6 }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00b6 }
            r1.close()
            return r0
        L_0x00b6:
            r8 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8 = move-exception
            goto L_0x00d1
        L_0x00ba:
            r8 = move-exception
            r1 = r0
        L_0x00bc:
            com.google.android.gms.measurement.internal.x4 r2 = r7.k()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.z4 r2 = r2.F()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00ce
            r1.close()
        L_0x00ce:
            return r0
        L_0x00cf:
            r8 = move-exception
            r0 = r1
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r0.close()
        L_0x00d6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.z0(java.lang.String):android.os.Bundle");
    }
}
