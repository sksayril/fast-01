package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e implements s.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f525a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f526b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f527c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f528d;

    /* renamed from: e  reason: collision with root package name */
    private a f529e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f530f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f531g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f532h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f533i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f534j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f535k;

    /* renamed from: l  reason: collision with root package name */
    private int f536l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f537m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f538n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f539o;

    /* renamed from: p  reason: collision with root package name */
    View f540p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f541q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f542r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f543s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f544t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f545u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f546v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f547w = new CopyOnWriteArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private g f548x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f549y = false;

    /* renamed from: z  reason: collision with root package name */
    private boolean f550z;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f525a = context;
        this.f526b = context.getResources();
        this.f530f = new ArrayList<>();
        this.f531g = new ArrayList<>();
        this.f532h = true;
        this.f533i = new ArrayList<>();
        this.f534j = new ArrayList<>();
        this.f535k = true;
        b0(true);
    }

    private static int B(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z9) {
        if (i10 >= 0 && i10 < this.f530f.size()) {
            this.f530f.remove(i10);
            if (z9) {
                K(true);
            }
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f540p = view;
            this.f538n = null;
            this.f539o = null;
        } else {
            if (i10 > 0) {
                this.f538n = C.getText(i10);
            } else if (charSequence != null) {
                this.f538n = charSequence;
            }
            if (i11 > 0) {
                this.f539o = androidx.core.content.a.e(u(), i11);
            } else if (drawable != null) {
                this.f539o = drawable;
            }
            this.f540p = null;
        }
        K(false);
    }

    private void b0(boolean z9) {
        boolean z10 = true;
        if (!z9 || this.f526b.getConfiguration().keyboard == 1 || !z.e(ViewConfiguration.get(this.f525a), this.f525a)) {
            z10 = false;
        }
        this.f528d = z10;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z9) {
        if (!this.f547w.isEmpty()) {
            d0();
            Iterator<WeakReference<j>> it = this.f547w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f547w.remove(next);
                } else {
                    jVar.f(z9);
                }
            }
            c0();
        }
    }

    private boolean j(m mVar, j jVar) {
        boolean z9 = false;
        if (this.f547w.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z9 = jVar.e(mVar);
        }
        Iterator<WeakReference<j>> it = this.f547w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null) {
                this.f547w.remove(next);
            } else if (!z9) {
                z9 = jVar2.e(mVar);
            }
        }
        return z9;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f544t;
    }

    /* access modifiers changed from: package-private */
    public Resources C() {
        return this.f526b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.f532h) {
            return this.f531g;
        }
        this.f531g.clear();
        int size = this.f530f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f530f.get(i10);
            if (gVar.isVisible()) {
                this.f531g.add(gVar);
            }
        }
        this.f532h = false;
        this.f535k = true;
        return this.f531g;
    }

    public boolean F() {
        return this.f549y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f527c;
    }

    public boolean H() {
        return this.f528d;
    }

    /* access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f535k = true;
        K(true);
    }

    /* access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f532h = true;
        K(true);
    }

    public void K(boolean z9) {
        if (!this.f541q) {
            if (z9) {
                this.f532h = true;
                this.f535k = true;
            }
            i(z9);
            return;
        }
        this.f542r = true;
        if (z9) {
            this.f543s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, (j) null, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.e(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.e(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L_0x0063
            r2.f(r7)
        L_0x0063:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.M(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f547w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f547w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).P(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f529e = aVar;
    }

    public e S(int i10) {
        this.f536l = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f530f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f530f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    /* access modifiers changed from: protected */
    public e U(int i10) {
        W(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e X(int i10) {
        W(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public e Z(View view) {
        W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f536l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f537m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f530f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z9) {
        this.f550z = z9;
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f526b.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f526b.getString(i13));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f525a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f526b.getString(i10));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f526b.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f525a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f525a);
    }

    public void c(j jVar, Context context) {
        this.f547w.add(new WeakReference(jVar));
        jVar.d(context, this);
        this.f535k = true;
    }

    public void c0() {
        this.f541q = false;
        if (this.f542r) {
            this.f542r = false;
            K(this.f543s);
        }
    }

    public void clear() {
        g gVar = this.f548x;
        if (gVar != null) {
            f(gVar);
        }
        this.f530f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f539o = null;
        this.f538n = null;
        this.f540p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f529e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.f541q) {
            this.f541q = true;
            this.f542r = false;
            this.f543s = false;
        }
    }

    public final void e(boolean z9) {
        if (!this.f545u) {
            this.f545u = true;
            Iterator<WeakReference<j>> it = this.f547w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f547w.remove(next);
                } else {
                    jVar.b(this, z9);
                }
            }
            this.f545u = false;
        }
    }

    public boolean f(g gVar) {
        boolean z9 = false;
        if (!this.f547w.isEmpty() && this.f548x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f547w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f547w.remove(next);
                } else {
                    z9 = jVar.i(this, gVar);
                    if (z9) {
                        break;
                    }
                }
            }
            c0();
            if (z9) {
                this.f548x = null;
            }
        }
        return z9;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f530f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i10) {
        return this.f530f.get(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f529e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.f550z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f530f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z9 = false;
        if (this.f547w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f547w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.f547w.remove(next);
            } else {
                z9 = jVar.j(this, gVar);
                if (z9) {
                    break;
                }
            }
        }
        c0();
        if (z9) {
            this.f548x = gVar;
        }
        return z9;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f530f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f530f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public g p(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f546v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == 8 && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    /* access modifiers changed from: package-private */
    public void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f530f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f530f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == 8 && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f535k) {
            Iterator<WeakReference<j>> it = this.f547w.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.f547w.remove(next);
                } else {
                    z9 |= jVar.g();
                }
            }
            if (z9) {
                this.f533i.clear();
                this.f534j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    (gVar.l() ? this.f533i : this.f534j).add(gVar);
                }
            } else {
                this.f533i.clear();
                this.f534j.clear();
                this.f534j.addAll(E());
            }
            this.f535k = false;
        }
    }

    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f530f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f530f.get(l10).getGroupId() != i10) {
                    K(true);
                } else {
                    N(l10, false);
                    i11 = i12;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f533i;
    }

    public void setGroupCheckable(int i10, boolean z9, boolean z10) {
        int size = this.f530f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f530f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z10);
                gVar.setCheckable(z9);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z9) {
        this.f549y = z9;
    }

    public void setGroupEnabled(int i10, boolean z9) {
        int size = this.f530f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f530f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z9);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z9) {
        int size = this.f530f.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f530f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z9)) {
                z10 = true;
            }
        }
        if (z10) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z9) {
        this.f527c = z9;
        K(false);
    }

    public int size() {
        return this.f530f.size();
    }

    /* access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f525a;
    }

    public g v() {
        return this.f548x;
    }

    public Drawable w() {
        return this.f539o;
    }

    public CharSequence x() {
        return this.f538n;
    }

    public View y() {
        return this.f540p;
    }

    public ArrayList<g> z() {
        r();
        return this.f534j;
    }
}
