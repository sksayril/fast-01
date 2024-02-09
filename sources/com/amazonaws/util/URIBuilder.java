package com.amazonaws.util;

import com.amazonaws.Protocol;
import java.net.URI;

public class URIBuilder {

    /* renamed from: h  reason: collision with root package name */
    private static final String f4762h = Protocol.HTTPS.toString();

    /* renamed from: a  reason: collision with root package name */
    private String f4763a;

    /* renamed from: b  reason: collision with root package name */
    private String f4764b;

    /* renamed from: c  reason: collision with root package name */
    private String f4765c;

    /* renamed from: d  reason: collision with root package name */
    private int f4766d;

    /* renamed from: e  reason: collision with root package name */
    private String f4767e;

    /* renamed from: f  reason: collision with root package name */
    private String f4768f;

    /* renamed from: g  reason: collision with root package name */
    private String f4769g;

    private URIBuilder(URI uri) {
        this.f4763a = uri.getScheme();
        this.f4764b = uri.getUserInfo();
        this.f4765c = uri.getHost();
        this.f4766d = uri.getPort();
        this.f4767e = uri.getPath();
        this.f4768f = uri.getQuery();
        this.f4769g = uri.getFragment();
    }

    public static URIBuilder b(URI uri) {
        return new URIBuilder(uri);
    }

    public URI a() {
        return new URI(this.f4763a, this.f4764b, this.f4765c, this.f4766d, this.f4767e, this.f4768f, this.f4769g);
    }

    public URIBuilder c(String str) {
        this.f4765c = str;
        return this;
    }
}
