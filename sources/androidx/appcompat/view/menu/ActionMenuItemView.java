package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.l0;
import f.j;

public class ActionMenuItemView extends d0 implements k.a, View.OnClickListener, ActionMenuView.a {
    private int A;
    private int B;
    private int C;

    /* renamed from: s  reason: collision with root package name */
    g f449s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f450t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f451u;

    /* renamed from: v  reason: collision with root package name */
    e.b f452v;

    /* renamed from: w  reason: collision with root package name */
    private l0 f453w;

    /* renamed from: x  reason: collision with root package name */
    b f454x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f455y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f456z;

    private class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public k.e b() {
            b bVar = ActionMenuItemView.this.f454x;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f452v
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.g r0 = r0.f449s
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                k.e r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract k.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f455y = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8693v, i10, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(j.f8698w, 0);
        obtainStyledAttributes.recycle();
        this.C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.B = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f450t);
        if (this.f451u != null && (!this.f449s.B() || (!this.f455y && !this.f456z))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        CharSequence charSequence = null;
        setText(z11 ? this.f450t : null);
        CharSequence contentDescription = this.f449s.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z11 ? null : this.f449s.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f449s.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z11) {
                charSequence = this.f449s.getTitle();
            }
            d1.a(this, charSequence);
            return;
        }
        d1.a(this, tooltipText);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        return f() && this.f449s.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public void e(g gVar, int i10) {
        this.f449s = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f453w == null) {
            this.f453w = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public g getItemData() {
        return this.f449s;
    }

    public void onClick(View view) {
        e.b bVar = this.f452v;
        if (bVar != null) {
            bVar.a(this.f449s);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f455y = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean f10 = f();
        if (f10 && (i12 = this.B) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.A) : this.A;
        if (mode != 1073741824 && this.A > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!f10 && this.f451u != null) {
            super.setPadding((getMeasuredWidth() - this.f451u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var;
        if (!this.f449s.hasSubMenu() || (l0Var = this.f453w) == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f456z != z9) {
            this.f456z = z9;
            g gVar = this.f449s;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f451u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.C;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f452v = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.B = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f454x = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f450t = charSequence;
        h();
    }
}
