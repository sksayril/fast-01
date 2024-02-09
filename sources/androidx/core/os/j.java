package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class j implements k {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f1568c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f1569d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f1570e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f1571f = i.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f1572a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1573b;

    j(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f1572a = f1568c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (i10 < localeArr.length) {
                Locale locale = localeArr[i10];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        b(sb2, locale2);
                        if (i10 < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i10++;
                } else {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
            }
            this.f1572a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f1573b = sb;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f1572a;
        if (this.f1572a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1572a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f1572a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale hashCode : this.f1572a) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f1572a;
            if (i10 < localeArr.length) {
                sb.append(localeArr[i10]);
                if (i10 < this.f1572a.length - 1) {
                    sb.append(',');
                }
                i10++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
