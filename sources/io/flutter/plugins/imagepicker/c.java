package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugins.imagepicker.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10538a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10539a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.plugins.imagepicker.c$b[] r0 = io.flutter.plugins.imagepicker.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10539a = r0
                io.flutter.plugins.imagepicker.c$b r1 = io.flutter.plugins.imagepicker.c.b.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10539a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.imagepicker.c$b r1 = io.flutter.plugins.imagepicker.c.b.VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.c.a.<clinit>():void");
        }
    }

    public enum b {
        IMAGE,
        VIDEO
    }

    c(Context context) {
        this.f10538a = context;
    }

    private void h(String str) {
        this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> b() {
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        boolean z9 = false;
        SharedPreferences sharedPreferences = this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z10 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", (Set) null)) != null) {
            hashMap.put("pathList", new ArrayList(stringSet));
            z9 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            p.a.C0158a aVar = new p.a.C0158a();
            aVar.b(sharedPreferences.getString("flutter_image_picker_error_code", ""));
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                aVar.c(sharedPreferences.getString("flutter_image_picker_error_message", ""));
            }
            hashMap.put("error", aVar.a());
        } else {
            z10 = z9;
        }
        if (z10) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? p.c.VIDEO : p.c.IMAGE);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", "");
    }

    /* access modifiers changed from: package-private */
    public void d(p.h hVar) {
        SharedPreferences.Editor edit = this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (hVar.c() != null) {
            edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(hVar.c().doubleValue()));
        }
        if (hVar.b() != null) {
            edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(hVar.b().doubleValue()));
        }
        edit.putInt("flutter_image_picker_image_quality", hVar.d().intValue());
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public void e(Uri uri) {
        this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    /* access modifiers changed from: package-private */
    public void f(ArrayList<String> arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.f10538a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public void g(b bVar) {
        String str;
        int i10 = a.f10539a[bVar.ordinal()];
        if (i10 == 1) {
            str = "image";
        } else if (i10 == 2) {
            str = "video";
        } else {
            return;
        }
        h(str);
    }
}
