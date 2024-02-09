package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.DeleteObjectsResult$DeletedObject;
import com.amazonaws.services.s3.model.MultiObjectDeleteException$DeleteError;
import java.util.ArrayList;
import java.util.List;

public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* renamed from: m  reason: collision with root package name */
    private List<DeleteObjectsResult$DeletedObject> f4279m;

    /* renamed from: n  reason: collision with root package name */
    private List<MultiObjectDeleteException$DeleteError> f4280n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4281o;

    public DeleteObjectsResponse() {
        this(new ArrayList(), new ArrayList());
    }

    public DeleteObjectsResponse(List<DeleteObjectsResult$DeletedObject> list, List<MultiObjectDeleteException$DeleteError> list2) {
        this.f4279m = list;
        this.f4280n = list2;
    }

    public List<DeleteObjectsResult$DeletedObject> a() {
        return this.f4279m;
    }

    public void b(boolean z9) {
        this.f4281o = z9;
    }

    public List<MultiObjectDeleteException$DeleteError> c() {
        return this.f4280n;
    }
}
