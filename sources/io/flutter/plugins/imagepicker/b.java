package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

class b {
    b() {
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    private static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    private static String c(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + extensionFromMimeType;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String d(Context context, Uri uri) {
        Cursor f10 = f(context, uri);
        if (f10 != null) {
            try {
                if (f10.moveToFirst()) {
                    if (f10.getColumnCount() >= 1) {
                        String string = f10.getString(0);
                        f10.close();
                        return string;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (f10 != null) {
            f10.close();
        }
        return null;
        throw th;
    }

    private static Cursor f(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e A[SYNTHETIC, Splitter:B:19:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String e(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ IOException | SecurityException -> 0x0098 }
            java.io.InputStream r1 = r1.openInputStream(r8)     // Catch:{ IOException | SecurityException -> 0x0098 }
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008c }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x008c }
            java.io.File r4 = r7.getCacheDir()     // Catch:{ all -> 0x008c }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x008c }
            r3.mkdir()     // Catch:{ all -> 0x008c }
            r3.deleteOnExit()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = d(r7, r8)     // Catch:{ all -> 0x008c }
            java.lang.String r7 = c(r7, r8)     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x0056
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r4.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "Cannot get file name for "
            r4.append(r5)     // Catch:{ all -> 0x008c }
            r4.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x008c }
            x6.b.g(r2, r8)     // Catch:{ all -> 0x008c }
            if (r7 != 0) goto L_0x0044
            java.lang.String r7 = ".jpg"
        L_0x0044:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r8.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "image_picker"
            r8.append(r2)     // Catch:{ all -> 0x008c }
            r8.append(r7)     // Catch:{ all -> 0x008c }
        L_0x0051:
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0056:
            if (r7 == 0) goto L_0x0068
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r8.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = b(r2)     // Catch:{ all -> 0x008c }
            r8.append(r2)     // Catch:{ all -> 0x008c }
            r8.append(r7)     // Catch:{ all -> 0x008c }
            goto L_0x0051
        L_0x0068:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x008c }
            r7.<init>(r3, r2)     // Catch:{ all -> 0x008c }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x008c }
            r8.<init>(r7)     // Catch:{ all -> 0x008c }
            a(r1, r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r7.getPath()     // Catch:{ all -> 0x0082 }
            r8.close()     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0081
            r1.close()     // Catch:{ IOException | SecurityException -> 0x0098 }
        L_0x0081:
            return r7
        L_0x0082:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r7     // Catch:{ all -> 0x008c }
        L_0x008c:
            r7 = move-exception
            if (r1 == 0) goto L_0x0097
            r1.close()     // Catch:{ all -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch:{ IOException | SecurityException -> 0x0098 }
        L_0x0097:
            throw r7     // Catch:{ IOException | SecurityException -> 0x0098 }
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.b.e(android.content.Context, android.net.Uri):java.lang.String");
    }
}
