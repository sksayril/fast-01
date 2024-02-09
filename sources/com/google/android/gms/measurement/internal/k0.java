package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class k0 {
    public static final o4<Long> A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, t0.f6573a);
    public static final o4<Boolean> A0;
    public static final o4<Long> B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, w0.f6641a);
    public static final o4<Boolean> B0;
    public static final o4<Long> C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, v0.f6611a);
    public static final o4<Boolean> C0;
    public static final o4<Long> D = a("measurement.upload.retry_time", 1800000L, 1800000L, x0.f6688a);
    public static final o4<Boolean> D0;
    public static final o4<Integer> E = a("measurement.upload.retry_count", 6, 6, a1.f5845a);
    public static final o4<Boolean> E0;
    public static final o4<Long> F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, z0.f6764a);
    public static final o4<Boolean> F0;
    public static final o4<Integer> G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, b1.f5880a);
    public static final o4<Boolean> G0;
    public static final o4<Integer> H = a("measurement.audience.filter_result_max_count", 200, 200, f1.f6013a);
    public static final o4<Boolean> H0;
    public static final o4<Integer> I = a("measurement.upload.max_public_user_properties", 25, 25, (m4) null);
    public static final o4<Boolean> I0;
    public static final o4<Integer> J = a("measurement.upload.max_event_name_cardinality", 500, 500, (m4) null);
    public static final o4<Boolean> J0;
    public static final o4<Integer> K = a("measurement.upload.max_public_event_params", 25, 25, (m4) null);
    public static final o4<Boolean> K0;
    public static final o4<Long> L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, e1.f5991a);
    public static final o4<Boolean> L0;
    public static final o4<Boolean> M;
    public static final o4<Boolean> M0;
    public static final o4<String> N = a("measurement.test.string_flag", "---", "---", g1.f6046a);
    public static final o4<Boolean> N0;
    public static final o4<Long> O = a("measurement.test.long_flag", -1L, -1L, j1.f6145a);
    public static final o4<Boolean> O0;
    public static final o4<Integer> P = a("measurement.test.int_flag", -2, -2, l1.f6269a);
    private static final o4<Boolean> P0;
    public static final o4<Double> Q;
    public static final o4<Boolean> Q0;
    public static final o4<Integer> R = a("measurement.experiment.max_ids", 50, 50, n1.f6333a);
    public static final o4<Boolean> R0;
    public static final o4<Integer> S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, m1.f6287a);
    public static final o4<Boolean> S0;
    private static final o4<Integer> T = a("measurement.upload.max_event_parameter_value_length", 100, 100, o1.f6368a);
    public static final o4<Boolean> T0;
    public static final o4<Integer> U = a("measurement.max_bundles_per_iteration", 100, 100, r1.f6492a);
    public static final o4<Boolean> U0;
    public static final o4<Long> V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, q1.f6455a);
    public static final o4<Boolean> V0;
    public static final o4<Long> W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, t1.f6574a);
    public static final o4<Boolean> W0;
    public static final o4<Integer> X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, s1.f6532a);
    public static final o4<Boolean> X0;
    public static final o4<String> Y = a("measurement.rb.attribution.uri_scheme", "https", "https", u1.f6594a);
    public static final o4<Boolean> Y0;
    public static final o4<String> Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", x1.f6689a);
    public static final o4<Boolean> Z0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<o4<?>> f6173a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final o4<String> f6174a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", w1.f6642a);

    /* renamed from: a1  reason: collision with root package name */
    public static final o4<Boolean> f6175a1;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<o4<?>> f6176b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0  reason: collision with root package name */
    public static final o4<String> f6177b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", z1.f6765a);

    /* renamed from: b1  reason: collision with root package name */
    public static o4<Boolean> f6178b1;

    /* renamed from: c  reason: collision with root package name */
    public static final o4<Long> f6179c = a("measurement.ad_id_cache_time", 10000L, 10000L, m0.f6286a);

    /* renamed from: c0  reason: collision with root package name */
    public static final o4<String> f6180c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", y1.f6722a);

    /* renamed from: d  reason: collision with root package name */
    public static final o4<Long> f6181d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, q0.f6454a);

    /* renamed from: d0  reason: collision with root package name */
    public static final o4<String> f6182d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", a2.f5846a);

    /* renamed from: e  reason: collision with root package name */
    public static final o4<Long> f6183e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, d1.f5944a);

    /* renamed from: e0  reason: collision with root package name */
    public static final o4<String> f6184e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", e2.f5992a);

    /* renamed from: f  reason: collision with root package name */
    public static final o4<Long> f6185f = a("measurement.config.cache_time", 86400000L, 3600000L, p1.f6418a);

    /* renamed from: f0  reason: collision with root package name */
    public static final o4<Boolean> f6186f0;

    /* renamed from: g  reason: collision with root package name */
    public static final o4<String> f6187g = a("measurement.config.url_scheme", "https", "https", b2.f5881a);

    /* renamed from: g0  reason: collision with root package name */
    public static final o4<Boolean> f6188g0;

    /* renamed from: h  reason: collision with root package name */
    public static final o4<String> f6189h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", o2.f6369a);

    /* renamed from: h0  reason: collision with root package name */
    public static final o4<Boolean> f6190h0;

    /* renamed from: i  reason: collision with root package name */
    public static final o4<Integer> f6191i = a("measurement.upload.max_bundles", 100, 100, a3.f5847a);

    /* renamed from: i0  reason: collision with root package name */
    public static final o4<Boolean> f6192i0;

    /* renamed from: j  reason: collision with root package name */
    public static final o4<Integer> f6193j = a("measurement.upload.max_batch_size", 65536, 65536, n3.f6335a);

    /* renamed from: j0  reason: collision with root package name */
    public static final o4<Boolean> f6194j0;

    /* renamed from: k  reason: collision with root package name */
    public static final o4<Integer> f6195k = a("measurement.upload.max_bundle_size", 65536, 65536, z3.f6767a);

    /* renamed from: k0  reason: collision with root package name */
    public static final o4<Boolean> f6196k0;

    /* renamed from: l  reason: collision with root package name */
    public static final o4<Integer> f6197l = a("measurement.upload.max_events_per_bundle", 1000, 1000, o0.f6367a);

    /* renamed from: l0  reason: collision with root package name */
    public static final o4<Boolean> f6198l0;

    /* renamed from: m  reason: collision with root package name */
    public static final o4<Integer> f6199m = a("measurement.upload.max_events_per_day", 100000, 100000, y0.f6721a);

    /* renamed from: m0  reason: collision with root package name */
    public static final o4<Boolean> f6200m0;

    /* renamed from: n  reason: collision with root package name */
    public static final o4<Integer> f6201n = a("measurement.upload.max_error_events_per_day", 1000, 1000, i1.f6116a);

    /* renamed from: n0  reason: collision with root package name */
    public static final o4<Boolean> f6202n0;

    /* renamed from: o  reason: collision with root package name */
    public static final o4<Integer> f6203o = a("measurement.upload.max_public_events_per_day", 50000, 50000, v1.f6612a);

    /* renamed from: o0  reason: collision with root package name */
    public static final o4<Boolean> f6204o0;

    /* renamed from: p  reason: collision with root package name */
    public static final o4<Integer> f6205p = a("measurement.upload.max_conversions_per_day", 10000, 10000, f2.f6014a);

    /* renamed from: p0  reason: collision with root package name */
    public static final o4<Boolean> f6206p0;

    /* renamed from: q  reason: collision with root package name */
    public static final o4<Integer> f6207q = a("measurement.upload.max_realtime_events_per_day", 10, 10, s2.f6533a);

    /* renamed from: q0  reason: collision with root package name */
    public static final o4<Boolean> f6208q0;

    /* renamed from: r  reason: collision with root package name */
    public static final o4<Integer> f6209r = a("measurement.store.max_stored_events_per_app", 100000, 100000, b3.f5882a);

    /* renamed from: r0  reason: collision with root package name */
    public static final o4<Integer> f6210r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, r2.f6493a);

    /* renamed from: s  reason: collision with root package name */
    public static final o4<String> f6211s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", p3.f6420a);

    /* renamed from: s0  reason: collision with root package name */
    private static final o4<Boolean> f6212s0;

    /* renamed from: t  reason: collision with root package name */
    public static final o4<Long> f6213t = a("measurement.upload.backoff_period", 43200000L, 43200000L, y3.f6724a);

    /* renamed from: t0  reason: collision with root package name */
    private static final o4<Boolean> f6214t0;

    /* renamed from: u  reason: collision with root package name */
    public static final o4<Long> f6215u = a("measurement.upload.window_interval", 3600000L, 3600000L, l0.f6268a);

    /* renamed from: u0  reason: collision with root package name */
    public static final o4<Boolean> f6216u0;

    /* renamed from: v  reason: collision with root package name */
    public static final o4<Long> f6217v = a("measurement.upload.interval", 3600000L, 3600000L, n0.f6332a);

    /* renamed from: v0  reason: collision with root package name */
    public static final o4<Boolean> f6218v0;

    /* renamed from: w  reason: collision with root package name */
    public static final o4<Long> f6219w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, p0.f6417a);

    /* renamed from: w0  reason: collision with root package name */
    public static final o4<Boolean> f6220w0;

    /* renamed from: x  reason: collision with root package name */
    public static final o4<Long> f6221x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, s0.f6531a);

    /* renamed from: x0  reason: collision with root package name */
    public static final o4<Boolean> f6222x0;

    /* renamed from: y  reason: collision with root package name */
    public static final o4<Long> f6223y = a("measurement.upload.minimum_delay", 500L, 500L, r0.f6491a);

    /* renamed from: y0  reason: collision with root package name */
    public static final o4<Boolean> f6224y0;

    /* renamed from: z  reason: collision with root package name */
    public static final o4<Long> f6225z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, u0.f6593a);

    /* renamed from: z0  reason: collision with root package name */
    private static final o4<Boolean> f6226z0;

    static {
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, h1.f6071a);
        Double valueOf = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf, valueOf, k1.f6227a);
        Boolean bool2 = Boolean.TRUE;
        f6186f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, c2.f5917a);
        f6188g0 = a("measurement.quality.checksum", bool, bool, (m4) null);
        f6190h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, g2.f6047a);
        f6192i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, i2.f6117a);
        f6194j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, h2.f6072a);
        f6196k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, k2.f6228a);
        f6198l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, j2.f6146a);
        f6200m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, m2.f6288a);
        f6202n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, l2.f6270a);
        f6204o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, n2.f6334a);
        f6206p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, q2.f6456a);
        f6208q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, p2.f6419a);
        f6212s0 = a("measurement.client.click_identifier_control.dev", bool, bool, u2.f6595a);
        f6214t0 = a("measurement.service.click_identifier_control", bool, bool, t2.f6575a);
        f6216u0 = a("measurement.service.store_null_safelist", bool2, bool2, w2.f6643a);
        f6218v0 = a("measurement.service.store_safelist", bool2, bool2, v2.f6613a);
        f6220w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, y2.f6723a);
        f6222x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, x2.f6690a);
        f6224y0 = a("measurement.session_stitching_token_enabled", bool, bool, z2.f6766a);
        f6226z0 = a("measurement.sgtm.client.dev", bool, bool, c3.f5918a);
        A0 = a("measurement.sgtm.service", bool, bool, f3.f6015a);
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, d3.f5948a);
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, h3.f6073a);
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, g3.f6048a);
        E0 = a("measurement.sfmc.client", bool2, bool2, j3.f6147a);
        F0 = a("measurement.sfmc.service", bool2, bool2, i3.f6118a);
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, l3.f6271a);
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, k3.f6229a);
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, m3.f6289a);
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, o3.f6370a);
        K0 = a("measurement.remove_app_background.client", bool, bool, r3.f6494a);
        L0 = a("measurement.rb.attribution.service", bool, bool, q3.f6457a);
        M0 = a("measurement.rb.attribution.client2", bool, bool, t3.f6576a);
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, s3.f6534a);
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, v3.f6614a);
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, u3.f6596a);
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, x3.f6691a);
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, w3.f6644a);
        S0 = a("measurement.dma_consent.client", bool, bool, b4.f5883a);
        T0 = a("measurement.dma_consent.service", bool, bool, a4.f5848a);
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, d4.f5949a);
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, c4.f5919a);
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, g4.f6049a);
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, e4.f5994a);
        Y0 = a("measurement.service.deferred_first_open", bool, bool, i4.f6119a);
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, h4.f6074a);
        f6175a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, k4.f6230a);
        f6178b1 = a("measurement.increase_param_lengths", bool, bool, j4.f6148a);
    }

    private static <V> o4<V> a(String str, V v9, V v10, m4<V> m4Var) {
        o4 o4Var = new o4(str, v9, v10, m4Var);
        f6173a.add(o4Var);
        return o4Var;
    }

    public static Map<String, String> c(Context context) {
        p5 a10 = p5.a(context.getContentResolver(), c6.a("com.google.android.gms.measurement"), j0.f6144m);
        return a10 == null ? Collections.emptyMap() : a10.b();
    }
}
