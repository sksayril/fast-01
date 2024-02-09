package f3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p.g;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g<String, i> f8767a = new g<>();

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.g(objectAnimator.getPropertyName(), i.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static h b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static h c(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(hVar, list.get(i10));
        }
        return hVar;
    }

    public i d(String str) {
        if (f(str)) {
            return this.f8767a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long e() {
        int size = this.f8767a.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i m10 = this.f8767a.m(i10);
            j10 = Math.max(j10, m10.c() + m10.d());
        }
        return j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8767a.equals(((h) obj).f8767a);
    }

    public boolean f(String str) {
        return this.f8767a.get(str) != null;
    }

    public void g(String str, i iVar) {
        this.f8767a.put(str, iVar);
    }

    public int hashCode() {
        return this.f8767a.hashCode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f8767a + "}\n";
    }
}
