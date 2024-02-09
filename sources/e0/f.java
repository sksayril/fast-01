package e0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.h;
import androidx.emoji2.text.d;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f8303a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f8304a;

        /* renamed from: b  reason: collision with root package name */
        private final d f8305b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f8306c = true;

        a(TextView textView) {
            this.f8304a = textView;
            this.f8305b = new d(textView);
        }

        private InputFilter[] d(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f8305b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f8305b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e10 = e(inputFilterArr);
            if (e10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e10.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (e10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void i() {
            this.f8304a.setFilters(a(this.f8304a.getFilters()));
        }

        private TransformationMethod k(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f8306c ? f(inputFilterArr) : d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z9) {
            if (z9) {
                j();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z9) {
            this.f8306c = z9;
            j();
            i();
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z9) {
            this.f8306c = z9;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f8304a.setTransformationMethod(l(this.f8304a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod l(TransformationMethod transformationMethod) {
            return this.f8306c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z9) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z9) {
            throw null;
        }
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f8307a;

        c(TextView textView) {
            this.f8307a = new a(textView);
        }

        private boolean d() {
            return !d.h();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f8307a.a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z9) {
            if (!d()) {
                this.f8307a.b(z9);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z9) {
            if (d()) {
                this.f8307a.g(z9);
            } else {
                this.f8307a.c(z9);
            }
        }
    }

    public f(TextView textView, boolean z9) {
        h.k(textView, "textView cannot be null");
        this.f8303a = !z9 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f8303a.a(inputFilterArr);
    }

    public void b(boolean z9) {
        this.f8303a.b(z9);
    }

    public void c(boolean z9) {
        this.f8303a.c(z9);
    }
}
