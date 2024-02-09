package g3;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f8920b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f8921a = new e();

        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f8921a.a(j3.a.c(eVar.f8924a, eVar2.f8924a, f10), j3.a.c(eVar.f8925b, eVar2.f8925b, f10), j3.a.c(eVar.f8926c, eVar2.f8926c, f10));
            return this.f8921a;
        }
    }

    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f8922a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: g3.d$d  reason: collision with other inner class name */
    public static class C0139d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f8923a = new C0139d("circularRevealScrimColor");

        private C0139d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f8924a;

        /* renamed from: b  reason: collision with root package name */
        public float f8925b;

        /* renamed from: c  reason: collision with root package name */
        public float f8926c;

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f8924a = f10;
            this.f8925b = f11;
            this.f8926c = f12;
        }

        public void a(float f10, float f11, float f12) {
            this.f8924a = f10;
            this.f8925b = f11;
            this.f8926c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
