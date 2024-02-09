package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.pe;
import com.google.android.gms.internal.measurement.w1;
import e2.f;
import e2.i;
import h2.p;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import l2.d;
import l2.e;
import n2.c;
import p0.a;

public final class oc extends k7 {

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f6397i = {"firebase_", "google_", "ga_"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f6398j = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f6399c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f6400d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f6401e;

    /* renamed from: f  reason: collision with root package name */
    private a f6402f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f6403g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f6404h = null;

    oc(m6 m6Var) {
        super(m6Var);
    }

    static long A(byte[] bArr) {
        p.j(bArr);
        int i10 = 0;
        p.m(bArr.length > 0);
        long j10 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j10 += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
            length--;
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean A0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oc.A0(android.content.Context, java.lang.String):boolean");
    }

    public static Bundle C(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean C0(String str) {
        String a10 = k0.f6177b0.a(null);
        return a10.equals("*") || Arrays.asList(a10.split(",")).contains(str);
    }

    public static Bundle E(List<nc> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (nc next : list) {
            String str = next.f6363r;
            if (str != null) {
                bundle.putString(next.f6359n, str);
            } else {
                Long l10 = next.f6361p;
                if (l10 != null) {
                    bundle.putLong(next.f6359n, l10.longValue());
                } else {
                    Double d10 = next.f6365t;
                    if (d10 != null) {
                        bundle.putDouble(next.f6359n, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object G(int i10, Object obj, boolean z9, boolean z10) {
        Bundle q02;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return H(String.valueOf(obj), i10, z9);
            }
            if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (q02 = q0((Bundle) parcelable)) != null && !q02.isEmpty()) {
                    arrayList.add(q02);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    static boolean G0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String H(String str, int i10, boolean z9) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z9) {
            return null;
        }
        String substring = str.substring(0, str.offsetByCodePoints(0, i10));
        return substring + "...";
    }

    static boolean I0(String str) {
        p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void J(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (u0(bundle, i10)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                p.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean K0(String str) {
        for (String equals : f6398j) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int L0(String str) {
        if (!v0("event param", str)) {
            return 3;
        }
        if (!m0("event param", (String[]) null, str)) {
            return 14;
        }
        return !h0("event param", 40, str) ? 3 : 0;
    }

    private final int M0(String str) {
        if (!B0("event param", str)) {
            return 3;
        }
        if (!m0("event param", (String[]) null, str)) {
            return 14;
        }
        return !h0("event param", 40, str) ? 3 : 0;
    }

    private static int N0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!"_lgclid".equals(str) && !"_gbraid".equals(str)) ? 36 : 100;
    }

    private static boolean Q0(String str) {
        p.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest S0() {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void V(r9 r9Var, Bundle bundle, boolean z9) {
        if (bundle != null && r9Var != null && (!bundle.containsKey("_sc") || z9)) {
            String str = r9Var.f6516a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = r9Var.f6517b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", r9Var.f6518c);
        } else if (bundle != null && r9Var == null && z9) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void W(qc qcVar, int i10, String str, String str2, int i11) {
        X(qcVar, (String) null, i10, str, str2, i11);
    }

    @TargetApi(30)
    private final boolean W0() {
        Integer num;
        if (this.f6403g == null) {
            a P0 = P0();
            boolean z9 = false;
            if (P0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = P0.b().get(10000, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z9 = true;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        num2 = num;
                        k().K().b("Measurement manager api exception", e);
                        this.f6403g = Boolean.FALSE;
                        num = num2;
                        k().J().b("Measurement manager api status result", num);
                        return this.f6403g.booleanValue();
                    } catch (ExecutionException e11) {
                        e = e11;
                        num2 = num;
                        k().K().b("Measurement manager api exception", e);
                        this.f6403g = Boolean.FALSE;
                        num = num2;
                        k().J().b("Measurement manager api status result", num);
                        return this.f6403g.booleanValue();
                    } catch (InterruptedException e12) {
                        e = e12;
                        num2 = num;
                        k().K().b("Measurement manager api exception", e);
                        this.f6403g = Boolean.FALSE;
                        num = num2;
                        k().J().b("Measurement manager api status result", num);
                        return this.f6403g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        k().K().b("Measurement manager api exception", e);
                        this.f6403g = Boolean.FALSE;
                        num = num2;
                        k().J().b("Measurement manager api status result", num);
                        return this.f6403g.booleanValue();
                    }
                }
                this.f6403g = Boolean.valueOf(z9);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                e = e14;
                k().K().b("Measurement manager api exception", e);
                this.f6403g = Boolean.FALSE;
                num = num2;
                k().J().b("Measurement manager api status result", num);
                return this.f6403g.booleanValue();
            }
            k().J().b("Measurement manager api status result", num);
        }
        return this.f6403g.booleanValue();
    }

    static void X(qc qcVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        u0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", (long) i11);
        }
        qcVar.a(str, "_err", bundle);
    }

    private final void Y(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z9) {
        int i10;
        String str4;
        int i11;
        z4 G;
        String c10;
        String a10;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            int u9 = d().u();
            int i12 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i10 = !z9 ? M0(str7) : 0;
                    if (i10 == 0) {
                        i10 = L0(str7);
                    }
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    J(bundle2, i10, str7, str7, i10 == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (f0(bundle2.get(str7))) {
                        k().L().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i11 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i11 = w(str, str2, str7, bundle2.get(str7), bundle, list, z9, false);
                    }
                    if (i11 != 0 && !"_ev".equals(str4)) {
                        J(bundle2, i11, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (I0(str4) && !l0(str4, s7.f6542d)) {
                        int i13 = i12 + 1;
                        if (!a0(231100000, true)) {
                            G = k().G();
                            c10 = f().c(str6);
                            a10 = f().a(bundle2);
                            str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                        } else {
                            if (i13 > u9) {
                                if (!pe.a() || !d().r(k0.I0)) {
                                    G = k().G();
                                    c10 = f().c(str6);
                                    a10 = f().a(bundle2);
                                    str5 = "Item cannot contain custom parameters";
                                } else {
                                    z4 G2 = k().G();
                                    G2.c("Item can't contain more than " + u9 + " item-scoped custom params", f().c(str6), f().a(bundle2));
                                    u0(bundle2, 28);
                                    bundle2.remove(str4);
                                }
                            }
                            i12 = i13;
                        }
                        G.c(str5, c10, a10);
                        u0(bundle2, 23);
                        bundle2.remove(str4);
                        i12 = i13;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b0(android.content.Context r4) {
        /*
            h2.p.j(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oc.b0(android.content.Context):boolean");
    }

    static boolean c0(Context context, boolean z9) {
        p.j(context);
        return A0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean d0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean e0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean f0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean k0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            p.j(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty || !isEmpty2) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static boolean l0(String str, String[] strArr) {
        p.j(strArr);
        for (String a10 : strArr) {
            if (rc.a(str, a10)) {
                return true;
            }
        }
        return false;
    }

    static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> s0(List<e> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (e next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f5969m);
            bundle.putString("origin", next.f5970n);
            bundle.putLong("creation_timestamp", next.f5972p);
            bundle.putString("name", next.f5971o.f6359n);
            m7.b(bundle, p.j(next.f5971o.d()));
            bundle.putBoolean("active", next.f5973q);
            String str = next.f5974r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            i0 i0Var = next.f5975s;
            if (i0Var != null) {
                bundle.putString("timed_out_event_name", i0Var.f6112m);
                d0 d0Var = i0Var.f6113n;
                if (d0Var != null) {
                    bundle.putBundle("timed_out_event_params", d0Var.i());
                }
            }
            bundle.putLong("trigger_timeout", next.f5976t);
            i0 i0Var2 = next.f5977u;
            if (i0Var2 != null) {
                bundle.putString("triggered_event_name", i0Var2.f6112m);
                d0 d0Var2 = i0Var2.f6113n;
                if (d0Var2 != null) {
                    bundle.putBundle("triggered_event_params", d0Var2.i());
                }
            }
            bundle.putLong("triggered_timestamp", next.f5971o.f6360o);
            bundle.putLong("time_to_live", next.f5978v);
            i0 i0Var3 = next.f5979w;
            if (i0Var3 != null) {
                bundle.putString("expired_event_name", i0Var3.f6112m);
                d0 d0Var3 = i0Var3.f6113n;
                if (d0Var3 != null) {
                    bundle.putBundle("expired_event_params", d0Var3.i());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean t0(Context context, String str) {
        z4 z4Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d10 = c.a(context).d(str, 64);
            if (d10 == null || (signatureArr = d10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e10) {
            e = e10;
            z4Var = k().F();
            str2 = "Error obtaining certificate";
            z4Var.b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            z4Var = k().F();
            str2 = "Package name not found";
            z4Var.b(str2, e);
            return true;
        }
    }

    private static boolean u0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i10);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int w(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            r15 = this;
            r7 = r15
            r8 = r18
            r0 = r19
            r1 = r20
            r15.m()
            boolean r2 = f0(r19)
            java.lang.String r3 = "param"
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0091
            if (r23 == 0) goto L_0x008e
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.s7.f6541c
            boolean r2 = l0(r8, r2)
            if (r2 != 0) goto L_0x0021
            r0 = 20
            return r0
        L_0x0021:
            com.google.android.gms.measurement.internal.m6 r2 = r7.f6276a
            com.google.android.gms.measurement.internal.y9 r2 = r2.I()
            boolean r2 = r2.c0()
            if (r2 != 0) goto L_0x0030
            r0 = 25
            return r0
        L_0x0030:
            boolean r2 = r0 instanceof android.os.Parcelable[]
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == 0) goto L_0x003b
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x0046
        L_0x003b:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x005b
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x0046:
            if (r5 <= r4) goto L_0x005b
            com.google.android.gms.measurement.internal.x4 r6 = r15.k()
            com.google.android.gms.measurement.internal.z4 r6 = r6.L()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r11 = "Parameter array is too long; discarded. Value kind, name, array length"
            r6.d(r11, r3, r8, r5)
            r5 = 0
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x0091
            r5 = 17
            if (r2 == 0) goto L_0x0072
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r4) goto L_0x008b
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x008b
        L_0x0072:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x008b
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r4) goto L_0x008b
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r9, r4)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x008b:
            r11 = 17
            goto L_0x0092
        L_0x008e:
            r0 = 21
            return r0
        L_0x0091:
            r11 = 0
        L_0x0092:
            boolean r1 = G0(r17)
            if (r1 != 0) goto L_0x00b2
            boolean r1 = G0(r18)
            if (r1 == 0) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            com.google.android.gms.measurement.internal.g r1 = r15.d()
            com.google.android.gms.measurement.internal.m6 r2 = r7.f6276a
            com.google.android.gms.measurement.internal.r4 r2 = r2.A()
            java.lang.String r2 = r2.E()
            int r1 = r1.s(r2)
            goto L_0x00c4
        L_0x00b2:
            com.google.android.gms.measurement.internal.g r1 = r15.d()
            com.google.android.gms.measurement.internal.m6 r2 = r7.f6276a
            com.google.android.gms.measurement.internal.r4 r2 = r2.A()
            java.lang.String r2 = r2.E()
            int r1 = r1.v(r2)
        L_0x00c4:
            boolean r1 = r15.j0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00cb
            return r11
        L_0x00cb:
            if (r23 == 0) goto L_0x0161
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e5
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.Y(r1, r2, r3, r4, r5, r6)
        L_0x00e2:
            r9 = 1
            goto L_0x015e
        L_0x00e5:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011c
            r12 = r0
            android.os.Parcelable[] r12 = (android.os.Parcelable[]) r12
            int r13 = r12.length
            r14 = 0
        L_0x00ee:
            if (r14 >= r13) goto L_0x00e2
            r0 = r12[r14]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0108
            com.google.android.gms.measurement.internal.x4 r1 = r15.k()
            com.google.android.gms.measurement.internal.z4 r1 = r1.L()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.c(r2, r0, r8)
            goto L_0x015e
        L_0x0108:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.Y(r1, r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            goto L_0x00ee
        L_0x011c:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x015e
            r12 = r0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            r0 = 0
        L_0x0128:
            if (r0 >= r13) goto L_0x00e2
            java.lang.Object r1 = r12.get(r0)
            int r14 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014b
            com.google.android.gms.measurement.internal.x4 r0 = r15.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.L()
            if (r1 == 0) goto L_0x0143
            java.lang.Class r1 = r1.getClass()
            goto L_0x0145
        L_0x0143:
            java.lang.String r1 = "null"
        L_0x0145:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.c(r2, r1, r8)
            goto L_0x015e
        L_0x014b:
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r6 = r22
            r0.Y(r1, r2, r3, r4, r5, r6)
            r0 = r14
            goto L_0x0128
        L_0x015e:
            if (r9 == 0) goto L_0x0161
            return r11
        L_0x0161:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oc.w(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] w0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static long x(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    static int x0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long z(d0 d0Var) {
        long j10 = 0;
        if (d0Var == null) {
            return 0;
        }
        Iterator<String> it = d0Var.iterator();
        while (it.hasNext()) {
            Object l10 = d0Var.l(it.next());
            if (l10 instanceof Parcelable[]) {
                j10 += (long) ((Parcelable[]) l10).length;
            }
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public final Bundle B(Uri uri, boolean z9, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str9 = uri2.getQueryParameter("utm_campaign");
                str8 = uri2.getQueryParameter("utm_source");
                str7 = uri2.getQueryParameter("utm_medium");
                str6 = uri2.getQueryParameter("gclid");
                str5 = z10 ? uri2.getQueryParameter("gbraid") : null;
                str4 = uri2.getQueryParameter("utm_id");
                str3 = uri2.getQueryParameter("dclid");
                str2 = uri2.getQueryParameter("srsltid");
                str = z9 ? uri2.getQueryParameter("sfmc_id") : null;
            } else {
                str9 = null;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str9) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && ((!z10 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z9 || TextUtils.isEmpty(str)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str9)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str9);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("source", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("medium", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("gclid", str6);
            }
            if (z10 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign_id", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("dclid", str3);
            }
            String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("srsltid", str2);
            }
            if (z9 && !TextUtils.isEmpty(str)) {
                bundle.putString(str10, str);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            k().K().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean B0(String str, String str2) {
        if (str2 == null) {
            k().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            k().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                k().G().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    k().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle D(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.q7.f6469d
            boolean r13 = l0(r10, r0)
            if (r11 == 0) goto L_0x00e8
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.g r0 = r19.d()
            int r8 = r0.D()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0046
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r0 = 0
            goto L_0x0054
        L_0x0046:
            if (r24 != 0) goto L_0x004d
            int r0 = r9.M0(r7)
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x0054
            int r0 = r9.L0(r7)
        L_0x0054:
            if (r0 == 0) goto L_0x0064
            r1 = 3
            if (r0 != r1) goto L_0x005b
            r1 = r7
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            J(r15, r0, r7, r7, r1)
            r15.remove(r7)
            r9 = r8
            goto L_0x00a0
        L_0x0064:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r15
            r6 = r23
            r14 = r7
            r7 = r24
            r9 = r8
            r8 = r13
            int r0 = r0.w(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0085
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            J(r15, r0, r14, r14, r1)
            goto L_0x00a4
        L_0x0085:
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00a4
            r1 = 21
            if (r0 != r1) goto L_0x0095
            r7 = r10
            goto L_0x0096
        L_0x0095:
            r7 = r14
        L_0x0096:
            java.lang.Object r1 = r11.get(r14)
            J(r15, r0, r7, r14, r1)
            r15.remove(r14)
        L_0x00a0:
            r8 = r9
            r9 = r19
            goto L_0x002e
        L_0x00a4:
            boolean r0 = I0(r14)
            if (r0 == 0) goto L_0x00a0
            int r0 = r18 + 1
            if (r0 <= r9) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Event can't contain more than "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.x4 r2 = r19.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.G()
            com.google.android.gms.measurement.internal.w4 r3 = r19.f()
            java.lang.String r3 = r3.c(r10)
            com.google.android.gms.measurement.internal.w4 r4 = r19.f()
            java.lang.String r4 = r4.a(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            u0(r15, r1)
            r15.remove(r14)
        L_0x00e3:
            r18 = r0
            goto L_0x00a0
        L_0x00e6:
            r14 = r15
            goto L_0x00e9
        L_0x00e8:
            r14 = 0
        L_0x00e9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oc.D(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final boolean D0(String str) {
        m();
        if (c.a(zza()).a(str) == 0) {
            return true;
        }
        k().E().b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean E0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d().M().equals(str);
    }

    /* access modifiers changed from: package-private */
    public final i0 F(String str, String str2, Bundle bundle, String str3, long j10, boolean z9, boolean z10) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (u(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle D = D(str, str2, bundle3, e.b("_o"), true);
            if (z9) {
                D = q0(D);
            }
            p.j(D);
            return new i0(str2, new d0(D), str3, j10);
        }
        k().F().b("Invalid conditional property event name", f().g(str2));
        throw new IllegalArgumentException();
    }

    public final int F0() {
        if (this.f6404h == null) {
            this.f6404h = Integer.valueOf(f.f().a(zza()) / 1000);
        }
        return this.f6404h.intValue();
    }

    /* access modifiers changed from: package-private */
    public final long H0() {
        m();
        if (!C0(this.f6276a.A().E())) {
            return 0;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4 : SdkExtensions.getExtensionVersion(30) < 4 ? 8 : x0() < k0.X.a(null).intValue() ? 16 : 0;
        if (!D0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !W0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1;
        }
        return j10;
    }

    public final URL I(long j10, String str, String str2, long j11, String str3) {
        try {
            p.f(str2);
            p.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j10), Integer.valueOf(F0())}), str2, str, Long.valueOf(j11)});
            if (str.equals(d().N())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            k().F().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r5 = zza().getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(r5)), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J0(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r4.zza()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r5)
            java.util.List r5 = r0.queryIntentActivities(r2, r1)
            if (r5 == 0) goto L_0x0029
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0029
            r5 = 1
            return r5
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.oc.J0(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void K(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            k().K().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* access modifiers changed from: package-private */
    public final void L(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    h().M(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void M(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                k().L().c("Not putting event parameter. Invalid value type. name, type", f().f(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void N(w1 w1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning int value to wrapper", e10);
        }
    }

    public final void O(w1 w1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning long value to wrapper", e10);
        }
    }

    public final long O0() {
        int i10 = (this.f6400d.get() > 0 ? 1 : (this.f6400d.get() == 0 ? 0 : -1));
        synchronized (this.f6400d) {
            if (i10 == 0) {
                long nextLong = new Random(System.nanoTime() ^ a().a()).nextLong();
                int i11 = this.f6401e + 1;
                this.f6401e = i11;
                long j10 = nextLong + ((long) i11);
                return j10;
            }
            this.f6400d.compareAndSet(-1, 1);
            long andIncrement = this.f6400d.getAndIncrement();
            return andIncrement;
        }
    }

    public final void P(w1 w1Var, Bundle bundle) {
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning bundle value to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final a P0() {
        if (this.f6402f == null) {
            this.f6402f = a.a(zza());
        }
        return this.f6402f;
    }

    public final void Q(w1 w1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning string value to wrapper", e10);
        }
    }

    public final void R(w1 w1Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning bundle list to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final String R0() {
        byte[] bArr = new byte[16];
        T0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public final void S(w1 w1Var, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z9);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void T(w1 w1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            w1Var.p(bundle);
        } catch (RemoteException e10) {
            this.f6276a.k().K().b("Error returning byte array to wrapper", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom T0() {
        m();
        if (this.f6399c == null) {
            this.f6399c = new SecureRandom();
        }
        return this.f6399c;
    }

    /* access modifiers changed from: package-private */
    public final void U(b5 b5Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(b5Var.f5887d.keySet())) {
            if (I0(str) && (i11 = i11 + 1) > i10) {
                k().G().c("Event can't contain more than " + i10 + " params", f().c(b5Var.f5884a), f().a(b5Var.f5887d));
                u0(b5Var.f5887d, 5);
                b5Var.f5887d.remove(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean U0() {
        m();
        return H0() == 1;
    }

    public final boolean V0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void Z(Parcelable[] parcelableArr, int i10, boolean z9) {
        int i11;
        p.j(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i12 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (I0(str) && !l0(str, s7.f6542d) && (i12 = i12 + 1) > i10) {
                    z4 G = k().G();
                    if (z9) {
                        G.c("Param can't contain more than " + i10 + " item-scoped custom parameters", f().f(str), f().a(bundle));
                        i11 = 28;
                    } else {
                        G.c("Param cannot contain item-scoped custom parameters", f().f(str), f().a(bundle));
                        i11 = 23;
                    }
                    u0(bundle, i11);
                    bundle.remove(str);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final boolean a0(int i10, boolean z9) {
        Boolean V = this.f6276a.I().V();
        if (F0() < i10 / 1000) {
            return V != null && !V.booleanValue();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean g0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            k().F().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public final boolean h0(String str, int i10, String str2) {
        if (str2 == null) {
            k().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        } else {
            k().G().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    /* access modifiers changed from: package-private */
    public final boolean i0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (Q0(str)) {
                return true;
            }
            if (this.f6276a.q()) {
                k().G().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", x4.u(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f6276a.q()) {
                k().G().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (Q0(str2)) {
            return true;
        } else {
            k().G().b("Invalid admob_app_id. Analytics disabled.", x4.u(str2));
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* access modifiers changed from: package-private */
    public final boolean j0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                k().L().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    /* access modifiers changed from: package-private */
    public final boolean m0(String str, String[] strArr, String str2) {
        return n0(str, strArr, (String[]) null, str2);
    }

    /* access modifiers changed from: package-private */
    public final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z9;
        if (str2 == null) {
            k().G().b("Name is required and can't be null. Type", str);
            return false;
        }
        p.j(str2);
        String[] strArr3 = f6397i;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z9 = false;
                break;
            } else if (str2.startsWith(strArr3[i10])) {
                z9 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z9) {
            k().G().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !l0(str2, strArr) || (strArr2 != null && l0(str2, strArr2))) {
            return true;
        } else {
            k().G().c("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int p0(String str) {
        if (!v0("user property", str)) {
            return 6;
        }
        if (!m0("user property", r7.f6512a, str)) {
            return 15;
        }
        return !h0("user property", 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: package-private */
    public final Bundle q0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object r02 = r0(str, bundle.get(str));
                if (r02 == null) {
                    k().L().b("Param value can't be null", f().f(str));
                } else {
                    M(bundle2, str, r02);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object r0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return G(d().v(this.f6276a.A().E()), obj, true, true);
        }
        return G(G0(str) ? d().v(this.f6276a.A().E()) : d().s(this.f6276a.A().E()), obj, false, true);
    }

    /* access modifiers changed from: protected */
    public final void s() {
        m();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                k().K().a("Utils falling back to Random for random id");
            }
        }
        this.f6400d.set(nextLong);
    }

    public final int t(int i10) {
        return f.f().h(zza(), i.f8355a);
    }

    /* access modifiers changed from: package-private */
    public final int u(String str) {
        if (!v0("event", str)) {
            return 2;
        }
        if (!n0("event", q7.f6466a, q7.f6467b, str)) {
            return 13;
        }
        return !h0("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int v(String str, Object obj) {
        String str2;
        int i10;
        if ("_ldl".equals(str)) {
            i10 = N0(str);
            str2 = "user property referrer";
        } else {
            i10 = N0(str);
            str2 = "user property";
        }
        return j0(str2, str, i10, obj) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean v0(String str, String str2) {
        if (str2 == null) {
            k().G().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            k().G().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        k().G().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            k().G().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final long y(Context context, String str) {
        m();
        p.j(context);
        p.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest S0 = S0();
        if (S0 == null) {
            k().F().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!t0(context, str)) {
                    Signature[] signatureArr = c.a(context).d(zza().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        return A(S0.digest(signatureArr[0].toByteArray()));
                    }
                    k().K().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                k().F().b("Package name not found", e10);
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final long y0(String str) {
        if (zza().getPackageManager() == null) {
            return 0;
        }
        int i10 = 0;
        try {
            ApplicationInfo b10 = c.a(zza()).b(str, 0);
            if (b10 != null) {
                i10 = b10.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            k().I().b("PackageManager failed to find running app: app_id", str);
        }
        return (long) i10;
    }

    /* access modifiers changed from: package-private */
    public final Object z0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int N0 = N0(str);
        return equals ? G(N0, obj, true, false) : G(N0, obj, false, false);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
