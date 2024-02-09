package io.flutter.embedding.engine.systemchannels;

import java.util.Locale;
import k7.t;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private b f9881a;

    /* renamed from: b  reason: collision with root package name */
    private b f9882b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9883c;

    /* renamed from: d  reason: collision with root package name */
    private final k7.a<String> f9884d;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9885a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.f$b[] r0 = io.flutter.embedding.engine.systemchannels.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9885a = r0
                io.flutter.embedding.engine.systemchannels.f$b r1 = io.flutter.embedding.engine.systemchannels.f.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9885a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.f$b r1 = io.flutter.embedding.engine.systemchannels.f.b.INACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9885a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.engine.systemchannels.f$b r1 = io.flutter.embedding.engine.systemchannels.f.b.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9885a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.embedding.engine.systemchannels.f$b r1 = io.flutter.embedding.engine.systemchannels.f.b.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9885a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.flutter.embedding.engine.systemchannels.f$b r1 = io.flutter.embedding.engine.systemchannels.f.b.DETACHED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.f.a.<clinit>():void");
        }
    }

    private enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public f(k7.a<String> aVar) {
        this.f9881a = null;
        this.f9882b = null;
        this.f9883c = true;
        this.f9884d = aVar;
    }

    public f(y6.a aVar) {
        this((k7.a<String>) new k7.a(aVar, "flutter/lifecycle", t.f11014b));
    }

    private void g(b bVar, boolean z9) {
        b bVar2 = this.f9881a;
        if (bVar2 != bVar || z9 != this.f9883c) {
            if (bVar == null && bVar2 == null) {
                this.f9883c = z9;
                return;
            }
            b bVar3 = null;
            int i10 = a.f9885a[bVar.ordinal()];
            if (i10 == 1) {
                bVar3 = z9 ? b.RESUMED : b.INACTIVE;
            } else if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                bVar3 = bVar;
            }
            this.f9881a = bVar;
            this.f9883c = z9;
            if (bVar3 != this.f9882b) {
                String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
                x6.b.f("LifecycleChannel", "Sending " + str + " message.");
                this.f9884d.c(str);
                this.f9882b = bVar3;
            }
        }
    }

    public void a() {
        g(this.f9881a, true);
    }

    public void b() {
        g(b.DETACHED, this.f9883c);
    }

    public void c() {
        g(b.INACTIVE, this.f9883c);
    }

    public void d() {
        g(b.PAUSED, this.f9883c);
    }

    public void e() {
        g(b.RESUMED, this.f9883c);
    }

    public void f() {
        g(this.f9881a, false);
    }
}
