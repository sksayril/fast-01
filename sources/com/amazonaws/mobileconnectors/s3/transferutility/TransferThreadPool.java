package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class TransferThreadPool {

    /* renamed from: a  reason: collision with root package name */
    private static final Log f4195a = LogFactory.b(TransferService.class);

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f4196b;

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f4197c;

    private static ExecutorService a(int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static synchronized void b(int i10) {
        synchronized (TransferThreadPool.class) {
            Log log = f4195a;
            log.a("Initializing the thread pool of size: " + i10);
            int max = Math.max((int) Math.ceil(((double) i10) / 2.0d), 1);
            if (f4196b == null) {
                f4196b = a(max);
            }
            if (f4197c == null) {
                f4197c = a(1);
            }
        }
    }

    public static <T> Future<T> c(Callable<T> callable) {
        b(TransferUtilityOptions.b());
        return (callable instanceof UploadPartTask ? f4197c : f4196b).submit(callable);
    }
}
