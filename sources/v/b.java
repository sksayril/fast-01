package v;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f12552a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f12552a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f12552a.c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d10 = this.f12552a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d10 != null) {
            filterResults.count = d10.getCount();
        } else {
            filterResults.count = 0;
            d10 = null;
        }
        filterResults.values = d10;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b10 = this.f12552a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b10) {
            this.f12552a.a((Cursor) obj);
        }
    }
}
