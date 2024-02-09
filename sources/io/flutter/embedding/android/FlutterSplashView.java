package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;

final class FlutterSplashView extends FrameLayout {

    /* renamed from: v  reason: collision with root package name */
    private static String f9659v = "FlutterSplashView";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public x f9660m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public k f9661n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public View f9662o;

    /* renamed from: p  reason: collision with root package name */
    Bundle f9663p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public String f9664q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f9665r;

    /* renamed from: s  reason: collision with root package name */
    private final k.f f9666s;

    /* renamed from: t  reason: collision with root package name */
    private final j7.b f9667t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f9668u;

    @Keep
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        /* access modifiers changed from: private */
        public String previousCompletedSplashIsolate;
        /* access modifiers changed from: private */
        public Bundle splashScreenState;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    class a implements k.f {
        a() {
        }

        public void a() {
        }

        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f9661n.A(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f9661n, FlutterSplashView.this.f9660m);
        }
    }

    class b implements j7.b {
        b() {
        }

        public void c() {
        }

        public void f() {
            if (FlutterSplashView.this.f9660m != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f9662o);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f9665r = flutterSplashView2.f9664q;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9666s = new a();
        this.f9667t = new b();
        this.f9668u = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f9661n;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (kVar.x()) {
            return this.f9661n.getAttachedFlutterEngine().j().m() != null && this.f9661n.getAttachedFlutterEngine().j().m().equals(this.f9665r);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    private boolean i() {
        k kVar = this.f9661n;
        return kVar != null && kVar.x() && !this.f9661n.v() && !h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f9660m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j() {
        /*
            r1 = this;
            io.flutter.embedding.android.k r0 = r1.f9661n
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x001c
            io.flutter.embedding.android.x r0 = r1.f9660m
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterSplashView.j():boolean");
    }

    /* access modifiers changed from: private */
    public void k() {
        this.f9664q = this.f9661n.getAttachedFlutterEngine().j().m();
        String str = f9659v;
        x6.b.f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f9664q);
        this.f9660m.a(this.f9668u);
    }

    private boolean l() {
        k kVar = this.f9661n;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (kVar.x()) {
            return this.f9661n.v() && !h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    public void g(k kVar, x xVar) {
        k kVar2 = this.f9661n;
        if (kVar2 != null) {
            kVar2.B(this.f9667t);
            removeView(this.f9661n);
        }
        View view = this.f9662o;
        if (view != null) {
            removeView(view);
        }
        this.f9661n = kVar;
        addView(kVar);
        this.f9660m = xVar;
        if (xVar == null) {
            return;
        }
        if (i()) {
            x6.b.f(f9659v, "Showing splash screen UI.");
            View c10 = xVar.c(getContext(), this.f9663p);
            this.f9662o = c10;
            addView(c10);
            kVar.m(this.f9667t);
        } else if (j()) {
            x6.b.f(f9659v, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c11 = xVar.c(getContext(), this.f9663p);
            this.f9662o = c11;
            addView(c11);
            k();
        } else if (!kVar.x()) {
            x6.b.f(f9659v, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            kVar.l(this.f9666s);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f9665r = savedState.previousCompletedSplashIsolate;
        this.f9663p = savedState.splashScreenState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f9665r;
        x xVar = this.f9660m;
        Bundle unused2 = savedState.splashScreenState = xVar != null ? xVar.d() : null;
        return savedState;
    }
}
