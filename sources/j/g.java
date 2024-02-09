package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.i0;
import androidx.core.view.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f10742e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f10743f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f10744a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f10745b;

    /* renamed from: c  reason: collision with root package name */
    Context f10746c;

    /* renamed from: d  reason: collision with root package name */
    private Object f10747d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f10748c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f10749a;

        /* renamed from: b  reason: collision with root package name */
        private Method f10750b;

        public a(Object obj, String str) {
            this.f10749a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10750b = cls.getMethod(str, f10748c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10750b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10750b.invoke(this.f10749a, new Object[]{menuItem})).booleanValue();
                }
                this.f10750b.invoke(this.f10749a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f10751a;

        /* renamed from: b  reason: collision with root package name */
        private int f10752b;

        /* renamed from: c  reason: collision with root package name */
        private int f10753c;

        /* renamed from: d  reason: collision with root package name */
        private int f10754d;

        /* renamed from: e  reason: collision with root package name */
        private int f10755e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10756f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f10757g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10758h;

        /* renamed from: i  reason: collision with root package name */
        private int f10759i;

        /* renamed from: j  reason: collision with root package name */
        private int f10760j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f10761k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f10762l;

        /* renamed from: m  reason: collision with root package name */
        private int f10763m;

        /* renamed from: n  reason: collision with root package name */
        private char f10764n;

        /* renamed from: o  reason: collision with root package name */
        private int f10765o;

        /* renamed from: p  reason: collision with root package name */
        private char f10766p;

        /* renamed from: q  reason: collision with root package name */
        private int f10767q;

        /* renamed from: r  reason: collision with root package name */
        private int f10768r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f10769s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f10770t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f10771u;

        /* renamed from: v  reason: collision with root package name */
        private int f10772v;

        /* renamed from: w  reason: collision with root package name */
        private int f10773w;

        /* renamed from: x  reason: collision with root package name */
        private String f10774x;

        /* renamed from: y  reason: collision with root package name */
        private String f10775y;

        /* renamed from: z  reason: collision with root package name */
        private String f10776z;

        public b(Menu menu) {
            this.f10751a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f10746c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z9 = false;
            menuItem.setChecked(this.f10769s).setVisible(this.f10770t).setEnabled(this.f10771u).setCheckable(this.f10768r >= 1).setTitleCondensed(this.f10762l).setIcon(this.f10763m);
            int i10 = this.f10772v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f10776z != null) {
                if (!g.this.f10746c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f10776z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f10768r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f10774x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f10742e, g.this.f10744a));
                z9 = true;
            }
            int i11 = this.f10773w;
            if (i11 > 0) {
                if (!z9) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                j.a(menuItem, bVar);
            }
            j.c(menuItem, this.B);
            j.g(menuItem, this.C);
            j.b(menuItem, this.f10764n, this.f10765o);
            j.f(menuItem, this.f10766p, this.f10767q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                j.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                j.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f10758h = true;
            i(this.f10751a.add(this.f10752b, this.f10759i, this.f10760j, this.f10761k));
        }

        public SubMenu b() {
            this.f10758h = true;
            SubMenu addSubMenu = this.f10751a.addSubMenu(this.f10752b, this.f10759i, this.f10760j, this.f10761k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f10758h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f10746c.obtainStyledAttributes(attributeSet, f.j.f8660o1);
            this.f10752b = obtainStyledAttributes.getResourceId(f.j.f8670q1, 0);
            this.f10753c = obtainStyledAttributes.getInt(f.j.f8680s1, 0);
            this.f10754d = obtainStyledAttributes.getInt(f.j.f8685t1, 0);
            this.f10755e = obtainStyledAttributes.getInt(f.j.f8690u1, 0);
            this.f10756f = obtainStyledAttributes.getBoolean(f.j.f8675r1, true);
            this.f10757g = obtainStyledAttributes.getBoolean(f.j.f8665p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a1 t9 = a1.t(g.this.f10746c, attributeSet, f.j.f8695v1);
            this.f10759i = t9.m(f.j.f8710y1, 0);
            this.f10760j = (t9.j(f.j.B1, this.f10753c) & -65536) | (t9.j(f.j.C1, this.f10754d) & 65535);
            this.f10761k = t9.o(f.j.D1);
            this.f10762l = t9.o(f.j.E1);
            this.f10763m = t9.m(f.j.f8700w1, 0);
            this.f10764n = c(t9.n(f.j.F1));
            this.f10765o = t9.j(f.j.M1, 4096);
            this.f10766p = c(t9.n(f.j.G1));
            this.f10767q = t9.j(f.j.Q1, 4096);
            int i10 = f.j.H1;
            this.f10768r = t9.r(i10) ? t9.a(i10, false) : this.f10755e;
            this.f10769s = t9.a(f.j.f8715z1, false);
            this.f10770t = t9.a(f.j.A1, this.f10756f);
            this.f10771u = t9.a(f.j.f8705x1, this.f10757g);
            this.f10772v = t9.j(f.j.R1, -1);
            this.f10776z = t9.n(f.j.I1);
            this.f10773w = t9.m(f.j.J1, 0);
            this.f10774x = t9.n(f.j.L1);
            String n10 = t9.n(f.j.K1);
            this.f10775y = n10;
            boolean z9 = n10 != null;
            if (z9 && this.f10773w == 0 && this.f10774x == null) {
                this.A = (androidx.core.view.b) e(n10, g.f10743f, g.this.f10745b);
            } else {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = t9.o(f.j.N1);
            this.C = t9.o(f.j.S1);
            int i11 = f.j.P1;
            if (t9.r(i11)) {
                this.E = i0.d(t9.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = f.j.O1;
            if (t9.r(i12)) {
                this.D = t9.c(i12);
            } else {
                this.D = null;
            }
            t9.v();
            this.f10758h = false;
        }

        public void h() {
            this.f10752b = 0;
            this.f10753c = 0;
            this.f10754d = 0;
            this.f10755e = 0;
            this.f10756f = true;
            this.f10757g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f10742e = r0
            f10743f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f10746c = context;
        Object[] objArr = {context};
        this.f10744a = objArr;
        this.f10745b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z9 = false;
        boolean z10 = false;
        while (!z9) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z10 && name2.equals(str)) {
                            str = null;
                            z10 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                androidx.core.view.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z9 = true;
                        }
                    }
                } else if (!z10) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z10 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f10747d == null) {
            this.f10747d = a(this.f10746c);
        }
        return this.f10747d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof s.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f10746c.getResources().getLayout(i10);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
