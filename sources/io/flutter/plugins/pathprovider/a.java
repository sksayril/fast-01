package io.flutter.plugins.pathprovider;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: io.flutter.plugins.pathprovider.a$a  reason: collision with other inner class name */
    public static class C0159a extends RuntimeException {

        /* renamed from: m  reason: collision with root package name */
        public final String f10613m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f10614n;
    }

    public interface b {
        String a();

        String b();

        String c();

        List<String> d();

        String e();

        List<String> f(c cVar);

        String g();
    }

    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);
        
        final int index;

        private c(int i10) {
            this.index = i10;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0159a) {
            C0159a aVar = (C0159a) th;
            arrayList.add(aVar.f10613m);
            arrayList.add(aVar.getMessage());
            obj = aVar.f10614n;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
