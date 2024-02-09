package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {
    private SSEAwsKeyManagementParams A;
    private ObjectTagging B;

    /* renamed from: r  reason: collision with root package name */
    private String f4328r;

    /* renamed from: s  reason: collision with root package name */
    private String f4329s;

    /* renamed from: t  reason: collision with root package name */
    private File f4330t;

    /* renamed from: u  reason: collision with root package name */
    private transient InputStream f4331u;

    /* renamed from: v  reason: collision with root package name */
    private ObjectMetadata f4332v;

    /* renamed from: w  reason: collision with root package name */
    private CannedAccessControlList f4333w;

    /* renamed from: x  reason: collision with root package name */
    private AccessControlList f4334x;

    /* renamed from: y  reason: collision with root package name */
    private String f4335y;

    /* renamed from: z  reason: collision with root package name */
    private String f4336z;

    public AbstractPutObjectRequest(String str, String str2, File file) {
        this.f4328r = str;
        this.f4329s = str2;
        this.f4330t = file;
    }

    public SSEAwsKeyManagementParams A() {
        return this.A;
    }

    public SSECustomerKey B() {
        return null;
    }

    public String C() {
        return this.f4335y;
    }

    public ObjectTagging D() {
        return this.B;
    }

    public void E(AccessControlList accessControlList) {
        this.f4334x = accessControlList;
    }

    public void F(CannedAccessControlList cannedAccessControlList) {
        this.f4333w = cannedAccessControlList;
    }

    public void G(InputStream inputStream) {
        this.f4331u = inputStream;
    }

    public void H(ObjectMetadata objectMetadata) {
        this.f4332v = objectMetadata;
    }

    public void I(String str) {
        this.f4336z = str;
    }

    public void J(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.A = sSEAwsKeyManagementParams;
    }

    public void K(SSECustomerKey sSECustomerKey) {
    }

    public void L(String str) {
        this.f4335y = str;
    }

    public void M(ObjectTagging objectTagging) {
        this.B = objectTagging;
    }

    public <T extends AbstractPutObjectRequest> T N(AccessControlList accessControlList) {
        E(accessControlList);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T O(CannedAccessControlList cannedAccessControlList) {
        F(cannedAccessControlList);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T P(InputStream inputStream) {
        G(inputStream);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T Q(ObjectMetadata objectMetadata) {
        H(objectMetadata);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T R(String str) {
        this.f4336z = str;
        return this;
    }

    public <T extends AbstractPutObjectRequest> T S(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        J(sSEAwsKeyManagementParams);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T T(SSECustomerKey sSECustomerKey) {
        K(sSECustomerKey);
        return this;
    }

    public <T extends AbstractPutObjectRequest> T U(String str) {
        L(str);
        return this;
    }

    /* renamed from: q */
    public AbstractPutObjectRequest clone() {
        return (AbstractPutObjectRequest) super.clone();
    }

    /* access modifiers changed from: protected */
    public final <T extends AbstractPutObjectRequest> T r(T t9) {
        d(t9);
        ObjectMetadata y9 = y();
        AbstractPutObjectRequest S = t9.N(s()).O(u()).P(w()).Q(y9 == null ? null : y9.clone()).R(z()).U(C()).S(A());
        B();
        return S.T((SSECustomerKey) null);
    }

    public AccessControlList s() {
        return this.f4334x;
    }

    public String t() {
        return this.f4328r;
    }

    public CannedAccessControlList u() {
        return this.f4333w;
    }

    public File v() {
        return this.f4330t;
    }

    public InputStream w() {
        return this.f4331u;
    }

    public String x() {
        return this.f4329s;
    }

    public ObjectMetadata y() {
        return this.f4332v;
    }

    public String z() {
        return this.f4336z;
    }
}
