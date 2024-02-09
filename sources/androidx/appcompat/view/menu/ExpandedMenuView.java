package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.a1;

public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f458o = {16842964, 16843049};

    /* renamed from: m  reason: collision with root package name */
    private e f459m;

    /* renamed from: n  reason: collision with root package name */
    private int f460n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a1 u9 = a1.u(context, attributeSet, f458o, i10, 0);
        if (u9.r(0)) {
            setBackgroundDrawable(u9.f(0));
        }
        if (u9.r(1)) {
            setDivider(u9.f(1));
        }
        u9.v();
    }

    public boolean a(g gVar) {
        return this.f459m.L(gVar, 0);
    }

    public void b(e eVar) {
        this.f459m = eVar;
    }

    public int getWindowAnimations() {
        return this.f460n;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((g) getAdapter().getItem(i10));
    }
}
