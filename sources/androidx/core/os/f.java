package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

public final class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static i a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return i.d(a.a(configuration));
        }
        return i.a(configuration.locale);
    }
}
