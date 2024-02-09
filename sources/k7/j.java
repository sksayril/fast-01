package k7;

import java.util.Map;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f10996a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10997b;

    public j(String str, Object obj) {
        this.f10996a = str;
        this.f10997b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f10997b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return this.f10997b;
    }

    public boolean c(String str) {
        Object obj = this.f10997b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
