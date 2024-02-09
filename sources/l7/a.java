package l7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import io.flutter.embedding.engine.systemchannels.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g f11176a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f11177b;
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})

    /* renamed from: c  reason: collision with root package name */
    final g.b f11178c;

    /* renamed from: l7.a$a  reason: collision with other inner class name */
    class C0179a implements g.b {
        C0179a() {
        }

        public String a(String str, String str2) {
            Context a10 = a.this.f11177b;
            if (str2 != null) {
                Locale b10 = a.b(str2);
                Configuration configuration = new Configuration(a.this.f11177b.getResources().getConfiguration());
                configuration.setLocale(b10);
                a10 = a.this.f11177b.createConfigurationContext(configuration);
            }
            int identifier = a10.getResources().getIdentifier(str, "string", a.this.f11177b.getPackageName());
            if (identifier != 0) {
                return a10.getResources().getString(identifier);
            }
            return null;
        }
    }

    public a(Context context, g gVar) {
        C0179a aVar = new C0179a();
        this.f11178c = aVar;
        this.f11177b = context;
        this.f11176a = gVar;
        gVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i10 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i10 = 2;
        }
        if (split.length > i10 && split[i10].length() >= 2 && split[i10].length() <= 3) {
            str4 = split[i10];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f11177b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i11 = 0; i11 < size; i11++) {
                Locale locale = locales.get(i11);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i10 >= 24) {
            LocaleList locales2 = this.f11177b.getResources().getConfiguration().getLocales();
            for (int i12 = 0; i12 < locales2.size(); i12++) {
                Locale locale2 = locales2.get(i12);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
        } else {
            Locale locale3 = this.f11177b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(locales.get(i10));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f11176a.b(arrayList);
    }
}
