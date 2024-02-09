package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultRequest<T> implements Request<T> {

    /* renamed from: a  reason: collision with root package name */
    private String f3962a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3963b = false;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f3964c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f3965d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private URI f3966e;

    /* renamed from: f  reason: collision with root package name */
    private String f3967f;

    /* renamed from: g  reason: collision with root package name */
    private final AmazonWebServiceRequest f3968g;

    /* renamed from: h  reason: collision with root package name */
    private HttpMethodName f3969h = HttpMethodName.POST;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f3970i;

    /* renamed from: j  reason: collision with root package name */
    private long f3971j;

    /* renamed from: k  reason: collision with root package name */
    private AWSRequestMetrics f3972k;

    /* renamed from: l  reason: collision with root package name */
    private String f3973l;

    /* renamed from: m  reason: collision with root package name */
    private String f3974m;

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest, String str) {
        this.f3967f = str;
        this.f3968g = amazonWebServiceRequest;
    }

    public void a(InputStream inputStream) {
        this.f3970i = inputStream;
    }

    @Deprecated
    public AWSRequestMetrics b() {
        return this.f3972k;
    }

    public void c(String str, String str2) {
        this.f3964c.put(str, str2);
    }

    public void d(String str) {
        this.f3962a = str;
    }

    public String e() {
        return this.f3974m;
    }

    public String f() {
        return this.f3962a;
    }

    @Deprecated
    public void g(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f3972k == null) {
            this.f3972k = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    public Map<String, String> getParameters() {
        return this.f3964c;
    }

    public void h(Map<String, String> map) {
        this.f3964c.clear();
        this.f3964c.putAll(map);
    }

    public void i(String str, String str2) {
        this.f3965d.put(str, str2);
    }

    public URI j() {
        return this.f3966e;
    }

    public void k(Map<String, String> map) {
        this.f3965d.clear();
        this.f3965d.putAll(map);
    }

    public Map<String, String> l() {
        return this.f3965d;
    }

    public String m() {
        return this.f3973l;
    }

    public boolean n() {
        return this.f3963b;
    }

    public String o() {
        return this.f3967f;
    }

    public long p() {
        return this.f3971j;
    }

    public void q(long j10) {
        this.f3971j = j10;
    }

    public AmazonWebServiceRequest r() {
        return this.f3968g;
    }

    public void s(URI uri) {
        this.f3966e = uri;
    }

    public HttpMethodName t() {
        return this.f3969h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        sb.append(" ");
        sb.append(j());
        sb.append(" ");
        String f10 = f();
        if (f10 == null) {
            sb.append("/");
        } else {
            if (!f10.startsWith("/")) {
                sb.append("/");
            }
            sb.append(f10);
        }
        sb.append(" ");
        if (!getParameters().isEmpty()) {
            sb.append("Parameters: (");
            for (String next : getParameters().keySet()) {
                sb.append(next);
                sb.append(": ");
                sb.append(getParameters().get(next));
                sb.append(", ");
            }
            sb.append(") ");
        }
        if (!l().isEmpty()) {
            sb.append("Headers: (");
            for (String next2 : l().keySet()) {
                sb.append(next2);
                sb.append(": ");
                sb.append(l().get(next2));
                sb.append(", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    public void u(boolean z9) {
        this.f3963b = z9;
    }

    public void v(HttpMethodName httpMethodName) {
        this.f3969h = httpMethodName;
    }

    public InputStream w() {
        return this.f3970i;
    }
}
