package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.x;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends m0 implements j.c {
    static final n C0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    private final AdapterView.OnItemSelectedListener A0;
    final SearchAutoComplete B;
    private TextWatcher B0;
    private final View C;
    private final View D;
    private final View E;
    final ImageView F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    private final View J;
    private p K;
    private Rect L;
    private Rect M;
    private int[] N;
    private int[] O;
    private final ImageView P;
    private final Drawable Q;
    private final int R;
    private final int S;
    private final Intent T;
    private final Intent U;
    private final CharSequence V;
    private l W;

    /* renamed from: a0  reason: collision with root package name */
    private k f667a0;

    /* renamed from: b0  reason: collision with root package name */
    View.OnFocusChangeListener f668b0;

    /* renamed from: c0  reason: collision with root package name */
    private m f669c0;

    /* renamed from: d0  reason: collision with root package name */
    private View.OnClickListener f670d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f671e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f672f0;

    /* renamed from: g0  reason: collision with root package name */
    v.a f673g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f674h0;

    /* renamed from: i0  reason: collision with root package name */
    private CharSequence f675i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f676j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f677k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f678l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f679m0;

    /* renamed from: n0  reason: collision with root package name */
    private CharSequence f680n0;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f681o0;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f682p0;

    /* renamed from: q0  reason: collision with root package name */
    private int f683q0;

    /* renamed from: r0  reason: collision with root package name */
    SearchableInfo f684r0;

    /* renamed from: s0  reason: collision with root package name */
    private Bundle f685s0;

    /* renamed from: t0  reason: collision with root package name */
    private final Runnable f686t0;

    /* renamed from: u0  reason: collision with root package name */
    private Runnable f687u0;

    /* renamed from: v0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f688v0;

    /* renamed from: w0  reason: collision with root package name */
    private final View.OnClickListener f689w0;

    /* renamed from: x0  reason: collision with root package name */
    View.OnKeyListener f690x0;

    /* renamed from: y0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f691y0;

    /* renamed from: z0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f692z0;

    public static class SearchAutoComplete extends d {

        /* renamed from: q  reason: collision with root package name */
        private int f693q;

        /* renamed from: r  reason: collision with root package name */
        private SearchView f694r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f695s;

        /* renamed from: t  reason: collision with root package name */
        final Runnable f696t;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f696t = new a();
            this.f693q = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.C0.c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f695s) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f695s = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f693q <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f695s) {
                removeCallbacks(this.f696t);
                post(this.f696t);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            this.f694r.Z();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f694r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f694r.hasFocus() && getVisibility() == 0) {
                this.f695s = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z9) {
                this.f695s = false;
                removeCallbacks(this.f696t);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f695s = false;
                removeCallbacks(this.f696t);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f695s = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f694r = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f693q = i10;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            v.a aVar = SearchView.this.f673g0;
            if (aVar instanceof u0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z9) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f668b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z9);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.F) {
                searchView.V();
            } else if (view == searchView.H) {
                searchView.R();
            } else if (view == searchView.G) {
                searchView.W();
            } else if (view == searchView.I) {
                searchView.a0();
            } else if (view == searchView.B) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f684r0 == null) {
                return false;
            }
            if (searchView.B.isPopupShowing() && SearchView.this.B.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.B.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.B.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i10);

        boolean b(int i10);
    }

    private static class n {

        /* renamed from: a  reason: collision with root package name */
        private Method f708a = null;

        /* renamed from: b  reason: collision with root package name */
        private Method f709b = null;

        /* renamed from: c  reason: collision with root package name */
        private Method f710c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f708a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f709b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f710c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f709b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f708a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f710c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    static class o extends w.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        boolean f711o;

        class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f711o = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f711o + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f711o));
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f712a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f713b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final Rect f714c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f715d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f716e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f717f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f716e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f712a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f713b.set(rect);
            this.f715d.set(rect);
            Rect rect3 = this.f715d;
            int i10 = this.f716e;
            rect3.inset(-i10, -i10);
            this.f714c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f717f
                r7.f717f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f717f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f715d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f713b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f717f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f714c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f712a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f712a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f714c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f712a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = new Rect();
        this.M = new Rect();
        this.N = new int[2];
        this.O = new int[2];
        this.f686t0 = new b();
        this.f687u0 = new c();
        this.f688v0 = new WeakHashMap<>();
        f fVar = new f();
        this.f689w0 = fVar;
        this.f690x0 = new g();
        h hVar = new h();
        this.f691y0 = hVar;
        i iVar = new i();
        this.f692z0 = iVar;
        j jVar = new j();
        this.A0 = jVar;
        this.B0 = new a();
        int[] iArr = f.j.f8616f2;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        a1 u9 = a1.u(context, attributeSet2, iArr, i11, 0);
        x.e0(this, context, iArr, attributeSet2, u9.q(), i11, 0);
        LayoutInflater.from(context).inflate(u9.m(f.j.f8666p2, f.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.search_src_text);
        this.B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.C = findViewById(f.f.search_edit_frame);
        View findViewById = findViewById(f.f.search_plate);
        this.D = findViewById;
        View findViewById2 = findViewById(f.f.submit_area);
        this.E = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.search_button);
        this.F = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.search_go_btn);
        this.G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.search_close_btn);
        this.H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.search_voice_btn);
        this.I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.search_mag_icon);
        this.P = imageView5;
        x.j0(findViewById, u9.f(f.j.f8671q2));
        x.j0(findViewById2, u9.f(f.j.f8691u2));
        int i12 = f.j.f8686t2;
        imageView.setImageDrawable(u9.f(i12));
        imageView2.setImageDrawable(u9.f(f.j.f8656n2));
        imageView3.setImageDrawable(u9.f(f.j.f8641k2));
        imageView4.setImageDrawable(u9.f(f.j.f8701w2));
        imageView5.setImageDrawable(u9.f(i12));
        this.Q = u9.f(f.j.f8681s2);
        d1.a(imageView, getResources().getString(f.h.abc_searchview_description_search));
        this.R = u9.m(f.j.f8696v2, f.g.abc_search_dropdown_item_icons_2line);
        this.S = u9.m(f.j.f8646l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.B0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f690x0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u9.a(f.j.f8661o2, true));
        int e10 = u9.e(f.j.f8626h2, -1);
        if (e10 != -1) {
            setMaxWidth(e10);
        }
        this.V = u9.o(f.j.f8651m2);
        this.f675i0 = u9.o(f.j.f8676r2);
        int j10 = u9.j(f.j.f8636j2, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = u9.j(f.j.f8631i2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(u9.a(f.j.f8621g2, true));
        u9.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.U = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.J = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f671e0);
        g0();
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f681o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f685s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f684r0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = u0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f684r0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = u0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f684r0.getSuggestIntentData();
            }
            if (!(o12 == null || (o10 = u0.o(cursor, "suggest_intent_data_id")) == null)) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return C(str2, o12 == null ? null : Uri.parse(o12), u0.o(cursor, "suggest_intent_extra_data"), u0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f685s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.B.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.N);
        getLocationInWindow(this.O);
        int[] iArr = this.N;
        int i10 = iArr[1];
        int[] iArr2 = this.O;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f671e0 || this.Q == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.B.getTextSize()) * 1.25d);
        this.Q.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.Q), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f684r0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f684r0.getVoiceSearchLaunchWebSearch()) {
            intent = this.T;
        } else if (this.f684r0.getVoiceSearchLaunchRecognizer()) {
            intent = this.U;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f674h0 || this.f679m0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e10) {
                Log.e("SearchView", "Failed launch activity: " + intent, e10);
            }
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor b10 = this.f673g0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        O(D(b10, i11, str));
        return true;
    }

    private void b0() {
        post(this.f686t0);
    }

    private void c0(int i10) {
        CharSequence c10;
        Editable text = this.B.getText();
        Cursor b10 = this.f673g0.b();
        if (b10 != null) {
            if (!b10.moveToPosition(i10) || (c10 = this.f673g0.c(b10)) == null) {
                setQuery(text);
            } else {
                setQuery(c10);
            }
        }
    }

    private void e0() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.B.getText());
        int i10 = 0;
        if (!z10 && (!this.f671e0 || this.f682p0)) {
            z9 = false;
        }
        ImageView imageView = this.H;
        if (!z9) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.H.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.B;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_width);
    }

    private void h0() {
        this.B.setThreshold(this.f684r0.getSuggestThreshold());
        this.B.setImeOptions(this.f684r0.getImeOptions());
        int inputType = this.f684r0.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f684r0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.B.setInputType(inputType);
        v.a aVar = this.f673g0;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f684r0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.f684r0, this.f688v0);
            this.f673g0 = u0Var;
            this.B.setAdapter(u0Var);
            u0 u0Var2 = (u0) this.f673g0;
            if (this.f676j0) {
                i10 = 2;
            }
            u0Var2.x(i10);
        }
    }

    private void i0() {
        this.E.setVisibility((!N() || !(this.G.getVisibility() == 0 || this.I.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z9) {
        this.G.setVisibility((!this.f674h0 || !N() || !hasFocus() || (!z9 && this.f679m0)) ? 8 : 0);
    }

    private void k0(boolean z9) {
        this.f672f0 = z9;
        int i10 = 0;
        int i11 = z9 ? 0 : 8;
        boolean z10 = !TextUtils.isEmpty(this.B.getText());
        this.F.setVisibility(i11);
        j0(z10);
        this.C.setVisibility(z9 ? 8 : 0);
        if (this.P.getDrawable() == null || this.f671e0) {
            i10 = 8;
        }
        this.P.setVisibility(i10);
        e0();
        l0(!z10);
        i0();
    }

    private void l0(boolean z9) {
        int i10 = 8;
        if (this.f679m0 && !L() && z9) {
            this.G.setVisibility(8);
            i10 = 0;
        }
        this.I.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.B.setText(charSequence);
        this.B.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        if (this.J.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.D.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = h1.b(this);
            int dimensionPixelSize = this.f671e0 ? resources.getDimensionPixelSize(f.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(f.d.abc_dropdownitem_text_padding_left) : 0;
            this.B.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.B.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.B.setDropDownWidth((((this.J.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.B.refreshAutoCompleteResults();
            return;
        }
        n nVar = C0;
        nVar.b(this.B);
        nVar.a(this.B);
    }

    public boolean L() {
        return this.f672f0;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.B.getText())) {
            this.B.setText("");
            this.B.requestFocus();
            this.B.setImeVisibility(true);
        } else if (this.f671e0) {
            k kVar = this.f667a0;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i10, int i11, String str) {
        m mVar = this.f669c0;
        if (mVar != null && mVar.b(i10)) {
            return false;
        }
        Q(i10, 0, (String) null);
        this.B.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i10) {
        m mVar = this.f669c0;
        if (mVar != null && mVar.a(i10)) {
            return false;
        }
        c0(i10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.B.requestFocus();
        this.B.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f670d0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.B.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.W;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.f684r0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.B.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i10, KeyEvent keyEvent) {
        if (this.f684r0 != null && this.f673g0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.B.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                this.B.setSelection(i10 == 21 ? 0 : this.B.length());
                this.B.setListSelection(0);
                this.B.clearListSelection();
                this.B.b();
                return true;
            } else if (i10 == 19) {
                this.B.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.B.getText();
        this.f681o0 = text;
        boolean z9 = !TextUtils.isEmpty(text);
        j0(z9);
        l0(!z9);
        e0();
        i0();
        if (this.W != null && !TextUtils.equals(charSequence, this.f680n0)) {
            this.W.a(charSequence.toString());
        }
        this.f680n0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.B.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        Intent E2;
        SearchableInfo searchableInfo = this.f684r0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    E2 = F(this.T, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    E2 = E(this.U, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(E2);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.f682p0) {
            this.f682p0 = true;
            int imeOptions = this.B.getImeOptions();
            this.f683q0 = imeOptions;
            this.B.setImeOptions(imeOptions | 33554432);
            this.B.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f677k0 = true;
        super.clearFocus();
        this.B.clearFocus();
        this.B.setImeVisibility(false);
        this.f677k0 = false;
    }

    public void d0(CharSequence charSequence, boolean z9) {
        this.B.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.B;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f681o0 = charSequence;
        }
        if (z9 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.B.setImeOptions(this.f683q0);
        this.f682p0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr = this.B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.B.getImeOptions();
    }

    public int getInputType() {
        return this.B.getInputType();
    }

    public int getMaxWidth() {
        return this.f678l0;
    }

    public CharSequence getQuery() {
        return this.B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f675i0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f684r0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.V : getContext().getText(this.f684r0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.S;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.R;
    }

    public v.a getSuggestionsAdapter() {
        return this.f673g0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f686t0);
        post(this.f687u0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            I(this.B, this.L);
            Rect rect = this.M;
            Rect rect2 = this.L;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.K;
            if (pVar == null) {
                p pVar2 = new p(this.M, this.L, this.B);
                this.K = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.M, this.L);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f678l0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f678l0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f678l0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f711o);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f711o = L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        b0();
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.f677k0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.B.requestFocus(i10, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f685s0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f671e0 != z9) {
            this.f671e0 = z9;
            k0(z9);
            g0();
        }
    }

    public void setImeOptions(int i10) {
        this.B.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.B.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f678l0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.f667a0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f668b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.W = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f670d0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.f669c0 = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f675i0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.f676j0 = z9;
        v.a aVar = this.f673g0;
        if (aVar instanceof u0) {
            ((u0) aVar).x(z9 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f684r0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.f679m0 = K2;
        if (K2) {
            this.B.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f674h0 = z9;
        k0(L());
    }

    public void setSuggestionsAdapter(v.a aVar) {
        this.f673g0 = aVar;
        this.B.setAdapter(aVar);
    }
}
