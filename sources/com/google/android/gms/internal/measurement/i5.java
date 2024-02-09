package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class i5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f5338a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f5339b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f5340c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f5341d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f5342e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private static ContentResolver f5343f = null;

    /* renamed from: g  reason: collision with root package name */
    private static b f5344g = null;

    /* renamed from: h  reason: collision with root package name */
    private static HashMap<String, String> f5345h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Boolean> f5346i = new HashMap<>(16, 1.0f);

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, Integer> f5347j = new HashMap<>(16, 1.0f);

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<String, Long> f5348k = new HashMap<>(16, 1.0f);

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<String, Float> f5349l = new HashMap<>(16, 1.0f);

    /* renamed from: m  reason: collision with root package name */
    private static Object f5350m;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f5351n;

    /* renamed from: o  reason: collision with root package name */
    private static String[] f5352o = new String[0];

    public interface a<T extends Map<String, String>> {
        T e(int i10);
    }

    public interface b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r10 = r10.query(f5338a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r11}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ff, code lost:
        if (r10 != null) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r10 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        if (r10.moveToFirst() != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
        d(r0, r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12 = r10.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0118, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011b, code lost:
        if (r12 == null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0121, code lost:
        if (r12.equals((java.lang.Object) null) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        d(r0, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        if (r12 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0129, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.i5> r12 = com.google.android.gms.internal.measurement.i5.class
            monitor-enter(r12)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f5345h     // Catch:{ all -> 0x0130 }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicBoolean r0 = f5342e     // Catch:{ all -> 0x0130 }
            r0.set(r2)     // Catch:{ all -> 0x0130 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0130 }
            r4 = 16
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0130 }
            f5345h = r0     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            f5350m = r0     // Catch:{ all -> 0x0130 }
            f5351n = r2     // Catch:{ all -> 0x0130 }
            android.net.Uri r0 = f5338a     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.l5 r4 = new com.google.android.gms.internal.measurement.l5     // Catch:{ all -> 0x0130 }
            r4.<init>(r3)     // Catch:{ all -> 0x0130 }
            r10.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x0130 }
            goto L_0x0058
        L_0x002e:
            java.util.concurrent.atomic.AtomicBoolean r0 = f5342e     // Catch:{ all -> 0x0130 }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x0058
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f5345h     // Catch:{ all -> 0x0130 }
            r0.clear()     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = f5346i     // Catch:{ all -> 0x0130 }
            r0.clear()     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = f5347j     // Catch:{ all -> 0x0130 }
            r0.clear()     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = f5348k     // Catch:{ all -> 0x0130 }
            r0.clear()     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = f5349l     // Catch:{ all -> 0x0130 }
            r0.clear()     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x0130 }
            r0.<init>()     // Catch:{ all -> 0x0130 }
            f5350m = r0     // Catch:{ all -> 0x0130 }
            f5351n = r2     // Catch:{ all -> 0x0130 }
        L_0x0058:
            java.lang.Object r0 = f5350m     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.String> r4 = f5345h     // Catch:{ all -> 0x0130 }
            boolean r4 = r4.containsKey(r11)     // Catch:{ all -> 0x0130 }
            if (r4 == 0) goto L_0x006f
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f5345h     // Catch:{ all -> 0x0130 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x006d
            r3 = r10
        L_0x006d:
            monitor-exit(r12)     // Catch:{ all -> 0x0130 }
            return r3
        L_0x006f:
            java.lang.String[] r4 = f5352o     // Catch:{ all -> 0x0130 }
            int r5 = r4.length     // Catch:{ all -> 0x0130 }
            r6 = 0
        L_0x0073:
            if (r6 >= r5) goto L_0x00f0
            r7 = r4[r6]     // Catch:{ all -> 0x0130 }
            boolean r7 = r11.startsWith(r7)     // Catch:{ all -> 0x0130 }
            if (r7 == 0) goto L_0x00ed
            boolean r0 = f5351n     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x00eb
            java.lang.String[] r0 = f5352o     // Catch:{ all -> 0x0130 }
            com.google.android.gms.internal.measurement.k5 r2 = new com.google.android.gms.internal.measurement.k5     // Catch:{ all -> 0x0130 }
            r2.<init>()     // Catch:{ all -> 0x0130 }
            java.util.Map r10 = b(r10, r0, r2)     // Catch:{ all -> 0x0130 }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x00d6
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x00be
            java.util.Set r0 = r10.keySet()     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = f5346i     // Catch:{ all -> 0x0130 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0130 }
            r0.removeAll(r2)     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = f5347j     // Catch:{ all -> 0x0130 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0130 }
            r0.removeAll(r2)     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = f5348k     // Catch:{ all -> 0x0130 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0130 }
            r0.removeAll(r2)     // Catch:{ all -> 0x0130 }
            java.util.HashMap<java.lang.String, java.lang.Float> r2 = f5349l     // Catch:{ all -> 0x0130 }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x0130 }
            r0.removeAll(r2)     // Catch:{ all -> 0x0130 }
        L_0x00be:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r0 != 0) goto L_0x00d4
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f5345h     // Catch:{ all -> 0x0130 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x00cf
            f5345h = r10     // Catch:{ all -> 0x0130 }
            goto L_0x00d4
        L_0x00cf:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f5345h     // Catch:{ all -> 0x0130 }
            r0.putAll(r10)     // Catch:{ all -> 0x0130 }
        L_0x00d4:
            f5351n = r1     // Catch:{ all -> 0x0130 }
        L_0x00d6:
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f5345h     // Catch:{ all -> 0x0130 }
            boolean r10 = r10.containsKey(r11)     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x00eb
            java.util.HashMap<java.lang.String, java.lang.String> r10 = f5345h     // Catch:{ all -> 0x0130 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0130 }
            if (r10 == 0) goto L_0x00e9
            r3 = r10
        L_0x00e9:
            monitor-exit(r12)     // Catch:{ all -> 0x0130 }
            return r3
        L_0x00eb:
            monitor-exit(r12)     // Catch:{ all -> 0x0130 }
            return r3
        L_0x00ed:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x00f0:
            monitor-exit(r12)     // Catch:{ all -> 0x0130 }
            android.net.Uri r5 = f5338a
            r6 = 0
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r1]
            r8[r2] = r11
            r9 = 0
            r4 = r10
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)
            if (r10 != 0) goto L_0x0107
            if (r10 == 0) goto L_0x0106
            r10.close()
        L_0x0106:
            return r3
        L_0x0107:
            boolean r12 = r10.moveToFirst()     // Catch:{ all -> 0x012b }
            if (r12 != 0) goto L_0x0114
            d(r0, r11, r3)     // Catch:{ all -> 0x012b }
            r10.close()
            return r3
        L_0x0114:
            java.lang.String r12 = r10.getString(r1)     // Catch:{ all -> 0x012b }
            r10.close()
            if (r12 == 0) goto L_0x0124
            boolean r10 = r12.equals(r3)
            if (r10 == 0) goto L_0x0124
            r12 = r3
        L_0x0124:
            d(r0, r11, r12)
            if (r12 == 0) goto L_0x012a
            return r12
        L_0x012a:
            return r3
        L_0x012b:
            r11 = move-exception
            r10.close()
            throw r11
        L_0x0130:
            r10 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0130 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i5.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, a<T> aVar) {
        Cursor query = contentResolver.query(f5339b, (String[]) null, (String) null, strArr, (String) null);
        if (query == null) {
            return null;
        }
        T e10 = aVar.e(query.getCount());
        while (query.moveToNext()) {
            try {
                e10.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return e10;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (i5.class) {
            if (obj == f5350m) {
                f5345h.put(str, str2);
            }
        }
    }
}
