package z3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import d4.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f13583a = new i();

    private i() {
    }

    public static /* synthetic */ f0.e.d.a.c c(i iVar, String str, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z9 = false;
        }
        return iVar.b(str, i10, i11, z9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = android.app.Application.getProcessName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String f() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = ""
            r2 = 33
            if (r0 < r2) goto L_0x0012
            java.lang.String r1 = android.os.Process.myProcessName()
            java.lang.String r0 = "{\n      Process.myProcessName()\n    }"
            kotlin.jvm.internal.l.d(r1, r0)
            goto L_0x001e
        L_0x0012:
            r2 = 28
            if (r0 < r2) goto L_0x001e
            java.lang.String r0 = android.app.Application.getProcessName()
            if (r0 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.i.f():java.lang.String");
    }

    public final f0.e.d.a.c a(String str, int i10, int i11) {
        l.e(str, "processName");
        return c(this, str, i10, i11, false, 8, (Object) null);
    }

    public final f0.e.d.a.c b(String str, int i10, int i11, boolean z9) {
        l.e(str, "processName");
        f0.e.d.a.c a10 = f0.e.d.a.c.a().e(str).d(i10).c(i11).b(z9).a();
        l.d(a10, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a10;
    }

    public final List<f0.e.d.a.c> d(Context context) {
        l.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = n.c();
        }
        List l10 = v.l(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
        for (Object next : l10) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.i(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(f0.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(l.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final f0.e.d.a.c e(Context context) {
        T t9;
        boolean z9;
        l.e(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                t9 = null;
                break;
            }
            t9 = it.next();
            if (((f0.e.d.a.c) t9).c() == myPid) {
                z9 = true;
                continue;
            } else {
                z9 = false;
                continue;
            }
            if (z9) {
                break;
            }
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) t9;
        if (cVar != null) {
            return cVar;
        }
        return c(this, f(), myPid, 0, false, 12, (Object) null);
    }
}
