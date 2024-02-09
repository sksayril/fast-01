package com.baseflow.geolocator;

import android.location.Location;
import d1.p;
import d1.x;
import k7.k;

public final /* synthetic */ class g implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f4816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean[] f4817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f4818c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f4819d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k.d f4820e;

    public /* synthetic */ g(j jVar, boolean[] zArr, p pVar, String str, k.d dVar) {
        this.f4816a = jVar;
        this.f4817b = zArr;
        this.f4818c = pVar;
        this.f4819d = str;
        this.f4820e = dVar;
    }

    public final void a(Location location) {
        this.f4816a.j(this.f4817b, this.f4818c, this.f4819d, this.f4820e, location);
    }
}
