package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f1670a = new Locale("", "");

    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
