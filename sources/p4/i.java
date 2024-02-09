package p4;

import m4.b;
import m4.c;
import m4.g;

class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11898a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11899b = false;

    /* renamed from: c  reason: collision with root package name */
    private c f11900c;

    /* renamed from: d  reason: collision with root package name */
    private final f f11901d;

    i(f fVar) {
        this.f11901d = fVar;
    }

    private void a() {
        if (!this.f11898a) {
            this.f11898a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar, boolean z9) {
        this.f11898a = false;
        this.f11900c = cVar;
        this.f11899b = z9;
    }

    public g d(String str) {
        a();
        this.f11901d.i(this.f11900c, str, this.f11899b);
        return this;
    }

    public g e(boolean z9) {
        a();
        this.f11901d.o(this.f11900c, z9, this.f11899b);
        return this;
    }
}
