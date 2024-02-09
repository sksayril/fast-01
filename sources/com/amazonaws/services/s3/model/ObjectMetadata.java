package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final String f4473t = SSEAlgorithm.AES256.getAlgorithm();

    /* renamed from: u  reason: collision with root package name */
    public static final String f4474u = SSEAlgorithm.KMS.getAlgorithm();

    /* renamed from: m  reason: collision with root package name */
    private Map<String, String> f4475m;

    /* renamed from: n  reason: collision with root package name */
    private Map<String, Object> f4476n;

    /* renamed from: o  reason: collision with root package name */
    private Date f4477o;

    /* renamed from: p  reason: collision with root package name */
    private Date f4478p;

    /* renamed from: q  reason: collision with root package name */
    private String f4479q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f4480r;

    /* renamed from: s  reason: collision with root package name */
    private Date f4481s;

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f4475m = new TreeMap(comparator);
        this.f4476n = new TreeMap(comparator);
    }

    private ObjectMetadata(ObjectMetadata objectMetadata) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f4475m = new TreeMap(comparator);
        this.f4476n = new TreeMap(comparator);
        TreeMap treeMap = null;
        this.f4475m = objectMetadata.f4475m == null ? null : new TreeMap(objectMetadata.f4475m);
        this.f4476n = objectMetadata.f4476n != null ? new TreeMap(objectMetadata.f4476n) : treeMap;
        this.f4478p = DateUtils.b(objectMetadata.f4478p);
        this.f4479q = objectMetadata.f4479q;
        this.f4477o = DateUtils.b(objectMetadata.f4477o);
        this.f4480r = objectMetadata.f4480r;
        this.f4481s = DateUtils.b(objectMetadata.f4481s);
    }

    public Date A() {
        return DateUtils.b(this.f4477o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r0.lastIndexOf("/");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B() {
        /*
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f4476n
            java.lang.String r1 = "Content-Range"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = "/"
            int r1 = r0.lastIndexOf(r1)
            if (r1 < 0) goto L_0x001f
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            long r0 = java.lang.Long.parseLong(r0)
            return r0
        L_0x001f:
            long r0 = r2.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.model.ObjectMetadata.B():long");
    }

    public Map<String, Object> C() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(this.f4476n);
        return Collections.unmodifiableMap(treeMap);
    }

    public Object D(String str) {
        return this.f4476n.get(str);
    }

    public String E() {
        return (String) this.f4476n.get("x-amz-server-side-encryption");
    }

    public String F() {
        return (String) this.f4476n.get("x-amz-server-side-encryption-aws-kms-key-id");
    }

    public String G() {
        return (String) this.f4476n.get("x-amz-server-side-encryption-customer-algorithm");
    }

    public String H() {
        return (String) this.f4476n.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    public String I() {
        Object obj = this.f4476n.get("x-amz-storage-class");
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public Map<String, String> J() {
        return this.f4475m;
    }

    public String K() {
        return (String) this.f4476n.get("x-amz-version-id");
    }

    public boolean L() {
        return this.f4476n.get("x-amz-request-charged") != null;
    }

    public void M(String str) {
        this.f4476n.put("Cache-Control", str);
    }

    public void N(String str) {
        this.f4476n.put("Content-Disposition", str);
    }

    public void O(String str) {
        this.f4476n.put("Content-Encoding", str);
    }

    public void P(long j10) {
        this.f4476n.put("Content-Length", Long.valueOf(j10));
    }

    public void Q(String str) {
        if (str == null) {
            this.f4476n.remove("Content-MD5");
        } else {
            this.f4476n.put("Content-MD5", str);
        }
    }

    public void R(String str) {
        this.f4476n.put("Content-Type", str);
    }

    public void S(String str, Object obj) {
        this.f4476n.put(str, obj);
    }

    public void T(Date date) {
        this.f4477o = date;
    }

    public void U(Map<String, String> map) {
        this.f4475m = map;
    }

    public void b(boolean z9) {
        if (z9) {
            this.f4476n.put("x-amz-request-charged", "requester");
        }
    }

    public void d(String str) {
        this.f4476n.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    public void e(String str) {
        this.f4476n.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    public void f(String str) {
        this.f4476n.put("x-amz-server-side-encryption", str);
    }

    public void h(Date date) {
        this.f4481s = date;
    }

    public void i(boolean z9) {
        this.f4480r = Boolean.valueOf(z9);
    }

    public void k(String str) {
        this.f4479q = str;
    }

    public void n(Date date) {
        this.f4478p = date;
    }

    public void p(String str, String str2) {
        this.f4475m.put(str, str2);
    }

    /* renamed from: q */
    public ObjectMetadata clone() {
        return new ObjectMetadata(this);
    }

    public String r() {
        return (String) this.f4476n.get("Cache-Control");
    }

    public String s() {
        return (String) this.f4476n.get("Content-Disposition");
    }

    public String t() {
        return (String) this.f4476n.get("Content-Encoding");
    }

    public long u() {
        Long l10 = (Long) this.f4476n.get("Content-Length");
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public String v() {
        return (String) this.f4476n.get("Content-MD5");
    }

    public String w() {
        return (String) this.f4476n.get("Content-Type");
    }

    public String x() {
        return (String) this.f4476n.get("ETag");
    }

    public Date y() {
        return DateUtils.b(this.f4478p);
    }

    public String z() {
        return this.f4479q;
    }
}
