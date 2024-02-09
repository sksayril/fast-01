package u6;

import java.util.List;
import s6.d0;

public abstract class b implements e {
    private Boolean k(String str) {
        Object c10 = c(str);
        if (c10 instanceof Boolean) {
            return (Boolean) c10;
        }
        return null;
    }

    private String m() {
        return (String) c("sql");
    }

    private List<Object> n() {
        return (List) c("arguments");
    }

    public d0 d() {
        return new d0(m(), n());
    }

    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    public Boolean f() {
        return k("inTransaction");
    }

    public Integer g() {
        return (Integer) c("transactionId");
    }

    public boolean h() {
        return j("transactionId") && g() == null;
    }

    public boolean l() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }

    public String toString() {
        return "" + i() + " " + m() + " " + n();
    }
}
