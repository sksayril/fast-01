package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: m  reason: collision with root package name */
    private final EditText f8308m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8309n;

    /* renamed from: o  reason: collision with root package name */
    private d.e f8310o;

    /* renamed from: p  reason: collision with root package name */
    private int f8311p = Integer.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    private int f8312q = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8313r;

    private static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f8314a;

        a(EditText editText) {
            this.f8314a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b(this.f8314a.get(), 1);
        }
    }

    g(EditText editText, boolean z9) {
        this.f8308m = editText;
        this.f8309n = z9;
        this.f8313r = true;
    }

    private d.e a() {
        if (this.f8310o == null) {
            this.f8310o = new a(this.f8308m);
        }
        return this.f8310o;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return !this.f8313r || (!this.f8309n && !d.h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z9) {
        if (this.f8313r != z9) {
            if (this.f8310o != null) {
                d.b().t(this.f8310o);
            }
            this.f8313r = z9;
            if (z9) {
                b(this.f8308m, d.b().d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f8308m.isInEditMode() && !d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int d10 = d.b().d();
            if (d10 != 0) {
                if (d10 == 1) {
                    d.b().r((Spannable) charSequence, i10, i10 + i12, this.f8311p, this.f8312q);
                    return;
                } else if (d10 != 3) {
                    return;
                }
            }
            d.b().s(a());
        }
    }
}
