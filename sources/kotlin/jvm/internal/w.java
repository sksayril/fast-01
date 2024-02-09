package kotlin.jvm.internal;

import x8.c;
import x8.d;
import x8.e;
import x8.f;
import x8.g;

public class w {
    public e a(i iVar) {
        return iVar;
    }

    public c b(Class cls) {
        return new e(cls);
    }

    public d c(Class cls, String str) {
        return new n(cls, str);
    }

    public f d(o oVar) {
        return oVar;
    }

    public g e(q qVar) {
        return qVar;
    }

    public String f(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(m mVar) {
        return f(mVar);
    }
}
