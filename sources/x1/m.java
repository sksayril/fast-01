package x1;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import s1.a;
import x1.m0;

public final /* synthetic */ class m implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f13090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13091b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f13092c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0208a f13093d;

    public /* synthetic */ m(m0 m0Var, String str, Map map, a.C0208a aVar) {
        this.f13090a = m0Var;
        this.f13091b = str;
        this.f13092c = map;
        this.f13093d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f13090a.n0(this.f13091b, this.f13092c, this.f13093d, (SQLiteDatabase) obj);
    }
}
