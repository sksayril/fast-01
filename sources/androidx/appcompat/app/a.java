package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import f.j;
import j.b;

public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0005a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f307a = 8388627;

        public C0005a(int i10, int i11) {
            super(i10, i11);
        }

        public C0005a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8683t);
            this.f307a = obtainStyledAttributes.getInt(j.f8688u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0005a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0005a(C0005a aVar) {
            super(aVar);
            this.f307a = aVar.f307a;
        }
    }

    public interface b {
        void a(boolean z9);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z9);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    /* access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z9);

    public abstract void s(boolean z9);

    public abstract void t(CharSequence charSequence);

    public abstract j.b u(b.a aVar);
}
