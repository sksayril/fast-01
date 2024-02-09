package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.e;
import androidx.core.util.h;
import java.util.concurrent.Executor;

public class g {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1612a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f1613b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f1612a = i10;
            this.f1613b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f1613b;
        }

        public int c() {
            return this.f1612a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f1614a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1615b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1616c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1617d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1618e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z9, int i12) {
            this.f1614a = (Uri) h.j(uri);
            this.f1615b = i10;
            this.f1616c = i11;
            this.f1617d = z9;
            this.f1618e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z9, int i12) {
            return new b(uri, i10, i11, z9, i12);
        }

        public int b() {
            return this.f1618e;
        }

        public int c() {
            return this.f1615b;
        }

        public Uri d() {
            return this.f1614a;
        }

        public int e() {
            return this.f1616c;
        }

        public boolean f() {
            return this.f1617d;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z9, int i11, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        return z9 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, (Executor) null, aVar);
    }
}
