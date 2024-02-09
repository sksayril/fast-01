package v0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class b0 extends a0 {

    /* renamed from: e  reason: collision with root package name */
    private static Method f12560e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f12561f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f12562g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f12563h;

    b0() {
    }

    private void j() {
        if (!f12561f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f12560e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e10);
            }
            f12561f = true;
        }
    }

    private void k() {
        if (!f12563h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f12562g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e10);
            }
            f12563h = true;
        }
    }

    public void f(View view, Matrix matrix) {
        j();
        Method method = f12560e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void g(View view, Matrix matrix) {
        k();
        Method method = f12562g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }
}
