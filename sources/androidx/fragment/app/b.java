package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    final int[] f2369m;

    /* renamed from: n  reason: collision with root package name */
    final ArrayList<String> f2370n;

    /* renamed from: o  reason: collision with root package name */
    final int[] f2371o;

    /* renamed from: p  reason: collision with root package name */
    final int[] f2372p;

    /* renamed from: q  reason: collision with root package name */
    final int f2373q;

    /* renamed from: r  reason: collision with root package name */
    final String f2374r;

    /* renamed from: s  reason: collision with root package name */
    final int f2375s;

    /* renamed from: t  reason: collision with root package name */
    final int f2376t;

    /* renamed from: u  reason: collision with root package name */
    final CharSequence f2377u;

    /* renamed from: v  reason: collision with root package name */
    final int f2378v;

    /* renamed from: w  reason: collision with root package name */
    final CharSequence f2379w;

    /* renamed from: x  reason: collision with root package name */
    final ArrayList<String> f2380x;

    /* renamed from: y  reason: collision with root package name */
    final ArrayList<String> f2381y;

    /* renamed from: z  reason: collision with root package name */
    final boolean f2382z;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f2369m = parcel.createIntArray();
        this.f2370n = parcel.createStringArrayList();
        this.f2371o = parcel.createIntArray();
        this.f2372p = parcel.createIntArray();
        this.f2373q = parcel.readInt();
        this.f2374r = parcel.readString();
        this.f2375s = parcel.readInt();
        this.f2376t = parcel.readInt();
        this.f2377u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2378v = parcel.readInt();
        this.f2379w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2380x = parcel.createStringArrayList();
        this.f2381y = parcel.createStringArrayList();
        this.f2382z = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f2595c.size();
        this.f2369m = new int[(size * 5)];
        if (aVar.f2601i) {
            this.f2370n = new ArrayList<>(size);
            this.f2371o = new int[size];
            this.f2372p = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                w.a aVar2 = aVar.f2595c.get(i10);
                int i12 = i11 + 1;
                this.f2369m[i11] = aVar2.f2612a;
                ArrayList<String> arrayList = this.f2370n;
                Fragment fragment = aVar2.f2613b;
                arrayList.add(fragment != null ? fragment.f2320r : null);
                int[] iArr = this.f2369m;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f2614c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f2615d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f2616e;
                iArr[i15] = aVar2.f2617f;
                this.f2371o[i10] = aVar2.f2618g.ordinal();
                this.f2372p[i10] = aVar2.f2619h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f2373q = aVar.f2600h;
            this.f2374r = aVar.f2603k;
            this.f2375s = aVar.f2364v;
            this.f2376t = aVar.f2604l;
            this.f2377u = aVar.f2605m;
            this.f2378v = aVar.f2606n;
            this.f2379w = aVar.f2607o;
            this.f2380x = aVar.f2608p;
            this.f2381y = aVar.f2609q;
            this.f2382z = aVar.f2610r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(n nVar) {
        a aVar = new a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2369m.length) {
            w.a aVar2 = new w.a();
            int i12 = i10 + 1;
            aVar2.f2612a = this.f2369m[i10];
            if (n.E0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2369m[i12]);
            }
            String str = this.f2370n.get(i11);
            aVar2.f2613b = str != null ? nVar.f0(str) : null;
            aVar2.f2618g = g.b.values()[this.f2371o[i11]];
            aVar2.f2619h = g.b.values()[this.f2372p[i11]];
            int[] iArr = this.f2369m;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f2614c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2615d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f2616e = i18;
            int i19 = iArr[i17];
            aVar2.f2617f = i19;
            aVar.f2596d = i14;
            aVar.f2597e = i16;
            aVar.f2598f = i18;
            aVar.f2599g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f2600h = this.f2373q;
        aVar.f2603k = this.f2374r;
        aVar.f2364v = this.f2375s;
        aVar.f2601i = true;
        aVar.f2604l = this.f2376t;
        aVar.f2605m = this.f2377u;
        aVar.f2606n = this.f2378v;
        aVar.f2607o = this.f2379w;
        aVar.f2608p = this.f2380x;
        aVar.f2609q = this.f2381y;
        aVar.f2610r = this.f2382z;
        aVar.m(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2369m);
        parcel.writeStringList(this.f2370n);
        parcel.writeIntArray(this.f2371o);
        parcel.writeIntArray(this.f2372p);
        parcel.writeInt(this.f2373q);
        parcel.writeString(this.f2374r);
        parcel.writeInt(this.f2375s);
        parcel.writeInt(this.f2376t);
        TextUtils.writeToParcel(this.f2377u, parcel, 0);
        parcel.writeInt(this.f2378v);
        TextUtils.writeToParcel(this.f2379w, parcel, 0);
        parcel.writeStringList(this.f2380x);
        parcel.writeStringList(this.f2381y);
        parcel.writeInt(this.f2382z ? 1 : 0);
    }
}
