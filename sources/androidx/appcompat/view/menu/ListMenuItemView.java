package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a1;
import androidx.core.view.x;
import f.a;
import f.f;
import f.g;
import f.j;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    private boolean A;
    private LayoutInflater B;
    private boolean C;

    /* renamed from: m  reason: collision with root package name */
    private g f461m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView f462n;

    /* renamed from: o  reason: collision with root package name */
    private RadioButton f463o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f464p;

    /* renamed from: q  reason: collision with root package name */
    private CheckBox f465q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f466r;

    /* renamed from: s  reason: collision with root package name */
    private ImageView f467s;

    /* renamed from: t  reason: collision with root package name */
    private ImageView f468t;

    /* renamed from: u  reason: collision with root package name */
    private LinearLayout f469u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f470v;

    /* renamed from: w  reason: collision with root package name */
    private int f471w;

    /* renamed from: x  reason: collision with root package name */
    private Context f472x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f473y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f474z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a1 u9 = a1.u(getContext(), attributeSet, j.T1, i10, 0);
        this.f470v = u9.f(j.V1);
        this.f471w = u9.m(j.U1, -1);
        this.f473y = u9.a(j.W1, false);
        this.f472x = context;
        this.f474z = u9.f(j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.A = obtainStyledAttributes.hasValue(0);
        u9.v();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f469u;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f465q = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
        this.f462n = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f463o = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.B == null) {
            this.B = LayoutInflater.from(getContext());
        }
        return this.B;
    }

    private void setSubMenuArrowVisible(boolean z9) {
        ImageView imageView = this.f467s;
        if (imageView != null) {
            imageView.setVisibility(z9 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f468t;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f468t.getLayoutParams();
            rect.top += this.f468t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(g gVar, int i10) {
        this.f461m = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public g getItemData() {
        return this.f461m;
    }

    public void h(boolean z9, char c10) {
        int i10 = (!z9 || !this.f461m.A()) ? 8 : 0;
        if (i10 == 0) {
            this.f466r.setText(this.f461m.h());
        }
        if (this.f466r.getVisibility() != i10) {
            this.f466r.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        x.j0(this, this.f470v);
        TextView textView = (TextView) findViewById(f.M);
        this.f464p = textView;
        int i10 = this.f471w;
        if (i10 != -1) {
            textView.setTextAppearance(this.f472x, i10);
        }
        this.f466r = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f467s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f474z);
        }
        this.f468t = (ImageView) findViewById(f.group_divider);
        this.f469u = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f462n != null && this.f473y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f462n.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z9) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z9 || this.f463o != null || this.f465q != null) {
            if (this.f461m.m()) {
                if (this.f463o == null) {
                    g();
                }
                compoundButton2 = this.f463o;
                compoundButton = this.f465q;
            } else {
                if (this.f465q == null) {
                    c();
                }
                compoundButton2 = this.f465q;
                compoundButton = this.f463o;
            }
            if (z9) {
                compoundButton2.setChecked(this.f461m.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f465q;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f463o;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z9) {
        CompoundButton compoundButton;
        if (this.f461m.m()) {
            if (this.f463o == null) {
                g();
            }
            compoundButton = this.f463o;
        } else {
            if (this.f465q == null) {
                c();
            }
            compoundButton = this.f465q;
        }
        compoundButton.setChecked(z9);
    }

    public void setForceShowIcon(boolean z9) {
        this.C = z9;
        this.f473y = z9;
    }

    public void setGroupDividerEnabled(boolean z9) {
        ImageView imageView = this.f468t;
        if (imageView != null) {
            imageView.setVisibility((this.A || !z9) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z9 = this.f461m.z() || this.C;
        if (z9 || this.f473y) {
            ImageView imageView = this.f462n;
            if (imageView != null || drawable != null || this.f473y) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f473y) {
                    ImageView imageView2 = this.f462n;
                    if (!z9) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f462n.getVisibility() != 0) {
                        this.f462n.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f462n.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.f464p.setText(charSequence);
            if (this.f464p.getVisibility() != 0) {
                textView = this.f464p;
                i10 = 0;
            } else {
                return;
            }
        } else {
            i10 = 8;
            if (this.f464p.getVisibility() != 8) {
                textView = this.f464p;
            } else {
                return;
            }
        }
        textView.setVisibility(i10);
    }
}
