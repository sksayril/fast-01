package g4;

import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.u;
import d4.f0;
import e4.j;
import i4.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import z3.g;

public class e {

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f8931e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    private static final int f8932f = 15;

    /* renamed from: g  reason: collision with root package name */
    private static final j f8933g = new j();

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<? super File> f8934h = c.f8929m;

    /* renamed from: i  reason: collision with root package name */
    private static final FilenameFilter f8935i = b.f8928a;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f8936a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final f f8937b;

    /* renamed from: c  reason: collision with root package name */
    private final i f8938c;

    /* renamed from: d  reason: collision with root package name */
    private final m f8939d;

    public e(f fVar, i iVar, m mVar) {
        this.f8937b = fVar;
        this.f8938c = iVar;
        this.f8939d = mVar;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f8931e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    private void B(File file, f0.d dVar, String str, f0.a aVar) {
        String d10 = this.f8939d.d(str);
        try {
            j jVar = f8933g;
            F(this.f8937b.g(str), jVar.M(jVar.L(A(file)).s(dVar).p(aVar).o(d10)));
        } catch (IOException e10) {
            g f10 = g.f();
            f10.l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z9;
        List<File> p10 = this.f8937b.p(str, f8935i);
        if (p10.isEmpty()) {
            g f10 = g.f();
            f10.i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p10);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = p10.iterator();
        loop0:
        while (true) {
            z9 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f8933g.j(A(next)));
                    if (z9 || s(next.getName())) {
                        z9 = true;
                    }
                } catch (IOException e10) {
                    g f11 = g.f();
                    f11.l("Could not add event to report for " + next, e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            g f12 = g.f();
            f12.k("Could not parse event files for session " + str);
            return;
        }
        String k10 = c4.m.k(str, this.f8937b);
        String d10 = this.f8939d.d(str);
        D(this.f8937b.o(str, "report"), arrayList, j10, z9, k10, d10);
    }

    private void D(File file, List<f0.e.d> list, long j10, boolean z9, String str, String str2) {
        try {
            j jVar = f8933g;
            f0 q9 = jVar.L(A(file)).t(j10, z9, str).o(str2).q(list);
            f0.e m10 = q9.m();
            if (m10 != null) {
                g f10 = g.f();
                f10.b("appQualitySessionId: " + str2);
                F(z9 ? this.f8937b.j(m10.i()) : this.f8937b.l(m10.i()), jVar.M(q9));
            }
        } catch (IOException e10) {
            g f11 = g.f();
            f11.l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> p10 = this.f8937b.p(str, a.f8927a);
        Collections.sort(p10, d.f8930m);
        return f(p10, i10);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f8931e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static void G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f8931e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private SortedSet<String> e(String str) {
        this.f8937b.b();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            g f10 = g.f();
            f10.b("Removing session over cap: " + last);
            this.f8937b.c(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File next : list) {
            if (size <= i10) {
                return size;
            }
            f.s(next);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f8938c.b().f9459a.f9471b;
        List<File> n10 = n();
        int size = n10.size();
        if (size > i10) {
            for (File delete : n10.subList(i10, size)) {
                delete.delete();
            }
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    private static String m(int i10, boolean z9) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i10)});
        String str = z9 ? "_" : "";
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f8937b.k());
        arrayList.addAll(this.f8937b.h());
        Comparator<? super File> comparator = f8934h;
        Collections.sort(arrayList, comparator);
        List<File> m10 = this.f8937b.m();
        Collections.sort(m10, comparator);
        arrayList.addAll(m10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f8932f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f8937b.m());
        j(this.f8937b.k());
        j(this.f8937b.h());
    }

    public void k(String str, long j10) {
        for (String next : e(str)) {
            g f10 = g.f();
            f10.i("Finalizing report for session " + next);
            C(next, j10);
            this.f8937b.c(next);
        }
        g();
    }

    public void l(String str, f0.d dVar, f0.a aVar) {
        File o10 = this.f8937b.o(str, "report");
        g f10 = g.f();
        f10.b("Writing native session report for " + str + " to file: " + o10);
        B(o10, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f8937b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f8937b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return !this.f8937b.m().isEmpty() || !this.f8937b.k().isEmpty() || !this.f8937b.h().isEmpty();
    }

    public List<u> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File next : n10) {
            try {
                arrayList.add(u.a(f8933g.L(A(next)), next.getName(), next));
            } catch (IOException e10) {
                g f10 = g.f();
                f10.l("Could not load report file " + next + "; deleting", e10);
                next.delete();
            }
        }
        return arrayList;
    }

    public void y(f0.e.d dVar, String str, boolean z9) {
        int i10 = this.f8938c.b().f9459a.f9470a;
        try {
            F(this.f8937b.o(str, m(this.f8936a.getAndIncrement(), z9)), f8933g.k(dVar));
        } catch (IOException e10) {
            g f10 = g.f();
            f10.l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(f0 f0Var) {
        f0.e m10 = f0Var.m();
        if (m10 == null) {
            g.f().b("Could not get session for report");
            return;
        }
        String i10 = m10.i();
        try {
            F(this.f8937b.o(i10, "report"), f8933g.M(f0Var));
            G(this.f8937b.o(i10, "start-time"), "", m10.l());
        } catch (IOException e10) {
            g f10 = g.f();
            f10.c("Could not persist report for session " + i10, e10);
        }
    }
}
