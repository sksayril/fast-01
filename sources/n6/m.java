package n6;

import android.graphics.Rect;
import java.util.List;
import m6.p;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private p f11393a;

    /* renamed from: b  reason: collision with root package name */
    private int f11394b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11395c = false;

    /* renamed from: d  reason: collision with root package name */
    private q f11396d = new n();

    public m(int i10, p pVar) {
        this.f11394b = i10;
        this.f11393a = pVar;
    }

    public p a(List<p> list, boolean z9) {
        return this.f11396d.b(list, b(z9));
    }

    public p b(boolean z9) {
        p pVar = this.f11393a;
        if (pVar == null) {
            return null;
        }
        return z9 ? pVar.g() : pVar;
    }

    public int c() {
        return this.f11394b;
    }

    public Rect d(p pVar) {
        return this.f11396d.d(pVar, this.f11393a);
    }

    public void e(q qVar) {
        this.f11396d = qVar;
    }
}
