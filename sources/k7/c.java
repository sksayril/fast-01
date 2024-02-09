package k7;

import java.nio.ByteBuffer;

public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: k7.c$c  reason: collision with other inner class name */
    public interface C0169c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10982a = true;

        public boolean a() {
            return this.f10982a;
        }
    }

    C0169c a(d dVar);

    void b(String str, ByteBuffer byteBuffer, b bVar);

    void c(String str, a aVar);

    C0169c d();

    void e(String str, a aVar, C0169c cVar);

    void f(String str, ByteBuffer byteBuffer);
}
