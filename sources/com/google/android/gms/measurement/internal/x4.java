package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.yd;
import h2.p;
import l2.d;

public final class x4 extends k7 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f6692c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f6693d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f6694e;

    /* renamed from: f  reason: collision with root package name */
    private final z4 f6695f = new z4(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final z4 f6696g = new z4(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final z4 f6697h = new z4(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final z4 f6698i = new z4(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final z4 f6699j = new z4(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    private final z4 f6700k = new z4(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    private final z4 f6701l = new z4(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    private final z4 f6702m = new z4(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    private final z4 f6703n = new z4(this, 2, false, false);

    x4(m6 m6Var) {
        super(m6Var);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (!yd.a() || !k0.H0.a(null).booleanValue()) ? str : "" : str.substring(0, lastIndexOf);
    }

    private final String O() {
        String str;
        synchronized (this) {
            if (this.f6694e == null) {
                this.f6694e = this.f6276a.N() != null ? this.f6276a.N() : "FA";
            }
            p.j(this.f6694e);
            str = this.f6694e;
        }
        return str;
    }

    protected static Object u(String str) {
        if (str == null) {
            return null;
        }
        return new c5(str);
    }

    private static String v(boolean z9, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z9) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof c5 ? ((c5) obj).f5920a : z9 ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z9 ? th.getClass().getName() : th.toString());
            String D = D(m6.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i10++;
            }
            return sb.toString();
        }
    }

    static String w(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String v9 = v(z9, obj);
        String v10 = v(z9, obj2);
        String v11 = v(z9, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v9)) {
            sb.append(str2);
            sb.append(v9);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(v10)) {
            sb.append(str2);
            sb.append(v10);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(v11)) {
            sb.append(str3);
            sb.append(v11);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10) {
        return Log.isLoggable(O(), i10);
    }

    public final z4 E() {
        return this.f6702m;
    }

    public final z4 F() {
        return this.f6695f;
    }

    public final z4 G() {
        return this.f6697h;
    }

    public final z4 H() {
        return this.f6696g;
    }

    public final z4 I() {
        return this.f6701l;
    }

    public final z4 J() {
        return this.f6703n;
    }

    public final z4 K() {
        return this.f6698i;
    }

    public final z4 L() {
        return this.f6700k;
    }

    public final z4 M() {
        return this.f6699j;
    }

    public final String N() {
        Pair<String, Long> a10;
        if (g().f6233d == null || (a10 = g().f6233d.a()) == null || a10 == k5.f6231z) {
            return null;
        }
        String valueOf = String.valueOf(a10.second);
        return valueOf + ":" + ((String) a10.first);
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
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

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
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

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void x(int i10, String str) {
        Log.println(i10, O(), str);
    }

    /* access modifiers changed from: protected */
    public final void y(int i10, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z9 && B(i10)) {
            x(i10, w(false, str, obj, obj2, obj3));
        }
        if (!z10 && i10 >= 5) {
            p.j(str);
            f6 F = this.f6276a.F();
            if (F == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!F.q()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i10 < 0) {
                    i10 = 0;
                }
                F.C(new a5(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
                return;
            }
            x(6, str2);
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
