package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;
import java.util.List;

public class InventoryConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4583m;

    /* renamed from: n  reason: collision with root package name */
    private InventoryDestination f4584n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f4585o;

    /* renamed from: p  reason: collision with root package name */
    private InventoryFilter f4586p;

    /* renamed from: q  reason: collision with root package name */
    private String f4587q;

    /* renamed from: r  reason: collision with root package name */
    private List<String> f4588r;

    /* renamed from: s  reason: collision with root package name */
    private InventorySchedule f4589s;

    public void a(InventoryDestination inventoryDestination) {
        this.f4584n = inventoryDestination;
    }

    public void b(Boolean bool) {
        this.f4585o = bool;
    }

    public void c(String str) {
        this.f4583m = str;
    }

    public void d(String str) {
        this.f4587q = str;
    }

    public void e(InventoryFilter inventoryFilter) {
        this.f4586p = inventoryFilter;
    }

    public void f(List<String> list) {
        this.f4588r = list;
    }

    public void g(InventorySchedule inventorySchedule) {
        this.f4589s = inventorySchedule;
    }
}
