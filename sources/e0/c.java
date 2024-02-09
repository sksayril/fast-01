package e0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.d;

final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f8295a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8296b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
            return d.e(inputConnection, editable, i10, i11, z9);
        }

        public void b(EditorInfo editorInfo) {
            if (d.h()) {
                d.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f8295a = textView;
        this.f8296b = aVar;
        aVar.b(editorInfo);
    }

    private Editable a() {
        return this.f8295a.getEditableText();
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f8296b.a(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f8296b.a(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
