package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@TargetApi(17)
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused = false;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* renamed from: m  reason: collision with root package name */
        private final a f10059m;

        /* renamed from: n  reason: collision with root package name */
        private final View f10060n;

        public a(Context context, a aVar, View view) {
            super(context);
            this.f10059m = aVar;
            this.f10060n = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10059m.b(this.f10060n, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* renamed from: m  reason: collision with root package name */
        private final Rect f10061m = new Rect();

        /* renamed from: n  reason: collision with root package name */
        private final Rect f10062n = new Rect();

        public b(Context context) {
            super(context);
        }

        private static int a(int i10) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f10061m.set(i10, i11, i12, i13);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f10061m, layoutParams.x, layoutParams.y, this.f10062n);
                Rect rect = this.f10062n;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                getChildAt(i12).measure(a(i10), a(i11));
            }
            super.onMeasure(i10, i11);
        }
    }

    private static class c extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final InputMethodManager f10063a;

        c(Context context) {
            this(context, (InputMethodManager) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private c(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f10063a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }

        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f10063a);
        }

        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f10063a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        private final f f10064a;

        /* renamed from: b  reason: collision with root package name */
        private WindowManager f10065b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f10066c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f10064a = fVar;
            this.f10066c = context2;
        }

        private WindowManager a() {
            if (this.f10065b == null) {
                this.f10065b = this.f10064a.b();
            }
            return this.f10065b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i10 = 0;
            while (i10 < stackTrace.length && i10 < 11) {
                if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                    return true;
                }
                i10++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f10066c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public f f10067a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public f f10068b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public b f10069c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final WindowManager f10070a;

        /* renamed from: b  reason: collision with root package name */
        b f10071b;

        f(WindowManager windowManager, b bVar) {
            this.f10070a = windowManager;
            this.f10071b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f10071b;
            if (bVar == null) {
                x6.b.g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f10071b;
            if (bVar == null) {
                x6.b.g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView(objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f10071b == null) {
                x6.b.g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = objArr[0];
            view.clearAnimation();
            this.f10071b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f10071b;
            if (bVar == null) {
                x6.b.g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.hashCode();
            char c10 = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    a(objArr);
                    return null;
                case 1:
                    d(objArr);
                    return null;
                case 2:
                    e(objArr);
                    return null;
                case 3:
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f10070a, objArr);
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z9) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z9;
    }

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        f unused = eVar.f10067a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public f getView() {
        return this.state.f10067a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f10069c == null) {
            b unused = this.state.f10069c = new b(getContext());
        }
        if (this.state.f10068b == null) {
            e eVar = this.state;
            f unused2 = eVar.f10068b = new f((WindowManager) getContext().getSystemService("window"), eVar.f10069c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f10068b, this.outerContext);
        View I = this.state.f10067a.I();
        if (I.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) I.getContext()).setBaseContext(dVar);
        } else {
            x6.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(I);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, I);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f10069c);
        I.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            I.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
