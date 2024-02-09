package p6;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11921a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11922b = false;

    /* renamed from: c  reason: collision with root package name */
    private MediaRecorder f11923c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f11924d;

    /* renamed from: e  reason: collision with root package name */
    private Double f11925e = Double.valueOf(-160.0d);

    /* renamed from: f  reason: collision with root package name */
    private final Context f11926f;

    b(Context context) {
        this.f11926f = context;
    }

    private Integer h(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1645474052:
                if (str.equals("vorbisOgg")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1425339046:
                if (str.equals("aacEld")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3418175:
                if (str.equals("opus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 92568736:
                if (str.equals("aacHe")) {
                    c10 = 3;
                    break;
                }
                break;
            case 92568858:
                if (str.equals("aacLc")) {
                    c10 = 4;
                    break;
                }
                break;
            case 92940826:
                if (str.equals("amrNb")) {
                    c10 = 5;
                    break;
                }
                break;
            case 92941105:
                if (str.equals("amrWb")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                return 5;
            case 2:
                if (Build.VERSION.SDK_INT >= 29) {
                    return 7;
                }
                break;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 1;
            case 6:
                return 2;
            default:
                return null;
        }
        return 6;
    }

    private int i(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1645474052:
                if (str.equals("vorbisOgg")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1425339046:
                if (str.equals("aacEld")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3418175:
                if (str.equals("opus")) {
                    c10 = 2;
                    break;
                }
                break;
            case 92568736:
                if (str.equals("aacHe")) {
                    c10 = 3;
                    break;
                }
                break;
            case 92568858:
                if (str.equals("aacLc")) {
                    c10 = 4;
                    break;
                }
                break;
            case 92940826:
                if (str.equals("amrNb")) {
                    c10 = 5;
                    break;
                }
                break;
            case 92941105:
                if (str.equals("amrWb")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
            case 3:
            case 4:
                return 2;
            case 2:
                if (Build.VERSION.SDK_INT >= 29) {
                    return 11;
                }
                break;
            case 5:
            case 6:
                return 1;
            default:
                return 0;
        }
        return Build.VERSION.SDK_INT >= 29 ? 11 : 2;
    }

    private void j() {
        MediaRecorder mediaRecorder = this.f11923c;
        if (mediaRecorder != null) {
            try {
                if (this.f11921a) {
                    mediaRecorder.pause();
                    this.f11922b = true;
                }
            } catch (IllegalStateException e10) {
                Log.d("Record - MR", "Did you call pause() before before start() or after stop()?\n" + e10.getMessage());
            }
        }
    }

    private void k() {
        MediaRecorder mediaRecorder = this.f11923c;
        if (mediaRecorder != null) {
            try {
                if (this.f11922b) {
                    mediaRecorder.resume();
                    this.f11922b = false;
                }
            } catch (IllegalStateException e10) {
                Log.d("Record - MR", "Did you call resume() before before start() or after stop()?\n" + e10.getMessage());
            }
        }
    }

    private void l() {
        MediaRecorder mediaRecorder = this.f11923c;
        if (mediaRecorder != null) {
            try {
                if (this.f11921a || this.f11922b) {
                    mediaRecorder.stop();
                }
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                this.f11923c.reset();
                this.f11923c.release();
                this.f11923c = null;
                throw th;
            }
            this.f11923c.reset();
            this.f11923c.release();
            this.f11923c = null;
        }
        this.f11921a = false;
        this.f11922b = false;
        this.f11925e = Double.valueOf(-160.0d);
    }

    public Map<String, Object> a() {
        double d10;
        HashMap hashMap = new HashMap();
        if (this.f11921a) {
            d10 = Math.log10(((double) this.f11923c.getMaxAmplitude()) / 32768.0d) * 20.0d;
            if (d10 > this.f11925e.doubleValue()) {
                this.f11925e = Double.valueOf(d10);
            }
        } else {
            d10 = -160.0d;
        }
        hashMap.put("current", Double.valueOf(d10));
        hashMap.put("max", this.f11925e);
        return hashMap;
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            j();
        }
    }

    public void c() {
        if (Build.VERSION.SDK_INT >= 24) {
            k();
        }
    }

    public void close() {
        l();
    }

    public boolean d(String str) {
        return h(str) != null;
    }

    public boolean e() {
        return this.f11922b;
    }

    public void f(String str, String str2, int i10, int i11, int i12, Map<String, Object> map) {
        l();
        this.f11924d = str;
        this.f11923c = Build.VERSION.SDK_INT >= 31 ? new MediaRecorder(this.f11926f) : new MediaRecorder();
        int max = Math.max(1, i12);
        this.f11923c.setAudioSource(0);
        this.f11923c.setAudioEncodingBitRate(i10);
        this.f11923c.setAudioSamplingRate(i11);
        this.f11923c.setAudioChannels(max);
        this.f11923c.setOutputFormat(i(str2));
        Integer h10 = h(str2);
        if (h10 == null) {
            Log.d("Record - MR", "Falling back to AAC LC");
            h10 = 3;
        }
        this.f11923c.setAudioEncoder(h10.intValue());
        this.f11923c.setOutputFile(str);
        try {
            this.f11923c.prepare();
            this.f11923c.start();
            this.f11921a = true;
            this.f11922b = false;
        } catch (IOException | IllegalStateException e10) {
            this.f11923c.release();
            this.f11923c = null;
            throw new Exception(e10);
        }
    }

    public boolean g() {
        return this.f11921a;
    }

    public String stop() {
        l();
        return this.f11924d;
    }
}
