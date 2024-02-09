package z8;

import java.nio.charset.Charset;
import kotlin.jvm.internal.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13613a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f13614b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f13615c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f13616d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f13617e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f13618f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f13619g;

    static {
        Charset forName = Charset.forName("UTF-8");
        l.d(forName, "forName(\"UTF-8\")");
        f13614b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        l.d(forName2, "forName(\"UTF-16\")");
        f13615c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l.d(forName3, "forName(\"UTF-16BE\")");
        f13616d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        l.d(forName4, "forName(\"UTF-16LE\")");
        f13617e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        l.d(forName5, "forName(\"US-ASCII\")");
        f13618f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l.d(forName6, "forName(\"ISO-8859-1\")");
        f13619g = forName6;
    }

    private c() {
    }
}
