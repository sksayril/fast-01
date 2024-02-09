package k5;

import com.google.gson.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f10967d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f10968b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f10969c = c();

    c() {
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f10967d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(AccessibleObject accessibleObject) {
        if (!(this.f10968b == null || this.f10969c == null)) {
            try {
                long longValue = ((Long) f10967d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f10968b, new Object[]{this.f10969c})).longValue();
                f10967d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f10968b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
