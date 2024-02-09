package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Long, e.c> f1507a = new ConcurrentHashMap<>();

    class a implements b<g.b> {
        a() {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t9);

        boolean b(T t9);
    }

    k() {
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z9, b<T> bVar) {
        T t9 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int abs = (Math.abs(bVar.a(t10) - i10) * 2) + (bVar.b(t10) == z9 ? 0 : 1);
            if (t9 == null || i11 > abs) {
                t9 = t10;
                i11 = abs;
            }
        }
        return t9;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public Typeface c(Context context, InputStream inputStream) {
        File e10 = l.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!l.d(e10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = l.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!l.c(e10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    /* access modifiers changed from: protected */
    public g.b g(g.b[] bVarArr, int i10) {
        return (g.b) e(bVarArr, i10, new a());
    }
}
