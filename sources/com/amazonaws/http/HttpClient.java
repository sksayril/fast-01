package com.amazonaws.http;

public interface HttpClient {
    HttpResponse a(HttpRequest httpRequest);

    void shutdown();
}
