package com.google.firebase.crashlytics.internal.common;

import d4.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class a0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final File f7272a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7273b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7274c;

    a0(String str, String str2, File file) {
        this.f7273b = str;
        this.f7274c = str2;
        this.f7272a = file;
    }

    private byte[] d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream a10 = a();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (a10 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (a10 != null) {
                            a10.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = a10.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            a10.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (a10 != null) {
                    a10.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public InputStream a() {
        if (this.f7272a.exists() && this.f7272a.isFile()) {
            try {
                return new FileInputStream(this.f7272a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public String b() {
        return this.f7274c;
    }

    public f0.d.b c() {
        byte[] d10 = d();
        if (d10 != null) {
            return f0.d.b.a().b(d10).c(this.f7273b).a();
        }
        return null;
    }
}
