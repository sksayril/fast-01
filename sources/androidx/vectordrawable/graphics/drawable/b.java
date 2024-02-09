package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b extends f implements Animatable {

    /* renamed from: n  reason: collision with root package name */
    private C0064b f3250n;

    /* renamed from: o  reason: collision with root package name */
    private Context f3251o;

    /* renamed from: p  reason: collision with root package name */
    private ArgbEvaluator f3252p;

    /* renamed from: q  reason: collision with root package name */
    private Animator.AnimatorListener f3253q;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<Object> f3254r;

    /* renamed from: s  reason: collision with root package name */
    final Drawable.Callback f3255s;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b  reason: collision with other inner class name */
    private static class C0064b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f3257a;

        /* renamed from: b  reason: collision with root package name */
        g f3258b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f3259c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f3260d;

        /* renamed from: e  reason: collision with root package name */
        p.a<Animator, String> f3261e;

        public C0064b(Context context, C0064b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3257a = bVar.f3257a;
                g gVar = bVar.f3258b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f3258b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f3258b.mutate();
                    this.f3258b = gVar2;
                    gVar2.setCallback(callback);
                    this.f3258b.setBounds(bVar.f3258b.getBounds());
                    this.f3258b.h(false);
                }
                ArrayList<Animator> arrayList = bVar.f3260d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3260d = new ArrayList<>(size);
                    this.f3261e = new p.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f3260d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f3261e.get(animator);
                        clone.setTarget(this.f3258b.d(str));
                        this.f3260d.add(clone);
                        this.f3261e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3259c == null) {
                this.f3259c = new AnimatorSet();
            }
            this.f3259c.playTogether(this.f3260d);
        }

        public int getChangingConfigurations() {
            return this.f3257a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f3262a;

        public c(Drawable.ConstantState constantState) {
            this.f3262a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3262a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3262a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f3262a.newDrawable();
            bVar.f3265m = newDrawable;
            newDrawable.setCallback(bVar.f3255s);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f3262a.newDrawable(resources);
            bVar.f3265m = newDrawable;
            newDrawable.setCallback(bVar.f3255s);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f3262a.newDrawable(resources, theme);
            bVar.f3265m = newDrawable;
            newDrawable.setCallback(bVar.f3255s);
            return bVar;
        }
    }

    b() {
        this((Context) null, (C0064b) null, (Resources) null);
    }

    private b(Context context) {
        this(context, (C0064b) null, (Resources) null);
    }

    private b(Context context, C0064b bVar, Resources resources) {
        this.f3252p = null;
        this.f3253q = null;
        this.f3254r = null;
        a aVar = new a();
        this.f3255s = aVar;
        this.f3251o = context;
        if (bVar != null) {
            this.f3250n = bVar;
        } else {
            this.f3250n = new C0064b(context, bVar, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f3250n.f3258b.d(str));
        C0064b bVar = this.f3250n;
        if (bVar.f3260d == null) {
            bVar.f3260d = new ArrayList<>();
            this.f3250n.f3261e = new p.a<>();
        }
        this.f3250n.f3260d.add(animator);
        this.f3250n.f3261e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3250n.f3258b.draw(canvas);
        if (this.f3250n.f3259c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3250n.f3258b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3250n.f3257a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3250n.f3258b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3265m == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3265m.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3250n.f3258b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3250n.f3258b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getOpacity() : this.f3250n.f3258b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = k.k(resources, theme, attributeSet, a.f3242e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b10 = g.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.f3255s);
                        g gVar = this.f3250n.f3258b;
                        if (gVar != null) {
                            gVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3250n.f3258b = b10;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f3243f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3251o;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3250n.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3250n.f3258b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3265m;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3250n.f3259c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.isStateful() : this.f3250n.f3258b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3250n.f3258b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.setLevel(i10) : this.f3250n.f3258b.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.setState(iArr) : this.f3250n.f3258b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f3250n.f3258b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z9);
        } else {
            this.f3250n.f3258b.setAutoMirrored(z9);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3250n.f3258b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            this.f3250n.f3258b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f3250n.f3258b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f3250n.f3258b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f3250n.f3258b.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    public void start() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3250n.f3259c.isStarted()) {
            this.f3250n.f3259c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3250n.f3259c.end();
        }
    }
}
