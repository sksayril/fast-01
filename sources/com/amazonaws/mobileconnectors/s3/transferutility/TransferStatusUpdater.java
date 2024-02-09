package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

class TransferStatusUpdater {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Log f4172c = LogFactory.b(TransferStatusUpdater.class);

    /* renamed from: d  reason: collision with root package name */
    private static final HashSet<TransferState> f4173d = new HashSet<>(Arrays.asList(new TransferState[]{TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT}));

    /* renamed from: e  reason: collision with root package name */
    static final Map<Integer, List<TransferListener>> f4174e = new ConcurrentHashMap<Integer, List<TransferListener>>() {
    };

    /* renamed from: f  reason: collision with root package name */
    private static TransferDBUtil f4175f;

    /* renamed from: g  reason: collision with root package name */
    private static TransferStatusUpdater f4176g;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, TransferRecord> f4177a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4178b = new Handler(Looper.getMainLooper());

    private class TransferProgressListener implements ProgressListener {

        /* renamed from: a  reason: collision with root package name */
        private final TransferRecord f4192a;

        /* renamed from: b  reason: collision with root package name */
        private long f4193b;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f4192a = transferRecord;
        }

        public synchronized void a(ProgressEvent progressEvent) {
            if (32 == progressEvent.b()) {
                TransferStatusUpdater.f4172c.h("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f4193b = 0;
            } else {
                long a10 = this.f4193b + progressEvent.a();
                this.f4193b = a10;
                TransferRecord transferRecord = this.f4192a;
                if (a10 > transferRecord.f4147i) {
                    transferRecord.f4147i = a10;
                    TransferStatusUpdater.this.k(transferRecord.f4139a, a10, transferRecord.f4146h, true);
                }
            }
        }
    }

    TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f4175f = transferDBUtil;
    }

    public static synchronized TransferStatusUpdater c(Context context) {
        TransferStatusUpdater transferStatusUpdater;
        synchronized (TransferStatusUpdater.class) {
            if (f4176g == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                f4175f = transferDBUtil;
                f4176g = new TransferStatusUpdater(transferDBUtil);
            }
            transferStatusUpdater = f4176g;
        }
        return transferStatusUpdater;
    }

    static void g(int i10, TransferListener transferListener) {
        if (transferListener != null) {
            Map<Integer, List<TransferListener>> map = f4174e;
            synchronized (map) {
                List list = map.get(Integer.valueOf(i10));
                if (list == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(transferListener);
                    map.put(Integer.valueOf(i10), copyOnWriteArrayList);
                } else if (!list.contains(transferListener)) {
                    list.add(transferListener);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Listener can't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void j(int r2, com.amazonaws.mobileconnectors.s3.transferutility.TransferListener r3) {
        /*
            if (r3 == 0) goto L_0x0022
            java.util.Map<java.lang.Integer, java.util.List<com.amazonaws.mobileconnectors.s3.transferutility.TransferListener>> r0 = f4174e
            monitor-enter(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001f }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            r2.remove(r3)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r2
        L_0x0022:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Listener can't be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.j(int, com.amazonaws.mobileconnectors.s3.transferutility.TransferListener):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(TransferRecord transferRecord) {
        this.f4177a.put(Integer.valueOf(transferRecord.f4139a), transferRecord);
    }

    /* access modifiers changed from: package-private */
    public synchronized TransferRecord d(int i10) {
        return this.f4177a.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public synchronized Map<Integer, TransferRecord> e() {
        return Collections.unmodifiableMap(this.f4177a);
    }

    /* access modifiers changed from: package-private */
    public synchronized ProgressListener f(int i10) {
        TransferRecord d10;
        d10 = d(i10);
        if (d10 != null) {
            Log log = f4172c;
            log.h("Creating a new progress listener for transfer: " + i10);
        } else {
            Log log2 = f4172c;
            log2.h("TransferStatusUpdater doesn't track the transfer: " + i10);
            throw new IllegalArgumentException("transfer " + i10 + " doesn't exist");
        }
        return new TransferProgressListener(d10);
    }

    /* access modifiers changed from: package-private */
    public synchronized void h(int i10) {
        TransferRecord j10 = f4175f.j(i10);
        if (j10 != null) {
            String str = j10.f4157s;
            if (new File(str).getName().startsWith("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002")) {
                new File(str).delete();
            }
        }
        S3ClientReference.c(Integer.valueOf(i10));
        f4175f.c(i10);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(final int r6, final java.lang.Exception r7) {
        /*
            r5 = this;
            java.util.Map<java.lang.Integer, java.util.List<com.amazonaws.mobileconnectors.s3.transferutility.TransferListener>> r0 = f4174e
            monitor-enter(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0035 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0033
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0016
            goto L_0x0033
        L_0x0016:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferListener r2 = (com.amazonaws.mobileconnectors.s3.transferutility.TransferListener) r2     // Catch:{ all -> 0x0035 }
            android.os.Handler r3 = r5.f4178b     // Catch:{ all -> 0x0035 }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$4 r4 = new com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$4     // Catch:{ all -> 0x0035 }
            r4.<init>(r2, r6, r7)     // Catch:{ all -> 0x0035 }
            r3.post(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x001a
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.i(int, java.lang.Exception):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i10, long j10, long j11, boolean z9) {
        long j12 = j10;
        synchronized (this) {
            TransferRecord transferRecord = this.f4177a.get(Integer.valueOf(i10));
            if (transferRecord != null) {
                transferRecord.f4147i = j12;
                transferRecord.f4146h = j11;
            } else {
                long j13 = j11;
            }
            f4175f.p(i10, j12);
            if (z9) {
                Map<Integer, List<TransferListener>> map = f4174e;
                synchronized (map) {
                    List list = map.get(Integer.valueOf(i10));
                    if (list != null) {
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                final TransferListener transferListener = (TransferListener) it.next();
                                final int i11 = i10;
                                final long j14 = j10;
                                Iterator it2 = it;
                                Handler handler = this.f4178b;
                                AnonymousClass3 r10 = r1;
                                final long j15 = j11;
                                AnonymousClass3 r12 = new Runnable() {
                                    public void run() {
                                        transferListener.b(i11, j14, j15);
                                    }
                                };
                                handler.post(r10);
                                long j16 = j10;
                                it = it2;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d A[SYNTHETIC, Splitter:B:14:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void l(final int r7, final com.amazonaws.mobileconnectors.s3.transferutility.TransferState r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.HashSet<com.amazonaws.mobileconnectors.s3.transferutility.TransferState> r0 = f4173d     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x00bd }
            java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord> r1 = r6.f4177a     // Catch:{ all -> 0x00bd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00bd }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00bd }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r1 = (com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord) r1     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x0034
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r1 = f4175f     // Catch:{ all -> 0x00bd }
            int r1 = r1.s(r7, r8)     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x0059
            com.amazonaws.logging.Log r1 = f4172c     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "Failed to update the status of transfer "
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            r2.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
        L_0x0030:
            r1.e(r2)     // Catch:{ all -> 0x00bd }
            goto L_0x0059
        L_0x0034:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r2 = r1.f4153o     // Catch:{ all -> 0x00bd }
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x00bd }
            r0 = r0 | r2
            r1.f4153o = r8     // Catch:{ all -> 0x00bd }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil r2 = f4175f     // Catch:{ all -> 0x00bd }
            int r1 = r2.t(r1)     // Catch:{ all -> 0x00bd }
            if (r1 != 0) goto L_0x0059
            com.amazonaws.logging.Log r1 = f4172c     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r2.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "Failed to update the status of transfer "
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            r2.append(r7)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
            goto L_0x0030
        L_0x0059:
            if (r0 == 0) goto L_0x005d
            monitor-exit(r6)
            return
        L_0x005d:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.COMPLETED     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0068
            r6.h(r7)     // Catch:{ all -> 0x00bd }
        L_0x0068:
            java.util.Map<java.lang.Integer, java.util.List<com.amazonaws.mobileconnectors.s3.transferutility.TransferListener>> r0 = f4174e     // Catch:{ all -> 0x00bd }
            monitor-enter(r0)     // Catch:{ all -> 0x00bd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x00ba }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00b7
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x007e
            goto L_0x00b7
        L_0x007e:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00ba }
        L_0x0082:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x0099
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ba }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferListener r3 = (com.amazonaws.mobileconnectors.s3.transferutility.TransferListener) r3     // Catch:{ all -> 0x00ba }
            android.os.Handler r4 = r6.f4178b     // Catch:{ all -> 0x00ba }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$2 r5 = new com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$2     // Catch:{ all -> 0x00ba }
            r5.<init>(r3, r7, r8)     // Catch:{ all -> 0x00ba }
            r4.post(r5)     // Catch:{ all -> 0x00ba }
            goto L_0x0082
        L_0x0099:
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.COMPLETED     // Catch:{ all -> 0x00ba }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00b1
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.FAILED     // Catch:{ all -> 0x00ba }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00b1
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r7 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.CANCELED     // Catch:{ all -> 0x00ba }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x00b4
        L_0x00b1:
            r1.clear()     // Catch:{ all -> 0x00ba }
        L_0x00b4:
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            monitor-exit(r6)
            return
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            monitor-exit(r6)
            return
        L_0x00ba:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r7     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.l(int, com.amazonaws.mobileconnectors.s3.transferutility.TransferState):void");
    }
}
