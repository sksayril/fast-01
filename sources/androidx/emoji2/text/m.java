package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class m extends SpannableStringBuilder {

    /* renamed from: m  reason: collision with root package name */
    private final Class<?> f2228m;

    /* renamed from: n  reason: collision with root package name */
    private final List<a> f2229n = new ArrayList();

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: m  reason: collision with root package name */
        final Object f2230m;

        /* renamed from: n  reason: collision with root package name */
        private final AtomicInteger f2231n = new AtomicInteger(0);

        a(Object obj) {
            this.f2230m = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof h;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f2231n.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2230m).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f2230m).beforeTextChanged(charSequence, i10, i11, i12);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f2231n.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f2231n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2230m).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            if (this.f2231n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2230m).onSpanChanged(spannable, obj, i10, i11, i12, i13);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f2231n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2230m).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f2230m).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    m(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        h.k(cls, "watcherClass cannot be null");
        this.f2228m = cls;
    }

    m(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        h.k(cls, "watcherClass cannot be null");
        this.f2228m = cls;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f2229n.size(); i10++) {
            this.f2229n.get(i10).a();
        }
    }

    public static m c(Class<?> cls, CharSequence charSequence) {
        return new m(cls, charSequence);
    }

    private void e() {
        for (int i10 = 0; i10 < this.f2229n.size(); i10++) {
            this.f2229n.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i10 = 0; i10 < this.f2229n.size(); i10++) {
            a aVar = this.f2229n.get(i10);
            if (aVar.f2230m == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class<?> cls) {
        return this.f2228m == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i10 = 0; i10 < this.f2229n.size(); i10++) {
            this.f2229n.get(i10).c();
        }
    }

    public void a() {
        b();
    }

    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    public void d() {
        i();
        e();
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public int getSpanEnd(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a f10;
        if (h(obj) && (f10 = f(obj)) != null) {
            obj = f10;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!g(cls)) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f2230m;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public int nextSpanTransition(int i10, int i11, Class<a> cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2229n.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f2229n.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new m(this.f2228m, this, i10, i11);
    }
}
