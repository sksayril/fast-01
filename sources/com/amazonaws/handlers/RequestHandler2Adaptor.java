package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.TimingInfo;

final class RequestHandler2Adaptor extends RequestHandler2 {

    /* renamed from: a  reason: collision with root package name */
    private final RequestHandler f4039a;

    RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler != null) {
            this.f4039a = requestHandler;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void b(Request<?> request, Response<?> response, Exception exc) {
        this.f4039a.b(request, exc);
    }

    public void c(Request<?> request, Response<?> response) {
        TimingInfo timingInfo = null;
        AWSRequestMetrics b10 = request == null ? null : request.b();
        Object a10 = response == null ? null : response.a();
        if (b10 != null) {
            timingInfo = b10.c();
        }
        this.f4039a.c(request, a10, timingInfo);
    }

    public void d(Request<?> request) {
        this.f4039a.a(request);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RequestHandler2Adaptor)) {
            return false;
        }
        return this.f4039a.equals(((RequestHandler2Adaptor) obj).f4039a);
    }

    public int hashCode() {
        return this.f4039a.hashCode();
    }
}
