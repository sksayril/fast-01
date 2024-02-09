package h5;

import com.google.gson.k;
import i5.n;
import java.io.Writer;
import n5.c;

public final class l {

    private static final class a extends Writer {

        /* renamed from: m  reason: collision with root package name */
        private final Appendable f9370m;

        /* renamed from: n  reason: collision with root package name */
        private final C0145a f9371n = new C0145a();

        /* renamed from: h5.l$a$a  reason: collision with other inner class name */
        static class C0145a implements CharSequence {

            /* renamed from: m  reason: collision with root package name */
            char[] f9372m;

            C0145a() {
            }

            public char charAt(int i10) {
                return this.f9372m[i10];
            }

            public int length() {
                return this.f9372m.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f9372m, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f9370m = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i10) {
            this.f9370m.append((char) i10);
        }

        public void write(char[] cArr, int i10, int i11) {
            C0145a aVar = this.f9371n;
            aVar.f9372m = cArr;
            this.f9370m.append(aVar, i10, i11 + i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.l((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.m.f7529a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' n5.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.k a(n5.a r2) {
        /*
            r2.G()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.w<com.google.gson.k> r1 = i5.n.U     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.c(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.k r2 = (com.google.gson.k) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.s r0 = new com.google.gson.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.l r0 = new com.google.gson.l
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.s r0 = new com.google.gson.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.m r2 = com.google.gson.m.f7529a
            return r2
        L_0x002b:
            com.google.gson.s r0 = new com.google.gson.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.l.a(n5.a):com.google.gson.k");
    }

    public static void b(k kVar, c cVar) {
        n.U.e(cVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
