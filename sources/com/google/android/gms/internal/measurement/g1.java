package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p3.h;

@TargetApi(24)
public final class g1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Method f5265b = e();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f5266c = d();

    /* renamed from: a  reason: collision with root package name */
    private final JobScheduler f5267a;

    private g1(JobScheduler jobScheduler) {
        this.f5267a = jobScheduler;
    }

    private static int a() {
        Method method = f5266c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = f5265b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f5267a, new Object[]{jobInfo, str, Integer.valueOf(i10), str2});
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.e(str2, "error calling scheduleAsPackage", e10);
            }
        }
        return this.f5267a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) h.i((JobScheduler) context.getSystemService("jobscheduler"));
        return (f5265b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new g1(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No myUserId method available");
            return null;
        }
    }

    private static Method e() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
