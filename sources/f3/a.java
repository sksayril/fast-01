package f3;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import g0.b;
import g0.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f8754a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f8755b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f8756c = new g0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f8757d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f8758e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }
}
