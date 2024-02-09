package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f787a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f788b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f789c;

    private a1(Context context, TypedArray typedArray) {
        this.f787a = context;
        this.f788b = typedArray;
    }

    public static a1 s(Context context, int i10, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static a1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a1 u(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z9) {
        return this.f788b.getBoolean(i10, z9);
    }

    public int b(int i10, int i11) {
        return this.f788b.getColor(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = g.a.a(r2.f787a, (r0 = r2.f788b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f788b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f788b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f787a
            android.content.res.ColorStateList r0 = g.a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f788b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.c(int):android.content.res.ColorStateList");
    }

    public int d(int i10, int i11) {
        return this.f788b.getDimensionPixelOffset(i10, i11);
    }

    public int e(int i10, int i11) {
        return this.f788b.getDimensionPixelSize(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f788b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f788b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f788b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f787a
            android.graphics.drawable.Drawable r3 = g.a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f788b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a1.f(int):android.graphics.drawable.Drawable");
    }

    public Drawable g(int i10) {
        int resourceId;
        if (!this.f788b.hasValue(i10) || (resourceId = this.f788b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f787a, resourceId, true);
    }

    public float h(int i10, float f10) {
        return this.f788b.getFloat(i10, f10);
    }

    public Typeface i(int i10, int i11, h.e eVar) {
        int resourceId = this.f788b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f789c == null) {
            this.f789c = new TypedValue();
        }
        return h.f(this.f787a, resourceId, this.f789c, i11, eVar);
    }

    public int j(int i10, int i11) {
        return this.f788b.getInt(i10, i11);
    }

    public int k(int i10, int i11) {
        return this.f788b.getInteger(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f788b.getLayoutDimension(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f788b.getResourceId(i10, i11);
    }

    public String n(int i10) {
        return this.f788b.getString(i10);
    }

    public CharSequence o(int i10) {
        return this.f788b.getText(i10);
    }

    public CharSequence[] p(int i10) {
        return this.f788b.getTextArray(i10);
    }

    public TypedArray q() {
        return this.f788b;
    }

    public boolean r(int i10) {
        return this.f788b.hasValue(i10);
    }

    public void v() {
        this.f788b.recycle();
    }
}
