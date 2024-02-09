package w1;

import a2.a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p1.p;

public class d implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12763a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.d f12764b;

    /* renamed from: c  reason: collision with root package name */
    private final f f12765c;

    public d(Context context, x1.d dVar, f fVar) {
        this.f12763a = context;
        this.f12764b = dVar;
        this.f12765c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    public void a(p pVar, int i10) {
        b(pVar, i10, false);
    }

    public void b(p pVar, int i10, boolean z9) {
        ComponentName componentName = new ComponentName(this.f12763a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f12763a.getSystemService("jobscheduler");
        int c10 = c(pVar);
        if (z9 || !d(jobScheduler, c10, i10)) {
            long j10 = this.f12764b.j(pVar);
            JobInfo.Builder c11 = this.f12765c.c(new JobInfo.Builder(c10, componentName), pVar.d(), j10, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", pVar.b());
            persistableBundle.putInt("priority", a.a(pVar.d()));
            if (pVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            t1.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c10), Long.valueOf(this.f12765c.g(pVar.d(), j10, i10)), Long.valueOf(j10), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        t1.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    public int c(p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f12763a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
