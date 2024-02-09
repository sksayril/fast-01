package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.e;

@TargetApi(20)
class r {

    /* renamed from: a  reason: collision with root package name */
    SingleViewPresentation f10143a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10144b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10145c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10146d;

    /* renamed from: e  reason: collision with root package name */
    private final e.c f10147e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f10148f;

    /* renamed from: g  reason: collision with root package name */
    private final Surface f10149g;

    /* renamed from: h  reason: collision with root package name */
    private VirtualDisplay f10150h;

    /* renamed from: i  reason: collision with root package name */
    private int f10151i;

    /* renamed from: j  reason: collision with root package name */
    private int f10152j;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f10153m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Runnable f10154n;

        /* renamed from: io.flutter.plugin.platform.r$a$a  reason: collision with other inner class name */
        class C0157a implements Runnable {
            C0157a() {
            }

            public void run() {
                a aVar = a.this;
                aVar.f10153m.postDelayed(aVar.f10154n, 128);
            }
        }

        a(View view, Runnable runnable) {
            this.f10153m = view;
            this.f10154n = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            b.a(this.f10153m, new C0157a());
            this.f10153m.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: m  reason: collision with root package name */
        final View f10157m;

        /* renamed from: n  reason: collision with root package name */
        Runnable f10158n;

        class a implements Runnable {
            a() {
            }

            public void run() {
                b.this.f10157m.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f10157m = view;
            this.f10158n = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f10158n;
            if (runnable != null) {
                runnable.run();
                this.f10158n = null;
                this.f10157m.post(new a());
            }
        }
    }

    private r(Context context, a aVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, e.c cVar, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        Context context2 = context;
        this.f10144b = context2;
        a aVar2 = aVar;
        this.f10145c = aVar2;
        this.f10147e = cVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f10148f = onFocusChangeListener2;
        this.f10149g = surface;
        this.f10150h = virtualDisplay;
        this.f10146d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f10150h.getDisplay(), fVar, aVar2, i10, onFocusChangeListener2);
        this.f10143a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static r a(Context context, a aVar, f fVar, e.c cVar, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i13 = i10;
        int i14 = i11;
        context.getResources().getDisplayMetrics();
        if (i13 == 0 || i14 == 0) {
            return null;
        }
        cVar.d().setDefaultBufferSize(i13, i14);
        Surface surface = new Surface(cVar.d());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        r rVar = new r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i12, obj);
        rVar.f10151i = i13;
        rVar.f10152j = i14;
        return rVar;
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f10143a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    public int c() {
        return this.f10152j;
    }

    public int d() {
        return this.f10151i;
    }

    public View e() {
        SingleViewPresentation singleViewPresentation = this.f10143a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().I();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        SingleViewPresentation singleViewPresentation = this.f10143a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f10143a.getView().P();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.f10143a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f10143a.getView().J();
        }
    }

    public void h(int i10, int i11, Runnable runnable) {
        boolean isFocused = e().isFocused();
        SingleViewPresentation.e detachState = this.f10143a.detachState();
        this.f10150h.setSurface((Surface) null);
        this.f10150h.release();
        this.f10151i = i10;
        this.f10152j = i11;
        this.f10147e.d().setDefaultBufferSize(i10, i11);
        this.f10150h = ((DisplayManager) this.f10144b.getSystemService("display")).createVirtualDisplay("flutter-vd", i10, i11, this.f10146d, this.f10149g, 0);
        View e10 = e();
        e10.addOnAttachStateChangeListener(new a(e10, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f10144b, this.f10150h.getDisplay(), this.f10145c, detachState, this.f10148f, isFocused);
        singleViewPresentation.show();
        this.f10143a.cancel();
        this.f10143a = singleViewPresentation;
    }
}
