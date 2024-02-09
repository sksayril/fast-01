package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.core.view.x;

public class a0 extends Spinner {

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f763u = {16843505};

    /* renamed from: m  reason: collision with root package name */
    private final e f764m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f765n;

    /* renamed from: o  reason: collision with root package name */
    private l0 f766o;

    /* renamed from: p  reason: collision with root package name */
    private SpinnerAdapter f767p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f768q;

    /* renamed from: r  reason: collision with root package name */
    private g f769r;

    /* renamed from: s  reason: collision with root package name */
    int f770s;

    /* renamed from: t  reason: collision with root package name */
    final Rect f771t;

    class a extends l0 {

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ e f772v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f772v = eVar;
        }

        public k.e b() {
            return this.f772v;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (a0.this.getInternalPopup().c()) {
                return true;
            }
            a0.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!a0.this.getInternalPopup().c()) {
                a0.this.b();
            }
            ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: m  reason: collision with root package name */
        androidx.appcompat.app.b f775m;

        /* renamed from: n  reason: collision with root package name */
        private ListAdapter f776n;

        /* renamed from: o  reason: collision with root package name */
        private CharSequence f777o;

        c() {
        }

        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public boolean c() {
            androidx.appcompat.app.b bVar = this.f775m;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f775m;
            if (bVar != null) {
                bVar.dismiss();
                this.f775m = null;
            }
        }

        public Drawable g() {
            return null;
        }

