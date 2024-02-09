package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import d8.h;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.view.c;
import j7.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m7.a;

public class k extends FrameLayout implements a.c, s.e {
    private a A;
    private io.flutter.view.c B;
    private TextServicesManager C;
    private z D;
    private final a.g E;
    private final c.k F;
    private final ContentObserver G;
    private final j7.b H;
    private final androidx.core.util.a<WindowLayoutInfo> I;

    /* renamed from: m  reason: collision with root package name */
    private h f9728m;

    /* renamed from: n  reason: collision with root package name */
    private i f9729n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public g f9730o;

    /* renamed from: p  reason: collision with root package name */
    j7.c f9731p;

    /* renamed from: q  reason: collision with root package name */
    private j7.c f9732q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Set<j7.b> f9733r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f9734s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public io.flutter.embedding.engine.a f9735t;

    /* renamed from: u  reason: collision with root package name */
    private final Set<f> f9736u;

    /* renamed from: v  reason: collision with root package name */
    private m7.a f9737v;

    /* renamed from: w  reason: collision with root package name */
    private io.flutter.plugin.editing.f f9738w;

    /* renamed from: x  reason: collision with root package name */
    private io.flutter.plugin.editing.d f9739x;

    /* renamed from: y  reason: collision with root package name */
    private l7.a f9740y;

    /* renamed from: z  reason: collision with root package name */
    private s f9741z;

    class a implements c.k {
        a() {
        }

        public void a(boolean z9, boolean z10) {
            k.this.C(z9, z10);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z9) {
            super.onChange(z9);
            if (k.this.f9735t != null) {
                x6.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                k.this.E();
            }
        }
    }

    class c implements j7.b {
        c() {
        }

        public void c() {
            boolean unused = k.this.f9734s = false;
            for (j7.b c10 : k.this.f9733r) {
                c10.c();
            }
        }

        public void f() {
            boolean unused = k.this.f9734s = true;
            for (j7.b f10 : k.this.f9733r) {
                f10.f();
            }
        }
    }

    class d implements androidx.core.util.a<WindowLayoutInfo> {
        d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements j7.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j7.a f9746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f9747b;

        e(j7.a aVar, Runnable runnable) {
            this.f9746a = aVar;
            this.f9747b = runnable;
        }

        public void c() {
        }

