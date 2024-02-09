package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k7.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public final k f9966a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public f f9967b;

    /* renamed from: c  reason: collision with root package name */
    final k.c f9968c;

    class a implements k.c {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
            r2.a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(k7.j r18, k7.k.d r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r3 = "data"
                io.flutter.embedding.engine.systemchannels.q r4 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r4 = r4.f9967b
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r4 = r0.f10996a
                java.lang.Object r0 = r0.f10997b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Received '"
                r5.append(r6)
                r5.append(r4)
                java.lang.String r6 = "' message."
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "TextInputChannel"
                x6.b.f(r6, r5)
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                r7 = 1
                r8 = 0
                switch(r6) {
                    case -1779068172: goto L_0x00a8;
                    case -1015421462: goto L_0x009d;
                    case -37561188: goto L_0x0092;
                    case 270476819: goto L_0x0087;
                    case 270803918: goto L_0x007c;
                    case 649192816: goto L_0x0071;
                    case 1204752139: goto L_0x0066;
                    case 1727570905: goto L_0x005b;
                    case 1904427655: goto L_0x004d;
                    case 2113369584: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00b2
            L_0x003f:
                java.lang.String r6 = "TextInput.requestAutofill"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0049
                goto L_0x00b2
            L_0x0049:
                r5 = 9
                goto L_0x00b2
            L_0x004d:
                java.lang.String r6 = "TextInput.clearClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0057
                goto L_0x00b2
            L_0x0057:
                r5 = 8
                goto L_0x00b2
            L_0x005b:
                java.lang.String r6 = "TextInput.finishAutofillContext"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0064
                goto L_0x00b2
            L_0x0064:
                r5 = 7
                goto L_0x00b2
            L_0x0066:
                java.lang.String r6 = "TextInput.setEditableSizeAndTransform"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x006f
                goto L_0x00b2
            L_0x006f:
                r5 = 6
                goto L_0x00b2
            L_0x0071:
                java.lang.String r6 = "TextInput.sendAppPrivateCommand"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x007a
                goto L_0x00b2
            L_0x007a:
                r5 = 5
                goto L_0x00b2
            L_0x007c:
                java.lang.String r6 = "TextInput.show"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0085
                goto L_0x00b2
            L_0x0085:
                r5 = 4
                goto L_0x00b2
            L_0x0087:
                java.lang.String r6 = "TextInput.hide"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0090
                goto L_0x00b2
            L_0x0090:
                r5 = 3
                goto L_0x00b2
            L_0x0092:
                java.lang.String r6 = "TextInput.setClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x009b
                goto L_0x00b2
            L_0x009b:
                r5 = 2
                goto L_0x00b2
            L_0x009d:
                java.lang.String r6 = "TextInput.setEditingState"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00b2
            L_0x00a6:
                r5 = 1
                goto L_0x00b2
            L_0x00a8:
                java.lang.String r6 = "TextInput.setPlatformViewClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r5 = 0
            L_0x00b2:
                java.lang.String r4 = "error"
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0190;
                    case 1: goto L_0x017d;
                    case 2: goto L_0x0157;
                    case 3: goto L_0x014d;
                    case 4: goto L_0x0140;
                    case 5: goto L_0x0114;
                    case 6: goto L_0x00e3;
                    case 7: goto L_0x00d3;
                    case 8: goto L_0x00c8;
                    case 9: goto L_0x00bd;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                r19.c()
                goto L_0x01b1
            L_0x00bd:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r0 = r0.f9967b
                r0.h()
                goto L_0x0149
            L_0x00c8:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r0 = r0.f9967b
                r0.b()
                goto L_0x0149
            L_0x00d3:
                io.flutter.embedding.engine.systemchannels.q r3 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r3 = r3.f9967b
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r3.i(r0)
                goto L_0x0149
            L_0x00e3:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "width"
                double r10 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "height"
                double r12 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "transform"
                org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x01ab }
                r3 = 16
                double[] r14 = new double[r3]     // Catch:{ JSONException -> 0x01ab }
            L_0x00fb:
                if (r8 >= r3) goto L_0x0106
                double r15 = r0.getDouble(r8)     // Catch:{ JSONException -> 0x01ab }
                r14[r8] = r15     // Catch:{ JSONException -> 0x01ab }
                int r8 = r8 + 1
                goto L_0x00fb
            L_0x0106:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q$f r9 = r0.f9967b     // Catch:{ JSONException -> 0x01ab }
                r9.g(r10, r12, r14)     // Catch:{ JSONException -> 0x01ab }
                r2.a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0114:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "action"
                java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x01ab }
                if (r0 == 0) goto L_0x0131
                boolean r7 = r0.isEmpty()     // Catch:{ JSONException -> 0x01ab }
                if (r7 != 0) goto L_0x0131
                android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x01ab }
                r7.<init>()     // Catch:{ JSONException -> 0x01ab }
                r7.putString(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x0132
            L_0x0131:
                r7 = r6
            L_0x0132:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q$f r0 = r0.f9967b     // Catch:{ JSONException -> 0x01ab }
                r0.e(r5, r7)     // Catch:{ JSONException -> 0x01ab }
                r2.a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0140:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r0 = r0.f9967b
                r0.a()
            L_0x0149:
                r2.a(r6)
                goto L_0x01b1
            L_0x014d:
                io.flutter.embedding.engine.systemchannels.q r0 = io.flutter.embedding.engine.systemchannels.q.this
                io.flutter.embedding.engine.systemchannels.q$f r0 = r0.f9967b
                r0.j()
                goto L_0x0149
            L_0x0157:
                org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                int r3 = r0.getInt(r8)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                io.flutter.embedding.engine.systemchannels.q r5 = io.flutter.embedding.engine.systemchannels.q.this     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                io.flutter.embedding.engine.systemchannels.q$f r5 = r5.f9967b     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                io.flutter.embedding.engine.systemchannels.q$b r0 = io.flutter.embedding.engine.systemchannels.q.b.a(r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r5.c(r3, r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r2.a(r6)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                goto L_0x01b1
            L_0x0172:
                r0 = move-exception
                goto L_0x0175
            L_0x0174:
                r0 = move-exception
            L_0x0175:
                java.lang.String r0 = r0.getMessage()
            L_0x0179:
                r2.b(r4, r0, r6)
                goto L_0x01b1
            L_0x017d:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q r3 = io.flutter.embedding.engine.systemchannels.q.this     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q$f r3 = r3.f9967b     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q$e r0 = io.flutter.embedding.engine.systemchannels.q.e.a(r0)     // Catch:{ JSONException -> 0x01ab }
                r3.d(r0)     // Catch:{ JSONException -> 0x01ab }
                r2.a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0190:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "platformViewId"
                int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "usesVirtualDisplay"
                boolean r0 = r0.optBoolean(r5, r8)     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q r5 = io.flutter.embedding.engine.systemchannels.q.this     // Catch:{ JSONException -> 0x01ab }
                io.flutter.embedding.engine.systemchannels.q$f r5 = r5.f9967b     // Catch:{ JSONException -> 0x01ab }
                r5.f(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                r2.a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x01ab:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                goto L_0x0179
            L_0x01b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.q.a.onMethodCall(k7.j, k7.k$d):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9970a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9971b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9972c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f9973d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9974e;

        /* renamed from: f  reason: collision with root package name */
        public final d f9975f;

        /* renamed from: g  reason: collision with root package name */
        public final c f9976g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f9977h;

        /* renamed from: i  reason: collision with root package name */
        public final String f9978i;

        /* renamed from: j  reason: collision with root package name */
        public final a f9979j;

        /* renamed from: k  reason: collision with root package name */
        public final String[] f9980k;

        /* renamed from: l  reason: collision with root package name */
        public final b[] f9981l;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f9982a;

            /* renamed from: b  reason: collision with root package name */
            public final String[] f9983b;

            /* renamed from: c  reason: collision with root package name */
            public final e f9984c;

            /* renamed from: d  reason: collision with root package name */
            public final String f9985d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f9982a = str;
                this.f9983b = strArr;
                this.f9985d = str2;
                this.f9984c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = b(jSONArray.getString(i10));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.q.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f9970a = z9;
            this.f9971b = z10;
            this.f9972c = z11;
            this.f9973d = z12;
            this.f9974e = z13;
            this.f9975f = dVar;
            this.f9976g = cVar;
            this.f9977h = num;
            this.f9978i = str;
            this.f9979j = aVar;
            this.f9980k = strArr;
            this.f9981l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        bVarArr2[i10] = a(jSONArray.getJSONObject(i10));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b10 = b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.isNull("contentCommitMimeTypes") ? null : jSONObject2.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        arrayList.add(jSONArray2.optString(i11));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                d fromValue = d.fromValue(jSONObject2.getString("textCapitalization"));
                c a10 = c.a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = a.a(jSONObject2.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, fromValue, a10, b10, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.q.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f9986a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9987b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9988c;

        public c(g gVar, boolean z9, boolean z10) {
            this.f9986a = gVar;
            this.f9987b = z9;
            this.f9988c = z10;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        private final String encodedName;

        private d(String str) {
            this.encodedName = str;
        }

        static d fromValue(String str) {
            for (d dVar : values()) {
                if (dVar.encodedName.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f9989a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9990b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9991c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9992d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9993e;

        public e(String str, int i10, int i11, int i12, int i13) {
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            } else if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i12) + ", " + String.valueOf(i13) + ")");
            } else if (i13 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i12));
            } else if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i10));
            } else if (i11 <= str.length()) {
                this.f9989a = str;
                this.f9990b = i10;
                this.f9991c = i11;
                this.f9992d = i12;
                this.f9993e = i13;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i11));
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i10 = this.f9992d;
            return i10 >= 0 && this.f9993e > i10;
        }

        public boolean c() {
            return this.f9990b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(int i10, b bVar);

        void d(e eVar);

        void e(String str, Bundle bundle);

        void f(int i10, boolean z9);

        void g(double d10, double d11, double[] dArr);

        void h();

        void i(boolean z9);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        
        private final String encodedName;

        private g(String str) {
            this.encodedName = str;
        }

        static g fromValue(String str) {
            for (g gVar : values()) {
                if (gVar.encodedName.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public q(y6.a aVar) {
        a aVar2 = new a();
        this.f9968c = aVar2;
        k kVar = new k(aVar, "flutter/textinput", k7.g.f10995a);
        this.f9966a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<io.flutter.plugin.editing.e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> d(String str, int i10, int i11, int i12, int i13) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i10));
        hashMap.put("selectionExtent", Integer.valueOf(i11));
        hashMap.put("composingBase", Integer.valueOf(i12));
        hashMap.put("composingExtent", Integer.valueOf(i13));
        return hashMap;
    }

    public void b(int i10, Map<String, Object> map) {
        x6.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i10), "TextInputAction.commitContent", map}));
    }

    public void e(int i10) {
        x6.b.f("TextInputChannel", "Sending 'done' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.done"}));
    }

    public void f(int i10) {
        x6.b.f("TextInputChannel", "Sending 'go' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.go"}));
    }

    public void g(int i10) {
        x6.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.newline"}));
    }

    public void h(int i10) {
        x6.b.f("TextInputChannel", "Sending 'next' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.next"}));
    }

    public void i(int i10) {
        x6.b.f("TextInputChannel", "Sending 'onConnectionClosed' message.");
        this.f9966a.c("TextInputClient.onConnectionClosed", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputClient.onConnectionClosed"}));
    }

    public void j(int i10, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f9966a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i10), hashMap}));
    }

    public void k(int i10) {
        x6.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.previous"}));
    }

    public void l() {
        this.f9966a.c("TextInputClient.requestExistingInputState", (Object) null);
    }

    public void m(int i10) {
        x6.b.f("TextInputChannel", "Sending 'search' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.search"}));
    }

    public void n(int i10) {
        x6.b.f("TextInputChannel", "Sending 'send' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.send"}));
    }

    public void o(f fVar) {
        this.f9967b = fVar;
    }

    public void p(int i10) {
        x6.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f9966a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i10), "TextInputAction.unspecified"}));
    }

    public void q(int i10, String str, int i11, int i12, int i13, int i14) {
        x6.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i11 + "\nSelection end: " + i12 + "\nComposing start: " + i13 + "\nComposing end: " + i14);
        HashMap<Object, Object> d10 = d(str, i11, i12, i13, i14);
        this.f9966a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i10), d10}));
    }

    public void r(int i10, ArrayList<io.flutter.plugin.editing.e> arrayList) {
        x6.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> c10 = c(arrayList);
        this.f9966a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i10), c10}));
    }

    public void s(int i10, HashMap<String, e> hashMap) {
        x6.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            e eVar = (e) next.getValue();
            hashMap2.put((String) next.getKey(), d(eVar.f9989a, eVar.f9990b, eVar.f9991c, -1, -1));
        }
        this.f9966a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i10), hashMap2}));
    }
}
