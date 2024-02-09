package com.google.gson;

import i5.f;
import i5.g;
import java.io.IOException;
import n5.b;
import n5.c;

public abstract class w<T> {

    class a extends w<T> {
        a() {
        }

        public T c(n5.a aVar) {
            if (aVar.G() != b.NULL) {
                return w.this.c(aVar);
            }
            aVar.C();
            return null;
        }

        public void e(c cVar, T t9) {
            if (t9 == null) {
                cVar.r();
            } else {
                w.this.e(cVar, t9);
            }
        }
    }

    public final T a(k kVar) {
        try {
            return c(new f(kVar));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public final w<T> b() {
        return new a();
    }

    public abstract T c(n5.a aVar);

    public final k d(T t9) {
        try {
            g gVar = new g();
            e(gVar, t9);
            return gVar.L();
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public abstract void e(c cVar, T t9);
}
