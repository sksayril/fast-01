package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final d<c> f2857a = d.D();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2858b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f2859c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f2860a;

        /* renamed from: b  reason: collision with root package name */
        final int f2861b;

        /* renamed from: c  reason: collision with root package name */
        final long f2862c;

        /* renamed from: d  reason: collision with root package name */
        final long f2863d;

        b(int i10, int i11, long j10, long j11) {
            this.f2860a = i10;
            this.f2861b = i11;
            this.f2862c = j10;
            this.f2863d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2860a);
                dataOutputStream.writeInt(this.f2861b);
                dataOutputStream.writeLong(this.f2862c);
                dataOutputStream.writeLong(this.f2863d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2861b == bVar.f2861b && this.f2862c == bVar.f2862c && this.f2860a == bVar.f2860a && this.f2863d == bVar.f2863d;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f2861b), Long.valueOf(this.f2862c), Integer.valueOf(this.f2860a), Long.valueOf(this.f2863d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f2864a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2865b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f2866c;

        c(int i10, boolean z9, boolean z10) {
            this.f2864a = i10;
            this.f2866c = z10;
            this.f2865b = z9;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i10, boolean z9, boolean z10) {
        c cVar = new c(i10, z9, z10);
        f2859c = cVar;
        f2857a.z(cVar);
        return f2859c;
    }

    static c c(Context context, boolean z9) {
        b bVar;
        c cVar;
        if (!z9 && (cVar = f2859c) != null) {
            return cVar;
        }
        synchronized (f2858b) {
            if (!z9) {
                c cVar2 = f2859c;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 28) {
                if (i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        b bVar2 = null;
                        if (file3.exists()) {
                            try {
                                bVar2 = b.a(file3);
                            } catch (IOException unused) {
                                return b(131072, z10, z11);
                            }
                        }
                        if (bVar2 != null && bVar2.f2862c == a10) {
                            int i12 = bVar2.f2861b;
                            if (i12 != 2) {
                                i11 = i12;
                                if (z9 && z11 && i11 != 1) {
                                    i11 = 2;
                                }
                                if (bVar2 != null && bVar2.f2861b == 2 && i11 == 1 && length < bVar2.f2863d) {
                                    i11 = 3;
                                }
                                bVar = new b(1, i11, a10, length2);
                                if (bVar2 == null || !bVar2.equals(bVar)) {
                                    bVar.b(file3);
                                }
                                c b10 = b(i11, z10, z11);
                                return b10;
                            }
                        }
                        if (z10) {
                            i11 = 1;
                        } else if (z11) {
                            i11 = 2;
                        }
                        i11 = 2;
                        i11 = 3;
                        bVar = new b(1, i11, a10, length2);
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = 196608;
                        }
                        c b102 = b(i11, z10, z11);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return b(65536, z10, z11);
                    }
                }
            }
            c b11 = b(262144, false, false);
            return b11;
        }
    }
}
