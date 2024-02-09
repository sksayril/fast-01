package i4;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.r;
import f4.a;
import f4.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import z3.g;

class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private final String f9456a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9457b;

    /* renamed from: c  reason: collision with root package name */
    private final g f9458c;

    public c(String str, b bVar) {
        this(str, bVar, g.f());
    }

    c(String str, b bVar, g gVar) {
        if (str != null) {
            this.f9458c = gVar;
            this.f9457b = bVar;
            this.f9456a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    private a b(a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f9483a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", r.l());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f9484b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f9485c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f9486d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f9487e.a().c());
        return aVar;
    }

    private void c(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            g gVar = this.f9458c;
            gVar.l("Failed to parse settings JSON from " + this.f9456a, e10);
            g gVar2 = this.f9458c;
            gVar2.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f9490h);
        hashMap.put("display_version", jVar.f9489g);
        hashMap.put("source", Integer.toString(jVar.f9491i));
        String str = jVar.f9488f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject a(j jVar, boolean z9) {
        if (z9) {
            try {
                Map<String, String> f10 = f(jVar);
                a b10 = b(d(f10), jVar);
                g gVar = this.f9458c;
                gVar.b("Requesting settings from " + this.f9456a);
                g gVar2 = this.f9458c;
                gVar2.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f9458c.e("Settings request failed.", e10);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: protected */
    public a d(Map<String, String> map) {
        a a10 = this.f9457b.a(this.f9456a, map);
        return a10.d("User-Agent", "Crashlytics Android SDK/" + r.l()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* access modifiers changed from: package-private */
    public JSONObject g(f4.c cVar) {
        int b10 = cVar.b();
        g gVar = this.f9458c;
        gVar.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        g gVar2 = this.f9458c;
        gVar2.d("Settings request failed; (status: " + b10 + ") from " + this.f9456a);
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }
}
