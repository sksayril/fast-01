package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.h1;
import androidx.core.content.res.h;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f;
import androidx.core.view.f0;
import androidx.core.view.h0;
import androidx.core.view.x;
import androidx.lifecycle.g;
import j.b;
import j.f;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class f extends e implements e.a, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    private static final p.g<String, Integer> f316n0 = new p.g<>();

    /* renamed from: o0  reason: collision with root package name */
    private static final boolean f317o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    private static final int[] f318p0 = {16842836};

    /* renamed from: q0  reason: collision with root package name */
    private static final boolean f319q0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: r0  reason: collision with root package name */
    private static final boolean f320r0 = true;
    j.b A;
    ActionBarContextView B;
    PopupWindow C;
    Runnable D;
    d0 E;
    private boolean F;
    private boolean G;
    ViewGroup H;
    private TextView I;
    private View J;
    private boolean K;
    private boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    private boolean R;
    private s[] S;
    private s T;
    private boolean U;
    private boolean V;
    private boolean W;
    boolean X;
    private Configuration Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f321a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f322b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f323c0;

    /* renamed from: d0  reason: collision with root package name */
    private o f324d0;

    /* renamed from: e0  reason: collision with root package name */
    private o f325e0;

    /* renamed from: f0  reason: collision with root package name */
    boolean f326f0;

    /* renamed from: g0  reason: collision with root package name */
    int f327g0;

    /* renamed from: h0  reason: collision with root package name */
    private final Runnable f328h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f329i0;

    /* renamed from: j0  reason: collision with root package name */
    private Rect f330j0;

    /* renamed from: k0  reason: collision with root package name */
    private Rect f331k0;

    /* renamed from: l0  reason: collision with root package name */
    private h f332l0;

    /* renamed from: m0  reason: collision with root package name */
    private i f333m0;

    /* renamed from: p  reason: collision with root package name */
    final Object f334p;

    /* renamed from: q  reason: collision with root package name */
    final Context f335q;

    /* renamed from: r  reason: collision with root package name */
    Window f336r;

    /* renamed from: s  reason: collision with root package name */
    private m f337s;

    /* renamed from: t  reason: collision with root package name */
    final d f338t;

    /* renamed from: u  reason: collision with root package name */
    a f339u;

    /* renamed from: v  reason: collision with root package name */
    MenuInflater f340v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f341w;

    /* renamed from: x  reason: collision with root package name */
    private g0 f342x;

    /* renamed from: y  reason: collision with root package name */
    private g f343y;

    /* renamed from: z  reason: collision with root package name */
    private t f344z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            f fVar = f.this;
            if ((fVar.f327g0 & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.f327g0 & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.f326f0 = false;
            fVar3.f327g0 = 0;
        }
    }

    class b implements androidx.core.view.s {
        b() {
        }

        public h0 a(View view, h0 h0Var) {
            int k10 = h0Var.k();
            int L0 = f.this.L0(h0Var, (Rect) null);
            if (k10 != L0) {
                h0Var = h0Var.p(h0Var.i(), L0, h0Var.j(), h0Var.h());
            }
            return x.X(view, h0Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    class d implements Runnable {

        class a extends f0 {
            a() {
            }

            public void b(View view) {
                f.this.B.setAlpha(1.0f);
                f.this.E.h((e0) null);
                f.this.E = null;
            }

            public void c(View view) {
                f.this.B.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            f fVar = f.this;
            fVar.C.showAtLocation(fVar.B, 55, 0, 0);
            f.this.V();
            if (f.this.D0()) {
                f.this.B.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.E = x.c(fVar2.B).b(1.0f);
                f.this.E.h(new a());
                return;
            }
            f.this.B.setAlpha(1.0f);
            f.this.B.setVisibility(0);
        }
    }

    class e extends f0 {
        e() {
        }

        public void b(View view) {
            f.this.B.setAlpha(1.0f);
            f.this.E.h((e0) null);
            f.this.E = null;
        }

        public void c(View view) {
            f.this.B.setVisibility(0);
            if (f.this.B.getParent() instanceof View) {
                x.d0((View) f.this.B.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    interface C0006f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class g implements j.a {
        g() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            f.this.L(eVar);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02 = f.this.f0();
            if (f02 == null) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    class h implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f352a;

        class a extends f0 {
            a() {
            }

            public void b(View view) {
                f.this.B.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.C;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.B.getParent() instanceof View) {
                    x.d0((View) f.this.B.getParent());
                }
                f.this.B.k();
                f.this.E.h((e0) null);
                f fVar2 = f.this;
                fVar2.E = null;
                x.d0(fVar2.H);
            }
        }

        public h(b.a aVar) {
            this.f352a = aVar;
        }

        public boolean a(j.b bVar, MenuItem menuItem) {
            return this.f352a.a(bVar, menuItem);
        }

        public boolean b(j.b bVar, Menu menu) {
            return this.f352a.b(bVar, menu);
        }

        public void c(j.b bVar) {
            this.f352a.c(bVar);
            f fVar = f.this;
            if (fVar.C != null) {
                fVar.f336r.getDecorView().removeCallbacks(f.this.D);
            }
            f fVar2 = f.this;
            if (fVar2.B != null) {
                fVar2.V();
                f fVar3 = f.this;
                fVar3.E = x.c(fVar3.B).b(0.0f);
                f.this.E.h(new a());
            }
            f fVar4 = f.this;
            d dVar = fVar4.f338t;
            if (dVar != null) {
                dVar.d(fVar4.A);
            }
            f fVar5 = f.this;
            fVar5.A = null;
            x.d0(fVar5.H);
        }

        public boolean d(j.b bVar, Menu menu) {
            x.d0(f.this.H);
            return this.f352a.d(bVar, menu);
        }
    }

    static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    class m extends j.i {

        /* renamed from: n  reason: collision with root package name */
        private C0006f f355n;

        m(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f335q, callback);
            j.b F0 = f.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.f$f r0 = r1.f355n
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.m.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            f.this.u0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            f.this.v0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z9 = true;
            if (eVar != null) {
                eVar.a0(true);
            }
            C0006f fVar = this.f355n;
            if (fVar == null || !fVar.a(i10)) {
                z9 = false;
            }
            if (!z9) {
                z9 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z9;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            s d02 = f.this.d0(0, true);
            if (d02 == null || (eVar = d02.f374j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (!f.this.m0() || i10 != 0) ? super.onWindowStartingActionMode(callback, i10) : b(callback);
        }
    }

    private class n extends o {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f357c;

        n(Context context) {
            super();
            this.f357c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return j.a(this.f357c) ? 2 : 1;
        }

        public void d() {
            f.this.F();
        }
    }

    abstract class o {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f359a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f359a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f335q.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f359a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f359a == null) {
                    this.f359a = new a();
                }
                f.this.f335q.registerReceiver(this.f359a, b10);
            }
        }
    }

    private class p extends o {

        /* renamed from: c  reason: collision with root package name */
        private final l f362c;

        p(l lVar) {
            super();
            this.f362c = lVar;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f362c.d() ? 2 : 1;
        }

        public void d() {
            f.this.F();
        }
    }

    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.N(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    protected static final class s {

        /* renamed from: a  reason: collision with root package name */
        int f365a;

        /* renamed from: b  reason: collision with root package name */
        int f366b;

        /* renamed from: c  reason: collision with root package name */
        int f367c;

        /* renamed from: d  reason: collision with root package name */
        int f368d;

        /* renamed from: e  reason: collision with root package name */
        int f369e;

        /* renamed from: f  reason: collision with root package name */
        int f370f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f371g;

        /* renamed from: h  reason: collision with root package name */
        View f372h;

        /* renamed from: i  reason: collision with root package name */
        View f373i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f374j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f375k;

        /* renamed from: l  reason: collision with root package name */
        Context f376l;

        /* renamed from: m  reason: collision with root package name */
        boolean f377m;

        /* renamed from: n  reason: collision with root package name */
        boolean f378n;

        /* renamed from: o  reason: collision with root package name */
        boolean f379o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f380p;

        /* renamed from: q  reason: collision with root package name */
        boolean f381q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f382r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f383s;

        s(int i10) {
            this.f365a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f374j == null) {
                return null;
            }
            if (this.f375k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f376l, f.g.abc_list_menu_item_layout);
                this.f375k = cVar;
                cVar.k(aVar);
                this.f374j.b(this.f375k);
            }
            return this.f375k.c(this.f371g);
        }

        public boolean b() {
            if (this.f372h == null) {
                return false;
            }
            return this.f373i != null || this.f375k.a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f374j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.O(this.f375k);
                }
                this.f374j = eVar;
                if (eVar != null && (cVar = this.f375k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(f.a.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = f.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i11, true);
            j.d dVar = new j.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f376l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f8709y0);
            this.f366b = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            this.f370f = obtainStyledAttributes.getResourceId(f.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class t implements j.a {
        t() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z10 = D != eVar;
            f fVar = f.this;
            if (z10) {
                eVar = D;
            }
            s Y = fVar.Y(eVar);
            if (Y == null) {
                return;
            }
            if (z10) {
                f.this.K(Y.f365a, Y, D);
                f.this.O(Y, true);
                return;
            }
            f.this.O(Y, z9);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02;
            if (eVar != eVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.M || (f02 = fVar.f0()) == null || f.this.X) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    f(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    f(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f316n0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private f(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.E = r0
            r0 = 1
            r2.F = r0
            r0 = -100
            r2.Z = r0
            androidx.appcompat.app.f$a r1 = new androidx.appcompat.app.f$a
            r1.<init>()
            r2.f328h0 = r1
            r2.f335q = r3
            r2.f338t = r5
            r2.f334p = r6
            int r3 = r2.Z
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.c r3 = r2.I0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r3.I()
            int r3 = r3.k()
            r2.Z = r3
        L_0x0032:
            int r3 = r2.Z
            if (r3 != r0) goto L_0x0059
            p.g<java.lang.String, java.lang.Integer> r3 = f316n0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.Z = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.I(r4)
        L_0x005e:
            androidx.appcompat.widget.k.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    private boolean A0(s sVar, KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        if (this.X) {
            return false;
        }
        if (sVar.f377m) {
            return true;
        }
        s sVar2 = this.T;
        if (!(sVar2 == null || sVar2 == sVar)) {
            O(sVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            sVar.f373i = f02.onCreatePanelView(sVar.f365a);
        }
        int i10 = sVar.f365a;
        boolean z9 = i10 == 0 || i10 == 108;
        if (z9 && (g0Var3 = this.f342x) != null) {
            g0Var3.c();
        }
        if (sVar.f373i == null) {
            if (z9) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = sVar.f374j;
            if (eVar == null || sVar.f382r) {
                if (eVar == null && (!j0(sVar) || sVar.f374j == null)) {
                    return false;
                }
                if (z9 && this.f342x != null) {
                    if (this.f343y == null) {
                        this.f343y = new g();
                    }
                    this.f342x.a(sVar.f374j, this.f343y);
                }
                sVar.f374j.d0();
                if (!f02.onCreatePanelMenu(sVar.f365a, sVar.f374j)) {
                    sVar.c((androidx.appcompat.view.menu.e) null);
                    if (z9 && (g0Var2 = this.f342x) != null) {
                        g0Var2.a((Menu) null, this.f343y);
                    }
                    return false;
                }
                sVar.f382r = false;
            }
            sVar.f374j.d0();
            Bundle bundle = sVar.f383s;
            if (bundle != null) {
                sVar.f374j.P(bundle);
                sVar.f383s = null;
            }
            if (!f02.onPreparePanel(0, sVar.f373i, sVar.f374j)) {
                if (z9 && (g0Var = this.f342x) != null) {
                    g0Var.a((Menu) null, this.f343y);
                }
                sVar.f374j.c0();
                return false;
            }
            boolean z10 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f380p = z10;
            sVar.f374j.setQwertyMode(z10);
            sVar.f374j.c0();
        }
        sVar.f377m = true;
        sVar.f378n = false;
        this.T = sVar;
        return true;
    }

    private void B0(boolean z9) {
        g0 g0Var = this.f342x;
        if (g0Var == null || !g0Var.g() || (ViewConfiguration.get(this.f335q).hasPermanentMenuKey() && !this.f342x.d())) {
            s d02 = d0(0, true);
            d02.f381q = true;
            O(d02, false);
            x0(d02, (KeyEvent) null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.f342x.b() && z9) {
            this.f342x.e();
            if (!this.X) {
                f02.onPanelClosed(108, d0(0, true).f374j);
            }
        } else if (f02 != null && !this.X) {
            if (this.f326f0 && (this.f327g0 & 1) != 0) {
                this.f336r.getDecorView().removeCallbacks(this.f328h0);
                this.f328h0.run();
            }
            s d03 = d0(0, true);
            androidx.appcompat.view.menu.e eVar = d03.f374j;
            if (eVar != null && !d03.f382r && f02.onPreparePanel(0, d03.f373i, eVar)) {
                f02.onMenuOpened(108, d03.f374j);
                this.f342x.f();
            }
        }
    }

    private int C0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f336r.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || x.O((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z9) {
        if (this.X) {
            return false;
        }
        int J2 = J();
        boolean J0 = J0(n0(this.f335q, J2), z9);
        if (J2 == 0) {
            c0(this.f335q).e();
        } else {
            o oVar = this.f324d0;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (J2 == 3) {
            b0(this.f335q).e();
        } else {
            o oVar2 = this.f325e0;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.H.findViewById(16908290);
        View decorView = this.f336r.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f335q.obtainStyledAttributes(f.j.f8709y0);
        obtainStyledAttributes.getValue(f.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f336r == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof m)) {
                m mVar = new m(callback);
                this.f337s = mVar;
                window.setCallback(mVar);
                a1 t9 = a1.t(this.f335q, (AttributeSet) null, f318p0);
                Drawable g10 = t9.g(0);
                if (g10 != null) {
                    window.setBackgroundDrawable(g10);
                }
                t9.v();
                this.f336r = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private c I0() {
        Context context = this.f335q;
        while (context != null) {
            if (!(context instanceof c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (c) context;
            }
        }
        return null;
    }

    private int J() {
        int i10 = this.Z;
        return i10 != -100 ? i10 : e.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f335q
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.res.Configuration r3 = r6.Y
            if (r3 != 0) goto L_0x0019
            android.content.Context r3 = r6.f335q
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L_0x0019:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x004b
            if (r8 == 0) goto L_0x004b
            if (r2 != 0) goto L_0x004b
            boolean r8 = r6.V
            if (r8 == 0) goto L_0x004b
            boolean r8 = f319q0
            if (r8 != 0) goto L_0x0034
            boolean r8 = r6.W
            if (r8 == 0) goto L_0x004b
        L_0x0034:
            java.lang.Object r8 = r6.f334p
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x004b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x004b
            java.lang.Object r8 = r6.f334p
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.r(r8)
            r8 = 1
            goto L_0x004c
        L_0x004b:
            r8 = 0
        L_0x004c:
            if (r8 != 0) goto L_0x0054
            if (r3 == r0) goto L_0x0054
            r6.K0(r0, r2, r1)
            goto L_0x0055
        L_0x0054:
            r4 = r8
        L_0x0055:
            if (r4 == 0) goto L_0x0062
            java.lang.Object r8 = r6.f334p
            boolean r0 = r8 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto L_0x0062
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.M(r7)
        L_0x0062:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.J0(int, boolean):boolean");
    }

    private void K0(int i10, boolean z9, Configuration configuration) {
        Resources resources = this.f335q.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            j.a(resources);
        }
        int i12 = this.f321a0;
        if (i12 != 0) {
            this.f335q.setTheme(i12);
            if (i11 >= 23) {
                this.f335q.getTheme().applyStyle(this.f321a0, true);
            }
        }
        if (z9) {
            Object obj = this.f334p;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.l) {
                    if (!((androidx.lifecycle.l) activity).a().b().isAtLeast(g.b.CREATED)) {
                        return;
                    }
                } else if (!this.W || this.X) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        o oVar = this.f324d0;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f325e0;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private void M0(View view) {
        int i10;
        Context context;
        if ((x.I(view) & 8192) != 0) {
            context = this.f335q;
            i10 = f.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f335q;
            i10 = f.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i10));
    }

    private Configuration P(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f335q.obtainStyledAttributes(f.j.f8709y0);
        int i10 = f.j.D0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(f.j.M0, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(f.j.E0, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
                z(10);
            }
            this.P = obtainStyledAttributes.getBoolean(f.j.f8714z0, false);
            obtainStyledAttributes.recycle();
            X();
            this.f336r.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f335q);
            if (this.Q) {
                viewGroup = (ViewGroup) from.inflate(this.O ? f.g.abc_screen_simple_overlay_action_mode : f.g.abc_screen_simple, (ViewGroup) null);
            } else if (this.P) {
                viewGroup = (ViewGroup) from.inflate(f.g.abc_dialog_title_material, (ViewGroup) null);
                this.N = false;
                this.M = false;
            } else if (this.M) {
                TypedValue typedValue = new TypedValue();
                this.f335q.getTheme().resolveAttribute(f.a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(this.f335q, typedValue.resourceId) : this.f335q).inflate(f.g.abc_screen_toolbar, (ViewGroup) null);
                g0 g0Var = (g0) viewGroup.findViewById(f.f.decor_content_parent);
                this.f342x = g0Var;
                g0Var.setWindowCallback(f0());
                if (this.N) {
                    this.f342x.k(109);
                }
                if (this.K) {
                    this.f342x.k(2);
                }
                if (this.L) {
                    this.f342x.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                x.s0(viewGroup, new b());
                if (this.f342x == null) {
                    this.I = (TextView) viewGroup.findViewById(f.f.M);
                }
                h1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f336r.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f336r.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.M + ", windowActionBarOverlay: " + this.N + ", android:windowIsFloating: " + this.P + ", windowActionModeOverlay: " + this.O + ", windowNoTitle: " + this.Q + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void W() {
        if (!this.G) {
            this.H = Q();
            CharSequence e02 = e0();
            if (!TextUtils.isEmpty(e02)) {
                g0 g0Var = this.f342x;
                if (g0Var != null) {
                    g0Var.setWindowTitle(e02);
                } else if (y0() != null) {
                    y0().t(e02);
                } else {
                    TextView textView = this.I;
                    if (textView != null) {
                        textView.setText(e02);
                    }
                }
            }
            H();
            w0(this.H);
            this.G = true;
            s d02 = d0(0, false);
            if (this.X) {
                return;
            }
            if (d02 == null || d02.f374j == null) {
                k0(108);
            }
        }
    }

    private void X() {
        if (this.f336r == null) {
            Object obj = this.f334p;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f336r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private o b0(Context context) {
        if (this.f325e0 == null) {
            this.f325e0 = new n(context);
        }
        return this.f325e0;
    }

    private o c0(Context context) {
        if (this.f324d0 == null) {
            this.f324d0 = new p(l.a(context));
        }
        return this.f324d0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g0() {
        /*
            r3 = this;
            r3.W()
            boolean r0 = r3.M
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f339u
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f334p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f334p
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.N
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f339u = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f334p
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f339u
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f329i0
            r0.r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.g0():void");
    }

    private boolean h0(s sVar) {
        View view = sVar.f373i;
        if (view != null) {
            sVar.f372h = view;
            return true;
        } else if (sVar.f374j == null) {
            return false;
        } else {
            if (this.f344z == null) {
                this.f344z = new t();
            }
            View view2 = (View) sVar.a(this.f344z);
            sVar.f372h = view2;
            return view2 != null;
        }
    }

    private boolean i0(s sVar) {
        sVar.d(a0());
        sVar.f371g = new r(sVar.f376l);
        sVar.f367c = 81;
        return true;
    }

    private boolean j0(s sVar) {
        Context context = this.f335q;
        int i10 = sVar.f365a;
        if ((i10 == 0 || i10 == 108) && this.f342x != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(f.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        sVar.c(eVar);
        return true;
    }

    private void k0(int i10) {
        this.f327g0 = (1 << i10) | this.f327g0;
        if (!this.f326f0) {
            x.b0(this.f336r.getDecorView(), this.f328h0);
            this.f326f0 = true;
        }
    }

    private boolean l0() {
        if (!this.f323c0 && (this.f334p instanceof Activity)) {
            PackageManager packageManager = this.f335q.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f335q, this.f334p.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.f322b0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f322b0 = false;
            }
        }
        this.f323c0 = true;
        return this.f322b0;
    }

    private boolean q0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s d02 = d0(i10, true);
        if (!d02.f379o) {
            return A0(d02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            j.b r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$s r2 = r4.d0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f342x
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f335q
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f342x
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.X
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.A0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.g0 r5 = r4.f342x
            boolean r0 = r5.f()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.g0 r5 = r4.f342x
            boolean r0 = r5.e()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f379o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f378n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f377m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f382r
            if (r5 == 0) goto L_0x005b
            r2.f377m = r1
            boolean r5 = r4.A0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.x0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.O(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f335q
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.t0(int, android.view.KeyEvent):boolean");
    }

    private void x0(s sVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (!sVar.f379o && !this.X) {
            if (sVar.f365a == 0) {
                if ((this.f335q.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback f02 = f0();
            if (f02 == null || f02.onMenuOpened(sVar.f365a, sVar.f374j)) {
                WindowManager windowManager = (WindowManager) this.f335q.getSystemService("window");
                if (windowManager != null && A0(sVar, keyEvent)) {
                    ViewGroup viewGroup = sVar.f371g;
                    if (viewGroup == null || sVar.f381q) {
                        if (viewGroup == null) {
                            if (!i0(sVar) || sVar.f371g == null) {
                                return;
                            }
                        } else if (sVar.f381q && viewGroup.getChildCount() > 0) {
                            sVar.f371g.removeAllViews();
                        }
                        if (!h0(sVar) || !sVar.b()) {
                            sVar.f381q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = sVar.f372h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        sVar.f371g.setBackgroundResource(sVar.f366b);
                        ViewParent parent = sVar.f372h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(sVar.f372h);
                        }
                        sVar.f371g.addView(sVar.f372h, layoutParams2);
                        if (!sVar.f372h.hasFocus()) {
                            sVar.f372h.requestFocus();
                        }
                    } else {
                        View view = sVar.f373i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i10 = -1;
                            sVar.f378n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, sVar.f368d, sVar.f369e, 1002, 8519680, -3);
                            layoutParams3.gravity = sVar.f367c;
                            layoutParams3.windowAnimations = sVar.f370f;
                            windowManager.addView(sVar.f371g, layoutParams3);
                            sVar.f379o = true;
                            return;
                        }
                    }
                    i10 = -2;
                    sVar.f378n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, sVar.f368d, sVar.f369e, 1002, 8519680, -3);
                    layoutParams32.gravity = sVar.f367c;
                    layoutParams32.windowAnimations = sVar.f370f;
                    windowManager.addView(sVar.f371g, layoutParams32);
                    sVar.f379o = true;
                    return;
                }
                return;
            }
            O(sVar, true);
        }
    }

    private boolean z0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z9 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f377m || A0(sVar, keyEvent)) && (eVar = sVar.f374j) != null) {
            z9 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z9 && (i11 & 1) == 0 && this.f342x == null) {
            O(sVar, true);
        }
        return z9;
    }

    public void A(int i10) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f335q).inflate(i10, viewGroup);
        this.f337s.a().onContentChanged();
    }

    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f337s.a().onContentChanged();
    }

    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f337s.a().onContentChanged();
    }

    public void D(int i10) {
        this.f321a0 = i10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D0() {
        /*
            r1 = this;
            boolean r0 = r1.G
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.H
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.x.P(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.D0():boolean");
    }

    public final void E(CharSequence charSequence) {
        this.f341w = charSequence;
        g0 g0Var = this.f342x;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
        } else if (y0() != null) {
            y0().t(charSequence);
        } else {
            TextView textView = this.I;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean F() {
        return G(true);
    }

    public j.b F0(b.a aVar) {
        d dVar;
        if (aVar != null) {
            j.b bVar = this.A;
            if (bVar != null) {
                bVar.c();
            }
            h hVar = new h(aVar);
            a m10 = m();
            if (m10 != null) {
                j.b u9 = m10.u(hVar);
                this.A = u9;
                if (!(u9 == null || (dVar = this.f338t) == null)) {
                    dVar.i(u9);
                }
            }
            if (this.A == null) {
                this.A = G0(hVar);
            }
            return this.A;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j.b G0(j.b.a r8) {
        /*
            r7 = this;
            r7.V()
            j.b r0 = r7.A
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.f.h
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$h r0 = new androidx.appcompat.app.f$h
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f338t
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.X
            if (r2 != 0) goto L_0x0022
            j.b r0 = r0.f(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.A = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.B
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.P
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f335q
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = f.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f335q
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            j.d r4 = new j.d
            android.content.Context r6 = r7.f335q
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f335q
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.B = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = f.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.C = r5
            r6 = 2
            androidx.core.widget.i.b(r5, r6)
            android.widget.PopupWindow r5 = r7.C
            androidx.appcompat.widget.ActionBarContextView r6 = r7.B
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.C
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = f.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.B
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.C
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$d r0 = new androidx.appcompat.app.f$d
            r0.<init>()
            r7.D = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.H
            int r4 = f.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.a0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.B = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.B
            if (r0 == 0) goto L_0x015b
            r7.V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.B
            r0.k()
            j.e r0 = new j.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.B
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.B
            android.widget.PopupWindow r6 = r7.C
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            r8.h(r0)
            r7.A = r0
            boolean r8 = r7.D0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            androidx.core.view.d0 r8 = androidx.core.view.x.c(r8)
            androidx.core.view.d0 r8 = r8.b(r0)
            r7.E = r8
            androidx.appcompat.app.f$e r0 = new androidx.appcompat.app.f$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.B
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.x.d0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.C
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f336r
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.D
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.A = r1
        L_0x015b:
            j.b r8 = r7.A
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.d r0 = r7.f338t
            if (r0 == 0) goto L_0x0166
            r0.i(r8)
        L_0x0166:
            j.b r8 = r7.A
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.G0(j.b$a):j.b");
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.S;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f374j;
            }
        }
        if ((sVar == null || sVar.f379o) && !this.X) {
            this.f337s.a().onPanelClosed(i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(androidx.appcompat.view.menu.e eVar) {
        if (!this.R) {
            this.R = true;
            this.f342x.l();
            Window.Callback f02 = f0();
            if (f02 != null && !this.X) {
                f02.onPanelClosed(108, eVar);
            }
            this.R = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final int L0(h0 h0Var, Rect rect) {
        boolean z9;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int i11 = 0;
        int k10 = h0Var != null ? h0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.B.getLayoutParams();
            boolean z11 = true;
            if (this.B.isShown()) {
                if (this.f330j0 == null) {
                    this.f330j0 = new Rect();
                    this.f331k0 = new Rect();
                }
                Rect rect2 = this.f330j0;
                Rect rect3 = this.f331k0;
                if (h0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(h0Var.i(), h0Var.k(), h0Var.j(), h0Var.h());
                }
                h1.a(this.H, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                h0 F2 = x.F(this.H);
                int i15 = F2 == null ? 0 : F2.i();
                int j10 = F2 == null ? 0 : F2.j();
                if (marginLayoutParams2.topMargin == i12 && marginLayoutParams2.leftMargin == i13 && marginLayoutParams2.rightMargin == i14) {
                    z10 = false;
                } else {
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    z10 = true;
                }
                if (i12 <= 0 || this.J != null) {
                    View view = this.J;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i10 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i15 && marginLayoutParams.rightMargin == j10))) {
                        marginLayoutParams.height = i10;
                        marginLayoutParams.leftMargin = i15;
                        marginLayoutParams.rightMargin = j10;
                        this.J.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f335q);
                    this.J = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i15;
                    layoutParams.rightMargin = j10;
                    this.H.addView(this.J, -1, layoutParams);
                }
                View view3 = this.J;
                if (view3 == null) {
                    z11 = false;
                }
                if (z11 && view3.getVisibility() != 0) {
                    M0(this.J);
                }
                if (!this.O && z11) {
                    k10 = 0;
                }
                z9 = z11;
                z11 = z10;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                z11 = false;
            }
            if (z11) {
                this.B.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.J;
        if (view4 != null) {
            if (!z9) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return k10;
    }

    /* access modifiers changed from: package-private */
    public void N(int i10) {
        O(d0(i10, true), true);
    }

    /* access modifiers changed from: package-private */
    public void O(s sVar, boolean z9) {
        ViewGroup viewGroup;
        g0 g0Var;
        if (!z9 || sVar.f365a != 0 || (g0Var = this.f342x) == null || !g0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f335q.getSystemService("window");
            if (!(windowManager == null || !sVar.f379o || (viewGroup = sVar.f371g) == null)) {
                windowManager.removeView(viewGroup);
                if (z9) {
                    K(sVar.f365a, sVar, (Menu) null);
                }
            }
            sVar.f377m = false;
            sVar.f378n = false;
            sVar.f379o = false;
            sVar.f372h = null;
            sVar.f381q = true;
            if (this.T == sVar) {
                this.T = null;
                return;
            }
            return;
        }
        L(sVar.f374j);
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z9;
        h hVar;
        boolean z10 = false;
        if (this.f332l0 == null) {
            String string = this.f335q.obtainStyledAttributes(f.j.f8709y0).getString(f.j.C0);
            if (string == null) {
                hVar = new h();
            } else {
                try {
                    this.f332l0 = (h) this.f335q.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new h();
                }
            }
            this.f332l0 = hVar;
        }
        boolean z11 = f317o0;
        if (z11) {
            if (this.f333m0 == null) {
                this.f333m0 = new i();
            }
            if (this.f333m0.a(attributeSet)) {
                z9 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z10 = E0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z10 = true;
                }
                z9 = z10;
            }
        } else {
            z9 = false;
        }
        return this.f332l0.createView(view, str, context, attributeSet, z9, z11, true, g1.c());
    }

    /* access modifiers changed from: package-private */
    public void S() {
        androidx.appcompat.view.menu.e eVar;
        g0 g0Var = this.f342x;
        if (g0Var != null) {
            g0Var.l();
        }
        if (this.C != null) {
            this.f336r.getDecorView().removeCallbacks(this.D);
            if (this.C.isShowing()) {
                try {
                    this.C.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.C = null;
        }
        V();
        s d02 = d0(0, false);
        if (d02 != null && (eVar = d02.f374j) != null) {
            eVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f334p;
        boolean z9 = true;
        if (((obj instanceof f.a) || (obj instanceof g)) && (decorView = this.f336r.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f337s.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z9 = false;
        }
        return z9 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        s d02;
        s d03 = d0(i10, true);
        if (d03.f374j != null) {
            Bundle bundle = new Bundle();
            d03.f374j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f383s = bundle;
            }
            d03.f374j.d0();
            d03.f374j.clear();
        }
        d03.f382r = true;
        d03.f381q = true;
        if ((i10 == 108 || i10 == 0) && this.f342x != null && (d02 = d0(0, false)) != null) {
            d02.f377m = false;
            A0(d02, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        d0 d0Var = this.E;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    /* access modifiers changed from: package-private */
    public s Y(Menu menu) {
        s[] sVarArr = this.S;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f374j == menu) {
                return sVar;
            }
        }
        return null;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s Y2;
        Window.Callback f02 = f0();
        if (f02 == null || this.X || (Y2 = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y2.f365a, menuItem);
    }

    /* access modifiers changed from: package-private */
    public final Context a0() {
        a m10 = m();
        Context k10 = m10 != null ? m10.k() : null;
        return k10 == null ? this.f335q : k10;
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.H.findViewById(16908290)).addView(view, layoutParams);
        this.f337s.a().onContentChanged();
    }

    /* access modifiers changed from: protected */
    public s d0(int i10, boolean z9) {
        s[] sVarArr = this.S;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[(i10 + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.S = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence e0() {
        Object obj = this.f334p;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f341w;
    }

    public Context f(Context context) {
        boolean z9 = true;
        this.V = true;
        int n02 = n0(context, J());
        Configuration configuration = null;
        if (f320r0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof j.d) {
            try {
                ((j.d) context).a(P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f319q0) {
            return super.f(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = i.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = Z(configuration3, configuration4);
        }
        Configuration P2 = P(context, n02, configuration);
        j.d dVar = new j.d(context, f.i.Theme_AppCompat_Empty);
        dVar.a(P2);
        boolean z10 = false;
        try {
            if (context.getTheme() == null) {
                z9 = false;
            }
            z10 = z9;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.f.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback f0() {
        return this.f336r.getCallback();
    }

    public <T extends View> T i(int i10) {
        W();
        return this.f336r.findViewById(i10);
    }

    public int k() {
        return this.Z;
    }

    public MenuInflater l() {
        if (this.f340v == null) {
            g0();
            a aVar = this.f339u;
            this.f340v = new j.g(aVar != null ? aVar.k() : this.f335q);
        }
        return this.f340v;
    }

    public a m() {
        g0();
        return this.f339u;
    }

    public boolean m0() {
        return this.F;
    }

    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f335q);
        if (from.getFactory() == null) {
            androidx.core.view.g.a(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    public int n0(Context context, int i10) {
        o c02;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        c02 = b0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                c02 = c0(context);
            }
            return c02.c();
        }
        return i10;
    }

    public void o() {
        if (y0() != null && !m().l()) {
            k0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o0() {
        j.b bVar = this.A;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a m10 = m();
        return m10 != null && m10.h();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void p(Configuration configuration) {
        a m10;
        if (this.M && this.G && (m10 = m()) != null) {
            m10.m(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f335q);
        this.Y = new Configuration(this.f335q.getResources().getConfiguration());
        G(false);
    }

    /* access modifiers changed from: package-private */
    public boolean p0(int i10, KeyEvent keyEvent) {
        boolean z9 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z9 = false;
            }
            this.U = z9;
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void q(Bundle bundle) {
        this.V = true;
        G(false);
        X();
        Object obj = this.f334p;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a y02 = y0();
                if (y02 == null) {
                    this.f329i0 = true;
                } else {
                    y02.r(true);
                }
            }
            e.c(this);
        }
        this.Y = new Configuration(this.f335q.getResources().getConfiguration());
        this.W = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f334p
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.e.x(r3)
        L_0x0009:
            boolean r0 = r3.f326f0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f336r
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f328h0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.X = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f334p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            p.g<java.lang.String, java.lang.Integer> r0 = f316n0
            java.lang.Object r1 = r3.f334p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            p.g<java.lang.String, java.lang.Integer> r0 = f316n0
            java.lang.Object r1 = r3.f334p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f339u
            if (r0 == 0) goto L_0x005b
            r0.n()
        L_0x005b:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.r():void");
    }

    /* access modifiers changed from: package-private */
    public boolean r0(int i10, KeyEvent keyEvent) {
        a m10 = m();
        if (m10 != null && m10.o(i10, keyEvent)) {
            return true;
        }
        s sVar = this.T;
        if (sVar == null || !z0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.T == null) {
                s d02 = d0(0, true);
                A0(d02, keyEvent);
                boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
                d02.f377m = false;
                if (z02) {
                    return true;
                }
            }
            return false;
        }
        s sVar2 = this.T;
        if (sVar2 != null) {
            sVar2.f378n = true;
        }
        return true;
    }

    public void s(Bundle bundle) {
        W();
    }

    /* access modifiers changed from: package-private */
    public boolean s0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z9 = this.U;
            this.U = false;
            s d02 = d0(0, false);
            if (d02 != null && d02.f379o) {
                if (!z9) {
                    O(d02, true);
                }
                return true;
            } else if (o0()) {
                return true;
            }
        } else if (i10 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void t() {
        a m10 = m();
        if (m10 != null) {
            m10.s(true);
        }
    }

    public void u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void u0(int i10) {
        a m10;
        if (i10 == 108 && (m10 = m()) != null) {
            m10.i(true);
        }
    }

    public void v() {
        F();
    }

    /* access modifiers changed from: package-private */
    public void v0(int i10) {
        if (i10 == 108) {
            a m10 = m();
            if (m10 != null) {
                m10.i(false);
            }
        } else if (i10 == 0) {
            s d02 = d0(i10, true);
            if (d02.f379o) {
                O(d02, false);
            }
        }
    }

    public void w() {
        a m10 = m();
        if (m10 != null) {
            m10.s(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void w0(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    public final a y0() {
        return this.f339u;
    }

    public boolean z(int i10) {
        int C0 = C0(i10);
        if (this.Q && C0 == 108) {
            return false;
        }
        if (this.M && C0 == 1) {
            this.M = false;
        }
        if (C0 == 1) {
            H0();
            this.Q = true;
            return true;
        } else if (C0 == 2) {
            H0();
            this.K = true;
            return true;
        } else if (C0 == 5) {
            H0();
            this.L = true;
            return true;
        } else if (C0 == 10) {
            H0();
            this.O = true;
            return true;
        } else if (C0 == 108) {
            H0();
            this.M = true;
            return true;
        } else if (C0 != 109) {
            return this.f336r.requestFeature(C0);
        } else {
            H0();
            this.N = true;
            return true;
        }
    }
}
