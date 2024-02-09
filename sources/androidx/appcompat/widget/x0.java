package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class x0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1094c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<x0>> f1095d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1096a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1097b;

    private x0(Context context) {
        super(context);
        if (g1.c()) {
            g1 g1Var = new g1(this, context.getResources());
            this.f1096a = g1Var;
            Resources.Theme newTheme = g1Var.newTheme();
            this.f1097b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1096a = new z0(this, context.getResources());
        this.f1097b = null;
    }

    private static boolean a(Context context) {
        return !(context instanceof x0) && !(context.getResources() instanceof z0) && !(context.getResources() instanceof g1) && g1.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1094c) {
            ArrayList<WeakReference<x0>> arrayList = f1095d;
            if (arrayList == null) {
                f1095d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1095d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1095d.remove(size);
                    }
                }
                for (int size2 = f1095d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1095d.get(size2);
                    x0 x0Var = weakReference2 != null ? (x0) weakReference2.get() : null;
                    if (x0Var != null && x0Var.getBaseContext() == context) {
                        return x0Var;
                    }
                }
            }
            x0 x0Var2 = new x0(context);
            f1095d.add(new WeakReference(x0Var2));
            return x0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1096a.getAssets();
    }

    public Resources getResources() {
        return this.f1096a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1097b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f1097b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
