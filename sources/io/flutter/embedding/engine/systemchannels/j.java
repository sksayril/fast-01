package io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.k;
import org.json.JSONArray;
import org.json.JSONObject;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final k7.k f9897a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public h f9898b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f9899c;

    class a implements k.c {
        a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:61|62) */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
            r7.a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r7.b("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x010a */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x012b A[Catch:{ JSONException -> 0x0234 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(k7.j r6, k7.k.d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f10996a
                java.lang.Object r6 = r6.f10997b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                x6.b.f(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0234 }
                switch(r4) {
                    case -1501580720: goto L_0x00c0;
                    case -766342101: goto L_0x00b5;
                    case -720677196: goto L_0x00aa;
                    case -577225884: goto L_0x00a0;
                    case -548468504: goto L_0x0096;
                    case -247230243: goto L_0x008c;
                    case -215273374: goto L_0x0082;
                    case 241845679: goto L_0x0078;
                    case 875995648: goto L_0x006d;
                    case 1128339786: goto L_0x0063;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0234 }
            L_0x0033:
                goto L_0x00ca
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 2
                goto L_0x00ca
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 4
                goto L_0x00ca
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 11
                goto L_0x00ca
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 8
                goto L_0x00ca
            L_0x0063:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 5
                goto L_0x00ca
            L_0x006d:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 13
                goto L_0x00ca
            L_0x0078:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 7
                goto L_0x00ca
            L_0x0082:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 0
                goto L_0x00ca
            L_0x008c:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 1
                goto L_0x00ca
            L_0x0096:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 3
                goto L_0x00ca
            L_0x00a0:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 6
                goto L_0x00ca
            L_0x00aa:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 12
                goto L_0x00ca
            L_0x00b5:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 10
                goto L_0x00ca
            L_0x00c0:
                java.lang.String r4 = "SystemNavigator.setFrameworkHandlesBack"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0234 }
                if (r1 == 0) goto L_0x00ca
                r2 = 9
            L_0x00ca:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x021a;
                    case 1: goto L_0x0200;
                    case 2: goto L_0x01e2;
                    case 3: goto L_0x01c6;
                    case 4: goto L_0x01a8;
                    case 5: goto L_0x018a;
                    case 6: goto L_0x017f;
                    case 7: goto L_0x0174;
                    case 8: goto L_0x0152;
                    case 9: goto L_0x0142;
                    case 10: goto L_0x0138;
                    case 11: goto L_0x0101;
                    case 12: goto L_0x00ed;
                    case 13: goto L_0x00d4;
                    default: goto L_0x00cf;
                }
            L_0x00cf:
                r7.c()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x024d
            L_0x00d4:
                io.flutter.embedding.engine.systemchannels.j r6 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r6 = r6.f9898b     // Catch:{ JSONException -> 0x0234 }
                boolean r6 = r6.r()     // Catch:{ JSONException -> 0x0234 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0234 }
                r1.<init>()     // Catch:{ JSONException -> 0x0234 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0234 }
                r7.a(r1)     // Catch:{ JSONException -> 0x0234 }
                goto L_0x024d
            L_0x00ed:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0234 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x0234 }
                r1.m(r6)     // Catch:{ JSONException -> 0x0234 }
            L_0x00fc:
                r7.a(r3)     // Catch:{ JSONException -> 0x0234 }
                goto L_0x024d
            L_0x0101:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0234 }
                if (r6 == 0) goto L_0x011e
                io.flutter.embedding.engine.systemchannels.j$e r6 = io.flutter.embedding.engine.systemchannels.j.e.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x010a }
                goto L_0x011f
            L_0x010a:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0234 }
                r2.<init>()     // Catch:{ JSONException -> 0x0234 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0234 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0234 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0234 }
                r7.b(r0, r6, r3)     // Catch:{ JSONException -> 0x0234 }
            L_0x011e:
                r6 = r3
            L_0x011f:
                io.flutter.embedding.engine.systemchannels.j r2 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r2 = r2.f9898b     // Catch:{ JSONException -> 0x0234 }
                java.lang.CharSequence r6 = r2.s(r6)     // Catch:{ JSONException -> 0x0234 }
                if (r6 == 0) goto L_0x00fc
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0234 }
                r2.<init>()     // Catch:{ JSONException -> 0x0234 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0234 }
                r7.a(r2)     // Catch:{ JSONException -> 0x0234 }
                goto L_0x024d
            L_0x0138:
                io.flutter.embedding.engine.systemchannels.j r6 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r6 = r6.f9898b     // Catch:{ JSONException -> 0x0234 }
                r6.b()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x00fc
            L_0x0142:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0234 }
                boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x0234 }
                r1.g(r6)     // Catch:{ JSONException -> 0x0234 }
                goto L_0x00fc
            L_0x0152:
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                io.flutter.embedding.engine.systemchannels.j$j r6 = r1.i(r6)     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                r1.n(r6)     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                r7.a(r3)     // Catch:{ JSONException -> 0x016a, NoSuchFieldException -> 0x0168 }
                goto L_0x024d
            L_0x0168:
                r6 = move-exception
                goto L_0x016b
            L_0x016a:
                r6 = move-exception
            L_0x016b:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
            L_0x016f:
                r7.b(r0, r6, r3)     // Catch:{ JSONException -> 0x0234 }
                goto L_0x024d
            L_0x0174:
                io.flutter.embedding.engine.systemchannels.j r6 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r6 = r6.f9898b     // Catch:{ JSONException -> 0x0234 }
                r6.l()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x00fc
            L_0x017f:
                io.flutter.embedding.engine.systemchannels.j r6 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x0234 }
                io.flutter.embedding.engine.systemchannels.j$h r6 = r6.f9898b     // Catch:{ JSONException -> 0x0234 }
                r6.k()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x00fc
            L_0x018a:
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                io.flutter.embedding.engine.systemchannels.j$k r6 = r1.j(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r1.j(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r7.a(r3)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                goto L_0x024d
            L_0x01a0:
                r6 = move-exception
                goto L_0x01a3
            L_0x01a2:
                r6 = move-exception
            L_0x01a3:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x01a8:
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                java.util.List r6 = r1.k(r6)     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                r1.i(r6)     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                r7.a(r3)     // Catch:{ JSONException -> 0x01c0, NoSuchFieldException -> 0x01be }
                goto L_0x024d
            L_0x01be:
                r6 = move-exception
                goto L_0x01c1
            L_0x01c0:
                r6 = move-exception
            L_0x01c1:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x01c6:
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01dc }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01dc }
                io.flutter.embedding.engine.systemchannels.j$c r6 = r1.g(r6)     // Catch:{ JSONException -> 0x01dc }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01dc }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x01dc }
                r1.p(r6)     // Catch:{ JSONException -> 0x01dc }
                r7.a(r3)     // Catch:{ JSONException -> 0x01dc }
                goto L_0x024d
            L_0x01dc:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x01e2:
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                int r6 = r1.h(r6)     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                r1.o(r6)     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                r7.a(r3)     // Catch:{ JSONException -> 0x01f9, NoSuchFieldException -> 0x01f7 }
                goto L_0x024d
            L_0x01f7:
                r6 = move-exception
                goto L_0x01fa
            L_0x01f9:
                r6 = move-exception
            L_0x01fa:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x0200:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0213 }
                io.flutter.embedding.engine.systemchannels.j$g r6 = io.flutter.embedding.engine.systemchannels.j.g.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x0213 }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ NoSuchFieldException -> 0x0213 }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ NoSuchFieldException -> 0x0213 }
                r1.q(r6)     // Catch:{ NoSuchFieldException -> 0x0213 }
                r7.a(r3)     // Catch:{ NoSuchFieldException -> 0x0213 }
                goto L_0x024d
            L_0x0213:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x021a:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x022d }
                io.flutter.embedding.engine.systemchannels.j$i r6 = io.flutter.embedding.engine.systemchannels.j.i.fromValue(r6)     // Catch:{ NoSuchFieldException -> 0x022d }
                io.flutter.embedding.engine.systemchannels.j r1 = io.flutter.embedding.engine.systemchannels.j.this     // Catch:{ NoSuchFieldException -> 0x022d }
                io.flutter.embedding.engine.systemchannels.j$h r1 = r1.f9898b     // Catch:{ NoSuchFieldException -> 0x022d }
                r1.h(r6)     // Catch:{ NoSuchFieldException -> 0x022d }
                r7.a(r3)     // Catch:{ NoSuchFieldException -> 0x022d }
                goto L_0x024d
            L_0x022d:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0234 }
                goto L_0x016f
            L_0x0234:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.b(r0, r6, r3)
            L_0x024d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.j.a.onMethodCall(k7.j, k7.k$d):void");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9901a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9902b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f9903c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.j$k[] r0 = io.flutter.embedding.engine.systemchannels.j.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9903c = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.j$k r2 = io.flutter.embedding.engine.systemchannels.j.k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9903c     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.j$k r3 = io.flutter.embedding.engine.systemchannels.j.k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9903c     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.j$k r4 = io.flutter.embedding.engine.systemchannels.j.k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f9903c     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.j$k r5 = io.flutter.embedding.engine.systemchannels.j.k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                io.flutter.embedding.engine.systemchannels.j$l[] r4 = io.flutter.embedding.engine.systemchannels.j.l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f9902b = r4
                io.flutter.embedding.engine.systemchannels.j$l r5 = io.flutter.embedding.engine.systemchannels.j.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f9902b     // Catch:{ NoSuchFieldError -> 0x004e }
                io.flutter.embedding.engine.systemchannels.j$l r5 = io.flutter.embedding.engine.systemchannels.j.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                io.flutter.embedding.engine.systemchannels.j$f[] r4 = io.flutter.embedding.engine.systemchannels.j.f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f9901a = r4
                io.flutter.embedding.engine.systemchannels.j$f r5 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f9901a     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.j$f r4 = io.flutter.embedding.engine.systemchannels.j.f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f9901a     // Catch:{ NoSuchFieldError -> 0x0073 }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f9901a     // Catch:{ NoSuchFieldError -> 0x007d }
                io.flutter.embedding.engine.systemchannels.j$f r1 = io.flutter.embedding.engine.systemchannels.j.f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.j.b.<clinit>():void");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f9904a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9905b;

        public c(int i10, String str) {
            this.f9904a = i10;
            this.f9905b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        
        private String encodedName;

        private d(String str) {
            this.encodedName = str;
        }

        static d fromValue(String str) {
            for (d dVar : values()) {
                if (dVar.encodedName.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");
        
        private String encodedName;

        private e(String str) {
            this.encodedName = str;
        }

        static e fromValue(String str) {
            for (e eVar : values()) {
                if (eVar.encodedName.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        
        private String encodedName;

        private f(String str) {
            this.encodedName = str;
        }

        static f fromValue(String str) {
            for (f fVar : values()) {
                if (fVar.encodedName.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        
        private final String encodedName;

        private g(String str) {
            this.encodedName = str;
        }

        static g fromValue(String str) {
            for (g gVar : values()) {
                String str2 = gVar.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void b();

        void g(boolean z9);

        void h(i iVar);

        void i(List<l> list);

        void j(k kVar);

        void k();

        void l();

        void m(String str);

        void n(C0155j jVar);

        void o(int i10);

        void p(c cVar);

        void q(g gVar);

        boolean r();

        CharSequence s(e eVar);
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        
        private final String encodedName;

        private i(String str) {
            this.encodedName = str;
        }

        static i fromValue(String str) {
            for (i iVar : values()) {
                if (iVar.encodedName.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.j$j  reason: collision with other inner class name */
    public static class C0155j {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f9906a;

        /* renamed from: b  reason: collision with root package name */
        public final d f9907b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f9908c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f9909d;

        /* renamed from: e  reason: collision with root package name */
        public final d f9910e;

        /* renamed from: f  reason: collision with root package name */
        public final Integer f9911f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f9912g;

        public C0155j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f9906a = num;
            this.f9907b = dVar;
            this.f9908c = bool;
            this.f9909d = num2;
            this.f9910e = dVar2;
            this.f9911f = num3;
            this.f9912g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        
        private String encodedName;

        private k(String str) {
            this.encodedName = str;
        }

        static k fromValue(String str) {
            for (k kVar : values()) {
                if (kVar.encodedName.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        
        private String encodedName;

        private l(String str) {
            this.encodedName = str;
        }

        static l fromValue(String str) {
            for (l lVar : values()) {
                if (lVar.encodedName.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public j(y6.a aVar) {
        a aVar2 = new a();
        this.f9899c = aVar2;
        k7.k kVar = new k7.k(aVar, "flutter/platform", k7.g.f10995a);
        this.f9897a = kVar;
        kVar.e(aVar2);
    }

    /* access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i10 = jSONObject.getInt("primaryColor");
        if (i10 != 0) {
            i10 |= -16777216;
        }
        return new c(i10, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.systemchannels.j$f r4 = io.flutter.embedding.engine.systemchannels.j.f.fromValue(r4)
            int[] r8 = io.flutter.embedding.engine.systemchannels.j.b.f9901a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.j.h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    public C0155j i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        d fromValue = !jSONObject.isNull("statusBarIconBrightness") ? d.fromValue(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        d fromValue2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new C0155j(valueOf, fromValue, valueOf2, valueOf3, fromValue2, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    public k j(String str) {
        int i10 = b.f9903c[k.fromValue(str).ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = b.f9902b[l.fromValue(jSONArray.getString(i10)).ordinal()];
            if (i11 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i11 != 2) {
            } else {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f9898b = hVar;
    }

    public void m(boolean z9) {
        x6.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f9897a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z9)}));
    }
}
