package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import java.io.Serializable;
import java.util.List;

public class ListBucketInventoryConfigurationsResult implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<InventoryConfiguration> f4443m;

    /* renamed from: n  reason: collision with root package name */
    private String f4444n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4445o;

    /* renamed from: p  reason: collision with root package name */
    private String f4446p;

    public List<InventoryConfiguration> a() {
        return this.f4443m;
    }

    public void b(String str) {
        this.f4444n = str;
    }

    public void c(List<InventoryConfiguration> list) {
        this.f4443m = list;
    }

    public void d(String str) {
        this.f4446p = str;
    }

    public void e(boolean z9) {
        this.f4445o = z9;
    }
}
