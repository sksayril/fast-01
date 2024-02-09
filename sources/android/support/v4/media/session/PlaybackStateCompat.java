package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    final int f101m;

    /* renamed from: n  reason: collision with root package name */
    final long f102n;

    /* renamed from: o  reason: collision with root package name */
    final long f103o;

    /* renamed from: p  reason: collision with root package name */
    final float f104p;

    /* renamed from: q  reason: collision with root package name */
    final long f105q;

    /* renamed from: r  reason: collision with root package name */
    final int f106r;

    /* renamed from: s  reason: collision with root package name */
    final CharSequence f107s;

    /* renamed from: t  reason: collision with root package name */
    final long f108t;

    /* renamed from: u  reason: collision with root package name */
    List<CustomAction> f109u;

    /* renamed from: v  reason: collision with root package name */
    final long f110v;

    /* renamed from: w  reason: collision with root package name */
    final Bundle f111w;

    /* renamed from: x  reason: collision with root package name */
    private PlaybackState f112x;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        private final String f113m;

        /* renamed from: n  reason: collision with root package name */
        private final CharSequence f114n;

        /* renamed from: o  reason: collision with root package name */
        private final int f115o;

        /* renamed from: p  reason: collision with root package name */
        private final Bundle f116p;

        /* renamed from: q  reason: collision with root package name */
        private PlaybackState.CustomAction f117q;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f113m = parcel.readString();
            this.f114n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f115o = parcel.readInt();
            this.f116p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f113m = str;
            this.f114n = charSequence;
            this.f115o = i10;
            this.f116p = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f117q = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f114n + ", mIcon=" + this.f115o + ", mExtras=" + this.f116p;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f113m);
            TextUtils.writeToParcel(this.f114n, parcel, i10);
            parcel.writeInt(this.f115o);
            parcel.writeBundle(this.f116p);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f101m = i10;
        this.f102n = j10;
        this.f103o = j11;
        this.f104p = f10;
        this.f105q = j12;
        this.f106r = i11;
        this.f107s = charSequence;
        this.f108t = j13;
        this.f109u = new ArrayList(list);
        this.f110v = j14;
        this.f111w = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f101m = parcel.readInt();
        this.f102n = parcel.readLong();
        this.f104p = parcel.readFloat();
        this.f108t = parcel.readLong();
        this.f103o = parcel.readLong();
        this.f105q = parcel.readLong();
        this.f107s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f109u = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f110v = parcel.readLong();
        this.f111w = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f106r = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a10 : customActions) {
                arrayList2.add(CustomAction.a(a10));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f112x = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f101m + ", position=" + this.f102n + ", buffered position=" + this.f103o + ", speed=" + this.f104p + ", updated=" + this.f108t + ", actions=" + this.f105q + ", error code=" + this.f106r + ", error message=" + this.f107s + ", custom actions=" + this.f109u + ", active item id=" + this.f110v + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f101m);
        parcel.writeLong(this.f102n);
        parcel.writeFloat(this.f104p);
        parcel.writeLong(this.f108t);
        parcel.writeLong(this.f103o);
        parcel.writeLong(this.f105q);
        TextUtils.writeToParcel(this.f107s, parcel, i10);
        parcel.writeTypedList(this.f109u);
        parcel.writeLong(this.f110v);
        parcel.writeBundle(this.f111w);
        parcel.writeInt(this.f106r);
    }
}
