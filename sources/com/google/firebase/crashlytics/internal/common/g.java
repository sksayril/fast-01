package com.google.firebase.crashlytics.internal.common;

import d4.f0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class g implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7294a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7295b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7296c;

    g(String str, String str2, byte[] bArr) {
        this.f7295b = str;
        this.f7296c = str2;
        this.f7294a = bArr;
    }

    private byte[] d() {
        GZIPOutputStream gZIPOutputStream;
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f7294a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private boolean e() {
        byte[] bArr = this.f7294a;
        return bArr == null || bArr.length == 0;
    }

    public InputStream a() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f7294a);
    }

    public String b() {
        return this.f7296c;
    }

    public f0.d.b c() {
        byte[] d10 = d();
        if (d10 == null) {
            return null;
        }
        return f0.d.b.a().b(d10).c(this.f7295b).a();
    }
}
