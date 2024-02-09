package v0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import v0.l;

public class p extends l {
    private ArrayList<l> V = new ArrayList<>();
    private boolean W = true;
    int X;
    boolean Y = false;
    private int Z = 0;

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f12664a;

        a(l lVar) {
            this.f12664a = lVar;
        }

        public void c(l lVar) {
            this.f12664a.Z();
            lVar.V(this);
        }
    }

    static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        p f12666a;

        b(p pVar) {
            this.f12666a = pVar;
        }

        public void c(l lVar) {
            p pVar = this.f12666a;
            int i10 = pVar.X - 1;
            pVar.X = i10;
            if (i10 == 0) {
                pVar.Y = false;
                pVar.v();
            }
            lVar.V(this);
        }

        public void d(l lVar) {
            p pVar = this.f12666a;
            if (!pVar.Y) {
                pVar.g0();
                this.f12666a.Y = true;
            }
        }
    }

    private void t0() {
        b bVar = new b(this);
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.X = this.V.size();
    }

    public void T(View view) {
        super.T(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).T(view);
        }
    }

    public void X(View view) {
        super.X(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).X(view);
        }
    }

    /* access modifiers changed from: protected */
    public void Z() {
        if (this.V.isEmpty()) {
            g0();
            v();
            return;
        }
        t0();
        if (!this.W) {
            for (int i10 = 1; i10 < this.V.size(); i10++) {
                this.V.get(i10 - 1).b(new a(this.V.get(i10)));
            }
            l lVar = this.V.get(0);
            if (lVar != null) {
                lVar.Z();
                return;
            }
            return;
        }
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            it.next().Z();
        }
    }

    public void b0(l.e eVar) {
        super.b0(eVar);
        this.Z |= 8;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).b0(eVar);
        }
    }

    public void d0(g gVar) {
        super.d0(gVar);
        this.Z |= 4;
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            this.V.get(i10).d0(gVar);
        }
    }

    public void e0(o oVar) {
        super.e0(oVar);
        this.Z |= 2;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).e0(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String h0(String str) {
        String h02 = super.h0(str);
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(h02);
            sb.append("\n");
            sb.append(this.V.get(i10).h0(str + "  "));
            h02 = sb.toString();
        }
        return h02;
    }

    public void i(r rVar) {
        if (M(rVar.f12671b)) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.M(rVar.f12671b)) {
                    next.i(rVar);
                    rVar.f12672c.add(next);
                }
            }
        }
    }

    /* renamed from: i0 */
    public p b(l.f fVar) {
        return (p) super.b(fVar);
    }

    /* renamed from: j0 */
    public p d(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            this.V.get(i10).d(view);
        }
        return (p) super.d(view);
    }

    public p k0(l lVar) {
        this.V.add(lVar);
        lVar.D = this;
        long j10 = this.f12637o;
        if (j10 >= 0) {
            lVar.a0(j10);
        }
        if ((this.Z & 1) != 0) {
            lVar.c0(y());
        }
        if ((this.Z & 2) != 0) {
            C();
            lVar.e0((o) null);
        }
        if ((this.Z & 4) != 0) {
            lVar.d0(B());
        }
        if ((this.Z & 8) != 0) {
            lVar.b0(x());
        }
        return this;
    }

    public l l0(int i10) {
        if (i10 < 0 || i10 >= this.V.size()) {
            return null;
        }
        return this.V.get(i10);
    }

    public int m0() {
        return this.V.size();
    }

    /* access modifiers changed from: package-private */
    public void n(r rVar) {
        super.n(rVar);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.V.get(i10).n(rVar);
        }
    }

    /* renamed from: n0 */
    public p V(l.f fVar) {
        return (p) super.V(fVar);
    }

    /* renamed from: o0 */
    public p W(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            this.V.get(i10).W(view);
        }
        return (p) super.W(view);
    }

    public void p(r rVar) {
        if (M(rVar.f12671b)) {
            Iterator<l> it = this.V.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.M(rVar.f12671b)) {
                    next.p(rVar);
                    rVar.f12672c.add(next);
                }
            }
        }
    }

    /* renamed from: p0 */
    public p a0(long j10) {
        super.a0(j10);
        if (this.f12637o >= 0) {
            int size = this.V.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).a0(j10);
            }
        }
        return this;
    }

    /* renamed from: q0 */
    public p c0(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList<l> arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.V.get(i10).c0(timeInterpolator);
            }
        }
        return (p) super.c0(timeInterpolator);
    }

    public p r0(int i10) {
        if (i10 == 0) {
            this.W = true;
        } else if (i10 == 1) {
            this.W = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: s */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.V = new ArrayList<>();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.k0(this.V.get(i10).clone());
        }
        return pVar;
    }

    /* renamed from: s0 */
    public p f0(long j10) {
        return (p) super.f0(j10);
    }

    /* access modifiers changed from: protected */
    public void u(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long E = E();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.V.get(i10);
            if (E > 0 && (this.W || i10 == 0)) {
                long E2 = lVar.E();
                if (E2 > 0) {
                    lVar.f0(E2 + E);
                } else {
                    lVar.f0(E);
                }
            }
            lVar.u(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }
}
