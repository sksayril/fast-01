package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1451e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1452a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1453b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1454c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1455d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f1452a = i10;
        this.f1453b = i11;
        this.f1454c = i12;
        this.f1455d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1452a, bVar2.f1452a), Math.max(bVar.f1453b, bVar2.f1453b), Math.max(bVar.f1454c, bVar2.f1454c), Math.max(bVar.f1455d, bVar2.f1455d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f1451e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1452a, this.f1453b, this.f1454c, this.f1455d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1455d == bVar.f1455d && this.f1452a == bVar.f1452a && this.f1454c == bVar.f1454c && this.f1453b == bVar.f1453b;
    }

    public int hashCode() {
        return (((((this.f1452a * 31) + this.f1453b) * 31) + this.f1454c) * 31) + this.f1455d;
    }

    public String toString() {
        return "Insets{left=" + this.f1452a + ", top=" + this.f1453b + ", right=" + this.f1454c + ", bottom=" + this.f1455d + '}';
    }
}
