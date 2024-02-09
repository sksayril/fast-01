package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.e;

public abstract class l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: m  reason: collision with root package name */
    private final float f962m;

    /* renamed from: n  reason: collision with root package name */
    private final int f963n;

    /* renamed from: o  reason: collision with root package name */
    private final int f964o;

    /* renamed from: p  reason: collision with root package name */
    final View f965p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f966q;

    /* renamed from: r  reason: collision with root package name */
    private Runnable f967r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f968s;

    /* renamed from: t  reason: collision with root package name */
    private int f969t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f970u = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = l0.this.f965p.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            l0.this.e();
        }
    }

    public l0(View view) {
        this.f965p = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f962m = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f963n = tapTimeout;
        this.f964o = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f967r;
        if (runnable != null) {
            this.f965p.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f966q;
        if (runnable2 != null) {
            this.f965p.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        j0 j0Var;
        View view = this.f965p;
        e b10 = b();
        if (b10 == null || !b10.c() || (j0Var = (j0) b10.h()) == null || !j0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(j0Var, obtainNoHistory);
        boolean e10 = j0Var.e(obtainNoHistory, this.f969t);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f965p
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f969t
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f962m
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f969t = r6
            java.lang.Runnable r6 = r5.f966q
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.l0$a r6 = new androidx.appcompat.widget.l0$a
            r6.<init>()
            r5.f966q = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f966q
            int r1 = r5.f963n
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f967r
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.l0$b r6 = new androidx.appcompat.widget.l0$b
            r6.<init>()
            r5.f967r = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f967r
            int r1 = r5.f964o
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f970u;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f970u;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract e b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        e b10 = b();
        if (b10 == null || !b10.c()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f965p;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f968s = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = this.f968s;
        if (z10) {
            z9 = f(motionEvent) || !d();
        } else {
            z9 = g(motionEvent) && c();
            if (z9) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f965p.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f968s = z9;
        return z9 || z10;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f968s = false;
        this.f969t = -1;
        Runnable runnable = this.f966q;
        if (runnable != null) {
            this.f965p.removeCallbacks(runnable);
        }
    }
}
