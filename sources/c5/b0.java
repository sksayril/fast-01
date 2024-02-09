package c5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import d5.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import m4.a;
import o4.d;
import t3.f;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f3647a = new b0();

    /* renamed from: b  reason: collision with root package name */
    private static final a f3648b;

    static {
        a i10 = new d().j(c.f3649a).k(true).i();
        l.d(i10, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f3648b = i10;
    }

    private b0() {
    }

    private final d d(b bVar) {
        return bVar == null ? d.COLLECTION_SDK_NOT_INSTALLED : bVar.c() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }

    public final a0 a(f fVar, z zVar, e5.f fVar2, u uVar, List<u> list, Map<b.a, ? extends b> map, String str) {
        Map<b.a, ? extends b> map2 = map;
        l.e(fVar, "firebaseApp");
        l.e(zVar, "sessionDetails");
        l.e(fVar2, "sessionsSettings");
        l.e(uVar, "currentProcessDetails");
        l.e(list, "appProcessDetails");
        l.e(map2, "subscribers");
        String str2 = str;
        l.e(str2, "firebaseInstallationId");
        return new a0(j.SESSION_START, new f0(zVar.b(), zVar.a(), zVar.c(), zVar.d(), new f(d((b) map2.get(b.a.PERFORMANCE)), d((b) map2.get(b.a.CRASHLYTICS)), fVar2.b()), str2), b(fVar));
    }

    public final b b(f fVar) {
        l.e(fVar, "firebaseApp");
        Context m10 = fVar.m();
        l.d(m10, "firebaseApp.applicationContext");
        String packageName = m10.getPackageName();
        PackageInfo packageInfo = m10.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String c10 = fVar.r().c();
        l.d(c10, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        l.d(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        l.d(str2, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        l.d(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        l.d(str5, "MANUFACTURER");
        v vVar = v.f3769a;
        Context m11 = fVar.m();
        l.d(m11, "firebaseApp.applicationContext");
        u d10 = vVar.d(m11);
        Context m12 = fVar.m();
        l.d(m12, "firebaseApp.applicationContext");
        return new b(c10, str, "1.2.0", str2, tVar, new a(packageName, str4, valueOf, str5, d10, vVar.c(m12)));
    }

    public final a c() {
        return f3648b;
    }
}
