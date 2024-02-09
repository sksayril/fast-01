package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BucketReplicationConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4369m;

    /* renamed from: n  reason: collision with root package name */
    private Map<String, ReplicationRule> f4370n = new HashMap();

    public BucketReplicationConfiguration a(String str, ReplicationRule replicationRule) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Rule id cannot be null or empty.");
        } else if (replicationRule != null) {
            this.f4370n.put(str, replicationRule);
            return this;
        } else {
            throw new IllegalArgumentException("Replication rule cannot be null");
        }
    }

    public void b(String str) {
        this.f4369m = str;
    }
}
