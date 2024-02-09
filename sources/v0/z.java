package v0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.core.view.x;
import java.lang.reflect.Field;

class z {

    /* renamed from: a  reason: collision with root package name */
    private static final d0 f12681a = (Build.VERSION.SDK_INT >= 22 ? new c0() : new b0());

    /* renamed from: b  reason: collision with root package name */
    private static Field f12682b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12683c;

    /* renamed from: d  reason: collision with root package name */
    static final Property<View, Float> f12684d = new a(Float.class, "translationAlpha");

    /* renamed from: e  reason: collision with root package name */
    static final Property<View, Rect> f12685e = new b(Rect.class, "clipBounds");

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(z.d(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            z.h(view, f10.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return x.r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            x.m0(view, rect);
        }
    }

    static void a(View view) {
        f12681a.a(view);
    }

    private static void b() {
        if (!f12683c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12682b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f12683c = true;
        }
    }

    static y c(View view) {
        return new x(view);
    }

    static float d(View view) {
        return f12681a.b(view);
    }

    static g0 e(View view) {
        return new f0(view);
    }

    static void f(View view) {
        f12681a.c(view);
    }

    static void g(View view, int i10, int i11, int i12, int i13) {
        f12681a.d(view, i10, i11, i12, i13);
    }

    static void h(View view, float f10) {
        f12681a.e(view, f10);
    }

    static void i(View view, int i10) {
        b();
        Field field = f12682b;
        if (field != null) {
            try {
                f12682b.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void j(View view, Matrix matrix) {
        f12681a.f(view, matrix);
    }

    static void k(View view, Matrix matrix) {
        f12681a.g(view, matrix);
    }
}
