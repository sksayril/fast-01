package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import k7.a;
import k7.c;
import k7.f;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final k7.a<Object> f9873a;

    public interface a {
        void a(boolean z9);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f9874a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f9875b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f9874a = keyEvent;
            this.f9875b = ch;
        }
    }

    public d(c cVar) {
        this.f9873a = new k7.a<>(cVar, "flutter/keyevent", f.f10994a);
    }

    private static a.e<Object> b(a aVar) {
        return new c(aVar);
    }

    private Map<String, Object> c(b bVar, boolean z9) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z9 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f9874a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f9874a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f9874a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f9874a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f9874a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f9874a.getMetaState()));
        Character ch = bVar.f9875b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f9874a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f9874a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f9874a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z9 = false;
        if (obj != null) {
            try {
                z9 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                x6.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e10);
            }
        }
        aVar.a(z9);
    }

    public void e(b bVar, boolean z9, a aVar) {
        this.f9873a.d(c(bVar, z9), b(aVar));
    }
}
