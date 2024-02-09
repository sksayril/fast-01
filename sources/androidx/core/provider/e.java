package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.h;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f1590a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1591b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1592c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f1593d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1594e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f1595f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1590a = (String) h.j(str);
        this.f1591b = (String) h.j(str2);
        this.f1592c = (String) h.j(str3);
        this.f1593d = (List) h.j(list);
        this.f1595f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f1593d;
    }

    public int c() {
        return this.f1594e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f1595f;
    }

    public String e() {
        return this.f1590a;
    }

    public String f() {
        return this.f1591b;
    }

    public String g() {
        return this.f1592c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1590a + ", mProviderPackage: " + this.f1591b + ", mQuery: " + this.f1592c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f1593d.size(); i10++) {
            sb.append(" [");
            List list = this.f1593d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1594e);
        return sb.toString();
    }
}
