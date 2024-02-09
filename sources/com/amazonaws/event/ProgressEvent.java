package com.amazonaws.event;

public class ProgressEvent {

    /* renamed from: a  reason: collision with root package name */
    protected long f4028a;

    /* renamed from: b  reason: collision with root package name */
    protected int f4029b;

    public ProgressEvent(long j10) {
        this.f4028a = j10;
    }

    public long a() {
        return this.f4028a;
    }

    public int b() {
        return this.f4029b;
    }

    public void c(int i10) {
        this.f4029b = i10;
    }
}
