package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

public class b implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final NotificationDetails f4854m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4855n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<Integer> f4856o;

    public b(NotificationDetails notificationDetails, int i10, ArrayList<Integer> arrayList) {
        this.f4854m = notificationDetails;
        this.f4855n = i10;
        this.f4856o = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f4854m + ", startMode=" + this.f4855n + ", foregroundServiceTypes=" + this.f4856o + '}';
    }
}
