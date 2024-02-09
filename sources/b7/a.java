package b7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import d8.h;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;

@TargetApi(19)
public class a extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private FlutterMutatorsStack f3415m;

    /* renamed from: n  reason: collision with root package name */
    private float f3416n;

    /* renamed from: o  reason: collision with root package name */
    private int f3417o;

    /* renamed from: p  reason: collision with root package name */
    private int f3418p;

    /* renamed from: q  reason: collision with root package name */
    private int f3419q;

    /* renamed from: r  reason: collision with root package name */
    private int f3420r;

    /* renamed from: s  reason: collision with root package name */
    private final io.flutter.embedding.android.a f3421s;

    /* renamed from: t  reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f3422t;

    /* renamed from: b7.a$a  reason: collision with other inner class name */
    class C0070a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f3423m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f3424n;

        C0070a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f3423m = onFocusChangeListener;
            this.f3424n = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f3423m;
            View view3 = this.f3424n;
            onFocusChangeListener.onFocusChange(view3, h.d(view3));
        }
    }

    public a(Context context, float f10, io.flutter.embedding.android.a aVar) {
        super(context, (AttributeSet) null);
        this.f3416n = f10;
        this.f3421s = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f3415m.getFinalMatrix());
        float f10 = this.f3416n;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate((float) (-this.f3417o), (float) (-this.f3418p));
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i10, int i11, int i12, int i13) {
        this.f3415m = flutterMutatorsStack;
        this.f3417o = i10;
        this.f3418p = i11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f3422t) != null) {
            this.f3422t = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f3415m.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f3417o), (float) (-this.f3418p));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (this.f3421s == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i11 = this.f3417o;
            this.f3419q = i11;
            i10 = this.f3418p;
            this.f3420r = i10;
            f10 = (float) i11;
        } else if (action != 2) {
            f10 = (float) this.f3417o;
            i10 = this.f3418p;
        } else {
            matrix.postTranslate((float) this.f3419q, (float) this.f3420r);
            this.f3419q = this.f3417o;
            this.f3420r = this.f3418p;
            return this.f3421s.g(motionEvent, matrix);
        }
        matrix.postTranslate(f10, (float) i10);
        return this.f3421s.g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f3422t == null) {
            C0070a aVar = new C0070a(onFocusChangeListener, this);
            this.f3422t = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
