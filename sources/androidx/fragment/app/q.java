package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class q extends b0 {

    /* renamed from: k  reason: collision with root package name */
    private static final c0.b f2561k = new a();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f2562d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, q> f2563e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, f0> f2564f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2565g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2566h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2567i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2568j = false;

    class a implements c0.b {
        a() {
        }

        public <T extends b0> T a(Class<T> cls) {
            return new q(true);
        }

        public /* synthetic */ b0 b(Class cls, j0.a aVar) {
            return d0.b(this, cls, aVar);
        }
    }

    q(boolean z9) {
        this.f2565g = z9;
    }

    static q i(f0 f0Var) {
        return (q) new c0(f0Var, f2561k).a(q.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2566h = true;
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (this.f2568j) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f2562d.containsKey(fragment.f2320r)) {
            this.f2562d.put(fragment.f2320r, fragment);
            if (n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2562d.equals(qVar.f2562d) && this.f2563e.equals(qVar.f2563e) && this.f2564f.equals(qVar.f2564f);
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f2563e.get(fragment.f2320r);
        if (qVar != null) {
            qVar.d();
            this.f2563e.remove(fragment.f2320r);
        }
        f0 f0Var = this.f2564f.get(fragment.f2320r);
        if (f0Var != null) {
            f0Var.a();
            this.f2564f.remove(fragment.f2320r);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment g(String str) {
        return this.f2562d.get(str);
    }

    /* access modifiers changed from: package-private */
    public q h(Fragment fragment) {
        q qVar = this.f2563e.get(fragment.f2320r);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f2565g);
        this.f2563e.put(fragment.f2320r, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f2562d.hashCode() * 31) + this.f2563e.hashCode()) * 31) + this.f2564f.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> j() {
        return new ArrayList(this.f2562d.values());
    }

    /* access modifiers changed from: package-private */
    public f0 k(Fragment fragment) {
        f0 f0Var = this.f2564f.get(fragment.f2320r);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0();
        this.f2564f.put(fragment.f2320r, f0Var2);
        return f0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f2566h;
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        if (!this.f2568j) {
            if ((this.f2562d.remove(fragment.f2320r) != null) && n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (n.E0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    public void n(boolean z9) {
        this.f2568j = z9;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        if (!this.f2562d.containsKey(fragment.f2320r)) {
            return true;
        }
        return this.f2565g ? this.f2566h : !this.f2567i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2562d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2563e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2564f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
