package com.amazonaws.mobileconnectors.s3.transferutility;

import java.io.File;

public class TransferObserver {

    /* renamed from: a  reason: collision with root package name */
    private final int f4128a;

    /* renamed from: b  reason: collision with root package name */
    private final TransferDBUtil f4129b;

    /* renamed from: c  reason: collision with root package name */
    private String f4130c;

    /* renamed from: d  reason: collision with root package name */
    private String f4131d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f4132e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f4133f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public TransferState f4134g;

    /* renamed from: h  reason: collision with root package name */
    private String f4135h;

    /* renamed from: i  reason: collision with root package name */
    private TransferListener f4136i;

    /* renamed from: j  reason: collision with root package name */
    private TransferStatusListener f4137j;

    private class TransferStatusListener implements TransferListener {
        private TransferStatusListener() {
        }

        public void a(int i10, TransferState transferState) {
            TransferState unused = TransferObserver.this.f4134g = transferState;
        }

        public void b(int i10, long j10, long j11) {
            long unused = TransferObserver.this.f4133f = j10;
            long unused2 = TransferObserver.this.f4132e = j11;
        }

        public void c(int i10, Exception exc) {
        }
    }

    TransferObserver(int i10, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.f4128a = i10;
        this.f4129b = transferDBUtil;
        this.f4130c = str;
        this.f4131d = str2;
        this.f4135h = file.getAbsolutePath();
        this.f4132e = file.length();
        this.f4134g = TransferState.WAITING;
    }

    TransferObserver(int i10, TransferDBUtil transferDBUtil, String str, String str2, File file, TransferListener transferListener) {
        this(i10, transferDBUtil, str, str2, file);
        e(transferListener);
    }

    public void d() {
        synchronized (this) {
            TransferListener transferListener = this.f4136i;
            if (transferListener != null) {
                TransferStatusUpdater.j(this.f4128a, transferListener);
                this.f4136i = null;
            }
            TransferStatusListener transferStatusListener = this.f4137j;
            if (transferStatusListener != null) {
                TransferStatusUpdater.j(this.f4128a, transferStatusListener);
                this.f4137j = null;
            }
        }
    }

    public void e(TransferListener transferListener) {
        if (transferListener != null) {
            synchronized (this) {
                d();
                TransferStatusListener transferStatusListener = new TransferStatusListener();
                this.f4137j = transferStatusListener;
                TransferStatusUpdater.g(this.f4128a, transferStatusListener);
                this.f4136i = transferListener;
                TransferStatusUpdater.g(this.f4128a, transferListener);
            }
        }
    }

    public String toString() {
        return "TransferObserver{id=" + this.f4128a + ", bucket='" + this.f4130c + '\'' + ", key='" + this.f4131d + '\'' + ", bytesTotal=" + this.f4132e + ", bytesTransferred=" + this.f4133f + ", transferState=" + this.f4134g + ", filePath='" + this.f4135h + '\'' + '}';
    }
}
