package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import d0.a;

public class f {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<a> f2183d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f2184a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2185b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f2186c = 0;

    f(l lVar, int i10) {
        this.f2185b = lVar;
        this.f2184a = i10;
    }

    private a g() {
        ThreadLocal<a> threadLocal = f2183d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f2185b.d().j(aVar, this.f2184a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f2185b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f2185b.c(), this.f2184a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f2186c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z9) {
        this.f2186c = z9 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb.append(Integer.toHexString(b(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
