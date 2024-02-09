package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f1786a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<k> f1787b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<k, Object> f1788c = new HashMap();

    public i(Runnable runnable) {
        this.f1786a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<k> it = this.f1787b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void b(Menu menu) {
        Iterator<k> it = this.f1787b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean c(MenuItem menuItem) {
        Iterator<k> it = this.f1787b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d(Menu menu) {
        Iterator<k> it = this.f1787b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }
}
