package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.g;
import e.d;
import io.flutter.plugins.imagepicker.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k7.m;
import k7.p;

public class l implements m, p {

    /* renamed from: m  reason: collision with root package name */
    final String f10558m;

    /* renamed from: n  reason: collision with root package name */
    private final Activity f10559n;

    /* renamed from: o  reason: collision with root package name */
    private final o f10560o;

    /* renamed from: p  reason: collision with root package name */
    private final c f10561p;

    /* renamed from: q  reason: collision with root package name */
    private final h f10562q;

    /* renamed from: r  reason: collision with root package name */
    private final d f10563r;

    /* renamed from: s  reason: collision with root package name */
    private final b f10564s;

    /* renamed from: t  reason: collision with root package name */
    private final ExecutorService f10565t;

    /* renamed from: u  reason: collision with root package name */
    private c f10566u;

    /* renamed from: v  reason: collision with root package name */
    private Uri f10567v;

    /* renamed from: w  reason: collision with root package name */
    private g f10568w;

    /* renamed from: x  reason: collision with root package name */
    private final Object f10569x;

    class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10570a;

        a(Activity activity) {
            this.f10570a = activity;
        }

        public boolean a() {
            return n.b(this.f10570a);
        }

        public void b(String str, int i10) {
            androidx.core.app.b.s(this.f10570a, new String[]{str}, i10);
        }

