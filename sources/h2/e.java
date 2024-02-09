package h2;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Account f9149a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f9150b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f9151c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f9152d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9153e;

    /* renamed from: f  reason: collision with root package name */
    private final View f9154f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9155g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9156h;

    /* renamed from: i  reason: collision with root package name */
    private final b3.a f9157i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f9158j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f9159a;

        /* renamed from: b  reason: collision with root package name */
        private b f9160b;

        /* renamed from: c  reason: collision with root package name */
        private String f9161c;

        /* renamed from: d  reason: collision with root package name */
        private String f9162d;

        /* renamed from: e  reason: collision with root package name */
        private b3.a f9163e = b3.a.f3388k;

        public e a() {
            return new e(this.f9159a, this.f9160b, (Map) null, 0, (View) null, this.f9161c, this.f9162d, this.f9163e, false);
        }

        public a b(String str) {
            this.f9161c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f9160b == null) {
                this.f9160b = new b();
            }
            this.f9160b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f9159a = account;
            return this;
        }

        public final a e(String str) {
            this.f9162d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, b3.a aVar, boolean z9) {
        this.f9149a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f9150b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f9152d = map;
        this.f9154f = view;
        this.f9153e = i10;
        this.f9155g = str;
        this.f9156h = str2;
        this.f9157i = aVar == null ? b3.a.f3388k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (b0 b0Var : map.values()) {
            hashSet.addAll(b0Var.f9107a);
        }
        this.f9151c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f9149a;
    }

    public Account b() {
        Account account = this.f9149a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f9151c;
    }

    public String d() {
        return this.f9155g;
    }

    public Set<Scope> e() {
        return this.f9150b;
    }

    public final b3.a f() {
        return this.f9157i;
    }

    public final Integer g() {
        return this.f9158j;
    }

    public final String h() {
        return this.f9156h;
    }

    public final void i(Integer num) {
        this.f9158j = num;
    }
}
