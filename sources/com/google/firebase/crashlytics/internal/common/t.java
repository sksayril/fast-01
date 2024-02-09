package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import d4.f0;
import i4.i;
import j4.d;
import j4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class t {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Integer> f7413g;

    /* renamed from: h  reason: collision with root package name */
    static final String f7414h = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.6.0"});

    /* renamed from: a  reason: collision with root package name */
    private final Context f7415a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f7416b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7417c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7418d;

    /* renamed from: e  reason: collision with root package name */
    private final i f7419e;

    /* renamed from: f  reason: collision with root package name */
    private final z3.i f7420f = z3.i.f13583a;

    static {
        HashMap hashMap = new HashMap();
        f7413g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public t(Context context, b0 b0Var, a aVar, d dVar, i iVar) {
        this.f7415a = context;
        this.f7416b = b0Var;
        this.f7417c = aVar;
        this.f7418d = dVar;
        this.f7419e = iVar;
    }

    private f0.e.d.a.c A(f0.a aVar) {
        return this.f7420f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private f0.a a(f0.a aVar) {
        List list;
        if (!this.f7419e.b().f9460b.f9469c || this.f7417c.f7266c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f next : this.f7417c.f7266c) {
                arrayList.add(f0.a.C0106a.a().d(next.c()).b(next.a()).c(next.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return f0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private f0.b b() {
        return f0.b().k("18.6.0").g(this.f7417c.f7264a).h(this.f7416b.a().c()).f(this.f7416b.a().d()).d(this.f7417c.f7269f).e(this.f7417c.f7270g).j(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f7413g.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private f0.e.d.a.b.C0110a h() {
        return f0.e.d.a.b.C0110a.a().b(0).d(0).c(this.f7417c.f7268e).e(this.f7417c.f7265b).a();
    }

    private List<f0.e.d.a.b.C0110a> i() {
        return Collections.singletonList(h());
    }

    private f0.e.d.a j(int i10, f0.a aVar) {
        return f0.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private f0.e.d.a k(int i10, e eVar, Thread thread, int i11, int i12, boolean z9) {
        Boolean bool;
        f0.e.d.a.c e10 = this.f7420f.e(this.f7415a);
        if (e10.b() > 0) {
            bool = Boolean.valueOf(e10.b() != 100);
        } else {
            bool = null;
        }
        return f0.e.d.a.a().c(bool).d(e10).b(this.f7420f.d(this.f7415a)).h(i10).f(p(eVar, thread, i11, i12, z9)).a();
    }

    private f0.e.d.c l(int i10) {
        e a10 = e.a(this.f7415a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean n10 = i.n(this.f7415a);
        return f0.e.d.c.a().b(valueOf).c(c10).f(n10).e(i10).g(f(i.b(this.f7415a) - i.a(this.f7415a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private f0.e.d.a.b.c m(e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private f0.e.d.a.b.c n(e eVar, int i10, int i11, int i12) {
        String str = eVar.f10804b;
        String str2 = eVar.f10803a;
        StackTraceElement[] stackTraceElementArr = eVar.f10805c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.f10806d;
        if (i12 >= i11) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f10806d;
                i13++;
            }
        }
        f0.e.d.a.b.c.C0113a d10 = f0.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(n(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private f0.e.d.a.b o(f0.a aVar) {
        return f0.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private f0.e.d.a.b p(e eVar, Thread thread, int i10, int i11, boolean z9) {
        return f0.e.d.a.b.a().f(z(eVar, thread, i10, z9)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private f0.e.d.a.b.C0116e.C0118b q(StackTraceElement stackTraceElement, f0.e.d.a.b.C0116e.C0118b.C0119a aVar) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = (long) stackTraceElement.getLineNumber();
        }
        return aVar.e(max).f(str).b(fileName).d(j10).a();
    }

    private List<f0.e.d.a.b.C0116e.C0118b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement q9 : stackTraceElementArr) {
            arrayList.add(q(q9, f0.e.d.a.b.C0116e.C0118b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private f0.e.a s() {
        return f0.e.a.a().e(this.f7416b.f()).g(this.f7417c.f7269f).d(this.f7417c.f7270g).f(this.f7416b.a().c()).b(this.f7417c.f7271h.d()).c(this.f7417c.f7271h.e()).a();
    }

    private f0.e t(String str, long j10) {
        return f0.e.a().m(j10).j(str).h(f7414h).b(s()).l(v()).e(u()).i(3).a();
    }

    private f0.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g10 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = i.b(this.f7415a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean w9 = i.w();
        int l10 = i.l();
        String str = Build.MANUFACTURER;
        return f0.e.c.a().b(g10).f(Build.MODEL).c(availableProcessors).h(b10).d(blockCount).i(w9).j(l10).e(str).g(Build.PRODUCT).a();
    }

    private f0.e.C0123e v() {
        return f0.e.C0123e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.x()).a();
    }

    private f0.e.d.a.b.C0114d w() {
        return f0.e.d.a.b.C0114d.a().d("0").c("0").b(0).a();
    }

    private f0.e.d.a.b.C0116e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private f0.e.d.a.b.C0116e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return f0.e.d.a.b.C0116e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<f0.e.d.a.b.C0116e> z(e eVar, Thread thread, int i10, boolean z9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f10805c, i10));
        if (z9) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(x(thread2, this.f7418d.a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public f0.e.d c(f0.a aVar) {
        int i10 = this.f7415a.getResources().getConfiguration().orientation;
        return f0.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public f0.e.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z9) {
        int i12 = this.f7415a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j11 = j10;
        return f0.e.d.a().g(str).f(j10).b(k(i12, e.a(th, this.f7418d), thread, i10, i11, z9)).c(l(i12)).a();
    }

    public f0 e(String str, long j10) {
        return b().l(t(str, j10)).a();
    }
}
