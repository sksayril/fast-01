package e2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import d2.a;
import d2.b;
import g2.f;
import g2.p;
import g2.q;
import h2.c0;
import h2.f0;
import l2.k;
import r2.d;
import r2.h;
import r2.i;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {d.class, r2.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class e extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final int f8342d = f.f8350a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f8343e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final e f8344f = new e();

    /* renamed from: c  reason: collision with root package name */
    private String f8345c;

    public static e m() {
        return f8344f;
    }

    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    public final String e(int i10) {
        return super.e(i10);
    }

    public int g(Context context) {
        return super.g(context);
    }

    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, f0.b(activity, b(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.i() ? bVar.g() : c(context, bVar.d(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k10 = k(activity, i10, i11, onCancelListener);
        if (k10 == null) {
            return false;
        }
        s(activity, k10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, (String) null, d(context, i10, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final Dialog p(Context context, int i10, f0 f0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(c0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = c0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, f0Var);
        }
        String g10 = c0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(c0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final q r(Context context, p pVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q qVar = new q(pVar);
        h.o(context, qVar, intentFilter);
        qVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return qVar;
        }
        pVar.a();
        qVar.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                l.Q1(dialog, onCancelListener).P1(((androidx.fragment.app.e) activity).A(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    public final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
        } else if (pendingIntent != null) {
            String f10 = c0.f(context, i10);
            String e10 = c0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) h2.p.j(context.getSystemService("notification"));
            l.e M = new l.e(context).C(true).m(true).u(f10).M(new l.c().w(e10));
            if (l2.h.c(context)) {
                h2.p.m(k.e());
                M.K(context.getApplicationInfo().icon).G(2);
                if (l2.h.d(context)) {
                    M.a(a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    M.s(pendingIntent);
                }
            } else {
                M.K(17301642).O(resources.getString(b.common_google_play_services_notification_ticker)).T(System.currentTimeMillis()).s(pendingIntent).t(e10);
            }
            if (k.h()) {
                h2.p.m(k.h());
                synchronized (f8343e) {
                    str2 = this.f8345c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b10 = c0.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, b10, 4);
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                M.o(str2);
            }
            Notification c10 = M.c();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                i.f8356b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, c10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void u(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean v(Activity activity, f fVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p10 = p(activity, i10, f0.c(fVar, b(activity, i10, "d"), 2), onCancelListener);
        if (p10 == null) {
            return false;
        }
        s(activity, p10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i10) {
        PendingIntent l10;
        if (n2.a.a(context) || (l10 = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.d(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l10, i10, true), i.f12082a | 134217728));
        return true;
    }
}
