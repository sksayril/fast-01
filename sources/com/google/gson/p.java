package com.google.gson;

import h5.a;
import h5.g;
import java.math.BigInteger;

public final class p extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7531a;

    public p(Boolean bool) {
        this.f7531a = a.b(bool);
    }

    public p(Number number) {
        this.f7531a = a.b(number);
    }

    public p(String str) {
        this.f7531a = a.b(str);
    }

    private static boolean E(p pVar) {
        Object obj = pVar.f7531a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public int A() {
        return F() ? C().intValue() : Integer.parseInt(i());
    }

    public long B() {
        return F() ? C().longValue() : Long.parseLong(i());
    }

    public Number C() {
        Object obj = this.f7531a;
        return obj instanceof String ? new g((String) obj) : (Number) obj;
    }

    public boolean D() {
        return this.f7531a instanceof Boolean;
    }

    public boolean F() {
        return this.f7531a instanceof Number;
    }

    public boolean G() {
        return this.f7531a instanceof String;
    }

    public boolean c() {
        return D() ? ((Boolean) this.f7531a).booleanValue() : Boolean.parseBoolean(i());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7531a == null) {
            return pVar.f7531a == null;
        }
        if (E(this) && E(pVar)) {
            return C().longValue() == pVar.C().longValue();
        }
        Object obj2 = this.f7531a;
        if (!(obj2 instanceof Number) || !(pVar.f7531a instanceof Number)) {
            return obj2.equals(pVar.f7531a);
        }
        double doubleValue = C().doubleValue();
        double doubleValue2 = pVar.C().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f7531a == null) {
            return 31;
        }
        if (E(this)) {
            doubleToLongBits = C().longValue();
        } else {
            Object obj = this.f7531a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(C().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public String i() {
        return F() ? C().toString() : D() ? ((Boolean) this.f7531a).toString() : (String) this.f7531a;
    }

    public double z() {
        return F() ? C().doubleValue() : Double.parseDouble(i());
    }
}
