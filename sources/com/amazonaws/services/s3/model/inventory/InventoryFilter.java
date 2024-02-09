package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

public class InventoryFilter implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private InventoryFilterPredicate f4591m;

    public void a(InventoryFilterPredicate inventoryFilterPredicate) {
        this.f4591m = inventoryFilterPredicate;
    }
}
