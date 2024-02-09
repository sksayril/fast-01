package e8;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import k7.j;
import k7.k;
import kotlin.jvm.internal.l;

public final class c implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private Context f8527m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Toast f8528n;

    public static final class a extends Toast.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8529a;

        a(c cVar) {
            this.f8529a = cVar;
        }

        public void onToastHidden() {
            c.super.onToastHidden();
            this.f8529a.f8528n = null;
        }
    }

    public c(Context context) {
        l.e(context, "context");
        this.f8527m = context;
    }

    /* access modifiers changed from: private */
    public static final void c(c cVar) {
        l.e(cVar, "this$0");
        Toast toast = cVar.f8528n;
        if (toast != null) {
            toast.show();
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Toast toast;
        l.e(jVar, "call");
        l.e(dVar, "result");
        String str = jVar.f10996a;
        View view = null;
        if (l.a(str, "showToast")) {
            String valueOf = String.valueOf(jVar.a("msg"));
            String valueOf2 = String.valueOf(jVar.a("length"));
            String valueOf3 = String.valueOf(jVar.a("gravity"));
            Number number = (Number) jVar.a("bgcolor");
            Number number2 = (Number) jVar.a("textcolor");
            Number number3 = (Number) jVar.a("fontSize");
            int i10 = l.a(valueOf3, "top") ? 48 : l.a(valueOf3, "center") ? 17 : 80;
            boolean a10 = l.a(valueOf2, "long");
            if (number == null || Build.VERSION.SDK_INT > 31) {
                Toast makeText = Toast.makeText(this.f8527m, valueOf, a10 ? 1 : 0);
                this.f8528n = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText != null) {
                        try {
                            view = makeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    l.b(view);
                    View findViewById = view.findViewById(16908299);
                    l.d(findViewById, "findViewById(...)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f8527m.getSystemService("layout_inflater");
                l.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(f.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(e.f8530a);
                textView2.setText(valueOf);
                Drawable drawable = this.f8527m.getDrawable(d.corner);
                l.b(drawable);
                l.b(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f8527m);
                this.f8528n = toast2;
                toast2.setDuration(a10);
                Toast toast3 = this.f8528n;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 <= 31) {
                if (i10 != 17) {
                    Toast toast4 = this.f8528n;
                    if (i10 == 48 ? toast4 != null : toast4 != null) {
                        toast4.setGravity(i10, 0, 100);
                    }
                } else {
                    Toast toast5 = this.f8528n;
                    if (toast5 != null) {
                        toast5.setGravity(i10, 0, 0);
                    }
                }
            }
            Context context = this.f8527m;
            if (context instanceof Activity) {
                l.c(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new b(this));
            } else {
                Toast toast6 = this.f8528n;
                if (toast6 != null) {
                    toast6.show();
                }
            }
            if (i11 >= 30 && (toast = this.f8528n) != null) {
                toast.addCallback(new a(this));
            }
        } else if (l.a(str, "cancel")) {
            Toast toast7 = this.f8528n;
            if (toast7 != null) {
                if (toast7 != null) {
                    toast7.cancel();
                }
                this.f8528n = null;
            }
        } else {
            dVar.c();
            return;
        }
        dVar.a(Boolean.TRUE);
    }
}
