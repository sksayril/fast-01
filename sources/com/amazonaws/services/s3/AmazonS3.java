package com.amazonaws.services.s3;

import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

public interface AmazonS3 {
    void a(AbortMultipartUploadRequest abortMultipartUploadRequest);

    PutObjectResult b(PutObjectRequest putObjectRequest);

    CompleteMultipartUploadResult c(CompleteMultipartUploadRequest completeMultipartUploadRequest);

    S3Object d(GetObjectRequest getObjectRequest);

    UploadPartResult e(UploadPartRequest uploadPartRequest);

    InitiateMultipartUploadResult f(InitiateMultipartUploadRequest initiateMultipartUploadRequest);
}
