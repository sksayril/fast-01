package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import java.io.File;
import java.util.concurrent.Callable;

class DownloadTask implements Callable<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    private static final Log f4104d = LogFactory.b(DownloadTask.class);

    /* renamed from: a  reason: collision with root package name */
    private final AmazonS3 f4105a;

    /* renamed from: b  reason: collision with root package name */
    private final TransferRecord f4106b;

    /* renamed from: c  reason: collision with root package name */
    private final TransferStatusUpdater f4107c;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f4106b = transferRecord;
        this.f4105a = amazonS3;
        this.f4107c = transferStatusUpdater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC, Splitter:B:41:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4 A[SYNTHETIC, Splitter:B:46:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.io.InputStream r8, java.io.File r9) {
        /*
            r7 = this;
            java.lang.String r0 = "got exception"
            java.io.File r1 = r9.getParentFile()
            if (r1 == 0) goto L_0x0011
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0011
            r1.mkdirs()
        L_0x0011:
            long r1 = r9.length()
            r3 = 0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            r2 = 0
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x0075, IOException -> 0x0059 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x0075, IOException -> 0x0059 }
            r4.<init>(r9, r1)     // Catch:{ SocketTimeoutException -> 0x0075, IOException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x0075, IOException -> 0x0059 }
            r9 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
        L_0x002e:
            int r1 = r8.read(r9)     // Catch:{ SocketTimeoutException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
            r2 = -1
            if (r1 == r2) goto L_0x0039
            r3.write(r9, r5, r1)     // Catch:{ SocketTimeoutException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
            goto L_0x002e
        L_0x0039:
            r3.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0043
        L_0x003d:
            r9 = move-exception
            com.amazonaws.logging.Log r1 = f4104d
            r1.i(r0, r9)
        L_0x0043:
            r8.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r8 = move-exception
            com.amazonaws.logging.Log r9 = f4104d
            r9.i(r0, r8)
        L_0x004d:
            return
        L_0x004e:
            r9 = move-exception
            r2 = r3
            goto L_0x0096
        L_0x0051:
            r9 = move-exception
            r2 = r3
            goto L_0x005a
        L_0x0054:
            r9 = move-exception
            r2 = r3
            goto L_0x0076
        L_0x0057:
            r9 = move-exception
            goto L_0x0096
        L_0x0059:
            r9 = move-exception
        L_0x005a:
            com.amazonaws.AmazonClientException r1 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = "Unable to store object contents to disk: "
            r3.append(r4)     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = r9.getMessage()     // Catch:{ all -> 0x0057 }
            r3.append(r4)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0057 }
            r1.<init>(r3, r9)     // Catch:{ all -> 0x0057 }
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0075:
            r9 = move-exception
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r1.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "SocketTimeoutException: Unable to retrieve contents over network: "
            r1.append(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r9.getMessage()     // Catch:{ all -> 0x0057 }
            r1.append(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0057 }
            com.amazonaws.logging.Log r3 = f4104d     // Catch:{ all -> 0x0057 }
            r3.g(r1)     // Catch:{ all -> 0x0057 }
            com.amazonaws.AmazonClientException r3 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x0057 }
            r3.<init>(r1, r9)     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0096:
            if (r2 == 0) goto L_0x00a2
            r2.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00a2
        L_0x009c:
            r1 = move-exception
            com.amazonaws.logging.Log r2 = f4104d
            r2.i(r0, r1)
        L_0x00a2:
            if (r8 == 0) goto L_0x00ae
            r8.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00ae
        L_0x00a8:
            r8 = move-exception
            com.amazonaws.logging.Log r1 = f4104d
            r1.i(r0, r8)
        L_0x00ae:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.DownloadTask.b(java.io.InputStream, java.io.File):void");
    }

    /* renamed from: a */
    public Boolean call() {
        try {
            if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                Log log = f4104d;
                log.h("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                this.f4107c.l(this.f4106b.f4139a, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e10) {
            Log log2 = f4104d;
            log2.g("TransferUtilityException: [" + e10 + "]");
        }
        this.f4107c.l(this.f4106b.f4139a, TransferState.IN_PROGRESS);
        ProgressListener f10 = this.f4107c.f(this.f4106b.f4139a);
        try {
            TransferRecord transferRecord = this.f4106b;
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f4154p, transferRecord.f4155q);
            TransferUtility.b(getObjectRequest);
            File file = new File(this.f4106b.f4157s);
            long length = file.length();
            if (length > 0) {
                f4104d.a(String.format("Resume transfer %d from %d bytes", new Object[]{Integer.valueOf(this.f4106b.f4139a), Long.valueOf(length)}));
                getObjectRequest.D(length, -1);
            }
            getObjectRequest.n(f10);
            S3Object d10 = this.f4105a.d(getObjectRequest);
            if (d10 == null) {
                this.f4107c.i(this.f4106b.f4139a, new IllegalStateException("AmazonS3.getObject returns null"));
                this.f4107c.l(this.f4106b.f4139a, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long B = d10.g().B();
            this.f4107c.k(this.f4106b.f4139a, length, B, true);
            b(d10.e(), file);
            this.f4107c.k(this.f4106b.f4139a, B, B, true);
            this.f4107c.l(this.f4106b.f4139a, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e11) {
            Exception exc = e11;
            if (TransferState.PENDING_CANCEL.equals(this.f4106b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater = this.f4107c;
                int i10 = this.f4106b.f4139a;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.l(i10, transferState);
                Log log3 = f4104d;
                log3.h("Transfer is " + transferState);
            } else if (TransferState.PENDING_PAUSE.equals(this.f4106b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater2 = this.f4107c;
                int i11 = this.f4106b.f4139a;
                TransferState transferState2 = TransferState.PAUSED;
                transferStatusUpdater2.l(i11, transferState2);
                Log log4 = f4104d;
                log4.h("Transfer is " + transferState2);
                new ProgressEvent(0).c(32);
                f10.a(new ProgressEvent(0));
            } else {
                try {
                    if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                        Log log5 = f4104d;
                        log5.h("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.f4107c.l(this.f4106b.f4139a, TransferState.WAITING_FOR_NETWORK);
                        log5.a("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0).c(32);
                        f10.a(new ProgressEvent(0));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e12) {
                    Log log6 = f4104d;
                    log6.g("TransferUtilityException: [" + e12 + "]");
                }
                if (RetryUtils.b(exc)) {
                    Log log7 = f4104d;
                    log7.h("Transfer is interrupted. " + exc);
                } else {
                    Log log8 = f4104d;
                    log8.a("Failed to download: " + this.f4106b.f4139a + " due to " + exc.getMessage());
                    this.f4107c.i(this.f4106b.f4139a, exc);
                }
                this.f4107c.l(this.f4106b.f4139a, TransferState.FAILED);
            }
            return Boolean.FALSE;
        }
    }
}
