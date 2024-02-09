package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AmazonWebServiceClient {

    /* renamed from: k  reason: collision with root package name */
    private static final Log f3922k = LogFactory.b(AmazonWebServiceClient.class);

    /* renamed from: a  reason: collision with root package name */
    protected volatile URI f3923a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f3924b;

    /* renamed from: c  reason: collision with root package name */
    protected ClientConfiguration f3925c;

    /* renamed from: d  reason: collision with root package name */
    protected AmazonHttpClient f3926d;

    /* renamed from: e  reason: collision with root package name */
    protected final List<RequestHandler2> f3927e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    protected long f3928f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Signer f3929g;

    /* renamed from: h  reason: collision with root package name */
    private volatile String f3930h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile String f3931i;

    /* renamed from: j  reason: collision with root package name */
    private volatile Region f3932j;

    protected AmazonWebServiceClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.f3925c = clientConfiguration;
        this.f3926d = new AmazonHttpClient(clientConfiguration, httpClient);
    }

    private String g() {
        int i10;
        String simpleName = Classes.childClassOf(AmazonWebServiceClient.class, this).getSimpleName();
        String serviceName = ServiceNameFactory.getServiceName(simpleName);
        if (serviceName != null) {
            return serviceName;
        }
        int indexOf = simpleName.indexOf("JavaClient");
        if (indexOf == -1 && (indexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name " + simpleName);
        }
        int indexOf2 = simpleName.indexOf("Amazon");
        if (indexOf2 == -1) {
            indexOf2 = simpleName.indexOf("AWS");
            if (indexOf2 != -1) {
                i10 = 3;
            } else {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name " + simpleName);
            }
        } else {
            i10 = 6;
        }
        if (indexOf2 < indexOf) {
            return StringUtils.b(simpleName.substring(indexOf2 + i10, indexOf));
        }
        throw new IllegalStateException("Unrecognized AWS http client class name " + simpleName);
    }

    private Signer h(String str, String str2, String str3, boolean z9) {
        String e10 = this.f3925c.e();
        Signer b10 = e10 == null ? SignerFactory.b(str, str2) : SignerFactory.c(e10, str);
        if (b10 instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) b10;
            if (str3 != null) {
                regionAwareSigner.b(str3);
            } else if (str2 != null && z9) {
                regionAwareSigner.b(str2);
            }
        }
        synchronized (this) {
            this.f3932j = Region.f(str2);
        }
        return b10;
    }

    private Signer i(URI uri, String str, boolean z9) {
        if (uri != null) {
            String o10 = o();
            return h(o10, AwsHostNameUtils.a(uri.getHost(), o10), str, z9);
        }
        throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
    }

    @Deprecated
    protected static boolean r() {
        return System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null;
    }

    @Deprecated
    private boolean s() {
        RequestMetricCollector u9 = u();
        return u9 != null && u9.b();
    }

    private URI x(String str) {
        if (!str.contains("://")) {
            str = this.f3925c.c().toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void j(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response) {
        k(aWSRequestMetrics, request, response, false);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void k(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response, boolean z9) {
        if (request != null) {
            aWSRequestMetrics.b(AWSRequestMetrics.Field.ClientExecuteTime);
            aWSRequestMetrics.c().c();
            l(request).a(request, response);
        }
        if (z9) {
            aWSRequestMetrics.e();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final RequestMetricCollector l(Request<?> request) {
        RequestMetricCollector i10 = request.r().i();
        if (i10 != null) {
            return i10;
        }
        RequestMetricCollector n10 = n();
        return n10 == null ? AwsSdkMetrics.getRequestMetricCollector() : n10;
    }

    public String m() {
        return this.f3931i;
    }

    @Deprecated
    public RequestMetricCollector n() {
        return this.f3926d.f();
    }

    /* access modifiers changed from: protected */
    public String o() {
        if (this.f3930h == null) {
            synchronized (this) {
                if (this.f3930h == null) {
                    this.f3930h = g();
                    String str = this.f3930h;
                    return str;
                }
            }
        }
        return this.f3930h;
    }

    public Signer p(URI uri) {
        return i(uri, this.f3924b, true);
    }

    public final String q() {
        return this.f3924b;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final boolean t(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestMetricCollector i10 = amazonWebServiceRequest.i();
        if (i10 == null || !i10.b()) {
            return s();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public RequestMetricCollector u() {
        RequestMetricCollector f10 = this.f3926d.f();
        return f10 == null ? AwsSdkMetrics.getRequestMetricCollector() : f10;
    }

    public void v(String str) {
        URI x9 = x(str);
        Signer i10 = i(x9, this.f3924b, false);
        synchronized (this) {
            this.f3923a = x9;
            this.f3929g = i10;
        }
    }

    public void w(Region region) {
        String str;
        if (region != null) {
            String o10 = o();
            if (region.i(o10)) {
                str = region.g(o10);
                int indexOf = str.indexOf("://");
                if (indexOf >= 0) {
                    str = str.substring(indexOf + 3);
                }
            } else {
                str = String.format("%s.%s.%s", new Object[]{m(), region.d(), region.a()});
            }
            URI x9 = x(str);
            Signer h10 = h(o10, region.d(), this.f3924b, false);
            synchronized (this) {
                this.f3923a = x9;
                this.f3929g = h10;
            }
            return;
        }
        throw new IllegalArgumentException("No region provided");
    }
}