        public boolean c(String str) {
            return androidx.core.content.a.a(this.f10570a, str) == 0;
        }
    }

    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10571a;

        b(Activity activity) {
            this.f10571a = activity;
        }

        public Uri a(String str, File file) {
            return androidx.core.content.b.f(this.f10571a, str, file);
        }

        public void b(Uri uri, f fVar) {
            Activity activity = this.f10571a;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, (String[]) null, new m(fVar));
        }
    }

    public enum c {
        REAR,
        FRONT
    }

    interface d {
        Uri a(String str, File file);

        void b(Uri uri, f fVar);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        final String f10572a;

        /* renamed from: b  reason: collision with root package name */
        final String f10573b;

        public e(String str, String str2) {
            this.f10572a = str;
            this.f10573b = str2;
        }
    }

    interface f {
        void a(String str);
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        public final p.h f10575a;

        /* renamed from: b  reason: collision with root package name */
        public final p.n f10576b;

        /* renamed from: c  reason: collision with root package name */
        public final p.j<List<String>> f10577c;

        g(p.h hVar, p.n nVar, p.j<List<String>> jVar) {
            this.f10575a = hVar;
            this.f10576b = nVar;
            this.f10577c = jVar;
        }
    }

    interface h {
        boolean a();

        void b(String str, int i10);

        boolean c(String str);
    }

    public l(Activity activity, o oVar, c cVar) {
        this(activity, oVar, (p.h) null, (p.n) null, (p.j<List<String>>) null, cVar, new a(activity), new b(activity), new b(), Executors.newSingleThreadExecutor());
    }

    l(Activity activity, o oVar, p.h hVar, p.n nVar, p.j<List<String>> jVar, c cVar, h hVar2, d dVar, b bVar, ExecutorService executorService) {
        this.f10569x = new Object();
        this.f10559n = activity;
        this.f10560o = oVar;
        this.f10558m = activity.getPackageName() + ".flutter.image_provider";
        if (jVar != null) {
            this.f10568w = new g(hVar, nVar, jVar);
        }
        this.f10562q = hVar2;
        this.f10563r = dVar;
        this.f10564s = bVar;
        this.f10561p = cVar;
        this.f10565t = executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void H(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t((String) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                arrayList.add(new e(this.f10564s.e(this.f10559n, intent.getClipData().getItemAt(i11).getUri()), (String) null));
            }
        } else {
            arrayList.add(new e(this.f10564s.e(this.f10559n, intent.getData()), (String) null));
        }
        D(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void K(int i10, Intent intent) {
        ClipData clipData;
        if (i10 != -1 || intent == null) {
            t((String) null);
            return;
        }
        Uri data = intent.getData();
        if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() == 1) {
            data = clipData.getItemAt(0).getUri();
        }
        if (data == null) {
            r("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            E(this.f10564s.e(this.f10559n, data));
        }
    }

    private void D(ArrayList<e> arrayList) {
        p.h hVar;
        synchronized (this.f10569x) {
            g gVar = this.f10568w;
            hVar = gVar != null ? gVar.f10575a : null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        if (hVar != null) {
            while (i10 < arrayList.size()) {
                e eVar = arrayList.get(i10);
                String str = eVar.f10572a;
                String str2 = eVar.f10573b;
                if (str2 == null || !str2.startsWith("video/")) {
                    str = u(eVar.f10572a, hVar);
                }
                arrayList2.add(str);
                i10++;
            }
        } else {
            while (i10 < arrayList.size()) {
                arrayList2.add(arrayList.get(i10).f10572a);
                i10++;
            }
        }
        s(arrayList2);
    }

    /* access modifiers changed from: private */
    public void E(String str) {
        t(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(String str) {
        C(str, true);
    }

    private void M(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.c().a(this.f10559n, new g.a().b(d.c.f8282a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.f10559n.startActivityForResult(intent, 2346);
    }

    private void N(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.d().a(this.f10559n, new g.a().b(d.c.f8282a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.f10559n.startActivityForResult(intent, 2342);
    }

    private void O(p.e eVar) {
        Intent intent;
        if (eVar.c().booleanValue()) {
            intent = eVar.b().booleanValue() ? new e.c().a(this.f10559n, new g.a().b(d.b.f8281a).a()) : new e.d().a(this.f10559n, new g.a().b(d.b.f8281a).a());
        } else {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("*/*");
            intent2.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", eVar.b());
            intent = intent2;
        }
        this.f10559n.startActivityForResult(intent, 2347);
    }

    private void P(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.d().a(this.f10559n, new g.a().b(d.e.f8284a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.f10559n.startActivityForResult(intent, 2352);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q() {
        /*
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)
            io.flutter.plugins.imagepicker.l$c r1 = r4.f10566u
            io.flutter.plugins.imagepicker.l$c r2 = io.flutter.plugins.imagepicker.l.c.FRONT
            if (r1 != r2) goto L_0x0010
            r4.Z(r0)
        L_0x0010:
            java.io.File r1 = r4.o()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file:"
            r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4.f10567v = r2
            io.flutter.plugins.imagepicker.l$d r2 = r4.f10563r
            java.lang.String r3 = r4.f10558m
            android.net.Uri r2 = r2.a(r3, r1)
            java.lang.String r3 = "output"
            r0.putExtra(r3, r2)
            r4.v(r0, r2)
            android.app.Activity r2 = r4.f10559n     // Catch:{ ActivityNotFoundException -> 0x0047 }
            r3 = 2343(0x927, float:3.283E-42)
            r2.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x0047 }
            goto L_0x0056
        L_0x0047:
            r1.delete()     // Catch:{ SecurityException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            java.lang.String r0 = "no_available_camera"
            java.lang.String r1 = "No cameras available for taking pictures."
            r4.r(r0, r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.l.Q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void R() {
        /*
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
            r0.<init>(r1)
            java.lang.Object r1 = r4.f10569x
            monitor-enter(r1)
            io.flutter.plugins.imagepicker.l$g r2 = r4.f10568w     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0011
            io.flutter.plugins.imagepicker.p$n r2 = r2.f10576b     // Catch:{ all -> 0x0078 }
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0028
            java.lang.Long r1 = r2.b()
            if (r1 == 0) goto L_0x0028
            java.lang.Long r1 = r2.b()
            int r1 = r1.intValue()
            java.lang.String r2 = "android.intent.extra.durationLimit"
            r0.putExtra(r2, r1)
        L_0x0028:
            io.flutter.plugins.imagepicker.l$c r1 = r4.f10566u
            io.flutter.plugins.imagepicker.l$c r2 = io.flutter.plugins.imagepicker.l.c.FRONT
            if (r1 != r2) goto L_0x0031
            r4.Z(r0)
        L_0x0031:
            java.io.File r1 = r4.p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file:"
            r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4.f10567v = r2
            io.flutter.plugins.imagepicker.l$d r2 = r4.f10563r
            java.lang.String r3 = r4.f10558m
            android.net.Uri r2 = r2.a(r3, r1)
            java.lang.String r3 = "output"
            r0.putExtra(r3, r2)
            r4.v(r0, r2)
            android.app.Activity r2 = r4.f10559n     // Catch:{ ActivityNotFoundException -> 0x0068 }
            r3 = 2353(0x931, float:3.297E-42)
            r2.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x0068 }
            goto L_0x0077
        L_0x0068:
            r1.delete()     // Catch:{ SecurityException -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0070:
            java.lang.String r0 = "no_available_camera"
            java.lang.String r1 = "No cameras available for taking pictures."
            r4.r(r0, r1)
        L_0x0077:
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.l.R():void");
    }

    private boolean S() {
        h hVar = this.f10562q;
        if (hVar == null) {
            return false;
        }
        return hVar.a();
    }

    private boolean W(p.h hVar, p.n nVar, p.j<List<String>> jVar) {
        synchronized (this.f10569x) {
            if (this.f10568w != null) {
                return false;
            }
            this.f10568w = new g(hVar, nVar, jVar);
            this.f10561p.a();
            return true;
        }
    }

    private void Z(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i10 >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                return;
            }
            return;
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
    }

    private File n(String str) {
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.f10559n.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(uuid, str, cacheDir);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File o() {
        return n(".jpg");
    }

    private File p() {
        return n(".mp4");
    }

    private void q(p.j<List<String>> jVar) {
        jVar.b(new p.d("already_active", "Image picker is already active", (Object) null));
    }

    private void r(String str, String str2) {
        p.j<List<String>> jVar;
        synchronized (this.f10569x) {
            g gVar = this.f10568w;
            jVar = gVar != null ? gVar.f10577c : null;
            this.f10568w = null;
        }
        if (jVar == null) {
            this.f10561p.f((ArrayList<String>) null, str, str2);
        } else {
            jVar.b(new p.d(str, str2, (Object) null));
        }
    }

    private void s(ArrayList<String> arrayList) {
        p.j<List<String>> jVar;
        synchronized (this.f10569x) {
            g gVar = this.f10568w;
            jVar = gVar != null ? gVar.f10577c : null;
            this.f10568w = null;
        }
        if (jVar == null) {
            this.f10561p.f(arrayList, (String) null, (String) null);
        } else {
            jVar.a(arrayList);
        }
    }

    private void t(String str) {
        p.j<List<String>> jVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f10569x) {
            g gVar = this.f10568w;
            jVar = gVar != null ? gVar.f10577c : null;
            this.f10568w = null;
        }
        if (jVar != null) {
            jVar.a(arrayList);
        } else if (!arrayList.isEmpty()) {
            this.f10561p.f(arrayList, (String) null, (String) null);
        }
    }

    private String u(String str, p.h hVar) {
        return this.f10560o.j(str, hVar.c(), hVar.b(), hVar.d().intValue());
    }

    private void v(Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : this.f10559n.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.f10559n.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void I(int i10) {
        if (i10 == -1) {
            Uri uri = this.f10567v;
            d dVar = this.f10563r;
            if (uri == null) {
                uri = Uri.parse(this.f10561p.c());
            }
            dVar.b(uri, new d(this));
            return;
        }
        t((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void L(int i10) {
        if (i10 == -1) {
            Uri uri = this.f10567v;
            d dVar = this.f10563r;
            if (uri == null) {
                uri = Uri.parse(this.f10561p.c());
            }
            dVar.b(uri, new e(this));
            return;
        }
        t((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void G(int i10, Intent intent) {
        ClipData clipData;
        if (i10 != -1 || intent == null) {
            t((String) null);
            return;
        }
        Uri data = intent.getData();
        if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() == 1) {
            data = clipData.getItemAt(0).getUri();
        }
        if (data == null) {
            r("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            C(this.f10564s.e(this.f10559n, data), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void J(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            t((String) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                Uri uri = intent.getClipData().getItemAt(i11).getUri();
                arrayList.add(new e(this.f10564s.e(this.f10559n, uri), this.f10559n.getContentResolver().getType(uri)));
            }
        } else {
            arrayList.add(new e(this.f10564s.e(this.f10559n, intent.getData()), (String) null));
        }
        D(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void C(String str, boolean z9) {
        p.h hVar;
        synchronized (this.f10569x) {
            g gVar = this.f10568w;
            hVar = gVar != null ? gVar.f10575a : null;
        }
        if (hVar != null) {
            String u9 = u(str, hVar);
            if (u9 != null && !u9.equals(str) && z9) {
                new File(str).delete();
            }
            t(u9);
            return;
        }
        t(str);
    }

    /* access modifiers changed from: package-private */
    public p.b T() {
        Map<String, Object> b10 = this.f10561p.b();
        if (b10.isEmpty()) {
            return null;
        }
        p.b.a aVar = new p.b.a();
        p.c cVar = (p.c) b10.get("type");
        if (cVar != null) {
            aVar.d(cVar);
        }
        aVar.b((p.a) b10.get("error"));
        ArrayList arrayList = (ArrayList) b10.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Double d10 = (Double) b10.get("maxWidth");
                Double d11 = (Double) b10.get("maxHeight");
                Integer num = (Integer) b10.get("imageQuality");
                arrayList2.add(this.f10560o.j(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            aVar.c(arrayList2);
        }
        this.f10561p.a();
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r2 = io.flutter.plugins.imagepicker.c.b.IMAGE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r2 = io.flutter.plugins.imagepicker.c.b.VIDEO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r0.g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
        r3.f10561p.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        r0 = r3.f10567v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        r3.f10561p.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f10561p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10569x
            monitor-enter(r0)
            io.flutter.plugins.imagepicker.l$g r1 = r3.f10568w     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0009:
            io.flutter.plugins.imagepicker.p$h r1 = r1.f10575a     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            io.flutter.plugins.imagepicker.c r0 = r3.f10561p
            if (r1 == 0) goto L_0x0013
            io.flutter.plugins.imagepicker.c$b r2 = io.flutter.plugins.imagepicker.c.b.IMAGE
            goto L_0x0015
        L_0x0013:
            io.flutter.plugins.imagepicker.c$b r2 = io.flutter.plugins.imagepicker.c.b.VIDEO
        L_0x0015:
            r0.g(r2)
            if (r1 == 0) goto L_0x001f
            io.flutter.plugins.imagepicker.c r0 = r3.f10561p
            r0.d(r1)
        L_0x001f:
            android.net.Uri r0 = r3.f10567v
            if (r0 == 0) goto L_0x0028
            io.flutter.plugins.imagepicker.c r1 = r3.f10561p
            r1.e(r0)
        L_0x0028:
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.l.U():void");
    }

    /* access modifiers changed from: package-private */
    public void V(c cVar) {
        this.f10566u = cVar;
    }

    public void X(p.h hVar, p.j<List<String>> jVar) {
        if (!W(hVar, (p.n) null, jVar)) {
            q(jVar);
        } else if (!S() || this.f10562q.c("android.permission.CAMERA")) {
            Q();
        } else {
            this.f10562q.b("android.permission.CAMERA", 2345);
        }
    }

    public void Y(p.n nVar, p.j<List<String>> jVar) {
        if (!W((p.h) null, nVar, jVar)) {
            q(jVar);
        } else if (!S() || this.f10562q.c("android.permission.CAMERA")) {
            R();
        } else {
            this.f10562q.b("android.permission.CAMERA", 2355);
        }
    }

    public void i(p.h hVar, boolean z9, p.j<List<String>> jVar) {
        if (!W(hVar, (p.n) null, jVar)) {
            q(jVar);
        } else {
            N(Boolean.valueOf(z9));
        }
    }

    public void j(p.i iVar, p.e eVar, p.j<List<String>> jVar) {
        if (!W(iVar.b(), (p.n) null, jVar)) {
            q(jVar);
        } else {
            O(eVar);
        }
    }

    public void k(p.h hVar, boolean z9, p.j<List<String>> jVar) {
        if (!W(hVar, (p.n) null, jVar)) {
            q(jVar);
        } else {
            M(Boolean.valueOf(z9));
        }
    }

    public void l(p.n nVar, boolean z9, p.j<List<String>> jVar) {
        if (!W((p.h) null, nVar, jVar)) {
            q(jVar);
        } else {
            P(Boolean.valueOf(z9));
        }
    }

    public boolean m(int i10, int i11, Intent intent) {
        Runnable runnable;
        if (i10 == 2342) {
            runnable = new h(this, i11, intent);
        } else if (i10 == 2343) {
            runnable = new g(this, i11);
        } else if (i10 == 2346) {
            runnable = new i(this, i11, intent);
        } else if (i10 == 2347) {
            runnable = new j(this, i11, intent);
        } else if (i10 == 2352) {
            runnable = new k(this, i11, intent);
        } else if (i10 != 2353) {
            return false;
        } else {
            runnable = new f(this, i11);
        }
        this.f10565t.execute(runnable);
        return true;
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z9 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != 2345) {
            if (i10 != 2355) {
                return false;
            }
            if (z9) {
                R();
            }
        } else if (z9) {
            Q();
        }
        if (!z9 && (i10 == 2345 || i10 == 2355)) {
            r("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }
}
