package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import androidx.lifecycle.r;

public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean A0;
    private boolean B0;
    private boolean C0 = false;

    /* renamed from: n0  reason: collision with root package name */
    private Handler f2447n0;

    /* renamed from: o0  reason: collision with root package name */
    private Runnable f2448o0 = new a();

    /* renamed from: p0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2449p0 = new b();
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public DialogInterface.OnDismissListener f2450q0 = new c();

    /* renamed from: r0  reason: collision with root package name */
    private int f2451r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    private int f2452s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f2453t0 = true;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2454u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    private int f2455v0 = -1;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f2456w0;

    /* renamed from: x0  reason: collision with root package name */
    private r<l> f2457x0 = new C0047d();
    /* access modifiers changed from: private */

    /* renamed from: y0  reason: collision with root package name */
    public Dialog f2458y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f2459z0;

    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.f2450q0.onDismiss(d.this.f2458y0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f2458y0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f2458y0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f2458y0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f2458y0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    class C0047d implements r<l> {
        C0047d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(l lVar) {
            if (lVar != null && d.this.f2454u0) {
                View n12 = d.this.n1();
                if (n12.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.f2458y0 != null) {
                    if (n.E0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f2458y0);
                    }
                    d.this.f2458y0.setContentView(n12);
                }
            }
        }
    }

    class e extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f2464a;

        e(g gVar) {
            this.f2464a = gVar;
        }

        public View d(int i10) {
            return this.f2464a.e() ? this.f2464a.d(i10) : d.this.K1(i10);
        }

        public boolean e() {
            return this.f2464a.e() || d.this.L1();
        }
    }

    private void H1(boolean z9, boolean z10) {
        if (!this.A0) {
            this.A0 = true;
            this.B0 = false;
            Dialog dialog = this.f2458y0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2458y0.dismiss();
                if (!z10) {
                    if (Looper.myLooper() == this.f2447n0.getLooper()) {
                        onDismiss(this.f2458y0);
                    } else {
                        this.f2447n0.post(this.f2448o0);
                    }
                }
            }
            this.f2459z0 = true;
            if (this.f2455v0 >= 0) {
                G().T0(this.f2455v0, 1);
                this.f2455v0 = -1;
                return;
            }
            w l10 = G().l();
            l10.k(this);
            if (z9) {
                l10.g();
            } else {
                l10.f();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void M1(Bundle bundle) {
        if (this.f2454u0 && !this.C0) {
            try {
                this.f2456w0 = true;
                Dialog J1 = J1(bundle);
                this.f2458y0 = J1;
                if (this.f2454u0) {
                    O1(J1, this.f2451r0);
                    Context t9 = t();
                    if (t9 instanceof Activity) {
                        this.f2458y0.setOwnerActivity((Activity) t9);
                    }
                    this.f2458y0.setCancelable(this.f2453t0);
                    this.f2458y0.setOnCancelListener(this.f2449p0);
                    this.f2458y0.setOnDismissListener(this.f2450q0);
                    this.C0 = true;
                } else {
                    this.f2458y0 = null;
                }
                this.f2456w0 = false;
            } catch (Throwable th) {
                this.f2456w0 = false;
                throw th;
            }
        }
    }

    public void I0(Bundle bundle) {
        super.I0(bundle);
        Dialog dialog = this.f2458y0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2451r0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2452s0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z9 = this.f2453t0;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f2454u0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f2455v0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public int I1() {
        return this.f2452s0;
    }

    public void J0() {
        super.J0();
        Dialog dialog = this.f2458y0;
        if (dialog != null) {
            this.f2459z0 = false;
            dialog.show();
            View decorView = this.f2458y0.getWindow().getDecorView();
            h0.a(decorView, this);
            i0.a(decorView, this);
            s0.e.a(decorView, this);
        }
    }

    public Dialog J1(Bundle bundle) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1(), I1());
    }

    public void K0() {
        super.K0();
        Dialog dialog = this.f2458y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* access modifiers changed from: package-private */
    public View K1(int i10) {
        Dialog dialog = this.f2458y0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean L1() {
        return this.C0;
    }

    public void M0(Bundle bundle) {
        Bundle bundle2;
        super.M0(bundle);
        if (this.f2458y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2458y0.onRestoreInstanceState(bundle2);
        }
    }

    public void N1(boolean z9) {
        this.f2454u0 = z9;
    }

    public void O1(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void P1(n nVar, String str) {
        this.A0 = false;
        this.B0 = true;
        w l10 = nVar.l();
        l10.d(this, str);
        l10.f();
    }

    /* access modifiers changed from: package-private */
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T0(layoutInflater, viewGroup, bundle);
        if (this.T == null && this.f2458y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2458y0.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public g g() {
        return new e(super.g());
    }

    public void j0(Context context) {
        super.j0(context);
        U().e(this.f2457x0);
        if (!this.B0) {
            this.A0 = false;
        }
    }

    public void m0(Bundle bundle) {
        super.m0(bundle);
        this.f2447n0 = new Handler();
        this.f2454u0 = this.J == 0;
        if (bundle != null) {
            this.f2451r0 = bundle.getInt("android:style", 0);
            this.f2452s0 = bundle.getInt("android:theme", 0);
            this.f2453t0 = bundle.getBoolean("android:cancelable", true);
            this.f2454u0 = bundle.getBoolean("android:showsDialog", this.f2454u0);
            this.f2455v0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2459z0) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            H1(true, true);
        }
    }

    public void t0() {
        super.t0();
        Dialog dialog = this.f2458y0;
        if (dialog != null) {
            this.f2459z0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2458y0.dismiss();
            if (!this.A0) {
                onDismiss(this.f2458y0);
            }
            this.f2458y0 = null;
            this.C0 = false;
        }
    }

    public void u0() {
        super.u0();
        if (!this.B0 && !this.A0) {
            this.A0 = true;
        }
        U().h(this.f2457x0);
    }

    public LayoutInflater v0(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater v02 = super.v0(bundle);
        if (!this.f2454u0 || this.f2456w0) {
            if (n.E0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.f2454u0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return v02;
        }
        M1(bundle);
        if (n.E0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f2458y0;
        return dialog != null ? v02.cloneInContext(dialog.getContext()) : v02;
    }
}