        public void i(CharSequence charSequence) {
            this.f777o = charSequence;
        }

        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i10, int i11) {
            if (this.f776n != null) {
                b.a aVar = new b.a(a0.this.getPopupContext());
                CharSequence charSequence = this.f777o;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                androidx.appcompat.app.b a10 = aVar.g(this.f776n, a0.this.getSelectedItemPosition(), this).a();
                this.f775m = a10;
                ListView g10 = a10.g();
                g10.setTextDirection(i10);
                g10.setTextAlignment(i11);
                this.f775m.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f777o;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            a0.this.setSelection(i10);
            if (a0.this.getOnItemClickListener() != null) {
                a0.this.performItemClick((View) null, i10, this.f776n.getItemId(i10));
            }
            dismiss();
        }

        public void p(ListAdapter listAdapter) {
            this.f776n = listAdapter;
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: m  reason: collision with root package name */
        private SpinnerAdapter f779m;

        /* renamed from: n  reason: collision with root package name */
        private ListAdapter f780n;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f779m = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f780n = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof w0) {
                w0 w0Var = (w0) spinnerAdapter;
                if (w0Var.getDropDownViewTheme() == null) {
                    w0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f780n;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f779m;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f780n;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f779m;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends n0 implements g {
        private CharSequence V;
        ListAdapter W;
        private final Rect X = new Rect();
        private int Y;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a0 f781m;

            a(a0 a0Var) {
                this.f781m = a0Var;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                a0.this.setSelection(i10);
                if (a0.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    a0.this.performItemClick(view, i10, eVar.W.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(a0.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.O();
                e.super.a();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f784m;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f784m = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f784m);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            z(a0.this);
            F(true);
            K(0);
            H(new a(a0.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.a0 r1 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r1 = r1.f771t
                r0.getPadding(r1)
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                boolean r0 = androidx.appcompat.widget.h1.b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f771t
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f771t
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f771t
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.a0 r2 = androidx.appcompat.widget.a0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.a0 r3 = androidx.appcompat.widget.a0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                int r5 = r4.f770s
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.W
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.a0 r5 = androidx.appcompat.widget.a0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.a0 r6 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r6 = r6.f771t
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.B(r4)
                goto L_0x0085
            L_0x0082:
                r8.B(r5)
            L_0x0085:
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                boolean r4 = androidx.appcompat.widget.h1.b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.v()
                int r3 = r3 - r0
                int r0 = r8.P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.e.O():void");
        }

        public int P() {
            return this.Y;
        }

        /* access modifiers changed from: package-private */
        public boolean Q(View view) {
            return x.O(view) && view.getGlobalVisibleRect(this.X);
        }

        public void i(CharSequence charSequence) {
            this.V = charSequence;
        }

        public void k(int i10) {
            this.Y = i10;
        }

        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            O();
            E(2);
            super.a();
            ListView h10 = h();
            h10.setChoiceMode(1);
            h10.setTextDirection(i10);
            h10.setTextAlignment(i11);
            L(a0.this.getSelectedItemPosition());
            if (!c10 && (viewTreeObserver = a0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                G(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.V;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.W = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        boolean f786m;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f786m = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f786m ? (byte) 1 : 0);
        }
    }

    interface g {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        Drawable g();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.spinnerStyle);
    }

    public a0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public a0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f771t = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.v0.a(r6, r0)
            int[] r0 = f.j.f8706x2
            r1 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f764m = r2
            if (r11 == 0) goto L_0x0029
            j.d r2 = new j.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f765n = r2
            goto L_0x0039
        L_0x0029:
            int r11 = f.j.C2
            int r11 = r0.m(r11, r1)
            if (r11 == 0) goto L_0x0037
            j.d r2 = new j.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f765n = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0069
            int[] r11 = f763u     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x004d:
            r11.recycle()
            goto L_0x0069
        L_0x0051:
            r3 = move-exception
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            goto L_0x0063
        L_0x0055:
            r3 = move-exception
            r11 = r2
        L_0x0057:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0061 }
            if (r11 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0061:
            r7 = move-exception
            r2 = r11
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.recycle()
        L_0x0068:
            throw r7
        L_0x0069:
            r11 = 1
            if (r10 == 0) goto L_0x00a6
            if (r10 == r11) goto L_0x006f
            goto L_0x00b6
        L_0x006f:
            androidx.appcompat.widget.a0$e r10 = new androidx.appcompat.widget.a0$e
            android.content.Context r3 = r6.f765n
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f765n
            int[] r4 = f.j.f8706x2
            androidx.appcompat.widget.a1 r1 = androidx.appcompat.widget.a1.u(r3, r8, r4, r9, r1)
            int r3 = f.j.B2
            r4 = -2
            int r3 = r1.l(r3, r4)
            r6.f770s = r3
            int r3 = f.j.f8716z2
            android.graphics.drawable.Drawable r3 = r1.f(r3)
            r10.b(r3)
            int r3 = f.j.A2
            java.lang.String r3 = r0.n(r3)
            r10.i(r3)
            r1.v()
            r6.f769r = r10
            androidx.appcompat.widget.a0$a r1 = new androidx.appcompat.widget.a0$a
            r1.<init>(r6, r10)
            r6.f766o = r1
            goto L_0x00b6
        L_0x00a6:
            androidx.appcompat.widget.a0$c r10 = new androidx.appcompat.widget.a0$c
            r10.<init>()
            r6.f769r = r10
            int r1 = f.j.A2
            java.lang.String r1 = r0.n(r1)
            r10.i(r1)
        L_0x00b6:
            int r10 = f.j.f8711y2
            java.lang.CharSequence[] r10 = r0.p(r10)
            if (r10 == 0) goto L_0x00ce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = f.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ce:
            r0.v()
            r6.f768q = r11
            android.widget.SpinnerAdapter r7 = r6.f767p
            if (r7 == 0) goto L_0x00dc
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f767p = r2
        L_0x00dc:
            androidx.appcompat.widget.e r7 = r6.f764m
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f771t);
        Rect rect = this.f771t;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f769r.m(getTextDirection(), getTextAlignment());
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f764m;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        g gVar = this.f769r;
        return gVar != null ? gVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        g gVar = this.f769r;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f769r != null ? this.f770s : super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final g getInternalPopup() {
        return this.f769r;
    }

    public Drawable getPopupBackground() {
        g gVar = this.f769r;
        return gVar != null ? gVar.g() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f765n;
    }

    public CharSequence getPrompt() {
        g gVar = this.f769r;
        return gVar != null ? gVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f764m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f764m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f769r;
        if (gVar != null && gVar.c()) {
            this.f769r.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f769r != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f786m && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f769r;
        fVar.f786m = gVar != null && gVar.c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var = this.f766o;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        g gVar = this.f769r;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.c()) {
            return true;
        }
        b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f768q) {
            this.f767p = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f769r != null) {
            Context context = this.f765n;
            if (context == null) {
                context = getContext();
            }
            this.f769r.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f764m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f764m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f769r;
        if (gVar != null) {
            gVar.k(i10);
            this.f769r.l(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f769r;
        if (gVar != null) {
            gVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f769r != null) {
            this.f770s = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f769r;
        if (gVar != null) {
            gVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f769r;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f764m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f764m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
