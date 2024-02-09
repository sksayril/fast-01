package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.e();

    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0038a<MessageType, BuilderType> {

        /* renamed from: m  reason: collision with root package name */
        private final MessageType f2124m;

        /* renamed from: n  reason: collision with root package name */
        protected MessageType f2125n;

        /* renamed from: o  reason: collision with root package name */
        protected boolean f2126o = false;

        protected a(MessageType messagetype) {
            this.f2124m = messagetype;
            this.f2125n = (y) messagetype.v(f.NEW_MUTABLE_INSTANCE);
        }

        private void B(MessageType messagetype, MessageType messagetype2) {
            c1.a().e(messagetype).a(messagetype, messagetype2);
        }

        public BuilderType A(MessageType messagetype) {
            x();
            B(this.f2125n, messagetype);
            return this;
        }

        /* renamed from: u */
        public final MessageType a() {
            MessageType v9 = g();
            if (v9.n()) {
                return v9;
            }
            throw a.C0038a.t(v9);
        }

        /* renamed from: v */
        public MessageType g() {
            if (this.f2126o) {
                return this.f2125n;
            }
            this.f2125n.D();
            this.f2126o = true;
            return this.f2125n;
        }

        /* renamed from: w */
        public BuilderType clone() {
            BuilderType F = d().h();
            F.A(g());
            return F;
        }

        /* access modifiers changed from: protected */
        public void x() {
            if (this.f2126o) {
                MessageType messagetype = (y) this.f2125n.v(f.NEW_MUTABLE_INSTANCE);
                B(messagetype, this.f2125n);
                this.f2125n = messagetype;
                this.f2126o = false;
            }
        }

        /* renamed from: y */
        public MessageType d() {
            return this.f2124m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public BuilderType r(MessageType messagetype) {
            return A(messagetype);
        }
    }

    protected static class b<T extends y<T, ?>> extends b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f2127b;

        public b(T t9) {
            this.f2127b = t9;
        }

        /* renamed from: g */
        public T b(i iVar, p pVar) {
            return y.I(this.f2127b, iVar, pVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements s0 {
        protected u<d> extensions = u.h();

        /* access modifiers changed from: package-private */
        public u<d> L() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ r0 d() {
            return y.super.d();
        }

        public /* bridge */ /* synthetic */ r0.a e() {
            return y.super.e();
        }

        public /* bridge */ /* synthetic */ r0.a h() {
            return y.super.h();
        }
    }

    static final class d implements u.b<d> {

        /* renamed from: m  reason: collision with root package name */
        final a0.d<?> f2128m;

        /* renamed from: n  reason: collision with root package name */
        final int f2129n;

        /* renamed from: o  reason: collision with root package name */
        final t1.b f2130o;

        /* renamed from: p  reason: collision with root package name */
        final boolean f2131p;

        /* renamed from: q  reason: collision with root package name */
        final boolean f2132q;

        /* renamed from: e */
        public int compareTo(d dVar) {
            return this.f2129n - dVar.f2129n;
        }

        public boolean f() {
            return this.f2131p;
        }

        public a0.d<?> g() {
            return this.f2128m;
        }

        public int getNumber() {
            return this.f2129n;
        }

        public t1.b h() {
            return this.f2130o;
        }

        public boolean isPacked() {
            return this.f2132q;
        }

        public t1.c o() {
            return this.f2130o.getJavaType();
        }

        public r0.a p(r0.a aVar, r0 r0Var) {
            return ((a) aVar).A((y) r0Var);
        }
    }

    public static class e<ContainingType extends r0, Type> extends n<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final r0 f2133a;

        /* renamed from: b  reason: collision with root package name */
        final d f2134b;

        public t1.b a() {
            return this.f2134b.h();
        }

        public r0 b() {
            return this.f2133a;
        }

        public int c() {
            return this.f2134b.getNumber();
        }

        public boolean d() {
            return this.f2134b.f2131p;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static Object B(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends y<T, ?>> boolean C(T t9, boolean z9) {
        byte byteValue = ((Byte) t9.v(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e10 = c1.a().e(t9).e(t9);
        if (z9) {
            t9.w(f.SET_MEMOIZED_IS_INITIALIZED, e10 ? t9 : null);
        }
        return e10;
    }

    protected static <E> a0.i<E> E(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.q(size == 0 ? 10 : size * 2);
    }

    protected static Object G(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    protected static <T extends y<T, ?>> T H(T t9, InputStream inputStream) {
        return t(I(t9, i.f(inputStream), p.b()));
    }

    static <T extends y<T, ?>> T I(T t9, i iVar, p pVar) {
        T t10 = (y) t9.v(f.NEW_MUTABLE_INSTANCE);
        try {
            g1 e10 = c1.a().e(t10);
            e10.b(t10, j.Q(iVar), pVar);
            e10.d(t10);
            return t10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof b0) {
                throw ((b0) e11.getCause());
            }
            throw new b0(e11.getMessage()).i(t10);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw e12;
        }
    }

    protected static <T extends y<?, ?>> void J(Class<T> cls, T t9) {
        defaultInstanceMap.put(cls, t9);
    }

    private static <T extends y<T, ?>> T t(T t9) {
        if (t9 == null || t9.n()) {
            return t9;
        }
        throw t9.p().a().i(t9);
    }

    protected static <E> a0.i<E> y() {
        return d1.f();
    }

    static <T extends y<?, ?>> T z(Class<T> cls) {
        T t9 = (y) defaultInstanceMap.get(cls);
        if (t9 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t9 = (y) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t9 == null) {
            t9 = ((y) r1.i(cls)).d();
            if (t9 != null) {
                defaultInstanceMap.put(cls, t9);
            } else {
                throw new IllegalStateException();
            }
        }
        return t9;
    }

    /* renamed from: A */
    public final MessageType d() {
        return (y) v(f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: protected */
    public void D() {
        c1.a().e(this).d(this);
    }

    /* renamed from: F */
    public final BuilderType h() {
        return (a) v(f.NEW_BUILDER);
    }

    /* renamed from: K */
    public final BuilderType e() {
        BuilderType buildertype = (a) v(f.NEW_BUILDER);
        buildertype.A(this);
        return buildertype;
    }

    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = c1.a().e(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d().getClass().isInstance(obj)) {
            return false;
        }
        return c1.a().e(this).f(this, (y) obj);
    }

    public void f(k kVar) {
        c1.a().e(this).c(this, l.P(kVar));
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = c1.a().e(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    public final z0<MessageType> k() {
        return (z0) v(f.GET_PARSER);
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.memoizedSerializedSize;
    }

    public final boolean n() {
        return C(this, true);
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* access modifiers changed from: package-private */
    public Object s() {
        return v(f.BUILD_MESSAGE_INFO);
    }

    public String toString() {
        return t0.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType u() {
        return (a) v(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object v(f fVar) {
        return x(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object w(f fVar, Object obj) {
        return x(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object x(f fVar, Object obj, Object obj2);
}
