package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

public class TransferService extends Service {

    /* renamed from: p  reason: collision with root package name */
    private static final Log f4167p = LogFactory.b(TransferService.class);

    /* renamed from: q  reason: collision with root package name */
    static TransferNetworkLossHandler f4168q;

    /* renamed from: m  reason: collision with root package name */
    boolean f4169m = true;

    /* renamed from: n  reason: collision with root package name */
    private int f4170n = 1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4171o = true;

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if ((getApplicationInfo().flags & 2) != 0) {
            printWriter.printf("network status: %s\n", new Object[]{Boolean.valueOf(f4168q.e())});
            Map<Integer, TransferRecord> e10 = TransferStatusUpdater.c(this).e();
            printWriter.printf("# of active transfers: %d\n", new Object[]{Integer.valueOf(e10.size())});
            for (TransferRecord next : e10.values()) {
                printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", new Object[]{next.f4154p, next.f4155q, next.f4153o, Long.valueOf(next.f4146h), Long.valueOf(next.f4147i)});
            }
            printWriter.flush();
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r3 = this;
            super.onCreate()
            com.amazonaws.logging.Log r0 = f4167p
            java.lang.String r1 = "Starting Transfer Service to listen for network connectivity changes."
            r0.h(r1)
            android.content.Context r1 = r3.getApplicationContext()
            com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.d(r1)
            f4168q = r1
            monitor-enter(r3)
            boolean r1 = r3.f4169m     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = "Registering the network receiver"
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler r0 = f4168q     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            r3.registerReceiver(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            r0 = 0
            r3.f4169m = r0     // Catch:{ IllegalArgumentException -> 0x0036, IllegalStateException -> 0x002e }
            goto L_0x003b
        L_0x002e:
            com.amazonaws.logging.Log r0 = f4167p     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "Ignoring the leak in registering the receiver."
        L_0x0032:
            r0.e(r1)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x0036:
            com.amazonaws.logging.Log r0 = f4167p     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "Ignoring the exception trying to register the receiver for connectivity change."
            goto L_0x0032
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferService.onCreate():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onDestroy() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0018 }
            r1 = 26
            if (r0 < r1) goto L_0x002f
            com.amazonaws.logging.Log r0 = f4167p     // Catch:{ Exception -> 0x0018 }
            java.lang.String r1 = "Moving the service out of the Foreground state."
            r0.h(r1)     // Catch:{ Exception -> 0x0018 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0018 }
            boolean r0 = r4.f4171o     // Catch:{ all -> 0x0015 }
            r4.stopForeground(r0)     // Catch:{ all -> 0x0015 }
            monitor-exit(r4)     // Catch:{ all -> 0x0015 }
            goto L_0x002f
        L_0x0015:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = f4167p
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error in moving the service out of the foreground state: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.g(r0)
        L_0x002f:
            com.amazonaws.logging.Log r0 = f4167p     // Catch:{ IllegalArgumentException -> 0x004b }
            java.lang.String r1 = "De-registering the network receiver."
            r0.h(r1)     // Catch:{ IllegalArgumentException -> 0x004b }
            monitor-enter(r4)     // Catch:{ IllegalArgumentException -> 0x004b }
            boolean r0 = r4.f4169m     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0046
            com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler r0 = f4168q     // Catch:{ all -> 0x0048 }
            r4.unregisterReceiver(r0)     // Catch:{ all -> 0x0048 }
            r0 = 1
            r4.f4169m = r0     // Catch:{ all -> 0x0048 }
            r0 = 0
            f4168q = r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x0052
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x004b }
        L_0x004b:
            com.amazonaws.logging.Log r0 = f4167p
            java.lang.String r1 = "Exception trying to de-register the network receiver"
            r0.e(r1)
        L_0x0052:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferService.onDestroy():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public int onStartCommand(android.content.Intent r2, int r3, int r4) {
        /*
            r1 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0055
            monitor-enter(r1)     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = "notification"
            android.os.Parcelable r3 = r2.getParcelableExtra(r3)     // Catch:{ all -> 0x003b }
            android.app.Notification r3 = (android.app.Notification) r3     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0032
            java.lang.String r4 = "ongoing-notification-id"
            int r0 = r1.f4170n     // Catch:{ all -> 0x003b }
            int r4 = r2.getIntExtra(r4, r0)     // Catch:{ all -> 0x003b }
            r1.f4170n = r4     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "remove-notification"
            boolean r0 = r1.f4171o     // Catch:{ all -> 0x003b }
            boolean r2 = r2.getBooleanExtra(r4, r0)     // Catch:{ all -> 0x003b }
            r1.f4171o = r2     // Catch:{ all -> 0x003b }
            com.amazonaws.logging.Log r2 = f4167p     // Catch:{ all -> 0x003b }
            java.lang.String r4 = "Putting the service in Foreground state."
            r2.h(r4)     // Catch:{ all -> 0x003b }
            int r2 = r1.f4170n     // Catch:{ all -> 0x003b }
            r1.startForeground(r2, r3)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0032:
            com.amazonaws.logging.Log r2 = f4167p     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "No notification is passed in the intent. Unable to transition to foreground."
            r2.g(r3)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0055
        L_0x003b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            throw r2     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            r2 = move-exception
            com.amazonaws.logging.Log r3 = f4167p
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Error in moving the service to foreground state: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.g(r2)
        L_0x0055:
            monitor-enter(r1)
            boolean r2 = r1.f4169m     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x007e
            com.amazonaws.logging.Log r2 = f4167p     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            java.lang.String r3 = "Registering the network receiver"
            r2.h(r3)     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler r2 = f4168q     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            r1.registerReceiver(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            r2 = 0
            r1.f4169m = r2     // Catch:{ IllegalArgumentException -> 0x0079, IllegalStateException -> 0x0071 }
            goto L_0x007e
        L_0x0071:
            com.amazonaws.logging.Log r2 = f4167p     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Ignoring the leak in registering the receiver."
        L_0x0075:
            r2.e(r3)     // Catch:{ all -> 0x0081 }
            goto L_0x007e
        L_0x0079:
            com.amazonaws.logging.Log r2 = f4167p     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Ignoring the exception trying to register the receiver for connectivity change."
            goto L_0x0075
        L_0x007e:
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            r2 = 1
            return r2
        L_0x0081:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferService.onStartCommand(android.content.Intent, int, int):int");
    }
}
