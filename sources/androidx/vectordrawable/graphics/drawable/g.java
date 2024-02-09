package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends f {

    /* renamed from: w  reason: collision with root package name */
    static final PorterDuff.Mode f3266w = PorterDuff.Mode.SRC_IN;

    /* renamed from: n  reason: collision with root package name */
    private h f3267n;

    /* renamed from: o  reason: collision with root package name */
    private PorterDuffColorFilter f3268o;

    /* renamed from: p  reason: collision with root package name */
    private ColorFilter f3269p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3270q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3271r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable.ConstantState f3272s;

    /* renamed from: t  reason: collision with root package name */
    private final float[] f3273t;

    /* renamed from: u  reason: collision with root package name */
    private final Matrix f3274u;

    /* renamed from: v  reason: collision with root package name */
    private final Rect f3275v;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3302b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3301a = androidx.core.graphics.d.d(string2);
            }
            this.f3303c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k10 = k.k(resources, theme, attributeSet, a.f3241d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f3276e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f3277f;

        /* renamed from: g  reason: collision with root package name */
        float f3278g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f3279h;

        /* renamed from: i  reason: collision with root package name */
        float f3280i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f3281j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f3282k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f3283l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f3284m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f3285n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f3286o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f3287p = 4.0f;

        c() {
        }

        c(c cVar) {
            super(cVar);
            this.f3276e = cVar.f3276e;
            this.f3277f = cVar.f3277f;
            this.f3278g = cVar.f3278g;
            this.f3280i = cVar.f3280i;
            this.f3279h = cVar.f3279h;
            this.f3303c = cVar.f3303c;
            this.f3281j = cVar.f3281j;
            this.f3282k = cVar.f3282k;
            this.f3283l = cVar.f3283l;
            this.f3284m = cVar.f3284m;
            this.f3285n = cVar.f3285n;
            this.f3286o = cVar.f3286o;
            this.f3287p = cVar.f3287p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3276e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3302b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3301a = androidx.core.graphics.d.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f3279h = k.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f3281j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3281j);
                this.f3285n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3285n);
                this.f3286o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3286o);
                this.f3287p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3287p);
                this.f3277f = k.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f3280i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3280i);
                this.f3278g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3278g);
                this.f3283l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3283l);
                this.f3284m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3284m);
                this.f3282k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3282k);
                this.f3303c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f3303c);
            }
        }

        public boolean a() {
            return this.f3279h.i() || this.f3277f.i();
        }

        public boolean b(int[] iArr) {
            return this.f3277f.j(iArr) | this.f3279h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, a.f3240c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3281j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3279h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3280i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3277f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3278g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3283l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3284m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3282k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f10) {
            this.f3281j = f10;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i10) {
            this.f3279h.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f10) {
            this.f3280i = f10;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i10) {
            this.f3277f.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f10) {
            this.f3278g = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f10) {
            this.f3283l = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f10) {
            this.f3284m = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f10) {
            this.f3282k = f10;
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f3288a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f3289b;

        /* renamed from: c  reason: collision with root package name */
        float f3290c;

        /* renamed from: d  reason: collision with root package name */
        private float f3291d;

        /* renamed from: e  reason: collision with root package name */
        private float f3292e;

        /* renamed from: f  reason: collision with root package name */
        private float f3293f;

        /* renamed from: g  reason: collision with root package name */
        private float f3294g;

        /* renamed from: h  reason: collision with root package name */
        private float f3295h;

        /* renamed from: i  reason: collision with root package name */
        private float f3296i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f3297j;

        /* renamed from: k  reason: collision with root package name */
        int f3298k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f3299l;

        /* renamed from: m  reason: collision with root package name */
        private String f3300m;

        public d() {
            super();
            this.f3288a = new Matrix();
            this.f3289b = new ArrayList<>();
            this.f3290c = 0.0f;
            this.f3291d = 0.0f;
            this.f3292e = 0.0f;
            this.f3293f = 1.0f;
            this.f3294g = 1.0f;
            this.f3295h = 0.0f;
            this.f3296i = 0.0f;
            this.f3297j = new Matrix();
            this.f3300m = null;
        }

        public d(d dVar, p.a<String, Object> aVar) {
            super();
            f fVar;
            this.f3288a = new Matrix();
            this.f3289b = new ArrayList<>();
            this.f3290c = 0.0f;
            this.f3291d = 0.0f;
            this.f3292e = 0.0f;
            this.f3293f = 1.0f;
            this.f3294g = 1.0f;
            this.f3295h = 0.0f;
            this.f3296i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3297j = matrix;
            this.f3300m = null;
            this.f3290c = dVar.f3290c;
            this.f3291d = dVar.f3291d;
            this.f3292e = dVar.f3292e;
            this.f3293f = dVar.f3293f;
            this.f3294g = dVar.f3294g;
            this.f3295h = dVar.f3295h;
            this.f3296i = dVar.f3296i;
            this.f3299l = dVar.f3299l;
            String str = dVar.f3300m;
            this.f3300m = str;
            this.f3298k = dVar.f3298k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3297j);
            ArrayList<e> arrayList = dVar.f3289b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f3289b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3289b.add(fVar);
                    String str2 = fVar.f3302b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f3297j.reset();
            this.f3297j.postTranslate(-this.f3291d, -this.f3292e);
            this.f3297j.postScale(this.f3293f, this.f3294g);
            this.f3297j.postRotate(this.f3290c, 0.0f, 0.0f);
            this.f3297j.postTranslate(this.f3295h + this.f3291d, this.f3296i + this.f3292e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3299l = null;
            this.f3290c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f3290c);
            this.f3291d = typedArray.getFloat(1, this.f3291d);
            this.f3292e = typedArray.getFloat(2, this.f3292e);
            this.f3293f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f3293f);
            this.f3294g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f3294g);
            this.f3295h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f3295h);
            this.f3296i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f3296i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3300m = string;
            }
            d();
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f3289b.size(); i10++) {
                if (this.f3289b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z9 = false;
            for (int i10 = 0; i10 < this.f3289b.size(); i10++) {
                z9 |= this.f3289b.get(i10).b(iArr);
            }
            return z9;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, a.f3239b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f3300m;
        }

        public Matrix getLocalMatrix() {
            return this.f3297j;
        }

        public float getPivotX() {
            return this.f3291d;
        }

        public float getPivotY() {
            return this.f3292e;
        }

        public float getRotation() {
            return this.f3290c;
        }

        public float getScaleX() {
            return this.f3293f;
        }

        public float getScaleY() {
            return this.f3294g;
        }

        public float getTranslateX() {
            return this.f3295h;
        }

        public float getTranslateY() {
            return this.f3296i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3291d) {
                this.f3291d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3292e) {
                this.f3292e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3290c) {
                this.f3290c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3293f) {
                this.f3293f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3294g) {
                this.f3294g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3295h) {
                this.f3295h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f3296i) {
                this.f3296i = f10;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f3301a = null;

        /* renamed from: b  reason: collision with root package name */
        String f3302b;

        /* renamed from: c  reason: collision with root package name */
        int f3303c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3304d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.f3302b = fVar.f3302b;
            this.f3304d = fVar.f3304d;
            this.f3301a = androidx.core.graphics.d.f(fVar.f3301a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f3301a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f3301a;
        }

        public String getPathName() {
            return this.f3302b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f3301a, bVarArr)) {
                this.f3301a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f3301a, bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g  reason: collision with other inner class name */
    private static class C0065g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f3305q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f3306a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f3307b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f3308c;

        /* renamed from: d  reason: collision with root package name */
        Paint f3309d;

        /* renamed from: e  reason: collision with root package name */
        Paint f3310e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f3311f;

        /* renamed from: g  reason: collision with root package name */
        private int f3312g;

        /* renamed from: h  reason: collision with root package name */
        final d f3313h;

        /* renamed from: i  reason: collision with root package name */
        float f3314i;

        /* renamed from: j  reason: collision with root package name */
        float f3315j;

        /* renamed from: k  reason: collision with root package name */
        float f3316k;

        /* renamed from: l  reason: collision with root package name */
        float f3317l;

        /* renamed from: m  reason: collision with root package name */
        int f3318m;

        /* renamed from: n  reason: collision with root package name */
        String f3319n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f3320o;

        /* renamed from: p  reason: collision with root package name */
        final p.a<String, Object> f3321p;

        public C0065g() {
            this.f3308c = new Matrix();
            this.f3314i = 0.0f;
            this.f3315j = 0.0f;
            this.f3316k = 0.0f;
            this.f3317l = 0.0f;
            this.f3318m = 255;
            this.f3319n = null;
            this.f3320o = null;
            this.f3321p = new p.a<>();
            this.f3313h = new d();
            this.f3306a = new Path();
            this.f3307b = new Path();
        }

        public C0065g(C0065g gVar) {
            this.f3308c = new Matrix();
            this.f3314i = 0.0f;
            this.f3315j = 0.0f;
            this.f3316k = 0.0f;
            this.f3317l = 0.0f;
            this.f3318m = 255;
            this.f3319n = null;
            this.f3320o = null;
            p.a<String, Object> aVar = new p.a<>();
            this.f3321p = aVar;
            this.f3313h = new d(gVar.f3313h, aVar);
            this.f3306a = new Path(gVar.f3306a);
            this.f3307b = new Path(gVar.f3307b);
            this.f3314i = gVar.f3314i;
            this.f3315j = gVar.f3315j;
            this.f3316k = gVar.f3316k;
            this.f3317l = gVar.f3317l;
            this.f3312g = gVar.f3312g;
            this.f3318m = gVar.f3318m;
            this.f3319n = gVar.f3319n;
            String str = gVar.f3319n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3320o = gVar.f3320o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f3288a.set(matrix);
            dVar.f3288a.preConcat(dVar.f3297j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f3289b.size(); i12++) {
                e eVar = dVar.f3289b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f3288a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f3316k;
            float f11 = ((float) i11) / this.f3317l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f3288a;
            this.f3308c.set(matrix);
            this.f3308c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f3306a);
                Path path = this.f3306a;
                this.f3307b.reset();
                if (fVar.c()) {
                    this.f3307b.setFillType(fVar.f3303c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f3307b.addPath(path, this.f3308c);
                    canvas.clipPath(this.f3307b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f3282k;
                if (!(f12 == 0.0f && cVar.f3283l == 1.0f)) {
                    float f13 = cVar.f3284m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f3283l + f13) % 1.0f;
                    if (this.f3311f == null) {
                        this.f3311f = new PathMeasure();
                    }
                    this.f3311f.setPath(this.f3306a, false);
                    float length = this.f3311f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f3311f.getSegment(f16, length, path, true);
                        this.f3311f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f3311f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f3307b.addPath(path, this.f3308c);
                if (cVar.f3279h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f3279h;
                    if (this.f3310e == null) {
                        Paint paint = new Paint(1);
                        this.f3310e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f3310e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f3308c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f3281j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(g.a(dVar2.e(), cVar.f3281j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f3307b.setFillType(cVar.f3303c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f3307b, paint2);
                }
                if (cVar.f3277f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f3277f;
                    if (this.f3309d == null) {
                        Paint paint3 = new Paint(1);
                        this.f3309d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f3309d;
                    Paint.Join join = cVar.f3286o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f3285n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f3287p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f3308c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f3280i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(g.a(dVar3.e(), cVar.f3280i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f3278g * min * e10);
                    canvas.drawPath(this.f3307b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f3313h, f3305q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f3320o == null) {
                this.f3320o = Boolean.valueOf(this.f3313h.a());
            }
            return this.f3320o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3313h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3318m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f3318m = i10;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f3322a;

        /* renamed from: b  reason: collision with root package name */
        C0065g f3323b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f3324c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f3325d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3326e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f3327f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f3328g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f3329h;

        /* renamed from: i  reason: collision with root package name */
        int f3330i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3331j;

        /* renamed from: k  reason: collision with root package name */
        boolean f3332k;

        /* renamed from: l  reason: collision with root package name */
        Paint f3333l;

        public h() {
            this.f3324c = null;
            this.f3325d = g.f3266w;
            this.f3323b = new C0065g();
        }

        public h(h hVar) {
            this.f3324c = null;
            this.f3325d = g.f3266w;
            if (hVar != null) {
                this.f3322a = hVar.f3322a;
                C0065g gVar = new C0065g(hVar.f3323b);
                this.f3323b = gVar;
                if (hVar.f3323b.f3310e != null) {
                    gVar.f3310e = new Paint(hVar.f3323b.f3310e);
                }
                if (hVar.f3323b.f3309d != null) {
                    this.f3323b.f3309d = new Paint(hVar.f3323b.f3309d);
                }
                this.f3324c = hVar.f3324c;
                this.f3325d = hVar.f3325d;
                this.f3326e = hVar.f3326e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f3327f.getWidth() && i11 == this.f3327f.getHeight();
        }

        public boolean b() {
            return !this.f3332k && this.f3328g == this.f3324c && this.f3329h == this.f3325d && this.f3331j == this.f3326e && this.f3330i == this.f3323b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f3327f == null || !a(i10, i11)) {
                this.f3327f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f3332k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3327f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3333l == null) {
                Paint paint = new Paint();
                this.f3333l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3333l.setAlpha(this.f3323b.getRootAlpha());
            this.f3333l.setColorFilter(colorFilter);
            return this.f3333l;
        }

        public boolean f() {
            return this.f3323b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3323b.f();
        }

        public int getChangingConfigurations() {
            return this.f3322a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f3323b.g(iArr);
            this.f3332k |= g10;
            return g10;
        }

        public void i() {
            this.f3328g = this.f3324c;
            this.f3329h = this.f3325d;
            this.f3330i = this.f3323b.getRootAlpha();
            this.f3331j = this.f3326e;
            this.f3332k = false;
        }

        public void j(int i10, int i11) {
            this.f3327f.eraseColor(0);
            this.f3323b.b(new Canvas(this.f3327f), i10, i11, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f3334a;

        public i(Drawable.ConstantState constantState) {
            this.f3334a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3334a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3334a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f3265m = (VectorDrawable) this.f3334a.newDrawable();
            return gVar;
        }

        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f3265m = (VectorDrawable) this.f3334a.newDrawable(resources);
            return gVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f3265m = (VectorDrawable) this.f3334a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.f3271r = true;
        this.f3273t = new float[9];
        this.f3274u = new Matrix();
        this.f3275v = new Rect();
        this.f3267n = new h();
    }

    g(h hVar) {
        this.f3271r = true;
        this.f3273t = new float[9];
        this.f3274u = new Matrix();
        this.f3275v = new Rect();
        this.f3267n = hVar;
        this.f3268o = j(this.f3268o, hVar.f3324c, hVar.f3325d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.g b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.g r0 = new androidx.vectordrawable.graphics.drawable.g
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.h.d(r6, r7, r8)
            r0.f3265m = r6
            androidx.vectordrawable.graphics.drawable.g$i r6 = new androidx.vectordrawable.graphics.drawable.g$i
            android.graphics.drawable.Drawable r7 = r0.f3265m
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f3272s = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.g r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.g.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.g");
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: androidx.vectordrawable.graphics.drawable.g$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: androidx.vectordrawable.graphics.drawable.g$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: androidx.vectordrawable.graphics.drawable.g$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: androidx.vectordrawable.graphics.drawable.g$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: androidx.vectordrawable.graphics.drawable.g$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            androidx.vectordrawable.graphics.drawable.g$h r0 = r10.f3267n
            androidx.vectordrawable.graphics.drawable.g$g r1 = r0.f3323b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            androidx.vectordrawable.graphics.drawable.g$d r3 = r1.f3313h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            androidx.vectordrawable.graphics.drawable.g$d r7 = (androidx.vectordrawable.graphics.drawable.g.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            androidx.vectordrawable.graphics.drawable.g$c r3 = new androidx.vectordrawable.graphics.drawable.g$c
            r3.<init>()
            r3.g(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.g$e> r6 = r7.f3289b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            p.a<java.lang.String, java.lang.Object> r6 = r1.f3321p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            androidx.vectordrawable.graphics.drawable.g$b r3 = new androidx.vectordrawable.graphics.drawable.g$b
            r3.<init>()
            r3.e(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.g$e> r7 = r7.f3289b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            p.a<java.lang.String, java.lang.Object> r7 = r1.f3321p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f3322a
            int r3 = r3.f3304d
        L_0x0081:
            r3 = r3 | r7
            r0.f3322a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            androidx.vectordrawable.graphics.drawable.g$d r3 = new androidx.vectordrawable.graphics.drawable.g$d
            r3.<init>()
            r3.c(r11, r13, r14, r12)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.g$e> r7 = r7.f3289b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            p.a<java.lang.String, java.lang.Object> r7 = r1.f3321p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f3322a
            int r3 = r3.f3298k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.g.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f3267n;
        C0065g gVar = hVar.f3323b;
        hVar.f3325d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f3324c = c10;
        }
        hVar.f3326e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3326e);
        gVar.f3316k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3316k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3317l);
        gVar.f3317l = f10;
        if (gVar.f3316k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f3314i = typedArray.getDimension(3, gVar.f3314i);
            float dimension = typedArray.getDimension(2, gVar.f3315j);
            gVar.f3315j = dimension;
            if (gVar.f3314i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f3319n = string;
                    gVar.f3321p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3265m;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f3267n.f3323b.f3321p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3275v);
        if (this.f3275v.width() > 0 && this.f3275v.height() > 0) {
            ColorFilter colorFilter = this.f3269p;
            if (colorFilter == null) {
                colorFilter = this.f3268o;
            }
            canvas.getMatrix(this.f3274u);
            this.f3274u.getValues(this.f3273t);
            float abs = Math.abs(this.f3273t[0]);
            float abs2 = Math.abs(this.f3273t[4]);
            float abs3 = Math.abs(this.f3273t[1]);
            float abs4 = Math.abs(this.f3273t[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3275v.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3275v.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3275v;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.f3275v.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3275v.offsetTo(0, 0);
                this.f3267n.c(min, min2);
                if (!this.f3271r) {
                    this.f3267n.j(min, min2);
                } else if (!this.f3267n.b()) {
                    this.f3267n.j(min, min2);
                    this.f3267n.i();
                }
                this.f3267n.d(canvas, colorFilter, this.f3275v);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3267n.f3323b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3267n.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3269p;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3265m != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3265m.getConstantState());
        }
        this.f3267n.f3322a = getChangingConfigurations();
        return this.f3267n;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3267n.f3323b.f3315j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3267n.f3323b.f3314i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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

    /* access modifiers changed from: package-private */
    public void h(boolean z9) {
        this.f3271r = z9;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3267n;
        hVar.f3323b = new C0065g();
        TypedArray k10 = k.k(resources, theme, attributeSet, a.f3238a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f3322a = getChangingConfigurations();
        hVar.f3332k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3268o = j(this.f3268o, hVar.f3324c, hVar.f3325d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3265m;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3267n.f3326e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f3267n.f3324c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f3267n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3265m
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.g$h r0 = r1.f3267n
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.g$h r0 = r1.f3267n
            android.content.res.ColorStateList r0 = r0.f3324c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.g.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3270q && super.mutate() == this) {
            this.f3267n = new h(this.f3267n);
            this.f3270q = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z9 = false;
        h hVar = this.f3267n;
        ColorStateList colorStateList = hVar.f3324c;
        if (!(colorStateList == null || (mode = hVar.f3325d) == null)) {
            this.f3268o = j(this.f3268o, colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z9;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f3267n.f3323b.getRootAlpha() != i10) {
            this.f3267n.f3323b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z9);
        } else {
            this.f3267n.f3326e = z9;
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
            return;
        }
        this.f3269p = colorFilter;
        invalidateSelf();
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
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3267n;
        if (hVar.f3324c != colorStateList) {
            hVar.f3324c = colorStateList;
            this.f3268o = j(this.f3268o, colorStateList, hVar.f3325d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3267n;
        if (hVar.f3325d != mode) {
            hVar.f3325d = mode;
            this.f3268o = j(this.f3268o, hVar.f3324c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f3265m;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3265m;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
