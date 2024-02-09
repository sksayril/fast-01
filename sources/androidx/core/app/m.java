package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class m implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1321a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f1322b;

    /* renamed from: c  reason: collision with root package name */
    private final l.e f1323c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1324d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f1325e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f1326f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1327g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f1328h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f1329i;

    static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z9) {
            return builder.setUsesChronometer(z9);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z9) {
            return builder.setShowWhen(z9);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z9) {
            return builder.setGroupSummary(z9);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z9) {
            return builder.setLocalOnly(z9);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAllowGeneratedReplies(z9);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z9) {
            return builder.setColorized(z9);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z9) {
            return builder.setAllowSystemGeneratedContextualActions(z9);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z9) {
            return builder.setContextual(z9);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAuthenticationRequired(z9);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    m(l.e eVar) {
        int i10;
        Object obj;
        this.f1323c = eVar;
        Context context = eVar.f1269a;
        this.f1321a = context;
        this.f1322b = Build.VERSION.SDK_INT >= 26 ? h.a(context, eVar.L) : new Notification.Builder(eVar.f1269a);
        Notification notification = eVar.S;
        this.f1322b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1277i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1273e).setContentText(eVar.f1274f).setContentInfo(eVar.f1279k).setContentIntent(eVar.f1275g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1276h, (notification.flags & 128) != 0).setLargeIcon(eVar.f1278j).setNumber(eVar.f1280l).setProgress(eVar.f1289u, eVar.f1290v, eVar.f1291w);
        a.b(a.d(a.c(this.f1322b, eVar.f1286r), eVar.f1283o), eVar.f1281m);
        Iterator<l.a> it = eVar.f1270b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = eVar.E;
        if (bundle != null) {
            this.f1327g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f1324d = eVar.I;
        this.f1325e = eVar.J;
        b.a(this.f1322b, eVar.f1282n);
        d.i(this.f1322b, eVar.A);
        d.g(this.f1322b, eVar.f1292x);
        d.j(this.f1322b, eVar.f1294z);
        d.h(this.f1322b, eVar.f1293y);
        this.f1328h = eVar.P;
        e.b(this.f1322b, eVar.D);
        e.c(this.f1322b, eVar.F);
        e.f(this.f1322b, eVar.G);
        e.d(this.f1322b, eVar.H);
        e.e(this.f1322b, notification.sound, notification.audioAttributes);
        List<String> e10 = i11 < 28 ? e(g(eVar.f1271c), eVar.V) : eVar.V;
        if (e10 != null && !e10.isEmpty()) {
            for (String a10 : e10) {
                e.a(this.f1322b, a10);
            }
        }
        this.f1329i = eVar.K;
        if (eVar.f1272d.size() > 0) {
            Bundle bundle2 = eVar.g().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f1272d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), n.a(eVar.f1272d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.g().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1327g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23 && (obj = eVar.U) != null) {
            f.b(this.f1322b, obj);
        }
        if (i13 >= 24) {
            c.a(this.f1322b, eVar.E);
            g.e(this.f1322b, eVar.f1288t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                g.c(this.f1322b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                g.b(this.f1322b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                g.d(this.f1322b, remoteViews3);
            }
        }
        if (i13 >= 26) {
            h.b(this.f1322b, eVar.M);
            h.e(this.f1322b, eVar.f1287s);
            h.f(this.f1322b, eVar.N);
            h.g(this.f1322b, eVar.O);
            h.d(this.f1322b, eVar.P);
            if (eVar.C) {
                h.c(this.f1322b, eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.f1322b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i13 >= 28) {
            Iterator<p> it2 = eVar.f1271c.iterator();
            while (it2.hasNext()) {
                i.a(this.f1322b, it2.next().j());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.a(this.f1322b, eVar.R);
            j.b(this.f1322b, l.d.a((l.d) null));
        }
        if (i14 >= 31 && (i10 = eVar.Q) != 0) {
            k.b(this.f1322b, i10);
        }
        if (eVar.T) {
            if (this.f1323c.f1293y) {
                this.f1328h = 2;
            } else {
                this.f1328h = 1;
            }
            this.f1322b.setVibrate((long[]) null);
            this.f1322b.setSound((Uri) null);
            int i15 = notification.defaults & -2 & -3;
            notification.defaults = i15;
            this.f1322b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f1323c.f1292x)) {
                    d.g(this.f1322b, "silent");
                }
                h.d(this.f1322b, this.f1328h);
            }
        }
    }

    private void b(l.a aVar) {
        Notification.Action.Builder builder;
        int i10 = Build.VERSION.SDK_INT;
        IconCompat d10 = aVar.d();
        if (i10 >= 23) {
            builder = f.a(d10 != null ? d10.y() : null, aVar.h(), aVar.a());
        } else {
            builder = d.e(d10 != null ? d10.n() : 0, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput c10 : r.b(aVar.e())) {
                d.c(builder, c10);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            g.a(builder, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i11 >= 28) {
            i.b(builder, aVar.f());
        }
        if (i11 >= 29) {
            j.c(builder, aVar.j());
        }
        if (i11 >= 31) {
            k.a(builder, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(builder, bundle);
        d.a(this.f1322b, d.d(builder));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p.b bVar = new p.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p i10 : list) {
            arrayList.add(i10.i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }

    public Notification.Builder a() {
        return this.f1322b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews t9;
        RemoteViews r9;
        l.j jVar = this.f1323c.f1285q;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews s9 = jVar != null ? jVar.s(this) : null;
        Notification d10 = d();
        if (!(s9 == null && (s9 = this.f1323c.I) == null)) {
            d10.contentView = s9;
        }
        if (!(jVar == null || (r9 = jVar.r(this)) == null)) {
            d10.bigContentView = r9;
        }
        if (!(jVar == null || (t9 = this.f1323c.f1285q.t(this)) == null)) {
            d10.headsUpContentView = t9;
        }
        if (!(jVar == null || (a10 = l.a(d10)) == null)) {
            jVar.a(a10);
        }
        return d10;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f1322b);
        }
        if (i10 >= 24) {
            Notification a10 = a.a(this.f1322b);
            if (this.f1328h != 0) {
                if (!(d.f(a10) == null || (a10.flags & 512) == 0 || this.f1328h != 2)) {
                    h(a10);
                }
                if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f1328h == 1) {
                    h(a10);
                }
            }
            return a10;
        }
        c.a(this.f1322b, this.f1327g);
        Notification a11 = a.a(this.f1322b);
        RemoteViews remoteViews = this.f1324d;
        if (remoteViews != null) {
            a11.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1325e;
        if (remoteViews2 != null) {
            a11.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1329i;
        if (remoteViews3 != null) {
            a11.headsUpContentView = remoteViews3;
        }
        if (this.f1328h != 0) {
            if (!(d.f(a11) == null || (a11.flags & 512) == 0 || this.f1328h != 2)) {
                h(a11);
            }
            if (d.f(a11) != null && (a11.flags & 512) == 0 && this.f1328h == 1) {
                h(a11);
            }
        }
        return a11;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f1321a;
    }
}
