package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.C0038a;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0038a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0038a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0038a<MessageType, BuilderType>> implements r0.a {
        protected static <T> void p(Iterable<T> iterable, List<? super T> list) {
            a0.a(iterable);
            if (iterable instanceof g0) {
                List<?> w9 = ((g0) iterable).w();
                g0 g0Var = (g0) list;
                int size = list.size();
                for (Object next : w9) {
                    if (next == null) {
                        String str = "Element at index " + (g0Var.size() - size) + " is null.";
                        for (int size2 = g0Var.size() - 1; size2 >= size; size2--) {
                            g0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof h) {
                        g0Var.t((h) next);
                    } else {
                        g0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof a1) {
                list.addAll((Collection) iterable);
            } else {
                q(iterable, list);
            }
        }

        private static <T> void q(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static m1 t(r0 r0Var) {
            return new m1(r0Var);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType r(MessageType messagetype);

        /* renamed from: s */
        public BuilderType c(r0 r0Var) {
            if (d().getClass().isInstance(r0Var)) {
                return r((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void j(Iterable<T> iterable, List<? super T> list) {
        C0038a.p(iterable, list);
    }

    private String o(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public h i() {
        try {
            h.C0039h B = h.B(b());
            f(B.b());
            return B.a();
        } catch (IOException e10) {
            throw new RuntimeException(o("ByteString"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int l() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int m(g1 g1Var) {
        int l10 = l();
        if (l10 != -1) {
            return l10;
        }
        int g10 = g1Var.g(this);
        q(g10);
        return g10;
    }

    /* access modifiers changed from: package-private */
    public m1 p() {
        return new m1(this);
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
        throw new UnsupportedOperationException();
    }

    public void r(OutputStream outputStream) {
        k f02 = k.f0(outputStream, k.I(b()));
        f(f02);
        f02.c0();
    }
}
