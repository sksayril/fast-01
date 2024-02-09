package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class f0 {
    private static void a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            i.g(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        i.g(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i.g(gZIPOutputStream);
                throw th;
            }
        }
    }

    static void b(File file, List<e0> list) {
        for (e0 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.a();
                if (inputStream != null) {
                    a(inputStream, new File(file, next.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                i.g(inputStream);
                throw th;
            }
            i.g(inputStream);
        }
    }
}
