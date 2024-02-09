package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

class UploadTask implements Callable<Boolean> {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Log f4223g = LogFactory.b(UploadTask.class);

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, CannedAccessControlList> f4224h = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final AmazonS3 f4225a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final TransferRecord f4226b;

    /* renamed from: c  reason: collision with root package name */
    private final TransferDBUtil f4227c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TransferStatusUpdater f4228d;

    /* renamed from: e  reason: collision with root package name */
    Map<Integer, UploadPartTaskMetadata> f4229e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private List<UploadPartRequest> f4230f;

    class UploadPartTaskMetadata {

        /* renamed from: a  reason: collision with root package name */
        UploadPartRequest f4231a;

        /* renamed from: b  reason: collision with root package name */
        Future<Boolean> f4232b;

        /* renamed from: c  reason: collision with root package name */
        long f4233c;

        /* renamed from: d  reason: collision with root package name */
        TransferState f4234d;

        UploadPartTaskMetadata() {
        }
    }

    class UploadTaskProgressListener implements ProgressListener {

        /* renamed from: a  reason: collision with root package name */
        private long f4236a;

        UploadTaskProgressListener(TransferRecord transferRecord) {
            this.f4236a = transferRecord.f4147i;
        }

        public void a(ProgressEvent progressEvent) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void b(int r8, long r9) {
            /*
                r7 = this;
                monitor-enter(r7)
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask r0 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.this     // Catch:{ all -> 0x0067 }
                java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata> r0 = r0.f4229e     // Catch:{ all -> 0x0067 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0067 }
                java.lang.Object r8 = r0.get(r8)     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata r8 = (com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.UploadPartTaskMetadata) r8     // Catch:{ all -> 0x0067 }
                if (r8 != 0) goto L_0x001c
                com.amazonaws.logging.Log r8 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.f4223g     // Catch:{ all -> 0x0067 }
                java.lang.String r9 = "Update received for unknown part. Ignoring."
                r8.h(r9)     // Catch:{ all -> 0x0067 }
                monitor-exit(r7)
                return
            L_0x001c:
                r8.f4233c = r9     // Catch:{ all -> 0x0067 }
                r8 = 0
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask r10 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.this     // Catch:{ all -> 0x0067 }
                java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata> r10 = r10.f4229e     // Catch:{ all -> 0x0067 }
                java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x0067 }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0067 }
            L_0x002c:
                boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0067 }
                if (r0 == 0) goto L_0x0042
                java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0067 }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0067 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata r0 = (com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.UploadPartTaskMetadata) r0     // Catch:{ all -> 0x0067 }
                long r0 = r0.f4233c     // Catch:{ all -> 0x0067 }
                long r8 = r8 + r0
                goto L_0x002c
            L_0x0042:
                long r0 = r7.f4236a     // Catch:{ all -> 0x0067 }
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 <= 0) goto L_0x0065
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask r10 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.this     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r0 = r10.f4228d     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask r10 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.this     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r10 = r10.f4226b     // Catch:{ all -> 0x0067 }
                int r1 = r10.f4139a     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.UploadTask r10 = com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.this     // Catch:{ all -> 0x0067 }
                com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r10 = r10.f4226b     // Catch:{ all -> 0x0067 }
                long r4 = r10.f4146h     // Catch:{ all -> 0x0067 }
                r6 = 1
                r2 = r8
                r0.k(r1, r2, r4, r6)     // Catch:{ all -> 0x0067 }
                r7.f4236a = r8     // Catch:{ all -> 0x0067 }
            L_0x0065:
                monitor-exit(r7)
                return
            L_0x0067:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.UploadTaskProgressListener.b(int, long):void");
        }
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f4224h.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f4226b = transferRecord;
        this.f4225a = amazonS3;
        this.f4227c = transferDBUtil;
        this.f4228d = transferStatusUpdater;
    }

    private void a(int i10, String str, String str2, String str3) {
        Log log = f4223g;
        log.h("Aborting the multipart since complete multipart failed.");
        try {
            this.f4225a.a(new AbortMultipartUploadRequest(str, str2, str3));
            log.a("Successfully aborted multipart upload: " + i10);
        } catch (AmazonClientException e10) {
            Log log2 = f4223g;
            log2.b("Failed to abort the multipart upload: " + i10, e10);
        }
    }

    private void f(int i10, String str, String str2, String str3) {
        CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(str, str2, str3, this.f4227c.m(i10));
        TransferUtility.a(completeMultipartUploadRequest);
        this.f4225a.c(completeMultipartUploadRequest);
    }

    private PutObjectRequest g(TransferRecord transferRecord) {
        File file = new File(transferRecord.f4157s);
        PutObjectRequest putObjectRequest = new PutObjectRequest(transferRecord.f4154p, transferRecord.f4155q, file);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.P(file.length());
        String str = transferRecord.f4164z;
        if (str != null) {
            objectMetadata.M(str);
        }
        String str2 = transferRecord.f4162x;
        if (str2 != null) {
            objectMetadata.N(str2);
        }
        String str3 = transferRecord.f4163y;
        if (str3 != null) {
            objectMetadata.O(str3);
        }
        String str4 = transferRecord.f4160v;
        if (str4 != null) {
            objectMetadata.R(str4);
        } else {
            objectMetadata.R(Mimetypes.a().b(file));
        }
        String str5 = transferRecord.B;
        if (str5 != null) {
            putObjectRequest.L(str5);
        }
        String str6 = transferRecord.D;
        if (str6 != null) {
            objectMetadata.k(str6);
        }
        if (transferRecord.E != null) {
            objectMetadata.T(new Date(Long.valueOf(transferRecord.E).longValue()));
        }
        String str7 = transferRecord.F;
        if (str7 != null) {
            objectMetadata.f(str7);
        }
        Map<String, String> map = transferRecord.C;
        if (map != null) {
            objectMetadata.U(map);
            String str8 = transferRecord.C.get("x-amz-tagging");
            if (str8 != null) {
                try {
                    String[] split = str8.split("&");
                    ArrayList arrayList = new ArrayList();
                    for (String split2 : split) {
                        String[] split3 = split2.split("=");
                        arrayList.add(new Tag(split3[0], split3[1]));
                    }
                    putObjectRequest.M(new ObjectTagging(arrayList));
                } catch (Exception e10) {
                    f4223g.k("Error in passing the object tags as request headers.", e10);
                }
            }
            String str9 = transferRecord.C.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.I(str9);
            }
            String str10 = transferRecord.C.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.X("requester".equals(str10));
            }
        }
        String str11 = transferRecord.H;
        if (str11 != null) {
            objectMetadata.Q(str11);
        }
        String str12 = transferRecord.G;
        if (str12 != null) {
            putObjectRequest.J(new SSEAwsKeyManagementParams(str12));
        }
        putObjectRequest.H(objectMetadata);
        putObjectRequest.F(h(transferRecord.I));
        return putObjectRequest;
    }

    private static CannedAccessControlList h(String str) {
        if (str == null) {
            return null;
        }
        return f4224h.get(str);
    }

    private String i(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest G = new InitiateMultipartUploadRequest(putObjectRequest.t(), putObjectRequest.x()).D(putObjectRequest.u()).E(putObjectRequest.y()).F(putObjectRequest.A()).G(putObjectRequest.D());
        TransferUtility.a(G);
        return this.f4225a.f(G).c();
    }

    private Boolean j() {
        long j10;
        TransferState transferState;
        Log log;
        StringBuilder sb;
        String str = this.f4226b.f4158t;
        if (str == null || str.isEmpty()) {
            PutObjectRequest g10 = g(this.f4226b);
            TransferUtility.a(g10);
            try {
                this.f4226b.f4158t = i(g10);
                TransferDBUtil transferDBUtil = this.f4227c;
                TransferRecord transferRecord = this.f4226b;
                transferDBUtil.r(transferRecord.f4139a, transferRecord.f4158t);
                j10 = 0;
            } catch (AmazonClientException e10) {
                e = e10;
                f4223g.k("Error initiating multipart upload: " + this.f4226b.f4139a + " due to " + e.getMessage(), e);
                this.f4228d.i(this.f4226b.f4139a, e);
                this.f4228d.l(this.f4226b.f4139a, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            long l10 = this.f4227c.l(this.f4226b.f4139a);
            if (l10 > 0) {
                f4223g.h(String.format("Resume transfer %d from %d bytes", new Object[]{Integer.valueOf(this.f4226b.f4139a), Long.valueOf(l10)}));
            }
            j10 = l10;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(this.f4226b);
        TransferStatusUpdater transferStatusUpdater = this.f4228d;
        TransferRecord transferRecord2 = this.f4226b;
        transferStatusUpdater.k(transferRecord2.f4139a, j10, transferRecord2.f4146h, false);
        TransferDBUtil transferDBUtil2 = this.f4227c;
        TransferRecord transferRecord3 = this.f4226b;
        this.f4230f = transferDBUtil2.g(transferRecord3.f4139a, transferRecord3.f4158t);
        f4223g.h("Multipart upload " + this.f4226b.f4139a + " in " + this.f4230f.size() + " parts.");
        for (UploadPartRequest next : this.f4230f) {
            TransferUtility.a(next);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.f4231a = next;
            uploadPartTaskMetadata.f4233c = 0;
            uploadPartTaskMetadata.f4234d = TransferState.WAITING;
            this.f4229e.put(Integer.valueOf(next.y()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.f4232b = TransferThreadPool.c(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, next, this.f4225a, this.f4227c));
        }
        try {
            boolean z9 = true;
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : this.f4229e.values()) {
                z9 &= uploadPartTaskMetadata2.f4232b.get().booleanValue();
            }
            if (!z9) {
                try {
                    if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                        f4223g.h("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        this.f4228d.l(this.f4226b.f4139a, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e11) {
                    f4223g.g("TransferUtilityException: [" + e11 + "]");
                }
            }
            f4223g.h("Completing the multi-part upload transfer for " + this.f4226b.f4139a);
            try {
                TransferRecord transferRecord4 = this.f4226b;
                f(transferRecord4.f4139a, transferRecord4.f4154p, transferRecord4.f4155q, transferRecord4.f4158t);
                TransferStatusUpdater transferStatusUpdater2 = this.f4228d;
                TransferRecord transferRecord5 = this.f4226b;
                int i10 = transferRecord5.f4139a;
                long j11 = transferRecord5.f4146h;
                transferStatusUpdater2.k(i10, j11, j11, true);
                this.f4228d.l(this.f4226b.f4139a, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (AmazonClientException e12) {
                e = e12;
                f4223g.k("Failed to complete multipart: " + this.f4226b.f4139a + " due to " + e.getMessage(), e);
                TransferRecord transferRecord6 = this.f4226b;
                a(transferRecord6.f4139a, transferRecord6.f4154p, transferRecord6.f4155q, transferRecord6.f4158t);
                this.f4228d.i(this.f4226b.f4139a, e);
                this.f4228d.l(this.f4226b.f4139a, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } catch (Exception e13) {
            Exception exc = e13;
            f4223g.g("Upload resulted in an exception. " + exc);
            for (UploadPartTaskMetadata uploadPartTaskMetadata3 : this.f4229e.values()) {
                uploadPartTaskMetadata3.f4232b.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(this.f4226b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater3 = this.f4228d;
                int i11 = this.f4226b.f4139a;
                transferState = TransferState.CANCELED;
                transferStatusUpdater3.l(i11, transferState);
                log = f4223g;
                sb = new StringBuilder();
            } else if (TransferState.PENDING_PAUSE.equals(this.f4226b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater4 = this.f4228d;
                int i12 = this.f4226b.f4139a;
                transferState = TransferState.PAUSED;
                transferStatusUpdater4.l(i12, transferState);
                log = f4223g;
                sb = new StringBuilder();
            } else {
                for (UploadPartTaskMetadata uploadPartTaskMetadata4 : this.f4229e.values()) {
                    TransferState transferState2 = TransferState.WAITING_FOR_NETWORK;
                    if (transferState2.equals(uploadPartTaskMetadata4.f4234d)) {
                        f4223g.h("Individual part is WAITING_FOR_NETWORK.");
                        this.f4228d.l(this.f4226b.f4139a, transferState2);
                        break;
                    }
                }
                try {
                    if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                        f4223g.h("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        this.f4228d.l(this.f4226b.f4139a, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e14) {
                    f4223g.g("TransferUtilityException: [" + e14 + "]");
                }
                if (RetryUtils.b(exc)) {
                    f4223g.h("Transfer is interrupted. " + exc);
                } else {
                    f4223g.k("Error encountered during multi-part upload: " + this.f4226b.f4139a + " due to " + exc.getMessage(), exc);
                    this.f4228d.i(this.f4226b.f4139a, exc);
                }
                this.f4228d.l(this.f4226b.f4139a, TransferState.FAILED);
                return Boolean.FALSE;
            }
            sb.append("Transfer is ");
            sb.append(transferState);
            log.h(sb.toString());
            return Boolean.FALSE;
        }
    }

    private Boolean k() {
        PutObjectRequest g10 = g(this.f4226b);
        ProgressListener f10 = this.f4228d.f(this.f4226b.f4139a);
        long length = g10.v().length();
        TransferUtility.b(g10);
        g10.n(f10);
        try {
            this.f4225a.b(g10);
            this.f4228d.k(this.f4226b.f4139a, length, length, true);
            this.f4228d.l(this.f4226b.f4139a, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e10) {
            if (TransferState.PENDING_CANCEL.equals(this.f4226b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater = this.f4228d;
                int i10 = this.f4226b.f4139a;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.l(i10, transferState);
                Log log = f4223g;
                log.h("Transfer is " + transferState);
            } else if (TransferState.PENDING_PAUSE.equals(this.f4226b.f4153o)) {
                TransferStatusUpdater transferStatusUpdater2 = this.f4228d;
                int i11 = this.f4226b.f4139a;
                TransferState transferState2 = TransferState.PAUSED;
                transferStatusUpdater2.l(i11, transferState2);
                Log log2 = f4223g;
                log2.h("Transfer is " + transferState2);
                new ProgressEvent(0).c(32);
                f10.a(new ProgressEvent(0));
            } else {
                try {
                    if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                        Log log3 = f4223g;
                        log3.h("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.f4228d.l(this.f4226b.f4139a, TransferState.WAITING_FOR_NETWORK);
                        log3.a("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0).c(32);
                        f10.a(new ProgressEvent(0));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e11) {
                    Log log4 = f4223g;
                    log4.g("TransferUtilityException: [" + e11 + "]");
                }
                if (RetryUtils.b(e10)) {
                    Log log5 = f4223g;
                    log5.h("Transfer is interrupted. " + e10);
                } else {
                    Log log6 = f4223g;
                    log6.a("Failed to upload: " + this.f4226b.f4139a + " due to " + e10.getMessage());
                    this.f4228d.i(this.f4226b.f4139a, e10);
                }
                this.f4228d.l(this.f4226b.f4139a, TransferState.FAILED);
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: e */
    public Boolean call() {
        try {
            if (TransferNetworkLossHandler.c() != null && !TransferNetworkLossHandler.c().e()) {
                f4223g.h("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                this.f4228d.l(this.f4226b.f4139a, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e10) {
            Log log = f4223g;
            log.g("TransferUtilityException: [" + e10 + "]");
        }
        this.f4228d.l(this.f4226b.f4139a, TransferState.IN_PROGRESS);
        TransferRecord transferRecord = this.f4226b;
        int i10 = transferRecord.f4142d;
        return (i10 == 1 && transferRecord.f4145g == 0) ? j() : i10 == 0 ? k() : Boolean.FALSE;
    }
}
