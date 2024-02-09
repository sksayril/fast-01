package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class b extends g {

    /* renamed from: o  reason: collision with root package name */
    final AlertController f308o = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f309a;

        /* renamed from: b  reason: collision with root package name */
        private final int f310b;

        public a(Context context) {
            this(context, b.h(context, 0));
        }

        public a(Context context, int i10) {
            this.f309a = new AlertController.f(new ContextThemeWrapper(context, b.h(context, i10)));
            this.f310b = i10;
        }

        public b a() {
            b bVar = new b(this.f309a.f268a, this.f310b);
            this.f309a.a(bVar.f308o);
            bVar.setCancelable(this.f309a.f285r);
            if (this.f309a.f285r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f309a.f286s);
            bVar.setOnDismissListener(this.f309a.f287t);
            DialogInterface.OnKeyListener onKeyListener = this.f309a.f288u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f309a.f268a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f309a;
            fVar.f290w = listAdapter;
            fVar.f291x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f309a.f274g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f309a.f271d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f309a.f288u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f309a;
            fVar.f290w = listAdapter;
            fVar.f291x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f309a.f273f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i10) {
        super(context, h(context, i10));
    }

    static int h(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView g() {
        return this.f308o.d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f308o.e();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f308o.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f308o.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f308o.q(charSequence);
    }
}
