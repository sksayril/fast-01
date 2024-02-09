package c4;

import c4.g;
import com.google.firebase.crashlytics.internal.common.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class h implements c {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f3607d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final File f3608a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3609b;

    /* renamed from: c  reason: collision with root package name */
    private g f3610c;

    class a implements g.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f3611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f3612b;

        a(byte[] bArr, int[] iArr) {
            this.f3611a = bArr;
            this.f3612b = iArr;
        }

        public void a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f3611a, this.f3612b[0], i10);
                int[] iArr = this.f3612b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f3614a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3615b;

        b(byte[] bArr, int i10) {
            this.f3614a = bArr;
            this.f3615b = i10;
        }
    }

    h(File file, int i10) {
        this.f3608a = file;
        this.f3609b = i10;
    }

    private void f(long j10, String str) {
        if (this.f3610c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i10 = this.f3609b / 4;
                if (str.length() > i10) {
                    str = "..." + str.substring(str.length() - i10);
                }
                this.f3610c.h(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f3607d));
                while (!this.f3610c.p() && this.f3610c.E() > this.f3609b) {
                    this.f3610c.z();
                }
            } catch (IOException e10) {
                z3.g.f().e("There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }

    private b g() {
        if (!this.f3608a.exists()) {
            return null;
        }
        h();
        g gVar = this.f3610c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.E()];
        try {
            this.f3610c.n(new a(bArr, iArr));
        } catch (IOException e10) {
            z3.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f3610c == null) {
            try {
                this.f3610c = new g(this.f3608a);
            } catch (IOException e10) {
                z3.g f10 = z3.g.f();
                f10.e("Could not open log file: " + this.f3608a, e10);
            }
        }
    }

    public void a() {
        i.f(this.f3610c, "There was a problem closing the Crashlytics log file.");
        this.f3610c = null;
    }

    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f3607d);
        }
        return null;
    }

    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f3615b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f3614a, 0, bArr, 0, i10);
        return bArr;
    }

    public void d() {
        a();
        this.f3608a.delete();
    }

    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
