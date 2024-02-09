package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.n;
import androidx.core.util.h;
import d0.b;
import java.nio.ByteBuffer;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final b f2222a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f2223b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2224c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f2225d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<a> f2226a;

        /* renamed from: b  reason: collision with root package name */
        private f f2227b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f2226a = new SparseArray<>(i10);
        }

        /* access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray<a> sparseArray = this.f2226a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* access modifiers changed from: package-private */
        public final f b() {
            return this.f2227b;
        }

        /* access modifiers changed from: package-private */
        public void c(f fVar, int i10, int i11) {
            a a10 = a(fVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f2226a.put(fVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(fVar, i10 + 1, i11);
            } else {
                a10.f2227b = fVar;
            }
        }
    }

    private l(Typeface typeface, b bVar) {
        this.f2225d = typeface;
        this.f2222a = bVar;
        this.f2223b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            f fVar = new f(this, i10);
            Character.toChars(fVar.f(), this.f2223b, i10 * 2);
            h(fVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            n.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            n.b();
        }
    }

    public char[] c() {
        return this.f2223b;
    }

    public b d() {
        return this.f2222a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f2222a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f2224c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f2225d;
    }

    /* access modifiers changed from: package-private */
    public void h(f fVar) {
        h.k(fVar, "emoji metadata cannot be null");
        h.a(fVar.c() > 0, "invalid metadata codepoint length");
        this.f2224c.c(fVar, 0, fVar.c() - 1);
    }
}
