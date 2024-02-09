package s5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static final String f12180d = "e";

    /* renamed from: a  reason: collision with root package name */
    private final Context f12181a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12182b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12183c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f12181a = activity.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(MediaPlayer mediaPlayer, int i10, int i11) {
        String str = f12180d;
        Log.w(str, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public MediaPlayer e() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(c.f12178a);
        mediaPlayer.setOnErrorListener(d.f12179a);
        try {
            openRawResourceFd = this.f12181a.getResources().openRawResourceFd(m.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e10) {
            Log.w(f12180d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void f() {
        Vibrator vibrator;
        if (this.f12182b) {
            e();
        }
        if (this.f12183c && (vibrator = (Vibrator) this.f12181a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    public void g(boolean z9) {
        this.f12182b = z9;
    }
}
