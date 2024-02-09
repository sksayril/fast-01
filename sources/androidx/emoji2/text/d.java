package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class d {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f2148n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f2149o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile d f2150p;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f2151a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set<e> f2152b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f2153c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f2154d;

    /* renamed from: e  reason: collision with root package name */
    private final b f2155e;

    /* renamed from: f  reason: collision with root package name */
    final g f2156f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f2157g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2158h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f2159i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2160j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2161k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2162l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C0043d f2163m;

    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile g f2164b;

        /* renamed from: c  reason: collision with root package name */
        private volatile l f2165c;

        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        class C0042a extends h {
            C0042a() {
            }

            public void a(Throwable th) {
                a.this.f2167a.m(th);
            }

            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(d dVar) {
            super(dVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f2167a.f2156f.a(new C0042a());
            } catch (Throwable th) {
                this.f2167a.m(th);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9) {
            return this.f2164b.h(charSequence, i10, i11, i12, z9);
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2165c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2167a.f2157g);
        }

        /* access modifiers changed from: package-private */
        public void d(l lVar) {
            if (lVar == null) {
                this.f2167a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2165c = lVar;
            l lVar2 = this.f2165c;
            i iVar = new i();
            C0043d a10 = this.f2167a.f2163m;
            d dVar = this.f2167a;
            this.f2164b = new g(lVar2, iVar, a10, dVar.f2158h, dVar.f2159i);
            this.f2167a.n();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final d f2167a;

        b(d dVar) {
            this.f2167a = dVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f2168a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2169b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2170c;

        /* renamed from: d  reason: collision with root package name */
        int[] f2171d;

        /* renamed from: e  reason: collision with root package name */
        Set<e> f2172e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2173f;

        /* renamed from: g  reason: collision with root package name */
        int f2174g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f2175h = 0;

        /* renamed from: i  reason: collision with root package name */
        C0043d f2176i = new g.b();

        protected c(g gVar) {
            androidx.core.util.h.k(gVar, "metadataLoader cannot be null.");
            this.f2168a = gVar;
        }

        /* access modifiers changed from: protected */
        public final g a() {
            return this.f2168a;
        }

        public c b(int i10) {
            this.f2175h = i10;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    public interface C0043d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class f implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final List<e> f2177m;

        /* renamed from: n  reason: collision with root package name */
        private final Throwable f2178n;

        /* renamed from: o  reason: collision with root package name */
        private final int f2179o;

        f(e eVar, int i10) {
            this(Arrays.asList(new e[]{(e) androidx.core.util.h.k(eVar, "initCallback cannot be null")}), i10, (Throwable) null);
        }

        f(Collection<e> collection, int i10) {
            this(collection, i10, (Throwable) null);
        }

        f(Collection<e> collection, int i10, Throwable th) {
            androidx.core.util.h.k(collection, "initCallbacks cannot be null");
            this.f2177m = new ArrayList(collection);
            this.f2179o = i10;
            this.f2178n = th;
        }

        public void run() {
            int size = this.f2177m.size();
            int i10 = 0;
            if (this.f2179o != 1) {
                while (i10 < size) {
                    this.f2177m.get(i10).a(this.f2178n);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f2177m.get(i10).b();
                i10++;
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    static class i {
        i() {
        }

        /* access modifiers changed from: package-private */
        public h a(f fVar) {
            return new n(fVar);
        }
    }

    private d(c cVar) {
        this.f2157g = cVar.f2169b;
        this.f2158h = cVar.f2170c;
        this.f2159i = cVar.f2171d;
        this.f2160j = cVar.f2173f;
        this.f2161k = cVar.f2174g;
        this.f2156f = cVar.f2168a;
        this.f2162l = cVar.f2175h;
        this.f2163m = cVar.f2176i;
        this.f2154d = new Handler(Looper.getMainLooper());
        p.b bVar = new p.b();
        this.f2152b = bVar;
        Set<e> set = cVar.f2172e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2172e);
        }
        this.f2155e = new a(this);
        l();
    }

    public static d b() {
        d dVar;
        synchronized (f2148n) {
            dVar = f2150p;
            androidx.core.util.h.l(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
        return g.c(inputConnection, editable, i10, i11, z9);
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        return g.d(editable, i10, keyEvent);
    }

    public static d g(c cVar) {
        d dVar = f2150p;
        if (dVar == null) {
            synchronized (f2148n) {
                dVar = f2150p;
                if (dVar == null) {
                    dVar = new d(cVar);
                    f2150p = dVar;
                }
            }
        }
        return dVar;
    }

    public static boolean h() {
        return f2150p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    /* JADX INFO: finally extract failed */
    private void l() {
        this.f2151a.writeLock().lock();
        try {
            if (this.f2162l == 0) {
                this.f2153c = 0;
            }
            this.f2151a.writeLock().unlock();
            if (d() == 0) {
                this.f2155e.a();
            }
        } catch (Throwable th) {
            this.f2151a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f2161k;
    }

    public int d() {
        this.f2151a.readLock().lock();
        try {
            return this.f2153c;
        } finally {
            this.f2151a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2160j;
    }

    public void k() {
        boolean z9 = true;
        if (this.f2162l != 1) {
            z9 = false;
        }
        androidx.core.util.h.l(z9, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!j()) {
            this.f2151a.writeLock().lock();
            try {
                if (this.f2153c != 0) {
                    this.f2153c = 0;
                    this.f2151a.writeLock().unlock();
                    this.f2155e.a();
                }
            } finally {
                this.f2151a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2151a.writeLock().lock();
        try {
            this.f2153c = 2;
            arrayList.addAll(this.f2152b);
            this.f2152b.clear();
            this.f2151a.writeLock().unlock();
            this.f2154d.post(new f(arrayList, this.f2153c, th));
        } catch (Throwable th2) {
            this.f2151a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f2151a.writeLock().lock();
        try {
            this.f2153c = 1;
            arrayList.addAll(this.f2152b);
            this.f2152b.clear();
            this.f2151a.writeLock().unlock();
            this.f2154d.post(new f((Collection<e>) arrayList, this.f2153c));
        } catch (Throwable th) {
            this.f2151a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        androidx.core.util.h.l(j(), "Not initialized yet");
        androidx.core.util.h.h(i10, "start cannot be negative");
        androidx.core.util.h.h(i11, "end cannot be negative");
        androidx.core.util.h.h(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.h.a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.a(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f2155e.b(charSequence, i10, i11, i12, i13 != 1 ? i13 != 2 ? this.f2157g : false : true);
    }

    public void s(e eVar) {
        androidx.core.util.h.k(eVar, "initCallback cannot be null");
        this.f2151a.writeLock().lock();
        try {
            if (this.f2153c != 1) {
                if (this.f2153c != 2) {
                    this.f2152b.add(eVar);
                }
            }
            this.f2154d.post(new f(eVar, this.f2153c));
        } finally {
            this.f2151a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        androidx.core.util.h.k(eVar, "initCallback cannot be null");
        this.f2151a.writeLock().lock();
        try {
            this.f2152b.remove(eVar);
        } finally {
            this.f2151a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2155e.c(editorInfo);
        }
    }
}
