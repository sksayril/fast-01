package v0;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class w {

    /* renamed from: a  reason: collision with root package name */
    private static Method f12678a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12679b;

    private static void a() {
        if (!f12679b) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f12678a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e10);
            }
            f12679b = true;
        }
    }

    static void b(ViewGroup viewGroup, boolean z9) {
        String str;
        a();
        Method method = f12678a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z9)});
                return;
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e11) {
                e = e11;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e);
    }
}
