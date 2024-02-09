package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.util.json.JsonUtils;
import com.google.gson.e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Future;

class TransferRecord {
    /* access modifiers changed from: private */
    public static final Log M = LogFactory.b(TransferRecord.class);
    public String A;
    public String B;
    public Map<String, String> C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public TransferUtilityOptions J;
    private Future<?> K;
    private e L = new e();

    /* renamed from: a  reason: collision with root package name */
    public int f4139a;

    /* renamed from: b  reason: collision with root package name */
    public int f4140b;

    /* renamed from: c  reason: collision with root package name */
    public int f4141c;

    /* renamed from: d  reason: collision with root package name */
    public int f4142d;

    /* renamed from: e  reason: collision with root package name */
    public int f4143e;

    /* renamed from: f  reason: collision with root package name */
    public int f4144f;

    /* renamed from: g  reason: collision with root package name */
    public int f4145g;

    /* renamed from: h  reason: collision with root package name */
    public long f4146h;

    /* renamed from: i  reason: collision with root package name */
    public long f4147i;

    /* renamed from: j  reason: collision with root package name */
    public long f4148j;

    /* renamed from: k  reason: collision with root package name */
    public long f4149k;

    /* renamed from: l  reason: collision with root package name */
    public long f4150l;

    /* renamed from: m  reason: collision with root package name */
    public long f4151m;

    /* renamed from: n  reason: collision with root package name */
    public TransferType f4152n;

    /* renamed from: o  reason: collision with root package name */
    public TransferState f4153o;

    /* renamed from: p  reason: collision with root package name */
    public String f4154p;

    /* renamed from: q  reason: collision with root package name */
    public String f4155q;

    /* renamed from: r  reason: collision with root package name */
    public String f4156r;

    /* renamed from: s  reason: collision with root package name */
    public String f4157s;

    /* renamed from: t  reason: collision with root package name */
    public String f4158t;

    /* renamed from: u  reason: collision with root package name */
    public String f4159u;

    /* renamed from: v  reason: collision with root package name */
    public String f4160v;

    /* renamed from: w  reason: collision with root package name */
    public String f4161w;

    /* renamed from: x  reason: collision with root package name */
    public String f4162x;

    /* renamed from: y  reason: collision with root package name */
    public String f4163y;

    /* renamed from: z  reason: collision with root package name */
    public String f4164z;

    public TransferRecord(int i10) {
        this.f4139a = i10;
    }

    private boolean c() {
        return this.f4145g == 0 && !TransferState.COMPLETED.equals(this.f4153o);
    }

    private boolean d(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        if (connectivityManager == null || (transferUtilityOptions = this.J) == null || transferUtilityOptions.d().isConnected(connectivityManager)) {
            return true;
        }
        Log log = M;
        log.h("Network Connection " + this.J.d() + " is not available.");
        transferStatusUpdater.l(this.f4139a, TransferState.WAITING_FOR_NETWORK);
        return false;
    }

    private boolean e(TransferState transferState) {
        return TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState);
    }

    public boolean b(final AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        if (e(this.f4153o)) {
            return false;
        }
        transferStatusUpdater.l(this.f4139a, TransferState.PENDING_CANCEL);
        if (f()) {
            this.K.cancel(true);
        }
        if (TransferType.UPLOAD.equals(this.f4152n) && this.f4142d == 1) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        AmazonS3 amazonS3 = amazonS3;
                        TransferRecord transferRecord = TransferRecord.this;
                        amazonS3.a(new AbortMultipartUploadRequest(transferRecord.f4154p, transferRecord.f4155q, transferRecord.f4158t));
                        Log a10 = TransferRecord.M;
                        a10.a("Successfully clean up multipart upload: " + TransferRecord.this.f4139a);
                    } catch (AmazonClientException e10) {
                        Log a11 = TransferRecord.M;
                        a11.b("Failed to abort multiplart upload: " + TransferRecord.this.f4139a, e10);
                    }
                }
            }).start();
        } else if (TransferType.DOWNLOAD.equals(this.f4152n)) {
            new File(this.f4157s).delete();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        Future<?> future = this.K;
        return future != null && !future.isDone();
    }

    public boolean g(AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        if (e(this.f4153o) || TransferState.PAUSED.equals(this.f4153o)) {
            return false;
        }
        TransferState transferState = TransferState.PENDING_PAUSE;
        if (transferState.equals(this.f4153o)) {
            return false;
        }
        transferStatusUpdater.l(this.f4139a, transferState);
        if (f()) {
            this.K.cancel(true);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean h(AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        boolean d10 = d(transferStatusUpdater, connectivityManager);
        boolean z9 = false;
        if (!d10 && !e(this.f4153o)) {
            z9 = true;
            if (f()) {
                this.K.cancel(true);
            }
        }
        return z9;
    }

    public boolean i(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (f() || !c() || !d(transferStatusUpdater, connectivityManager)) {
            return false;
        }
        this.K = this.f4152n.equals(TransferType.DOWNLOAD) ? TransferThreadPool.c(new DownloadTask(this, amazonS3, transferStatusUpdater)) : TransferThreadPool.c(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
        return true;
    }

    public void j(Cursor cursor) {
        this.f4139a = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        this.f4140b = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        this.f4152n = TransferType.getType(cursor.getString(cursor.getColumnIndexOrThrow("type")));
        this.f4153o = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f4154p = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f4155q = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        this.f4156r = cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f4146h = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f4147i = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        this.f4148j = cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        this.f4141c = cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f4142d = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f4143e = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        this.f4144f = cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f4145g = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f4159u = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f4157s = cursor.getString(cursor.getColumnIndexOrThrow("file"));
        this.f4158t = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        this.f4149k = cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        this.f4150l = cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f4151m = cursor.getLong(cursor.getColumnIndexOrThrow("file_offset"));
        this.f4160v = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        this.f4161w = cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f4162x = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f4163y = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f4164z = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        this.A = cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.C = JsonUtils.d(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        this.D = cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.E = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.F = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.G = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.H = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.I = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.B = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        this.J = (TransferUtilityOptions) this.L.h(cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options")), TransferUtilityOptions.class);
    }

    public String toString() {
        return "[" + "id:" + this.f4139a + "," + "bucketName:" + this.f4154p + "," + "key:" + this.f4155q + "," + "file:" + this.f4157s + "," + "type:" + this.f4152n + "," + "bytesTotal:" + this.f4146h + "," + "bytesCurrent:" + this.f4147i + "," + "fileOffset:" + this.f4151m + "," + "state:" + this.f4153o + "," + "cannedAcl:" + this.I + "," + "mainUploadId:" + this.f4140b + "," + "isMultipart:" + this.f4142d + "," + "isLastPart:" + this.f4143e + "," + "partNumber:" + this.f4145g + "," + "multipartId:" + this.f4158t + "," + "eTag:" + this.f4159u + "," + "storageClass:" + this.B + "," + "userMetadata:" + this.C.toString() + "," + "transferUtilityOptions:" + this.L.r(this.J) + "]";
    }
}
