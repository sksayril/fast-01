package e5;

import android.net.Uri;
import b9.j0;
import g8.n;
import g8.s;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import r8.p;

public final class d implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8468d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final c5.b f8469a;

    /* renamed from: b  reason: collision with root package name */
    private final j8.g f8470b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8471c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    static final class b extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f8472m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d f8473n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f8474o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<JSONObject, j8.d<? super s>, Object> f8475p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p<String, j8.d<? super s>, Object> f8476q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Map<String, String> map, p<? super JSONObject, ? super j8.d<? super s>, ? extends Object> pVar, p<? super String, ? super j8.d<? super s>, ? extends Object> pVar2, j8.d<? super b> dVar2) {
            super(2, dVar2);
            this.f8473n = dVar;
            this.f8474o = map;
            this.f8475p = pVar;
            this.f8476q = pVar2;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new b(this.f8473n, this.f8474o, this.f8475p, this.f8476q, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((b) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f8472m;
            if (i10 == 0) {
                n.b(obj);
                URLConnection openConnection = this.f8473n.c().openConnection();
                l.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry next : this.f8474o.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    u uVar = new u();
                    while (true) {
                        T readLine = bufferedReader.readLine();
                        uVar.f11078m = readLine;
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    p<JSONObject, j8.d<? super s>, Object> pVar = this.f8475p;
                    this.f8472m = 1;
                    if (pVar.invoke(jSONObject, this) == d10) {
                        return d10;
                    }
                } else {
                    p<String, j8.d<? super s>, Object> pVar2 = this.f8476q;
                    String str = "Bad response code: " + responseCode;
                    this.f8472m = 2;
                    if (pVar2.invoke(str, this) == d10) {
                        return d10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                try {
                    n.b(obj);
                } catch (Exception e10) {
                    p<String, j8.d<? super s>, Object> pVar3 = this.f8476q;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = e10.toString();
                    }
                    this.f8472m = 3;
                    if (pVar3.invoke(message, this) == d10) {
                        return d10;
                    }
                }
            } else if (i10 == 3) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    public d(c5.b bVar, j8.g gVar, String str) {
        l.e(bVar, "appInfo");
        l.e(gVar, "blockingDispatcher");
        l.e(str, "baseUrl");
        this.f8469a = bVar;
        this.f8470b = gVar;
        this.f8471c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c5.b bVar, j8.g gVar, String str, int i10, g gVar2) {
        this(bVar, gVar, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    /* access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f8471c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f8469a.b()).appendPath("settings").appendQueryParameter("build_version", this.f8469a.a().a()).appendQueryParameter("display_version", this.f8469a.a().f()).build().toString());
    }

    public Object a(Map<String, String> map, p<? super JSONObject, ? super j8.d<? super s>, ? extends Object> pVar, p<? super String, ? super j8.d<? super s>, ? extends Object> pVar2, j8.d<? super s> dVar) {
        Object g10 = b9.g.g(this.f8470b, new b(this, map, pVar, pVar2, (j8.d<? super b>) null), dVar);
        return g10 == d.d() ? g10 : s.f8976a;
    }
}
