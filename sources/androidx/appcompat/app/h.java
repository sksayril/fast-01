package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.l;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.y;
import androidx.core.view.x;
import f.j;
import j.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.g;

public class h {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final g<String, Constructor<? extends View>> sConstructorMap = new g<>();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sScreenReaderFocusable = {16844148};
    private final Object[] mConstructorArgs = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: m  reason: collision with root package name */
        private final View f388m;

        /* renamed from: n  reason: collision with root package name */
        private final String f389n;

        /* renamed from: o  reason: collision with root package name */
        private Method f390o;

        /* renamed from: p  reason: collision with root package name */
        private Context f391p;

        public a(View view, String str) {
            this.f388m = view;
            this.f389n = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f389n, new Class[]{View.class})) != null) {
                        this.f390o = method;
                        this.f391p = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f388m.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f388m.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f389n + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f388m.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f390o == null) {
                a(this.f388m.getContext());
            }
            try {
                this.f390o.invoke(this.f391p, new Object[]{view});
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
            if (obtainStyledAttributes.hasValue(0)) {
                x.h0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
            if (obtainStyledAttributes2.hasValue(0)) {
                x.i0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
            if (obtainStyledAttributes3.hasValue(0)) {
                x.u0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && x.K(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        g<String, Constructor<? extends View>> gVar = sConstructorMap;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i10 = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i10 < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i10]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i10++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z9, boolean z10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8697v3, 0, 0);
        int resourceId = z9 ? obtainStyledAttributes.getResourceId(j.f8702w3, 0) : 0;
        if (z10 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(j.f8707x3, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof d) || ((d) context).c() != resourceId) ? new d(context, resourceId) : context : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f createButton(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.g createCheckBox(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public l createEditText(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public p createImageButton(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public r createImageView(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public s createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public v createRadioButton(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public w createRatingBar(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public y createSeekBar(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public a0 createSpinner(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public d0 createTextView(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z9, boolean z10, boolean z11, boolean z12) {
        View view2;
        Context context2 = (!z9 || view == null) ? context : view.getContext();
        if (z10 || z11) {
            context2 = themifyContext(context2, attributeSet, z10, z11);
        }
        if (z12) {
            context2 = x0.b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = 13;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                view2 = createRatingBar(context2, attributeSet);
                break;
            case 1:
                view2 = createCheckedTextView(context2, attributeSet);
                break;
            case 2:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 3:
                view2 = createTextView(context2, attributeSet);
                break;
            case 4:
                view2 = createImageButton(context2, attributeSet);
                break;
            case 5:
                view2 = createSeekBar(context2, attributeSet);
                break;
            case 6:
                view2 = createSpinner(context2, attributeSet);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                break;
            case 8:
                view2 = createToggleButton(context2, attributeSet);
                break;
            case 9:
                view2 = createImageView(context2, attributeSet);
                break;
            case 10:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = createCheckBox(context2, attributeSet);
                break;
            case 12:
                view2 = createEditText(context2, attributeSet);
                break;
            case 13:
                view2 = createButton(context2, attributeSet);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        verifyNotNull(view2, str);
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
            backportAccessibilityAttributes(context2, view2, attributeSet);
        }
        return view2;
    }
}
