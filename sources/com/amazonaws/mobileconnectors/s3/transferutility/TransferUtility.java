package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.VersionInfoUtils;
import java.io.File;

public class TransferUtility {

    /* renamed from: g  reason: collision with root package name */
    private static final Log f4198g = LogFactory.b(TransferUtility.class);

    /* renamed from: h  reason: collision with root package name */
    private static final Object f4199h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static String f4200i = "";

    /* renamed from: a  reason: collision with root package name */
    private TransferStatusUpdater f4201a;

    /* renamed from: b  reason: collision with root package name */
    private TransferDBUtil f4202b;

    /* renamed from: c  reason: collision with root package name */
    final ConnectivityManager f4203c;

    /* renamed from: d  reason: collision with root package name */
    private final AmazonS3 f4204d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4205e;

    /* renamed from: f  reason: collision with root package name */
    private final TransferUtilityOptions f4206f;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private AmazonS3 f4207a;

        /* renamed from: b  reason: collision with root package name */
        private Context f4208b;

        /* renamed from: c  reason: collision with root package name */
        private String f4209c;

        /* renamed from: d  reason: collision with root package name */
        private TransferUtilityOptions f4210d;

        protected Builder() {
        }

        public TransferUtility a() {
            if (this.f4207a == null) {
                throw new IllegalArgumentException("AmazonS3 client is required please set using .s3Client(yourClient)");
            } else if (this.f4208b != null) {
                if (this.f4210d == null) {
                    this.f4210d = new TransferUtilityOptions();
                }
                return new TransferUtility(this.f4207a, this.f4208b, this.f4209c, this.f4210d);
            } else {
                throw new IllegalArgumentException("Context is required please set using .context(applicationContext)");
            }
        }

        public Builder b(Context context) {
            this.f4208b = context.getApplicationContext();
            return this;
        }

        public Builder c(String str) {
            this.f4209c = str;
            return this;
        }

        public Builder d(AmazonS3 amazonS3) {
            this.f4207a = amazonS3;
            return this;
        }

