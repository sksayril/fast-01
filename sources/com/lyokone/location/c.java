package com.lyokone.location;

import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import k7.j;
import k7.k;
import r6.f;

final class c implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private a f7651m;

    /* renamed from: n  reason: collision with root package name */
    private FlutterLocationService f7652n;

    /* renamed from: o  reason: collision with root package name */
    private k f7653o;

    c() {
    }

    private void a(j jVar, k.d dVar) {
        Boolean bool = (Boolean) jVar.a("enable");
        FlutterLocationService flutterLocationService = this.f7652n;
        if (!(flutterLocationService == null || bool == null)) {
            boolean b10 = flutterLocationService.b();
            boolean booleanValue = bool.booleanValue();
            if (b10) {
                if (booleanValue) {
                    this.f7652n.d();
                    dVar.a(1);
                    return;
                }
            } else if (booleanValue) {
                this.f7652n.l(dVar);
                this.f7652n.j();
                return;
            }
            this.f7652n.c();
        }
        dVar.a(0);
    }

    private void b(k.d dVar) {
        FlutterLocationService flutterLocationService = this.f7652n;
        dVar.a(Integer.valueOf(flutterLocationService != null ? flutterLocationService.i() : false ? 1 : 0));
    }

    private void c(j jVar, k.d dVar) {
        try {
            String str = (String) jVar.a("channelName");
            if (str == null) {
                str = "Location background service";
            }
            String str2 = str;
            String str3 = (String) jVar.a("title");
            if (str3 == null) {
                str3 = "Location background service running";
            }
            String str4 = str3;
            String str5 = (String) jVar.a("iconName");
            if (str5 == null) {
                str5 = "navigation_empty_icon";
            }
            String str6 = str5;
            String str7 = (String) jVar.a("subtitle");
            String str8 = (String) jVar.a("description");
            Boolean bool = (Boolean) jVar.a("onTapBringToFront");
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            String str9 = (String) jVar.a("color");
            dVar.a(this.f7652n.a(new f(str2, str4, str6, str7, str8, str9 != null ? Integer.valueOf(Color.parseColor(str9)) : null, bool.booleanValue())));
        } catch (Exception e10) {
            dVar.b("CHANGE_NOTIFICATION_OPTIONS_ERROR", "An unexpected error happened during notification options change:" + e10.getMessage(), (Object) null);
        }
    }

    private void d(j jVar, k.d dVar) {
        try {
            Long l10 = new Long((long) ((Integer) jVar.a("interval")).intValue());
            Long valueOf = Long.valueOf(l10.longValue() / 2);
            Float f10 = new Float(((Double) jVar.a("distanceFilter")).doubleValue());
            this.f7651m.g(this.f7651m.D.get(((Integer) jVar.a("accuracy")).intValue()), l10, valueOf, f10);
            dVar.a(1);
        } catch (Exception e10) {
            dVar.b("CHANGE_SETTINGS_ERROR", "An unexcepted error happened during location settings change:" + e10.getMessage(), (Object) null);
        }
    }

    private void e(k.d dVar) {
        a aVar = this.f7651m;
        aVar.B = dVar;
        if (!aVar.h()) {
            this.f7651m.r();
        } else {
            this.f7651m.w();
        }
    }

    private void f(k.d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.a(1);
        } else if (this.f7651m.h()) {
            dVar.a(1);
        } else {
            dVar.a(0);
        }
    }

    private void g(k.d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.a(1);
            return;
        }
        a aVar = this.f7651m;
        aVar.f7642z = dVar;
        aVar.r();
    }

    private void h(k.d dVar) {
        try {
            dVar.a(Integer.valueOf(this.f7651m.i() ? 1 : 0));
        } catch (Exception unused) {
            dVar.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(a aVar) {
        this.f7651m = aVar;
    }

    /* access modifiers changed from: package-private */
    public void j(FlutterLocationService flutterLocationService) {
        this.f7652n = flutterLocationService;
    }

    /* access modifiers changed from: package-private */
    public void k(k7.c cVar) {
        if (this.f7653o != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            l();
        }
        k kVar = new k(cVar, "lyokone/location");
        this.f7653o = kVar;
        kVar.e(this);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        k kVar = this.f7653o;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e((k.c) null);
        this.f7653o = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -972798202:
                if (str.equals("isBackgroundModeEnabled")) {
                    c10 = 0;
                    break;
                }
                break;
            case -724480940:
                if (str.equals("enableBackgroundMode")) {
                    c10 = 1;
                    break;
                }
                break;
            case -316023509:
                if (str.equals("getLocation")) {
                    c10 = 2;
                    break;
                }
                break;
            case 128007462:
                if (str.equals("requestService")) {
                    c10 = 3;
                    break;
                }
                break;
            case 171850761:
                if (str.equals("hasPermission")) {
                    c10 = 4;
                    break;
                }
                break;
            case 473496931:
                if (str.equals("changeNotificationOptions")) {
                    c10 = 5;
                    break;
                }
                break;
            case 646862540:
                if (str.equals("serviceEnabled")) {
                    c10 = 6;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1149076467:
                if (str.equals("changeSettings")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                b(dVar);
                return;
            case 1:
                a(jVar, dVar);
                return;
            case 2:
                e(dVar);
                return;
            case 3:
                this.f7651m.s(dVar);
                return;
            case 4:
                f(dVar);
                return;
            case 5:
                c(jVar, dVar);
                return;
            case 6:
                h(dVar);
                return;
            case 7:
                g(dVar);
                return;
            case 8:
                d(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }
}
