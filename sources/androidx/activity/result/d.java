package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private Random f201a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f202b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f203c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, c> f204d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f205e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, b<?>> f206f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f207g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f208h = new Bundle();

    class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.a f210b;

        a(String str, e.a aVar) {
            this.f209a = str;
            this.f210b = aVar;
        }

        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = d.this.f203c.get(this.f209a);
            if (num != null) {
                d.this.f205e.add(this.f209a);
                try {
                    d.this.f(num.intValue(), this.f210b, i10, cVar);
                } catch (Exception e10) {
                    d.this.f205e.remove(this.f209a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f210b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            d.this.k(this.f209a);
        }
    }

    private static class b<O> {

        /* renamed from: a  reason: collision with root package name */
        final b<O> f212a;

        /* renamed from: b  reason: collision with root package name */
        final e.a<?, O> f213b;

        b(b<O> bVar, e.a<?, O> aVar) {
            this.f212a = bVar;
            this.f213b = aVar;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final g f214a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<j> f215b;

        /* access modifiers changed from: package-private */
        public void a() {
            Iterator<j> it = this.f215b.iterator();
            while (it.hasNext()) {
                this.f214a.c(it.next());
            }
            this.f215b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f202b.put(Integer.valueOf(i10), str);
        this.f203c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, b<O> bVar) {
        if (bVar == null || bVar.f212a == null || !this.f205e.contains(str)) {
            this.f207g.remove(str);
            this.f208h.putParcelable(str, new a(i10, intent));
            return;
        }
        bVar.f212a.a(bVar.f213b.c(i10, intent));
        this.f205e.remove(str);
    }

    private int e() {
        int nextInt = this.f201a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f202b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f201a.nextInt(2147418112);
        }
    }

    private void j(String str) {
        if (this.f203c.get(str) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f202b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f206f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        b<O> bVar;
        String str = this.f202b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        b bVar2 = this.f206f.get(str);
        if (bVar2 == null || (bVar = bVar2.f212a) == null) {
            this.f208h.remove(str);
            this.f207g.put(str, o10);
            return true;
        } else if (!this.f205e.remove(str)) {
            return true;
        } else {
            bVar.a(o10);
            return true;
        }
    }

    public abstract <I, O> void f(int i10, e.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f205e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f201a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f208h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f203c.containsKey(str)) {
                        Integer remove = this.f203c.remove(str);
                        if (!this.f208h.containsKey(str)) {
                            this.f202b.remove(remove);
                        }
                    }
                    a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f203c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f203c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f205e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f208h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f201a);
    }

    public final <I, O> c<I> i(String str, e.a<I, O> aVar, b<O> bVar) {
        j(str);
        this.f206f.put(str, new b(bVar, aVar));
        if (this.f207g.containsKey(str)) {
            Object obj = this.f207g.get(str);
            this.f207g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f208h.getParcelable(str);
        if (aVar2 != null) {
            this.f208h.remove(str);
            bVar.a(aVar.c(aVar2.b(), aVar2.a()));
        }
        return new a(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void k(String str) {
        Integer remove;
        if (!this.f205e.contains(str) && (remove = this.f203c.remove(str)) != null) {
            this.f202b.remove(remove);
        }
        this.f206f.remove(str);
        if (this.f207g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f207g.get(str));
            this.f207g.remove(str);
        }
        if (this.f208h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f208h.getParcelable(str));
            this.f208h.remove(str);
        }
        c cVar = this.f204d.get(str);
        if (cVar != null) {
            cVar.a();
            this.f204d.remove(str);
        }
    }
}
