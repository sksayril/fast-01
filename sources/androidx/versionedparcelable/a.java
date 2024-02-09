package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w0.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final p.a<String, Method> f3336a;

    /* renamed from: b  reason: collision with root package name */
    protected final p.a<String, Method> f3337b;

    /* renamed from: c  reason: collision with root package name */
    protected final p.a<String, Class> f3338c;

    public a(p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        this.f3336a = aVar;
        this.f3337b = aVar2;
        this.f3338c = aVar3;
    }

    private void N(b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    private Class c(Class<? extends b> cls) {
        Class cls2 = this.f3338c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3338c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Class<a> cls = a.class;
        Method method = this.f3336a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3336a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = this.f3337b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c10 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c10.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f3337b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void E(int i10);

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    /* access modifiers changed from: protected */
    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void I(String str);

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    /* access modifiers changed from: protected */
    public <T extends b> void K(T t9, a aVar) {
        try {
            e(t9.getClass()).invoke((Object) null, new Object[]{t9, aVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    /* access modifiers changed from: protected */
    public void L(b bVar) {
        if (bVar == null) {
            I((String) null);
            return;
        }
        N(bVar);
        a b10 = b();
        K(bVar, b10);
        b10.a();
    }

    public void M(b bVar, int i10) {
        w(i10);
        L(bVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract a b();

    public boolean f() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public boolean h(boolean z9, int i10) {
        return !m(i10) ? z9 : g();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i10) {
        return !m(i10) ? bArr : i();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i10) {
        return !m(i10) ? charSequence : k();
    }

    /* access modifiers changed from: protected */
    public abstract boolean m(int i10);

    /* access modifiers changed from: protected */
    public <T extends b> T n(String str, a aVar) {
        try {
            return (b) d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int o();

    public int p(int i10, int i11) {
        return !m(i11) ? i10 : o();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t9, int i10) {
        return !m(i10) ? t9 : q();
    }

    /* access modifiers changed from: protected */
    public abstract String s();

    public String t(String str, int i10) {
        return !m(i10) ? str : s();
    }

    /* access modifiers changed from: protected */
    public <T extends b> T u() {
        String s9 = s();
        if (s9 == null) {
            return null;
        }
        return n(s9, b());
    }

    public <T extends b> T v(T t9, int i10) {
        return !m(i10) ? t9 : u();
    }

    /* access modifiers changed from: protected */
    public abstract void w(int i10);

    public void x(boolean z9, boolean z10) {
    }

    /* access modifiers changed from: protected */
    public abstract void y(boolean z9);

    public void z(boolean z9, int i10) {
        w(i10);
        y(z9);
    }
}
