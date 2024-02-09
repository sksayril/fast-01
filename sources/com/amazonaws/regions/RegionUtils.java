package com.amazonaws.regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class RegionUtils {

    /* renamed from: a  reason: collision with root package name */
    private static List<Region> f4243a;

    /* renamed from: b  reason: collision with root package name */
    private static final Log f4244b = LogFactory.c("com.amazonaws.request");

    public static Region a(String str) {
        for (Region next : b()) {
            if (next.d().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static synchronized List<Region> b() {
        List<Region> list;
        synchronized (RegionUtils.class) {
            if (f4243a == null) {
                c();
            }
            list = f4243a;
        }
        return list;
    }

    public static synchronized void c() {
        synchronized (RegionUtils.class) {
            if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
                try {
                    f();
                } catch (FileNotFoundException e10) {
                    throw new RuntimeException("Couldn't find regions override file specified", e10);
                }
            }
            if (f4243a == null) {
                e();
            }
            if (f4243a == null) {
                throw new RuntimeException("Failed to initialize the regions.");
            }
        }
    }

    private static void d(InputStream inputStream) {
        try {
            f4243a = new RegionMetadataParser().e(inputStream);
        } catch (Exception e10) {
            f4244b.i("Failed to parse regional endpoints", e10);
        }
    }

    private static void e() {
        Log log = f4244b;
        if (log.c()) {
            log.a("Initializing the regions with default regions");
        }
        f4243a = RegionDefaults.a();
    }

    private static void f() {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f4244b;
        if (log.c()) {
            log.a("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        d(new FileInputStream(new File(property)));
    }
}
