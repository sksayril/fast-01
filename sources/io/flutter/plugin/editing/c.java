package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.engine.systemchannels.q;
import java.util.ArrayList;
import java.util.Iterator;

class c extends SpannableStringBuilder {

    /* renamed from: m  reason: collision with root package name */
    private int f10010m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f10011n = 0;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<b> f10012o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<b> f10013p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<e> f10014q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private String f10015r;

    /* renamed from: s  reason: collision with root package name */
    private String f10016s;

    /* renamed from: t  reason: collision with root package name */
    private int f10017t;

    /* renamed from: u  reason: collision with root package name */
    private int f10018u;

    /* renamed from: v  reason: collision with root package name */
    private int f10019v;

    /* renamed from: w  reason: collision with root package name */
    private int f10020w;

    /* renamed from: x  reason: collision with root package name */
    private BaseInputConnection f10021x;

    class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Editable f10022a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, boolean z9, Editable editable) {
            super(view, z9);
            this.f10022a = editable;
        }

        public Editable getEditable() {
            return this.f10022a;
        }
    }

    interface b {
        void a(boolean z9, boolean z10, boolean z11);
    }

    public c(q.e eVar, View view) {
        this.f10021x = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z9, boolean z10, boolean z11) {
        this.f10011n++;
        bVar.a(z9, z10, z11);
        this.f10011n--;
    }

    private void k(boolean z9, boolean z10, boolean z11) {
        if (z9 || z10 || z11) {
            Iterator<b> it = this.f10012o.iterator();
            while (it.hasNext()) {
                j(it.next(), z9, z10, z11);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f10011n > 0) {
            x6.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f10010m > 0) {
            x6.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f10013p;
        } else {
            arrayList = this.f10012o;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f10010m++;
        if (this.f10011n > 0) {
            x6.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f10010m == 1 && !this.f10012o.isEmpty()) {
            this.f10016s = toString();
            this.f10017t = i();
            this.f10018u = h();
            this.f10019v = g();
            this.f10020w = f();
        }
    }

    public void c() {
        this.f10014q.clear();
    }

    public void d() {
        int i10 = this.f10010m;
        if (i10 == 0) {
            x6.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<b> it = this.f10013p.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f10012o.isEmpty()) {
                x6.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f10012o.size()) + " listener(s)");
                boolean equals = toString().equals(this.f10016s) ^ true;
                boolean z9 = false;
                boolean z10 = (this.f10017t == i() && this.f10018u == h()) ? false : true;
                if (!(this.f10019v == g() && this.f10020w == f())) {
                    z9 = true;
                }
                k(equals, z10, z9);
            }
        }
        this.f10012o.addAll(this.f10013p);
        this.f10013p.clear();
        this.f10010m--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f10014q);
        this.f10014q.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f10011n > 0) {
            x6.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f10012o.remove(bVar);
        if (this.f10010m > 0) {
            this.f10013p.remove(bVar);
        }
    }

    public void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f10021x.setComposingRegion(i10, i11);
        }
    }

    public void n(q.e eVar) {
        b();
        replace(0, length(), eVar.f9989a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f9990b, eVar.f9991c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f9992d, eVar.f9993e);
        c();
        d();
    }

    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z9;
        boolean z10;
        if (this.f10011n > 0) {
            x6.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i14 = i11 - i10;
        boolean z11 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z11; i15++) {
            z11 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        CharSequence charSequence2 = charSequence;
        if (z11) {
            this.f10015r = null;
        }
        int i16 = i();
        int h10 = h();
        int g10 = g();
        int f10 = f();
        SpannableStringBuilder replace = super.replace(i10, i11, charSequence, i12, i13);
        e eVar = r1;
        boolean z12 = z11;
        int i17 = f10;
        e eVar2 = new e(cVar, i10, i11, charSequence, i(), h(), g(), f());
        this.f10014q.add(eVar);
        if (this.f10010m > 0) {
            return replace;
        }
        boolean z13 = (i() == i16 && h() == h10) ? false : true;
        if (g() == g10 && f() == i17) {
            z9 = z12;
            z10 = false;
        } else {
            z9 = z12;
            z10 = true;
        }
        k(z9, z13, z10);
        return replace;
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f10014q.add(new e(toString(), i(), h(), g(), f()));
    }

    public String toString() {
        String str = this.f10015r;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f10015r = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
