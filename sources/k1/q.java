package k1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import c7.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k7.c;
import k7.j;
import k7.k;
import k7.p;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;

@TargetApi(8)
public final class q implements k.c, RecognitionListener, p, c7.a, d7.a {
    public static final a X = new a((g) null);
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F = true;
    private boolean G;
    private boolean H;
    private SpeechRecognizer I;
    private Intent J;
    private BluetoothAdapter K;
    private Set<BluetoothDevice> L;
    private BluetoothDevice M;
    /* access modifiers changed from: private */
    public BluetoothHeadset N;
    private String O;
    private boolean P = true;
    private f Q = f.deviceDefault;
    private long R;
    private long S;
    private float T = 1000.0f;
    private float U = -100.0f;
    private final Handler V = new Handler(Looper.getMainLooper());
    private final String W;

    /* renamed from: m  reason: collision with root package name */
    private Context f10947m;

    /* renamed from: n  reason: collision with root package name */
    private k f10948n;

    /* renamed from: o  reason: collision with root package name */
    private final int f10949o = 21;

    /* renamed from: p  reason: collision with root package name */
    private final int f10950p = 29;

    /* renamed from: q  reason: collision with root package name */
    private final int f10951q = 31;

    /* renamed from: r  reason: collision with root package name */
    private final int f10952r = 28521;

    /* renamed from: s  reason: collision with root package name */
    private final double f10953s = -1.0d;

    /* renamed from: t  reason: collision with root package name */
    private int f10954t = 9;

    /* renamed from: u  reason: collision with root package name */
    private final String f10955u = "SpeechToTextPlugin";

    /* renamed from: v  reason: collision with root package name */
    private boolean f10956v = true;

    /* renamed from: w  reason: collision with root package name */
    private Activity f10957w;

    /* renamed from: x  reason: collision with root package name */
    private k.d f10958x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10959y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10960z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements BluetoothProfile.ServiceListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f10961a;

