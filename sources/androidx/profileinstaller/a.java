package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    private static class C0056a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z9 = true;
            for (int i10 = 0; i10 < length; i10++) {
                z9 = a(listFiles[i10]) && z9;
            }
            return z9;
        }
        file.delete();
        return true;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        aVar.b(a(i10 >= 24 ? b.a(context) : i10 >= 23 ? C0056a.a(context) : context.getCacheDir()) ? 14 : 15, (Object) null);
    }
}
