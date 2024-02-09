package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.x;
import f.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class e0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f866l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f867m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f868n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f869a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f870b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f871c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f872d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f873e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f874f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f875g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f876h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f877i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f878j;

    /* renamed from: k  reason: collision with root package name */
    private final c f879k;

    private static class a extends c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) e0.o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) e0.o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    e0(TextView textView) {
        this.f877i = textView;
        this.f878j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f879k = i10 >= 29 ? new b() : i10 >= 23 ? new a() : new c();
    }

    private boolean A() {
        return !(this.f877i instanceof l);
    }

    private void B(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f869a = 1;
            this.f872d = f10;
            this.f873e = f11;
            this.f871c = f12;
            this.f875g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f869a = 0;
        this.f872d = -1.0f;
        this.f873e = -1.0f;
        this.f871c = -1.0f;
        this.f874f = new int[0];
        this.f870b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f876h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f877i.getLineSpacingExtra(), this.f877i.getLineSpacingMultiplier()).setIncludePad(this.f877i.getIncludeFontPadding()).setBreakStrategy(this.f877i.getBreakStrategy()).setHyphenationFrequency(this.f877i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f879k.a(obtain, this.f877i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f876h, i10, alignment, this.f877i.getLineSpacingMultiplier(), this.f877i.getLineSpacingExtra(), this.f877i.getIncludeFontPadding());
    }

    private int g(RectF rectF) {
        int length = this.f874f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                if (z(this.f874f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i11;
                    i11 = i14;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f874f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method m(String str) {
        try {
            Method method = f867m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f867m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T o(Object obj, String str, T t9) {
        try {
            return m(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t9;
        }
    }

    private void u(float f10) {
        if (f10 != this.f877i.getPaint().getTextSize()) {
            this.f877i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f877i.isInLayout();
            if (this.f877i.getLayout() != null) {
                this.f870b = false;
                try {
                    Method m10 = m("nullLayouts");
                    if (m10 != null) {
                        m10.invoke(this.f877i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!isInLayout) {
                    this.f877i.requestLayout();
                } else {
                    this.f877i.forceLayout();
                }
                this.f877i.invalidate();
            }
        }
    }

    private boolean w() {
        if (!A() || this.f869a != 1) {
            this.f870b = false;
        } else {
            if (!this.f875g || this.f874f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f873e - this.f872d) / this.f871c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f872d + (((float) i10) * this.f871c));
                }
                this.f874f = b(iArr);
            }
            this.f870b = true;
        }
        return this.f870b;
    }

    private void x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f874f = b(iArr);
            y();
        }
    }

    private boolean y() {
        int[] iArr = this.f874f;
        int length = iArr.length;
        boolean z9 = length > 0;
        this.f875g = z9;
        if (z9) {
            this.f869a = 1;
            this.f872d = (float) iArr[0];
            this.f873e = (float) iArr[length - 1];
            this.f871c = -1.0f;
        }
        return z9;
    }

    private boolean z(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f877i.getText();
        TransformationMethod transformationMethod = this.f877i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f877i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f877i.getMaxLines();
        n(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) o(this.f877i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (p()) {
            if (this.f870b) {
                if (this.f877i.getMeasuredHeight() > 0 && this.f877i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f879k.b(this.f877i) ? 1048576 : (this.f877i.getMeasuredWidth() - this.f877i.getTotalPaddingLeft()) - this.f877i.getTotalPaddingRight();
                    int height = (this.f877i.getHeight() - this.f877i.getCompoundPaddingBottom()) - this.f877i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f866l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float g10 = (float) g(rectF);
                            if (g10 != this.f877i.getTextSize()) {
                                v(0, g10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f870b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return Build.VERSION.SDK_INT >= 23 ? e(charSequence, alignment, i10, i11) : f(charSequence, alignment, i10);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f873e);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f872d);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f871c);
    }

    /* access modifiers changed from: package-private */
    public int[] k() {
        return this.f874f;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f869a;
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
        TextPaint textPaint = this.f876h;
        if (textPaint == null) {
            this.f876h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f876h.set(this.f877i.getPaint());
        this.f876h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return A() && this.f869a != 0;
    }

    /* access modifiers changed from: package-private */
    public void q(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f878j;
        int[] iArr = j.f8619g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f877i;
        x.e0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = j.f8644l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f869a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = j.f8639k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = j.f8629i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = j.f8624h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = j.f8634j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!A()) {
            this.f869a = 0;
        } else if (this.f869a == 1) {
            if (!this.f875g) {
                DisplayMetrics displayMetrics = this.f878j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                B(dimension2, dimension3, dimension);
            }
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i10, int i11, int i12, int i13) {
        if (A()) {
            DisplayMetrics displayMetrics = this.f878j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (w()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int[] iArr, int i10) {
        if (A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f878j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f874f = b(iArr2);
                if (!y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f875g = false;
            }
            if (w()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        if (!A()) {
            return;
        }
        if (i10 == 0) {
            c();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f878j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (w()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i10, float f10) {
        Context context = this.f878j;
        u(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
