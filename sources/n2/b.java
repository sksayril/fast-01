package n2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import l2.k;

public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f11292a;

    public b(Context context) {
        this.f11292a = context;
    }

    public int a(String str) {
        return this.f11292a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i10) {
        return this.f11292a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence c(String str) {
        return this.f11292a.getPackageManager().getApplicationLabel(this.f11292a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i10) {
        return this.f11292a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f11292a);
        }
        if (!k.h() || (nameForUid = this.f11292a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f11292a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean f(int i10, String str) {
        if (k.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f11292a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f11292a.getPackageManager().getPackagesForUid(i10);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
