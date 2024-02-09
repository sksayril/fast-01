package com.google.android.gms.internal.measurement;

public final class bd implements cd {
    private static final f6<String> A;
    private static final f6<String> B;
    private static final f6<String> C;
    private static final f6<String> D;
    private static final f6<Long> E;
    private static final f6<Long> F;
    private static final f6<Long> G;
    private static final f6<Long> H;
    private static final f6<Long> I;
    private static final f6<Long> J;
    private static final f6<Long> K;
    private static final f6<Long> L;
    private static final f6<Long> M;
    private static final f6<Long> N;
    private static final f6<Long> O;
    private static final f6<Long> P;
    private static final f6<Long> Q;
    private static final f6<Long> R;
    private static final f6<Long> S;
    private static final f6<Long> T;
    private static final f6<Long> U;
    private static final f6<String> V;
    private static final f6<Long> W;
    private static final f6<String> X;

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Long> f5128a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Long> f5129b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Long> f5130c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Long> f5131d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<String> f5132e;

    /* renamed from: f  reason: collision with root package name */
    private static final f6<String> f5133f;

    /* renamed from: g  reason: collision with root package name */
    private static final f6<String> f5134g;

    /* renamed from: h  reason: collision with root package name */
    private static final f6<Long> f5135h;

    /* renamed from: i  reason: collision with root package name */
    private static final f6<String> f5136i;

    /* renamed from: j  reason: collision with root package name */
    private static final f6<Long> f5137j;

    /* renamed from: k  reason: collision with root package name */
    private static final f6<Long> f5138k;

    /* renamed from: l  reason: collision with root package name */
    private static final f6<Long> f5139l;

    /* renamed from: m  reason: collision with root package name */
    private static final f6<Long> f5140m;

    /* renamed from: n  reason: collision with root package name */
    private static final f6<Long> f5141n;

    /* renamed from: o  reason: collision with root package name */
    private static final f6<Long> f5142o;

    /* renamed from: p  reason: collision with root package name */
    private static final f6<Long> f5143p;

    /* renamed from: q  reason: collision with root package name */
    private static final f6<Long> f5144q;

    /* renamed from: r  reason: collision with root package name */
    private static final f6<Long> f5145r;

    /* renamed from: s  reason: collision with root package name */
    private static final f6<Long> f5146s;

    /* renamed from: t  reason: collision with root package name */
    private static final f6<String> f5147t;

    /* renamed from: u  reason: collision with root package name */
    private static final f6<Long> f5148u;

    /* renamed from: v  reason: collision with root package name */
    private static final f6<Long> f5149v;

    /* renamed from: w  reason: collision with root package name */
    private static final f6<Long> f5150w;

    /* renamed from: x  reason: collision with root package name */
    private static final f6<Long> f5151x;

    /* renamed from: y  reason: collision with root package name */
    private static final f6<String> f5152y;

