package androidx.browser.customtabs;

import android.os.Bundle;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1112a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1113b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1114c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1115d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    public static final class C0010a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1116a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1117b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1118c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1119d;

        public a a() {
            return new a(this.f1116a, this.f1117b, this.f1118c, this.f1119d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1112a = num;
        this.f1113b = num2;
        this.f1114c = num3;
        this.f1115d = num4;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1112a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1113b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1114c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1115d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
