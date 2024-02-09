package c4;

import com.google.auto.value.AutoValue;
import d4.f0;
import m4.a;
import o4.d;
import org.json.JSONObject;

@AutoValue
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3616a = new d().j(a.f3570a).i();

    static i a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static i b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public f0.e.d.C0122e h() {
        return f0.e.d.C0122e.a().d(f0.e.d.C0122e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
