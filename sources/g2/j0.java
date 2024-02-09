package g2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p.a;

public final class j0 extends Fragment implements f {

    /* renamed from: q0  reason: collision with root package name */
    private static final WeakHashMap f8898q0 = new WeakHashMap();

    /* renamed from: n0  reason: collision with root package name */
    private final Map f8899n0 = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: o0  reason: collision with root package name */
    public int f8900o0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: p0  reason: collision with root package name */
    public Bundle f8901p0;

    public static j0 G1(e eVar) {
        j0 j0Var;
        WeakHashMap weakHashMap = f8898q0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (j0Var = (j0) weakReference.get()) != null) {
            return j0Var;
        }
        try {
            j0 j0Var2 = (j0) eVar.A().h0("SupportLifecycleFragmentImpl");
            if (j0Var2 == null || j0Var2.c0()) {
                j0Var2 = new j0();
                eVar.A().l().d(j0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(j0Var2));
            return j0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void H0() {
        super.H0();
        this.f8900o0 = 3;
        for (LifecycleCallback h10 : this.f8899n0.values()) {
            h10.h();
        }
    }

    public final void I0(Bundle bundle) {
        super.I0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f8899n0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void J0() {
        super.J0();
        this.f8900o0 = 2;
        for (LifecycleCallback j10 : this.f8899n0.values()) {
            j10.j();
        }
    }

    public final void K0() {
        super.K0();
        this.f8900o0 = 4;
        for (LifecycleCallback k10 : this.f8899n0.values()) {
            k10.k();
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f8899n0.containsKey(str)) {
            this.f8899n0.put(str, lifecycleCallback);
            if (this.f8900o0 > 0) {
                new s2.e(Looper.getMainLooper()).post(new i0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f8899n0.get(str));
    }

    public final /* synthetic */ Activity d() {
        return n();
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.f8899n0.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void h0(int i10, int i11, Intent intent) {
        super.h0(i10, i11, intent);
        for (LifecycleCallback e10 : this.f8899n0.values()) {
            e10.e(i10, i11, intent);
        }
    }

    public final void m0(Bundle bundle) {
        super.m0(bundle);
        this.f8900o0 = 1;
        this.f8901p0 = bundle;
        for (Map.Entry entry : this.f8899n0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void r0() {
        super.r0();
        this.f8900o0 = 5;
        for (LifecycleCallback g10 : this.f8899n0.values()) {
            g10.g();
        }
    }
}
