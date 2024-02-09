package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2814a;

    /* renamed from: b  reason: collision with root package name */
    public int f2815b;

    AudioAttributesImplApi21() {
        this.f2815b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f2814a = audioAttributes;
        this.f2815b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2814a.equals(((AudioAttributesImplApi21) obj).f2814a);
    }

    public int hashCode() {
        return this.f2814a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2814a;
    }
}
