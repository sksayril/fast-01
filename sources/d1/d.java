package d1;

import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f7671a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7672b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7673c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7674d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7675e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7676f;

    private d(String str, String str2, a aVar, boolean z9, boolean z10, boolean z11) {
        this.f7671a = str;
        this.f7672b = str2;
        this.f7673c = aVar;
        this.f7674d = z9;
        this.f7675e = z10;
        this.f7676f = z11;
    }

    public static d g(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new d((String) map.get("notificationTitle"), (String) map.get("notificationText"), a.c((Map) map.get("notificationIcon")), ((Boolean) map.get("enableWifiLock")).booleanValue(), ((Boolean) map.get("enableWakeLock")).booleanValue(), ((Boolean) map.get("setOngoing")).booleanValue());
    }

    public a a() {
        return this.f7673c;
    }

    public String b() {
        return this.f7672b;
    }

    public String c() {
        return this.f7671a;
    }

    public boolean d() {
        return this.f7675e;
    }

    public boolean e() {
        return this.f7674d;
    }

    public boolean f() {
        return this.f7676f;
    }
}
