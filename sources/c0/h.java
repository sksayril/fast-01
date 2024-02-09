package c0;

import androidx.datastore.preferences.protobuf.y;
import b0.f;
import b0.h;
import c0.d;
import g8.s;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import z.k;

public final class h implements k<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f3552a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final String f3553b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3554a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f3554a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, b0.h hVar, a aVar) {
        Object obj;
        d.a aVar2;
        h.b b02 = hVar.b0();
        switch (b02 == null ? -1 : a.f3554a[b02.ordinal()]) {
            case -1:
                throw new z.a("Value case is null.", (Throwable) null, 2, (g) null);
            case 1:
                aVar2 = f.a(str);
                obj = Boolean.valueOf(hVar.T());
                break;
            case 2:
                aVar2 = f.c(str);
                obj = Float.valueOf(hVar.W());
                break;
            case 3:
                aVar2 = f.b(str);
                obj = Double.valueOf(hVar.V());
                break;
            case 4:
                aVar2 = f.d(str);
                obj = Integer.valueOf(hVar.X());
                break;
            case 5:
                aVar2 = f.e(str);
                obj = Long.valueOf(hVar.Y());
                break;
            case 6:
                aVar2 = f.f(str);
                obj = hVar.Z();
                l.d(obj, "value.string");
                break;
            case 7:
                aVar2 = f.g(str);
                List<String> Q = hVar.a0().Q();
                l.d(Q, "value.stringSet.stringsList");
                obj = v.D(Q);
                break;
            case 8:
                throw new z.a("Value not set.", (Throwable) null, 2, (g) null);
            default:
                throw new g8.k();
        }
        aVar.i(aVar2, obj);
    }

    private final b0.h g(Object obj) {
        y u9;
        String str;
        if (obj instanceof Boolean) {
            u9 = b0.h.c0().C(((Boolean) obj).booleanValue()).a();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            u9 = b0.h.c0().E(((Number) obj).floatValue()).a();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            u9 = b0.h.c0().D(((Number) obj).doubleValue()).a();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            u9 = b0.h.c0().F(((Number) obj).intValue()).a();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            u9 = b0.h.c0().G(((Number) obj).longValue()).a();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            u9 = b0.h.c0().H((String) obj).a();
            str = "newBuilder().setString(value).build()";
        } else if (obj instanceof Set) {
            u9 = b0.h.c0().I(b0.g.R().C((Set) obj)).a();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        } else {
            throw new IllegalStateException(l.k("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        l.d(u9, str);
        return (b0.h) u9;
    }

    public Object c(InputStream inputStream, j8.d<? super d> dVar) {
        f a10 = b0.d.f3369a.a(inputStream);
        a b10 = e.b(new d.b[0]);
        Map<String, b0.h> O = a10.O();
        l.d(O, "preferencesProto.preferencesMap");
        for (Map.Entry next : O.entrySet()) {
            String str = (String) next.getKey();
            b0.h hVar = (b0.h) next.getValue();
            h hVar2 = f3552a;
            l.d(str, "name");
            l.d(hVar, "value");
            hVar2.d(str, hVar, b10);
        }
        return b10.d();
    }

    /* renamed from: e */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f3553b;
    }

    /* renamed from: h */
    public Object b(d dVar, OutputStream outputStream, j8.d<? super s> dVar2) {
        Map<d.a<?>, Object> a10 = dVar.a();
        f.a R = f.R();
        for (Map.Entry next : a10.entrySet()) {
            R.C(((d.a) next.getKey()).a(), g(next.getValue()));
        }
        ((f) R.a()).r(outputStream);
        return s.f8976a;
    }
}
