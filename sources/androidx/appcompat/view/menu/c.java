package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import f.g;
import java.util.ArrayList;

public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: m  reason: collision with root package name */
    Context f508m;

    /* renamed from: n  reason: collision with root package name */
    LayoutInflater f509n;

    /* renamed from: o  reason: collision with root package name */
    e f510o;

    /* renamed from: p  reason: collision with root package name */
    ExpandedMenuView f511p;

    /* renamed from: q  reason: collision with root package name */
    int f512q;

    /* renamed from: r  reason: collision with root package name */
    int f513r;

    /* renamed from: s  reason: collision with root package name */
    int f514s;

    /* renamed from: t  reason: collision with root package name */
    private j.a f515t;

    /* renamed from: u  reason: collision with root package name */
    a f516u;

    private class a extends BaseAdapter {

        /* renamed from: m  reason: collision with root package name */
        private int f517m = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            g v9 = c.this.f510o.v();
            if (v9 != null) {
                ArrayList<g> z9 = c.this.f510o.z();
                int size = z9.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z9.get(i10) == v9) {
                        this.f517m = i10;
                        return;
                    }
                }
            }
            this.f517m = -1;
        }

        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z9 = c.this.f510o.z();
            int i11 = i10 + c.this.f512q;
            int i12 = this.f517m;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z9.get(i11);
        }

        public int getCount() {
            int size = c.this.f510o.z().size() - c.this.f512q;
            return this.f517m < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f509n.inflate(cVar.f514s, viewGroup, false);
            }
            ((k.a) view).e(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.f514s = i10;
        this.f513r = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f508m = context;
        this.f509n = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f516u == null) {
            this.f516u = new a();
        }
        return this.f516u;
    }

    public void b(e eVar, boolean z9) {
        j.a aVar = this.f515t;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f511p == null) {
            this.f511p = (ExpandedMenuView) this.f509n.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f516u == null) {
                this.f516u = new a();
            }
            this.f511p.setAdapter(this.f516u);
            this.f511p.setOnItemClickListener(this);
        }
        return this.f511p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f513r
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f513r
            r0.<init>(r3, r1)
            r2.f508m = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f509n = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f508m
            if (r0 == 0) goto L_0x0023
            r2.f508m = r3
            android.view.LayoutInflater r0 = r2.f509n
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f510o = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f516u
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.d(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    public boolean e(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d((IBinder) null);
        j.a aVar = this.f515t;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    public void f(boolean z9) {
        a aVar = this.f516u;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public void k(j.a aVar) {
        this.f515t = aVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f510o.M(this.f516u.getItem(i10), this, 0);
    }
}
