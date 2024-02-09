package s6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

class q implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f12299a;

    /* renamed from: b  reason: collision with root package name */
    final int f12300b;

    /* renamed from: c  reason: collision with root package name */
    final int f12301c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<k> f12302d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Set<m> f12303e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Set<m> f12304f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, m> f12305g = new HashMap();

    q(String str, int i10, int i11) {
        this.f12299a = str;
        this.f12300b = i10;
        this.f12301c = i11;
    }

    private synchronized k f(m mVar) {
        k kVar;
        ListIterator listIterator = this.f12302d.listIterator();
        while (true) {
            m mVar2 = null;
            if (!listIterator.hasNext()) {
                return null;
            }
            kVar = (k) listIterator.next();
            if (kVar.a() != null) {
                mVar2 = this.f12305g.get(kVar.a());
            }
            if (mVar2 == null || mVar2 == mVar) {
                listIterator.remove();
            }
        }
        listIterator.remove();
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void g(m mVar) {
        HashSet<m> hashSet = new HashSet<>(this.f12303e);
        this.f12304f.remove(mVar);
        this.f12303e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f12305g.remove(mVar.d());
        }
        i(mVar);
        for (m i10 : hashSet) {
            i(i10);
        }
    }

    private synchronized void i(m mVar) {
        k f10 = f(mVar);
        if (f10 != null) {
            this.f12304f.add(mVar);
            this.f12303e.remove(mVar);
            if (f10.a() != null) {
                this.f12305g.put(f10.a(), mVar);
            }
            mVar.e(f10);
        }
    }

    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    public synchronized void b(k kVar) {
        this.f12302d.add(kVar);
        for (m i10 : new HashSet(this.f12303e)) {
            i(i10);
        }
    }

    public synchronized void c() {
        for (m f10 : this.f12303e) {
            f10.f();
        }
        for (m f11 : this.f12304f) {
            f11.f();
        }
    }

    /* access modifiers changed from: protected */
    public m e(String str, int i10) {
        return new m(str, i10);
    }

    public synchronized void start() {
        for (int i10 = 0; i10 < this.f12300b; i10++) {
            m e10 = e(this.f12299a + i10, this.f12301c);
            e10.g(new p(this, e10));
            this.f12303e.add(e10);
        }
    }
}
