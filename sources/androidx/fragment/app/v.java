package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class v {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f2590a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, u> f2591b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private q f2592c;

    v() {
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f2590a.contains(fragment)) {
            synchronized (this.f2590a) {
                this.f2590a.add(fragment);
            }
            fragment.f2326x = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f2591b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f2591b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        for (u next : this.f2591b.values()) {
            if (next != null) {
                next.t(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2591b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u next : this.f2591b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment k10 = next.k();
                    printWriter.println(k10);
                    k10.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2590a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2590a.get(i10).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment f(String str) {
        u uVar = this.f2591b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f2590a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2590a.get(size);
            if (fragment != null && fragment.I == i10) {
                return fragment;
            }
        }
        for (u next : this.f2591b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (k10.I == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2590a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2590a.get(size);
                if (fragment != null && str.equals(fragment.K)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u next : this.f2591b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                if (str.equals(k10.K)) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment m10;
        for (u next : this.f2591b.values()) {
            if (next != null && (m10 = next.k().m(str)) != null) {
                return m10;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.S;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2590a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f2590a.get(i10);
            if (fragment2.S == viewGroup && (view2 = fragment2.T) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2590a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2590a.get(indexOf);
            if (fragment3.S == viewGroup && (view = fragment3.T) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u next : this.f2591b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.f2591b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public u m(String str) {
        return this.f2591b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f2590a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2590a) {
            arrayList = new ArrayList(this.f2590a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public q o() {
        return this.f2592c;
    }

    /* access modifiers changed from: package-private */
    public void p(u uVar) {
        Fragment k10 = uVar.k();
        if (!c(k10.f2320r)) {
            this.f2591b.put(k10.f2320r, uVar);
            if (k10.O) {
                if (k10.N) {
                    this.f2592c.e(k10);
                } else {
                    this.f2592c.m(k10);
                }
                k10.O = false;
            }
            if (n.E0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(u uVar) {
        Fragment k10 = uVar.k();
        if (k10.N) {
            this.f2592c.m(k10);
        }
        if (this.f2591b.put(k10.f2320r, (Object) null) != null && n.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.f2590a.iterator();
        while (it.hasNext()) {
            u uVar = this.f2591b.get(it.next().f2320r);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u next : this.f2591b.values()) {
            if (next != null) {
                next.m();
                Fragment k10 = next.k();
                if (k10.f2327y && !k10.Z()) {
                    q(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f2590a) {
            this.f2590a.remove(fragment);
        }
        fragment.f2326x = false;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f2591b.clear();
    }

    /* access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f2590a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f10 = f(next);
                if (f10 != null) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.f2591b.size());
        for (u next : this.f2591b.values()) {
            if (next != null) {
                Fragment k10 = next.k();
                t r9 = next.r();
                arrayList.add(r9);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + r9.f2581y);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f2590a) {
            if (this.f2590a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2590a.size());
            Iterator<Fragment> it = this.f2590a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2320r);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2320r + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public void x(q qVar) {
        this.f2592c = qVar;
    }
}
