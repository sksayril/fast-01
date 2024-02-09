package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {
    private ObjectTagging A;

    /* renamed from: r  reason: collision with root package name */
    private String f4427r;

    /* renamed from: s  reason: collision with root package name */
    private String f4428s;

    /* renamed from: t  reason: collision with root package name */
    public ObjectMetadata f4429t;

    /* renamed from: u  reason: collision with root package name */
    private CannedAccessControlList f4430u;

    /* renamed from: v  reason: collision with root package name */
    private AccessControlList f4431v;

    /* renamed from: w  reason: collision with root package name */
    private StorageClass f4432w;

    /* renamed from: x  reason: collision with root package name */
    private String f4433x;

    /* renamed from: y  reason: collision with root package name */
    private SSEAwsKeyManagementParams f4434y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f4435z;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f4427r = str;
        this.f4428s = str2;
    }

    public void A(ObjectMetadata objectMetadata) {
        this.f4429t = objectMetadata;
    }

    public void B(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f4434y = sSEAwsKeyManagementParams;
    }

    public void C(ObjectTagging objectTagging) {
        this.A = objectTagging;
    }

    public InitiateMultipartUploadRequest D(CannedAccessControlList cannedAccessControlList) {
        this.f4430u = cannedAccessControlList;
        return this;
    }

    public InitiateMultipartUploadRequest E(ObjectMetadata objectMetadata) {
        A(objectMetadata);
        return this;
    }

    public InitiateMultipartUploadRequest F(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        B(sSEAwsKeyManagementParams);
        return this;
    }

    public InitiateMultipartUploadRequest G(ObjectTagging objectTagging) {
        C(objectTagging);
        return this;
    }

    public AccessControlList q() {
        return this.f4431v;
    }

    public String r() {
        return this.f4427r;
    }

    public CannedAccessControlList s() {
        return this.f4430u;
    }

    public String t() {
        return this.f4428s;
    }

    public String u() {
        return this.f4433x;
    }

    public SSEAwsKeyManagementParams v() {
        return this.f4434y;
    }

    public SSECustomerKey w() {
        return null;
    }

    public StorageClass x() {
        return this.f4432w;
    }

    public ObjectTagging y() {
        return this.A;
    }

    public boolean z() {
        return this.f4435z;
    }
}
