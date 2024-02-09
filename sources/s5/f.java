package s5;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o5.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f12184a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    static final Set<a> f12185b;

    /* renamed from: c  reason: collision with root package name */
    static final Set<a> f12186c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<a> f12187d;

    /* renamed from: e  reason: collision with root package name */
    static final Set<a> f12188e;

    /* renamed from: f  reason: collision with root package name */
    static final Set<a> f12189f;

    /* renamed from: g  reason: collision with root package name */
    static final Set<a> f12190g;

    /* renamed from: h  reason: collision with root package name */
    static final Set<a> f12191h;

    /* renamed from: i  reason: collision with root package name */
    private static final Map<String, Set<a>> f12192i;

    static {
        EnumSet of = EnumSet.of(a.QR_CODE);
        f12188e = of;
        EnumSet of2 = EnumSet.of(a.DATA_MATRIX);
        f12189f = of2;
        EnumSet of3 = EnumSet.of(a.AZTEC);
        f12190g = of3;
        EnumSet of4 = EnumSet.of(a.PDF_417);
        f12191h = of4;
        EnumSet of5 = EnumSet.of(a.UPC_A, new a[]{a.UPC_E, a.EAN_13, a.EAN_8, a.RSS_14, a.RSS_EXPANDED});
        f12185b = of5;
        EnumSet of6 = EnumSet.of(a.CODE_39, a.CODE_93, a.CODE_128, a.ITF, a.CODABAR);
        f12186c = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        f12187d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f12192i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }

    public static Set<a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f12184a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f12192i.get(str);
        }
        return null;
    }
}
