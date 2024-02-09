package h5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class m {

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f9373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f9374b;

        a(Method method, Object obj) {
            this.f9373a = method;
            this.f9374b = obj;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f9373a.invoke(this.f9374b, new Object[]{cls});
        }
    }

    class b extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f9375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9376b;

        b(Method method, int i10) {
            this.f9375a = method;
            this.f9376b = i10;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f9375a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f9376b)});
        }
    }

    class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f9377a;

        c(Method method) {
            this.f9377a = method;
        }

        public <T> T c(Class<T> cls) {
            m.a(cls);
            return this.f9377a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    class d extends m {
        d() {
        }

        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}
