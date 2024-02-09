package m6;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o5.a;
import o5.n;
import o5.o;
import o5.p;

public class b {

    /* renamed from: a  reason: collision with root package name */
    protected n f11208a;

    /* renamed from: b  reason: collision with root package name */
    protected q f11209b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11210c = 2;

    public b(n nVar, q qVar) {
        this.f11208a = nVar;
        this.f11209b = qVar;
    }

    public static List<p> f(List<p> list, q qVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (p f10 : list) {
            arrayList.add(qVar.f(f10));
        }
        return arrayList;
    }

    public a a() {
        return this.f11208a.b();
    }

    public Bitmap b() {
        return this.f11209b.b((Rect) null, 2);
    }

    public byte[] c() {
        return this.f11208a.c();
    }

    public Map<o, Object> d() {
        return this.f11208a.d();
    }

    public String e() {
        return this.f11208a.f();
    }

    public String toString() {
        return this.f11208a.f();
    }
}
