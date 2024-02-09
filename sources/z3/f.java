package z3;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.i;
import java.io.IOException;
import java.io.InputStream;

public class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f13575a;

    /* renamed from: b  reason: collision with root package name */
    private b f13576b = null;

    private class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f13577a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f13578b;

        private b() {
            int p10 = i.p(f.this.f13575a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p10 != 0) {
                this.f13577a = "Unity";
                String string = f.this.f13575a.getResources().getString(p10);
                this.f13578b = string;
                g f10 = g.f();
                f10.i("Unity Editor version is: " + string);
            } else if (f.this.c("flutter_assets/NOTICES.Z")) {
                this.f13577a = "Flutter";
                this.f13578b = null;
                g.f().i("Development platform is: Flutter");
            } else {
                this.f13577a = null;
                this.f13578b = null;
            }
        }
    }

    public f(Context context) {
        this.f13575a = context;
    }

    /* access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f13575a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f13575a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f13576b == null) {
            this.f13576b = new b();
        }
        return this.f13576b;
    }

    public String d() {
        return f().f13577a;
    }

    public String e() {
        return f().f13578b;
    }
}
