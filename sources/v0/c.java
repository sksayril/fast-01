package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x;
import java.util.Map;

public class c extends l {
    private static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> Z = new b(PointF.class, "boundsOrigin");

    /* renamed from: a0  reason: collision with root package name */
    private static final Property<k, PointF> f12564a0 = new C0215c(PointF.class, "topLeft");

    /* renamed from: b0  reason: collision with root package name */
    private static final Property<k, PointF> f12565b0 = new d(PointF.class, "bottomRight");

    /* renamed from: c0  reason: collision with root package name */
    private static final Property<View, PointF> f12566c0 = new e(PointF.class, "bottomRight");

    /* renamed from: d0  reason: collision with root package name */
    private static final Property<View, PointF> f12567d0 = new f(PointF.class, "topLeft");

    /* renamed from: e0  reason: collision with root package name */
    private static final Property<View, PointF> f12568e0 = new g(PointF.class, "position");

    /* renamed from: f0  reason: collision with root package name */
    private static j f12569f0 = new j();
    private int[] V = new int[2];
    private boolean W = false;
    private boolean X = false;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f12571b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f12573d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f12570a = viewGroup;
            this.f12571b = bitmapDrawable;
            this.f12572c = view;
            this.f12573d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            z.c(this.f12570a).d(this.f12571b);
            z.h(this.f12572c, this.f12573d);
        }
    }

    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f12575a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f12575a);
            Rect rect = this.f12575a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f12575a);
            this.f12575a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f12575a);
        }
    }

    /* renamed from: v0.c$c  reason: collision with other inner class name */
    static class C0215c extends Property<k, PointF> {
        C0215c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            z.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            z.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            z.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f12576a;
        private k mViewBounds;

        h(k kVar) {
            this.f12576a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f12580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12582e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f12583f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f12584g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f12579b = view;
            this.f12580c = rect;
            this.f12581d = i10;
            this.f12582e = i11;
            this.f12583f = i12;
            this.f12584g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12578a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f12578a) {
                x.m0(this.f12579b, this.f12580c);
                z.g(this.f12579b, this.f12581d, this.f12582e, this.f12583f, this.f12584g);
            }
        }
    }

    class j extends m {

        /* renamed from: a  reason: collision with root package name */
        boolean f12586a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12587b;

        j(ViewGroup viewGroup) {
            this.f12587b = viewGroup;
        }

        public void a(l lVar) {
            v.b(this.f12587b, false);
        }

        public void b(l lVar) {
            v.b(this.f12587b, true);
        }

        public void c(l lVar) {
            if (!this.f12586a) {
                v.b(this.f12587b, false);
            }
            lVar.V(this);
        }
    }

    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f12589a;

        /* renamed from: b  reason: collision with root package name */
        private int f12590b;

        /* renamed from: c  reason: collision with root package name */
        private int f12591c;

        /* renamed from: d  reason: collision with root package name */
        private int f12592d;

        /* renamed from: e  reason: collision with root package name */
        private View f12593e;

        /* renamed from: f  reason: collision with root package name */
        private int f12594f;

        /* renamed from: g  reason: collision with root package name */
        private int f12595g;

        k(View view) {
            this.f12593e = view;
        }

        private void b() {
            z.g(this.f12593e, this.f12589a, this.f12590b, this.f12591c, this.f12592d);
            this.f12594f = 0;
            this.f12595g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f12591c = Math.round(pointF.x);
            this.f12592d = Math.round(pointF.y);
            int i10 = this.f12595g + 1;
            this.f12595g = i10;
            if (this.f12594f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f12589a = Math.round(pointF.x);
            this.f12590b = Math.round(pointF.y);
            int i10 = this.f12594f + 1;
            this.f12594f = i10;
            if (i10 == this.f12595g) {
                b();
            }
        }
    }

    private void i0(r rVar) {
        View view = rVar.f12671b;
        if (x.P(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            rVar.f12670a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            rVar.f12670a.put("android:changeBounds:parent", rVar.f12671b.getParent());
            if (this.X) {
                rVar.f12671b.getLocationInWindow(this.V);
                rVar.f12670a.put("android:changeBounds:windowX", Integer.valueOf(this.V[0]));
                rVar.f12670a.put("android:changeBounds:windowY", Integer.valueOf(this.V[1]));
            }
            if (this.W) {
                rVar.f12670a.put("android:changeBounds:clip", x.r(view));
            }
        }
    }

    private boolean j0(View view, View view2) {
        if (!this.X) {
            return true;
        }
        r z9 = z(view, true);
        if (z9 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == z9.f12671b) {
            return true;
        }
        return false;
    }

    public String[] J() {
        return Y;
    }

    public void i(r rVar) {
        i0(rVar);
    }

    public void p(r rVar) {
        i0(rVar);
    }

    public Animator t(ViewGroup viewGroup, r rVar, r rVar2) {
        int i10;
        View view;
        Animator animator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        if (rVar3 == null || rVar4 == null) {
            return null;
        }
        Map<String, Object> map = rVar3.f12670a;
        Map<String, Object> map2 = rVar4.f12670a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = rVar4.f12671b;
        if (j0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) rVar3.f12670a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) rVar4.f12670a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect4 = (Rect) rVar3.f12670a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) rVar4.f12670a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.W) {
                view = view3;
                z.g(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        path = B().a((float) i12, (float) i14, (float) i13, (float) i15);
                        property = f12568e0;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a10 = f.a(kVar, f12564a0, B().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a11 = f.a(kVar, f12565b0, B().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a10, a11});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    path = B().a((float) i16, (float) i18, (float) i17, (float) i19);
                    property = f12566c0;
                } else {
                    path = B().a((float) i12, (float) i14, (float) i13, (float) i15);
                    property = f12567d0;
                }
                animator = f.a(view, property, path);
            } else {
                view = view3;
                z.g(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : f.a(view, f12568e0, B().a((float) i12, (float) i14, (float) i13, (float) i15));
                if (rect7 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i11, i11, i22, i23) : rect6;
                if (!rect.equals(rect8)) {
                    x.m0(view, rect);
                    j jVar = f12569f0;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                    ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = q.c(a12, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                v.b(viewGroup4, true);
                b(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) rVar3.f12670a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) rVar3.f12670a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) rVar4.f12670a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) rVar4.f12670a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.V);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float d10 = z.d(view2);
        z.h(view2, 0.0f);
        z.c(viewGroup).b(bitmapDrawable);
        g B = B();
        int[] iArr = this.V;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{h.a(Z, B.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, d10));
        return ofPropertyValuesHolder;
    }
}