        public Builder e(TransferUtilityOptions transferUtilityOptions) {
            this.f4210d = transferUtilityOptions;
            return this;
        }
    }

    private TransferUtility(AmazonS3 amazonS3, Context context, String str, TransferUtilityOptions transferUtilityOptions) {
        this.f4204d = amazonS3;
        this.f4205e = str;
        this.f4206f = transferUtilityOptions;
        this.f4202b = new TransferDBUtil(context.getApplicationContext());
        this.f4201a = TransferStatusUpdater.c(context.getApplicationContext());
        TransferThreadPool.b(transferUtilityOptions.e());
        this.f4203c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    static <X extends AmazonWebServiceRequest> X a(X x9) {
        RequestClientOptions f10 = x9.f();
        f10.a("TransferService_multipart/" + e() + VersionInfoUtils.c());
        return x9;
    }

    static <X extends AmazonWebServiceRequest> X b(X x9) {
        RequestClientOptions f10 = x9.f();
        f10.a("TransferService/" + e() + VersionInfoUtils.c());
        return x9;
    }

    public static Builder c() {
        return new Builder();
    }

    private int d(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        long length = file.length();
        double d10 = (double) length;
        long max = (long) Math.max(Math.ceil(d10 / 10000.0d), 5242880.0d);
        int ceil = ((int) Math.ceil(d10 / ((double) max))) + 1;
        ContentValues[] contentValuesArr = new ContentValues[ceil];
        contentValuesArr[0] = this.f4202b.d(str, str2, file, 0, 0, "", file.length(), 0, objectMetadata, cannedAccessControlList, this.f4206f);
        long j10 = 0;
        int i10 = 1;
        for (int i11 = 1; i11 < ceil; i11++) {
            long min = Math.min(max, length);
            length -= max;
            contentValuesArr[i11] = this.f4202b.d(str, str2, file, j10, i10, "", min, length <= 0 ? 1 : 0, objectMetadata, cannedAccessControlList, this.f4206f);
            j10 += max;
            i10++;
        }
        return this.f4202b.a(contentValuesArr);
    }

    private static String e() {
        synchronized (f4199h) {
            String str = f4200i;
            if (str != null) {
                if (!str.trim().isEmpty()) {
                    String str2 = f4200i.trim() + "/";
                    return str2;
                }
            }
            return "";
        }
    }

    private boolean f(File file) {
        return file != null && file.length() > 5242880;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void g(java.lang.String r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ad }
            com.amazonaws.services.s3.AmazonS3 r1 = r3.f4204d     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.S3ClientReference.b(r0, r1)     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r0 = r3.f4201a     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r0 = r0.d(r5)     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0038
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r0 = r3.f4202b     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r0 = r0.j(r5)     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x0032
            com.amazonaws.logging.Log r4 = f4198g     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Cannot find transfer with id: "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00ad }
            r4.g(r5)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x0032:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r5 = r3.f4201a     // Catch:{ all -> 0x00ad }
            r5.b(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x0058
        L_0x0038:
            java.lang.String r1 = "add_transfer"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x0058
            com.amazonaws.logging.Log r4 = f4198g     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Transfer has already been added: "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x00ad }
            r4.e(r5)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x0058:
            java.lang.String r5 = "add_transfer"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x00a0
            java.lang.String r5 = "resume_transfer"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0069
            goto L_0x00a0
        L_0x0069:
            java.lang.String r5 = "pause_transfer"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0079
            com.amazonaws.services.s3.AmazonS3 r4 = r3.f4204d     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r5 = r3.f4201a     // Catch:{ all -> 0x00ad }
            r0.g(r4, r5)     // Catch:{ all -> 0x00ad }
            goto L_0x00ab
        L_0x0079:
            java.lang.String r5 = "cancel_transfer"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0089
            com.amazonaws.services.s3.AmazonS3 r4 = r3.f4204d     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r5 = r3.f4201a     // Catch:{ all -> 0x00ad }
            r0.b(r4, r5)     // Catch:{ all -> 0x00ad }
            goto L_0x00ab
        L_0x0089:
            com.amazonaws.logging.Log r5 = f4198g     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Unknown action: "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x00ad }
            r5.g(r4)     // Catch:{ all -> 0x00ad }
            goto L_0x00ab
        L_0x00a0:
            com.amazonaws.services.s3.AmazonS3 r4 = r3.f4204d     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r5 = r3.f4202b     // Catch:{ all -> 0x00ad }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater r1 = r3.f4201a     // Catch:{ all -> 0x00ad }
            android.net.ConnectivityManager r2 = r3.f4203c     // Catch:{ all -> 0x00ad }
            r0.i(r4, r5, r1, r2)     // Catch:{ all -> 0x00ad }
        L_0x00ab:
            monitor-exit(r3)
            return
        L_0x00ad:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility.g(java.lang.String, int):void");
    }

    public TransferObserver h(String str, String str2, File file) {
        return i(str, str2, file, new ObjectMetadata());
    }

    public TransferObserver i(String str, String str2, File file, ObjectMetadata objectMetadata) {
        return j(str, str2, file, objectMetadata, (CannedAccessControlList) null);
    }

    public TransferObserver j(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        return k(str, str2, file, objectMetadata, cannedAccessControlList, (TransferListener) null);
    }

    public TransferObserver k(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferListener transferListener) {
        int i10;
        if (file == null || file.isDirectory() || !file.exists()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        if (f(file)) {
            i10 = d(str, str2, file, objectMetadata, cannedAccessControlList);
        } else {
            i10 = Integer.parseInt(this.f4202b.k(TransferType.UPLOAD, str, str2, file, objectMetadata, cannedAccessControlList, this.f4206f).getLastPathSegment());
        }
        TransferObserver transferObserver = new TransferObserver(i10, this.f4202b, str, str2, file, transferListener);
        g("add_transfer", i10);
        return transferObserver;
    }
}
