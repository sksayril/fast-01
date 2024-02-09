package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final i f1566b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final k f1567a;

    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(k kVar) {
        this.f1567a = kVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(a.a(localeArr)) : new i(new j(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static i d(LocaleList localeList) {
        return new i(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f1567a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f1567a.equals(((i) obj).f1567a);
    }

    public int hashCode() {
        return this.f1567a.hashCode();
    }

    public String toString() {
        return this.f1567a.toString();
    }
}