        b(q qVar) {
            this.f10961a = qVar;
        }

        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            l.e(bluetoothProfile, "proxy");
            if (i10 == 1) {
                this.f10961a.N = (BluetoothHeadset) bluetoothProfile;
                q qVar = this.f10961a;
                qVar.q("Found a headset: " + this.f10961a.N);
            }
        }

        public void onServiceDisconnected(int i10) {
            if (i10 == 1) {
                this.f10961a.q("Clearing headset: ");
                this.f10961a.N = null;
            }
        }
    }

    public q() {
        String languageTag = Locale.getDefault().toLanguageTag();
        l.d(languageTag, "toLanguageTag(...)");
        this.W = languageTag;
    }

    private final boolean A() {
        return !this.A;
    }

    private final void B(k.d dVar) {
        if (H() || z()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        Intent voiceDetailsIntent = RecognizerIntent.getVoiceDetailsIntent(this.f10947m);
        if (voiceDetailsIntent == null) {
            voiceDetailsIntent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
            voiceDetailsIntent.setPackage("com.google.android.googlequicksearchbox");
        }
        Intent intent = voiceDetailsIntent;
        Context context = this.f10947m;
        if (context != null) {
            context.sendOrderedBroadcast(intent, (String) null, new e(dVar, this.B), (Handler) null, -1, (String) null, (Bundle) null);
        }
    }

    private final void C(boolean z9) {
        r rVar;
        if (this.A != z9) {
            this.A = z9;
            if (z9) {
                rVar = r.listening;
            } else if (!z9) {
                rVar = r.notListening;
            } else {
                throw new g8.k();
            }
            String name = rVar.name();
            q("Notify status:" + name);
            k kVar = this.f10948n;
            if (kVar != null) {
                kVar.c(g.notifyStatus.name(), name);
            }
            if (!z9) {
                String name2 = (!this.G ? r.doneNoResult : r.done).name();
                q("Notify status:" + name2);
                G();
                k kVar2 = this.f10948n;
                if (kVar2 != null) {
                    kVar2.c(g.notifyStatus.name(), name2);
                }
            }
        }
    }

    private final void D(Context context, c cVar) {
        this.f10947m = context;
        k kVar = new k(cVar, "plugin.csdcorp.com/speech_to_text");
        this.f10948n = kVar;
        kVar.e(this);
    }

    /* access modifiers changed from: private */
    public static final void E(q qVar, float f10) {
        l.e(qVar, "this$0");
        k kVar = qVar.f10948n;
        if (kVar != null) {
            kVar.c(g.soundLevelChange.name(), Float.valueOf(f10));
        }
    }

    private final void F() {
        if (!this.F) {
            BluetoothAdapter bluetoothAdapter = this.K;
            Set<BluetoothDevice> set = this.L;
            BluetoothHeadset bluetoothHeadset = this.N;
            if (bluetoothAdapter != null && bluetoothHeadset != null && set != null && bluetoothAdapter.isEnabled()) {
                for (BluetoothDevice next : set) {
                    if (bluetoothHeadset.startVoiceRecognition(next)) {
                        q("Starting bluetooth voice recognition");
                        this.M = next;
                        return;
                    }
                }
            }
        }
    }

    private final void G() {
        if (!this.F) {
            BluetoothDevice bluetoothDevice = this.M;
            BluetoothHeadset bluetoothHeadset = this.N;
            if (bluetoothDevice != null && bluetoothHeadset != null) {
                q("Stopping bluetooth voice recognition");
                bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
                this.M = null;
            }
        }
    }

    private final boolean H() {
        return Build.VERSION.SDK_INT < this.f10949o;
    }

    private final void I(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", str);
        jSONObject.put("permanent", true);
        this.V.post(new n(this, jSONObject));
    }

    /* access modifiers changed from: private */
    public static final void J(q qVar, JSONObject jSONObject) {
        l.e(qVar, "this$0");
        l.e(jSONObject, "$speechError");
        k kVar = qVar.f10948n;
        if (kVar != null) {
            kVar.c(g.notifyError.name(), jSONObject.toString());
        }
    }

    private final void K() {
        if (!this.F) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.K = defaultAdapter;
            this.L = defaultAdapter != null ? defaultAdapter.getBondedDevices() : null;
            b bVar = new b(this);
            BluetoothAdapter bluetoothAdapter = this.K;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.getProfileProxy(this.f10947m, bVar, 1);
            }
        }
    }

    private final void L(String str, boolean z9, f fVar, boolean z10) {
        q("setupRecognizerIntent");
        String str2 = this.O;
        if (str2 == null || !l.a(str2, str) || z9 != this.P || this.Q != fVar) {
            this.O = str;
            this.P = z9;
            this.Q = fVar;
            this.V.post(new p(this, z9, str, z10));
        }
    }

    /* access modifiers changed from: private */
    public static final void M(q qVar, boolean z9, String str, boolean z10) {
        l.e(qVar, "this$0");
        l.e(str, "$languageTag");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        qVar.q("In RecognizerIntent apply");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        qVar.q("put model");
        Context context = qVar.f10947m;
        if (context != null) {
            intent.putExtra("calling_package", context.getApplicationInfo().packageName);
        }
        qVar.q("put package");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z9);
        qVar.q("put partial");
        if (!l.a(str, Locale.getDefault().toLanguageTag())) {
            intent.putExtra("android.speech.extra.LANGUAGE", str);
            qVar.q("put languageTag");
        }
        if (z10) {
            intent.putExtra("android.speech.extra.PREFER_OFFLINE", z10);
        }
        intent.putExtra("android.speech.extra.MAX_RESULTS", 10);
        qVar.J = intent;
    }

    private final void N(k.d dVar, String str, boolean z9, int i10, boolean z10) {
        if (H() || z() || y()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        this.G = false;
        o(z10);
        this.T = 1000.0f;
        this.U = -100.0f;
        q("Start listening");
        f fVar = f.deviceDefault;
        f fVar2 = f.dictation;
        if (i10 == fVar2.ordinal()) {
            fVar = fVar2;
        }
        F();
        L(str, z9, fVar, z10);
        this.V.post(new j(this));
        this.S = System.currentTimeMillis();
        C(true);
        dVar.a(Boolean.TRUE);
        q("Start listening done");
    }

    /* access modifiers changed from: private */
    public static final void O(q qVar) {
        l.e(qVar, "this$0");
        SpeechRecognizer speechRecognizer = qVar.I;
        if (speechRecognizer != null) {
            speechRecognizer.startListening(qVar.J);
        }
    }

    private final void P(k.d dVar) {
        if (H() || z() || A()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        q("Stop listening");
        this.V.post(new k(this));
        if (!this.f10956v) {
            r();
        }
        C(false);
        dVar.a(Boolean.TRUE);
        q("Stop listening done");
    }

    /* access modifiers changed from: private */
    public static final void Q(q qVar) {
        l.e(qVar, "this$0");
        SpeechRecognizer speechRecognizer = qVar.I;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }

    private final void R(Bundle bundle, boolean z9) {
        if (x(z9)) {
            q("Discarding duplicate final");
            return;
        }
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || !(!stringArrayList.isEmpty())) {
            q("Results null or empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finalResult", z9);
        float[] floatArray = bundle.getFloatArray("confidence_scores");
        JSONArray jSONArray = new JSONArray();
        int i10 = 0;
        int size = stringArrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("recognizedWords", stringArrayList.get(i10));
                if (floatArray == null || floatArray.length < stringArrayList.size()) {
                    jSONObject2.put("confidence", this.f10953s);
                } else {
                    jSONObject2.put("confidence", Float.valueOf(floatArray[i10]));
                }
                jSONArray.put(jSONObject2);
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        jSONObject.put("alternates", jSONArray);
        String jSONObject3 = jSONObject.toString();
        l.d(jSONObject3, "toString(...)");
        q("Calling results callback");
        this.G = true;
        k kVar = this.f10948n;
        if (kVar != null) {
            kVar.c(g.textRecognition.name(), jSONObject3);
        }
    }

    private final void l(k.d dVar) {
        if (H() || z() || A()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        q("Cancel listening");
        this.V.post(new l(this));
        if (!this.f10956v) {
            r();
        }
        C(false);
        dVar.a(Boolean.TRUE);
        q("Cancel listening done");
    }

    /* access modifiers changed from: private */
    public static final void m(q qVar) {
        l.e(qVar, "this$0");
        SpeechRecognizer speechRecognizer = qVar.I;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
    }

    private final void n() {
        q("completeInitialize");
        if (this.f10960z) {
            q("Testing recognition availability");
            Context context = this.f10947m;
            if (context != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (!SpeechRecognizer.isRecognitionAvailable(context) && !SpeechRecognizer.isOnDeviceRecognitionAvailable(context)) {
                        Log.e(this.f10955u, "Speech recognition not available on this device");
                        k.d dVar = this.f10958x;
                        if (dVar != null) {
                            dVar.b(h.recognizerNotAvailable.name(), "Speech recognition not available on this device", "");
                        }
                        this.f10958x = null;
                        return;
                    }
                } else if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                    Log.e(this.f10955u, "Speech recognition not available on this device");
                    k.d dVar2 = this.f10958x;
                    if (dVar2 != null) {
                        dVar2.b(h.recognizerNotAvailable.name(), "Speech recognition not available on this device", "");
                    }
                    this.f10958x = null;
                    return;
                }
                K();
            } else {
                q("null context during initialization");
                k.d dVar3 = this.f10958x;
                if (dVar3 != null) {
                    dVar3.a(Boolean.FALSE);
                }
                k.d dVar4 = this.f10958x;
                if (dVar4 != null) {
                    dVar4.b(h.missingContext.name(), "context unexpectedly null, initialization failed", "");
                }
                this.f10958x = null;
                return;
            }
        }
        this.f10959y = this.f10960z;
        q("sending result");
        k.d dVar5 = this.f10958x;
        if (dVar5 != null) {
            dVar5.a(Boolean.valueOf(this.f10960z));
        }
        q("leaving complete");
        this.f10958x = null;
    }

    private final void o(boolean z9) {
        SpeechRecognizer speechRecognizer = this.I;
        if (speechRecognizer == null || z9 != this.H) {
            this.H = z9;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.I = null;
            this.V.post(new o(this, z9));
            q("before setup intent");
            L(this.W, true, f.deviceDefault, false);
            q("after setup intent");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(k1.q r4, boolean r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.l.e(r4, r0)
            java.lang.String r0 = "Creating recognizer"
            r4.q(r0)
            boolean r0 = r4.D
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.content.Context r5 = r4.f10947m
            if (r5 == 0) goto L_0x0018
            android.content.ComponentName r0 = r4.t(r5)
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createSpeechRecognizer(r5, r0)
            java.lang.String r0 = "Setting listener after intent lookup"
            goto L_0x0052
        L_0x0020:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0046
            if (r5 == 0) goto L_0x0046
            android.content.Context r5 = r4.f10947m
            kotlin.jvm.internal.l.b(r5)
            boolean r5 = android.speech.SpeechRecognizer.isOnDeviceRecognitionAvailable(r5)
            if (r5 == 0) goto L_0x0046
            android.content.Context r5 = r4.f10947m
            kotlin.jvm.internal.l.b(r5)
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createOnDeviceSpeechRecognizer(r5)
            java.lang.String r0 = "Setting on device listener"
            r4.q(r0)
            r5.setRecognitionListener(r4)
            r4.I = r5
        L_0x0046:
            android.speech.SpeechRecognizer r5 = r4.I
            if (r5 != 0) goto L_0x005a
            android.content.Context r5 = r4.f10947m
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createSpeechRecognizer(r5)
            java.lang.String r0 = "Setting default listener"
        L_0x0052:
            r4.q(r0)
            r5.setRecognitionListener(r4)
            r4.I = r5
        L_0x005a:
            android.speech.SpeechRecognizer r5 = r4.I
            if (r5 != 0) goto L_0x0076
            java.lang.String r5 = r4.f10955u
            java.lang.String r0 = "Speech recognizer null"
            android.util.Log.e(r5, r0)
            k7.k$d r5 = r4.f10958x
            if (r5 == 0) goto L_0x0074
            k1.h r2 = k1.h.recognizerNotAvailable
            java.lang.String r2 = r2.name()
            java.lang.String r3 = ""
            r5.b(r2, r0, r3)
        L_0x0074:
            r4.f10958x = r1
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.q.p(k1.q, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void q(String str) {
        if (this.B) {
            Log.d(this.f10955u, str);
        }
    }

    private final void r() {
        this.V.postDelayed(new i(this), 50);
    }

    /* access modifiers changed from: private */
    public static final void s(q qVar) {
        l.e(qVar, "this$0");
        qVar.q("Recognizer destroy");
        SpeechRecognizer speechRecognizer = qVar.I;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        qVar.I = null;
    }

    private final ComponentName t(Context context) {
        ServiceInfo serviceInfo;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
        l.d(queryIntentServices, "queryIntentServices(...)");
        q("RecognitionService, found: " + queryIntentServices.size());
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
            if (serviceInfo2 != null) {
                l.b(serviceInfo2);
                q("RecognitionService: packageName: " + serviceInfo2.packageName + ", name: " + serviceInfo2.name);
            }
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) v.n(queryIntentServices);
        if (resolveInfo2 == null || (serviceInfo = resolveInfo2.serviceInfo) == null) {
            return null;
        }
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    private final void u(k.d dVar) {
        if (H()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        q("Start has_permission");
        Context context = this.f10947m;
        if (context != null) {
            dVar.a(Boolean.valueOf(androidx.core.content.a.a(context, "android.permission.RECORD_AUDIO") == 0));
        }
    }

    private final void v(k.d dVar) {
        if (H()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        this.f10956v = Build.VERSION.SDK_INT != this.f10950p || this.C;
        q("Start initialize");
        if (this.f10958x != null) {
            dVar.b(h.multipleRequests.name(), "Only one initialize at a time", (Object) null);
            return;
        }
        this.f10958x = dVar;
        w(this.f10947m);
    }

    private final void w(Context context) {
        String str;
        if (context == null) {
            n();
            return;
        }
        boolean z9 = true;
        this.f10960z = androidx.core.content.a.a(context, "android.permission.RECORD_AUDIO") == 0;
        if ((androidx.core.content.a.a(context, "android.permission.BLUETOOTH_CONNECT") == 0) && !this.E) {
            z9 = false;
        }
        this.F = z9;
        q("Checked permission");
        if (!this.f10960z) {
            Activity activity = this.f10957w;
            if (activity != null) {
                q("Requesting permission");
                String[] strArr = {"android.permission.RECORD_AUDIO"};
                if (!this.E) {
                    strArr = (String[]) i.f(strArr, "android.permission.BLUETOOTH_CONNECT");
                }
                androidx.core.app.b.s(activity, strArr, this.f10952r);
                q("leaving initializeIfPermitted");
            }
            str = "no permission, no activity, completing";
        } else {
            str = "has permission, completing";
        }
        q(str);
        n();
        q("leaving initializeIfPermitted");
    }

    private final boolean x(boolean z9) {
        if (!z9) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.R;
        this.R = System.currentTimeMillis();
        return currentTimeMillis >= 0 && currentTimeMillis < ((long) 100);
    }

    private final boolean y() {
        return this.A;
    }

    private final boolean z() {
        return !this.f10959y;
    }

    public void onAttachedToActivity(d7.c cVar) {
        l.e(cVar, "binding");
        this.f10957w = cVar.d();
        cVar.b(this);
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "flutterPluginBinding");
        Context a10 = bVar.a();
        l.d(a10, "getApplicationContext(...)");
        c b10 = bVar.b();
        l.d(b10, "getBinaryMessenger(...)");
        D(a10, b10);
    }

    public void onBeginningOfSpeech() {
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onDetachedFromActivity() {
        this.f10957w = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f10957w = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "binding");
        this.f10947m = null;
        k kVar = this.f10948n;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
        this.f10948n = null;
    }

    public void onEndOfSpeech() {
        C(false);
    }

    public void onError(int i10) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.S;
        int i11 = (7 != i10 || this.U >= ((float) this.f10954t)) ? i10 : 6;
        q("Error " + i10 + " after start at " + currentTimeMillis + ' ' + this.T + " / " + this.U);
        switch (i11) {
            case 1:
                str = "error_network_timeout";
                break;
            case 2:
                str = "error_network";
                break;
            case 3:
                str = "error_audio_error";
                break;
            case 4:
                str = "error_server";
                break;
            case 5:
                str = "error_client";
                break;
            case 6:
                str = "error_speech_timeout";
                break;
            case 7:
                str = "error_no_match";
                break;
            case 8:
                str = "error_busy";
                break;
            case 9:
                str = "error_permission";
                break;
            case 10:
                str = "error_too_many_requests";
                break;
            case 11:
                str = "error_server_disconnected";
                break;
            case 12:
                str = "error_language_not_supported";
                break;
            case 13:
                str = "error_language_unavailable";
                break;
            default:
                str = "error_unknown (" + i10 + ')';
                break;
        }
        I(str);
        if (y()) {
            C(false);
        }
    }

    public void onEvent(int i10, Bundle bundle) {
    }

    public void onMethodCall(j jVar, k.d dVar) {
        l.e(jVar, "call");
        l.e(dVar, "rawrResult");
        d dVar2 = new d(dVar);
        try {
            String str = jVar.f10996a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1367724422:
                        if (!str.equals("cancel")) {
                            break;
                        } else {
                            l(dVar2);
                            return;
                        }
                    case -1198472044:
                        if (!str.equals("has_permission")) {
                            break;
                        } else {
                            u(dVar2);
                            return;
                        }
                    case -1102508601:
                        if (!str.equals("listen")) {
                            break;
                        } else {
                            String str2 = (String) jVar.a("localeId");
                            if (str2 == null) {
                                str2 = this.W;
                            }
                            String str3 = str2;
                            Boolean bool = (Boolean) jVar.a("partialResults");
                            if (bool == null) {
                                bool = Boolean.TRUE;
                            }
                            Boolean bool2 = (Boolean) jVar.a("onDevice");
                            if (bool2 == null) {
                                bool2 = Boolean.FALSE;
                            }
                            Integer num = (Integer) jVar.a("listenMode");
                            if (num == null) {
                                dVar2.b(h.missingOrInvalidArg.name(), "listenMode is required", (Object) null);
                                return;
                            }
                            N(dVar2, str3, bool.booleanValue(), num.intValue(), bool2.booleanValue());
                            return;
                        }
                    case 3540994:
                        if (!str.equals("stop")) {
                            break;
                        } else {
                            P(dVar2);
                            return;
                        }
                    case 338410841:
                        if (!str.equals("locales")) {
                            break;
                        } else {
                            B(dVar2);
                            return;
                        }
                    case 871091088:
                        if (!str.equals("initialize")) {
                            break;
                        } else {
                            Boolean bool3 = (Boolean) jVar.a("debugLogging");
                            if (bool3 != null) {
                                this.B = bool3.booleanValue();
                            }
                            Boolean bool4 = (Boolean) jVar.a("alwaysUseStop");
                            if (bool4 != null) {
                                this.C = l.a(bool4, Boolean.TRUE);
                            }
                            Boolean bool5 = (Boolean) jVar.a("intentLookup");
                            if (bool5 != null) {
                                this.D = l.a(bool5, Boolean.TRUE);
                            }
                            Boolean bool6 = (Boolean) jVar.a("noBluetooth");
                            if (bool6 != null) {
                                this.E = l.a(bool6, Boolean.TRUE);
                            }
                            v(dVar2);
                            return;
                        }
                }
            }
            dVar2.c();
        } catch (Exception e10) {
            Log.e(this.f10955u, "Unexpected exception", e10);
            dVar2.b(h.unknown.name(), "Unexpected exception", e10.getLocalizedMessage());
        }
    }

    public void onPartialResults(Bundle bundle) {
        R(bundle, false);
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onReattachedToActivityForConfigChanges(d7.c cVar) {
        l.e(cVar, "binding");
        this.f10957w = cVar.d();
        cVar.b(this);
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.e(strArr, "permissions");
        l.e(iArr, "grantResults");
        boolean z9 = false;
        if (i10 != this.f10952r) {
            return false;
        }
        this.f10960z = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        if ((iArr.length == 0) || iArr.length == 1 || iArr[1] != 0 || this.E) {
            z9 = true;
        }
        this.F = z9;
        n();
        return true;
    }

    public void onResults(Bundle bundle) {
        R(bundle, true);
    }

    public void onRmsChanged(float f10) {
        if (f10 < this.T) {
            this.T = f10;
        }
        if (f10 > this.U) {
            this.U = f10;
        }
        q("rmsDB " + this.T + " / " + this.U);
        this.V.post(new m(this, f10));
    }
}
