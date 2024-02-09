package e0;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f8287a;

    /* renamed from: b  reason: collision with root package name */
    private int f8288b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f8289c = 0;

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    private static class C0129a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f8290a;

        /* renamed from: b  reason: collision with root package name */
        private final g f8291b;

        C0129a(EditText editText, boolean z9) {
            this.f8290a = editText;
            g gVar = new g(editText, z9);
            this.f8291b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f8290a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z9) {
            this.f8291b.c(z9);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z9) {
            throw null;
        }
    }

    public a(EditText editText, boolean z9) {
        h.k(editText, "editText cannot be null");
        this.f8287a = new C0129a(editText, z9);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f8287a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f8287a.b(inputConnection, editorInfo);
    }

    public void c(boolean z9) {
        this.f8287a.c(z9);
    }
}