    /* renamed from: z  reason: collision with root package name */
    private static final f6<Long> f5153z;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5128a = e10.b("measurement.ad_id_cache_time", 10000);
        f5129b = e10.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000);
        f5130c = e10.b("measurement.max_bundles_per_iteration", 100);
        f5131d = e10.b("measurement.config.cache_time", 86400000);
        f5132e = e10.c("measurement.log_tag", "FA");
        f5133f = e10.c("measurement.config.url_authority", "app-measurement.com");
        f5134g = e10.c("measurement.config.url_scheme", "https");
        f5135h = e10.b("measurement.upload.debug_upload_interval", 1000);
        f5136i = e10.c("measurement.rb.attribution.event_params", "value|currency");
        f5137j = e10.b("measurement.lifetimevalue.max_currency_tracked", 4);
        f5138k = e10.b("measurement.upload.max_event_parameter_value_length", 100);
        f5139l = e10.b("measurement.store.max_stored_events_per_app", 100000);
        f5140m = e10.b("measurement.experiment.max_ids", 50);
        f5141n = e10.b("measurement.audience.filter_result_max_count", 200);
        f5142o = e10.b("measurement.upload.max_item_scoped_custom_parameters", 27);
        f5143p = e10.b("measurement.rb.attribution.client.min_ad_services_version", 7);
        f5144q = e10.b("measurement.alarm_manager.minimum_interval", 60000);
        f5145r = e10.b("measurement.upload.minimum_delay", 500);
        f5146s = e10.b("measurement.monitoring.sample_period_millis", 86400000);
        f5147t = e10.c("measurement.rb.attribution.app_allowlist", "");
        f5148u = e10.b("measurement.upload.realtime_upload_interval", 10000);
        f5149v = e10.b("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        f5150w = e10.b("measurement.config.cache_time.service", 3600000);
        f5151x = e10.b("measurement.service_client.idle_disconnect_millis", 5000);
        f5152y = e10.c("measurement.log_tag.service", "FA-SVC");
        f5153z = e10.b("measurement.upload.stale_data_deletion_interval", 86400000);
        A = e10.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = e10.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = e10.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = e10.c("measurement.rb.attribution.uri_scheme", "https");
        E = e10.b("measurement.sdk.attribution.cache.ttl", 604800000);
        F = e10.b("measurement.redaction.app_instance_id.ttl", 7200000);
        G = e10.b("measurement.upload.backoff_period", 43200000);
        H = e10.b("measurement.upload.initial_upload_delay_time", 15000);
        I = e10.b("measurement.upload.interval", 3600000);
        J = e10.b("measurement.upload.max_bundle_size", 65536);
        K = e10.b("measurement.upload.max_bundles", 100);
        L = e10.b("measurement.upload.max_conversions_per_day", 500);
        M = e10.b("measurement.upload.max_error_events_per_day", 1000);
        N = e10.b("measurement.upload.max_events_per_bundle", 1000);
        O = e10.b("measurement.upload.max_events_per_day", 100000);
        P = e10.b("measurement.upload.max_public_events_per_day", 50000);
        Q = e10.b("measurement.upload.max_queue_time", 2419200000L);
        R = e10.b("measurement.upload.max_realtime_events_per_day", 10);
        S = e10.b("measurement.upload.max_batch_size", 65536);
        T = e10.b("measurement.upload.retry_count", 6);
        U = e10.b("measurement.upload.retry_time", 1800000);
        V = e10.c("measurement.upload.url", "https://app-measurement.com/a");
        W = e10.b("measurement.upload.window_interval", 3600000);
        X = e10.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    public final long F() {
        return f5144q.e().longValue();
    }

    public final long P() {
        return f5142o.e().longValue();
    }

    public final String Q() {
        return f5133f.e();
    }

    public final String R() {
        return A.e();
    }

    public final long S() {
        return J.e().longValue();
    }

    public final String T() {
        return V.e();
    }

    public final long U() {
        return R.e().longValue();
    }

    public final long V() {
        return F.e().longValue();
    }

    public final long W() {
        return f5149v.e().longValue();
    }

    public final String X() {
        return f5134g.e();
    }

    public final long Y() {
        return K.e().longValue();
    }

    public final String Z() {
        return B.e();
    }

    public final long a() {
        return f5129b.e().longValue();
    }

    public final long a0() {
        return G.e().longValue();
    }

    public final long b() {
        return f5130c.e().longValue();
    }

    public final long b0() {
        return O.e().longValue();
    }

    public final long c() {
        return f5131d.e().longValue();
    }

    public final String c0() {
        return X.e();
    }

    public final long d() {
        return f5135h.e().longValue();
    }

    public final long d0() {
        return f5151x.e().longValue();
    }

    public final long e() {
        return f5140m.e().longValue();
    }

    public final long e0() {
        return S.e().longValue();
    }

    public final long f() {
        return f5137j.e().longValue();
    }

    public final long f0() {
        return U.e().longValue();
    }

    public final long g() {
        return f5139l.e().longValue();
    }

    public final String g0() {
        return f5136i.e();
    }

    public final long h() {
        return f5138k.e().longValue();
    }

    public final long h0() {
        return L.e().longValue();
    }

    public final long i() {
        return f5143p.e().longValue();
    }

    public final long i0() {
        return H.e().longValue();
    }

    public final long j() {
        return N.e().longValue();
    }

    public final String j0() {
        return C.e();
    }

    public final long k() {
        return f5141n.e().longValue();
    }

    public final long k0() {
        return P.e().longValue();
    }

    public final long l() {
        return M.e().longValue();
    }

    public final long l0() {
        return f5153z.e().longValue();
    }

    public final long m() {
        return f5148u.e().longValue();
    }

    public final long m0() {
        return T.e().longValue();
    }

    public final long n() {
        return f5145r.e().longValue();
    }

    public final long n0() {
        return W.e().longValue();
    }

    public final String o0() {
        return f5147t.e();
    }

    public final String p0() {
        return D.e();
    }

    public final long q0() {
        return I.e().longValue();
    }

    public final long r() {
        return f5146s.e().longValue();
    }

    public final long r0() {
        return Q.e().longValue();
    }

    public final long s0() {
        return E.e().longValue();
    }

    public final long zza() {
        return f5128a.e().longValue();
    }
}
