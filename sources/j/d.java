package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import f.i;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f10724a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f10725b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f10726c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f10727d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f10728e;

    public d() {
        super((Context) null);
    }

    public d(Context context, int i10) {
        super(context);
        this.f10724a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f10725b = theme;
    }

    private Resources b() {
        if (this.f10728e == null) {
            Configuration configuration = this.f10727d;
            this.f10728e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f10728e;
    }

    private void d() {
        boolean z9 = this.f10725b == null;
        if (z9) {
            this.f10725b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10725b.setTo(theme);
            }
        }
        e(this.f10725b, this.f10724a, z9);
    }

    public void a(Configuration configuration) {
        if (this.f10728e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f10727d == null) {
            this.f10727d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f10724a;
    }

    /* access modifiers changed from: protected */
    public void e(Resources.Theme theme, int i10, boolean z9) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10726c == null) {
            this.f10726c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10726c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10725b;
        if (theme != null) {
            return theme;
        }
        if (this.f10724a == 0) {
            this.f10724a = i.Theme_AppCompat_Light;
        }
        d();
        return this.f10725b;
    }

    public void setTheme(int i10) {
        if (this.f10724a != i10) {
            this.f10724a = i10;
            d();
        }
    }
}
