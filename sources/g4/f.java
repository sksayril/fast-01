package g4;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z3.g;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final File f8940a;

    /* renamed from: b  reason: collision with root package name */
    private final File f8941b;

    /* renamed from: c  reason: collision with root package name */
    private final File f8942c;

    /* renamed from: d  reason: collision with root package name */
    private final File f8943d;

    /* renamed from: e  reason: collision with root package name */
    private final File f8944e;

    /* renamed from: f  reason: collision with root package name */
    private final File f8945f;

    public f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f8940a = filesDir;
        if (v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q9 = q(new File(filesDir, str));
        this.f8941b = q9;
        this.f8942c = q(new File(q9, "open-sessions"));
        this.f8943d = q(new File(q9, "reports"));
        this.f8944e = q(new File(q9, "priority-reports"));
        this.f8945f = q(new File(q9, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            g f10 = g.f();
            f10.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.f8942c, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File q(java.io.File r4) {
        /*
            java.lang.Class<g4.f> r0 = g4.f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            z3.g r1 = z3.g.f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            z3.g r1 = z3.g.f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.f.q(java.io.File):java.io.File");
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s9 : listFiles) {
                s(s9);
            }
        }
        return file.delete();
    }

    private static <T> List<T> t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private static boolean v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public void b() {
        a(new File(this.f8940a, ".com.google.firebase.crashlytics"));
        a(new File(this.f8940a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f8940a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f8942c, str));
    }

    public List<String> d() {
        return t(this.f8942c.list());
    }

    public File e(String str) {
        return new File(this.f8941b, str);
    }

    public List<File> f(FilenameFilter filenameFilter) {
        return t(this.f8941b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f8945f, str);
    }

    public List<File> h() {
        return t(this.f8945f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f8944e, str);
    }

    public List<File> k() {
        return t(this.f8944e.listFiles());
    }

    public File l(String str) {
        return new File(this.f8943d, str);
    }

    public List<File> m() {
        return t(this.f8943d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List<File> p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
