package com.google.gson;

import h5.l;
import java.io.IOException;
import java.io.StringWriter;
import n5.c;

public abstract class k {
    public boolean c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public h d() {
        if (k()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n f() {
        if (o()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p g() {
        if (y()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean k() {
        return this instanceof h;
    }

    public boolean l() {
        return this instanceof m;
    }

    public boolean o() {
        return this instanceof n;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.C(true);
            l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean y() {
        return this instanceof p;
    }
}
