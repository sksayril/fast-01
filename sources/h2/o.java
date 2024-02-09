package h2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class o {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f9236a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f9237b;

        /* synthetic */ a(Object obj, v0 v0Var) {
            p.j(obj);
            this.f9237b = obj;
        }

        public a a(String str, Object obj) {
            List list = this.f9236a;
            p.j(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f9237b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f9236a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f9236a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, (v0) null);
    }
}
