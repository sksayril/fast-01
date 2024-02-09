package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1207a = (IconCompat) aVar.v(remoteActionCompat.f1207a, 1);
        remoteActionCompat.f1208b = aVar.l(remoteActionCompat.f1208b, 2);
        remoteActionCompat.f1209c = aVar.l(remoteActionCompat.f1209c, 3);
        remoteActionCompat.f1210d = (PendingIntent) aVar.r(remoteActionCompat.f1210d, 4);
        remoteActionCompat.f1211e = aVar.h(remoteActionCompat.f1211e, 5);
        remoteActionCompat.f1212f = aVar.h(remoteActionCompat.f1212f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1207a, 1);
        aVar.D(remoteActionCompat.f1208b, 2);
        aVar.D(remoteActionCompat.f1209c, 3);
        aVar.H(remoteActionCompat.f1210d, 4);
        aVar.z(remoteActionCompat.f1211e, 5);
        aVar.z(remoteActionCompat.f1212f, 6);
    }
}
