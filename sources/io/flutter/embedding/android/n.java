package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class n {

    /* renamed from: a  reason: collision with root package name */
    long f9752a;

    /* renamed from: b  reason: collision with root package name */
    a f9753b;

    /* renamed from: c  reason: collision with root package name */
    long f9754c;

    /* renamed from: d  reason: collision with root package name */
    long f9755d;

    /* renamed from: e  reason: collision with root package name */
    boolean f9756e;

    /* renamed from: f  reason: collision with root package name */
    String f9757f;

    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        
        private long value;

        private a(long j10) {
            this.value = j10;
        }

        static a fromLong(long j10) {
            int i10 = (int) j10;
            if (i10 == 0) {
                return kDown;
            }
            if (i10 == 1) {
                return kUp;
            }
            if (i10 == 2) {
                return kRepeat;
            }
            throw new AssertionError("Unexpected Type value");
        }

        public long getValue() {
            return this.value;
        }
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer a() {
        try {
            String str = this.f9757f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) length);
            allocateDirect.putLong(this.f9752a);
            allocateDirect.putLong(this.f9753b.getValue());
            allocateDirect.putLong(this.f9754c);
            allocateDirect.putLong(this.f9755d);
            allocateDirect.putLong(this.f9756e ? 1 : 0);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
