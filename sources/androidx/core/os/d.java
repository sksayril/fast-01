package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import g8.l;
import java.io.Serializable;

public final class d {
    public static final Bundle a(l<String, ? extends Object>... lVarArr) {
        kotlin.jvm.internal.l.e(lVarArr, "pairs");
        Bundle bundle = new Bundle(lVarArr.length);
        for (l<String, ? extends Object> lVar : lVarArr) {
            String a10 = lVar.a();
            Object b10 = lVar.b();
            if (b10 == null) {
                bundle.putString(a10, (String) null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(a10, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(a10, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(a10, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(a10, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(a10, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(a10, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(a10, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(a10, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(a10, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(a10, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(a10, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(a10, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(a10, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(a10, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(a10, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(a10, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(a10, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(a10, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(a10, (short[]) b10);
            } else {
                if (b10 instanceof Object[]) {
                    Class<?> componentType = b10.getClass().getComponentType();
                    kotlin.jvm.internal.l.b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        kotlin.jvm.internal.l.c(b10, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                        bundle.putParcelableArray(a10, (Parcelable[]) b10);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        kotlin.jvm.internal.l.c(b10, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                        bundle.putStringArray(a10, (String[]) b10);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        kotlin.jvm.internal.l.c(b10, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                        bundle.putCharSequenceArray(a10, (CharSequence[]) b10);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a10 + '\"');
                    }
                } else if (!(b10 instanceof Serializable)) {
                    if (b10 instanceof IBinder) {
                        b.a(bundle, a10, (IBinder) b10);
                    } else if (b10 instanceof Size) {
                        c.a(bundle, a10, (Size) b10);
                    } else if (b10 instanceof SizeF) {
                        c.b(bundle, a10, (SizeF) b10);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + a10 + '\"');
                    }
                }
                bundle.putSerializable(a10, (Serializable) b10);
            }
        }
        return bundle;
    }
}
