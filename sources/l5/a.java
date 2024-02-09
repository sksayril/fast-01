package l5;

import com.google.gson.e;
import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import n5.b;
import n5.c;

final class a extends w<Date> {

    /* renamed from: b  reason: collision with root package name */
    static final x f11141b = new C0178a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f11142a;

    /* renamed from: l5.a$a  reason: collision with other inner class name */
    class C0178a implements x {
        C0178a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new a((C0178a) null);
            }
            return null;
        }
    }

    private a() {
        this.f11142a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ a(C0178a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Date c(n5.a aVar) {
        if (aVar.G() == b.NULL) {
            aVar.C();
            return null;
        }
        try {
            return new Date(this.f11142a.parse(aVar.E()).getTime());
        } catch (ParseException e10) {
            throw new s((Throwable) e10);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Date date) {
        cVar.I(date == null ? null : this.f11142a.format(date));
    }
}
