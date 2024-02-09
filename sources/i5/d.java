package i5;

import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import h5.e;
import h5.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import n5.c;

public final class d<T extends Date> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f9500a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f9501b;

    public static abstract class b<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final b<Date> f9502b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f9503a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            public Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.f9503a = cls;
        }

        private final x c(d<T> dVar) {
            return n.a(this.f9503a, dVar);
        }

        public final x a(int i10, int i11) {
            return c(new d(this, i10, i11));
        }

        public final x b(String str) {
            return c(new d(this, str));
        }

        /* access modifiers changed from: protected */
        public abstract T d(Date date);
    }

    private d(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f9501b = arrayList;
        this.f9500a = (b) h5.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (e.e()) {
            arrayList.add(j.c(i10, i11));
        }
    }

    private d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f9501b = arrayList;
        this.f9500a = (b) h5.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private Date f(String str) {
        synchronized (this.f9501b) {
            for (DateFormat parse : this.f9501b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return j5.a.c(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new s(str, e10);
            }
        }
    }

    /* renamed from: g */
    public T c(n5.a aVar) {
        if (aVar.G() == n5.b.NULL) {
            aVar.C();
            return null;
        }
        return this.f9500a.d(f(aVar.E()));
    }

    /* renamed from: h */
    public void e(c cVar, Date date) {
        if (date == null) {
            cVar.r();
            return;
        }
        synchronized (this.f9501b) {
            cVar.I(this.f9501b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f9501b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
