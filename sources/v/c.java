package v;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: u  reason: collision with root package name */
    private int f12553u;

    /* renamed from: v  reason: collision with root package name */
    private int f12554v;

    /* renamed from: w  reason: collision with root package name */
    private LayoutInflater f12555w;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z9) {
        super(context, cursor, z9);
        this.f12554v = i10;
        this.f12553u = i10;
        this.f12555w = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12555w.inflate(this.f12554v, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12555w.inflate(this.f12553u, viewGroup, false);
    }
}
