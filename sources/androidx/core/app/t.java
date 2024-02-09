package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class t implements Iterable<Intent> {

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<Intent> f1383m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    private final Context f1384n;

    public interface a {
        Intent h();
    }

    private t(Context context) {
        this.f1384n = context;
    }

    public static t g(Context context) {
        return new t(context);
    }

    public t c(Intent intent) {
        this.f1383m.add(intent);
        return this;
    }

    public t d(Activity activity) {
        Intent h10 = activity instanceof a ? ((a) activity).h() : null;
        if (h10 == null) {
            h10 = j.a(activity);
        }
        if (h10 != null) {
            ComponentName component = h10.getComponent();
            if (component == null) {
                component = h10.resolveActivity(this.f1384n.getPackageManager());
            }
            f(component);
            c(h10);
        }
        return this;
    }

    public t f(ComponentName componentName) {
        int size = this.f1383m.size();
        try {
            Context context = this.f1384n;
            while (true) {
                Intent b10 = j.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f1383m.add(size, b10);
                context = this.f1384n;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void i() {
        k((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1383m.iterator();
    }

    public void k(Bundle bundle) {
        if (!this.f1383m.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f1383m.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.l(this.f1384n, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1384n.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
