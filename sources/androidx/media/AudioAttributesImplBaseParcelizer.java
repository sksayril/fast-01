package androidx.media;

import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2816a = aVar.p(audioAttributesImplBase.f2816a, 1);
        audioAttributesImplBase.f2817b = aVar.p(audioAttributesImplBase.f2817b, 2);
        audioAttributesImplBase.f2818c = aVar.p(audioAttributesImplBase.f2818c, 3);
        audioAttributesImplBase.f2819d = aVar.p(audioAttributesImplBase.f2819d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f2816a, 1);
        aVar.F(audioAttributesImplBase.f2817b, 2);
        aVar.F(audioAttributesImplBase.f2818c, 3);
        aVar.F(audioAttributesImplBase.f2819d, 4);
    }
}
