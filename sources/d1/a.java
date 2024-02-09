package d1;

import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7664a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7665b;

    private a(String str, String str2) {
        this.f7664a = str;
        this.f7665b = str2;
    }

    public static a c(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new a((String) map.get("name"), (String) map.get("defType"));
    }

    public String a() {
        return this.f7665b;
    }

    public String b() {
        return this.f7664a;
    }
}
