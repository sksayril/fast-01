package com.amazonaws.mobileconnectors.s3.transferutility;

public interface TransferListener {
    void a(int i10, TransferState transferState);

    void b(int i10, long j10, long j11);

    void c(int i10, Exception exc);
}
