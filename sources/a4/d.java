package a4;

import android.os.Bundle;
import b4.a;
import b4.b;
import org.json.JSONException;
import org.json.JSONObject;
import z3.g;

public class d implements b, b {

    /* renamed from: a  reason: collision with root package name */
    private a f12a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void S(String str, Bundle bundle) {
        a aVar = this.f12a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    public void a(a aVar) {
        this.f12a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
