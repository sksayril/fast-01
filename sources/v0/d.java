package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.x;

public class d extends e0 {

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f12598a;

        a(View view) {
            this.f12598a = view;
        }

        public void c(l lVar) {
            z.h(this.f12598a, 1.0f);
            z.a(this.f12598a);
            lVar.V(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f12600a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12601b = false;

        b(View view) {
            this.f12600a = view;
        }

        public void onAnimationEnd(Animator animator) {
            z.h(this.f12600a, 1.0f);
            if (this.f12601b) {
                this.f12600a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (x.L(this.f12600a) && this.f12600a.getLayerType() == 0) {
                this.f12601b = true;
                this.f12600a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i10) {
        o0(i10);
    }

    private Animator p0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        z.h(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f12684d, new float[]{f11});
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f12670a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float q0(v0.r r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f12670a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.q0(v0.r, float):float");
    }

    public Animator k0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        float f10 = 0.0f;
        float q02 = q0(rVar, 0.0f);
        if (q02 != 1.0f) {
            f10 = q02;
        }
        return p0(view, f10, 1.0f);
    }

    public Animator m0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        z.f(view);
        return p0(view, q0(rVar, 1.0f), 0.0f);
    }

    public void p(r rVar) {
        super.p(rVar);
        rVar.f12670a.put("android:fade:transitionAlpha", Float.valueOf(z.d(rVar.f12671b)));
    }
}
