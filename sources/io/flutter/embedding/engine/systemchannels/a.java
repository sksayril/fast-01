package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import k7.a;
import k7.r;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final k7.a<Object> f9862a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f9863b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f9864c;

    /* renamed from: d  reason: collision with root package name */
    public final a.d<Object> f9865d;

    /* renamed from: io.flutter.embedding.engine.systemchannels.a$a  reason: collision with other inner class name */
    class C0154a implements a.d<Object> {
        C0154a() {
        }

        public void a(Object obj, a.e<Object> eVar) {
            if (a.this.f9864c == null) {
                eVar.a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            x6.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f9864c.d(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f9864c.a(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f9864c.g(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f9864c.e(num2.intValue());
                        break;
                    }
                    break;
                case 4:
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.this.f9864c.f(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i10);

        void f(int i10);

        void g(int i10);
    }

    public a(y6.a aVar, FlutterJNI flutterJNI) {
        C0154a aVar2 = new C0154a();
        this.f9865d = aVar2;
        k7.a<Object> aVar3 = new k7.a<>(aVar, "flutter/accessibility", r.f11008a);
        this.f9862a = aVar3;
        aVar3.e(aVar2);
        this.f9863b = flutterJNI;
    }

    public void b(int i10, c.g gVar) {
        this.f9863b.dispatchSemanticsAction(i10, gVar);
    }

    public void c(int i10, c.g gVar, Object obj) {
        this.f9863b.dispatchSemanticsAction(i10, gVar, obj);
    }

    public void d() {
        this.f9863b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f9863b.setSemanticsEnabled(true);
    }

    public void f(int i10) {
        this.f9863b.setAccessibilityFeatures(i10);
    }

    public void g(b bVar) {
        this.f9864c = bVar;
        this.f9863b.setAccessibilityDelegate(bVar);
    }
}
