package e0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f8297a;

    /* renamed from: b  reason: collision with root package name */
    private d.e f8298b;

    private static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<TextView> f8299a;

        /* renamed from: b  reason: collision with root package name */
        private final Reference<d> f8300b;

        a(TextView textView, d dVar) {
            this.f8299a = new WeakReference(textView);
            this.f8300b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            super.b();
            TextView textView = this.f8299a.get();
            if (c(textView, this.f8300b.get()) && textView.isAttachedToWindow()) {
                CharSequence o10 = androidx.emoji2.text.d.b().o(textView.getText());
                int selectionStart = Selection.getSelectionStart(o10);
                int selectionEnd = Selection.getSelectionEnd(o10);
                textView.setText(o10);
                if (o10 instanceof Spannable) {
                    d.b((Spannable) o10, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f8297a = textView;
    }

    private d.e a() {
        if (this.f8298b == null) {
            this.f8298b = new a(this.f8297a, this);
        }
        return this.f8298b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f8297a.isInEditMode()) {
            return charSequence;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            boolean z9 = true;
            if (d10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f8297a.getText()) {
                    z9 = false;
                }
                if (!z9 || charSequence == null) {
                    return charSequence;
                }
                if (!(i10 == 0 && i11 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.d.b().p(charSequence, 0, charSequence.length());
            } else if (d10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d.b().s(a());
        return charSequence;
    }
}
