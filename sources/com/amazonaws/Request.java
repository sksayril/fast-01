package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;

public interface Request<T> {
    void a(InputStream inputStream);

    AWSRequestMetrics b();

    void c(String str, String str2);

    @Deprecated
    void d(String str);

    String e();

    @Deprecated
    String f();

    void g(AWSRequestMetrics aWSRequestMetrics);

    Map<String, String> getParameters();

    void h(Map<String, String> map);

    void i(String str, String str2);

    URI j();

    void k(Map<String, String> map);

    Map<String, String> l();

    String m();

    boolean n();

    String o();

    long p();

    void q(long j10);

    AmazonWebServiceRequest r();

    void s(URI uri);

    HttpMethodName t();

    void u(boolean z9);

    void v(HttpMethodName httpMethodName);

    InputStream w();
}
