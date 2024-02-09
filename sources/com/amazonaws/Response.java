package com.amazonaws;

import com.amazonaws.http.HttpResponse;

public final class Response<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f3976a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpResponse f3977b;

    public Response(T t9, HttpResponse httpResponse) {
        this.f3976a = t9;
        this.f3977b = httpResponse;
    }

    public T a() {
        return this.f3976a;
    }
}
