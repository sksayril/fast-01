package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.q0;
import androidx.core.content.res.k;
import h.b;
import h.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.h;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements androidx.core.graphics.drawable.b {
    private static final String F = a.class.getSimpleName();
    private c A;
    private g B;
    private int C;
    private int D;
    private boolean E;

    private static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f9050a;

        b(Animatable animatable) {
            super();
            this.f9050a = animatable;
        }

        public void c() {
            this.f9050a.start();
        }

        public void d() {
            this.f9050a.stop();
        }
    }

    static class c extends d.a {
        p.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new p.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        /* access modifiers changed from: package-private */
        public int B(int[] iArr, Drawable drawable, int i10) {
            int z9 = super.z(iArr, drawable);
            this.L.n(z9, Integer.valueOf(i10));
            return z9;
        }

        /* access modifiers changed from: package-private */
        public int C(int i10, int i11, Drawable drawable, boolean z9) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z9 ? 8589934592L : 0;
            long j11 = (long) a10;
            this.K.b(D, Long.valueOf(j11 | j10));
            if (z9) {
                this.K.b(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        /* access modifiers changed from: package-private */
        public int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.i(i10, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int G(int i10, int i11) {
            return (int) this.K.i(D(i10, i11), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public boolean H(int i10, int i11) {
            return (this.K.i(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean I(int i10, int i11) {
            return (this.K.i(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f9051a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f9051a = bVar;
        }

        public void c() {
            this.f9051a.start();
        }

        public void d() {
            this.f9051a.stop();
        }
    }

    private static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f9052a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9053b;

        e(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z9 ? numberOfFrames - 1 : 0;
            int i11 = z9 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z9);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            i.b.a(ofInt, true);
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f9053b = z10;
            this.f9052a = ofInt;
        }

        public boolean a() {
            return this.f9053b;
        }

        public void b() {
            this.f9052a.reverse();
        }

        public void c() {
            this.f9052a.start();
        }

        public void d() {
            this.f9052a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f9054a;

        /* renamed from: b  reason: collision with root package name */
        private int f9055b;

        /* renamed from: c  reason: collision with root package name */
        private int f9056c;

        f(AnimationDrawable animationDrawable, boolean z9) {
            b(animationDrawable, z9);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f9056c;
        }

        /* access modifiers changed from: package-private */
        public int b(AnimationDrawable animationDrawable, boolean z9) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9055b = numberOfFrames;
            int[] iArr = this.f9054a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9054a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9054a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z9 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f9056c = i10;
            return i10;
        }

        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * ((float) this.f9056c)) + 0.5f);
            int i11 = this.f9055b;
            int[] iArr = this.f9054a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (((float) i12) / ((float) i11)) + (i12 < i11 ? ((float) i10) / ((float) this.f9056c) : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this((c) null, (Resources) null);
    }

    a(c cVar, Resources resources) {
        super((d.a) null);
        this.C = -1;
        this.D = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, i.e.f9437h);
        int resourceId = k10.getResourceId(i.e.f9438i, 0);
        int resourceId2 = k10.getResourceId(i.e.f9439j, -1);
        Drawable j10 = resourceId2 > 0 ? q0.h().j(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j10 = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.g.c(resources, xmlPullParser, attributeSet, theme) : i.c.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 != null) {
            return this.A.B(k11, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k10 = k.k(resources, theme, attributeSet, i.e.f9440k);
        int resourceId = k10.getResourceId(i.e.f9443n, -1);
        int resourceId2 = k10.getResourceId(i.e.f9442m, -1);
        int resourceId3 = k10.getResourceId(i.e.f9441l, -1);
        Drawable j10 = resourceId3 > 0 ? q0.h().j(context, resourceId3) : null;
        boolean z9 = k10.getBoolean(i.e.f9444o, false);
        k10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j10 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : i.c.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.A.C(resourceId, resourceId2, j10, z9);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i10) {
        int i11;
        int G;
        g gVar;
        g gVar2 = this.B;
        if (gVar2 == null) {
            i11 = c();
        } else if (i10 == this.C) {
            return true;
        } else {
            if (i10 != this.D || !gVar2.a()) {
                i11 = this.C;
                gVar2.d();
            } else {
                gVar2.b();
                this.C = this.D;
                this.D = i10;
                return true;
            }
        }
        this.B = null;
        this.D = -1;
        this.C = -1;
        c cVar = this.A;
        int E2 = cVar.E(i11);
        int E3 = cVar.E(i10);
        if (E3 == 0 || E2 == 0 || (G = cVar.G(E2, E3)) < 0) {
            return false;
        }
        boolean I = cVar.I(E2, E3);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E2, E3), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.b) {
            gVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.B = gVar;
        this.D = i11;
        this.C = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.A;
        cVar.f9074d |= i.c.b(typedArray);
        cVar.x(typedArray.getBoolean(i.e.f9433d, cVar.f9079i));
        cVar.t(typedArray.getBoolean(i.e.f9434e, cVar.f9082l));
        cVar.u(typedArray.getInt(i.e.f9435f, cVar.A));
        cVar.v(typedArray.getInt(i.e.f9436g, cVar.B));
        setDither(typedArray.getBoolean(i.e.f9431b, cVar.f9094x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.A = (c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.B;
        if (gVar != null) {
            gVar.d();
            this.B = null;
            g(this.C);
            this.C = -1;
            this.D = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.A, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.E && super.mutate() == this) {
            this.A.r();
            this.E = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k10 = k.k(resources, theme, attributeSet, i.e.f9430a);
        setVisible(k10.getBoolean(i.e.f9432c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F2 = this.A.F(iArr);
        boolean z9 = F2 != c() && (s(F2) || g(F2));
        Drawable current = getCurrent();
        return current != null ? z9 | current.setState(iArr) : z9;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z9) {
        super.setAutoMirrored(z9);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z9) {
        super.setDither(z9);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        g gVar = this.B;
        if (gVar != null && (visible || z10)) {
            if (z9) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
