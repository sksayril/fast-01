package b2;

import android.net.Uri;
import java.util.Map;

final class b extends Thread {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Map f3383m;

    b(a aVar, Map map) {
        this.f3383m = map;
    }

    public final void run() {
        Map map = this.f3383m;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(buildUpon.build().toString());
    }
}
