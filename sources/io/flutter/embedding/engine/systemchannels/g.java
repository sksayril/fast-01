package io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k7.j;
import k7.k;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final k f9886a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f9887b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f9888c;

    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (g.this.f9887b != null) {
                String str = jVar.f10996a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.b();
                try {
                    dVar.a(g.this.f9887b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e10) {
                    dVar.b("error", e10.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public g(y6.a aVar) {
        a aVar2 = new a();
        this.f9888c = aVar2;
        k kVar = new k(aVar, "flutter/localization", k7.g.f10995a);
        this.f9886a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        x6.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            x6.b.f("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(next.getScript());
            arrayList.add(next.getVariant());
        }
        this.f9886a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f9887b = bVar;
    }
}
