package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.p;
import i2.a;
import i2.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l2.d;
import l2.g;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: z  reason: collision with root package name */
    public static d f4884z = g.d();

    /* renamed from: m  reason: collision with root package name */
    final int f4885m;

    /* renamed from: n  reason: collision with root package name */
    private String f4886n;

    /* renamed from: o  reason: collision with root package name */
    private String f4887o;

    /* renamed from: p  reason: collision with root package name */
    private String f4888p;

    /* renamed from: q  reason: collision with root package name */
    private String f4889q;

    /* renamed from: r  reason: collision with root package name */
    private Uri f4890r;

    /* renamed from: s  reason: collision with root package name */
    private String f4891s;

    /* renamed from: t  reason: collision with root package name */
    private long f4892t;

    /* renamed from: u  reason: collision with root package name */
    private String f4893u;

    /* renamed from: v  reason: collision with root package name */
    List f4894v;

    /* renamed from: w  reason: collision with root package name */
    private String f4895w;

    /* renamed from: x  reason: collision with root package name */
    private String f4896x;

    /* renamed from: y  reason: collision with root package name */
    private Set f4897y = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f4885m = i10;
        this.f4886n = str;
        this.f4887o = str2;
        this.f4888p = str3;
        this.f4889q = str4;
        this.f4890r = uri;
        this.f4891s = str5;
        this.f4892t = j10;
        this.f4893u = str6;
        this.f4894v = list;
        this.f4895w = str7;
        this.f4896x = str8;
    }

    public static GoogleSignInAccount B(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), p.f(str7), new ArrayList((Collection) p.j(set)), str5, str6);
    }

    public static GoogleSignInAccount C(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount B = B(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        B.f4891s = str2;
        return B;
    }

    public String A() {
        return this.f4891s;
    }

    public Account d() {
        String str = this.f4888p;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4893u.equals(this.f4893u) && googleSignInAccount.z().equals(z());
    }

    public String f() {
        return this.f4889q;
    }

    public String g() {
        return this.f4888p;
    }

    public int hashCode() {
        return ((this.f4893u.hashCode() + 527) * 31) + z().hashCode();
    }

    public String i() {
        return this.f4896x;
    }

    public String k() {
        return this.f4895w;
    }

    public String l() {
        return this.f4886n;
    }

    public String o() {
        return this.f4887o;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f4885m);
        c.t(parcel, 2, l(), false);
        c.t(parcel, 3, o(), false);
        c.t(parcel, 4, g(), false);
        c.t(parcel, 5, f(), false);
        c.s(parcel, 6, y(), i10, false);
        c.t(parcel, 7, A(), false);
        c.q(parcel, 8, this.f4892t);
        c.t(parcel, 9, this.f4893u, false);
        c.w(parcel, 10, this.f4894v, false);
        c.t(parcel, 11, k(), false);
        c.t(parcel, 12, i(), false);
        c.b(parcel, a10);
    }

    public Uri y() {
        return this.f4890r;
    }

    public Set<Scope> z() {
        HashSet hashSet = new HashSet(this.f4894v);
        hashSet.addAll(this.f4897y);
        return hashSet;
    }
}
