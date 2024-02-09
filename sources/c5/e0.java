package c5;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import t3.c;
import t3.m;

public final class e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final b f3711f = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final k0 f3712a;

    /* renamed from: b  reason: collision with root package name */
    private final r8.a<UUID> f3713b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3714c;

    /* renamed from: d  reason: collision with root package name */
    private int f3715d;

    /* renamed from: e  reason: collision with root package name */
    private z f3716e;

    /* synthetic */ class a extends j implements r8.a<UUID> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f3717m = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        /* renamed from: d */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final e0 a() {
            Object k10 = m.a(c.f12403a).k(e0.class);
            l.d(k10, "Firebase.app[SessionGenerator::class.java]");
            return (e0) k10;
        }
    }

    public e0(k0 k0Var, r8.a<UUID> aVar) {
        l.e(k0Var, "timeProvider");
        l.e(aVar, "uuidGenerator");
        this.f3712a = k0Var;
        this.f3713b = aVar;
        this.f3714c = b();
        this.f3715d = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(k0 k0Var, r8.a aVar, int i10, g gVar) {
        this(k0Var, (i10 & 2) != 0 ? a.f3717m : aVar);
    }

    private final String b() {
        String uuid = this.f3713b.invoke().toString();
        l.d(uuid, "uuidGenerator().toString()");
        String lowerCase = o.p(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        l.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z a() {
        int i10 = this.f3715d + 1;
        this.f3715d = i10;
        this.f3716e = new z(i10 == 0 ? this.f3714c : b(), this.f3714c, this.f3715d, this.f3712a.a());
        return c();
    }

    public final z c() {
        z zVar = this.f3716e;
        if (zVar != null) {
            return zVar;
        }
        l.p("currentSession");
        return null;
    }
}
