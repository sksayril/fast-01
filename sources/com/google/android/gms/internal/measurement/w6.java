package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.w6;
import com.google.android.gms.internal.measurement.y6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class w6<MessageType extends w6<MessageType, BuilderType>, BuilderType extends y6<MessageType, BuilderType>> implements da {
    protected int zza = 0;

    protected static <T> void c(Iterable<T> iterable, List<? super T> list) {
        r8.e(iterable);
        if (iterable instanceof i9) {
            List<?> a10 = ((i9) iterable).a();
            i9 i9Var = (i9) list;
            int size = list.size();
            for (Object next : a10) {
                if (next == null) {
                    String str = "Element at index " + (i9Var.size() - size) + " is null.";
                    for (int size2 = i9Var.size() - 1; size2 >= size; size2--) {
                        i9Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (next instanceof f7) {
                    i9Var.v((f7) next);
                } else {
                    i9Var.add((String) next);
                }
            }
        } else if (iterable instanceof oa) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(next2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(va vaVar) {
        int g10 = g();
        if (g10 != -1) {
            return g10;
        }
        int a10 = vaVar.a(this);
        p(a10);
        return a10;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    public final f7 h() {
        try {
            o7 C = f7.C(d());
            k(C.b());
            return C.a();
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "ByteString" + " threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] n() {
        try {
            byte[] bArr = new byte[d()];
            y7 H = y7.H(bArr);
            k(H);
            H.I();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "byte array" + " threw an IOException (should never happen).", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        throw new UnsupportedOperationException();
    }
}
