package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.l;

final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1558a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        l.e(bundle, "bundle");
        l.e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
