package e0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f8301a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8302b;

    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return d.f(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    e(KeyListener keyListener, a aVar) {
        this.f8301a = keyListener;
        this.f8302b = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f8301a.clearMetaKeyState(view, editable, i10);
    }

    public int getInputType() {
        return this.f8301a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f8302b.a(editable, i10, keyEvent) || this.f8301a.onKeyDown(view, editable, i10, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f8301a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f8301a.onKeyUp(view, editable, i10, keyEvent);
    }
}
