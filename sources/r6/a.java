package r6;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.l;
import androidx.core.app.o;
import kotlin.jvm.internal.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12107a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12108b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12109c;

    /* renamed from: d  reason: collision with root package name */
    private f f12110d = new f((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, false, 127, (g) null);

    /* renamed from: e  reason: collision with root package name */
    private l.e f12111e;

    public a(Context context, String str, int i10) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(str, "channelId");
        this.f12107a = context;
        this.f12108b = str;
        this.f12109c = i10;
        l.e G = new l.e(context, str).G(1);
        kotlin.jvm.internal.l.d(G, "setPriority(...)");
        this.f12111e = G;
        e(this.f12110d, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r0.setPackage((java.lang.String) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.app.PendingIntent b() {
        /*
            r4 = this;
            android.content.Context r0 = r4.f12107a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r1 = r4.f12107a
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.content.Intent r0 = r0.setPackage(r1)
            if (r0 == 0) goto L_0x0020
            r2 = 270532608(0x10200000, float:3.1554436E-29)
            android.content.Intent r0 = r0.setFlags(r2)
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            if (r0 == 0) goto L_0x002c
            android.content.Context r1 = r4.f12107a
            r2 = 0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r1, r2, r0, r3)
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a.b():android.app.PendingIntent");
    }

    private final int c(String str) {
        return this.f12107a.getResources().getIdentifier(str, "drawable", this.f12107a.getPackageName());
    }

    private final void d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            o f10 = o.f(this.f12107a);
            kotlin.jvm.internal.l.d(f10, "from(...)");
            NotificationChannel notificationChannel = new NotificationChannel(this.f12108b, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            f10.e(notificationChannel);
        }
    }

    private final void e(f fVar, boolean z9) {
        boolean z10;
        l.e eVar;
        l.e eVar2;
        PendingIntent pendingIntent;
        int c10 = c(fVar.d());
        if (c10 == 0) {
            c10 = c("navigation_empty_icon");
        }
        l.e N = this.f12111e.u(fVar.g()).K(c10).t(fVar.f()).N(fVar.c());
        kotlin.jvm.internal.l.d(N, "setSubText(...)");
        this.f12111e = N;
        if (fVar.b() != null) {
            eVar = this.f12111e.q(fVar.b().intValue());
            z10 = true;
        } else {
            z10 = false;
            eVar = this.f12111e.q(0);
        }
        l.e r9 = eVar.r(z10);
        kotlin.jvm.internal.l.b(r9);
        this.f12111e = r9;
        if (fVar.e()) {
            eVar2 = this.f12111e;
            pendingIntent = b();
        } else {
            eVar2 = this.f12111e;
            pendingIntent = null;
        }
        l.e s9 = eVar2.s(pendingIntent);
        kotlin.jvm.internal.l.b(s9);
        this.f12111e = s9;
        if (z9) {
            o f10 = o.f(this.f12107a);
            kotlin.jvm.internal.l.d(f10, "from(...)");
            f10.i(this.f12109c, this.f12111e.c());
        }
    }

    public final Notification a() {
        d(this.f12110d.a());
        Notification c10 = this.f12111e.c();
        kotlin.jvm.internal.l.d(c10, "build(...)");
        return c10;
    }

    public final void f(f fVar, boolean z9) {
        kotlin.jvm.internal.l.e(fVar, "options");
        if (!kotlin.jvm.internal.l.a(fVar.a(), this.f12110d.a())) {
            d(fVar.a());
        }
        e(fVar, z9);
        this.f12110d = fVar;
    }
}
