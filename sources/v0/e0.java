package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import v0.l;

public abstract class e0 extends l {
    private static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    private int V = 3;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f12616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12617b;

        a(u uVar, View view) {
            this.f12616a = uVar;
            this.f12617b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f12616a.c(this.f12617b);
        }
    }

    private static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f12619a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12620b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f12621c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12622d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12623e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12624f = false;

        b(View view, int i10, boolean z9) {
            this.f12619a = view;
            this.f12620b = i10;
            this.f12621c = (ViewGroup) view.getParent();
            this.f12622d = z9;
            f(true);
        }

        private void e() {
            if (!this.f12624f) {
                z.i(this.f12619a, this.f12620b);
                ViewGroup viewGroup = this.f12621c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        private void f(boolean z9) {
            ViewGroup viewGroup;
            if (this.f12622d && this.f12623e != z9 && (viewGroup = this.f12621c) != null) {
                this.f12623e = z9;
                v.b(viewGroup, z9);
            }
        }

        public void a(l lVar) {
            f(false);
        }

        public void b(l lVar) {
            f(true);
        }

        public void c(l lVar) {
            e();
            lVar.V(this);
        }

        public void d(l lVar) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f12624f = true;
        }

        public void onAnimationEnd(Animator animator) {
            e();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f12624f) {
                z.i(this.f12619a, this.f12620b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f12624f) {
                z.i(this.f12619a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f12625a;

        /* renamed from: b  reason: collision with root package name */
        boolean f12626b;

        /* renamed from: c  reason: collision with root package name */
        int f12627c;

        /* renamed from: d  reason: collision with root package name */
        int f12628d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f12629e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f12630f;

        c() {
        }
    }

    private void i0(r rVar) {
        rVar.f12670a.put("android:visibility:visibility", Integer.valueOf(rVar.f12671b.getVisibility()));
        rVar.f12670a.put("android:visibility:parent", rVar.f12671b.getParent());
        int[] iArr = new int[2];
        rVar.f12671b.getLocationOnScreen(iArr);
        rVar.f12670a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f12629e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f12627c == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private v0.e0.c j0(v0.r r8, v0.r r9) {
        /*
            r7 = this;
            v0.e0$c r0 = new v0.e0$c
            r0.<init>()
            r1 = 0
            r0.f12625a = r1
            r0.f12626b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f12670a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f12670a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f12627c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f12670a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f12629e = r6
            goto L_0x0037
        L_0x0033:
            r0.f12627c = r4
            r0.f12629e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f12670a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f12670a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f12628d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f12670a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f12630f = r2
            goto L_0x005e
        L_0x005a:
            r0.f12628d = r4
            r0.f12630f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f12627c
            int r9 = r0.f12628d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f12629e
            android.view.ViewGroup r4 = r0.f12630f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f12630f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f12629e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f12628d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f12626b = r2
        L_0x008a:
            r0.f12625a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f12627c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f12626b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e0.j0(v0.r, v0.r):v0.e0$c");
    }

    public String[] J() {
        return W;
    }

    public boolean L(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f12670a.containsKey("android:visibility:visibility") != rVar.f12670a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c j02 = j0(rVar, rVar2);
        if (j02.f12625a) {
            return j02.f12627c == 0 || j02.f12628d == 0;
        }
        return false;
    }

    public void i(r rVar) {
        i0(rVar);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public Animator l0(ViewGroup viewGroup, r rVar, int i10, r rVar2, int i11) {
        if ((this.V & 1) != 1 || rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            View view = (View) rVar2.f12671b.getParent();
            if (j0(z(view, false), K(view, false)).f12625a) {
                return null;
            }
        }
        return k0(viewGroup, rVar2.f12671b, rVar, rVar2);
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator n0(android.view.ViewGroup r7, v0.r r8, int r9, v0.r r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.V
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f12671b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f12671b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0026
        L_0x0024:
            r9 = r1
            goto L_0x007f
        L_0x0026:
            boolean r2 = r6.I
            if (r2 == 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
        L_0x0031:
            android.view.View r9 = v0.q.a(r7, r9, r2)
            goto L_0x0039
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r9 = r2
        L_0x0039:
            r2 = r1
            goto L_0x007f
        L_0x003b:
            if (r9 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            goto L_0x0039
        L_0x0044:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            v0.r r4 = r6.K(r2, r3)
            v0.r r5 = r6.z(r2, r3)
            v0.e0$c r4 = r6.j0(r4, r5)
            boolean r4 = r4.f12625a
            if (r4 != 0) goto L_0x0063
            goto L_0x0031
        L_0x0063:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x007b
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x007b
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x007b
            boolean r2 = r6.I
            if (r2 == 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r9 = r1
            goto L_0x0039
        L_0x007d:
            r9 = r1
            r2 = r9
        L_0x007f:
            r4 = 0
            if (r9 == 0) goto L_0x00c7
            if (r8 == 0) goto L_0x00c7
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f12670a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            v0.u r11 = v0.v.a(r7)
            r11.a(r9)
            android.animation.Animator r7 = r6.m0(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00be
            r11.c(r9)
            goto L_0x00c6
        L_0x00be:
            v0.e0$a r8 = new v0.e0$a
            r8.<init>(r11, r9)
            r7.addListener(r8)
        L_0x00c6:
            return r7
        L_0x00c7:
            if (r2 == 0) goto L_0x00e9
            int r9 = r2.getVisibility()
            v0.z.i(r2, r4)
            android.animation.Animator r7 = r6.m0(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00e5
            v0.e0$b r8 = new v0.e0$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            v0.a.a(r7, r8)
            r6.b(r8)
            goto L_0x00e8
        L_0x00e5:
            v0.z.i(r2, r9)
        L_0x00e8:
            return r7
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e0.n0(android.view.ViewGroup, v0.r, int, v0.r, int):android.animation.Animator");
    }

    public void o0(int i10) {
        if ((i10 & -4) == 0) {
            this.V = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void p(r rVar) {
        i0(rVar);
    }

    public Animator t(ViewGroup viewGroup, r rVar, r rVar2) {
        c j02 = j0(rVar, rVar2);
        if (!j02.f12625a) {
            return null;
        }
        if (j02.f12629e == null && j02.f12630f == null) {
            return null;
        }
        if (j02.f12626b) {
            return l0(viewGroup, rVar, j02.f12627c, rVar2, j02.f12628d);
        }
        return n0(viewGroup, rVar, j02.f12627c, rVar2, j02.f12628d);
    }
}
