package o2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import e2.e;
import h2.c0;
import java.util.LinkedList;
import o2.c;

public abstract class a<T extends c> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f11581a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bundle f11582b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public LinkedList f11583c;

    /* renamed from: d  reason: collision with root package name */
    private final e f11584d = new f(this);

    public static void i(FrameLayout frameLayout) {
        e m10 = e.m();
        Context context = frameLayout.getContext();
        int g10 = m10.g(context);
        String d10 = c0.d(context, g10);
        String c10 = c0.c(context, g10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d10);
        linearLayout.addView(textView);
        Intent b10 = m10.b(context, g10, (String) null);
        if (b10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, b10));
        }
    }

    private final void n(int i10) {
        while (!this.f11583c.isEmpty() && ((k) this.f11583c.getLast()).b() >= i10) {
            this.f11583c.removeLast();
        }
    }

    private final void o(Bundle bundle, k kVar) {
        c cVar = this.f11581a;
        if (cVar != null) {
            kVar.a(cVar);
            return;
        }
        if (this.f11583c == null) {
            this.f11583c = new LinkedList();
        }
        this.f11583c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f11582b;
            if (bundle2 == null) {
                this.f11582b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f11584d);
    }

    /* access modifiers changed from: protected */
    public abstract void a(e<T> eVar);

    public T b() {
        return this.f11581a;
    }

    public void c(Bundle bundle) {
        o(bundle, new g(this, bundle));
    }

    public void d() {
        c cVar = this.f11581a;
        if (cVar != null) {
            cVar.T();
        } else {
            n(1);
        }
    }

    public void e() {
        o((Bundle) null, new j(this));
    }

    public void f(Bundle bundle) {
        c cVar = this.f11581a;
        if (cVar != null) {
            cVar.l(bundle);
            return;
        }
        Bundle bundle2 = this.f11582b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void g() {
        o((Bundle) null, new i(this));
    }

    public void h() {
        c cVar = this.f11581a;
        if (cVar != null) {
            cVar.D();
        } else {
            n(4);
        }
    }
}
