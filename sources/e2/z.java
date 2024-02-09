package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import h2.p;
import h2.s0;
import h2.t0;
import java.security.MessageDigest;
import l2.a;
import l2.i;
import o2.d;

final class z {

    /* renamed from: a  reason: collision with root package name */
    static final x f8378a = new r(v.Y("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final x f8379b = new s(v.Y("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final x f8380c = new t(v.Y("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final x f8381d = new u(v.Y("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static volatile t0 f8382e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f8383f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Context f8384g;

    static j0 a(String str, v vVar, boolean z9, boolean z10) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, vVar, z9, z10);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static j0 b(String str, boolean z9, boolean z10, boolean z11) {
        return g(str, z9, false, false, true);
    }

    static /* synthetic */ String c(boolean z9, String str, v vVar) {
        String str2 = true != (!z9 && f(str, vVar, true, false).f8364a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = a.b("SHA-256");
        p.j(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, i.a(b10.digest(vVar.e3())), Boolean.valueOf(z9), "12451000.false"});
    }

    static synchronized void d(Context context) {
        synchronized (z.class) {
            if (f8384g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f8384g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            boolean e10 = f8382e.e();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return e10;
        } catch (RemoteException | DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static j0 f(String str, v vVar, boolean z9, boolean z10) {
        try {
            h();
            p.j(f8384g);
            try {
                return f8382e.X1(new e0(str, vVar, z9, z10), d.e3(f8384g.getPackageManager())) ? j0.b() : new h0(new q(z9, str, vVar), (g0) null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return j0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [o2.b, android.os.IBinder] */
    private static j0 g(String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        j0 j0Var;
        String concat;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            p.j(f8384g);
            try {
                h();
                a0 a0Var = new a0(str, z9, false, d.e3(f8384g), false);
                c0 F1 = z12 ? f8382e.F1(a0Var) : f8382e.n2(a0Var);
                if (F1.f()) {
                    j0Var = j0.f(F1.g());
                } else {
                    String d10 = F1.d();
                    PackageManager.NameNotFoundException nameNotFoundException = F1.i() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (d10 == null) {
                        d10 = "error checking package certificate";
                    }
                    j0Var = j0.g(F1.g(), F1.i(), d10, nameNotFoundException);
                }
            } catch (DynamiteModule.a e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
                j0Var = j0.d(concat, e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return j0Var;
            }
        } catch (RemoteException e11) {
            e = e11;
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            concat = "module call";
            j0Var = j0.d(concat, e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return j0Var;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return j0Var;
    }

    private static void h() {
        if (f8382e == null) {
            p.j(f8384g);
            synchronized (f8383f) {
                if (f8382e == null) {
                    f8382e = s0.J(DynamiteModule.e(f8384g, DynamiteModule.f5058f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
