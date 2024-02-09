package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

final class i1 extends f1 {
    private i1() {
    }

    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }
}
