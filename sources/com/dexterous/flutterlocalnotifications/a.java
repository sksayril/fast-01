package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;

public class a extends Service {
    private static int a(ArrayList<Integer> arrayList) {
        int intValue = arrayList.get(0).intValue();
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            intValue |= arrayList.get(i10).intValue();
        }
        return intValue;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        b bVar = (b) (i12 >= 33 ? intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", b.class) : intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter"));
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, bVar.f4854m);
        if (bVar.f4856o == null || i12 < 29) {
            startForeground(bVar.f4854m.id.intValue(), createNotification);
        } else {
            startForeground(bVar.f4854m.id.intValue(), createNotification, a(bVar.f4856o));
        }
        return bVar.f4855n;
    }
}
