package l2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import n2.c;

public class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest b10;
        PackageInfo d10 = c.a(context).d(str, 64);
        Signature[] signatureArr = d10.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b10 = b("SHA1")) == null) {
            return null;
        }
        return b10.digest(d10.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
