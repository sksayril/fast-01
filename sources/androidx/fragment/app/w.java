package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final j f2593a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f2594b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f2595c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f2596d;

    /* renamed from: e  reason: collision with root package name */
    int f2597e;

    /* renamed from: f  reason: collision with root package name */
    int f2598f;

    /* renamed from: g  reason: collision with root package name */
    int f2599g;

    /* renamed from: h  reason: collision with root package name */
    int f2600h;

    /* renamed from: i  reason: collision with root package name */
    boolean f2601i;

    /* renamed from: j  reason: collision with root package name */
    boolean f2602j = true;

    /* renamed from: k  reason: collision with root package name */
    String f2603k;

    /* renamed from: l  reason: collision with root package name */
    int f2604l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f2605m;

    /* renamed from: n  reason: collision with root package name */
    int f2606n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f2607o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f2608p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f2609q;

    /* renamed from: r  reason: collision with root package name */
    boolean f2610r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f2611s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f2612a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f2613b;

        /* renamed from: c  reason: collision with root package name */
        int f2614c;

        /* renamed from: d  reason: collision with root package name */
        int f2615d;

        /* renamed from: e  reason: collision with root package name */
        int f2616e;

        /* renamed from: f  reason: collision with root package name */
        int f2617f;

        /* renamed from: g  reason: collision with root package name */
        g.b f2618g;

        /* renamed from: h  reason: collision with root package name */
        g.b f2619h;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f2612a = i10;
            this.f2613b = fragment;
            g.b bVar = g.b.RESUMED;
            this.f2618g = bVar;
            this.f2619h = bVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
        this.f2593a = jVar;
        this.f2594b = classLoader;
    }

    public w b(int i10, Fragment fragment, String str) {
        j(i10, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.S = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public w d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f2595c.add(aVar);
        aVar.f2614c = this.f2596d;
        aVar.f2615d = this.f2597e;
        aVar.f2616e = this.f2598f;
        aVar.f2617f = this.f2599g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public w i() {
        if (!this.f2601i) {
            this.f2602j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void j(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.K;
            if (str2 == null || str.equals(str2)) {
                fragment.K = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.K + " now " + str);
            }
        }
        if (i10 != 0) {
            if (i10 != -1) {
                int i12 = fragment.I;
                if (i12 == 0 || i12 == i10) {
                    fragment.I = i10;
                    fragment.J = i10;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.I + " now " + i10);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i11, fragment));
    }

    public w k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w l(boolean z9) {
        this.f2610r = z9;
        return this;
    }
}
