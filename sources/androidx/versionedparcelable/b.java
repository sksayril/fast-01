package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p.a;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f3339d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f3340e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3341f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3342g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3343h;

    /* renamed from: i  reason: collision with root package name */
    private int f3344i;

    /* renamed from: j  reason: collision with root package name */
    private int f3345j;

    /* renamed from: k  reason: collision with root package name */
    private int f3346k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    private b(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3339d = new SparseIntArray();
        this.f3344i = -1;
        this.f3346k = -1;
        this.f3340e = parcel;
        this.f3341f = i10;
        this.f3342g = i11;
        this.f3345j = i10;
        this.f3343h = str;
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f3340e.writeInt(bArr.length);
            this.f3340e.writeByteArray(bArr);
            return;
        }
        this.f3340e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3340e, 0);
    }

    public void E(int i10) {
        this.f3340e.writeInt(i10);
    }

    public void G(Parcelable parcelable) {
        this.f3340e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f3340e.writeString(str);
    }

    public void a() {
        int i10 = this.f3344i;
        if (i10 >= 0) {
            int i11 = this.f3339d.get(i10);
            int dataPosition = this.f3340e.dataPosition();
            this.f3340e.setDataPosition(i11);
            this.f3340e.writeInt(dataPosition - i11);
            this.f3340e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public a b() {
        Parcel parcel = this.f3340e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f3345j;
        if (i10 == this.f3341f) {
            i10 = this.f3342g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f3343h + "  ", this.f3336a, this.f3337b, this.f3338c);
    }

    public boolean g() {
        return this.f3340e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f3340e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3340e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3340e);
    }

    public boolean m(int i10) {
        while (this.f3345j < this.f3342g) {
            int i11 = this.f3346k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f3340e.setDataPosition(this.f3345j);
            int readInt = this.f3340e.readInt();
            this.f3346k = this.f3340e.readInt();
            this.f3345j += readInt;
        }
        return this.f3346k == i10;
    }

    public int o() {
        return this.f3340e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f3340e.readParcelable(getClass().getClassLoader());
    }

    public String s() {
        return this.f3340e.readString();
    }

    public void w(int i10) {
        a();
        this.f3344i = i10;
        this.f3339d.put(i10, this.f3340e.dataPosition());
        E(0);
        E(i10);
    }

    public void y(boolean z9) {
        this.f3340e.writeInt(z9 ? 1 : 0);
    }
}
