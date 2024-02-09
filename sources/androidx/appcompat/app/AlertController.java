package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.m0;
import androidx.core.view.x;
import androidx.core.widget.NestedScrollView;
import f.j;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f227a;

    /* renamed from: b  reason: collision with root package name */
    final g f228b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f229c;

    /* renamed from: d  reason: collision with root package name */
    private final int f230d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f231e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f232f;

    /* renamed from: g  reason: collision with root package name */
    ListView f233g;

    /* renamed from: h  reason: collision with root package name */
    private View f234h;

    /* renamed from: i  reason: collision with root package name */
    private int f235i;

    /* renamed from: j  reason: collision with root package name */
    private int f236j;

    /* renamed from: k  reason: collision with root package name */
    private int f237k;

    /* renamed from: l  reason: collision with root package name */
    private int f238l;

    /* renamed from: m  reason: collision with root package name */
    private int f239m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f240n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f241o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f242p;

    /* renamed from: q  reason: collision with root package name */
    Message f243q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f244r;

    /* renamed from: s  reason: collision with root package name */
    Button f245s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f246t;

    /* renamed from: u  reason: collision with root package name */
    Message f247u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f248v;

    /* renamed from: w  reason: collision with root package name */
    Button f249w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f250x;

    /* renamed from: y  reason: collision with root package name */
    Message f251y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f252z;

    public static class RecycleListView extends ListView {

        /* renamed from: m  reason: collision with root package name */
        private final int f253m;

        /* renamed from: n  reason: collision with root package name */
        private final int f254n;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8601c2);
            this.f254n = obtainStyledAttributes.getDimensionPixelOffset(j.f8606d2, -1);
            this.f253m = obtainStyledAttributes.getDimensionPixelOffset(j.f8611e2, -1);
        }

        public void a(boolean z9, boolean z10) {
            if (!z10 || !z9) {
                setPadding(getPaddingLeft(), z9 ? getPaddingTop() : this.f253m, getPaddingRight(), z10 ? getPaddingBottom() : this.f254n);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f251y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f241o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f243q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f245s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f247u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f249w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f251y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f228b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f257b;

        b(View view, View view2) {
            this.f256a = view;
            this.f257b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.f(nestedScrollView, this.f256a, this.f257b);
        }
    }

    class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f259m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f260n;

        c(View view, View view2) {
            this.f259m = view;
            this.f260n = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.A, this.f259m, this.f260n);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f263b;

        d(View view, View view2) {
            this.f262a = view;
            this.f263b = view2;
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.f(absListView, this.f262a, this.f263b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f265m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f266n;

        e(View view, View view2) {
            this.f265m = view;
            this.f266n = view2;
        }

        public void run() {
            AlertController.f(AlertController.this.f233g, this.f265m, this.f266n);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public boolean P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f268a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f269b;

        /* renamed from: c  reason: collision with root package name */
        public int f270c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f271d;

        /* renamed from: e  reason: collision with root package name */
        public int f272e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f273f;

        /* renamed from: g  reason: collision with root package name */
        public View f274g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f275h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f276i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f277j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f278k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f279l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f280m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f281n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f282o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f283p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f284q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f285r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f286s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f287t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f288u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f289v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f290w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f291x;

        /* renamed from: y  reason: collision with root package name */
        public int f292y;

        /* renamed from: z  reason: collision with root package name */
        public View f293z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ RecycleListView f294m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f294m = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f294m.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: m  reason: collision with root package name */
            private final int f296m;

            /* renamed from: n  reason: collision with root package name */
            private final int f297n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ RecycleListView f298o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ AlertController f299p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z9, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z9);
                this.f298o = recycleListView;
                this.f299p = alertController;
                Cursor cursor2 = getCursor();
                this.f296m = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f297n = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f296m));
                RecycleListView recycleListView = this.f298o;
                int position = cursor.getPosition();
                boolean z9 = true;
                if (cursor.getInt(this.f297n) != 1) {
                    z9 = false;
                }
                recycleListView.setItemChecked(position, z9);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f269b.inflate(this.f299p.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ AlertController f301m;

            c(AlertController alertController) {
                this.f301m = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f291x.onClick(this.f301m.f228b, i10);
                if (!f.this.H) {
                    this.f301m.f228b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ RecycleListView f303m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ AlertController f304n;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f303m = recycleListView;
                this.f304n = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f303m.isItemChecked(i10);
                }
                f.this.J.onClick(this.f304n.f228b, i10, this.f303m.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f268a = context;
            this.f285r = true;
            this.f269b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f269b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f268a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f289v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f268a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f268a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f290w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f268a
                java.lang.CharSequence[] r3 = r10.f289v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f291x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f233g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f274g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f273f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f271d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f270c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f272e;
                if (i11 != 0) {
                    alertController.m(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f275h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f276i;
            if (!(charSequence3 == null && this.f277j == null)) {
                alertController.k(-1, charSequence3, this.f278k, (Message) null, this.f277j);
            }
            CharSequence charSequence4 = this.f279l;
            if (!(charSequence4 == null && this.f280m == null)) {
                alertController.k(-2, charSequence4, this.f281n, (Message) null, this.f280m);
            }
            CharSequence charSequence5 = this.f282o;
            if (!(charSequence5 == null && this.f283p == null)) {
                alertController.k(-3, charSequence5, this.f284q, (Message) null, this.f283p);
            }
            if (!(this.f289v == null && this.K == null && this.f290w == null)) {
                b(alertController);
            }
            View view2 = this.f293z;
            if (view2 == null) {
                int i12 = this.f292y;
                if (i12 != 0) {
                    alertController.r(i12);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f306a;

        public g(DialogInterface dialogInterface) {
            this.f306a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f306a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g gVar, Window window) {
        this.f227a = context;
        this.f228b = gVar;
        this.f229c = window;
        this.R = new g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.F, f.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(j.M, true);
        this.f230d = obtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        obtainStyledAttributes.recycle();
        gVar.e(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return i10 == 0 ? this.J : this.Q == 1 ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f229c.findViewById(f.f.scrollIndicatorUp);
        View findViewById2 = this.f229c.findViewById(f.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            x.v0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i10 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i10 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f232f != null) {
                    this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                    this.A.post(new c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f233g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(findViewById, findViewById2));
                    this.f233g.post(new e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        boolean z9;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f241o = button2;
        button2.setOnClickListener(this.S);
        boolean z10 = true;
        if (!TextUtils.isEmpty(this.f242p) || this.f244r != null) {
            this.f241o.setText(this.f242p);
            Drawable drawable = this.f244r;
            if (drawable != null) {
                int i10 = this.f230d;
                drawable.setBounds(0, 0, i10, i10);
                this.f241o.setCompoundDrawables(this.f244r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f241o.setVisibility(0);
            z9 = true;
        } else {
            this.f241o.setVisibility(8);
            z9 = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f245s = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f246t) || this.f248v != null) {
            this.f245s.setText(this.f246t);
            Drawable drawable2 = this.f248v;
            if (drawable2 != null) {
                int i11 = this.f230d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f245s.setCompoundDrawables(this.f248v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f245s.setVisibility(0);
            z9 |= true;
        } else {
            this.f245s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f249w = button4;
        button4.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f250x) || this.f252z != null) {
            this.f249w.setText(this.f250x);
            Drawable drawable3 = this.f252z;
            if (drawable3 != null) {
                int i12 = this.f230d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f249w.setCompoundDrawables(this.f252z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f249w.setVisibility(0);
            z9 |= true;
        } else {
            this.f249w.setVisibility(8);
        }
        if (z(this.f227a)) {
            if (z9) {
                button = this.f241o;
            } else if (z9) {
                button = this.f245s;
            } else if (z9) {
                button = this.f249w;
            }
            b(button);
        }
        if (!z9) {
            z10 = false;
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f229c.findViewById(f.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f232f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f233g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f233g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f234h;
        boolean z9 = false;
        if (view == null) {
            view = this.f235i != 0 ? LayoutInflater.from(this.f227a).inflate(this.f235i, viewGroup, false) : null;
        }
        if (view != null) {
            z9 = true;
        }
        if (!z9 || !a(view)) {
            this.f229c.setFlags(131072, 131072);
        }
        if (z9) {
            FrameLayout frameLayout = (FrameLayout) this.f229c.findViewById(f.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f240n) {
                frameLayout.setPadding(this.f236j, this.f237k, this.f238l, this.f239m);
            }
            if (this.f233g != null) {
                ((m0.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f229c.findViewById(f.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f229c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f231e)) || !this.P) {
            this.f229c.findViewById(f.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f229c.findViewById(f.f.alertTitle);
        this.E = textView;
        textView.setText(this.f231e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f229c.findViewById(f.f.parentPanel);
        int i10 = f.f.topPanel;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = f.f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = f.f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f.customPanel);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup i13 = i(findViewById7, findViewById4);
        ViewGroup i14 = i(findViewById8, findViewById5);
        ViewGroup i15 = i(findViewById9, findViewById6);
        v(i14);
        u(i15);
        x(i13);
        char c10 = 0;
        boolean z9 = viewGroup.getVisibility() != 8;
        boolean z10 = (i13 == null || i13.getVisibility() == 8) ? false : true;
        boolean z11 = (i15 == null || i15.getVisibility() == 8) ? false : true;
        if (!(z11 || i14 == null || (findViewById2 = i14.findViewById(f.f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z10) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f232f == null && this.f233g == null)) {
                view = i13.findViewById(f.f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i14 == null || (findViewById = i14.findViewById(f.f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f233g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z10, z11);
        }
        if (!z9) {
            View view2 = this.f233g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z11) {
                    c10 = 2;
                }
                p(i14, view2, z10 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f233g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i16 = this.I;
            if (i16 > -1) {
                listView2.setItemChecked(i16, true);
                listView2.setSelection(i16);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f227a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f233g;
    }

    public void e() {
        this.f228b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f250x = charSequence;
            this.f251y = message;
            this.f252z = drawable;
        } else if (i10 == -2) {
            this.f246t = charSequence;
            this.f247u = message;
            this.f248v = drawable;
        } else if (i10 == -1) {
            this.f242p = charSequence;
            this.f243q = message;
            this.f244r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f232f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f231e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f234h = null;
        this.f235i = i10;
        this.f240n = false;
    }

    public void s(View view) {
        this.f234h = view;
        this.f235i = 0;
        this.f240n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f234h = view;
        this.f235i = 0;
        this.f240n = true;
        this.f236j = i10;
        this.f237k = i11;
        this.f238l = i12;
        this.f239m = i13;
    }
}
