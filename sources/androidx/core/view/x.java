package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f1807a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap<View, d0> f1808b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Field f1809c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1810d = false;

    /* renamed from: e  reason: collision with root package name */
    private static ThreadLocal<Rect> f1811e;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1812f = {r.e.accessibility_custom_action_0, r.e.accessibility_custom_action_1, r.e.accessibility_custom_action_2, r.e.accessibility_custom_action_3, r.e.accessibility_custom_action_4, r.e.accessibility_custom_action_5, r.e.accessibility_custom_action_6, r.e.accessibility_custom_action_7, r.e.accessibility_custom_action_8, r.e.accessibility_custom_action_9, r.e.accessibility_custom_action_10, r.e.accessibility_custom_action_11, r.e.accessibility_custom_action_12, r.e.accessibility_custom_action_13, r.e.accessibility_custom_action_14, r.e.accessibility_custom_action_15, r.e.accessibility_custom_action_16, r.e.accessibility_custom_action_17, r.e.accessibility_custom_action_18, r.e.accessibility_custom_action_19, r.e.accessibility_custom_action_20, r.e.accessibility_custom_action_21, r.e.accessibility_custom_action_22, r.e.accessibility_custom_action_23, r.e.accessibility_custom_action_24, r.e.accessibility_custom_action_25, r.e.accessibility_custom_action_26, r.e.accessibility_custom_action_27, r.e.accessibility_custom_action_28, r.e.accessibility_custom_action_29, r.e.accessibility_custom_action_30, r.e.accessibility_custom_action_31};

    /* renamed from: g  reason: collision with root package name */
    private static final u f1813g = w.f1806m;

    /* renamed from: h  reason: collision with root package name */
    private static final e f1814h = new e();

    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.a(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: m  reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f1815m = new WeakHashMap<>();

        e() {
        }

        private void b(View view, boolean z9) {
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (z9 != z10) {
                x.U(view, z10 ? 16 : 32);
                this.f1815m.put(view, Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            this.f1815m.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f1815m.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f1815m.entrySet()) {
                    b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f1816a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f1817b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1818c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1819d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f1816a = i10;
            this.f1817b = cls;
            this.f1819d = i11;
            this.f1818c = i12;
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f1818c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        public abstract T d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, T t9);

        /* access modifiers changed from: package-private */
        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T tag = view.getTag(this.f1816a);
            if (this.f1817b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, T t9) {
            if (c()) {
                e(view, t9);
            } else if (b() && h(f(view), t9)) {
                x.j(view);
                view.setTag(this.f1816a, t9);
                x.U(view, this.f1819d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(T t9, T t10);
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z9) {
            view.setHasTransientState(z9);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            h0 f1820a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f1821b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ s f1822c;

            a(View view, s sVar) {
                this.f1821b = view;
                this.f1822c = sVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                h0 w9 = h0.w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f1821b);
                    if (w9.equals(this.f1820a)) {
                        return this.f1822c.a(view, w9).u();
                    }
                }
                this.f1820a = w9;
                h0 a10 = this.f1822c.a(view, w9);
                if (i10 >= 30) {
                    return a10.u();
                }
                x.d0(view);
                return a10.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(r.e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static h0 b(View view, h0 h0Var, Rect rect) {
            WindowInsets u9 = h0Var.u();
            if (u9 != null) {
                return h0.w(view.computeSystemWindowInsets(u9, rect), view);
            }
            rect.setEmpty();
            return h0Var;
        }

        static boolean c(View view, float f10, float f11, boolean z9) {
            return view.dispatchNestedFling(f10, f11, z9);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static h0 j(View view) {
            return h0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z9) {
            view.setNestedScrollingEnabled(z9);
        }

        static void u(View view, s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(r.e.tag_on_apply_window_listener, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(r.e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, sVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static h0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            h0 v9 = h0.v(rootWindowInsets);
            v9.s(v9);
            v9.d(view.getRootView());
            return v9;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z9) {
            view.setFocusedByDefault(z9);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z9) {
            view.setKeyboardNavigationCluster(z9);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class p {
        static void a(View view, u uVar) {
            int i10 = r.e.tag_unhandled_key_listeners;
            p.g gVar = (p.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new p.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(uVar);
            y yVar = new y(uVar);
            gVar.put(uVar, yVar);
            view.addOnUnhandledKeyEventListener(yVar);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p.g gVar = (p.g) view.getTag(r.e.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        static void g(View view, boolean z9) {
            view.setAccessibilityHeading(z9);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z9) {
            view.setScreenReaderFocusable(z9);
        }
    }

    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class r {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo f10 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? cVar : c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, t tVar) {
            if (tVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(tVar));
            }
        }
    }

    private static final class t implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final t f1823a;

        t(t tVar) {
            this.f1823a = tVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c g10 = c.g(contentInfo);
            c a10 = this.f1823a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class v {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1824d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1825a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1826b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f1827c = null;

        v() {
        }

        static v a(View view) {
            int i10 = r.e.tag_unhandled_key_event_manager;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1825a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1826b == null) {
                this.f1826b = new SparseArray<>();
            }
            return this.f1826b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(r.e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1825a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f1824d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f1825a == null) {
                        this.f1825a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f1824d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f1825a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1825a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        /* access modifiers changed from: package-private */
        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1827c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1827c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && x.O(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return h.d(view);
    }

    public static void A0(View view, int i10) {
        if (view instanceof m) {
            ((m) view).a(i10);
        } else if (i10 == 0) {
            z0(view);
        }
    }

    public static int B(View view) {
        return h.e(view);
    }

    private static void B0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(r.e.tag_on_receive_content_mime_types);
    }

    public static int D(View view) {
        return i.e(view);
    }

    public static int E(View view) {
        return i.f(view);
    }

    public static h0 F(View view) {
        return Build.VERSION.SDK_INT >= 23 ? n.a(view) : m.j(view);
    }

    public static CharSequence G(View view) {
        return y0().f(view);
    }

    public static String H(View view) {
        return m.k(view);
    }

    @Deprecated
    public static int I(View view) {
        return h.g(view);
    }

    public static float J(View view) {
        return m.m(view);
    }

    public static boolean K(View view) {
        return g.a(view);
    }

    public static boolean L(View view) {
        return h.h(view);
    }

    public static boolean M(View view) {
        return h.i(view);
    }

    public static boolean N(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean O(View view) {
        return k.b(view);
    }

    public static boolean P(View view) {
        return k.c(view);
    }

    public static boolean Q(View view) {
        return m.p(view);
    }

    public static boolean R(View view) {
        return i.g(view);
    }

    public static boolean S(View view) {
        Boolean f10 = f0().f(view);
        return f10 != null && f10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c T(c cVar) {
        return cVar;
    }

    static void U(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (n(view) != 0 || z9) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z9) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                k.g(obtain, i10);
                if (z9) {
                    obtain.getText().add(o(view));
                    x0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void V(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect u9 = u();
        boolean z9 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            u9.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !u9.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i10);
        if (z9 && u9.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(u9);
        }
    }

    public static void W(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect u9 = u();
        boolean z9 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            u9.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !u9.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        e(view, i10);
        if (z9 && u9.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(u9);
        }
    }

    public static h0 X(View view, h0 h0Var) {
        WindowInsets u9 = h0Var.u();
        if (u9 != null) {
            WindowInsets b10 = l.b(view, u9);
            if (!b10.equals(u9)) {
                return h0.w(b10, view);
            }
        }
        return h0Var;
    }

    private static f<CharSequence> Y() {
        return new b(r.e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static c Z(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, cVar);
        }
        t tVar = (t) view.getTag(r.e.tag_on_receive_content_listener);
        if (tVar == null) {
            return v(view).a(cVar);
        }
        c a10 = tVar.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return v(view).a(a10);
    }

    public static void a0(View view) {
        h.k(view);
    }

    private static f<Boolean> b() {
        return new d(r.e.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void b0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static d0 c(View view) {
        if (f1808b == null) {
            f1808b = new WeakHashMap<>();
        }
        d0 d0Var = f1808b.get(view);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(view);
        f1808b.put(view, d0Var2);
        return d0Var2;
    }

    @SuppressLint({"LambdaLast"})
    public static void c0(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    private static void d(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            B0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                B0((View) parent);
            }
        }
    }

    public static void d0(View view) {
        l.c(view);
    }

    private static void e(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            B0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                B0((View) parent);
            }
        }
    }

    public static void e0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static h0 f(View view, h0 h0Var, Rect rect) {
        return m.b(view, h0Var, rect);
    }

    private static f<Boolean> f0() {
        return new a(r.e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static h0 g(View view, h0 h0Var) {
        WindowInsets u9 = h0Var.u();
        if (u9 != null) {
            WindowInsets a10 = l.a(view, u9);
            if (!a10.equals(u9)) {
                return h0.w(a10, view);
            }
        }
        return h0Var;
    }

    public static void g0(View view, a aVar) {
        if (aVar == null && (l(view) instanceof a.C0031a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view, boolean z9) {
        b().g(view, Boolean.valueOf(z9));
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, CharSequence charSequence) {
        Y().g(view, charSequence);
        if (charSequence != null) {
            f1814h.a(view);
        } else {
            f1814h.d(view);
        }
    }

    static void j(View view) {
        a k10 = k(view);
        if (k10 == null) {
            k10 = new a();
        }
        g0(view, k10);
    }

    public static void j0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static a k(View view) {
        View.AccessibilityDelegate l10 = l(view);
        if (l10 == null) {
            return null;
        }
        return l10 instanceof a.C0031a ? ((a.C0031a) l10).f1683a : new a(l10);
    }

    public static void k0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z9 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background != null && z9) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    private static View.AccessibilityDelegate l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : m(view);
    }

    public static void l0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z9 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background != null && z9) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        if (f1810d) {
            return null;
        }
        if (f1809c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1809c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1810d = true;
                return null;
            }
        }
        try {
            Object obj = f1809c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1810d = true;
            return null;
        }
    }

    public static void m0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static int n(View view) {
        return k.a(view);
    }

    public static void n0(View view, float f10) {
        m.s(view, f10);
    }

    public static CharSequence o(View view) {
        return Y().f(view);
    }

    @Deprecated
    public static void o0(View view, boolean z9) {
        view.setFitsSystemWindows(z9);
    }

    public static ColorStateList p(View view) {
        return m.g(view);
    }

    public static void p0(View view, boolean z9) {
        h.r(view, z9);
    }

    public static PorterDuff.Mode q(View view) {
        return m.h(view);
    }

    public static void q0(View view, int i10) {
        h.s(view, i10);
    }

    public static Rect r(View view) {
        return j.a(view);
    }

    public static void r0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i10);
        }
    }

    public static Display s(View view) {
        return i.b(view);
    }

    public static void s0(View view, s sVar) {
        m.u(view, sVar);
    }

    public static float t(View view) {
        return m.i(view);
    }

    public static void t0(View view, int i10, int i11, int i12, int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    private static Rect u() {
        if (f1811e == null) {
            f1811e = new ThreadLocal<>();
        }
        Rect rect = f1811e.get();
        if (rect == null) {
            rect = new Rect();
            f1811e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void u0(View view, boolean z9) {
        f0().g(view, Boolean.valueOf(z9));
    }

    private static u v(View view) {
        return view instanceof u ? (u) view : f1813g;
    }

    public static void v0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static boolean w(View view) {
        return h.b(view);
    }

    public static void w0(View view, String str) {
        m.v(view, str);
    }

    public static int x(View view) {
        return h.c(view);
    }

    private static void x0(View view) {
        if (x(view) == 0) {
            q0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (x((View) parent) == 4) {
                q0(view, 2);
                return;
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    private static f<CharSequence> y0() {
        return new c(r.e.tag_state_description, CharSequence.class, 64, 30);
    }

    public static int z(View view) {
        return i.d(view);
    }

    public static void z0(View view) {
        m.z(view);
    }
}
