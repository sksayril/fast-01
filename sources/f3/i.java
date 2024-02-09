package f3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f8768a;

    /* renamed from: b  reason: collision with root package name */
    private long f8769b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f8770c;

    /* renamed from: d  reason: collision with root package name */
    private int f8771d;

    /* renamed from: e  reason: collision with root package name */
    private int f8772e;

    public i(long j10, long j11) {
        this.f8770c = null;
        this.f8771d = 0;
        this.f8772e = 1;
        this.f8768a = j10;
        this.f8769b = j11;
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f8771d = 0;
        this.f8772e = 1;
        this.f8768a = j10;
        this.f8769b = j11;
        this.f8770c = timeInterpolator;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f8771d = valueAnimator.getRepeatCount();
        iVar.f8772e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f8755b : interpolator instanceof AccelerateInterpolator ? a.f8756c : interpolator instanceof DecelerateInterpolator ? a.f8757d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f8768a;
    }

    public long d() {
        return this.f8769b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f8770c;
        return timeInterpolator != null ? timeInterpolator : a.f8755b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f8771d;
    }

    public int h() {
        return this.f8772e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
