package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class k {

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f2219a;

        a(ByteBuffer byteBuffer) {
            this.f2219a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void a(int i10) {
            ByteBuffer byteBuffer = this.f2219a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        public long b() {
            return k.c(this.f2219a.getInt());
        }

        public int c() {
            return this.f2219a.getInt();
        }

        public long d() {
            return (long) this.f2219a.position();
        }

        public int readUnsignedShort() {
            return k.d(this.f2219a.getShort());
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f2220a;

        /* renamed from: b  reason: collision with root package name */
        private final long f2221b;

        b(long j10, long j11) {
            this.f2220a = j10;
            this.f2221b = j11;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f2220a;
        }
    }

    private interface c {
        void a(int i10);

        long b();

        int c();

        long d();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.a(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int c10 = cVar.c();
                cVar.a(4);
                j10 = cVar.b();
                cVar.a(4);
                if (1835365473 == c10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.a((int) (j10 - cVar.d()));
                cVar.a(12);
                long b10 = cVar.b();
                for (int i11 = 0; ((long) i11) < b10; i11++) {
                    int c11 = cVar.c();
                    long b11 = cVar.b();
                    long b12 = cVar.b();
                    if (1164798569 == c11 || 1701669481 == c11) {
                        return new b(b11 + j10, b12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static d0.b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return d0.b.h(duplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s9) {
        return s9 & 65535;
    }
}