package p3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class d {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f11858a;

        /* renamed from: b  reason: collision with root package name */
        private final C0199b f11859b;

        /* renamed from: c  reason: collision with root package name */
        private C0199b f11860c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11861d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11862e;

        private static final class a extends C0199b {
        }

        /* renamed from: p3.d$b$b  reason: collision with other inner class name */
        private static class C0199b {

            /* renamed from: a  reason: collision with root package name */
            String f11863a;

            /* renamed from: b  reason: collision with root package name */
            Object f11864b;

            /* renamed from: c  reason: collision with root package name */
            C0199b f11865c;

            private C0199b() {
            }
        }

        private b(String str) {
            C0199b bVar = new C0199b();
            this.f11859b = bVar;
            this.f11860c = bVar;
            this.f11861d = false;
            this.f11862e = false;
            this.f11858a = (String) h.i(str);
        }

        private C0199b a() {
            C0199b bVar = new C0199b();
            this.f11860c.f11865c = bVar;
            this.f11860c = bVar;
            return bVar;
        }

        private b b(Object obj) {
            a().f11864b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof g ? !((g) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        public String toString() {
            boolean z9 = this.f11861d;
            boolean z10 = this.f11862e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f11858a);
            sb.append('{');
            String str = "";
            for (C0199b bVar = this.f11859b.f11865c; bVar != null; bVar = bVar.f11865c) {
                Object obj = bVar.f11864b;
                if (!(bVar instanceof a)) {
                    if (obj == null) {
                        if (z9) {
                        }
                    } else if (z10 && d(obj)) {
                    }
                }
                sb.append(str);
                String str2 = bVar.f11863a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
