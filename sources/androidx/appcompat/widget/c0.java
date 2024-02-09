package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.view.x;
import f.j;
import java.lang.ref.WeakReference;

class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f807a;

    /* renamed from: b  reason: collision with root package name */
    private y0 f808b;

    /* renamed from: c  reason: collision with root package name */
    private y0 f809c;

    /* renamed from: d  reason: collision with root package name */
    private y0 f810d;

    /* renamed from: e  reason: collision with root package name */
    private y0 f811e;

    /* renamed from: f  reason: collision with root package name */
    private y0 f812f;

    /* renamed from: g  reason: collision with root package name */
    private y0 f813g;

    /* renamed from: h  reason: collision with root package name */
    private y0 f814h;

    /* renamed from: i  reason: collision with root package name */
    private final e0 f815i;

    /* renamed from: j  reason: collision with root package name */
    private int f816j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f817k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f818l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f819m;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f822c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f820a = i10;
            this.f821b = i11;
            this.f822c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f820a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f821b & 2) != 0);
            }
            c0.this.n(this.f822c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ TextView f824m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Typeface f825n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f826o;

        b(TextView textView, Typeface typeface, int i10) {
            this.f824m = textView;
            this.f825n = typeface;
            this.f826o = i10;
        }

        public void run() {
            this.f824m.setTypeface(this.f825n, this.f826o);
        }
    }

    c0(TextView textView) {
        this.f807a = textView;
        this.f815i = new e0(textView);
    }

    private void B(int i10, float f10) {
        this.f815i.v(i10, f10);
    }

    private void C(Context context, a1 a1Var) {
        String n10;
        Typeface typeface;
        Typeface typeface2;
        this.f816j = a1Var.j(j.H2, this.f816j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = false;
        if (i10 >= 28) {
            int j10 = a1Var.j(j.M2, -1);
            this.f817k = j10;
            if (j10 != -1) {
                this.f816j = (this.f816j & 2) | 0;
            }
        }
        int i11 = j.L2;
        if (a1Var.r(i11) || a1Var.r(j.N2)) {
            this.f818l = null;
            int i12 = j.N2;
            if (a1Var.r(i12)) {
                i11 = i12;
            }
            int i13 = this.f817k;
            int i14 = this.f816j;
            if (!context.isRestricted()) {
                try {
                    Typeface i15 = a1Var.i(i11, this.f816j, new a(i13, i14, new WeakReference(this.f807a)));
                    if (i15 != null) {
                        if (i10 >= 28 && this.f817k != -1) {
                            i15 = Typeface.create(Typeface.create(i15, 0), this.f817k, (this.f816j & 2) != 0);
                        }
                        this.f818l = i15;
                    }
                    this.f819m = this.f818l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f818l == null && (n10 = a1Var.n(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f817k == -1) {
                    typeface = Typeface.create(n10, this.f816j);
                } else {
                    Typeface create = Typeface.create(n10, 0);
                    int i16 = this.f817k;
                    if ((this.f816j & 2) != 0) {
                        z9 = true;
                    }
                    typeface = Typeface.create(create, i16, z9);
                }
                this.f818l = typeface;
                return;
            }
            return;
        }
        int i17 = j.G2;
        if (a1Var.r(i17)) {
            this.f819m = false;
            int j11 = a1Var.j(i17, 1);
            if (j11 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j11 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j11 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f818l = typeface2;
        }
    }

    private void a(Drawable drawable, y0 y0Var) {
        if (drawable != null && y0Var != null) {
            k.i(drawable, y0Var, this.f807a.getDrawableState());
        }
    }

    private static y0 d(Context context, k kVar, int i10) {
        ColorStateList f10 = kVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        y0 y0Var = new y0();
        y0Var.f1102d = true;
        y0Var.f1099a = f10;
        return y0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f807a.getCompoundDrawablesRelative();
            TextView textView = this.f807a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f807a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f807a.getCompoundDrawables();
                TextView textView2 = this.f807a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f807a;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void z() {
        y0 y0Var = this.f814h;
        this.f808b = y0Var;
        this.f809c = y0Var;
        this.f810d = y0Var;
        this.f811e = y0Var;
        this.f812f = y0Var;
        this.f813g = y0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!androidx.core.widget.b.f1871a && !l()) {
            B(i10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f808b == null && this.f809c == null && this.f810d == null && this.f811e == null)) {
            Drawable[] compoundDrawables = this.f807a.getCompoundDrawables();
            a(compoundDrawables[0], this.f808b);
            a(compoundDrawables[1], this.f809c);
            a(compoundDrawables[2], this.f810d);
            a(compoundDrawables[3], this.f811e);
        }
        if (this.f812f != null || this.f813g != null) {
            Drawable[] compoundDrawablesRelative = this.f807a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f812f);
            a(compoundDrawablesRelative[2], this.f813g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f815i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f815i.h();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f815i.i();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f815i.j();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f815i.k();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f815i.l();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        y0 y0Var = this.f814h;
        if (y0Var != null) {
            return y0Var.f1099a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        y0 y0Var = this.f814h;
        if (y0Var != null) {
            return y0Var.f1100b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f815i.p();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f807a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.k.b()
            int[] r2 = f.j.Y
            r12 = 0
            androidx.appcompat.widget.a1 r13 = androidx.appcompat.widget.a1.u(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f807a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.q()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.x.e0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = f.j.Z
            r14 = -1
            int r0 = r13.m(r0, r14)
            int r1 = f.j.f8599c0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.y0 r1 = d(r10, r11, r1)
            r7.f808b = r1
        L_0x0042:
            int r1 = f.j.f8589a0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.y0 r1 = d(r10, r11, r1)
            r7.f809c = r1
        L_0x0054:
            int r1 = f.j.f8604d0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.y0 r1 = d(r10, r11, r1)
            r7.f810d = r1
        L_0x0066:
            int r1 = f.j.f8594b0
            boolean r2 = r13.r(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.m(r1, r12)
            androidx.appcompat.widget.y0 r1 = d(r10, r11, r1)
            r7.f811e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = f.j.f8609e0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.y0 r2 = d(r10, r11, r2)
            r7.f812f = r2
        L_0x008c:
            int r2 = f.j.f8614f0
            boolean r3 = r13.r(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.m(r2, r12)
            androidx.appcompat.widget.y0 r2 = d(r10, r11, r2)
            r7.f813g = r2
        L_0x009e:
            r13.v()
            android.widget.TextView r2 = r7.f807a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011a
            int[] r6 = f.j.E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.s(r10, r0, r6)
            if (r2 != 0) goto L_0x00c5
            int r6 = f.j.P2
            boolean r15 = r0.r(r6)
            if (r15 == 0) goto L_0x00c5
            boolean r6 = r0.a(r6, r12)
            r15 = 1
            goto L_0x00c7
        L_0x00c5:
            r6 = 0
            r15 = 0
        L_0x00c7:
            r7.C(r10, r0)
            if (r1 >= r5) goto L_0x00f5
            int r4 = f.j.I2
            boolean r17 = r0.r(r4)
            if (r17 == 0) goto L_0x00d9
            android.content.res.ColorStateList r4 = r0.c(r4)
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            int r13 = f.j.J2
            boolean r18 = r0.r(r13)
            if (r18 == 0) goto L_0x00e7
            android.content.res.ColorStateList r13 = r0.c(r13)
            goto L_0x00e8
        L_0x00e7:
            r13 = 0
        L_0x00e8:
            int r14 = f.j.K2
            boolean r19 = r0.r(r14)
            if (r19 == 0) goto L_0x00f7
            android.content.res.ColorStateList r14 = r0.c(r14)
            goto L_0x00f8
        L_0x00f5:
            r4 = 0
            r13 = 0
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            int r5 = f.j.Q2
            boolean r20 = r0.r(r5)
            if (r20 == 0) goto L_0x0105
            java.lang.String r5 = r0.n(r5)
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            if (r1 < r3) goto L_0x0115
            int r3 = f.j.O2
            boolean r21 = r0.r(r3)
            if (r21 == 0) goto L_0x0115
            java.lang.String r3 = r0.n(r3)
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            r0.v()
            goto L_0x0121
        L_0x011a:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0121:
            int[] r0 = f.j.E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.a1.u(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x013c
            int r12 = f.j.P2
            boolean r22 = r0.r(r12)
            if (r22 == 0) goto L_0x013c
            r22 = r3
            r3 = 0
            boolean r6 = r0.a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0140
        L_0x013c:
            r22 = r3
            r3 = 23
        L_0x0140:
            if (r1 >= r3) goto L_0x0166
            int r3 = f.j.I2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x014e
            android.content.res.ColorStateList r4 = r0.c(r3)
        L_0x014e:
            int r3 = f.j.J2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x015a
            android.content.res.ColorStateList r13 = r0.c(r3)
        L_0x015a:
            int r3 = f.j.K2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0166
            android.content.res.ColorStateList r14 = r0.c(r3)
        L_0x0166:
            int r3 = f.j.Q2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0172
            java.lang.String r5 = r0.n(r3)
        L_0x0172:
            r3 = 26
            if (r1 < r3) goto L_0x0183
            int r3 = f.j.O2
            boolean r12 = r0.r(r3)
            if (r12 == 0) goto L_0x0183
            java.lang.String r3 = r0.n(r3)
            goto L_0x0185
        L_0x0183:
            r3 = r22
        L_0x0185:
            r12 = 28
            if (r1 < r12) goto L_0x01a2
            int r12 = f.j.F2
            boolean r16 = r0.r(r12)
            if (r16 == 0) goto L_0x01a2
            r16 = r11
            r11 = -1
            int r12 = r0.e(r12, r11)
            if (r12 != 0) goto L_0x01a4
            android.widget.TextView r11 = r7.f807a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a4
        L_0x01a2:
            r16 = r11
        L_0x01a4:
            r7.C(r10, r0)
            r0.v()
            if (r4 == 0) goto L_0x01b1
            android.widget.TextView r0 = r7.f807a
            r0.setTextColor(r4)
        L_0x01b1:
            if (r13 == 0) goto L_0x01b8
            android.widget.TextView r0 = r7.f807a
            r0.setHintTextColor(r13)
        L_0x01b8:
            if (r14 == 0) goto L_0x01bf
            android.widget.TextView r0 = r7.f807a
            r0.setLinkTextColor(r14)
        L_0x01bf:
            if (r2 != 0) goto L_0x01c6
            if (r15 == 0) goto L_0x01c6
            r7.s(r6)
        L_0x01c6:
            android.graphics.Typeface r0 = r7.f818l
            if (r0 == 0) goto L_0x01dc
            int r2 = r7.f817k
            r4 = -1
            if (r2 != r4) goto L_0x01d7
            android.widget.TextView r2 = r7.f807a
            int r4 = r7.f816j
            r2.setTypeface(r0, r4)
            goto L_0x01dc
        L_0x01d7:
            android.widget.TextView r2 = r7.f807a
            r2.setTypeface(r0)
        L_0x01dc:
            if (r3 == 0) goto L_0x01e3
            android.widget.TextView r0 = r7.f807a
            r0.setFontVariationSettings(r3)
        L_0x01e3:
            if (r5 == 0) goto L_0x0207
            r0 = 24
            if (r1 < r0) goto L_0x01f3
            android.widget.TextView r0 = r7.f807a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r5)
            r0.setTextLocales(r1)
            goto L_0x0207
        L_0x01f3:
            r0 = 44
            int r0 = r5.indexOf(r0)
            r1 = 0
            java.lang.String r0 = r5.substring(r1, r0)
            android.widget.TextView r1 = r7.f807a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x0207:
            androidx.appcompat.widget.e0 r0 = r7.f815i
            r1 = r24
            r0.q(r1, r9)
            boolean r0 = androidx.core.widget.b.f1871a
            if (r0 == 0) goto L_0x024f
            androidx.appcompat.widget.e0 r0 = r7.f815i
            int r0 = r0.l()
            if (r0 == 0) goto L_0x024f
            androidx.appcompat.widget.e0 r0 = r7.f815i
            int[] r0 = r0.k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x024f
            android.widget.TextView r2 = r7.f807a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0249
            android.widget.TextView r0 = r7.f807a
            androidx.appcompat.widget.e0 r2 = r7.f815i
            int r2 = r2.i()
            androidx.appcompat.widget.e0 r3 = r7.f815i
            int r3 = r3.h()
            androidx.appcompat.widget.e0 r4 = r7.f815i
            int r4 = r4.j()
            r5 = 0
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x024f
        L_0x0249:
            r5 = 0
            android.widget.TextView r2 = r7.f807a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r0, r5)
        L_0x024f:
            int[] r0 = f.j.f8619g0
            androidx.appcompat.widget.a1 r8 = androidx.appcompat.widget.a1.t(r10, r1, r0)
            int r0 = f.j.f8659o0
            r1 = -1
            int r0 = r8.m(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x0266
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r3 = r0
            goto L_0x0267
        L_0x0266:
            r3 = 0
        L_0x0267:
            int r0 = f.j.f8684t0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x0275
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r4 = r0
            goto L_0x0276
        L_0x0275:
            r4 = 0
        L_0x0276:
            int r0 = f.j.f8664p0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x0284
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r5 = r0
            goto L_0x0285
        L_0x0284:
            r5 = 0
        L_0x0285:
            int r0 = f.j.f8649m0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x0293
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r6 = r0
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            int r0 = f.j.f8669q0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02a2
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r9 = r0
            goto L_0x02a3
        L_0x02a2:
            r9 = 0
        L_0x02a3:
            int r0 = f.j.f8654n0
            int r0 = r8.m(r0, r1)
            if (r0 == r1) goto L_0x02b1
            android.graphics.drawable.Drawable r0 = r2.c(r10, r0)
            r10 = r0
            goto L_0x02b2
        L_0x02b1:
            r10 = 0
        L_0x02b2:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = f.j.f8674r0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02ce
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f807a
            androidx.core.widget.j.f(r1, r0)
        L_0x02ce:
            int r0 = f.j.f8679s0
            boolean r1 = r8.r(r0)
            if (r1 == 0) goto L_0x02e6
            r1 = -1
            int r0 = r8.j(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i0.d(r0, r2)
            android.widget.TextView r2 = r7.f807a
            androidx.core.widget.j.g(r2, r0)
            goto L_0x02e7
        L_0x02e6:
            r1 = -1
        L_0x02e7:
            int r0 = f.j.f8694v0
            int r0 = r8.e(r0, r1)
            int r2 = f.j.f8699w0
            int r2 = r8.e(r2, r1)
            int r3 = f.j.f8704x0
            int r3 = r8.e(r3, r1)
            r8.v()
            if (r0 == r1) goto L_0x0303
            android.widget.TextView r4 = r7.f807a
            androidx.core.widget.j.i(r4, r0)
        L_0x0303:
            if (r2 == r1) goto L_0x030a
            android.widget.TextView r0 = r7.f807a
            androidx.core.widget.j.j(r0, r2)
        L_0x030a:
            if (r3 == r1) goto L_0x0311
            android.widget.TextView r0 = r7.f807a
            androidx.core.widget.j.k(r0, r3)
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f819m) {
            this.f818l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (x.O(textView)) {
                textView.post(new b(textView, typeface, this.f816j));
            } else {
                textView.setTypeface(typeface, this.f816j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z9, int i10, int i11, int i12, int i13) {
        if (!androidx.core.widget.b.f1871a) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String n10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        a1 s9 = a1.s(context, i10, j.E2);
        int i11 = j.P2;
        if (s9.r(i11)) {
            s(s9.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = j.I2;
            if (s9.r(i13) && (c12 = s9.c(i13)) != null) {
                this.f807a.setTextColor(c12);
            }
            int i14 = j.K2;
            if (s9.r(i14) && (c11 = s9.c(i14)) != null) {
                this.f807a.setLinkTextColor(c11);
            }
            int i15 = j.J2;
            if (s9.r(i15) && (c10 = s9.c(i15)) != null) {
                this.f807a.setHintTextColor(c10);
            }
        }
        int i16 = j.F2;
        if (s9.r(i16) && s9.e(i16, -1) == 0) {
            this.f807a.setTextSize(0, 0.0f);
        }
        C(context, s9);
        if (i12 >= 26) {
            int i17 = j.O2;
            if (s9.r(i17) && (n10 = s9.n(i17)) != null) {
                this.f807a.setFontVariationSettings(n10);
            }
        }
        s9.v();
        Typeface typeface = this.f818l;
        if (typeface != null) {
            this.f807a.setTypeface(typeface, this.f816j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            u.a.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z9) {
        this.f807a.setAllCaps(z9);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) {
        this.f815i.r(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) {
        this.f815i.s(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        this.f815i.t(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f814h == null) {
            this.f814h = new y0();
        }
        y0 y0Var = this.f814h;
        y0Var.f1099a = colorStateList;
        y0Var.f1102d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f814h == null) {
            this.f814h = new y0();
        }
        y0 y0Var = this.f814h;
        y0Var.f1100b = mode;
        y0Var.f1101c = mode != null;
        z();
    }
}
