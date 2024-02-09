package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

class n {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f2855a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f2856b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int j10 = e.j(inputStream);
        if (j10 != 6 && j10 != 7) {
            while (j10 > 0) {
                e.j(inputStream);
                for (int j11 = e.j(inputStream); j11 > 0; j11--) {
                    e.h(inputStream);
                }
                j10--;
            }
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, p.f2867a)) {
            N(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f2868b)) {
            M(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f2870d)) {
            K(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f2869c)) {
            L(outputStream, dVarArr);
            return true;
        } else if (!Arrays.equals(bArr, p.f2871e)) {
            return false;
        } else {
            J(outputStream, dVarArr);
            return true;
        }
    }

    private static void C(OutputStream outputStream, d dVar) {
        int i10 = 0;
        for (int valueOf : dVar.f2842h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            e.p(outputStream, valueOf2.intValue() - i10);
            i10 = valueOf2.intValue();
        }
    }

    private static q D(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i10 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f2837c);
                e.q(byteArrayOutputStream, dVar.f2838d);
                e.q(byteArrayOutputStream, (long) dVar.f2841g);
                String j10 = j(dVar.f2835a, dVar.f2836b, p.f2867a);
                int k10 = e.k(j10);
                e.p(byteArrayOutputStream, k10);
                i10 = i10 + 4 + 4 + 4 + 2 + (k10 * 1);
                e.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                q qVar = new q(f.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f2855a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f2839e);
        e.q(outputStream, (long) dVar.f2840f);
        e.q(outputStream, dVar.f2837c);
        e.q(outputStream, (long) dVar.f2841g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) {
        byte[] bArr = new byte[k(dVar.f2841g)];
        for (Map.Entry next : dVar.f2843i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) {
        int i10 = 0;
        for (Map.Entry next : dVar.f2843i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, intValue - i10);
                e.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f2835a, dVar.f2836b, p.f2871e);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f2843i.size());
            e.p(outputStream, dVar.f2842h.length);
            e.q(outputStream, dVar.f2837c);
            e.n(outputStream, j10);
            for (Integer intValue : dVar.f2843i.keySet()) {
                e.p(outputStream, intValue.intValue());
            }
            for (int p10 : dVar.f2842h) {
                e.p(outputStream, p10);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f2835a, dVar.f2836b, p.f2870d);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f2842h.length);
            e.q(outputStream, (long) (dVar.f2843i.size() * 4));
            e.q(outputStream, dVar.f2837c);
            e.n(outputStream, j10);
            for (Integer intValue : dVar.f2843i.keySet()) {
                e.p(outputStream, intValue.intValue());
                e.p(outputStream, 0);
            }
            for (int p10 : dVar.f2842h) {
                e.p(outputStream, p10);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, p.f2869c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, p.f2868b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) {
        int i10;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length = ((long) p.f2867a.length) + ((long) f2855a.length) + 4 + ((long) (arrayList.size() * 16));
        e.q(outputStream, (long) arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q qVar = (q) arrayList.get(i11);
            e.q(outputStream, qVar.f2874a.getValue());
            e.q(outputStream, length);
            if (qVar.f2877d) {
                byte[] bArr = qVar.f2876c;
                byte[] b10 = e.b(bArr);
                arrayList2.add(b10);
                e.q(outputStream, (long) b10.length);
                e.q(outputStream, (long) bArr.length);
                i10 = b10.length;
            } else {
                arrayList2.add(qVar.f2876c);
                e.q(outputStream, (long) qVar.f2876c.length);
                e.q(outputStream, 0);
                i10 = qVar.f2876c.length;
            }
            length += (long) i10;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            outputStream.write((byte[]) arrayList2.get(i12));
        }
    }

    private static int a(d dVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> value : dVar.f2843i.entrySet()) {
            i10 |= ((Integer) value.getValue()).intValue();
        }
        return i10;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (d dVar : dVarArr) {
            i11 += e.k(j(dVar.f2835a, dVar.f2836b, bArr)) + 16 + (dVar.f2839e * 2) + dVar.f2840f + k(dVar.f2841g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, p.f2869c)) {
            int length = dVarArr.length;
            while (i10 < length) {
                d dVar2 = dVarArr[i10];
                G(byteArrayOutputStream, dVar2, j(dVar2.f2835a, dVar2.f2836b, bArr));
                F(byteArrayOutputStream, dVar2);
                i10++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f2835a, dVar3.f2836b, bArr));
            }
            int length2 = dVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, dVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    private static q c(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < dVarArr.length) {
            try {
                d dVar = dVarArr[i10];
                e.p(byteArrayOutputStream, i10);
                e.p(byteArrayOutputStream, dVar.f2839e);
                i11 = i11 + 2 + 2 + (dVar.f2839e * 2);
                C(byteArrayOutputStream, dVar);
                i10++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            q qVar = new q(f.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw e.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static q d(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < dVarArr.length) {
            try {
                d dVar = dVarArr[i10];
                int a10 = a(dVar);
                byte[] e10 = e(dVar);
                byte[] f10 = f(dVar);
                e.p(byteArrayOutputStream, i10);
                int length = e10.length + 2 + f10.length;
                e.q(byteArrayOutputStream, (long) length);
                e.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i11 = i11 + 2 + 4 + length;
                i10++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            q qVar = new q(f.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw e.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static byte[] e(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static byte[] f(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            if (dVarArr[i10].f2836b.equals(h10)) {
                return dVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a10 = p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + p.a(bArr) + str2;
    }

    private static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    private static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        } else if (i10 == 2) {
            return i11;
        } else {
            if (i10 == 4) {
                return i11 + i12;
            }
            throw e.c("Unexpected flag: " + i10);
        }
    }

    private static int[] m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += e.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i10, int i11) {
        int i12 = 2;
        if (!bitSet.get(l(2, i10, i11))) {
            i12 = 0;
        }
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, p.f2868b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int available = inputStream.available() - dVar.f2840f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += e.h(inputStream);
            dVar.f2843i.put(Integer.valueOf(i10), 1);
            for (int h10 = e.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, p.f2872f)) {
            if (!Arrays.equals(p.f2867a, bArr2)) {
                return r(inputStream, bArr, dVarArr);
            }
            throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, p.f2873g)) {
            return t(inputStream, bArr2, dVarArr);
        } else {
            throw e.c("Unsupported meta version");
        }
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, p.f2872f)) {
            int j10 = e.j(inputStream);
            byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    d[] s9 = s(byteArrayInputStream, j10, dVarArr);
                    byteArrayInputStream.close();
                    return s9;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw e.c("Content found after the end of file");
            }
        } else {
            throw e.c("Unsupported meta version");
        }
        throw th;
    }

    private static d[] s(InputStream inputStream, int i10, d[] dVarArr) {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 == dVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                int h10 = e.h(inputStream);
                iArr[i12] = e.h(inputStream);
                strArr[i12] = e.f(inputStream, h10);
            }
            while (i11 < i10) {
                d dVar = dVarArr[i11];
                if (dVar.f2836b.equals(strArr[i11])) {
                    int i13 = iArr[i11];
                    dVar.f2839e = i13;
                    dVar.f2842h = m(inputStream, i13);
                    i11++;
                } else {
                    throw e.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        int h10 = e.h(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
            try {
                d[] u9 = u(byteArrayInputStream, bArr, h10, dVarArr);
                byteArrayInputStream.close();
                return u9;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw e.c("Content found after the end of file");
        }
        throw th;
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i10, d[] dVarArr) {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 == dVarArr.length) {
            while (i11 < i10) {
                e.h(inputStream);
                String f10 = e.f(inputStream, e.h(inputStream));
                long i12 = e.i(inputStream);
                int h10 = e.h(inputStream);
                d i13 = i(dVarArr, f10);
                if (i13 != null) {
                    i13.f2838d = i12;
                    int[] m10 = m(inputStream, h10);
                    if (Arrays.equals(bArr, p.f2871e)) {
                        i13.f2839e = h10;
                        i13.f2842h = m10;
                    }
                    i11++;
                } else {
                    throw e.c("Missing profile key: " + f10);
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f2841g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = dVar.f2841g;
            if (i10 < i11) {
                int n10 = n(valueOf, i10, i11);
                if (n10 != 0) {
                    Integer num = dVar.f2843i.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    dVar.f2843i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    static d[] w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, p.f2868b)) {
            int j10 = e.j(inputStream);
            byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    d[] x9 = x(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return x9;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw e.c("Content found after the end of file");
            }
        } else {
            throw e.c("Unsupported version");
        }
        throw th;
    }

    private static d[] x(InputStream inputStream, String str, int i10) {
        InputStream inputStream2 = inputStream;
        int i11 = i10;
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = e.h(inputStream);
            int h11 = e.h(inputStream);
            long i13 = e.i(inputStream);
            long i14 = e.i(inputStream);
            long i15 = e.i(inputStream);
            String str2 = str;
            dVarArr[i12] = new d(str2, e.f(inputStream2, h10), i14, 0, h11, (int) i13, (int) i15, new int[h11], new TreeMap());
        }
        for (int i16 = 0; i16 < i11; i16++) {
            d dVar = dVarArr[i16];
            p(inputStream2, dVar);
            dVar.f2842h = m(inputStream2, dVar.f2839e);
            v(inputStream2, dVar);
        }
        return dVarArr;
    }

    private static int y(int i10) {
        return ((i10 + 8) - 1) & -8;
    }

    private static void z(byte[] bArr, int i10, int i11, d dVar) {
        int l10 = l(i10, i11, dVar.f2841g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}