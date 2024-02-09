package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.UploadTask;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

class UploadPartTask implements Callable<Boolean> {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Log f4214f = LogFactory.b(UploadPartTask.class);

    /* renamed from: a  reason: collision with root package name */
    private final UploadTask.UploadPartTaskMetadata f4215a;

    /* renamed from: b  reason: collision with root package name */
    private final UploadPartTaskProgressListener f4216b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final UploadPartRequest f4217c;

    /* renamed from: d  reason: collision with root package name */
    private final AmazonS3 f4218d;

    /* renamed from: e  reason: collision with root package name */
    private final TransferDBUtil f4219e;

    private class UploadPartTaskProgressListener implements ProgressListener {

        /* renamed from: a  reason: collision with root package name */
        private final UploadTask.UploadTaskProgressListener f4220a;

        /* renamed from: b  reason: collision with root package name */
        private long f4221b;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f4220a = uploadTaskProgressListener;
        }

        public void a(ProgressEvent progressEvent) {
            long j10;
            if (32 == progressEvent.b()) {
                UploadPartTask.f4214f.a("Reset Event triggered. Resetting the bytesCurrent to 0.");
                j10 = 0;
            } else {
                j10 = this.f4221b + progressEvent.a();
            }
            this.f4221b = j10;
            this.f4220a.b(UploadPartTask.this.f4217c.y(), this.f4221b);
        }
    }

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f4215a = uploadPartTaskMetadata;
        this.f4216b = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f4217c = uploadPartRequest;
        this.f4218d = amazonS3;
        this.f4219e = transferDBUtil;
    }

    private long d(int i10) {
        return (((long) (1 << i10)) * 1000) + ((long) (Math.random() * 1000.0d));
    }

    private void e() {
        ProgressEvent progressEvent = new ProgressEvent(0);
        progressEvent.c(32);
        this.f4216b.a(progressEvent);
    }

    private void f(TransferState transferState) {
        this.f4215a.f4234d = transferState;
        this.f4219e.s(this.f4217c.t(), transferState);
    }

    /* renamed from: c */
    public Boolean call() {
        this.f4215a.f4234d = TransferState.IN_PROGRESS;
        this.f4217c.n(this.f4216b);
        int i10 = 1;
        while (true) {
            try {
                UploadPartResult e10 = this.f4218d.e(this.f4217c);
                f(TransferState.PART_COMPLETED);
                this.f4219e.q(this.f4217c.t(), e10.c());
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                f4214f.a("Upload part aborted.");
                e();
                return Boolean.FALSE;
            } catch (Exception e11) {
                Log log = f4214f;
                log.g("Unexpected error occurred: " + e11);
                e();
                try {
                    if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                        log.h("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f4215a;
                        TransferState transferState = TransferState.WAITING_FOR_NETWORK;
                        uploadPartTaskMetadata.f4234d = transferState;
                        this.f4219e.s(this.f4217c.t(), transferState);
                        log.h("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e12) {
                    Log log2 = f4214f;
                    log2.g("TransferUtilityException: [" + e12 + "]");
                }
                if (i10 < 3) {
                    long d10 = d(i10);
                    Log log3 = f4214f;
                    log3.h("Retrying in " + d10 + " ms.");
                    TimeUnit.MILLISECONDS.sleep(d10);
                    log3.b("Retry attempt: " + i10, e11);
                    i10++;
                } else {
                    f(TransferState.FAILED);
                    f4214f.k("Encountered error uploading part ", e11);
                    throw e11;
                }
            }
        }
    }
}
