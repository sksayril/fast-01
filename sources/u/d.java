package u;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f12459a;

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f12460a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12460a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f12460a = (InputContentInfo) obj;
        }

        public ClipDescription a() {
            return this.f12460a.getDescription();
        }

        public Object b() {
            return this.f12460a;
        }

        public Uri c() {
            return this.f12460a.getContentUri();
        }

        public void d() {
            this.f12460a.requestPermission();
        }

        public Uri e() {
            return this.f12460a.getLinkUri();
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f12461a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f12462b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f12463c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12461a = uri;
            this.f12462b = clipDescription;
            this.f12463c = uri2;
        }

        public ClipDescription a() {
            return this.f12462b;
        }

        public Object b() {
            return null;
        }

        public Uri c() {
            return this.f12461a;
        }

        public void d() {
        }

        public Uri e() {
            return this.f12463c;
        }
    }

    private interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f12459a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private d(c cVar) {
        this.f12459a = cVar;
    }

    public static d f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new d(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f12459a.c();
    }

    public ClipDescription b() {
        return this.f12459a.a();
    }

    public Uri c() {
        return this.f12459a.e();
    }

    public void d() {
        this.f12459a.d();
    }

    public Object e() {
        return this.f12459a.b();
    }
}
