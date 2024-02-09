package i4;

import com.google.firebase.crashlytics.internal.common.w;
import i4.d;
import org.json.JSONObject;

class l implements h {
    l() {
    }

    private static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(w wVar, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : wVar.a() + (j10 * 1000);
    }

    public d a(w wVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        return new d(d(wVar, (long) optInt2, jSONObject2), c(jSONObject2.has("session") ? jSONObject2.getJSONObject("session") : new JSONObject()), b(jSONObject2.getJSONObject("features")), optInt, optInt2, jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject2.optDouble("on_demand_backoff_base", 1.2d), jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
