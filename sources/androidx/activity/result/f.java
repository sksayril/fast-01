package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

@SuppressLint({"BanParcelableUsage"})
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* renamed from: q  reason: collision with root package name */
    public static final c f216q = new c((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final IntentSender f217m;

    /* renamed from: n  reason: collision with root package name */
    private final Intent f218n;

    /* renamed from: o  reason: collision with root package name */
    private final int f219o;

    /* renamed from: p  reason: collision with root package name */
    private final int f220p;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f221a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f222b;

        /* renamed from: c  reason: collision with root package name */
        private int f223c;

        /* renamed from: d  reason: collision with root package name */
        private int f224d;

        public a(IntentSender intentSender) {
            l.e(intentSender, "intentSender");
            this.f221a = intentSender;
        }

        public final f a() {
            return new f(this.f221a, this.f222b, this.f223c, this.f224d);
        }

        public final a b(Intent intent) {
            this.f222b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f224d = i10;
            this.f223c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator<f> {
        b() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            l.e(parcel, "inParcel");
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }
    }

    public f(IntentSender intentSender, Intent intent, int i10, int i11) {
        l.e(intentSender, "intentSender");
        this.f217m = intentSender;
        this.f218n = intent;
        this.f219o = i10;
        this.f220p = i11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.l.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.l.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.f.<init>(android.os.Parcel):void");
    }

    public final Intent a() {
        return this.f218n;
    }

    public final int b() {
        return this.f219o;
    }

    public final int c() {
        return this.f220p;
    }

    public final IntentSender d() {
        return this.f217m;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeParcelable(this.f217m, i10);
        parcel.writeParcelable(this.f218n, i10);
        parcel.writeInt(this.f219o);
        parcel.writeInt(this.f220p);
    }
}
