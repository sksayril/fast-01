package com.amazonaws.services.s3.model;

import java.io.File;
import java.io.InputStream;

public class PutObjectRequest extends AbstractPutObjectRequest {
    private boolean C;

    public PutObjectRequest(String str, String str2, File file) {
        super(str, str2, file);
    }

    /* renamed from: V */
    public PutObjectRequest q() {
        return (PutObjectRequest) r((PutObjectRequest) super.clone());
    }

    public boolean W() {
        return this.C;
    }

    public void X(boolean z9) {
        this.C = z9;
    }

    /* renamed from: Y */
    public PutObjectRequest N(AccessControlList accessControlList) {
        return (PutObjectRequest) super.N(accessControlList);
    }

    /* renamed from: Z */
    public PutObjectRequest O(CannedAccessControlList cannedAccessControlList) {
        return (PutObjectRequest) super.O(cannedAccessControlList);
    }

    /* renamed from: a0 */
    public PutObjectRequest P(InputStream inputStream) {
        return (PutObjectRequest) super.P(inputStream);
    }

    /* renamed from: b0 */
    public PutObjectRequest Q(ObjectMetadata objectMetadata) {
        return (PutObjectRequest) super.Q(objectMetadata);
    }

    /* renamed from: c0 */
    public PutObjectRequest R(String str) {
        return (PutObjectRequest) super.R(str);
    }

    /* renamed from: d0 */
    public PutObjectRequest S(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        return (PutObjectRequest) super.S(sSEAwsKeyManagementParams);
    }

    /* renamed from: e0 */
    public PutObjectRequest T(SSECustomerKey sSECustomerKey) {
        return (PutObjectRequest) super.T(sSECustomerKey);
    }

    /* renamed from: f0 */
    public PutObjectRequest U(String str) {
        return (PutObjectRequest) super.U(str);
    }
}
