package p6;

import android.media.AudioRecord;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f11905a = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f11906b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f11907c = new AtomicInteger(-160);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public AudioRecord f11908d = null;

    /* renamed from: e  reason: collision with root package name */
    private C0201a f11909e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f11910f;

    /* renamed from: g  reason: collision with root package name */
    private double f11911g = -100.0d;

    /* renamed from: p6.a$a  reason: collision with other inner class name */
    private class C0201a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final String f11912m;

        /* renamed from: n  reason: collision with root package name */
        final String f11913n;

        /* renamed from: o  reason: collision with root package name */
        final int f11914o;

        /* renamed from: p  reason: collision with root package name */
        final int f11915p;

        /* renamed from: q  reason: collision with root package name */
        final short f11916q;

        /* renamed from: r  reason: collision with root package name */
        final short f11917r;

        /* renamed from: s  reason: collision with root package name */
        private int f11918s = 0;

        /* renamed from: t  reason: collision with root package name */
        CountDownLatch f11919t = new CountDownLatch(1);

        C0201a(String str, String str2, int i10, int i11, short s9, short s10) {
            this.f11912m = str;
            this.f11913n = str2;
            this.f11914o = i10;
            this.f11915p = i11;
            this.f11916q = s9;
            this.f11917r = s10;
        }

        private String b(int i10) {
            String str;
            StringBuilder sb = new StringBuilder("Reading of audio buffer failed: ");
            if (i10 == -6) {
                str = "AudioRecord.ERROR_DEAD_OBJECT";
            } else if (i10 == -3) {
                str = "AudioRecord.ERROR_INVALID_OPERATION";
            } else if (i10 == -2) {
                str = "AudioRecord.ERROR_BAD_VALUE";
            } else if (i10 != -1) {
                sb.append("Unknown (");
                sb.append(i10);
                str = ")";
            } else {
                str = "AudioRecord.ERROR";
            }
            sb.append(str);
            return sb.toString();
        }

        private void c(byte[] bArr, int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10 / 2; i12++) {
                int i13 = i12 * 2;
                int abs = Math.abs((bArr[i13 + 1] << 8) | bArr[i13]);
                if (abs > i11) {
                    i11 = abs;
                }
            }
            a.this.f11907c.set((int) (Math.log10(((double) i11) / 32768.0d) * 20.0d));
        }

        private void d(RandomAccessFile randomAccessFile) {
            randomAccessFile.seek(0);
            randomAccessFile.writeBytes("RIFF");
            randomAccessFile.writeInt(Integer.reverseBytes(this.f11918s + 36));
            randomAccessFile.writeBytes("WAVE");
            randomAccessFile.writeBytes("fmt ");
            randomAccessFile.writeInt(Integer.reverseBytes(16));
            randomAccessFile.writeShort(Short.reverseBytes(1));
            randomAccessFile.writeShort(Short.reverseBytes(this.f11916q));
            randomAccessFile.writeInt(Integer.reverseBytes(this.f11914o));
            randomAccessFile.writeInt(Integer.reverseBytes(((this.f11914o * this.f11916q) * this.f11917r) / 8));
            randomAccessFile.writeShort(Short.reverseBytes((short) ((this.f11916q * this.f11917r) / 8)));
            randomAccessFile.writeShort(Short.reverseBytes(this.f11917r));
            randomAccessFile.writeBytes("data");
            randomAccessFile.writeInt(Integer.reverseBytes(this.f11918s));
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f11919t.await();
        }

        public void run() {
            RandomAccessFile randomAccessFile;
            try {
                randomAccessFile = new RandomAccessFile(this.f11912m, "rw");
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f11915p);
                randomAccessFile.setLength(0);
                if (this.f11913n.equals("wav")) {
                    d(randomAccessFile);
                }
                while (a.this.f11905a.get()) {
                    while (a.this.f11906b.get()) {
                        SystemClock.sleep(100);
                    }
                    if (a.this.f11905a.get()) {
                        allocateDirect.clear();
                        int read = a.this.f11908d.read(allocateDirect, this.f11915p);
                        if (read < 0) {
                            throw new RuntimeException(b(read));
                        } else if (read > 0) {
                            this.f11918s += read;
                            byte[] array = allocateDirect.array();
                            c(array, read);
                            randomAccessFile.write(array, 0, read);
                        }
                    }
                }
                if (this.f11913n.equals("wav")) {
                    d(randomAccessFile);
                }
                randomAccessFile.close();
                this.f11919t.countDown();
                return;
            } catch (IOException e10) {
                try {
                    throw new RuntimeException("Writing of recorded audio failed", e10);
                } catch (Throwable th) {
                    this.f11919t.countDown();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void l() {
        C0201a aVar = this.f11909e;
        if (aVar != null) {
            try {
                aVar.a();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            } catch (Throwable th) {
                this.f11909e = null;
                throw th;
            }
            this.f11909e = null;
        }
    }

    private Integer m(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1537650642:
                if (str.equals("pcm16bit")) {
                    c10 = 0;
                    break;
                }
                break;
            case -742087249:
                if (str.equals("pcm8bit")) {
                    c10 = 1;
                    break;
                }
                break;
            case 117484:
                if (str.equals("wav")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 2;
            case 1:
                return 3;
            default:
                return null;
        }
    }

    private void n() {
        if (this.f11908d != null) {
            try {
                if (this.f11905a.get() || this.f11906b.get()) {
                    this.f11905a.set(false);
                    this.f11906b.set(false);
                    l();
                    this.f11908d.stop();
                }
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f11908d.release();
                this.f11908d = null;
                throw th;
            }
            this.f11908d.release();
            this.f11908d = null;
        }
        this.f11905a.set(false);
        this.f11906b.set(false);
        this.f11907c.set(-100);
        this.f11911g = -100.0d;
        l();
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        double d10 = (double) this.f11907c.get();
        if (d10 > this.f11911g) {
            this.f11911g = d10;
        }
        hashMap.put("current", Double.valueOf(d10));
        hashMap.put("max", Double.valueOf(this.f11911g));
        return hashMap;
    }

    public void b() {
        this.f11906b.set(true);
    }

    public void c() {
        this.f11906b.set(false);
    }

    public void close() {
        n();
    }

    public boolean d(String str) {
        return m(str) != null;
    }

    public boolean e() {
        return this.f11906b.get();
    }

    public void f(String str, String str2, int i10, int i11, int i12, Map<String, Object> map) {
        n();
        this.f11910f = str;
        Integer m10 = m(str2);
        if (m10 == null) {
            Log.d("Record - AR", "Audio format is not supported.\nFalling back to PCM 16bits");
            m10 = 2;
        }
        int min = Math.min(2, Math.max(1, i12));
        int i13 = min == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i11, i13, m10.intValue()) * 2;
        try {
            AudioRecord audioRecord = r10;
            AudioRecord audioRecord2 = new AudioRecord(0, i11, i13, m10.intValue(), minBufferSize);
            this.f11908d = audioRecord;
            this.f11905a.set(true);
            this.f11909e = new C0201a(str, str2, i11, minBufferSize, (short) min, m10.intValue() == 2 ? (short) 16 : 8);
            new Thread(this.f11909e).start();
            this.f11908d.startRecording();
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw new Exception(e10);
        }
    }

    public boolean g() {
        return this.f11905a.get();
    }

    public String stop() {
        n();
        return this.f11910f;
    }
}
