package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f1574a;

    l(Object obj) {
        this.f1574a = (LocaleList) obj;
    }

    public Object a() {
        return this.f1574a;
    }

    public boolean equals(Object obj) {
        return this.f1574a.equals(((k) obj).a());
    }

    public Locale get(int i10) {
        return this.f1574a.get(i10);
    }

    public int hashCode() {
        return this.f1574a.hashCode();
    }

    public String toString() {
        return this.f1574a.toString();
    }
}
