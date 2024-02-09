package l5;

import com.google.gson.x;
import i5.d;
import java.sql.Timestamp;
import java.util.Date;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11147a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b<? extends Date> f11148b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b<? extends Date> f11149c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f11150d;

    /* renamed from: e  reason: collision with root package name */
    public static final x f11151e;

    /* renamed from: f  reason: collision with root package name */
    public static final x f11152f;

    class a extends d.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends d.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z9;
        x xVar;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f11147a = z9;
        if (z9) {
            f11148b = new a(java.sql.Date.class);
            f11149c = new b(Timestamp.class);
            f11150d = a.f11141b;
            f11151e = b.f11143b;
            xVar = c.f11145b;
        } else {
            xVar = null;
            f11148b = null;
            f11149c = null;
            f11150d = null;
            f11151e = null;
        }
        f11152f = xVar;
    }
}
