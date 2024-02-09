package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BucketTaggingConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<TagSet> f4371m;

    public BucketTaggingConfiguration() {
        this.f4371m = null;
        this.f4371m = new ArrayList(1);
    }

    public List<TagSet> a() {
        return this.f4371m;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("TagSets: " + a());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
