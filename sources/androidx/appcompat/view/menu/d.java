package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public class d extends BaseAdapter {

    /* renamed from: m  reason: collision with root package name */
    e f519m;

    /* renamed from: n  reason: collision with root package name */
    private int f520n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f521o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f522p;

    /* renamed from: q  reason: collision with root package name */
    private final LayoutInflater f523q;

    /* renamed from: r  reason: collision with root package name */
    private final int f524r;

    public d(e eVar, LayoutInflater layoutInflater, boolean z9, int i10) {
        this.f522p = z9;
        this.f523q = layoutInflater;
        this.f519m = eVar;
        this.f524r = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        g v9 = this.f519m.v();
        if (v9 != null) {
            ArrayList<g> z9 = this.f519m.z();
            int size = z9.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z9.get(i10) == v9) {
                    this.f520n = i10;
                    return;
                }
            }
        }
        this.f520n = -1;
    }

    public e b() {
        return this.f519m;
    }

    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z9 = this.f522p ? this.f519m.z() : this.f519m.E();
        int i11 = this.f520n;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z9.get(i10);
    }

    public void d(boolean z9) {
        this.f521o = z9;
    }

    public int getCount() {
        ArrayList<g> z9 = this.f522p ? this.f519m.z() : this.f519m.E();
        int i10 = this.f520n;
        int size = z9.size();
        return i10 < 0 ? size : size - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f523q.inflate(this.f524r, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f519m.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f521o) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
