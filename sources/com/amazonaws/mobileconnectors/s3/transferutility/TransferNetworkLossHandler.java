package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import java.util.ArrayList;

public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    private static final Log f4122d = LogFactory.b(TransferNetworkLossHandler.class);

    /* renamed from: e  reason: collision with root package name */
    private static TransferNetworkLossHandler f4123e;

    /* renamed from: a  reason: collision with root package name */
    final ConnectivityManager f4124a;

    /* renamed from: b  reason: collision with root package name */
    private TransferDBUtil f4125b;

    /* renamed from: c  reason: collision with root package name */
    TransferStatusUpdater f4126c;

    private TransferNetworkLossHandler(Context context) {
        this.f4124a = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4125b = new TransferDBUtil(context);
        this.f4126c = TransferStatusUpdater.c(context);
    }

    public static synchronized TransferNetworkLossHandler c() {
        TransferNetworkLossHandler transferNetworkLossHandler;
        synchronized (TransferNetworkLossHandler.class) {
            transferNetworkLossHandler = f4123e;
            if (transferNetworkLossHandler == null) {
                f4122d.g("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
                throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            }
        }
        return transferNetworkLossHandler;
    }

    public static synchronized TransferNetworkLossHandler d(Context context) {
        TransferNetworkLossHandler transferNetworkLossHandler;
        synchronized (TransferNetworkLossHandler.class) {
            if (f4123e == null) {
                f4123e = new TransferNetworkLossHandler(context);
            }
            transferNetworkLossHandler = f4123e;
        }
        return transferNetworkLossHandler;
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        for (TransferRecord next : this.f4126c.e().values()) {
            AmazonS3 a10 = S3ClientReference.a(Integer.valueOf(next.f4139a));
            if (a10 != null && next.h(a10, this.f4126c, this.f4124a)) {
                this.f4126c.l(next.f4139a, TransferState.WAITING_FOR_NETWORK);
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void g() {
        TransferRecord d10;
        int i10 = 0;
        TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
        f4122d.a("Loading transfers from database...");
        Cursor cursor = null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            Cursor o10 = this.f4125b.o(TransferType.ANY, transferStateArr);
            while (o10.moveToNext()) {
                int i11 = o10.getInt(o10.getColumnIndexOrThrow("_id"));
                if (this.f4126c.d(i11) == null) {
                    TransferRecord transferRecord = new TransferRecord(i11);
                    transferRecord.j(o10);
                    this.f4126c.b(transferRecord);
                    i10++;
                }
                arrayList.add(Integer.valueOf(i11));
            }
            f4122d.a("Closing the cursor for resumeAllTransfers");
            o10.close();
            for (Integer num : arrayList) {
                AmazonS3 a10 = S3ClientReference.a(num);
                if (!(a10 == null || (d10 = this.f4126c.d(num.intValue())) == null || d10.f())) {
                    d10.i(a10, this.f4125b, this.f4126c, this.f4124a);
                }
            }
        } catch (Exception e10) {
            Log log = f4122d;
            log.g("Error in resuming the transfers." + e10.getMessage());
        } catch (Throwable th) {
            if (cursor != null) {
                f4122d.a("Closing the cursor for resumeAllTransfers");
                cursor.close();
            }
            throw th;
        }
        Log log2 = f4122d;
        log2.a(i10 + " transfers are loaded from database.");
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        NetworkInfo activeNetworkInfo = this.f4124a.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f4122d;
            log.h("Network connectivity changed detected.");
            boolean e10 = e();
            log.h("Network connected: " + e10);
            new Thread(new Runnable() {
                public void run() {
                    if (TransferNetworkLossHandler.this.e()) {
                        TransferNetworkLossHandler.this.g();
                    } else {
                        TransferNetworkLossHandler.this.f();
                    }
                }
            }).start();
        }
    }
}
