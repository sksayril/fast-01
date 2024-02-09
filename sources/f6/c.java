package f6;

import o5.j;
import u5.a;

final class c extends h {
    c(a aVar) {
        super(aVar);
    }

    public String d() {
        if (c().k() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f10 = b().f(48, 2);
            sb.append("(392");
            sb.append(f10);
            sb.append(')');
            sb.append(b().c(50, (String) null).b());
            return sb.toString();
        }
        throw j.a();
    }
}
