package d1;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.l;
import androidx.core.app.o;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7666a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f7667b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7668c;

    /* renamed from: d  reason: collision with root package name */
    private l.e f7669d;

    public b(Context context, String str, Integer num, d dVar) {
        this.f7666a = context;
        this.f7667b = num;
        this.f7668c = str;
        this.f7669d = new l.e(context, str).G(1);
        e(dVar, false);
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    private PendingIntent b() {
        Intent launchIntentForPackage = this.f7666a.getPackageManager().getLaunchIntentForPackage(this.f7666a.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        int i10 = 134217728;
        if (Build.VERSION.SDK_INT > 23) {
            i10 = 201326592;
        }
        return PendingIntent.getActivity(this.f7666a, 0, launchIntentForPackage, i10);
    }

    private int c(String str, String str2) {
        return this.f7666a.getResources().getIdentifier(str, str2, this.f7666a.getPackageName());
    }

    private void e(d dVar, boolean z9) {
        int c10 = c(dVar.a().b(), dVar.a().a());
        if (c10 == 0) {
            c("ic_launcher.png", "mipmap");
        }
        this.f7669d = this.f7669d.u(dVar.c()).K(c10).t(dVar.b()).s(b()).E(dVar.f());
        if (z9) {
            o.f(this.f7666a).i(this.f7667b.intValue(), this.f7669d.c());
        }
    }

    public Notification a() {
        return this.f7669d.c();
    }

    public void d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            o f10 = o.f(this.f7666a);
            NotificationChannel notificationChannel = new NotificationChannel(this.f7668c, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            f10.e(notificationChannel);
        }
    }

    public void f(d dVar, boolean z9) {
        e(dVar, z9);
    }
}
