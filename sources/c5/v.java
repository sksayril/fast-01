package c5;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f3769a = new v();

    private v() {
    }

    private final u a(String str, int i10, int i11, boolean z9) {
        return new u(str, i10, i11, z9);
    }

    static /* synthetic */ u b(v vVar, String str, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z9 = false;
        }
        return vVar.a(str, i10, i11, z9);
    }

    public final List<u> c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            l.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        T t9;
        boolean z9;
        l.e(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                t9 = null;
                break;
            }
            t9 = it.next();
            if (((u) t9).b() == myPid) {
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
        u uVar = (u) t9;
        if (uVar != null) {
            return uVar;
        }
        return b(this, e(), myPid, 0, false, 12, (Object) null);
    }

    public final String e() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            l.d(myProcessName, "myProcessName()");
            return myProcessName;
        } else if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        } else {
            String a10 = l2.l.a();
            return a10 != null ? a10 : "";
        }
    }
}
