package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

@Deprecated
public interface RequestHandler {
    void a(Request<?> request);

    void b(Request<?> request, Exception exc);

    void c(Request<?> request, Object obj, TimingInfo timingInfo);
}
