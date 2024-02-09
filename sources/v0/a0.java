package v0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a0 extends d0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f12556a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12557b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f12558c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f12559d;

    a0() {
    }

    private void h() {
        if (!f12559d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f12558c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e10);
            }
            f12559d = true;
        }
    }

    private void i() {
        if (!f12557b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f12556a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e10);
            }
            f12557b = true;
        }
    }

    public void a(View view) {
    }

    public float b(View view) {
        h();
        Method method = f12558c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return super.b(view);
    }

    public void c(View view) {
    }

    public void e(View view, float f10) {
        i();
        Method method = f12556a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f10)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        } else {
            view.setAlpha(f10);
        }
    }
}
