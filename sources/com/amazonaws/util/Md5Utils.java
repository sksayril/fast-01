package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
    public static byte[] a(File file) {
        return b(new FileInputStream(file));
    }

    public static byte[] b(InputStream inputStream) {
        Class<Md5Utils> cls = Md5Utils.class;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[16384];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 16384);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            try {
                bufferedInputStream.close();
            } catch (Exception e10) {
                Log b10 = LogFactory.b(cls);
                b10.a("Unable to close input stream of hash candidate: " + e10);
            }
            return digest;
        } catch (NoSuchAlgorithmException e11) {
            throw new IllegalStateException(e11);
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception e12) {
                Log b11 = LogFactory.b(cls);
                b11.a("Unable to close input stream of hash candidate: " + e12);
            }
            throw th;
        }
    }

    public static String c(File file) {
        return Base64.encodeAsString(a(file));
    }

    public static String d(InputStream inputStream) {
        return Base64.encodeAsString(b(inputStream));
    }
}
