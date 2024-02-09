package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    private final String f59m;

    /* renamed from: n  reason: collision with root package name */
    private final CharSequence f60n;

    /* renamed from: o  reason: collision with root package name */
    private final CharSequence f61o;

    /* renamed from: p  reason: collision with root package name */
    private final CharSequence f62p;

    /* renamed from: q  reason: collision with root package name */
    private final Bitmap f63q;

    /* renamed from: r  reason: collision with root package name */
    private final Uri f64r;

    /* renamed from: s  reason: collision with root package name */
    private final Bundle f65s;

    /* renamed from: t  reason: collision with root package name */
    private final Uri f66t;

    /* renamed from: u  reason: collision with root package name */
    private MediaDescription f67u;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f68a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f69b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f70c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f71d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f72e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f73f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f74g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f75h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f68a, this.f69b, this.f70c, this.f71d, this.f72e, this.f73f, this.f74g, this.f75h);
        }

        public b b(CharSequence charSequence) {
            this.f71d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f74g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f72e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f73f = uri;
            return this;
        }

        public b f(String str) {
            this.f68a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f75h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f70c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f69b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f59m = str;
        this.f60n = charSequence;
        this.f61o = charSequence2;
        this.f62p = charSequence3;
        this.f63q = bitmap;
        this.f64r = uri;
        this.f65s = bundle;
        this.f66t = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007c
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.e(r3)
            android.os.Bundle r3 = r9.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x0048
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0049
        L_0x0048:
            r5 = r0
        L_0x0049:
            if (r5 == 0) goto L_0x0061
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x005b
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0061:
            r0 = r3
        L_0x0062:
            r2.c(r0)
            if (r5 == 0) goto L_0x006b
            r2.g(r5)
            goto L_0x0076
        L_0x006b:
            r0 = 23
            if (r1 < r0) goto L_0x0076
            android.net.Uri r0 = r9.getMediaUri()
            r2.g(r0)
        L_0x0076:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f67u = r9
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        MediaDescription mediaDescription = this.f67u;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i10 = Build.VERSION.SDK_INT;
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f59m);
        builder.setTitle(this.f60n);
        builder.setSubtitle(this.f61o);
        builder.setDescription(this.f62p);
        builder.setIconBitmap(this.f63q);
        builder.setIconUri(this.f64r);
        Bundle bundle = this.f65s;
        if (i10 < 23 && this.f66t != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f66t);
        }
        builder.setExtras(bundle);
        if (i10 >= 23) {
            builder.setMediaUri(this.f66t);
        }
        MediaDescription build = builder.build();
        this.f67u = build;
        return build;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f60n + ", " + this.f61o + ", " + this.f62p;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
