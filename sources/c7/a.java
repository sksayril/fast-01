package c7;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.h;
import io.flutter.view.e;
import k7.c;

public interface a {

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    public interface C0082a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3859a;

        /* renamed from: b  reason: collision with root package name */
        private final io.flutter.embedding.engine.a f3860b;

        /* renamed from: c  reason: collision with root package name */
        private final c f3861c;

        /* renamed from: d  reason: collision with root package name */
        private final e f3862d;

        /* renamed from: e  reason: collision with root package name */
        private final h f3863e;

        /* renamed from: f  reason: collision with root package name */
        private final C0082a f3864f;

        /* renamed from: g  reason: collision with root package name */
        private final d f3865g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, e eVar, h hVar, C0082a aVar2, d dVar) {
            this.f3859a = context;
            this.f3860b = aVar;
            this.f3861c = cVar;
            this.f3862d = eVar;
            this.f3863e = hVar;
            this.f3864f = aVar2;
            this.f3865g = dVar;
        }

        public Context a() {
            return this.f3859a;
        }

        public c b() {
            return this.f3861c;
        }

        public h c() {
            return this.f3863e;
        }

        public e d() {
            return this.f3862d;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
