package com.amazonaws.services.s3.model;

public class ReplicationRule {

    /* renamed from: a  reason: collision with root package name */
    private String f4518a;

    /* renamed from: b  reason: collision with root package name */
    private String f4519b;

    /* renamed from: c  reason: collision with root package name */
    private ReplicationDestinationConfig f4520c;

    public void a(ReplicationDestinationConfig replicationDestinationConfig) {
        if (replicationDestinationConfig != null) {
            this.f4520c = replicationDestinationConfig;
            return;
        }
        throw new IllegalArgumentException("Destination cannot be null in the replication rule");
    }

    public void b(String str) {
        if (str != null) {
            this.f4518a = str;
            return;
        }
        throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
    }

    public void c(String str) {
        this.f4519b = str;
    }
}
