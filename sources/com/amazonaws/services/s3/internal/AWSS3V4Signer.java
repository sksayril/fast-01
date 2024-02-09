package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AwsChunkedEncodingInputStream;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.BinaryUtils;
import java.io.IOException;
import java.io.InputStream;

public class AWSS3V4Signer extends AWS4Signer {
    public AWSS3V4Signer() {
        super(false);
    }

    static long L(Request<?> request) {
        InputStream w9 = request.w();
        if (w9.markSupported()) {
            long j10 = 0;
            byte[] bArr = new byte[4096];
            w9.mark(-1);
            while (true) {
                int read = w9.read(bArr);
                if (read != -1) {
                    j10 += (long) read;
                } else {
                    w9.reset();
                    return j10;
                }
            }
        } else {
            throw new AmazonClientException("Failed to get content length");
        }
    }

    private static boolean M(Request<?> request) {
        return (request.r() instanceof PutObjectRequest) || (request.r() instanceof UploadPartRequest);
    }

    /* access modifiers changed from: protected */
    public void K(Request<?> request, AWS4Signer.HeaderSigningResult headerSigningResult) {
        if (M(request)) {
            request.a(new AwsChunkedEncodingInputStream(request.w(), headerSigningResult.b(), headerSigningResult.a(), headerSigningResult.c(), BinaryUtils.a(headerSigningResult.d()), this));
        }
    }

    /* access modifiers changed from: protected */
    public String x(Request<?> request) {
        long j10;
        request.i("x-amz-content-sha256", "required");
        if (!M(request)) {
            return super.x(request);
        }
        String str = request.l().get("Content-Length");
        if (str != null) {
            j10 = Long.parseLong(str);
        } else {
            try {
                j10 = L(request);
            } catch (IOException e10) {
                throw new AmazonClientException("Cannot get the content-lenght of the request content.", e10);
            }
        }
        request.i("x-amz-decoded-content-length", Long.toString(j10));
        request.i("Content-Length", Long.toString(AwsChunkedEncodingInputStream.k(j10)));
        return "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";
    }
}
