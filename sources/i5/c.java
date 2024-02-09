package i5;

import com.google.gson.e;
import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import h5.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import n5.b;

public final class c extends w<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final x f9498b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f9499a;

    class a implements x {
        a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f9499a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (h5.e.e()) {
            arrayList.add(j.c(2, 2));
        }
    }

    private synchronized Date f(String str) {
        for (DateFormat parse : this.f9499a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return j5.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new s(str, e10);
        }
    }

    /* renamed from: g */
    public Date c(n5.a aVar) {
        if (aVar.G() != b.NULL) {
            return f(aVar.E());
        }
        aVar.C();
        return null;
    }

    /* renamed from: h */
    public synchronized void e(n5.c cVar, Date date) {
        if (date == null) {
            cVar.r();
        } else {
            cVar.I(this.f9499a.get(0).format(date));
        }
    }
}