        public void f() {
            this.f9746a.q(this);
            this.f9747b.run();
            k kVar = k.this;
            if (!(kVar.f9731p instanceof g) && kVar.f9730o != null) {
                k.this.f9730o.d();
                k.this.z();
            }
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f9733r = new HashSet();
        this.f9736u = new HashSet();
        this.E = new a.g();
        this.F = new a();
        this.G = new b(new Handler(Looper.getMainLooper()));
        this.H = new c();
        this.I = new d();
        this.f9728m = hVar;
        this.f9731p = hVar;
        w();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f9733r = new HashSet();
        this.f9736u = new HashSet();
        this.E = new a.g();
        this.F = new a();
        this.G = new b(new Handler(Looper.getMainLooper()));
        this.H = new c();
        this.I = new d();
        this.f9729n = iVar;
        this.f9731p = iVar;
        w();
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* access modifiers changed from: private */
    public void C(boolean z9, boolean z10) {
        boolean z11 = false;
        if (!this.f9735t.r().l() && !z9 && !z10) {
            z11 = true;
        }
        setWillNotDraw(z11);
    }

    private void F() {
        if (!x()) {
            x6.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.E.f10837a = getResources().getDisplayMetrics().density;
        this.E.f10852p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f9735t.r().t(this.E);
    }

    private g p() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int u(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void w() {
        View view;
        x6.b.f("FlutterView", "Initializing FlutterView");
        if (this.f9728m != null) {
            x6.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f9728m;
        } else if (this.f9729n != null) {
            x6.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f9729n;
        } else {
            x6.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f9730o;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        g gVar = this.f9730o;
        if (gVar != null) {
            gVar.f();
            removeView(this.f9730o);
            this.f9730o = null;
        }
    }

    public void A(f fVar) {
        this.f9736u.remove(fVar);
    }

    public void B(j7.b bVar) {
        this.f9733r.remove(bVar);
    }

    public void D(Runnable runnable) {
        if (this.f9730o == null) {
            x6.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        j7.c cVar = this.f9732q;
        if (cVar == null) {
            x6.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f9731p = cVar;
        this.f9732q = null;
        j7.a r9 = this.f9735t.r();
        if (this.f9735t == null || r9 == null) {
            this.f9730o.d();
            z();
            runnable.run();
            return;
        }
        this.f9731p.c(r9);
        r9.g(new e(r9, runnable));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            io.flutter.embedding.engine.systemchannels.n$b r0 = io.flutter.embedding.engine.systemchannels.n.b.dark
            goto L_0x001c
        L_0x001a:
            io.flutter.embedding.engine.systemchannels.n$b r0 = io.flutter.embedding.engine.systemchannels.n.b.light
        L_0x001c:
            android.view.textservice.TextServicesManager r3 = r6.C
            if (r3 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x003e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = io.flutter.embedding.android.j.f9727a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.C
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            io.flutter.embedding.engine.a r4 = r6.f9735t
            io.flutter.embedding.engine.systemchannels.n r4 = r4.t()
            io.flutter.embedding.engine.systemchannels.n$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            io.flutter.embedding.engine.systemchannels.n$a r4 = r4.e(r5)
            io.flutter.embedding.engine.systemchannels.n$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L_0x006e
            r1 = 1
        L_0x006e:
            io.flutter.embedding.engine.systemchannels.n$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.n$a r1 = r1.f(r2)
            io.flutter.embedding.engine.systemchannels.n$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.k.E():void");
    }

    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f9738w.j(sparseArray);
    }

    @TargetApi(24)
    public PointerIcon b(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public boolean c(KeyEvent keyEvent) {
        return this.f9738w.r(keyEvent);
    }

    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f9735t;
        return aVar != null ? aVar.p().H(view) : super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (x() && this.f9741z.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.B;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.B;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f9735t;
    }

    public k7.c getBinaryMessenger() {
        return this.f9735t.j();
    }

    public g getCurrentImageSurface() {
        return this.f9730o;
    }

    public boolean k() {
        g gVar = this.f9730o;
        if (gVar != null) {
            return gVar.a();
        }
        return false;
    }

    public void l(f fVar) {
        this.f9736u.add(fVar);
    }

    public void m(j7.b bVar) {
        this.f9733r.add(bVar);
    }

    public void n(g gVar) {
        io.flutter.embedding.engine.a aVar = this.f9735t;
        if (aVar != null) {
            gVar.c(aVar.r());
        }
    }

    public void o(io.flutter.embedding.engine.a aVar) {
        x6.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (x()) {
            if (aVar == this.f9735t) {
                x6.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                x6.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                t();
            }
        }
        this.f9735t = aVar;
        j7.a r9 = aVar.r();
        this.f9734s = r9.k();
        this.f9731p.c(r9);
        r9.g(this.H);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9737v = new m7.a(this, this.f9735t.m());
        }
        this.f9738w = new io.flutter.plugin.editing.f(this, this.f9735t.w(), this.f9735t.p());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.C = textServicesManager;
            this.f9739x = new io.flutter.plugin.editing.d(textServicesManager, this.f9735t.u());
        } catch (Exception unused) {
            x6.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f9740y = this.f9735t.l();
        this.f9741z = new s(this);
        this.A = new a(this.f9735t.r(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f9735t.p());
        this.B = cVar;
        cVar.Y(this.F);
        C(this.B.C(), this.B.D());
        this.f9735t.p().a(this.B);
        this.f9735t.p().F(this.f9735t.r());
        this.f9738w.q().restartInput(this);
        E();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.G);
        F();
        aVar.p().G(this);
        for (f b10 : this.f9736u) {
            b10.b(aVar);
        }
        if (this.f9734s) {
            this.H.f();
        }
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.E;
            gVar.f10848l = systemGestureInsets.top;
            gVar.f10849m = systemGestureInsets.right;
            gVar.f10850n = systemGestureInsets.bottom;
            gVar.f10851o = systemGestureInsets.left;
        }
        boolean z9 = true;
        int i11 = 0;
        boolean z10 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z9 = false;
        }
        if (i10 >= 30) {
            if (z9) {
                i11 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z10) {
                i11 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i11);
            a.g gVar2 = this.E;
            gVar2.f10840d = insets.top;
            gVar2.f10841e = insets.right;
            gVar2.f10842f = insets.bottom;
            gVar2.f10843g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.E;
            gVar3.f10844h = insets2.top;
            gVar3.f10845i = insets2.right;
            gVar3.f10846j = insets2.bottom;
            gVar3.f10847k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.E;
            gVar4.f10848l = insets3.top;
            gVar4.f10849m = insets3.right;
            gVar4.f10850n = insets3.bottom;
            gVar4.f10851o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.E;
                gVar5.f10840d = Math.max(Math.max(gVar5.f10840d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.E;
                gVar6.f10841e = Math.max(Math.max(gVar6.f10841e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.E;
                gVar7.f10842f = Math.max(Math.max(gVar7.f10842f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.E;
                gVar8.f10843g = Math.max(Math.max(gVar8.f10843g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z9) {
                gVar9 = p();
            }
            this.E.f10840d = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.E.f10841e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.E.f10842f = (!z9 || u(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.E.f10843g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.E;
            gVar10.f10844h = 0;
            gVar10.f10845i = 0;
            gVar10.f10846j = u(windowInsets);
            this.E.f10847k = 0;
        }
        x6.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.E.f10840d + ", Left: " + this.E.f10843g + ", Right: " + this.E.f10841e + "\nKeyboard insets: Bottom: " + this.E.f10846j + ", Left: " + this.E.f10847k + ", Right: " + this.E.f10845i + "System Gesture Insets - Left: " + this.E.f10851o + ", Top: " + this.E.f10848l + ", Right: " + this.E.f10849m + ", Bottom: " + this.E.f10846j);
        F();
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = s();
        Activity f10 = h.f(getContext());
        z zVar = this.D;
        if (zVar != null && f10 != null) {
            zVar.a(f10, androidx.core.content.a.h(getContext()), this.I);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f9735t != null) {
            x6.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f9740y.d(configuration);
            E();
            h.c(getContext(), this.f9735t);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !x() ? super.onCreateInputConnection(editorInfo) : this.f9738w.o(this, this.f9741z, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        z zVar = this.D;
        if (zVar != null) {
            zVar.b(this.I);
        }
        this.D = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (x() && this.A.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !x() ? super.onHoverEvent(motionEvent) : this.B.J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.f9738w.A(viewStructure, i10);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        x6.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        a.g gVar = this.E;
        gVar.f10838b = i10;
        gVar.f10839c = i11;
        F();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!x()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.A.f(motionEvent);
    }

    public void q() {
        this.f9731p.b();
        g gVar = this.f9730o;
        if (gVar == null) {
            g r9 = r();
            this.f9730o = r9;
            addView(r9);
        } else {
            gVar.j(getWidth(), getHeight());
        }
        this.f9732q = this.f9731p;
        g gVar2 = this.f9730o;
        this.f9731p = gVar2;
        io.flutter.embedding.engine.a aVar = this.f9735t;
        if (aVar != null) {
            gVar2.c(aVar.r());
        }
    }

    public g r() {
        return new g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    /* access modifiers changed from: protected */
    public z s() {
        try {
            return new z(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        j7.c cVar = this.f9731p;
        if (cVar instanceof h) {
            ((h) cVar).setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            x6.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                arrayList.add(new a.b(next.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(next.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : displayCutout.getBoundingRects()) {
                x6.b.f("FlutterView", "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new a.b(next2, a.d.CUTOUT));
            }
        }
        this.E.f10853q = arrayList;
        F();
    }

    public void t() {
        x6.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f9735t);
        if (!x()) {
            x6.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f a10 : this.f9736u) {
            a10.a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.G);
        this.f9735t.p().Q();
        this.f9735t.p().d();
        this.B.Q();
        this.B = null;
        this.f9738w.q().restartInput(this);
        this.f9738w.p();
        this.f9741z.d();
        io.flutter.plugin.editing.d dVar = this.f9739x;
        if (dVar != null) {
            dVar.b();
        }
        m7.a aVar = this.f9737v;
        if (aVar != null) {
            aVar.c();
        }
        j7.a r9 = this.f9735t.r();
        this.f9734s = false;
        r9.q(this.H);
        r9.v();
        r9.s(false);
        j7.c cVar = this.f9732q;
        if (cVar != null && this.f9731p == this.f9730o) {
            this.f9731p = cVar;
        }
        this.f9731p.d();
        z();
        this.f9732q = null;
        this.f9735t = null;
    }

    public boolean v() {
        return this.f9734s;
    }

    public boolean x() {
        io.flutter.embedding.engine.a aVar = this.f9735t;
        return aVar != null && aVar.r() == this.f9731p.getAttachedRenderer();
    }
}
