package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import n1.b;
import p1.g;

public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f4861c;

    /* renamed from: d  reason: collision with root package name */
    static final String f4862d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f4863e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<b> f4864f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{b.b("proto"), b.b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final a f4865g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f4866h;

    /* renamed from: a  reason: collision with root package name */
    private final String f4867a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4868b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4861c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4862d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4863e = a12;
        f4865g = new a(a10, (String) null);
        f4866h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f4867a = str;
        this.f4868b = str2;
    }

    public static a e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> a() {
        return f4864f;
    }

    public String b() {
        return "cct";
    }

    public byte[] c() {
        return d();
    }

    public byte[] d() {
        String str = this.f4868b;
        if (str == null && this.f4867a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4867a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String f() {
        return this.f4868b;
    }

    public String g() {
        return this.f4867a;
    }
}
