package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

class NamespaceRemovingInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private final byte[] f4752m = new byte[200];

    /* renamed from: n  reason: collision with root package name */
    private boolean f4753n = false;

    private static final class StringPrefixSlicer {

        /* renamed from: a  reason: collision with root package name */
        private String f4754a;

        public StringPrefixSlicer(String str) {
            this.f4754a = str;
        }

        public String a() {
            return this.f4754a;
        }

        public boolean b(String str) {
            if (!this.f4754a.startsWith(str)) {
                return false;
            }
            this.f4754a = this.f4754a.substring(str.length());
            return true;
        }

        public boolean c(String str) {
            int indexOf = this.f4754a.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            this.f4754a = this.f4754a.substring(indexOf + str.length());
            return true;
        }

        public boolean d(String str) {
            if (!this.f4754a.startsWith(str)) {
                return false;
            }
            while (this.f4754a.startsWith(str)) {
                this.f4754a = this.f4754a.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
    }

    private int g(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.b("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.d(" ");
        if (!stringPrefixSlicer.b("=")) {
            return -1;
        }
        stringPrefixSlicer.d(" ");
        if (stringPrefixSlicer.b("\"") && stringPrefixSlicer.c("\"")) {
            return str.length() - stringPrefixSlicer.a().length();
        }
        return -1;
    }

    public int read() {
        e();
        int read = this.in.read();
        if (read != 120 || this.f4753n) {
            return read;
        }
        this.f4752m[0] = (byte) read;
        this.in.mark(this.f4752m.length);
        InputStream inputStream = this.in;
        byte[] bArr = this.f4752m;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        this.in.reset();
        int g10 = g(new String(this.f4752m, 0, read2 + 1, StringUtils.f4756a));
        if (g10 <= 0) {
            return read;
        }
        for (int i10 = 0; i10 < g10 - 1; i10++) {
            this.in.read();
        }
        int read3 = this.in.read();
        this.f4753n = true;
        return read3;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int read = read();
            if (read != -1) {
                bArr[i12 + i10] = (byte) read;
                i12++;
            } else if (i12 == 0) {
                return -1;
            } else {
                return i12;
            }
        }
        return i11;
    }
}
