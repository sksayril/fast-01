package l5;

import com.google.gson.e;
import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import n5.c;

final class b extends w<Time> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11143b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f11144a;

    class a implements x {
        a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new b((a) null);
            }
            return null;
        }
    }

    private b() {
        this.f11144a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Time c(n5.a aVar) {
        if (aVar.G() == n5.b.NULL) {
            aVar.C();
            return null;
        }
        try {
            return new Time(this.f11144a.parse(aVar.E()).getTime());
        } catch (ParseException e10) {
            throw new s((Throwable) e10);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Time time) {
        cVar.I(time == null ? null : this.f11144a.format(time));
    }
}
