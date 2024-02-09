package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.x;
import androidx.recyclerview.widget.i;

class d extends i.m implements i.r {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final i.s C;

    /* renamed from: a  reason: collision with root package name */
    private final int f3013a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3014b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f3015c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f3016d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3017e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3018f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f3019g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f3020h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3021i;

    /* renamed from: j  reason: collision with root package name */
    private final int f3022j;

    /* renamed from: k  reason: collision with root package name */
    int f3023k;

    /* renamed from: l  reason: collision with root package name */
    int f3024l;

    /* renamed from: m  reason: collision with root package name */
    float f3025m;

    /* renamed from: n  reason: collision with root package name */
    int f3026n;

    /* renamed from: o  reason: collision with root package name */
    int f3027o;

    /* renamed from: p  reason: collision with root package name */
    float f3028p;

    /* renamed from: q  reason: collision with root package name */
    private int f3029q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f3030r = 0;

    /* renamed from: s  reason: collision with root package name */
    private i f3031s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3032t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3033u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f3034v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f3035w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f3036x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f3037y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f3038z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            d.this.o(500);
        }
    }

    class b extends i.s {
        b() {
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3041a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3041a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3041a) {
                this.f3041a = false;
            } else if (((Float) d.this.f3038z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.w(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    private class C0061d implements ValueAnimator.AnimatorUpdateListener {
        C0061d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3015c.setAlpha(floatValue);
            d.this.f3016d.setAlpha(floatValue);
            d.this.t();
        }
    }

    d(i iVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3038z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3015c = stateListDrawable;
        this.f3016d = drawable;
        this.f3019g = stateListDrawable2;
        this.f3020h = drawable2;
        this.f3017e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3018f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3021i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3022j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3013a = i11;
        this.f3014b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0061d());
        h(iVar);
    }

    private void i() {
        this.f3031s.removeCallbacks(this.B);
    }

    private void j() {
        this.f3031s.q0(this);
        this.f3031s.r0(this);
        this.f3031s.s0(this.C);
        i();
    }

    private void k(Canvas canvas) {
        int i10 = this.f3030r;
        int i11 = this.f3021i;
        int i12 = i10 - i11;
        int i13 = this.f3027o;
        int i14 = this.f3026n;
        int i15 = i13 - (i14 / 2);
        this.f3019g.setBounds(0, 0, i14, i11);
        this.f3020h.setBounds(0, 0, this.f3029q, this.f3022j);
        canvas.translate(0.0f, (float) i12);
        this.f3020h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f3019g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    private void l(Canvas canvas) {
        int i10 = this.f3029q;
        int i11 = this.f3017e;
        int i12 = i10 - i11;
        int i13 = this.f3024l;
        int i14 = this.f3023k;
        int i15 = i13 - (i14 / 2);
        this.f3015c.setBounds(0, 0, i11, i14);
        this.f3016d.setBounds(0, 0, this.f3018f, this.f3030r);
        if (q()) {
            this.f3016d.draw(canvas);
            canvas.translate((float) this.f3017e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f3015c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i12 = this.f3017e;
        } else {
            canvas.translate((float) i12, 0.0f);
            this.f3016d.draw(canvas);
            canvas.translate(0.0f, (float) i15);
            this.f3015c.draw(canvas);
        }
        canvas.translate((float) (-i12), (float) (-i15));
    }

    private int[] m() {
        int[] iArr = this.f3037y;
        int i10 = this.f3014b;
        iArr[0] = i10;
        iArr[1] = this.f3029q - i10;
        return iArr;
    }

    private int[] n() {
        int[] iArr = this.f3036x;
        int i10 = this.f3014b;
        iArr[0] = i10;
        iArr[1] = this.f3030r - i10;
        return iArr;
    }

    private void p(float f10) {
        int[] m10 = m();
        float max = Math.max((float) m10[0], Math.min((float) m10[1], f10));
        if (Math.abs(((float) this.f3027o) - max) >= 2.0f) {
            int v9 = v(this.f3028p, max, m10, this.f3031s.computeHorizontalScrollRange(), this.f3031s.computeHorizontalScrollOffset(), this.f3029q);
            if (v9 != 0) {
                this.f3031s.scrollBy(v9, 0);
            }
            this.f3028p = max;
        }
    }

    private boolean q() {
        return x.z(this.f3031s) == 1;
    }

    private void u(int i10) {
        i();
        this.f3031s.postDelayed(this.B, (long) i10);
    }

    private int v(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void x() {
        this.f3031s.e(this);
        this.f3031s.g(this);
        this.f3031s.h(this.C);
    }

    private void z(float f10) {
        int[] n10 = n();
        float max = Math.max((float) n10[0], Math.min((float) n10[1], f10));
        if (Math.abs(((float) this.f3024l) - max) >= 2.0f) {
            int v9 = v(this.f3025m, max, n10, this.f3031s.computeVerticalScrollRange(), this.f3031s.computeVerticalScrollOffset(), this.f3030r);
            if (v9 != 0) {
                this.f3031s.scrollBy(0, v9);
            }
            this.f3025m = max;
        }
    }

    public boolean a(i iVar, MotionEvent motionEvent) {
        int i10 = this.f3034v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean s9 = s(motionEvent.getX(), motionEvent.getY());
        boolean r9 = r(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!s9 && !r9) {
            return false;
        }
        if (r9) {
            this.f3035w = 1;
            this.f3028p = (float) ((int) motionEvent.getX());
        } else if (s9) {
            this.f3035w = 2;
            this.f3025m = (float) ((int) motionEvent.getY());
        }
        w(2);
    }

    public void b(i iVar, MotionEvent motionEvent) {
        if (this.f3034v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean s9 = s(motionEvent.getX(), motionEvent.getY());
                boolean r9 = r(motionEvent.getX(), motionEvent.getY());
                if (s9 || r9) {
                    if (r9) {
                        this.f3035w = 1;
                        this.f3028p = (float) ((int) motionEvent.getX());
                    } else if (s9) {
                        this.f3035w = 2;
                        this.f3025m = (float) ((int) motionEvent.getY());
                    }
                    w(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3034v == 2) {
                this.f3025m = 0.0f;
                this.f3028p = 0.0f;
                w(1);
                this.f3035w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3034v == 2) {
                y();
                if (this.f3035w == 1) {
                    p(motionEvent.getX());
                }
                if (this.f3035w == 2) {
                    z(motionEvent.getY());
                }
            }
        }
    }

    public void c(boolean z9) {
    }

    public void g(Canvas canvas, i iVar, i.y yVar) {
        if (this.f3029q != this.f3031s.getWidth() || this.f3030r != this.f3031s.getHeight()) {
            this.f3029q = this.f3031s.getWidth();
            this.f3030r = this.f3031s.getHeight();
            w(0);
        } else if (this.A != 0) {
            if (this.f3032t) {
                l(canvas);
            }
            if (this.f3033u) {
                k(canvas);
            }
        }
    }

    public void h(i iVar) {
        i iVar2 = this.f3031s;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                j();
            }
            this.f3031s = iVar;
            if (iVar != null) {
                x();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3038z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3038z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3038z.setDuration((long) i10);
        this.f3038z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean r(float f10, float f11) {
        if (f11 >= ((float) (this.f3030r - this.f3021i))) {
            int i10 = this.f3027o;
            int i11 = this.f3026n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s(float f10, float f11) {
        if (!q() ? f10 >= ((float) (this.f3029q - this.f3017e)) : f10 <= ((float) (this.f3017e / 2))) {
            int i10 = this.f3024l;
            int i11 = this.f3023k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f3031s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        int i11;
        if (i10 == 2 && this.f3034v != 2) {
            this.f3015c.setState(D);
            i();
        }
        if (i10 == 0) {
            t();
        } else {
            y();
        }
        if (this.f3034v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f3034v = i10;
        }
        this.f3015c.setState(E);
        i11 = 1200;
        u(i11);
        this.f3034v = i10;
    }

    public void y() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3038z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3038z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3038z.setDuration(500);
        this.f3038z.setStartDelay(0);
        this.f3038z.start();
    }
}
