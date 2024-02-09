package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends w implements n.C0048n {

    /* renamed from: t  reason: collision with root package name */
    final n f2362t;

    /* renamed from: u  reason: collision with root package name */
    boolean f2363u;

    /* renamed from: v  reason: collision with root package name */
    int f2364v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().h().getClassLoader() : null);
        this.f2364v = -1;
        this.f2362t = nVar;
    }

    private static boolean w(w.a aVar) {
        Fragment fragment = aVar.f2613b;
        return fragment != null && fragment.f2326x && fragment.T != null && !fragment.M && !fragment.L && fragment.b0();
    }

    /* access modifiers changed from: package-private */
    public Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2595c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f2595c.get(size);
            int i10 = aVar.f2612a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2613b;
                            break;
                        case 10:
                            aVar.f2619h = aVar.f2618g;
                            break;
                    }
                }
                arrayList.add(aVar.f2613b);
            }
            arrayList.remove(aVar.f2613b);
        }
        return fragment;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2601i) {
            return true;
        }
        this.f2362t.e(this);
        return true;
    }

    public int f() {
        return n(false);
    }

    public int g() {
        return n(true);
    }

    public void h() {
        i();
        this.f2362t.b0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void j(int i10, Fragment fragment, String str, int i11) {
        super.j(i10, fragment, str, i11);
        fragment.E = this.f2362t;
    }

    public w k(Fragment fragment) {
        n nVar = fragment.E;
        if (nVar == null || nVar == this.f2362t) {
            return super.k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        if (this.f2601i) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f2595c.size();
            for (int i11 = 0; i11 < size; i11++) {
                w.a aVar = this.f2595c.get(i11);
                Fragment fragment = aVar.f2613b;
                if (fragment != null) {
                    fragment.D += i10;
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2613b + " to " + aVar.f2613b.D);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int n(boolean z9) {
        if (!this.f2363u) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                o("  ", printWriter);
                printWriter.close();
            }
            this.f2363u = true;
            this.f2364v = this.f2601i ? this.f2362t.i() : -1;
            this.f2362t.Y(this, z9);
            return this.f2364v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2603k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2364v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2363u);
            if (this.f2600h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2600h));
            }
            if (!(this.f2596d == 0 && this.f2597e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2596d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2597e));
            }
            if (!(this.f2598f == 0 && this.f2599g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2598f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2599g));
            }
            if (!(this.f2604l == 0 && this.f2605m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2604l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2605m);
            }
            if (!(this.f2606n == 0 && this.f2607o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2606n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2607o);
            }
        }
        if (!this.f2595c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2595c.size();
            for (int i10 = 0; i10 < size; i10++) {
                w.a aVar = this.f2595c.get(i10);
                switch (aVar.f2612a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2612a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2613b);
                if (z9) {
                    if (!(aVar.f2614c == 0 && aVar.f2615d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2614c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2615d));
                    }
                    if (aVar.f2616e != 0 || aVar.f2617f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2616e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2617f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        int size = this.f2595c.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.a aVar = this.f2595c.get(i10);
            Fragment fragment = aVar.f2613b;
            if (fragment != null) {
                fragment.z1(false);
                fragment.x1(this.f2600h);
                fragment.B1(this.f2608p, this.f2609q);
            }
            switch (aVar.f2612a) {
                case 1:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, false);
                    this.f2362t.g(fragment);
                    break;
                case 3:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.Z0(fragment);
                    break;
                case 4:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.B0(fragment);
                    break;
                case 5:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, false);
                    this.f2362t.k1(fragment);
                    break;
                case 6:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.x(fragment);
                    break;
                case 7:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, false);
                    this.f2362t.k(fragment);
                    break;
                case 8:
                    this.f2362t.i1(fragment);
                    break;
                case 9:
                    this.f2362t.i1((Fragment) null);
                    break;
                case 10:
                    this.f2362t.h1(fragment, aVar.f2619h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2612a);
            }
            if (!this.f2610r && aVar.f2612a != 1 && fragment != null && !n.P) {
                this.f2362t.M0(fragment);
            }
        }
        if (!this.f2610r && !n.P) {
            n nVar = this.f2362t;
            nVar.N0(nVar.f2520q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z9) {
        for (int size = this.f2595c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f2595c.get(size);
            Fragment fragment = aVar.f2613b;
            if (fragment != null) {
                fragment.z1(true);
                fragment.x1(n.d1(this.f2600h));
                fragment.B1(this.f2609q, this.f2608p);
            }
            switch (aVar.f2612a) {
                case 1:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, true);
                    this.f2362t.Z0(fragment);
                    break;
                case 3:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g(fragment);
                    break;
                case 4:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.k1(fragment);
                    break;
                case 5:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, true);
                    this.f2362t.B0(fragment);
                    break;
                case 6:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.k(fragment);
                    break;
                case 7:
                    fragment.s1(aVar.f2614c, aVar.f2615d, aVar.f2616e, aVar.f2617f);
                    this.f2362t.g1(fragment, true);
                    this.f2362t.x(fragment);
                    break;
                case 8:
                    this.f2362t.i1((Fragment) null);
                    break;
                case 9:
                    this.f2362t.i1(fragment);
                    break;
                case 10:
                    this.f2362t.h1(fragment, aVar.f2618g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2612a);
            }
            if (!this.f2610r && aVar.f2612a != 3 && fragment != null && !n.P) {
                this.f2362t.M0(fragment);
            }
        }
        if (!this.f2610r && z9 && !n.P) {
            n nVar = this.f2362t;
            nVar.N0(nVar.f2520q, true);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f2595c.size()) {
            w.a aVar = this.f2595c.get(i10);
            int i11 = aVar.f2612a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f2613b;
                    int i12 = fragment3.J;
                    boolean z9 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.J == i12) {
                            if (fragment4 == fragment3) {
                                z9 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2595c.add(i10, new w.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                w.a aVar2 = new w.a(3, fragment4);
                                aVar2.f2614c = aVar.f2614c;
                                aVar2.f2616e = aVar.f2616e;
                                aVar2.f2615d = aVar.f2615d;
                                aVar2.f2617f = aVar.f2617f;
                                this.f2595c.add(i10, aVar2);
                                arrayList2.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z9) {
                        this.f2595c.remove(i10);
                        i10--;
                    } else {
                        aVar.f2612a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f2613b);
                    Fragment fragment5 = aVar.f2613b;
                    if (fragment5 == fragment2) {
                        this.f2595c.add(i10, new w.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f2595c.add(i10, new w.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f2613b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f2613b);
            i10++;
        }
        return fragment2;
    }

    public String t() {
        return this.f2603k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2364v >= 0) {
            sb.append(" #");
            sb.append(this.f2364v);
        }
        if (this.f2603k != null) {
            sb.append(" ");
            sb.append(this.f2603k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i10) {
        int size = this.f2595c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f2595c.get(i11).f2613b;
            int i12 = fragment != null ? fragment.J : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean v(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f2595c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f2595c.get(i13).f2613b;
            int i14 = fragment != null ? fragment.J : 0;
            if (!(i14 == 0 || i14 == i12)) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f2595c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f2595c.get(i16).f2613b;
                        if ((fragment2 != null ? fragment2.J : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        for (int i10 = 0; i10 < this.f2595c.size(); i10++) {
            if (w(this.f2595c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f2611s != null) {
            for (int i10 = 0; i10 < this.f2611s.size(); i10++) {
                this.f2611s.get(i10).run();
            }
            this.f2611s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void z(Fragment.h hVar) {
        for (int i10 = 0; i10 < this.f2595c.size(); i10++) {
            w.a aVar = this.f2595c.get(i10);
            if (w(aVar)) {
                aVar.f2613b.y1(hVar);
            }
        }
    }
}
