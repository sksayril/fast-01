package c4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

class g implements Closeable {

    /* renamed from: s  reason: collision with root package name */
    private static final Logger f3591s = Logger.getLogger(g.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final RandomAccessFile f3592m;

    /* renamed from: n  reason: collision with root package name */
    int f3593n;

    /* renamed from: o  reason: collision with root package name */
    private int f3594o;

    /* renamed from: p  reason: collision with root package name */
    private b f3595p;

    /* renamed from: q  reason: collision with root package name */
    private b f3596q;

    /* renamed from: r  reason: collision with root package name */
    private final byte[] f3597r = new byte[16];

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f3598a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f3599b;

        a(StringBuilder sb) {
            this.f3599b = sb;
        }

        public void a(InputStream inputStream, int i10) {
            if (this.f3598a) {
                this.f3598a = false;
            } else {
                this.f3599b.append(", ");
            }
            this.f3599b.append(i10);
        }
    }

    static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f3601c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f3602a;

        /* renamed from: b  reason: collision with root package name */
        final int f3603b;

        b(int i10, int i11) {
            this.f3602a = i10;
            this.f3603b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f3602a + ", length = " + this.f3603b + "]";
        }
    }

    private final class c extends InputStream {

        /* renamed from: m  reason: collision with root package name */
        private int f3604m;

        /* renamed from: n  reason: collision with root package name */
        private int f3605n;

        private c(b bVar) {
            this.f3604m = g.this.F(bVar.f3602a + 4);
            this.f3605n = bVar.f3603b;
        }

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f3605n == 0) {
                return -1;
            }
            g.this.f3592m.seek((long) this.f3604m);
            int read = g.this.f3592m.read();
            this.f3604m = g.this.F(this.f3604m + 1);
            this.f3605n--;
            return read;
        }

        public int read(byte[] bArr, int i10, int i11) {
            Object unused = g.q(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f3605n;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            g.this.A(this.f3604m, bArr, i10, i11);
            this.f3604m = g.this.F(this.f3604m + i11);
            this.f3605n -= i11;
            return i11;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public g(File file) {
        if (!file.exists()) {
            o(file);
        }
        this.f3592m = r(file);
        u();
    }

    /* access modifiers changed from: private */
    public void A(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int F = F(i10);
        int i13 = F + i12;
        int i14 = this.f3593n;
        if (i13 <= i14) {
            this.f3592m.seek((long) F);
            randomAccessFile = this.f3592m;
        } else {
            int i15 = i14 - F;
            this.f3592m.seek((long) F);
            this.f3592m.readFully(bArr, i11, i15);
            this.f3592m.seek(16);
            randomAccessFile = this.f3592m;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    private void C(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int F = F(i10);
        int i13 = F + i12;
        int i14 = this.f3593n;
        if (i13 <= i14) {
            this.f3592m.seek((long) F);
            randomAccessFile = this.f3592m;
        } else {
            int i15 = i14 - F;
            this.f3592m.seek((long) F);
            this.f3592m.write(bArr, i11, i15);
            this.f3592m.seek(16);
            randomAccessFile = this.f3592m;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    private void D(int i10) {
        this.f3592m.setLength((long) i10);
        this.f3592m.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    public int F(int i10) {
        int i11 = this.f3593n;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void G(int i10, int i11, int i12, int i13) {
        I(this.f3597r, i10, i11, i12, i13);
        this.f3592m.seek(0);
        this.f3592m.write(this.f3597r);
    }

    private static void H(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void I(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int H : iArr) {
            H(bArr, i10, H);
            i10 += 4;
        }
    }

    private void m(int i10) {
        int i11 = i10 + 4;
        int y9 = y();
        if (y9 < i11) {
            int i12 = this.f3593n;
            do {
                y9 += i12;
                i12 <<= 1;
            } while (y9 < i11);
            D(i12);
            b bVar = this.f3596q;
            int F = F(bVar.f3602a + 4 + bVar.f3603b);
            if (F < this.f3595p.f3602a) {
                FileChannel channel = this.f3592m.getChannel();
                channel.position((long) this.f3593n);
                long j10 = (long) (F - 4);
                if (channel.transferTo(16, j10, channel) != j10) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i13 = this.f3596q.f3602a;
            int i14 = this.f3595p.f3602a;
            if (i13 < i14) {
                int i15 = (this.f3593n + i13) - 16;
                G(i12, this.f3594o, i14, i15);
                this.f3596q = new b(i15, this.f3596q.f3603b);
            } else {
                G(i12, this.f3594o, i14, i13);
            }
            this.f3593n = i12;
        }
    }

    /* JADX INFO: finally extract failed */
    private static void o(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile r9 = r(file2);
        try {
            r9.setLength(4096);
            r9.seek(0);
            byte[] bArr = new byte[16];
            I(bArr, 4096, 0, 0, 0);
            r9.write(bArr);
            r9.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            r9.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public static <T> T q(T t9, String str) {
        Objects.requireNonNull(t9, str);
        return t9;
    }

    private static RandomAccessFile r(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b t(int i10) {
        if (i10 == 0) {
            return b.f3601c;
        }
        this.f3592m.seek((long) i10);
        return new b(i10, this.f3592m.readInt());
    }

    private void u() {
        this.f3592m.seek(0);
        this.f3592m.readFully(this.f3597r);
        int w9 = w(this.f3597r, 0);
        this.f3593n = w9;
        if (((long) w9) <= this.f3592m.length()) {
            this.f3594o = w(this.f3597r, 4);
            int w10 = w(this.f3597r, 8);
            int w11 = w(this.f3597r, 12);
            this.f3595p = t(w10);
            this.f3596q = t(w11);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f3593n + ", Actual length: " + this.f3592m.length());
    }

    private static int w(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int y() {
        return this.f3593n - E();
    }

    public int E() {
        if (this.f3594o == 0) {
            return 16;
        }
        b bVar = this.f3596q;
        int i10 = bVar.f3602a;
        int i11 = this.f3595p.f3602a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f3603b + 16 : (((i10 + 4) + bVar.f3603b) + this.f3593n) - i11;
    }

    public synchronized void close() {
        this.f3592m.close();
    }

    public void h(byte[] bArr) {
        k(bArr, 0, bArr.length);
    }

    public synchronized void k(byte[] bArr, int i10, int i11) {
        int i12;
        q(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        m(i11);
        boolean p10 = p();
        if (p10) {
            i12 = 16;
        } else {
            b bVar = this.f3596q;
            i12 = F(bVar.f3602a + 4 + bVar.f3603b);
        }
        b bVar2 = new b(i12, i11);
        H(this.f3597r, 0, i11);
        C(bVar2.f3602a, this.f3597r, 0, 4);
        C(bVar2.f3602a + 4, bArr, i10, i11);
        G(this.f3593n, this.f3594o + 1, p10 ? bVar2.f3602a : this.f3595p.f3602a, bVar2.f3602a);
        this.f3596q = bVar2;
        this.f3594o++;
        if (p10) {
            this.f3595p = bVar2;
        }
    }

    public synchronized void l() {
        G(4096, 0, 0, 0);
        this.f3594o = 0;
        b bVar = b.f3601c;
        this.f3595p = bVar;
        this.f3596q = bVar;
        if (this.f3593n > 4096) {
            D(4096);
        }
        this.f3593n = 4096;
    }

    public synchronized void n(d dVar) {
        int i10 = this.f3595p.f3602a;
        for (int i11 = 0; i11 < this.f3594o; i11++) {
            b t9 = t(i10);
            dVar.a(new c(this, t9, (a) null), t9.f3603b);
            i10 = F(t9.f3602a + 4 + t9.f3603b);
        }
    }

    public synchronized boolean p() {
        return this.f3594o == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f3593n);
        sb.append(", size=");
        sb.append(this.f3594o);
        sb.append(", first=");
        sb.append(this.f3595p);
        sb.append(", last=");
        sb.append(this.f3596q);
        sb.append(", element lengths=[");
        try {
            n(new a(sb));
        } catch (IOException e10) {
            f3591s.log(Level.WARNING, "read error", e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void z() {
        if (p()) {
            throw new NoSuchElementException();
        } else if (this.f3594o == 1) {
            l();
        } else {
            b bVar = this.f3595p;
            int F = F(bVar.f3602a + 4 + bVar.f3603b);
            A(F, this.f3597r, 0, 4);
            int w9 = w(this.f3597r, 0);
            G(this.f3593n, this.f3594o - 1, F, this.f3596q.f3602a);
            this.f3594o--;
            this.f3595p = new b(F, w9);
        }
    }
}
