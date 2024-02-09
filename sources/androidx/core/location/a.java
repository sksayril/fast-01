package androidx.core.location;

import android.location.Location;
import java.util.List;

public final /* synthetic */ class a {
    public static void a(b bVar, int i10) {
    }

    public static void b(b bVar, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            bVar.onLocationChanged((Location) list.get(i10));
        }
    }
}
