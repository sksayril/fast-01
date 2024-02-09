package w1;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f12766m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ JobParameters f12767n;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f12766m = jobInfoSchedulerService;
        this.f12767n = jobParameters;
    }

    public final void run() {
        this.f12766m.b(this.f12767n);
    }
}
