package androidx.activity.result;

import e.d;
import kotlin.jvm.internal.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private d.f f225a = d.b.f8281a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private d.f f226a = d.b.f8281a;

        public final g a() {
            g gVar = new g();
            gVar.b(this.f226a);
            return gVar;
        }

        public final a b(d.f fVar) {
            l.e(fVar, "mediaType");
            this.f226a = fVar;
            return this;
        }
    }

    public final d.f a() {
        return this.f225a;
    }

    public final void b(d.f fVar) {
        l.e(fVar, "<set-?>");
        this.f225a = fVar;
    }
}
