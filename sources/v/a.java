package v;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import v.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: m  reason: collision with root package name */
    protected boolean f12542m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f12543n;

    /* renamed from: o  reason: collision with root package name */
    protected Cursor f12544o;

    /* renamed from: p  reason: collision with root package name */
    protected Context f12545p;

    /* renamed from: q  reason: collision with root package name */
    protected int f12546q;

    /* renamed from: r  reason: collision with root package name */
    protected C0214a f12547r;

    /* renamed from: s  reason: collision with root package name */
    protected DataSetObserver f12548s;

    /* renamed from: t  reason: collision with root package name */
    protected b f12549t;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    private class C0214a extends ContentObserver {
        C0214a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z9) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f12542m = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12542m = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z9) {
        f(context, cursor, z9 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public Cursor b() {
        return this.f12544o;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        b bVar;
        boolean z9 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12543n = true;
        } else {
            this.f12543n = false;
        }
        if (cursor != null) {
            z9 = true;
        }
        this.f12544o = cursor;
        this.f12542m = z9;
        this.f12545p = context;
        this.f12546q = z9 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f12547r = new C0214a();
            bVar = new b();
        } else {
            bVar = null;
            this.f12547r = null;
        }
        this.f12548s = bVar;
        if (z9) {
            C0214a aVar = this.f12547r;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f12548s;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f12542m || (cursor = this.f12544o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12542m) {
            return null;
        }
        this.f12544o.moveToPosition(i10);
        if (view == null) {
            view = g(this.f12545p, this.f12544o, viewGroup);
        }
        e(view, this.f12545p, this.f12544o);
        return view;
    }

    public Filter getFilter() {
        if (this.f12549t == null) {
            this.f12549t = new b(this);
        }
        return this.f12549t;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f12542m || (cursor = this.f12544o) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f12544o;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f12542m || (cursor = this.f12544o) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f12544o.getLong(this.f12546q);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12542m) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f12544o.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f12545p, this.f12544o, viewGroup);
            }
            e(view, this.f12545p, this.f12544o);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f12543n && (cursor = this.f12544o) != null && !cursor.isClosed()) {
            this.f12542m = this.f12544o.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f12544o;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0214a aVar = this.f12547r;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f12548s;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12544o = cursor;
        if (cursor != null) {
            C0214a aVar2 = this.f12547r;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f12548s;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f12546q = cursor.getColumnIndexOrThrow("_id");
            this.f12542m = true;
            notifyDataSetChanged();
        } else {
            this.f12546q = -1;
            this.f12542m = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
