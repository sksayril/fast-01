package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;
import javax.net.ssl.TrustManager;

public class ClientConfiguration {

    /* renamed from: u  reason: collision with root package name */
    public static final String f3940u = VersionInfoUtils.b();

    /* renamed from: v  reason: collision with root package name */
    public static final RetryPolicy f3941v = PredefinedRetryPolicies.f4246b;

    /* renamed from: a  reason: collision with root package name */
    private String f3942a = f3940u;

    /* renamed from: b  reason: collision with root package name */
    private String f3943b;

    /* renamed from: c  reason: collision with root package name */
    private int f3944c = -1;

    /* renamed from: d  reason: collision with root package name */
    private RetryPolicy f3945d = f3941v;

    /* renamed from: e  reason: collision with root package name */
    private Protocol f3946e = Protocol.HTTPS;

    /* renamed from: f  reason: collision with root package name */
    private String f3947f = null;

    /* renamed from: g  reason: collision with root package name */
    private int f3948g = -1;

    /* renamed from: h  reason: collision with root package name */
    private String f3949h = null;

    /* renamed from: i  reason: collision with root package name */
    private String f3950i = null;
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    private String f3951j = null;
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    private String f3952k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f3953l = 10;

    /* renamed from: m  reason: collision with root package name */
    private int f3954m = 15000;

    /* renamed from: n  reason: collision with root package name */
    private int f3955n = 15000;

    /* renamed from: o  reason: collision with root package name */
    private int f3956o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f3957p = 0;

    /* renamed from: q  reason: collision with root package name */
    private String f3958q;

    /* renamed from: r  reason: collision with root package name */
    private TrustManager f3959r = null;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3960s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3961t = false;

    public int a() {
        return this.f3955n;
    }

    public int b() {
        return this.f3944c;
    }

    public Protocol c() {
        return this.f3946e;
    }

    public RetryPolicy d() {
        return this.f3945d;
    }

    public String e() {
        return this.f3958q;
    }

    public int f() {
        return this.f3954m;
    }

    public TrustManager g() {
        return this.f3959r;
    }

    public String h() {
        return this.f3942a;
    }

    public String i() {
        return this.f3943b;
    }

    public boolean j() {
        return this.f3960s;
    }

    public boolean k() {
        return this.f3961t;
    }
}
