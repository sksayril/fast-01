package f6;

import o5.j;
import u5.a;

final class d extends h {
    d(a aVar) {
        super(aVar);
    }

    public String d() {
        if (c().k() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f10 = b().f(48, 2);
            sb.append("(393");
            sb.append(f10);
            sb.append(')');
            int f11 = b().f(50, 10);
            if (f11 / 100 == 0) {
                sb.append('0');
            }
            if (f11 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f11);
            sb.append(b().c(60, (String) null).b());
            return sb.toString();
        }
        throw j.a();
    }
}
