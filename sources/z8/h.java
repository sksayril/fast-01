package z8;

import f.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import r8.l;

class h extends g {

    static final class a extends m implements l<String, String> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f13632m = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(String str) {
            kotlin.jvm.internal.l.e(str, "line");
            return str;
        }
    }

    static final class b extends m implements l<String, String> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f13633m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f13633m = str;
        }

        /* renamed from: b */
        public final String invoke(String str) {
            kotlin.jvm.internal.l.e(str, "line");
            return this.f13633m + str;
        }
    }

    private static final l<String, String> b(String str) {
        return str.length() == 0 ? a.f13632m : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String invoke;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "newIndent");
        List<String> L = p.L(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : L) {
            if (!o.k((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(o.i(arrayList, 10));
        for (String c10 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c10)));
        }
        Integer num = (Integer) v.t(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * L.size());
        l<String, String> b10 = b(str2);
        int d10 = n.d(L);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : L) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                n.h();
            }
            String str3 = (String) next2;
            if ((i10 == 0 || i10 == d10) && o.k(str3)) {
                str3 = null;
            } else {
                String o02 = r.o0(str3, intValue);
                if (!(o02 == null || (invoke = b10.invoke(o02)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb = ((StringBuilder) v.p(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, j.K0, (Object) null)).toString();
        kotlin.jvm.internal.l.d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return d(str, "");
    }
}
