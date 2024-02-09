package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.x;
import androidx.core.view.z;

class e1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: v  reason: collision with root package name */
    private static e1 f880v;

    /* renamed from: w  reason: collision with root package name */
    private static e1 f881w;

    /* renamed from: m  reason: collision with root package name */
    private final View f882m;

    /* renamed from: n  reason: collision with root package name */
    private final CharSequence f883n;

    /* renamed from: o  reason: collision with root package name */
    private final int f884o;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f885p = new a();

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f886q = new b();

    /* renamed from: r  reason: collision with root package name */
    private int f887r;

    /* renamed from: s  reason: collision with root package name */
    private int f888s;

    /* renamed from: t  reason: collision with root package name */
    private f1 f889t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f890u;

    class a implements Runnable {
        a() {
        }

        public void run() {
            e1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            e1.this.c();
        }
    }

    private e1(View view, CharSequence charSequence) {
        this.f882m = view;
        this.f883n = charSequence;
        this.f884o = z.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f882m.removeCallbacks(this.f885p);
    }

    private void b() {
        this.f887r = Integer.MAX_VALUE;
        this.f888s = Integer.MAX_VALUE;
    }

    private void d() {
        this.f882m.postDelayed(this.f885p, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(e1 e1Var) {
        e1 e1Var2 = f880v;
        if (e1Var2 != null) {
            e1Var2.a();
        }
        f880v = e1Var;
        if (e1Var != null) {
            e1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        e1 e1Var = f880v;
        if (e1Var != null && e1Var.f882m == view) {
            e((e1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            e1 e1Var2 = f881w;
            if (e1Var2 != null && e1Var2.f882m == view) {
                e1Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new e1(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        if (Math.abs(x9 - this.f887r) <= this.f884o && Math.abs(y9 - this.f888s) <= this.f884o) {
            return false;
        }
        this.f887r = x9;
        this.f888s = y9;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (f881w == this) {
            f881w = null;
            f1 f1Var = this.f889t;
            if (f1Var != null) {
                f1Var.c();
                this.f889t = null;
                b();
                this.f882m.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f880v == this) {
            e((e1) null);
        }
        this.f882m.removeCallbacks(this.f886q);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z9) {
        long j10;
        if (x.O(this.f882m)) {
            e((e1) null);
            e1 e1Var = f881w;
            if (e1Var != null) {
                e1Var.c();
            }
            f881w = this;
            this.f890u = z9;
            f1 f1Var = new f1(this.f882m.getContext());
            this.f889t = f1Var;
            f1Var.e(this.f882m, this.f887r, this.f888s, this.f890u, this.f883n);
            this.f882m.addOnAttachStateChangeListener(this);
            if (this.f890u) {
                j10 = 2500;
            } else {
                j10 = ((x.I(this.f882m) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f882m.removeCallbacks(this.f886q);
            this.f882m.postDelayed(this.f886q, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f889t != null && this.f890u) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f882m.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f882m.isEnabled() && this.f889t == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f887r = view.getWidth() / 2;
        this.f888s = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
