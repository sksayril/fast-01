package x1;

import android.database.sqlite.SQLiteDatabase;
import s1.c;
import x1.m0;

public final /* synthetic */ class f0 implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.b f13074b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13075c;

    public /* synthetic */ f0(String str, c.b bVar, long j10) {
        this.f13073a = str;
        this.f13074b = bVar;
        this.f13075c = j10;
    }

    public final Object apply(Object obj) {
        return m0.v0(this.f13073a, this.f13074b, this.f13075c, (SQLiteDatabase) obj);
    }
}
