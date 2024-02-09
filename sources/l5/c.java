package l5;

import com.google.gson.e;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Timestamp;
import java.util.Date;

class c extends w<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11145b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final w<Date> f11146a;

    class a implements x {
        a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Timestamp.class) {
                return new c(eVar.k(Date.class), (a) null);
            }
            return null;
        }
    }

    private c(w<Date> wVar) {
        this.f11146a = wVar;
    }

    /* synthetic */ c(w wVar, a aVar) {
        this(wVar);
    }

    /* renamed from: f */
    public Timestamp c(n5.a aVar) {
        Date c10 = this.f11146a.c(aVar);
        if (c10 != null) {
            return new Timestamp(c10.getTime());
        }
        return null;
    }

    /* renamed from: g */
    public void e(n5.c cVar, Timestamp timestamp) {
        this.f11146a.e(cVar, timestamp);
    }
}
