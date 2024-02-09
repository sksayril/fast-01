package e2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import h2.p;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class j {

    /* renamed from: c  reason: collision with root package name */
    private static j f8360c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f8361a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f8362b;

    public j(Context context) {
        this.f8361a = context.getApplicationContext();
    }

    public static j a(Context context) {
        p.j(context);
        synchronized (j.class) {
            if (f8360c == null) {
                z.d(context);
                f8360c = new j(context);
            }
        }
        return f8360c;
    }

    static final v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            if (vVarArr[i10].equals(wVar)) {
                return vVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z9) {
        if (z9 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z9 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z9 ? d(packageInfo, y.f8377a) : d(packageInfo, y.f8377a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final j0 f(String str, boolean z9, boolean z10) {
        j0 j0Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return j0.c(str2);
        }
        if (str.equals(this.f8362b)) {
            return j0.b();
        }
        if (z.e()) {
            j0Var = z.b(str, i.e(this.f8361a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f8361a.getPackageManager().getPackageInfo(str, 64);
                boolean e10 = i.e(this.f8361a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        w wVar = new w(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        j0 a10 = z.a(str3, wVar, e10, false);
                        if (!a10.f8364a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !z.a(str3, wVar, false, true).f8364a) {
                            j0Var = a10;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                j0Var = j0.c(str2);
            } catch (PackageManager.NameNotFoundException e11) {
                return j0.d("no pkg ".concat(str), e11);
            }
        }
        if (j0Var.f8364a) {
            this.f8362b = str;
        }
        return j0Var;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (i.e(this.f8361a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        j0 j0Var;
        int length;
        String[] packagesForUid = this.f8361a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            j0Var = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    p.j(j0Var);
                    break;
                }
                j0Var = f(packagesForUid[i11], false, false);
                if (j0Var.f8364a) {
                    break;
                }
                i11++;
            }
        } else {
            j0Var = j0.c("no pkgs");
        }
        j0Var.e();
        return j0Var.f8364a;
    }
}
