package i4;

import com.google.firebase.crashlytics.internal.common.w;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final w f9482a;

    g(w wVar) {
        this.f9482a = wVar;
    }

    private static h a(int i10) {
        if (i10 == 3) {
            return new l();
        }
        z3.g f10 = z3.g.f();
        f10.d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f9482a, jSONObject);
    }
}
