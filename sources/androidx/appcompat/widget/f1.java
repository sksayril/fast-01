package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import f.d;
import f.f;
import f.g;
import f.i;

class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f899a;

    /* renamed from: b  reason: collision with root package name */
    private final View f900b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f901c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f902d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f903e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f904f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f905g = new int[2];

    f1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f902d = layoutParams;
        this.f899a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f900b = inflate;
        this.f901c = (TextView) inflate.findViewById(f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z9, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f899a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f899a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f899a.getResources().getDimensionPixelOffset(z9 ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f903e);
        Rect rect = this.f903e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f899a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f903e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f905g);
        view.getLocationOnScreen(this.f904f);
        int[] iArr = this.f904f;
        int i14 = iArr[0];
        int[] iArr2 = this.f905g;
        iArr[0] = i14 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f900b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f900b.getMeasuredHeight();
        int[] iArr3 = this.f904f;
        int i15 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i16 = iArr3[1] + i13 + dimensionPixelOffset3;
        if (!z9 ? measuredHeight + i16 > this.f903e.height() : i15 >= 0) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f899a.getSystemService("window")).removeView(this.f900b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f900b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z9, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f901c.setText(charSequence);
        a(view, i10, i11, z9, this.f902d);
        ((WindowManager) this.f899a.getSystemService("window")).addView(this.f900b, this.f902d);
    }
}
