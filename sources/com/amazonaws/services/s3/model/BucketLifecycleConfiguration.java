package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BucketLifecycleConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<Rule> f4350m;

    public static class NoncurrentVersionTransition implements Serializable {

        /* renamed from: m  reason: collision with root package name */
        private int f4351m = -1;

        /* renamed from: n  reason: collision with root package name */
        private String f4352n;

        public void a(int i10) {
            this.f4351m = i10;
        }

        public void b(String str) {
            this.f4352n = str;
        }
    }

    public static class Rule implements Serializable {

        /* renamed from: m  reason: collision with root package name */
        private String f4353m;

        /* renamed from: n  reason: collision with root package name */
        private String f4354n;

        /* renamed from: o  reason: collision with root package name */
        private String f4355o;

        /* renamed from: p  reason: collision with root package name */
        private LifecycleFilter f4356p;

        /* renamed from: q  reason: collision with root package name */
        private int f4357q = -1;

        /* renamed from: r  reason: collision with root package name */
        private boolean f4358r = false;

        /* renamed from: s  reason: collision with root package name */
        private int f4359s = -1;

        /* renamed from: t  reason: collision with root package name */
        private Date f4360t;

        /* renamed from: u  reason: collision with root package name */
        private List<Transition> f4361u;

        /* renamed from: v  reason: collision with root package name */
        private List<NoncurrentVersionTransition> f4362v;

        /* renamed from: w  reason: collision with root package name */
        private AbortIncompleteMultipartUpload f4363w;

        public Rule a(NoncurrentVersionTransition noncurrentVersionTransition) {
            if (noncurrentVersionTransition != null) {
                if (this.f4362v == null) {
                    this.f4362v = new ArrayList();
                }
                this.f4362v.add(noncurrentVersionTransition);
                return this;
            }
            throw new IllegalArgumentException("NoncurrentVersionTransition cannot be null.");
        }

        public Rule b(Transition transition) {
            if (transition != null) {
                if (this.f4361u == null) {
                    this.f4361u = new ArrayList();
                }
                this.f4361u.add(transition);
                return this;
            }
            throw new IllegalArgumentException("Transition cannot be null.");
        }

        public void c(AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.f4363w = abortIncompleteMultipartUpload;
        }

        public void d(Date date) {
            this.f4360t = date;
        }

        public void e(int i10) {
            this.f4357q = i10;
        }

        public void f(boolean z9) {
            this.f4358r = z9;
        }

        public void g(LifecycleFilter lifecycleFilter) {
            this.f4356p = lifecycleFilter;
        }

        public void h(String str) {
            this.f4353m = str;
        }

        public void i(int i10) {
            this.f4359s = i10;
        }

        @Deprecated
        public void j(String str) {
            this.f4354n = str;
        }

        public void k(String str) {
            this.f4355o = str;
        }
    }

    public static class Transition implements Serializable {

        /* renamed from: m  reason: collision with root package name */
        private int f4364m = -1;

        /* renamed from: n  reason: collision with root package name */
        private Date f4365n;

        /* renamed from: o  reason: collision with root package name */
        private String f4366o;

        public void a(Date date) {
            this.f4365n = date;
        }

        public void b(int i10) {
            this.f4364m = i10;
        }

        public void c(String str) {
            this.f4366o = str;
        }
    }

    public BucketLifecycleConfiguration(List<Rule> list) {
        this.f4350m = list;
    }

    public List<Rule> a() {
        return this.f4350m;
    }
}
