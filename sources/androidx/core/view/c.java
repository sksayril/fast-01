package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.h;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f1725a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0036c f1726a;

        public a(ClipData clipData, int i10) {
            this.f1726a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        public c a() {
            return this.f1726a.a();
        }

        public a b(Bundle bundle) {
            this.f1726a.b(bundle);
            return this;
        }

        public a c(int i10) {
            this.f1726a.d(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f1726a.c(uri);
            return this;
        }
    }

    private static final class b implements C0036c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f1727a;

        b(ClipData clipData, int i10) {
            this.f1727a = new ContentInfo.Builder(clipData, i10);
        }

        public c a() {
            return new c(new e(this.f1727a.build()));
        }

        public void b(Bundle bundle) {
            this.f1727a.setExtras(bundle);
        }

        public void c(Uri uri) {
            this.f1727a.setLinkUri(uri);
        }

        public void d(int i10) {
            this.f1727a.setFlags(i10);
        }
    }

    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    private interface C0036c {
        c a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i10);
    }

    private static final class d implements C0036c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f1728a;

        /* renamed from: b  reason: collision with root package name */
        int f1729b;

        /* renamed from: c  reason: collision with root package name */
        int f1730c;

        /* renamed from: d  reason: collision with root package name */
        Uri f1731d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f1732e;

        d(ClipData clipData, int i10) {
            this.f1728a = clipData;
            this.f1729b = i10;
        }

        public c a() {
            return new c(new g(this));
        }

        public void b(Bundle bundle) {
            this.f1732e = bundle;
        }

        public void c(Uri uri) {
            this.f1731d = uri;
        }

        public void d(int i10) {
            this.f1730c = i10;
        }
    }

    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f1733a;

        e(ContentInfo contentInfo) {
            this.f1733a = (ContentInfo) h.j(contentInfo);
        }

        public ClipData a() {
            return this.f1733a.getClip();
        }

        public int b() {
            return this.f1733a.getFlags();
        }

        public ContentInfo c() {
            return this.f1733a;
        }

        public int d() {
            return this.f1733a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1733a + "}";
        }
    }

    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f1734a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1735b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1736c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f1737d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f1738e;

        g(d dVar) {
            this.f1734a = (ClipData) h.j(dVar.f1728a);
            this.f1735b = h.e(dVar.f1729b, 0, 5, "source");
            this.f1736c = h.i(dVar.f1730c, 1);
            this.f1737d = dVar.f1731d;
            this.f1738e = dVar.f1732e;
        }

        public ClipData a() {
            return this.f1734a;
        }

        public int b() {
            return this.f1736c;
        }

        public ContentInfo c() {
            return null;
        }

        public int d() {
            return this.f1735b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f1734a.getDescription());
            sb.append(", source=");
            sb.append(c.e(this.f1735b));
            sb.append(", flags=");
            sb.append(c.a(this.f1736c));
            String str2 = "";
            if (this.f1737d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f1737d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f1738e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    c(f fVar) {
        this.f1725a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f1725a.a();
    }

    public int c() {
        return this.f1725a.b();
    }

    public int d() {
        return this.f1725a.d();
    }

    public ContentInfo f() {
        ContentInfo c10 = this.f1725a.c();
        Objects.requireNonNull(c10);
        ContentInfo contentInfo = c10;
        return c10;
    }

    public String toString() {
        return this.f1725a.toString();
    }
}
