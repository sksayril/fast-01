package z8;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class e implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final a f13630n = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final Pattern f13631m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.l.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.l.d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.<init>(java.lang.String):void");
    }

    public e(Pattern pattern) {
        l.e(pattern, "nativePattern");
        this.f13631m = pattern;
    }

    public final String a(CharSequence charSequence, String str) {
        l.e(charSequence, "input");
        l.e(str, "replacement");
        String replaceAll = this.f13631m.matcher(charSequence).replaceAll(str);
        l.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f13631m.toString();
        l.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
