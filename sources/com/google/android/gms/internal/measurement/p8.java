package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.p8.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class p8<MessageType extends p8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends w6<MessageType, BuilderType> {
    private static Map<Object, p8<?, ?>> zzc = new ConcurrentHashMap();
    protected sb zzb = sb.k();
    private int zzd = -1;

    protected static class a<T extends p8<T, ?>> extends a7<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f5511b;

        public a(T t9) {
            this.f5511b = t9;
        }
    }

    public static abstract class b<MessageType extends p8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends y6<MessageType, BuilderType> {

        /* renamed from: m  reason: collision with root package name */
        private final MessageType f5512m;

        /* renamed from: n  reason: collision with root package name */
        protected MessageType f5513n;

        protected b(MessageType messagetype) {
            this.f5512m = messagetype;
            if (!messagetype.I()) {
                this.f5513n = messagetype.C();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void r(MessageType messagetype, MessageType messagetype2) {
            qa.a().c(messagetype).c(messagetype, messagetype2);
        }

        private final BuilderType v(byte[] bArr, int i10, int i11, c8 c8Var) {
            if (!this.f5513n.I()) {
                u();
            }
            try {
                qa.a().c(this.f5513n).f(this.f5513n, bArr, 0, i11, new e7(c8Var));
                return this;
            } catch (b9 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw b9.f();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f5512m.u(e.f5518e, (Object) null, (Object) null);
            bVar.f5513n = (p8) j();
            return bVar;
        }

        public final boolean e() {
            return p8.y(this.f5513n, false);
        }

        public final /* synthetic */ y6 n(byte[] bArr, int i10, int i11) {
            return v(bArr, 0, i11, c8.f5168c);
        }

        public final /* synthetic */ y6 p(byte[] bArr, int i10, int i11, c8 c8Var) {
            return v(bArr, 0, i11, c8Var);
        }

        public final BuilderType q(MessageType messagetype) {
            if (this.f5512m.equals(messagetype)) {
                return this;
            }
            if (!this.f5513n.I()) {
                u();
            }
            r(this.f5513n, messagetype);
            return this;
        }

        /* renamed from: s */
        public MessageType j() {
            if (!this.f5513n.I()) {
                return this.f5513n;
            }
            this.f5513n.G();
            return this.f5513n;
        }

        /* access modifiers changed from: protected */
        public final void t() {
            if (!this.f5513n.I()) {
                u();
            }
        }

        /* access modifiers changed from: protected */
        public void u() {
            MessageType C = this.f5512m.C();
            r(C, this.f5513n);
            this.f5513n = C;
        }

        /* renamed from: w */
        public final MessageType l() {
            MessageType messagetype = (p8) j();
            if (messagetype.e()) {
                return messagetype;
            }
            throw new qb(messagetype);
        }
    }

    static final class c implements k8<c> {
        public final hc a() {
            throw new NoSuchMethodError();
        }

        public final rc b() {
            throw new NoSuchMethodError();
        }

        public final boolean c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean d() {
            throw new NoSuchMethodError();
        }

        public final ga j(ga gaVar, da daVar) {
            throw new NoSuchMethodError();
        }

        public final la l(la laVar, la laVar2) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends p8<MessageType, BuilderType> implements fa {
        protected i8<c> zzc = i8.i();

        /* access modifiers changed from: package-private */
        public final i8<c> J() {
            if (this.zzc.r()) {
                this.zzc = (i8) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5514a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5515b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5516c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f5517d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f5518e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f5519f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f5520g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f5521h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f5521h.clone();
        }
    }

    public static class f<ContainingType extends da, Type> extends d8<ContainingType, Type> {
    }

    protected static w8 D() {
        return t8.f();
    }

    protected static z8 E() {
        return r9.f();
    }

    protected static <E> y8<E> F() {
        return ua.g();
    }

    private final int q() {
        return qa.a().c(this).e(this);
    }

    static <T extends p8<?, ?>> T r(Class<T> cls) {
        T t9 = (p8) zzc.get(cls);
        if (t9 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t9 = (p8) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t9 == null) {
            t9 = (p8) ((p8) ac.b(cls)).u(e.f5519f, (Object) null, (Object) null);
            if (t9 != null) {
                zzc.put(cls, t9);
            } else {
                throw new IllegalStateException();
            }
        }
        return t9;
    }

    protected static <E> y8<E> s(y8<E> y8Var) {
        int size = y8Var.size();
        return y8Var.e(size == 0 ? 10 : size << 1);
    }

    protected static z8 t(z8 z8Var) {
        int size = z8Var.size();
        return z8Var.h(size == 0 ? 10 : size << 1);
    }

    protected static Object v(da daVar, String str, Object[] objArr) {
        return new sa(daVar, str, objArr);
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends p8<?, ?>> void x(Class<T> cls, T t9) {
        t9.H();
        zzc.put(cls, t9);
    }

    protected static final <T extends p8<T, ?>> boolean y(T t9, boolean z9) {
        byte byteValue = ((Byte) t9.u(e.f5514a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b10 = qa.a().c(t9).b(t9);
        if (z9) {
            t9.u(e.f5515b, b10 ? t9 : null, (Object) null);
        }
        return b10;
    }

    private final int z(va<?> vaVar) {
        return vaVar == null ? qa.a().c(this).a(this) : vaVar.a(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends p8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType A() {
        return (b) u(e.f5518e, (Object) null, (Object) null);
    }

    public final BuilderType B() {
        return ((b) u(e.f5518e, (Object) null, (Object) null)).q(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType C() {
        return (p8) u(e.f5517d, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void G() {
        qa.a().c(this).d(this);
        H();
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final boolean I() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int a(va vaVar) {
        if (I()) {
            int z9 = z(vaVar);
            if (z9 >= 0) {
                return z9;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + z9);
        } else if (g() != Integer.MAX_VALUE) {
            return g();
        } else {
            int z10 = z(vaVar);
            p(z10);
            return z10;
        }
    }

    public final /* synthetic */ ga b() {
        return ((b) u(e.f5518e, (Object) null, (Object) null)).q(this);
    }

    public final int d() {
        return a((va) null);
    }

    public final boolean e() {
        return y(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return qa.a().c(this).g(this, (p8) obj);
        }
        return false;
    }

    public final /* synthetic */ da f() {
        return (p8) u(e.f5519f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public int hashCode() {
        if (I()) {
            return q();
        }
        if (this.zza == 0) {
            this.zza = q();
        }
        return this.zza;
    }

    public final /* synthetic */ ga i() {
        return (b) u(e.f5518e, (Object) null, (Object) null);
    }

    public final void k(y7 y7Var) {
        qa.a().c(this).h(this, b8.O(y7Var));
    }

    /* access modifiers changed from: package-private */
    public final void p(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public String toString() {
        return ia.a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public abstract Object u(int i10, Object obj, Object obj2);
}
