package d4;

import com.google.auto.value.AutoValue;
import z3.f;

@AutoValue
public abstract class g0 {

    @AutoValue
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i10, f fVar) {
            return new c0(str, str2, str3, str4, i10, fVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    @AutoValue
    public static abstract class b {
        public static b c(int i10, String str, int i11, long j10, long j11, boolean z9, int i12, String str2, String str3) {
            return new d0(i10, str, i11, j10, j11, z9, i12, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    @AutoValue
    public static abstract class c {
        public static c a(String str, String str2, boolean z9) {
            return new e0(str, str2, z9);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static g0 b(a aVar, c cVar, b bVar) {
        return new b0(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
