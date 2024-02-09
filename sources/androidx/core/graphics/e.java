package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final k f1488a;

    /* renamed from: b  reason: collision with root package name */
    private static final p.e<String, Typeface> f1489b = new p.e<>(16);

    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f1490a;

        public a(h.e eVar) {
            this.f1490a = eVar;
        }

        public void a(int i10) {
            h.e eVar = this.f1490a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.f1490a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1488a = i10 >= 29 ? new j() : i10 >= 28 ? new i() : i10 >= 26 ? new h() : (i10 < 24 || !g.j()) ? new f() : new g();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f1488a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z9) {
        Typeface typeface;
        e.b bVar2 = bVar;
        h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0022e) {
            e.C0022e eVar3 = (e.C0022e) bVar2;
            Typeface g10 = g(eVar3.c());
            if (g10 != null) {
                if (eVar2 != null) {
                    eVar2.d(g10, handler2);
                }
                return g10;
            }
            typeface = g.c(context, eVar3.b(), i12, !z9 ? eVar2 == null : eVar3.a() == 0, z9 ? eVar3.d() : -1, h.e.e(handler), new a(eVar2));
            Resources resources2 = resources;
            int i13 = i12;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f1488a.a(context, (e.c) bVar2, resources, i12);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f1489b.d(e(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f1488a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f1489b.d(e(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f1489b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
