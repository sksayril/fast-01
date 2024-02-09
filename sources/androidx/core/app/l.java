package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class l {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1241a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1242b;

        /* renamed from: c  reason: collision with root package name */
        private final r[] f1243c;

        /* renamed from: d  reason: collision with root package name */
        private final r[] f1244d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1245e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1246f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1247g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1248h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f1249i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1250j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1251k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1252l;

        /* renamed from: androidx.core.app.l$a$a  reason: collision with other inner class name */
        public static final class C0017a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f1253a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f1254b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f1255c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f1256d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f1257e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<r> f1258f;

            /* renamed from: g  reason: collision with root package name */
            private int f1259g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f1260h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f1261i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f1262j;

            public C0017a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, true, 0, true, false, false);
            }

            private C0017a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
                this.f1256d = true;
                this.f1260h = true;
                this.f1253a = iconCompat;
                this.f1254b = e.k(charSequence);
                this.f1255c = pendingIntent;
                this.f1257e = bundle;
                this.f1258f = rVarArr == null ? null : new ArrayList<>(Arrays.asList(rVarArr));
                this.f1256d = z9;
                this.f1259g = i10;
                this.f1260h = z10;
                this.f1261i = z11;
                this.f1262j = z12;
            }

            private void c() {
                if (this.f1261i) {
                    Objects.requireNonNull(this.f1255c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0017a a(r rVar) {
                if (this.f1258f == null) {
                    this.f1258f = new ArrayList<>();
                }
                if (rVar != null) {
                    this.f1258f.add(rVar);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.l.a b() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.c()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.r> r3 = r0.f1258f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.r r4 = (androidx.core.app.r) r4
                    boolean r5 = r4.k()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.r[] r3 = new androidx.core.app.r[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.r[] r1 = (androidx.core.app.r[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    androidx.core.app.r[] r1 = new androidx.core.app.r[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.r[] r4 = (androidx.core.app.r[]) r4
                L_0x005b:
                    r10 = r4
                    androidx.core.app.l$a r1 = new androidx.core.app.l$a
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f1253a
                    java.lang.CharSequence r7 = r0.f1254b
                    android.app.PendingIntent r8 = r0.f1255c
                    android.os.Bundle r9 = r0.f1257e
                    boolean r12 = r0.f1256d
                    int r13 = r0.f1259g
                    boolean r14 = r0.f1260h
                    boolean r15 = r0.f1261i
                    boolean r2 = r0.f1262j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.a.C0017a.b():androidx.core.app.l$a");
            }

            public C0017a d(boolean z9) {
                this.f1256d = z9;
                return this;
            }

            public C0017a e(boolean z9) {
                this.f1261i = z9;
                return this;
            }

            public C0017a f(boolean z9) {
                this.f1260h = z9;
                return this;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.l((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, (r[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
            this.f1246f = true;
            this.f1242b = iconCompat;
            if (iconCompat != null && iconCompat.q() == 2) {
                this.f1249i = iconCompat.n();
            }
            this.f1250j = e.k(charSequence);
            this.f1251k = pendingIntent;
            this.f1241a = bundle == null ? new Bundle() : bundle;
            this.f1243c = rVarArr;
            this.f1244d = rVarArr2;
            this.f1245e = z9;
            this.f1247g = i10;
            this.f1246f = z10;
            this.f1248h = z11;
            this.f1252l = z12;
        }

        public PendingIntent a() {
            return this.f1251k;
        }

        public boolean b() {
            return this.f1245e;
        }

        public Bundle c() {
            return this.f1241a;
        }

        public IconCompat d() {
            int i10;
            if (this.f1242b == null && (i10 = this.f1249i) != 0) {
                this.f1242b = IconCompat.l((Resources) null, "", i10);
            }
            return this.f1242b;
        }

        public r[] e() {
            return this.f1243c;
        }

        public int f() {
            return this.f1247g;
        }

        public boolean g() {
            return this.f1246f;
        }

        public CharSequence h() {
            return this.f1250j;
        }

        public boolean i() {
            return this.f1252l;
        }

        public boolean j() {
            return this.f1248h;
        }
    }

    public static class b extends j {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f1263e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f1264f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1265g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f1266h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1267i;

        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b  reason: collision with other inner class name */
        private static class C0018b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z9) {
                bigPictureStyle.showBigPictureWhenCollapsed(z9);
            }
        }

        private static IconCompat w(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.g((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat z(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? w(parcelable) : w(bundle.getParcelable("android.pictureIcon"));
        }

        public b A(CharSequence charSequence) {
            this.f1318b = e.k(charSequence);
            return this;
        }

        public b B(CharSequence charSequence) {
            this.f1319c = e.k(charSequence);
            this.f1320d = true;
            return this;
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c10 = a.c(a.b(kVar.a()), this.f1318b);
            IconCompat iconCompat = this.f1263e;
            Context context = null;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(c10, this.f1263e.z(kVar instanceof m ? ((m) kVar).f() : null));
                } else if (iconCompat.q() == 1) {
                    c10 = a.a(c10, this.f1263e.m());
                }
            }
            if (this.f1265g) {
                IconCompat iconCompat2 = this.f1264f;
                if (iconCompat2 != null) {
                    if (i10 >= 23) {
                        if (kVar instanceof m) {
                            context = ((m) kVar).f();
                        }
                        C0018b.a(c10, this.f1264f.z(context));
                    } else if (iconCompat2.q() == 1) {
                        a.d(c10, this.f1264f.m());
                    }
                }
                a.d(c10, (Bitmap) null);
            }
            if (this.f1320d) {
                a.e(c10, this.f1319c);
            }
            if (i10 >= 31) {
                c.c(c10, this.f1267i);
                c.b(c10, this.f1266h);
            }
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* access modifiers changed from: protected */
        public void u(Bundle bundle) {
            super.u(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f1264f = w(bundle.getParcelable("android.largeIcon.big"));
                this.f1265g = true;
            }
            this.f1263e = z(bundle);
            this.f1267i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public b x(Bitmap bitmap) {
            this.f1264f = bitmap == null ? null : IconCompat.g(bitmap);
            this.f1265g = true;
            return this;
        }

        public b y(Bitmap bitmap) {
            this.f1263e = bitmap == null ? null : IconCompat.g(bitmap);
            return this;
        }
    }

    public static class c extends j {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1268e;

        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(k kVar) {
            Notification.BigTextStyle a10 = a.a(a.c(a.b(kVar.a()), this.f1318b), this.f1268e);
            if (this.f1320d) {
                a.d(a10, this.f1319c);
            }
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* access modifiers changed from: protected */
        public void u(Bundle bundle) {
            super.u(bundle);
            this.f1268e = bundle.getCharSequence("android.bigText");
        }

        public c w(CharSequence charSequence) {
            this.f1268e = e.k(charSequence);
            return this;
        }

        public c x(CharSequence charSequence) {
            this.f1318b = e.k(charSequence);
            return this;
        }

        public c y(CharSequence charSequence) {
            this.f1319c = e.k(charSequence);
            this.f1320d = true;
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        Notification S;
        boolean T;
        Object U;
        @Deprecated
        public ArrayList<String> V;

        /* renamed from: a  reason: collision with root package name */
        public Context f1269a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1270b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<p> f1271c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1272d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1273e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1274f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1275g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1276h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f1277i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f1278j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f1279k;

        /* renamed from: l  reason: collision with root package name */
        int f1280l;

        /* renamed from: m  reason: collision with root package name */
        int f1281m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1282n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1283o;

        /* renamed from: p  reason: collision with root package name */
        boolean f1284p;

        /* renamed from: q  reason: collision with root package name */
        j f1285q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f1286r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f1287s;

        /* renamed from: t  reason: collision with root package name */
        CharSequence[] f1288t;

        /* renamed from: u  reason: collision with root package name */
        int f1289u;

        /* renamed from: v  reason: collision with root package name */
        int f1290v;

        /* renamed from: w  reason: collision with root package name */
        boolean f1291w;

        /* renamed from: x  reason: collision with root package name */
        String f1292x;

        /* renamed from: y  reason: collision with root package name */
        boolean f1293y;

        /* renamed from: z  reason: collision with root package name */
        String f1294z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }

        public e(Context context, String str) {
            this.f1270b = new ArrayList<>();
            this.f1271c = new ArrayList<>();
            this.f1272d = new ArrayList<>();
            this.f1282n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f1269a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f1281m = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence k(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap l(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1269a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(r.c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(r.c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void v(int i10, boolean z9) {
            Notification notification;
            int i11;
            if (z9) {
                notification = this.S;
                i11 = i10 | notification.flags;
            } else {
                notification = this.S;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public e A(Bitmap bitmap) {
            this.f1278j = l(bitmap);
            return this;
        }

        public e B(int i10, int i11, int i12) {
            Notification notification = this.S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e C(boolean z9) {
            this.A = z9;
            return this;
        }

        public e D(int i10) {
            this.f1280l = i10;
            return this;
        }

        public e E(boolean z9) {
            v(2, z9);
            return this;
        }

        public e F(boolean z9) {
            v(8, z9);
            return this;
        }

        public e G(int i10) {
            this.f1281m = i10;
            return this;
        }

        public e H(int i10, int i11, boolean z9) {
            this.f1289u = i10;
            this.f1290v = i11;
            this.f1291w = z9;
            return this;
        }

        public e I(String str) {
            this.N = str;
            return this;
        }

        public e J(boolean z9) {
            this.f1282n = z9;
            return this;
        }

        public e K(int i10) {
            this.S.icon = i10;
            return this;
        }

        public e L(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
            this.S.audioAttributes = a.a(e10);
            return this;
        }

        public e M(j jVar) {
            if (this.f1285q != jVar) {
                this.f1285q = jVar;
                if (jVar != null) {
                    jVar.v(this);
                }
            }
            return this;
        }

        public e N(CharSequence charSequence) {
            this.f1286r = k(charSequence);
            return this;
        }

        public e O(CharSequence charSequence) {
            this.S.tickerText = k(charSequence);
            return this;
        }

        public e P(long j10) {
            this.O = j10;
            return this;
        }

        public e Q(boolean z9) {
            this.f1283o = z9;
            return this;
        }

        public e R(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e S(int i10) {
            this.G = i10;
            return this;
        }

        public e T(long j10) {
            this.S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1270b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f1270b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new m(this).c();
        }

        public RemoteViews d() {
            return this.J;
        }

        public int e() {
            return this.F;
        }

        public RemoteViews f() {
            return this.I;
        }

        public Bundle g() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews h() {
            return this.K;
        }

        public int i() {
            return this.f1281m;
        }

        public long j() {
            if (this.f1282n) {
                return this.S.when;
            }
            return 0;
        }

        public e m(boolean z9) {
            v(16, z9);
            return this;
        }

        public e n(String str) {
            this.D = str;
            return this;
        }

        public e o(String str) {
            this.L = str;
            return this;
        }

        public e p(boolean z9) {
            this.f1284p = z9;
            g().putBoolean("android.chronometerCountDown", z9);
            return this;
        }

        public e q(int i10) {
            this.F = i10;
            return this;
        }

        public e r(boolean z9) {
            this.B = z9;
            this.C = true;
            return this;
        }

        public e s(PendingIntent pendingIntent) {
            this.f1275g = pendingIntent;
            return this;
        }

        public e t(CharSequence charSequence) {
            this.f1274f = k(charSequence);
            return this;
        }

        public e u(CharSequence charSequence) {
            this.f1273e = k(charSequence);
            return this;
        }

        public e w(PendingIntent pendingIntent, boolean z9) {
            this.f1276h = pendingIntent;
            v(128, z9);
            return this;
        }

        public e x(String str) {
            this.f1292x = str;
            return this;
        }

        public e y(int i10) {
            this.P = i10;
            return this;
        }

        public e z(boolean z9) {
            this.f1293y = z9;
            return this;
        }
    }

    public static class f extends j {

        /* renamed from: e  reason: collision with root package name */
        private int f1295e;

        /* renamed from: f  reason: collision with root package name */
        private p f1296f;

        /* renamed from: g  reason: collision with root package name */
        private PendingIntent f1297g;

        /* renamed from: h  reason: collision with root package name */
        private PendingIntent f1298h;

        /* renamed from: i  reason: collision with root package name */
        private PendingIntent f1299i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1300j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f1301k;

        /* renamed from: l  reason: collision with root package name */
        private Integer f1302l;

        /* renamed from: m  reason: collision with root package name */
        private IconCompat f1303m;

        /* renamed from: n  reason: collision with root package name */
        private CharSequence f1304n;

        static class a {
            static void a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        static class b {
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
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class d {
            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class e {
            static Notification.Builder a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, boolean z9) {
                return builder.setAllowGeneratedReplies(z9);
            }
        }

        /* renamed from: androidx.core.app.l$f$f  reason: collision with other inner class name */
        static class C0019f {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        static class g {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z9) {
                return builder.setAuthenticationRequired(z9);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z9) {
                return callStyle.setIsVideo(z9);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private a A(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.c(this.f1317a.f1269a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f1317a.f1269a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a b10 = new a.C0017a(IconCompat.k(this.f1317a.f1269a, i10), spannableStringBuilder, pendingIntent).b();
            b10.c().putBoolean("key_action_priority", true);
            return b10;
        }

        private a B() {
            int i10 = r.d.ic_call_answer_video;
            int i11 = r.d.ic_call_answer;
            PendingIntent pendingIntent = this.f1297g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z9 = this.f1300j;
            return A(z9 ? i10 : i11, z9 ? r.h.call_notification_answer_video_action : r.h.call_notification_answer_action, this.f1301k, r.b.call_notification_answer_color, pendingIntent);
        }

        private a C() {
            int i10;
            Integer num;
            int i11;
            int i12 = r.d.ic_call_decline;
            PendingIntent pendingIntent = this.f1298h;
            if (pendingIntent == null) {
                i10 = r.h.call_notification_hang_up_action;
                num = this.f1302l;
                i11 = r.b.call_notification_decline_color;
                pendingIntent = this.f1299i;
            } else {
                i10 = r.h.call_notification_decline_action;
                num = this.f1302l;
                i11 = r.b.call_notification_decline_color;
            }
            return A(i12, i10, num, i11, pendingIntent);
        }

        private static Notification.Action w(a aVar) {
            Notification.Action.Builder builder;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                IconCompat d10 = aVar.d();
                builder = d.a(d10 == null ? null : d10.y(), aVar.h(), aVar.a());
            } else {
                IconCompat d11 = aVar.d();
                builder = b.e((d11 == null || d11.q() != 2) ? 0 : d11.n(), aVar.h(), aVar.a());
            }
            Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (i10 >= 24) {
                e.b(builder, aVar.b());
            }
            if (i10 >= 31) {
                g.e(builder, aVar.i());
            }
            b.b(builder, bundle);
            r[] e10 = aVar.e();
            if (e10 != null) {
                for (RemoteInput c10 : r.b(e10)) {
                    b.c(builder, c10);
                }
            }
            return b.d(builder);
        }

        private String y() {
            Resources resources;
            int i10;
            int i11 = this.f1295e;
            if (i11 == 1) {
                resources = this.f1317a.f1269a.getResources();
                i10 = r.h.call_notification_incoming_text;
            } else if (i11 == 2) {
                resources = this.f1317a.f1269a.getResources();
                i10 = r.h.call_notification_ongoing_text;
            } else if (i11 != 3) {
                return null;
            } else {
                resources = this.f1317a.f1269a.getResources();
                i10 = r.h.call_notification_screening_text;
            }
            return resources.getString(i10);
        }

        private boolean z(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public void a(Bundle bundle) {
            String str;
            Parcelable parcelable;
            String str2;
            Parcelable parcelable2;
            super.a(bundle);
            bundle.putInt("android.callType", this.f1295e);
            bundle.putBoolean("android.callIsVideo", this.f1300j);
            p pVar = this.f1296f;
            if (pVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    parcelable2 = pVar.j();
                    str2 = "android.callPerson";
                } else {
                    parcelable2 = pVar.k();
                    str2 = "android.callPersonCompat";
                }
                bundle.putParcelable(str2, parcelable2);
            }
            IconCompat iconCompat = this.f1303m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    parcelable = iconCompat.z(this.f1317a.f1269a);
                    str = "android.verificationIcon";
                } else {
                    parcelable = iconCompat.x();
                    str = "android.verificationIconCompat";
                }
                bundle.putParcelable(str, parcelable);
            }
            bundle.putCharSequence("android.verificationText", this.f1304n);
            bundle.putParcelable("android.answerIntent", this.f1297g);
            bundle.putParcelable("android.declineIntent", this.f1298h);
            bundle.putParcelable("android.hangUpIntent", this.f1299i);
            Integer num = this.f1301k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f1302l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public void b(k kVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.CallStyle callStyle = null;
            if (i10 >= 31) {
                int i11 = this.f1295e;
                if (i11 == 1) {
                    callStyle = g.a(this.f1296f.j(), this.f1298h, this.f1297g);
                } else if (i11 == 2) {
                    callStyle = g.b(this.f1296f.j(), this.f1299i);
                } else if (i11 == 3) {
                    callStyle = g.c(this.f1296f.j(), this.f1299i, this.f1297g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f1295e));
                }
                if (callStyle != null) {
                    e.a(kVar.a());
                    a.a(callStyle, kVar.a());
                    Integer num = this.f1301k;
                    if (num != null) {
                        g.d(callStyle, num.intValue());
                    }
                    Integer num2 = this.f1302l;
                    if (num2 != null) {
                        g.f(callStyle, num2.intValue());
                    }
                    g.i(callStyle, this.f1304n);
                    IconCompat iconCompat = this.f1303m;
                    if (iconCompat != null) {
                        g.h(callStyle, iconCompat.z(this.f1317a.f1269a));
                    }
                    g.g(callStyle, this.f1300j);
                    return;
                }
                return;
            }
            Notification.Builder a10 = kVar.a();
            p pVar = this.f1296f;
            a10.setContentTitle(pVar != null ? pVar.e() : null);
            Bundle bundle = this.f1317a.E;
            if (bundle != null && bundle.containsKey("android.text")) {
                callStyle = this.f1317a.E.getCharSequence("android.text");
            }
            if (callStyle == null) {
                callStyle = y();
            }
            a10.setContentText(callStyle);
            p pVar2 = this.f1296f;
            if (pVar2 != null) {
                if (i10 >= 23 && pVar2.c() != null) {
                    d.b(a10, this.f1296f.c().z(this.f1317a.f1269a));
                }
                if (i10 >= 28) {
                    C0019f.a(a10, this.f1296f.j());
                } else {
                    c.a(a10, this.f1296f.f());
                }
            }
            ArrayList<a> x9 = x();
            if (i10 >= 24) {
                e.a(a10);
            }
            for (a w9 : x9) {
                b.a(a10, w(w9));
            }
            c.b(a10, "call");
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void u(android.os.Bundle r4) {
            /*
                r3 = this;
                super.u(r4)
                java.lang.String r0 = "android.callType"
                int r0 = r4.getInt(r0)
                r3.f1295e = r0
                java.lang.String r0 = "android.callIsVideo"
                boolean r0 = r4.getBoolean(r0)
                r3.f1300j = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L_0x002c
                java.lang.String r1 = "android.callPerson"
                boolean r2 = r4.containsKey(r1)
                if (r2 == 0) goto L_0x002c
                android.os.Parcelable r1 = r4.getParcelable(r1)
                android.app.Person r1 = (android.app.Person) r1
                androidx.core.app.p r1 = androidx.core.app.p.a(r1)
                goto L_0x003c
            L_0x002c:
                java.lang.String r1 = "android.callPersonCompat"
                boolean r2 = r4.containsKey(r1)
                if (r2 == 0) goto L_0x003e
                android.os.Bundle r1 = r4.getBundle(r1)
                androidx.core.app.p r1 = androidx.core.app.p.b(r1)
            L_0x003c:
                r3.f1296f = r1
            L_0x003e:
                r1 = 23
                if (r0 < r1) goto L_0x0055
                java.lang.String r0 = "android.verificationIcon"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L_0x0055
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.c(r0)
                goto L_0x0065
            L_0x0055:
                java.lang.String r0 = "android.verificationIconCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L_0x0067
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)
            L_0x0065:
                r3.f1303m = r0
            L_0x0067:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r0 = r4.getCharSequence(r0)
                r3.f1304n = r0
                java.lang.String r0 = "android.answerIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f1297g = r0
                java.lang.String r0 = "android.declineIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f1298h = r0
                java.lang.String r0 = "android.hangUpIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f1299i = r0
                java.lang.String r0 = "android.answerColor"
                boolean r1 = r4.containsKey(r0)
                r2 = 0
                if (r1 == 0) goto L_0x009f
                int r0 = r4.getInt(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x00a0
            L_0x009f:
                r0 = r2
            L_0x00a0:
                r3.f1301k = r0
                java.lang.String r0 = "android.declineColor"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L_0x00b2
                int r4 = r4.getInt(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            L_0x00b2:
                r3.f1302l = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.f.u(android.os.Bundle):void");
        }

        public ArrayList<a> x() {
            a C = C();
            a B = B();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(C);
            int i10 = 2;
            ArrayList<a> arrayList2 = this.f1317a.f1270b;
            if (arrayList2 != null) {
                for (a next : arrayList2) {
                    if (next.j()) {
                        arrayList.add(next);
                    } else if (!z(next) && i10 > 1) {
                        arrayList.add(next);
                        i10--;
                    }
                    if (B != null && i10 == 1) {
                        arrayList.add(B);
                        i10--;
                    }
                }
            }
            if (B != null && i10 >= 1) {
                arrayList.add(B);
            }
            return arrayList;
        }
    }

    public static class g extends j {

        static class a {
            static void a(RemoteViews remoteViews, int i10, CharSequence charSequence) {
                remoteViews.setContentDescription(i10, charSequence);
            }
        }

        static class b {
            static Notification.Builder a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        static class c {
            static Notification.DecoratedCustomViewStyle a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews w(RemoteViews remoteViews, boolean z9) {
            int min;
            boolean z10 = true;
            int i10 = 0;
            RemoteViews c10 = c(true, r.g.notification_template_custom_big, false);
            c10.removeAllViews(r.e.actions);
            List<a> y9 = y(this.f1317a.f1270b);
            if (!z9 || y9 == null || (min = Math.min(y9.size(), 3)) <= 0) {
                z10 = false;
            } else {
                for (int i11 = 0; i11 < min; i11++) {
                    c10.addView(r.e.actions, x(y9.get(i11)));
                }
            }
            if (!z10) {
                i10 = 8;
            }
            c10.setViewVisibility(r.e.actions, i10);
            c10.setViewVisibility(r.e.action_divider, i10);
            d(c10, remoteViews);
            return c10;
        }

        private RemoteViews x(a aVar) {
            boolean z9 = aVar.f1251k == null;
            RemoteViews remoteViews = new RemoteViews(this.f1317a.f1269a.getPackageName(), z9 ? r.g.notification_action_tombstone : r.g.notification_action);
            IconCompat d10 = aVar.d();
            if (d10 != null) {
                remoteViews.setImageViewBitmap(r.e.action_image, l(d10, r.b.notification_action_color_filter));
            }
            remoteViews.setTextViewText(r.e.action_text, aVar.f1250j);
            if (!z9) {
                remoteViews.setOnClickPendingIntent(r.e.action_container, aVar.f1251k);
            }
            a.a(remoteViews, r.e.action_container, aVar.f1250j);
            return remoteViews;
        }

        private static List<a> y(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (!next.j()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                b.a(kVar.a(), c.a());
            }
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews r(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews d10 = this.f1317a.d();
            if (d10 == null) {
                d10 = this.f1317a.f();
            }
            if (d10 == null) {
                return null;
            }
            return w(d10, true);
        }

        public RemoteViews s(k kVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f1317a.f() != null) {
                return w(this.f1317a.f(), false);
            }
            return null;
        }

        public RemoteViews t(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews h10 = this.f1317a.h();
            RemoteViews f10 = h10 != null ? h10 : this.f1317a.f();
            if (h10 == null) {
                return null;
            }
            return w(f10, true);
        }
    }

    public static class h extends j {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f1305e = new ArrayList<>();

        static class a {
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public void b(k kVar) {
            Notification.InboxStyle c10 = a.c(a.b(kVar.a()), this.f1318b);
            if (this.f1320d) {
                a.d(c10, this.f1319c);
            }
            Iterator<CharSequence> it = this.f1305e.iterator();
            while (it.hasNext()) {
                a.a(c10, it.next());
            }
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* access modifiers changed from: protected */
        public void u(Bundle bundle) {
            super.u(bundle);
            this.f1305e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f1305e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public h w(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1305e.add(e.k(charSequence));
            }
            return this;
        }

        public h x(CharSequence charSequence) {
            this.f1318b = e.k(charSequence);
            return this;
        }

        public h y(CharSequence charSequence) {
            this.f1319c = e.k(charSequence);
            this.f1320d = true;
            return this;
        }
    }

    public static class i extends j {

        /* renamed from: e  reason: collision with root package name */
        private final List<e> f1306e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<e> f1307f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private p f1308g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f1309h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f1310i;

        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class d {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z9) {
                return messagingStyle.setGroupConversation(z9);
            }
        }

        public static final class e {

            /* renamed from: a  reason: collision with root package name */
            private final CharSequence f1311a;

            /* renamed from: b  reason: collision with root package name */
            private final long f1312b;

            /* renamed from: c  reason: collision with root package name */
            private final p f1313c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f1314d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f1315e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f1316f;

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public e(CharSequence charSequence, long j10, p pVar) {
                this.f1311a = charSequence;
                this.f1312b = j10;
                this.f1313c = pVar;
            }

            static Bundle[] a(List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).l();
                }
                return bundleArr;
            }

            static e e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? p.b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new p.b().f(bundle.getCharSequence("sender")).a() : null : p.a((Person) bundle.getParcelable("sender_person")));
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                eVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                eVar.d().putAll(bundle.getBundle("extras"));
                            }
                            return eVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<e> f(Parcelable[] parcelableArr) {
                e e10;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                    if ((parcelableArr[i10] instanceof Bundle) && (e10 = e(parcelableArr[i10])) != null) {
                        arrayList.add(e10);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f1311a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f1312b);
                p pVar = this.f1313c;
                if (pVar != null) {
                    bundle.putCharSequence("sender", pVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f1313c.j());
                    } else {
                        bundle.putBundle("person", this.f1313c.k());
                    }
                }
                String str = this.f1315e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f1316f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f1314d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f1315e;
            }

            public Uri c() {
                return this.f1316f;
            }

            public Bundle d() {
                return this.f1314d;
            }

            public p g() {
                return this.f1313c;
            }

            public CharSequence h() {
                return this.f1311a;
            }

            public long i() {
                return this.f1312b;
            }

            public e j(String str, Uri uri) {
                this.f1315e = str;
                this.f1316f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message k() {
                /*
                    r5 = this;
                    androidx.core.app.p r0 = r5.g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x001f
                    java.lang.CharSequence r1 = r5.h()
                    long r3 = r5.i()
                    if (r0 != 0) goto L_0x0016
                    goto L_0x001a
                L_0x0016:
                    android.app.Person r2 = r0.j()
                L_0x001a:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.l.i.e.b.a(r1, r3, r2)
                    goto L_0x0032
                L_0x001f:
                    java.lang.CharSequence r1 = r5.h()
                    long r3 = r5.i()
                    if (r0 != 0) goto L_0x002a
                    goto L_0x002e
                L_0x002a:
                    java.lang.CharSequence r2 = r0.e()
                L_0x002e:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.l.i.e.a.a(r1, r3, r2)
                L_0x0032:
                    java.lang.String r1 = r5.b()
                    if (r1 == 0) goto L_0x0043
                    java.lang.String r1 = r5.b()
                    android.net.Uri r2 = r5.c()
                    androidx.core.app.l.i.e.a.b(r0, r1, r2)
                L_0x0043:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.i.e.k():android.app.Notification$MessagingStyle$Message");
            }
        }

        i() {
        }

        public i(p pVar) {
            if (!TextUtils.isEmpty(pVar.e())) {
                this.f1308g = pVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        private boolean C() {
            for (int size = this.f1306e.size() - 1; size >= 0; size--) {
                e eVar = this.f1306e.get(size);
                if (eVar.g() != null && eVar.g().e() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan E(int i10) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i10), (ColorStateList) null);
        }

        private CharSequence F(e eVar) {
            androidx.core.text.a c10 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i10 = -16777216;
            CharSequence charSequence = "";
            CharSequence e10 = eVar.g() == null ? charSequence : eVar.g().e();
            if (TextUtils.isEmpty(e10)) {
                e10 = this.f1308g.e();
                if (this.f1317a.e() != 0) {
                    i10 = this.f1317a.e();
                }
            }
            CharSequence h10 = c10.h(e10);
            spannableStringBuilder.append(h10);
            spannableStringBuilder.setSpan(E(i10), spannableStringBuilder.length() - h10.length(), spannableStringBuilder.length(), 33);
            if (eVar.h() != null) {
                charSequence = eVar.h();
            }
            spannableStringBuilder.append("  ").append(c10.h(charSequence));
            return spannableStringBuilder;
        }

        public static i x(Notification notification) {
            j o10 = j.o(notification);
            if (o10 instanceof i) {
                return (i) o10;
            }
            return null;
        }

        private e y() {
            for (int size = this.f1306e.size() - 1; size >= 0; size--) {
                e eVar = this.f1306e.get(size);
                if (eVar.g() != null && !TextUtils.isEmpty(eVar.g().e())) {
                    return eVar;
                }
            }
            if (this.f1306e.isEmpty()) {
                return null;
            }
            List<e> list = this.f1306e;
            return list.get(list.size() - 1);
        }

        public List<e> A() {
            return this.f1306e;
        }

        public p B() {
            return this.f1308g;
        }

        public boolean D() {
            e eVar = this.f1317a;
            if (eVar != null && eVar.f1269a.getApplicationInfo().targetSdkVersion < 28 && this.f1310i == null) {
                return this.f1309h != null;
            }
            Boolean bool = this.f1310i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public i G(CharSequence charSequence) {
            this.f1309h = charSequence;
            return this;
        }

        public i H(boolean z9) {
            this.f1310i = Boolean.valueOf(z9);
            return this;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f1308g.e());
            bundle.putBundle("android.messagingStyleUser", this.f1308g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f1309h);
            if (this.f1309h != null && this.f1310i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f1309h);
            }
            if (!this.f1306e.isEmpty()) {
                bundle.putParcelableArray("android.messages", e.a(this.f1306e));
            }
            if (!this.f1307f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", e.a(this.f1307f));
            }
            Boolean bool = this.f1310i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(androidx.core.app.k r8) {
            /*
                r7 = this;
                boolean r0 = r7.D()
                r7.H(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0087
                r1 = 28
                if (r0 < r1) goto L_0x001c
                androidx.core.app.p r0 = r7.f1308g
                android.app.Person r0 = r0.j()
                android.app.Notification$MessagingStyle r0 = androidx.core.app.l.i.d.a(r0)
                goto L_0x0026
            L_0x001c:
                androidx.core.app.p r0 = r7.f1308g
                java.lang.CharSequence r0 = r0.e()
                android.app.Notification$MessagingStyle r0 = androidx.core.app.l.i.b.b(r0)
            L_0x0026:
                java.util.List<androidx.core.app.l$i$e> r2 = r7.f1306e
                java.util.Iterator r2 = r2.iterator()
            L_0x002c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0040
                java.lang.Object r3 = r2.next()
                androidx.core.app.l$i$e r3 = (androidx.core.app.l.i.e) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.k()
                androidx.core.app.l.i.b.a(r0, r3)
                goto L_0x002c
            L_0x0040:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L_0x0060
                java.util.List<androidx.core.app.l$i$e> r2 = r7.f1307f
                java.util.Iterator r2 = r2.iterator()
            L_0x004c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0060
                java.lang.Object r3 = r2.next()
                androidx.core.app.l$i$e r3 = (androidx.core.app.l.i.e) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.k()
                androidx.core.app.l.i.c.a(r0, r3)
                goto L_0x004c
            L_0x0060:
                java.lang.Boolean r2 = r7.f1310i
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x006c
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0071
            L_0x006c:
                java.lang.CharSequence r2 = r7.f1309h
                androidx.core.app.l.i.b.c(r0, r2)
            L_0x0071:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x007e
                java.lang.Boolean r1 = r7.f1310i
                boolean r1 = r1.booleanValue()
                androidx.core.app.l.i.d.b(r0, r1)
            L_0x007e:
                android.app.Notification$Builder r8 = r8.a()
                androidx.core.app.l.i.a.d(r0, r8)
                goto L_0x012a
            L_0x0087:
                androidx.core.app.l$i$e r0 = r7.y()
                java.lang.CharSequence r1 = r7.f1309h
                if (r1 == 0) goto L_0x00a1
                java.lang.Boolean r1 = r7.f1310i
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x00a1
                android.app.Notification$Builder r1 = r8.a()
                java.lang.CharSequence r2 = r7.f1309h
            L_0x009d:
                r1.setContentTitle(r2)
                goto L_0x00bf
            L_0x00a1:
                if (r0 == 0) goto L_0x00bf
                android.app.Notification$Builder r1 = r8.a()
                java.lang.String r2 = ""
                r1.setContentTitle(r2)
                androidx.core.app.p r1 = r0.g()
                if (r1 == 0) goto L_0x00bf
                android.app.Notification$Builder r1 = r8.a()
                androidx.core.app.p r2 = r0.g()
                java.lang.CharSequence r2 = r2.e()
                goto L_0x009d
            L_0x00bf:
                if (r0 == 0) goto L_0x00d5
                android.app.Notification$Builder r1 = r8.a()
                java.lang.CharSequence r2 = r7.f1309h
                if (r2 == 0) goto L_0x00ce
                java.lang.CharSequence r0 = r7.F(r0)
                goto L_0x00d2
            L_0x00ce:
                java.lang.CharSequence r0 = r0.h()
            L_0x00d2:
                r1.setContentText(r0)
            L_0x00d5:
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r1 = r7.f1309h
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00e9
                boolean r1 = r7.C()
                if (r1 == 0) goto L_0x00e7
                goto L_0x00e9
            L_0x00e7:
                r1 = 0
                goto L_0x00ea
            L_0x00e9:
                r1 = 1
            L_0x00ea:
                java.util.List<androidx.core.app.l$i$e> r4 = r7.f1306e
                int r4 = r4.size()
                int r4 = r4 - r3
            L_0x00f1:
                if (r4 < 0) goto L_0x011a
                java.util.List<androidx.core.app.l$i$e> r5 = r7.f1306e
                java.lang.Object r5 = r5.get(r4)
                androidx.core.app.l$i$e r5 = (androidx.core.app.l.i.e) r5
                if (r1 == 0) goto L_0x0102
                java.lang.CharSequence r5 = r7.F(r5)
                goto L_0x0106
            L_0x0102:
                java.lang.CharSequence r5 = r5.h()
            L_0x0106:
                java.util.List<androidx.core.app.l$i$e> r6 = r7.f1306e
                int r6 = r6.size()
                int r6 = r6 - r3
                if (r4 == r6) goto L_0x0114
                java.lang.String r6 = "\n"
                r0.insert(r2, r6)
            L_0x0114:
                r0.insert(r2, r5)
                int r4 = r4 + -1
                goto L_0x00f1
            L_0x011a:
                android.app.Notification$Builder r8 = r8.a()
                android.app.Notification$BigTextStyle r8 = androidx.core.app.l.i.a.b(r8)
                r1 = 0
                android.app.Notification$BigTextStyle r8 = androidx.core.app.l.i.a.c(r8, r1)
                androidx.core.app.l.i.a.a(r8, r0)
            L_0x012a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.i.b(androidx.core.app.k):void");
        }

        /* access modifiers changed from: protected */
        public String p() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* access modifiers changed from: protected */
        public void u(Bundle bundle) {
            super.u(bundle);
            this.f1306e.clear();
            this.f1308g = bundle.containsKey("android.messagingStyleUser") ? p.b(bundle.getBundle("android.messagingStyleUser")) : new p.b().f(bundle.getString("android.selfDisplayName")).a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f1309h = charSequence;
            if (charSequence == null) {
                this.f1309h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f1306e.addAll(e.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f1307f.addAll(e.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f1310i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public i w(e eVar) {
            if (eVar != null) {
                this.f1306e.add(eVar);
                if (this.f1306e.size() > 25) {
                    this.f1306e.remove(0);
                }
            }
            return this;
        }

        public CharSequence z() {
            return this.f1309h;
        }
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        protected e f1317a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1318b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1319c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1320d = false;

        static class a {
            static void a(RemoteViews remoteViews, int i10, int i11, float f10) {
                remoteViews.setTextViewTextSize(i10, i11, f10);
            }

            static void b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
                remoteViews.setViewPadding(i10, i11, i12, i13, i14);
            }
        }

        static class b {
            static void a(RemoteViews remoteViews, int i10, boolean z9) {
                remoteViews.setChronometerCountDown(i10, z9);
            }
        }

        private int e() {
            Resources resources = this.f1317a.f1269a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(r.c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(r.c.notification_top_pad_large_text);
            float f10 = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f10) * ((float) dimensionPixelSize)) + (f10 * ((float) dimensionPixelSize2)));
        }

        private static float f(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        static j g(String str) {
            if (str == null) {
                return null;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new f();
                case 3:
                    return new h();
                case 4:
                    return new c();
                case 5:
                    return new i();
                default:
                    return null;
            }
        }

        private static j h(String str) {
            if (str == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (i10 >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new i();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new g();
                }
            }
            return null;
        }

        static j i(Bundle bundle) {
            j g10 = g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return g10 != null ? g10 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : h(bundle.getString("android.template"));
        }

        static j j(Bundle bundle) {
            j i10 = i(bundle);
            if (i10 == null) {
                return null;
            }
            try {
                i10.u(bundle);
                return i10;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap k(int i10, int i11, int i12) {
            return m(IconCompat.k(this.f1317a.f1269a, i10), i11, i12);
        }

        private Bitmap m(IconCompat iconCompat, int i10, int i11) {
            Drawable t9 = iconCompat.t(this.f1317a.f1269a);
            int intrinsicWidth = i11 == 0 ? t9.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = t9.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            t9.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                t9.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            t9.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap n(int i10, int i11, int i12, int i13) {
            int i14 = r.d.notification_icon_background;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap k10 = k(i14, i13, i11);
            Canvas canvas = new Canvas(k10);
            Drawable mutate = this.f1317a.f1269a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return k10;
        }

        public static j o(Notification notification) {
            Bundle a10 = l.a(notification);
            if (a10 == null) {
                return null;
            }
            return j(a10);
        }

        private void q(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(r.e.f12026k0, 8);
            remoteViews.setViewVisibility(r.e.text2, 8);
            remoteViews.setViewVisibility(r.e.f12025h0, 8);
        }

        public void a(Bundle bundle) {
            if (this.f1320d) {
                bundle.putCharSequence("android.summaryText", this.f1319c);
            }
            CharSequence charSequence = this.f1318b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String p10 = p();
            if (p10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", p10);
            }
        }

        public abstract void b(k kVar);

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0191  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.l$e r0 = r12.f1317a
                android.content.Context r0 = r0.f1269a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.l$e r1 = r12.f1317a
                android.content.Context r1 = r1.f1269a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.l$e r14 = r12.f1317a
                r14.i()
                int r14 = android.os.Build.VERSION.SDK_INT
                androidx.core.app.l$e r1 = r12.f1317a
                android.graphics.Bitmap r2 = r1.f1278j
                r8 = 0
                if (r2 == 0) goto L_0x0060
                int r1 = r.e.icon
                r7.setViewVisibility(r1, r8)
                androidx.core.app.l$e r2 = r12.f1317a
                android.graphics.Bitmap r2 = r2.f1278j
                r7.setImageViewBitmap(r1, r2)
                if (r13 == 0) goto L_0x0091
                androidx.core.app.l$e r13 = r12.f1317a
                android.app.Notification r13 = r13.S
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = r.c.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = r.c.notification_small_icon_background_padding
                int r1 = r0.getDimensionPixelSize(r1)
                int r1 = r1 * 2
                int r1 = r13 - r1
                androidx.core.app.l$e r2 = r12.f1317a
                android.app.Notification r3 = r2.S
                int r3 = r3.icon
                int r2 = r2.e()
                android.graphics.Bitmap r13 = r12.n(r3, r13, r1, r2)
                int r1 = r.e.right_icon
                r7.setImageViewBitmap(r1, r13)
                r7.setViewVisibility(r1, r8)
                goto L_0x0091
            L_0x0060:
                if (r13 == 0) goto L_0x0091
                android.app.Notification r13 = r1.S
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = r.e.icon
                r7.setViewVisibility(r13, r8)
                int r1 = r.c.notification_large_icon_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = r.c.notification_big_circle_margin
                int r2 = r0.getDimensionPixelSize(r2)
                int r1 = r1 - r2
                int r2 = r.c.notification_small_icon_size_as_large
                int r2 = r0.getDimensionPixelSize(r2)
                androidx.core.app.l$e r3 = r12.f1317a
                android.app.Notification r4 = r3.S
                int r4 = r4.icon
                int r3 = r3.e()
                android.graphics.Bitmap r1 = r12.n(r4, r1, r2, r3)
                r7.setImageViewBitmap(r13, r1)
            L_0x0091:
                androidx.core.app.l$e r13 = r12.f1317a
                java.lang.CharSequence r13 = r13.f1273e
                if (r13 == 0) goto L_0x009c
                int r1 = r.e.f12026k0
                r7.setTextViewText(r1, r13)
            L_0x009c:
                androidx.core.app.l$e r13 = r12.f1317a
                java.lang.CharSequence r13 = r13.f1274f
                r9 = 1
                if (r13 == 0) goto L_0x00aa
                int r1 = r.e.f12025h0
                r7.setTextViewText(r1, r13)
                r13 = 1
                goto L_0x00ab
            L_0x00aa:
                r13 = 0
            L_0x00ab:
                androidx.core.app.l$e r1 = r12.f1317a
                java.lang.CharSequence r2 = r1.f1279k
                r10 = 8
                if (r2 == 0) goto L_0x00be
                int r13 = r.e.info
                r7.setTextViewText(r13, r2)
            L_0x00b8:
                r7.setViewVisibility(r13, r8)
                r13 = 1
                r11 = 1
                goto L_0x00f5
            L_0x00be:
                int r1 = r1.f1280l
                if (r1 <= 0) goto L_0x00ef
                int r13 = r.f.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                androidx.core.app.l$e r1 = r12.f1317a
                int r1 = r1.f1280l
                if (r1 <= r13) goto L_0x00da
                int r13 = r.e.info
                int r1 = r.h.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r13, r1)
                goto L_0x00ec
            L_0x00da:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r1 = r.e.info
                androidx.core.app.l$e r2 = r12.f1317a
                int r2 = r2.f1280l
                long r2 = (long) r2
                java.lang.String r13 = r13.format(r2)
                r7.setTextViewText(r1, r13)
            L_0x00ec:
                int r13 = r.e.info
                goto L_0x00b8
            L_0x00ef:
                int r1 = r.e.info
                r7.setViewVisibility(r1, r10)
                r11 = 0
            L_0x00f5:
                androidx.core.app.l$e r1 = r12.f1317a
                java.lang.CharSequence r1 = r1.f1286r
                if (r1 == 0) goto L_0x0115
                int r2 = r.e.f12025h0
                r7.setTextViewText(r2, r1)
                androidx.core.app.l$e r1 = r12.f1317a
                java.lang.CharSequence r1 = r1.f1274f
                if (r1 == 0) goto L_0x0110
                int r2 = r.e.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = 1
                goto L_0x0116
            L_0x0110:
                int r1 = r.e.text2
                r7.setViewVisibility(r1, r10)
            L_0x0115:
                r1 = 0
            L_0x0116:
                if (r1 == 0) goto L_0x0130
                if (r15 == 0) goto L_0x0126
                int r15 = r.c.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = r.e.f12025h0
                androidx.core.app.l.j.a.a(r7, r0, r8, r15)
            L_0x0126:
                int r2 = r.e.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                androidx.core.app.l.j.a.b(r1, r2, r3, r4, r5, r6)
            L_0x0130:
                androidx.core.app.l$e r15 = r12.f1317a
                long r0 = r15.j()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0180
                androidx.core.app.l$e r15 = r12.f1317a
                boolean r15 = r15.f1283o
                if (r15 == 0) goto L_0x016f
                int r15 = r.e.chronometer
                r7.setViewVisibility(r15, r8)
                androidx.core.app.l$e r0 = r12.f1317a
                long r0 = r0.j()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r15, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r15, r0, r9)
                androidx.core.app.l$e r0 = r12.f1317a
                boolean r0 = r0.f1284p
                if (r0 == 0) goto L_0x0181
                r1 = 24
                if (r14 < r1) goto L_0x0181
                androidx.core.app.l.j.b.a(r7, r15, r0)
                goto L_0x0181
            L_0x016f:
                int r14 = r.e.time
                r7.setViewVisibility(r14, r8)
                androidx.core.app.l$e r15 = r12.f1317a
                long r0 = r15.j()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x0181
            L_0x0180:
                r9 = r11
            L_0x0181:
                int r14 = r.e.right_side
                if (r9 == 0) goto L_0x0187
                r15 = 0
                goto L_0x0189
            L_0x0187:
                r15 = 8
            L_0x0189:
                r7.setViewVisibility(r14, r15)
                int r14 = r.e.line3
                if (r13 == 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r8 = 8
            L_0x0193:
                r7.setViewVisibility(r14, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.j.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            q(remoteViews);
            int i10 = r.e.notification_main_column;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            a.b(remoteViews, r.e.notification_main_column_container, 0, e(), 0, 0);
        }

        /* access modifiers changed from: package-private */
        public Bitmap l(IconCompat iconCompat, int i10) {
            return m(iconCompat, i10, 0);
        }

        /* access modifiers changed from: protected */
        public String p() {
            return null;
        }

        public RemoteViews r(k kVar) {
            return null;
        }

        public RemoteViews s(k kVar) {
            return null;
        }

        public RemoteViews t(k kVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        public void u(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f1319c = bundle.getCharSequence("android.summaryText");
                this.f1320d = true;
            }
            this.f1318b = bundle.getCharSequence("android.title.big");
        }

        public void v(e eVar) {
            if (this.f1317a != eVar) {
                this.f1317a = eVar;
                if (eVar != null) {
                    eVar.M(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
