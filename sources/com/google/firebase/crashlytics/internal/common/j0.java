package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import c4.m;
import d3.j;
import d4.f0;
import g4.e;
import g4.f;
import h4.b;
import i4.i;
import j4.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import z3.g;

public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final t f7305a;

    /* renamed from: b  reason: collision with root package name */
    private final e f7306b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7307c;

    /* renamed from: d  reason: collision with root package name */
    private final c4.e f7308d;

    /* renamed from: e  reason: collision with root package name */
    private final m f7309e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f7310f;

    j0(t tVar, e eVar, b bVar, c4.e eVar2, m mVar, b0 b0Var) {
        this.f7305a = tVar;
        this.f7306b = eVar;
        this.f7307c = bVar;
        this.f7308d = eVar2;
        this.f7309e = mVar;
        this.f7310f = b0Var;
    }

    private f0.e.d c(f0.e.d dVar, c4.e eVar, m mVar) {
        f0.e.d.b h10 = dVar.h();
        String c10 = eVar.c();
        if (c10 != null) {
            h10.d(f0.e.d.C0121d.a().b(c10).a());
        } else {
            g.f().i("No log data to include with this event.");
        }
        List<f0.c> m10 = m(mVar.e());
        List<f0.c> m11 = m(mVar.f());
        if (!m10.isEmpty() || !m11.isEmpty()) {
            h10.b(dVar.b().i().e(m10).g(m11).a());
        }
        return h10.a();
    }

    private f0.e.d d(f0.e.d dVar) {
        return e(c(dVar, this.f7308d, this.f7309e), this.f7309e);
    }

    private f0.e.d e(f0.e.d dVar, m mVar) {
        List<f0.e.d.C0122e> g10 = mVar.g();
        if (g10.isEmpty()) {
            return dVar;
        }
        f0.e.d.b h10 = dVar.h();
        h10.e(f0.e.d.f.a().b(g10).a());
        return h10.a();
    }

    private static f0.a f(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = g(traceInputStream);
            }
        } catch (IOException e10) {
            g f10 = g.f();
            f10.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return f0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(str).a();
    }

    public static String g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static j0 h(Context context, b0 b0Var, f fVar, a aVar, c4.e eVar, m mVar, d dVar, i iVar, g0 g0Var, m mVar2) {
        i iVar2 = iVar;
        f fVar2 = fVar;
        Context context2 = context;
        return new j0(new t(context, b0Var, aVar, dVar, iVar), new e(fVar, iVar2, mVar2), b.b(context, iVar2, g0Var), eVar, mVar, b0Var);
    }

    private u i(u uVar) {
        if (uVar.b().g() != null) {
            return uVar;
        }
        return u.a(uVar.b().r(this.f7310f.d()), uVar.d(), uVar.c());
    }

    private ApplicationExitInfo l(String str, List<ApplicationExitInfo> list) {
        long q9 = this.f7306b.q(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < q9) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    private static List<f0.c> m(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(f0.c.a().b((String) next.getKey()).c((String) next.getValue()).a());
        }
        Collections.sort(arrayList, i0.f7303m);
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: private */
    public boolean r(j<u> jVar) {
        if (jVar.q()) {
            u n10 = jVar.n();
            g f10 = g.f();
            f10.b("Crashlytics report successfully enqueued to DataTransport: " + n10.d());
            File c10 = n10.c();
            if (c10.delete()) {
                g f11 = g.f();
                f11.b("Deleted report file: " + c10.getPath());
                return true;
            }
            g f12 = g.f();
            f12.k("Crashlytics could not delete report file: " + c10.getPath());
            return true;
        }
        g.f().l("Crashlytics report could not be enqueued to DataTransport", jVar.m());
        return false;
    }

    private void s(Throwable th, Thread thread, String str, String str2, long j10, boolean z9) {
        boolean equals = str2.equals("crash");
        f0.e.d d10 = this.f7305a.d(th, thread, str2, j10, 4, 8, z9);
        String str3 = str;
        this.f7306b.y(d(d10), str, equals);
    }

    public void j(String str, List<e0> list, f0.a aVar) {
        g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (e0 c10 : list) {
            f0.d.b c11 = c10.c();
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        this.f7306b.l(str, f0.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void k(long j10, String str) {
        this.f7306b.k(str, j10);
    }

    public boolean n() {
        return this.f7306b.r();
    }

    public SortedSet<String> p() {
        return this.f7306b.p();
    }

    public void q(String str, long j10) {
        this.f7306b.z(this.f7305a.e(str, j10));
    }

    public void t(Throwable th, Thread thread, String str, long j10) {
        g f10 = g.f();
        f10.i("Persisting fatal event for session " + str);
        s(th, thread, str, "crash", j10, true);
    }

    public void u(Throwable th, Thread thread, String str, long j10) {
        g f10 = g.f();
        f10.i("Persisting non-fatal event for session " + str);
        s(th, thread, str, "error", j10, false);
    }

    public void v(String str, List<ApplicationExitInfo> list, c4.e eVar, m mVar) {
        ApplicationExitInfo l10 = l(str, list);
        if (l10 == null) {
            g f10 = g.f();
            f10.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        f0.e.d c10 = this.f7305a.c(f(l10));
        g f11 = g.f();
        f11.b("Persisting anr for session " + str);
        this.f7306b.y(e(c(c10, eVar, mVar), mVar), str, true);
    }

    public void w() {
        this.f7306b.i();
    }

    public j<Void> x(Executor executor) {
        return y(executor, (String) null);
    }

    public j<Void> y(Executor executor, String str) {
        List<u> w9 = this.f7306b.w();
        ArrayList arrayList = new ArrayList();
        for (u next : w9) {
            if (str == null || str.equals(next.d())) {
                arrayList.add(this.f7307c.c(i(next), str != null).k(executor, new h0(this)));
            }
        }
        return d3.m.f(arrayList);
    }
}
