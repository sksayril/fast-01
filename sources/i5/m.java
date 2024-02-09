package i5;

import com.google.gson.e;
import com.google.gson.w;
import i5.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import n5.a;
import n5.c;

final class m<T> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e f9553a;

    /* renamed from: b  reason: collision with root package name */
    private final w<T> f9554b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f9555c;

    m(e eVar, w<T> wVar, Type type) {
        this.f9553a = eVar;
        this.f9554b = wVar;
        this.f9555c = type;
    }

    private Type f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    public T c(a aVar) {
        return this.f9554b.c(aVar);
    }

    public void e(c cVar, T t9) {
        w<T> wVar = this.f9554b;
        Type f10 = f(this.f9555c, t9);
        if (f10 != this.f9555c) {
            wVar = this.f9553a.l(m5.a.b(f10));
            if (wVar instanceof k.b) {
                w<T> wVar2 = this.f9554b;
                if (!(wVar2 instanceof k.b)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.e(cVar, t9);
    }
}
