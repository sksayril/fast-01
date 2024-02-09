package g2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p.a;
import s2.e;

public final class h0 extends Fragment implements f {

    /* renamed from: p  reason: collision with root package name */
    private static final WeakHashMap f8891p = new WeakHashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Map f8892m = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f8893n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Bundle f8894o;

    public static h0 f(Activity activity) {
        h0 h0Var;
        WeakHashMap weakHashMap = f8891p;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (h0Var = (h0) weakReference.get()) != null) {
            return h0Var;
        }
        try {
            h0 h0Var2 = (h0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (h0Var2 == null || h0Var2.isRemoving()) {
                h0Var2 = new h0();
                activity.getFragmentManager().beginTransaction().add(h0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(h0Var2));
            return h0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f8892m.containsKey(str)) {
            this.f8892m.put(str, lifecycleCallback);
            if (this.f8893n > 0) {
                new e(Looper.getMainLooper()).post(new g0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f8892m.get(str));
    }

    public final Activity d() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.f8892m.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback e10 : this.f8892m.values()) {
            e10.e(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8893n = 1;
        this.f8894o = bundle;
        for (Map.Entry entry : this.f8892m.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f8893n = 5;
        for (LifecycleCallback g10 : this.f8892m.values()) {
            g10.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f8893n = 3;
        for (LifecycleCallback h10 : this.f8892m.values()) {
            h10.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f8892m.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f8893n = 2;
        for (LifecycleCallback j10 : this.f8892m.values()) {
            j10.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f8893n = 4;
        for (LifecycleCallback k10 : this.f8892m.values()) {
            k10.k();
        }
    }
}
