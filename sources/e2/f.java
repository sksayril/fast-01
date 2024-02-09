package e2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import h2.n1;
import l2.h;
import n2.c;
import s2.d;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8350a = i.f8355a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f8351b = new f();

    f() {
    }

    public static f f() {
        return f8351b;
    }

    public int a(Context context) {
        return i.a(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context != null && h.d(context)) {
                return n1.a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f8350a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(c.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return n1.b("com.google.android.gms", sb.toString());
        } else if (i10 != 3) {
            return null;
        } else {
            return n1.c("com.google.android.gms");
        }
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, (String) null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent b10 = b(context, i10, str);
        if (b10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, b10, d.f12170a | 134217728);
    }

    public String e(int i10) {
        return i.b(i10);
    }

    public int g(Context context) {
        return h(context, f8350a);
    }

    public int h(Context context, int i10) {
        int f10 = i.f(context, i10);
        if (i.g(context, f10)) {
            return 18;
        }
        return f10;
    }

    public boolean i(Context context, String str) {
        return i.k(context, str);
    }

    public boolean j(int i10) {
        return i.i(i10);
    }
}
