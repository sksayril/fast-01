package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import f.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f2824a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2825b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f2826c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f2827d;

    /* renamed from: e  reason: collision with root package name */
    private final File f2828e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2829f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2830g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2831h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2832i = false;

    /* renamed from: j  reason: collision with root package name */
    private d[] f2833j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f2834k;

    public c(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f2824a = assetManager;
        this.f2825b = executor;
        this.f2826c = cVar;
        this.f2829f = str;
        this.f2830g = str2;
        this.f2831h = str3;
        this.f2828e = file;
        this.f2827d = d();
    }

    private c b(d[] dVarArr, byte[] bArr) {
        i.c cVar;
        int i10;
        InputStream h10;
        try {
            h10 = h(this.f2824a, this.f2831h);
            if (h10 != null) {
                this.f2833j = n.q(h10, n.o(h10, n.f2856b), bArr, dVarArr);
                h10.close();
                return this;
            }
            if (h10 != null) {
                h10.close();
            }
            return null;
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f2826c;
            i10 = 9;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f2826c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f2833j = null;
            cVar = this.f2826c;
            i10 = 8;
            cVar.b(i10, e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private void c() {
        if (!this.f2832i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return null;
        }
        switch (i10) {
            case j.f8667p3 /*24*/:
            case 25:
                return p.f2871e;
            case 26:
                return p.f2870d;
            case 27:
                return p.f2869c;
            case 28:
            case j.f8692u3 /*29*/:
            case 30:
                return p.f2868b;
            case 31:
            case 32:
            case 33:
                return p.f2867a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        int i10;
        i.c cVar;
        try {
            return h(assetManager, this.f2830g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f2826c;
            i10 = 6;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f2826c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f2826c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2826c.a(5, (Object) null);
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            d[] w9 = n.w(inputStream, n.o(inputStream, n.f2855a), this.f2829f);
            try {
                inputStream.close();
                return w9;
            } catch (IOException e10) {
                this.f2826c.b(7, e10);
                return w9;
            }
        } catch (IOException e11) {
            this.f2826c.b(7, e11);
            inputStream.close();
            return null;
        } catch (IllegalStateException e12) {
            this.f2826c.b(8, e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f2826c.b(7, e13);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f2826c.b(7, e14);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return false;
        }
        if (!(i10 == 24 || i10 == 25)) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(int i10, Object obj) {
        this.f2825b.execute(new b(this, i10, obj));
    }

    public boolean e() {
        int i10;
        Integer num;
        if (this.f2827d == null) {
            i10 = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (!this.f2828e.canWrite()) {
            i10 = 4;
            num = null;
        } else {
            this.f2832i = true;
            return true;
        }
        l(i10, num);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f2827d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.c i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f2827d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f2824a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            androidx.profileinstaller.d[] r0 = r2.j(r0)
            r2.f2833j = r0
        L_0x0016:
            androidx.profileinstaller.d[] r0 = r2.f2833j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f2827d
            androidx.profileinstaller.c r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.i():androidx.profileinstaller.c");
    }

    public c m() {
        int i10;
        i.c cVar;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f2833j;
        byte[] bArr = this.f2827d;
        if (!(dVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                n.E(byteArrayOutputStream, bArr);
                if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f2826c.b(5, (Object) null);
                    this.f2833j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f2834k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f2833j = null;
            } catch (IOException e10) {
                e = e10;
                cVar = this.f2826c;
                i10 = 7;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f2826c;
                i10 = 8;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        cVar.b(i10, e);
        this.f2833j = null;
        return this;
        throw th;
    }

    public boolean n() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f2834k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f2828e);
                e.l(byteArrayInputStream, fileOutputStream);
                l(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f2834k = null;
                this.f2833j = null;
                return true;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f2834k = null;
            this.f2833j = null;
            return false;
        } catch (IOException e11) {
            try {
                l(7, e11);
                this.f2834k = null;
                this.f2833j = null;
                return false;
            } catch (Throwable th2) {
                this.f2834k = null;
                this.f2833j = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}
