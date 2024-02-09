package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.embedding.engine.systemchannels.e;
import io.flutter.plugin.editing.b;
import java.util.HashSet;
import java.util.Map;

public class s implements b.a, e.b {

    /* renamed from: a  reason: collision with root package name */
    protected final d[] f9771a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<KeyEvent> f9772b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final e f9773c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f9774a = 0;

        /* access modifiers changed from: package-private */
        public Character a(int i10) {
            char c10 = (char) i10;
            if ((Integer.MIN_VALUE & i10) != 0) {
                int i11 = i10 & Integer.MAX_VALUE;
                int i12 = this.f9774a;
                if (i12 != 0) {
                    i11 = KeyCharacterMap.getDeadChar(i12, i11);
                }
                this.f9774a = i11;
            } else {
                int i13 = this.f9774a;
                if (i13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                    if (deadChar > 0) {
                        c10 = (char) deadChar;
                    }
                    this.f9774a = 0;
                }
            }
            return Character.valueOf(c10);
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        final KeyEvent f9775a;

        /* renamed from: b  reason: collision with root package name */
        int f9776b;

        /* renamed from: c  reason: collision with root package name */
        boolean f9777c = false;

        private class a implements d.a {

            /* renamed from: a  reason: collision with root package name */
            boolean f9779a;

            private a() {
                this.f9779a = false;
            }

            public void a(boolean z9) {
                if (!this.f9779a) {
                    this.f9779a = true;
                    c cVar = c.this;
                    int i10 = cVar.f9776b - 1;
                    cVar.f9776b = i10;
                    boolean z10 = z9 | cVar.f9777c;
                    cVar.f9777c = z10;
                    if (i10 == 0 && !z10) {
                        s.this.e(cVar.f9775a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        c(KeyEvent keyEvent) {
            this.f9776b = s.this.f9771a.length;
            this.f9775a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z9);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        k7.c getBinaryMessenger();
    }

    public s(e eVar) {
        this.f9773c = eVar;
        this.f9771a = new d[]{new r(eVar.getBinaryMessenger()), new m(new io.flutter.embedding.engine.systemchannels.d(eVar.getBinaryMessenger()))};
        new io.flutter.embedding.engine.systemchannels.e(eVar.getBinaryMessenger()).b(this);
    }

    /* access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f9773c;
        if (eVar != null && !eVar.c(keyEvent)) {
            this.f9772b.add(keyEvent);
            this.f9773c.a(keyEvent);
            if (this.f9772b.remove(keyEvent)) {
                x6.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public Map<Long, Long> a() {
        return ((r) this.f9771a[0]).h();
    }

    public boolean b(KeyEvent keyEvent) {
        if (this.f9772b.remove(keyEvent)) {
            return false;
        }
        if (this.f9771a.length > 0) {
            c cVar = new c(keyEvent);
            for (d a10 : this.f9771a) {
                a10.a(keyEvent, cVar.a());
            }
            return true;
        }
        e(keyEvent);
        return true;
    }

    public void d() {
        int size = this.f9772b.size();
        if (size > 0) {
            x6.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
