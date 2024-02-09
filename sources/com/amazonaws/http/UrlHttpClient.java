package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class UrlHttpClient implements HttpClient {

    /* renamed from: c  reason: collision with root package name */
    private static final Log f4065c = LogFactory.b(UrlHttpClient.class);

    /* renamed from: a  reason: collision with root package name */
    private final ClientConfiguration f4066a;

    /* renamed from: b  reason: collision with root package name */
    private SSLContext f4067b = null;

    protected final class CurlBuilder {

        /* renamed from: a  reason: collision with root package name */
        private final URL f4068a;

        /* renamed from: b  reason: collision with root package name */
        private String f4069b = null;

        /* renamed from: c  reason: collision with root package name */
        private final HashMap<String, String> f4070c = new HashMap<>();

        /* renamed from: d  reason: collision with root package name */
        private String f4071d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4072e = false;

        public CurlBuilder(URL url) {
            if (url != null) {
                this.f4068a = url;
                return;
            }
            throw new IllegalArgumentException("Must have a valid url");
        }

        public String a() {
            if (b()) {
                StringBuilder sb = new StringBuilder("curl");
                if (this.f4069b != null) {
                    sb.append(" -X ");
                    sb.append(this.f4069b);
                }
                for (Map.Entry next : this.f4070c.entrySet()) {
                    sb.append(" -H \"");
                    sb.append((String) next.getKey());
                    sb.append(":");
                    sb.append((String) next.getValue());
                    sb.append("\"");
                }
                if (this.f4071d != null) {
                    sb.append(" -d '");
                    sb.append(this.f4071d);
                    sb.append("'");
                }
                sb.append(" ");
                sb.append(this.f4068a.toString());
                return sb.toString();
            }
            throw new IllegalStateException("Invalid state, cannot create curl command");
        }

        public boolean b() {
            return !this.f4072e;
        }

        public CurlBuilder c(String str) {
            this.f4071d = str;
            return this;
        }

        public CurlBuilder d(boolean z9) {
            this.f4072e = z9;
            return this;
        }

        public CurlBuilder e(Map<String, String> map) {
            this.f4070c.clear();
            this.f4070c.putAll(map);
            return this;
        }

        public CurlBuilder f(String str) {
            this.f4069b = str;
            return this;
        }
    }

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f4066a = clientConfiguration;
    }

    private void e(HttpsURLConnection httpsURLConnection) {
        if (this.f4067b == null) {
            TrustManager[] trustManagerArr = {this.f4066a.g()};
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                this.f4067b = instance;
                instance.init((KeyManager[]) null, trustManagerArr, (SecureRandom) null);
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException(e10);
            }
        }
        httpsURLConnection.setSSLSocketFactory(this.f4067b.getSocketFactory());
    }

    private void g(InputStream inputStream, OutputStream outputStream, CurlBuilder curlBuilder, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                if (byteBuffer != null) {
                    try {
                        byteBuffer.put(bArr, 0, read);
                    } catch (BufferOverflowException unused) {
                        curlBuilder.d(true);
                    }
                }
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public HttpResponse a(HttpRequest httpRequest) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.e().toURL().openConnection();
        CurlBuilder curlBuilder = this.f4066a.j() ? new CurlBuilder(httpRequest.e().toURL()) : null;
        c(httpRequest, httpURLConnection);
        b(httpRequest, httpURLConnection, curlBuilder);
        h(httpRequest, httpURLConnection, curlBuilder);
        if (curlBuilder != null) {
            f(curlBuilder.b() ? curlBuilder.a() : "Failed to create curl, content too long");
        }
        return d(httpRequest, httpURLConnection);
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection b(HttpRequest httpRequest, HttpURLConnection httpURLConnection, CurlBuilder curlBuilder) {
        if (httpRequest.c() != null && !httpRequest.c().isEmpty()) {
            if (curlBuilder != null) {
                curlBuilder.e(httpRequest.c());
            }
            for (Map.Entry next : httpRequest.c().entrySet()) {
                String str = (String) next.getKey();
                if (!str.equals("Content-Length") && !str.equals("Host")) {
                    str.equals("Expect");
                    httpURLConnection.setRequestProperty(str, (String) next.getValue());
                }
            }
        }
        String d10 = httpRequest.d();
        httpURLConnection.setRequestMethod(d10);
        if (curlBuilder != null) {
            curlBuilder.f(d10);
        }
        return httpURLConnection;
    }

    /* access modifiers changed from: package-private */
    public void c(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(this.f4066a.a());
        httpURLConnection.setReadTimeout(this.f4066a.f());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.f()) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (this.f4066a.g() != null) {
                e(httpsURLConnection);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public HttpResponse d(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(httpRequest.d())) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder b10 = HttpResponse.a().d(responseCode).e(responseMessage).b(errorStream);
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                b10.c((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return b10.a();
    }

    /* access modifiers changed from: protected */
    public void f(String str) {
        f4065c.a(str);
    }

    /* access modifiers changed from: package-private */
    public void h(HttpRequest httpRequest, HttpURLConnection httpURLConnection, CurlBuilder curlBuilder) {
        if (httpRequest.a() != null && httpRequest.b() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.f()) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.b());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            ByteBuffer byteBuffer = null;
            if (curlBuilder != null) {
                if (httpRequest.b() < 2147483647L) {
                    byteBuffer = ByteBuffer.allocate((int) httpRequest.b());
                } else {
                    curlBuilder.d(true);
                }
            }
            g(httpRequest.a(), outputStream, curlBuilder, byteBuffer);
            if (!(curlBuilder == null || byteBuffer == null || byteBuffer.position() == 0)) {
                curlBuilder.c(new String(byteBuffer.array(), "UTF-8"));
            }
            outputStream.flush();
            outputStream.close();
        }
    }

    public void shutdown() {
    }
}
