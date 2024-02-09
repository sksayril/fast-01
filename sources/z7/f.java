package z7;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaRecorder;
import io.flutter.plugins.camera.n0;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f13607a;

    /* renamed from: b  reason: collision with root package name */
    private final CamcorderProfile f13608b;

    /* renamed from: c  reason: collision with root package name */
    private final EncoderProfiles f13609c;

    /* renamed from: d  reason: collision with root package name */
    private final a f13610d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13611e;

    /* renamed from: f  reason: collision with root package name */
    private int f13612f;

    static class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public MediaRecorder a() {
            return new MediaRecorder();
        }
    }

    public f(CamcorderProfile camcorderProfile, String str) {
        this(camcorderProfile, str, new a());
    }

    f(CamcorderProfile camcorderProfile, String str, a aVar) {
        this.f13607a = str;
        this.f13608b = camcorderProfile;
        this.f13609c = null;
        this.f13610d = aVar;
    }

    public f(EncoderProfiles encoderProfiles, String str) {
        this(encoderProfiles, str, new a());
    }

    f(EncoderProfiles encoderProfiles, String str, a aVar) {
        this.f13607a = str;
        this.f13609c = encoderProfiles;
        this.f13608b = null;
        this.f13610d = aVar;
    }

    public MediaRecorder a() {
        int i10;
        int i11;
        EncoderProfiles encoderProfiles;
        MediaRecorder a10 = this.f13610d.a();
        if (this.f13611e) {
            a10.setAudioSource(1);
        }
        a10.setVideoSource(2);
        if (!n0.c() || (encoderProfiles = this.f13609c) == null) {
            CamcorderProfile camcorderProfile = this.f13608b;
            if (camcorderProfile != null) {
                a10.setOutputFormat(camcorderProfile.fileFormat);
                if (this.f13611e) {
                    a10.setAudioEncoder(this.f13608b.audioCodec);
                    a10.setAudioEncodingBitRate(this.f13608b.audioBitRate);
                    a10.setAudioSamplingRate(this.f13608b.audioSampleRate);
                }
                a10.setVideoEncoder(this.f13608b.videoCodec);
                a10.setVideoEncodingBitRate(this.f13608b.videoBitRate);
                a10.setVideoFrameRate(this.f13608b.videoFrameRate);
                CamcorderProfile camcorderProfile2 = this.f13608b;
                i10 = camcorderProfile2.videoFrameWidth;
                i11 = camcorderProfile2.videoFrameHeight;
            }
            a10.setOutputFile(this.f13607a);
            a10.setOrientationHint(this.f13612f);
            a10.prepare();
            return a10;
        }
        EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) encoderProfiles.getVideoProfiles().get(0);
        EncoderProfiles.AudioProfile audioProfile = (EncoderProfiles.AudioProfile) this.f13609c.getAudioProfiles().get(0);
        a10.setOutputFormat(this.f13609c.getRecommendedFileFormat());
        if (this.f13611e) {
            a10.setAudioEncoder(audioProfile.getCodec());
            a10.setAudioEncodingBitRate(audioProfile.getBitrate());
            a10.setAudioSamplingRate(audioProfile.getSampleRate());
        }
        a10.setVideoEncoder(videoProfile.getCodec());
        a10.setVideoEncodingBitRate(videoProfile.getBitrate());
        a10.setVideoFrameRate(videoProfile.getFrameRate());
        i10 = videoProfile.getWidth();
        i11 = videoProfile.getHeight();
        a10.setVideoSize(i10, i11);
        a10.setOutputFile(this.f13607a);
        a10.setOrientationHint(this.f13612f);
        a10.prepare();
        return a10;
    }

    public f b(boolean z9) {
        this.f13611e = z9;
        return this;
    }

    public f c(int i10) {
        this.f13612f = i10;
        return this;
    }
}
