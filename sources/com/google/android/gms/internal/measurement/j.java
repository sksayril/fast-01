package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class j implements r {

    /* renamed from: m  reason: collision with root package name */
    private final Double f5365m;

    public j(Double d10) {
        if (d10 == null) {
            this.f5365m = Double.valueOf(Double.NaN);
        } else {
            this.f5365m = d10;
        }
    }

    public final r b() {
        return new j(this.f5365m);
    }

    public final Boolean c() {
        return Boolean.valueOf(!Double.isNaN(this.f5365m.doubleValue()) && this.f5365m.doubleValue() != 0.0d);
    }

    public final Double d() {
        return this.f5365m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f5365m.equals(((j) obj).f5365m);
    }

    public final String f() {
        if (Double.isNaN(this.f5365m.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f5365m.doubleValue())) {
            return this.f5365m.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.f5365m.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final Iterator<r> g() {
        return null;
    }

    public final int hashCode() {
        return this.f5365m.hashCode();
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        if ("toString".equals(str)) {
            return new t(f());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{f(), str}));
    }

    public final String toString() {
        return f();
    }
}
