package n0;

import android.os.Build;
import android.os.ext.SdkExtensions;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11284a = new a();

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    private static final class C0185a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0185a f11285a = new C0185a();

        private C0185a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0185a.f11285a.a();
        }
        return 0;
    }
}
