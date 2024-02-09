package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.s;
import io.flutter.embedding.engine.systemchannels.q;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.c;
import java.util.HashMap;

public class f implements c.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f10036a;

    /* renamed from: b  reason: collision with root package name */
    private final InputMethodManager f10037b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f10038c;

    /* renamed from: d  reason: collision with root package name */
    private final q f10039d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public d f10040e = new d(d.a.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    private q.b f10041f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray<q.b> f10042g;

    /* renamed from: h  reason: collision with root package name */
    private c f10043h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10044i;

    /* renamed from: j  reason: collision with root package name */
    private InputConnection f10045j;

    /* renamed from: k  reason: collision with root package name */
    private io.flutter.plugin.platform.q f10046k;

    /* renamed from: l  reason: collision with root package name */
    private Rect f10047l;

    /* renamed from: m  reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f10048m;

    /* renamed from: n  reason: collision with root package name */
    private q.e f10049n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10050o;

    class a implements ImeSyncDeferringInsetsCallback.b {
        a() {
        }

        public void a(boolean z9) {
            if (!z9) {
                f.this.z();
            }
        }
    }

    class b implements q.f {
        b() {
        }

        public void a() {
            f fVar = f.this;
            fVar.G(fVar.f10036a);
        }

        public void b() {
            f.this.m();
        }

        public void c(int i10, q.b bVar) {
            f.this.E(i10, bVar);
        }

        public void d(q.e eVar) {
            f fVar = f.this;
            fVar.F(fVar.f10036a, eVar);
        }

        public void e(String str, Bundle bundle) {
            f.this.C(str, bundle);
        }

        public void f(int i10, boolean z9) {
            f.this.D(i10, z9);
        }

        public void g(double d10, double d11, double[] dArr) {
            f.this.B(d10, d11, dArr);
        }

        public void h() {
            f.this.x();
        }

        public void i(boolean z9) {
            if (Build.VERSION.SDK_INT >= 26 && f.this.f10038c != null) {
                if (z9) {
                    f.this.f10038c.commit();
                } else {
                    f.this.f10038c.cancel();
                }
            }
        }

        public void j() {
            if (f.this.f10040e.f10057a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
                return;
            }
            f fVar = f.this;
            fVar.s(fVar.f10036a);
        }
    }

    class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f10054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double[] f10055c;

        c(boolean z9, double[] dArr, double[] dArr2) {
            this.f10053a = z9;
            this.f10054b = dArr;
            this.f10055c = dArr2;
        }

        public void a(double d10, double d11) {
            double d12 = 1.0d;
            if (!this.f10053a) {
                double[] dArr = this.f10054b;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = this.f10054b;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = this.f10055c;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        a f10057a;

        /* renamed from: b  reason: collision with root package name */
        int f10058b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i10) {
            this.f10057a = aVar;
            this.f10058b = i10;
        }
    }

    private interface e {
        void a(double d10, double d11);
    }

    @SuppressLint({"NewApi"})
    public f(View view, q qVar, io.flutter.plugin.platform.q qVar2) {
        this.f10036a = view;
        AutofillManager autofillManager = null;
        this.f10043h = new c((q.e) null, view);
        this.f10037b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        this.f10038c = i10 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : autofillManager;
        if (i10 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f10048m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.f10048m.setImeVisibleListener(new a());
        }
        this.f10039d = qVar;
        qVar.o(new b());
        qVar.l();
        this.f10046k = qVar2;
        qVar2.E(this);
    }

    /* access modifiers changed from: private */
    public void B(double d10, double d11, double[] dArr) {
        double d12 = d10;
        double d13 = d11;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z9 = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d14 = dArr2[12] / dArr2[15];
        dArr3[1] = d14;
        dArr3[0] = d14;
        double d15 = dArr2[13] / dArr2[15];
        dArr3[3] = d15;
        dArr3[2] = d15;
        c cVar = new c(z9, dArr2, dArr3);
        cVar.a(d12, 0.0d);
        cVar.a(d12, d13);
        cVar.a(0.0d, d13);
        Float valueOf = Float.valueOf(this.f10036a.getContext().getResources().getDisplayMetrics().density);
        this.f10047l = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    public void D(int i10, boolean z9) {
        if (z9) {
            this.f10036a.requestFocus();
            this.f10040e = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f10037b.restartInput(this.f10036a);
            this.f10044i = false;
            return;
        }
        this.f10040e = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
        this.f10045j = null;
    }

    private void I(q.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar == null || bVar.f9979j == null) {
                this.f10042g = null;
                return;
            }
            q.b[] bVarArr = bVar.f9981l;
            SparseArray<q.b> sparseArray = new SparseArray<>();
            this.f10042g = sparseArray;
            if (bVarArr == null) {
                sparseArray.put(bVar.f9979j.f9982a.hashCode(), bVar);
                return;
            }
            for (q.b bVar2 : bVarArr) {
                q.b.a aVar = bVar2.f9979j;
                if (aVar != null) {
                    this.f10042g.put(aVar.f9982a.hashCode(), bVar2);
                    this.f10038c.notifyValueChanged(this.f10036a, aVar.f9982a.hashCode(), AutofillValue.forText(aVar.f9984c.f9989a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f9976g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
            r3 = this;
            io.flutter.embedding.engine.systemchannels.q$b r0 = r3.f10041f
            r1 = 1
            if (r0 == 0) goto L_0x0012
            io.flutter.embedding.engine.systemchannels.q$c r0 = r0.f9976g
            if (r0 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            io.flutter.embedding.engine.systemchannels.q$g r0 = r0.f9986a
            io.flutter.embedding.engine.systemchannels.q$g r2 = io.flutter.embedding.engine.systemchannels.q.g.NONE
            if (r0 == r2) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.k():boolean");
    }

    private static boolean n(q.e eVar, q.e eVar2) {
        int i10 = eVar.f9993e - eVar.f9992d;
        if (i10 != eVar2.f9993e - eVar2.f9992d) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (eVar.f9989a.charAt(eVar.f9992d + i11) != eVar2.f9989a.charAt(eVar2.f9992d + i11)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f10037b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(q.c cVar, boolean z9, boolean z10, boolean z11, boolean z12, q.d dVar) {
        q.g gVar = cVar.f9986a;
        if (gVar == q.g.DATETIME) {
            return 4;
        }
        if (gVar == q.g.NUMBER) {
            int i10 = 2;
            if (cVar.f9987b) {
                i10 = 4098;
            }
            return cVar.f9988c ? i10 | 8192 : i10;
        } else if (gVar == q.g.PHONE) {
            return 3;
        } else {
            if (gVar == q.g.NONE) {
                return 0;
            }
            int i11 = 1;
            if (gVar == q.g.MULTILINE) {
                i11 = 131073;
            } else if (gVar == q.g.EMAIL_ADDRESS) {
                i11 = 33;
            } else if (gVar == q.g.URL) {
                i11 = 17;
            } else if (gVar == q.g.VISIBLE_PASSWORD) {
                i11 = 145;
            } else if (gVar == q.g.NAME) {
                i11 = 97;
            } else if (gVar == q.g.POSTAL_ADDRESS) {
                i11 = 113;
            }
            if (z9) {
                i11 = i11 | 524288 | 128;
            } else {
                if (z10) {
                    i11 |= 32768;
                }
                if (!z11) {
                    i11 |= 524288;
                }
            }
            return dVar == q.d.CHARACTERS ? i11 | 4096 : dVar == q.d.WORDS ? i11 | 8192 : dVar == q.d.SENTENCES ? i11 | 16384 : i11;
        }
    }

    private boolean v() {
        return this.f10042g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.f10038c != null && v()) {
            this.f10038c.notifyValueChanged(this.f10036a, this.f10041f.f9979j.f9982a.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT >= 26 && this.f10038c != null && v()) {
            String str = this.f10041f.f9979j.f9982a;
            int[] iArr = new int[2];
            this.f10036a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f10047l);
            rect.offset(iArr[0], iArr[1]);
            this.f10038c.notifyViewEntered(this.f10036a, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        q.b bVar;
        if (Build.VERSION.SDK_INT >= 26 && this.f10038c != null && (bVar = this.f10041f) != null && bVar.f9979j != null && v()) {
            this.f10038c.notifyViewExited(this.f10036a, this.f10041f.f9979j.f9982a.hashCode());
        }
    }

    public void A(ViewStructure viewStructure, int i10) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        ViewStructure viewStructure3 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && v()) {
            String str = this.f10041f.f9979j.f9982a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i11 = 0; i11 < this.f10042g.size(); i11++) {
                int keyAt = this.f10042g.keyAt(i11);
                q.b.a aVar = this.f10042g.valueAt(i11).f9979j;
                if (aVar != null) {
                    viewStructure3.addChildCount(1);
                    ViewStructure newChild = viewStructure3.newChild(i11);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.f9983b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f9985d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f10047l) == null) {
                        viewStructure2 = newChild;
                        viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                        charSequence = aVar.f9984c.f9989a;
                    } else {
                        viewStructure2 = newChild;
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f10047l.height());
                        charSequence = this.f10043h;
                    }
                    viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
                }
            }
        }
    }

    public void C(String str, Bundle bundle) {
        this.f10037b.sendAppPrivateCommand(this.f10036a, str, bundle);
    }

    /* access modifiers changed from: package-private */
    public void E(int i10, q.b bVar) {
        y();
        this.f10041f = bVar;
        this.f10040e = k() ? new d(d.a.FRAMEWORK_CLIENT, i10) : new d(d.a.NO_TARGET, i10);
        this.f10043h.l(this);
        q.b.a aVar = bVar.f9979j;
        this.f10043h = new c(aVar != null ? aVar.f9984c : null, this.f10036a);
        I(bVar);
        this.f10044i = true;
        H();
        this.f10047l = null;
        this.f10043h.a(this);
    }

    /* access modifiers changed from: package-private */
    public void F(View view, q.e eVar) {
        q.e eVar2;
        if (!this.f10044i && (eVar2 = this.f10049n) != null && eVar2.b()) {
            boolean n10 = n(this.f10049n, eVar);
            this.f10044i = n10;
            if (n10) {
                x6.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f10049n = eVar;
        this.f10043h.n(eVar);
        if (this.f10044i) {
            this.f10037b.restartInput(view);
            this.f10044i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view) {
        if (k()) {
            view.requestFocus();
            this.f10037b.showSoftInput(view, 0);
            return;
        }
        s(view);
    }

    public void H() {
        if (this.f10040e.f10057a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10050o = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f9993e) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.c r9 = r8.f10043h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        L_0x000b:
            io.flutter.plugin.editing.c r9 = r8.f10043h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f10043h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f10043h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f10043h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f10043h
            java.util.ArrayList r0 = r0.e()
            io.flutter.embedding.engine.systemchannels.q$e r1 = r8.f10049n
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.c r1 = r8.f10043h
            java.lang.String r1 = r1.toString()
            io.flutter.embedding.engine.systemchannels.q$e r2 = r8.f10049n
            java.lang.String r2 = r2.f9989a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            io.flutter.embedding.engine.systemchannels.q$e r1 = r8.f10049n
            int r2 = r1.f9990b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f9991c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f9992d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f9993e
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f10043h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            x6.b.f(r2, r1)
            io.flutter.embedding.engine.systemchannels.q$b r1 = r8.f10041f
            boolean r1 = r1.f9974e
            if (r1 == 0) goto L_0x0086
            io.flutter.embedding.engine.systemchannels.q r1 = r8.f10039d
            io.flutter.plugin.editing.f$d r2 = r8.f10040e
            int r2 = r2.f10058b
            r1.r(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f10043h
            r0.c()
            goto L_0x0099
        L_0x0086:
            io.flutter.embedding.engine.systemchannels.q r0 = r8.f10039d
            io.flutter.plugin.editing.f$d r1 = r8.f10040e
            int r1 = r1.f10058b
            io.flutter.plugin.editing.c r2 = r8.f10043h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.q(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            io.flutter.embedding.engine.systemchannels.q$e r6 = new io.flutter.embedding.engine.systemchannels.q$e
            io.flutter.plugin.editing.c r0 = r8.f10043h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f10049n = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.c r9 = r8.f10043h
            r9.c()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        q.b bVar;
        q.b.a aVar;
        q.b.a aVar2;
        if (Build.VERSION.SDK_INT >= 26 && (bVar = this.f10041f) != null && this.f10042g != null && (aVar = bVar.f9979j) != null) {
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                q.b bVar2 = this.f10042g.get(sparseArray.keyAt(i10));
                if (!(bVar2 == null || (aVar2 = bVar2.f9979j) == null)) {
                    String charSequence = sparseArray.valueAt(i10).getTextValue().toString();
                    q.e eVar = new q.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f9982a.equals(aVar.f9982a)) {
                        this.f10043h.n(eVar);
                    } else {
                        hashMap.put(aVar2.f9982a, eVar);
                    }
                }
            }
            this.f10039d.s(this.f10040e.f10058b, hashMap);
        }
    }

    public void l(int i10) {
        d dVar = this.f10040e;
        d.a aVar = dVar.f10057a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.f10058b == i10) {
            this.f10040e = new d(d.a.NO_TARGET, 0);
            y();
            this.f10037b.hideSoftInputFromWindow(this.f10036a.getApplicationWindowToken(), 0);
            this.f10037b.restartInput(this.f10036a);
            this.f10044i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (this.f10040e.f10057a != d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10043h.l(this);
            y();
            this.f10041f = null;
            I((q.b) null);
            this.f10040e = new d(d.a.NO_TARGET, 0);
            H();
            this.f10047l = null;
        }
    }

    public InputConnection o(View view, s sVar, EditorInfo editorInfo) {
        d dVar = this.f10040e;
        d.a aVar = dVar.f10057a;
        if (aVar == d.a.NO_TARGET) {
            this.f10045j = null;
            return null;
        } else if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                q.b bVar = this.f10041f;
                int t9 = t(bVar.f9976g, bVar.f9970a, bVar.f9971b, bVar.f9972c, bVar.f9973d, bVar.f9975f);
                editorInfo.inputType = t9;
                editorInfo.imeOptions = 33554432;
                if (Build.VERSION.SDK_INT >= 26 && !this.f10041f.f9973d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = this.f10041f.f9977h;
                int intValue = num == null ? (t9 & 131072) != 0 ? 1 : 6 : num.intValue();
                q.b bVar2 = this.f10041f;
                String str = bVar2.f9978i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = intValue;
                }
                editorInfo.imeOptions = intValue | editorInfo.imeOptions;
                String[] strArr = bVar2.f9980k;
                if (strArr != null) {
                    u.a.d(editorInfo, strArr);
                }
                b bVar3 = new b(view, this.f10040e.f10058b, this.f10039d, sVar, this.f10043h, editorInfo);
                editorInfo.initialSelStart = this.f10043h.i();
                editorInfo.initialSelEnd = this.f10043h.h();
                this.f10045j = bVar3;
                return bVar3;
            } else if (this.f10050o) {
                return this.f10045j;
            } else {
                InputConnection onCreateInputConnection = this.f10046k.c(dVar.f10058b).onCreateInputConnection(editorInfo);
                this.f10045j = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void p() {
        this.f10046k.R();
        this.f10039d.o((q.f) null);
        y();
        this.f10043h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f10048m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f10037b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f10045j) == null) {
            return false;
        }
        return inputConnection instanceof b ? ((b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f10040e.f10057a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10050o = true;
        }
    }

    public void z() {
        this.f10039d.i(this.f10040e.f10058b);
    }
}
