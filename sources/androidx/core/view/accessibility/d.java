package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r.e;

public class d {

    /* renamed from: d  reason: collision with root package name */
    private static int f1688d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f1689a;

    /* renamed from: b  reason: collision with root package name */
    public int f1690b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f1691c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e  reason: collision with root package name */
        public static final a f1692e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f1693f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f1694g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f1695h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f1696i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f1697j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f1698k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f1699l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f1700m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f1701n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f1702o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f1703p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f1704q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f1705r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f1706s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f1707t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f1708u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f1709v = new a(131072, (CharSequence) null, g.C0034g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f1710w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f1711x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f1712y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f1713z = new a(2097152, (CharSequence) null, g.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f1714a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1715b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends g.a> f1716c;

        /* renamed from: d  reason: collision with root package name */
        protected final g f1717d;

        static {
            Class<g.c> cls = g.c.class;
            Class<g.b> cls2 = g.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f1700m = new a(256, (CharSequence) null, cls2);
            f1701n = new a(512, (CharSequence) null, cls2);
            f1702o = new a(1024, (CharSequence) null, cls);
            f1703p = new a(2048, (CharSequence) null, cls);
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (g) null, g.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (g) null, g.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (g) null, g.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
            if (i10 >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            U = new a(accessibilityAction, 16908376, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (g) null, (Class<? extends g.a>) null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends g.a> cls) {
            this((Object) null, i10, charSequence, (g) null, cls);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (g) null, (Class<? extends g.a>) null);
        }

        a(Object obj, int i10, CharSequence charSequence, g gVar, Class<? extends g.a> cls) {
            this.f1715b = i10;
            this.f1717d = gVar;
            this.f1714a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f1716c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1714a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1714a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.g r0 = r4.f1717d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.g$a> r2 = r4.f1716c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.g$a r1 = (androidx.core.view.accessibility.g.a) r1     // Catch:{ Exception -> 0x0020 }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.g$a> r1 = r4.f1716c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.g r6 = r4.f1717d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.d.a.c(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f1714a;
            Object obj3 = ((a) obj).f1714a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1714a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String h10 = d.h(this.f1715b);
            if (h10.equals("ACTION_UNKNOWN") && b() != null) {
                h10 = b().toString();
            }
            sb.append(h10);
            return sb.toString();
        }
    }

    private static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f1718a;

        c(Object obj) {
            this.f1718a = obj;
        }

        public static c a(int i10, int i11, boolean z9, int i12) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z9, i12));
        }
    }

    /* renamed from: androidx.core.view.accessibility.d$d  reason: collision with other inner class name */
    public static class C0033d {

        /* renamed from: a  reason: collision with root package name */
        final Object f1719a;

        C0033d(Object obj) {
            this.f1719a = obj;
        }

        public static C0033d a(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
            return new C0033d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9, z10));
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1689a = accessibilityNodeInfo;
    }

    private void H(View view) {
        SparseArray<WeakReference<ClickableSpan>> q9 = q(view);
        if (q9 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < q9.size(); i10++) {
                if (q9.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q9.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void I(int i10, boolean z9) {
        Bundle n10 = n();
        if (n10 != null) {
            int i11 = n10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z9) {
                i10 = 0;
            }
            n10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public static d U(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    private void c(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void e() {
        b.a(this.f1689a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f1689a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f1689a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f1689a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f1689a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.a(this.f1689a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> o(View view) {
        SparseArray<WeakReference<ClickableSpan>> q9 = q(view);
        if (q9 != null) {
            return q9;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> q(View view) {
        return (SparseArray) view.getTag(e.tag_accessibility_clickable_spans);
    }

    private boolean u() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int v(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f1688d;
        f1688d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f1689a.isFocusable();
    }

    public boolean B() {
        return this.f1689a.isFocused();
    }

    public boolean C() {
        return this.f1689a.isLongClickable();
    }

    public boolean D() {
        return this.f1689a.isPassword();
    }

    public boolean E() {
        return this.f1689a.isScrollable();
    }

    public boolean F() {
        return this.f1689a.isSelected();
    }

    public boolean G(int i10, Bundle bundle) {
        return this.f1689a.performAction(i10, bundle);
    }

    public void J(boolean z9) {
        this.f1689a.setCheckable(z9);
    }

    public void K(boolean z9) {
        this.f1689a.setChecked(z9);
    }

    public void L(CharSequence charSequence) {
        this.f1689a.setClassName(charSequence);
    }

    public void M(Object obj) {
        this.f1689a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f1718a);
    }

    public void N(Object obj) {
        this.f1689a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0033d) obj).f1719a);
    }

    public void O(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1689a.setHeading(z9);
        } else {
            I(2, z9);
        }
    }

    public void P(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1689a.setPaneTitle(charSequence);
        } else {
            b.a(this.f1689a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void Q(boolean z9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1689a.setScreenReaderFocusable(z9);
        } else {
            I(1, z9);
        }
    }

    public void R(boolean z9) {
        this.f1689a.setScrollable(z9);
    }

    public void S(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f1689a.setStateDescription(charSequence);
        } else {
            b.a(this.f1689a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public AccessibilityNodeInfo T() {
        return this.f1689a;
    }

    public void a(int i10) {
        this.f1689a.addAction(i10);
    }

    public void b(a aVar) {
        this.f1689a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1714a);
    }

    public void d(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            e();
            H(view);
            ClickableSpan[] l10 = l(charSequence);
            if (l10 != null && l10.length > 0) {
                n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", e.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> o10 = o(view);
                for (int i10 = 0; i10 < l10.length; i10++) {
                    int v9 = v(l10[i10], o10);
                    o10.put(v9, new WeakReference(l10[i10]));
                    c(l10[i10], (Spanned) charSequence, v9);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1689a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f1689a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f1689a)) {
            return false;
        }
        return this.f1691c == dVar.f1691c && this.f1690b == dVar.f1690b;
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1689a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1689a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public void i(Rect rect) {
        this.f1689a.getBoundsInParent(rect);
    }

    public void j(Rect rect) {
        this.f1689a.getBoundsInScreen(rect);
    }

    public CharSequence k() {
        return this.f1689a.getClassName();
    }

    public CharSequence m() {
        return this.f1689a.getContentDescription();
    }

    public Bundle n() {
        return b.a(this.f1689a);
    }

    public CharSequence p() {
        return this.f1689a.getPackageName();
    }

    public CharSequence r() {
        if (!u()) {
            return this.f1689a.getText();
        }
        List<Integer> f10 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> f11 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> f12 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> f13 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1689a.getText(), 0, this.f1689a.getText().length()));
        for (int i10 = 0; i10 < f10.size(); i10++) {
            spannableString.setSpan(new a(f13.get(i10).intValue(), this, n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), f10.get(i10).intValue(), f11.get(i10).intValue(), f12.get(i10).intValue());
        }
        return spannableString;
    }

    public String s() {
        return androidx.core.os.a.c() ? this.f1689a.getUniqueId() : b.a(this.f1689a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String t() {
        return this.f1689a.getViewIdResourceName();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        i(rect);
        sb.append("; boundsInParent: " + rect);
        j(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(p());
        sb.append("; className: ");
        sb.append(k());
        sb.append("; text: ");
        sb.append(r());
        sb.append("; contentDescription: ");
        sb.append(m());
        sb.append("; viewId: ");
        sb.append(t());
        sb.append("; uniqueId: ");
        sb.append(s());
        sb.append("; checkable: ");
        sb.append(w());
        sb.append("; checked: ");
        sb.append(x());
        sb.append("; focusable: ");
        sb.append(A());
        sb.append("; focused: ");
        sb.append(B());
        sb.append("; selected: ");
        sb.append(F());
        sb.append("; clickable: ");
        sb.append(y());
        sb.append("; longClickable: ");
        sb.append(C());
        sb.append("; enabled: ");
        sb.append(z());
        sb.append("; password: ");
        sb.append(D());
        sb.append("; scrollable: " + E());
        sb.append("; [");
        List<a> g10 = g();
        for (int i10 = 0; i10 < g10.size(); i10++) {
            a aVar = g10.get(i10);
            String h10 = h(aVar.a());
            if (h10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                h10 = aVar.b().toString();
            }
            sb.append(h10);
            if (i10 != g10.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean w() {
        return this.f1689a.isCheckable();
    }

    public boolean x() {
        return this.f1689a.isChecked();
    }

    public boolean y() {
        return this.f1689a.isClickable();
    }

    public boolean z() {
        return this.f1689a.isEnabled();
    }
}
