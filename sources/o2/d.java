package o2;

import android.os.IBinder;
import h2.p;
import java.lang.reflect.Field;
import o2.b;

public final class d<T> extends b.a {

    /* renamed from: c  reason: collision with root package name */
    private final Object f11585c;

    private d(Object obj) {
        this.f11585c = obj;
    }

    public static <T> T Y(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f11585c;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            p.j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static <T> b e3(T t9) {
        return new d(t9);
    }
}
