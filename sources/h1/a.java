package h1;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Vibrator f9102a;

    a(Vibrator vibrator) {
        this.f9102a = vibrator;
    }

    /* access modifiers changed from: package-private */
    public Vibrator a() {
        return this.f9102a;
    }

    /* access modifiers changed from: package-private */
    public void b(long j10, int i10) {
        if (!this.f9102a.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            this.f9102a.vibrate(j10);
        } else if (this.f9102a.hasAmplitudeControl()) {
            this.f9102a.vibrate(VibrationEffect.createOneShot(j10, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
        } else {
            this.f9102a.vibrate(VibrationEffect.createOneShot(j10, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
        }
    }

    /* access modifiers changed from: package-private */
    public void c(List<Integer> list, int i10) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = (long) list.get(i11).intValue();
        }
        if (!this.f9102a.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9102a.vibrate(VibrationEffect.createWaveform(jArr, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
        } else {
            this.f9102a.vibrate(jArr, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(List<Integer> list, int i10, List<Integer> list2) {
        VibrationEffect vibrationEffect;
        Vibrator vibrator;
        AudioAttributes.Builder builder;
        int size = list.size();
        long[] jArr = new long[size];
        int size2 = list2.size();
        int[] iArr = new int[size2];
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = (long) list.get(i11).intValue();
        }
        for (int i12 = 0; i12 < size2; i12++) {
            iArr[i12] = list2.get(i12).intValue();
        }
        if (!this.f9102a.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.f9102a.hasAmplitudeControl()) {
                vibrator = this.f9102a;
                vibrationEffect = VibrationEffect.createWaveform(jArr, iArr, i10);
                builder = new AudioAttributes.Builder();
            } else {
                vibrator = this.f9102a;
                vibrationEffect = VibrationEffect.createWaveform(jArr, i10);
                builder = new AudioAttributes.Builder();
            }
            vibrator.vibrate(vibrationEffect, builder.setContentType(4).setUsage(4).build());
            return;
        }
        this.f9102a.vibrate(jArr, i10);
    }
}
