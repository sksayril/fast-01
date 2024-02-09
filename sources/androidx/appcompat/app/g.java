package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import j.b;

public class g extends Dialog implements d {

    /* renamed from: m  reason: collision with root package name */
    private e f385m;

    /* renamed from: n  reason: collision with root package name */
    private final f.a f386n = new a();

    class a implements f.a {
        a() {
        }

        public boolean c(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i10) {
        super(context, b(context, i10));
        e a10 = a();
        a10.D(b(context, i10));
        a10.q((Bundle) null);
    }

    private static int b(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f385m == null) {
            this.f385m = e.h(this, this);
        }
        return this.f385m;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void d(b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        a().r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.e(this.f386n, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i10) {
        return a().z(i10);
    }

    public b f(b.a aVar) {
        return null;
    }

    public <T extends View> T findViewById(int i10) {
        return a().i(i10);
    }

    public void i(b bVar) {
    }

    public void invalidateOptionsMenu() {
        a().o();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().w();
    }

    public void setContentView(int i10) {
        a().A(i10);
    }

    public void setContentView(View view) {
        a().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        a().E(getContext().getString(i10));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }
}
