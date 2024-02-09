package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f1461k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1462a;

    /* renamed from: b  reason: collision with root package name */
    Object f1463b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1464c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1465d;

    /* renamed from: e  reason: collision with root package name */
    public int f1466e;

    /* renamed from: f  reason: collision with root package name */
    public int f1467f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1468g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f1469h;

    /* renamed from: i  reason: collision with root package name */
    public String f1470i;

    /* renamed from: j  reason: collision with root package name */
    public String f1471j;

    static class a {
        static IconCompat a(Object obj) {
            h.j(obj);
            int d10 = d(obj);
            if (d10 == 2) {
                return IconCompat.l((Resources) null, c(obj), b(obj));
            }
            if (d10 == 4) {
                return IconCompat.h(e(obj));
            }
            if (d10 == 6) {
                return IconCompat.e(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1463b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e12) {
                e = e12;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r0 >= 26) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.d(r5, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
            r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
            r0 = r4.f1468g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
            if (r0 == null) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
            r5.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            r4 = r4.f1469h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
            if (r4 == androidx.core.graphics.drawable.IconCompat.f1461k) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
            r5.setTintMode(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
            return r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f1462a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto L_0x00b5;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x009c;
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x007b;
                    case 5: goto L_0x0065;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r5 = r4.r()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto L_0x00a4
            L_0x0020:
                if (r5 == 0) goto L_0x004a
                java.io.InputStream r5 = r4.s(r5)
                if (r5 == 0) goto L_0x002f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L_0x0076
                goto L_0x006d
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x004a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0065:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L_0x0072
                java.lang.Object r5 = r4.f1463b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x006d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto L_0x00a4
            L_0x0072:
                java.lang.Object r5 = r4.f1463b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x0076:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.d(r5, r1)
                goto L_0x00a0
            L_0x007b:
                java.lang.Object r5 = r4.f1463b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x00a4
            L_0x0084:
                java.lang.Object r5 = r4.f1463b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f1466e
                int r1 = r4.f1467f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x00a4
            L_0x0091:
                java.lang.String r5 = r4.o()
                int r0 = r4.f1466e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x00a4
            L_0x009c:
                java.lang.Object r5 = r4.f1463b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x00a0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L_0x00a4:
                android.content.res.ColorStateList r0 = r4.f1468g
                if (r0 == 0) goto L_0x00ab
                r5.setTintList(r0)
            L_0x00ab:
                android.graphics.PorterDuff$Mode r4 = r4.f1469h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1461k
                if (r4 == r0) goto L_0x00b4
                r5.setTintMode(r4)
            L_0x00b4:
                return r5
            L_0x00b5:
                java.lang.Object r4 = r4.f1463b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1462a = -1;
        this.f1464c = null;
        this.f1465d = null;
        this.f1466e = 0;
        this.f1467f = 0;
        this.f1468g = null;
        this.f1469h = f1461k;
        this.f1470i = null;
    }

    IconCompat(int i10) {
        this.f1464c = null;
        this.f1465d = null;
        this.f1466e = 0;
        this.f1467f = 0;
        this.f1468g = null;
        this.f1469h = f1461k;
        this.f1470i = null;
        this.f1462a = i10;
    }

    private static String A(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat b(Bundle bundle) {
        Object obj;
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f1466e = bundle.getInt("int1");
        iconCompat.f1467f = bundle.getInt("int2");
        iconCompat.f1471j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1468g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1469h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f1463b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
        }
        iconCompat.f1463b = obj;
        return iconCompat;
    }

    public static IconCompat c(Icon icon) {
        return a.a(icon);
    }

    static Bitmap d(Bitmap bitmap, boolean z9) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z9) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat e(Uri uri) {
        androidx.core.util.c.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1463b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1463b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        androidx.core.util.c.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1463b = str;
        return iconCompat;
    }

    public static IconCompat j(byte[] bArr, int i10, int i11) {
        androidx.core.util.c.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f1463b = bArr;
        iconCompat.f1466e = i10;
        iconCompat.f1467f = i11;
        return iconCompat;
    }

    public static IconCompat k(Context context, int i10) {
        androidx.core.util.c.c(context);
        return l(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat l(Resources resources, String str, int i10) {
        androidx.core.util.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1466e = i10;
            if (resources != null) {
                try {
                    iconCompat.f1463b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1463b = str;
            }
            iconCompat.f1471j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e10);
            return null;
        }
    }

    private Drawable u(Context context) {
        switch (this.f1462a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f1463b);
            case 2:
                String o10 = o();
                if (TextUtils.isEmpty(o10)) {
                    o10 = context.getPackageName();
                }
                try {
                    return androidx.core.content.res.h.d(p(context, o10), this.f1466e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f1466e), this.f1463b}), e10);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f1463b, this.f1466e, this.f1467f));
            case 4:
                InputStream s9 = s(context);
                if (s9 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s9));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), d((Bitmap) this.f1463b, false));
            case 6:
                InputStream s10 = s(context);
                if (s10 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s10))) : new BitmapDrawable(context.getResources(), d(BitmapFactory.decodeStream(s10), false));
                }
                break;
        }
        return null;
    }

    public void a(Context context) {
        Object obj;
        if (this.f1462a == 2 && (obj = this.f1463b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String o10 = o();
                int identifier = p(context, o10).getIdentifier(str4, str3, str5);
                if (this.f1466e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + o10 + " " + str);
                    this.f1466e = identifier;
                }
            }
        }
    }

    public Bitmap m() {
        int i10 = this.f1462a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1463b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f1463b;
        } else {
            if (i10 == 5) {
                return d((Bitmap) this.f1463b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int n() {
        int i10 = this.f1462a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f1463b);
        }
        if (i10 == 2) {
            return this.f1466e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String o() {
        int i10 = this.f1462a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f1463b);
        }
        if (i10 == 2) {
            String str = this.f1471j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1463b).split(":", -1)[0] : this.f1471j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int q() {
        int i10 = this.f1462a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : a.d(this.f1463b);
    }

    public Uri r() {
        int i10 = this.f1462a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.f1463b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1463b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream s(Context context) {
        String str;
        StringBuilder sb;
        Uri r9 = r();
        String scheme = r9.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(r9);
            } catch (Exception e10) {
                e = e10;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(r9);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1463b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(r9);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    public Drawable t(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(z(context), context);
        }
        Drawable u9 = u(context);
        if (!(u9 == null || (this.f1468g == null && this.f1469h == f1461k))) {
            u9.mutate();
            a.o(u9, this.f1468g);
            a.p(u9, this.f1469h);
        }
        return u9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1462a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f1463b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1462a
            java.lang.String r1 = A(r1)
            r0.append(r1)
            int r1 = r4.f1462a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1463b
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1466e
            r0.append(r1)
            int r1 = r4.f1467f
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1467f
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f1471j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.n()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1463b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1463b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f1468g
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1468g
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f1469h
            android.graphics.PorterDuff$Mode r2 = f1461k
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1469h
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public void v() {
        Parcelable parcelable;
        this.f1469h = PorterDuff.Mode.valueOf(this.f1470i);
        switch (this.f1462a) {
            case -1:
                parcelable = this.f1465d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f1465d;
                if (parcelable == null) {
                    byte[] bArr = this.f1464c;
                    this.f1463b = bArr;
                    this.f1462a = 3;
                    this.f1466e = 0;
                    this.f1467f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1464c, Charset.forName("UTF-16"));
                this.f1463b = str;
                if (this.f1462a == 2 && this.f1471j == null) {
                    this.f1471j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1463b = this.f1464c;
                return;
            default:
                return;
        }
        this.f1463b = parcelable;
    }

    public void w(boolean z9) {
        this.f1470i = this.f1469h.name();
        switch (this.f1462a) {
            case -1:
                if (z9) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z9) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1463b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1464c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1464c = ((String) this.f1463b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1464c = (byte[]) this.f1463b;
                return;
            case 4:
            case 6:
                this.f1464c = this.f1463b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f1465d = (Parcelable) this.f1463b;
    }

    public Bundle x() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f1462a) {
            case -1:
                parcelable = (Parcelable) this.f1463b;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.f1463b;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f1463b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f1463b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable("obj", parcelable);
        bundle.putInt("type", this.f1462a);
        bundle.putInt("int1", this.f1466e);
        bundle.putInt("int2", this.f1467f);
        bundle.putString("string1", this.f1471j);
        ColorStateList colorStateList = this.f1468g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1469h;
        if (mode != f1461k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon y() {
        return z((Context) null);
    }

    public Icon z(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
}
