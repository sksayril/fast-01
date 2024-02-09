package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import x.a;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    x.a f6876a;

    /* renamed from: b  reason: collision with root package name */
    b f6877b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6878c;

    /* renamed from: d  reason: collision with root package name */
    private float f6879d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6880e;

    /* renamed from: f  reason: collision with root package name */
    int f6881f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f6882g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f6883h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f6884i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final a.c f6885j = new a();

    class a extends a.c {

        /* renamed from: a  reason: collision with root package name */
        private int f6886a;

        /* renamed from: b  reason: collision with root package name */
        private int f6887b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = androidx.core.view.x.z(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f6881f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f6886a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f6882g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.n(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f6886a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.x.z(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6881f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f6886a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6886a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f6886a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f6886a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6886a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.F(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i10) {
            this.f6887b = i10;
            this.f6886a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i10) {
            b bVar = SwipeDismissBehavior.this.f6877b;
            if (bVar != null) {
                bVar.b(i10);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) this.f6886a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6883h);
            float width2 = ((float) this.f6886a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6884i);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.E(0.0f, 1.0f - SwipeDismissBehavior.H(width, width2, f10), 1.0f));
            }
        }

        public void l(View view, float f10, float f11) {
            boolean z9;
            int i10;
            b bVar;
            this.f6887b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f6886a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z9 = true;
            } else {
                i10 = this.f6886a;
                z9 = false;
            }
            if (SwipeDismissBehavior.this.f6876a.F(i10, view.getTop())) {
                x.b0(view, new c(view, z9));
            } else if (z9 && (bVar = SwipeDismissBehavior.this.f6877b) != null) {
                bVar.a(view);
            }
        }

        public boolean m(View view, int i10) {
            return this.f6887b == -1 && SwipeDismissBehavior.this.D(view);
        }
    }

    public interface b {
        void a(View view);

        void b(int i10);
    }

    private class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final View f6889m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f6890n;

        c(View view, boolean z9) {
            this.f6889m = view;
            this.f6890n = z9;
        }

        public void run() {
            b bVar;
            x.a aVar = SwipeDismissBehavior.this.f6876a;
            if (aVar != null && aVar.k(true)) {
                x.b0(this.f6889m, this);
            } else if (this.f6890n && (bVar = SwipeDismissBehavior.this.f6877b) != null) {
                bVar.a(this.f6889m);
            }
        }
    }

    static float E(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int F(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void G(ViewGroup viewGroup) {
        if (this.f6876a == null) {
            this.f6876a = this.f6880e ? x.a.l(viewGroup, this.f6879d, this.f6885j) : x.a.m(viewGroup, this.f6885j);
        }
    }

    static float H(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    public boolean C(CoordinatorLayout coordinatorLayout, V v9, MotionEvent motionEvent) {
        x.a aVar = this.f6876a;
        if (aVar == null) {
            return false;
        }
        aVar.z(motionEvent);
        return true;
    }

    public boolean D(View view) {
        return true;
    }

    public void I(float f10) {
        this.f6884i = E(0.0f, f10, 1.0f);
    }

    public void J(float f10) {
        this.f6883h = E(0.0f, f10, 1.0f);
    }

    public void K(int i10) {
        this.f6881f = i10;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v9, MotionEvent motionEvent) {
        boolean z9 = this.f6878c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z9 = coordinatorLayout.B(v9, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6878c = z9;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6878c = false;
        }
        if (!z9) {
            return false;
        }
        G(coordinatorLayout);
        return this.f6876a.G(motionEvent);
    }
}
