package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class b0 extends Writer {

    /* renamed from: m  reason: collision with root package name */
    private final String f2383m;

    /* renamed from: n  reason: collision with root package name */
    private StringBuilder f2384n = new StringBuilder(128);

    b0(String str) {
        this.f2383m = str;
    }

    private void a() {
        if (this.f2384n.length() > 0) {
            Log.d(this.f2383m, this.f2384n.toString());
            StringBuilder sb = this.f2384n;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f2384n.append(c10);
            }
        }
    }
}
