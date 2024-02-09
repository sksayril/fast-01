package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.e;
import androidx.core.view.x;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f583a;

    /* renamed from: b  reason: collision with root package name */
    private final e f584b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f585c;

    /* renamed from: d  reason: collision with root package name */
    private final int f586d;

    /* renamed from: e  reason: collision with root package name */
    private final int f587e;

    /* renamed from: f  reason: collision with root package name */
    private View f588f;

    /* renamed from: g  reason: collision with root package name */
    private int f589g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f590h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f591i;

    /* renamed from: j  reason: collision with root package name */
    private h f592j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f593k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f594l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z9, int i10) {
        this(context, eVar, view, z9, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z9, int i10, int i11) {
        this.f589g = 8388611;
        this.f594l = new a();
        this.f583a = context;
        this.f584b = eVar;
        this.f588f = view;
        this.f585c = z9;
        this.f586d = i10;
        this.f587e = i11;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.h, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.h a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f583a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f583a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = f.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0042
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f583a
            android.view.View r3 = r14.f588f
            int r4 = r14.f586d
            int r5 = r14.f587e
            boolean r6 = r14.f585c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0054
        L_0x0042:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r8 = r14.f583a
            androidx.appcompat.view.menu.e r9 = r14.f584b
            android.view.View r10 = r14.f588f
            int r11 = r14.f586d
            int r12 = r14.f587e
            boolean r13 = r14.f585c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0054:
            androidx.appcompat.view.menu.e r1 = r14.f584b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f594l
            r0.u(r1)
            android.view.View r1 = r14.f588f
            r0.p(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f591i
            r0.k(r1)
            boolean r1 = r14.f590h
            r0.r(r1)
            int r1 = r14.f589g
            r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():androidx.appcompat.view.menu.h");
    }

    private void l(int i10, int i11, boolean z9, boolean z10) {
        h c10 = c();
        c10.v(z10);
        if (z9) {
            if ((e.b(this.f589g, x.z(this.f588f)) & 7) == 5) {
                i10 -= this.f588f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f583a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f592j.dismiss();
        }
    }

    public h c() {
        if (this.f592j == null) {
            this.f592j = a();
        }
        return this.f592j;
    }

    public boolean d() {
        h hVar = this.f592j;
        return hVar != null && hVar.c();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f592j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f593k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f588f = view;
    }

    public void g(boolean z9) {
        this.f590h = z9;
        h hVar = this.f592j;
        if (hVar != null) {
            hVar.r(z9);
        }
    }

    public void h(int i10) {
        this.f589g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f593k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f591i = aVar;
        h hVar = this.f592j;
        if (hVar != null) {
            hVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f588f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f588f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
