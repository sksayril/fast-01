package e0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.m;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f8292a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f8293b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f8294c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f8294c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f8293b == null) {
            synchronized (f8292a) {
                if (f8293b == null) {
                    f8293b = new b();
                }
            }
        }
        return f8293b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f8294c;
        return cls != null ? m.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
