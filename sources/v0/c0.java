package v0;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class c0 extends b0 {

    /* renamed from: i  reason: collision with root package name */
    private static Method f12596i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f12597j;

    c0() {
    }

    @SuppressLint({"PrivateApi"})
    private void l() {
        if (!f12597j) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{cls2, cls2, cls2, cls2});
                f12596i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e10);
            }
            f12597j = true;
        }
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        l();
        Method method = f12596i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }
}
