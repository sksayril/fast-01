package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.l;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1559a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        l.e(bundle, "bundle");
        l.e(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        l.e(bundle, "bundle");
        l.e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
