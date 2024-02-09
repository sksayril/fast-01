package v0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.z;
import java.util.ArrayList;
import java.util.List;
import v0.l;

public class e extends z {

    class a extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f12602a;

        a(Rect rect) {
            this.f12602a = rect;
        }
    }

    class b implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f12604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12605b;

        b(View view, ArrayList arrayList) {
            this.f12604a = view;
            this.f12605b = arrayList;
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
            lVar.V(this);
            this.f12604a.setVisibility(8);
            int size = this.f12605b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f12605b.get(i10)).setVisibility(0);
            }
        }

        public void d(l lVar) {
        }
    }

    class c implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f12607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f12608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f12609c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f12610d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f12611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f12612f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12607a = obj;
            this.f12608b = arrayList;
            this.f12609c = obj2;
            this.f12610d = arrayList2;
            this.f12611e = obj3;
            this.f12612f = arrayList3;
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
        }

        public void d(l lVar) {
            Object obj = this.f12607a;
            if (obj != null) {
                e.this.q(obj, this.f12608b, (ArrayList<View>) null);
            }
            Object obj2 = this.f12609c;
            if (obj2 != null) {
                e.this.q(obj2, this.f12610d, (ArrayList<View>) null);
            }
            Object obj3 = this.f12611e;
            if (obj3 != null) {
                e.this.q(obj3, this.f12612f, (ArrayList<View>) null);
            }
        }
    }

    class d extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f12614a;

        d(Rect rect) {
            this.f12614a = rect;
        }
    }

    private static boolean C(l lVar) {
        return !z.l(lVar.F()) || !z.l(lVar.G()) || !z.l(lVar.H());
    }

    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.I().clear();
            pVar.I().addAll(arrayList2);
            q(pVar, arrayList, arrayList2);
        }
    }

    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.k0((l) obj);
        return pVar;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar != null) {
            int i10 = 0;
            if (lVar instanceof p) {
                p pVar = (p) lVar;
                int m02 = pVar.m0();
                while (i10 < m02) {
                    b(pVar.l0(i10), arrayList);
                    i10++;
                }
            } else if (!C(lVar) && z.l(lVar.I())) {
                int size = arrayList.size();
                while (i10 < size) {
                    lVar.d(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof l;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().k0(lVar).k0(lVar2).r0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.k0(lVar);
        }
        pVar.k0(lVar3);
        return pVar;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.k0((l) obj);
        }
        if (obj2 != null) {
            pVar.k0((l) obj2);
        }
        if (obj3 != null) {
            pVar.k0((l) obj3);
        }
        return pVar;
    }

    public void p(Object obj, View view) {
        if (obj != null) {
            ((l) obj).W(view);
        }
    }

    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int m02 = pVar.m0();
            while (i10 < m02) {
                q(pVar.l0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!C(lVar)) {
            List<View> I = lVar.I();
            if (I.size() == arrayList.size() && I.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size) {
                    lVar.d(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.W(arrayList.get(size2));
                }
            }
        }
    }

    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).b(new b(view, arrayList));
    }

    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).b0(new d(rect));
        }
    }

    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((l) obj).b0(new a(rect));
        }
    }

    public void z(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> I = pVar.I();
        I.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.d(I, arrayList.get(i10));
        }
        I.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }
}
