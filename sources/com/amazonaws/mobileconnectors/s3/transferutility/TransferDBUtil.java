package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.json.JsonUtils;
import com.google.gson.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class TransferDBUtil {

    /* renamed from: b  reason: collision with root package name */
    private static final Log f4116b = LogFactory.b(TransferDBUtil.class);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4117c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static TransferDBBase f4118d;

    /* renamed from: a  reason: collision with root package name */
    private e f4119a = new e();

    public TransferDBUtil(Context context) {
        synchronized (f4117c) {
            if (f4118d == null) {
                f4118d = new TransferDBBase(context);
            }
        }
    }

    private String b(int i10) {
        if (i10 <= 0) {
            f4116b.g("Cannot create a string of 0 or less placeholders.");
            return null;
        }
        StringBuilder sb = new StringBuilder((i10 * 2) - 1);
        sb.append("?");
        for (int i11 = 1; i11 < i10; i11++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    private ContentValues e(ObjectMetadata objectMetadata) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_metadata", JsonUtils.e(objectMetadata.J()));
        contentValues.put("header_content_type", objectMetadata.w());
        contentValues.put("header_content_encoding", objectMetadata.t());
        contentValues.put("header_cache_control", objectMetadata.r());
        contentValues.put("content_md5", objectMetadata.v());
        contentValues.put("header_content_disposition", objectMetadata.s());
        contentValues.put("sse_algorithm", objectMetadata.E());
        contentValues.put("kms_key", objectMetadata.F());
        contentValues.put("expiration_time_rule_id", objectMetadata.z());
        if (objectMetadata.A() != null) {
            contentValues.put("http_expires_date", String.valueOf(objectMetadata.A().getTime()));
        }
        if (objectMetadata.I() != null) {
            contentValues.put("header_storage_class", objectMetadata.I());
        }
        return contentValues;
    }

    private ContentValues f(TransferType transferType, String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", transferType.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        contentValues.put("bucket_name", str);
        contentValues.put("key", str2);
        contentValues.put("file", file.getAbsolutePath());
        contentValues.put("bytes_current", 0L);
        if (transferType.equals(TransferType.UPLOAD)) {
            contentValues.put("bytes_total", Long.valueOf(file.length()));
        }
        contentValues.put("is_multipart", 0);
        contentValues.put("part_num", 0);
        contentValues.put("is_encrypted", 0);
        contentValues.putAll(e(objectMetadata));
        if (cannedAccessControlList != null) {
            contentValues.put("canned_acl", cannedAccessControlList.toString());
        }
        if (transferUtilityOptions != null) {
            contentValues.put("transfer_utility_options", this.f4119a.r(transferUtilityOptions));
        }
        return contentValues;
    }

    public int a(ContentValues[] contentValuesArr) {
        TransferDBBase transferDBBase = f4118d;
        return transferDBBase.a(transferDBBase.d(), contentValuesArr);
    }

    public int c(int i10) {
        return f4118d.b(i(i10), (String) null, (String[]) null);
    }

    public ContentValues d(String str, String str2, File file, long j10, int i10, String str3, long j11, int i11, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        TransferUtilityOptions transferUtilityOptions2 = transferUtilityOptions;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", TransferType.UPLOAD.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        String str4 = str;
        contentValues.put("bucket_name", str);
        String str5 = str2;
        contentValues.put("key", str2);
        contentValues.put("file", file.getAbsolutePath());
        contentValues.put("bytes_current", 0L);
        contentValues.put("bytes_total", Long.valueOf(j11));
        contentValues.put("is_multipart", 1);
        contentValues.put("part_num", Integer.valueOf(i10));
        contentValues.put("file_offset", Long.valueOf(j10));
        String str6 = str3;
        contentValues.put("multipart_id", str3);
        contentValues.put("is_last_part", Integer.valueOf(i11));
        contentValues.put("is_encrypted", 0);
        contentValues.putAll(e(objectMetadata));
        if (cannedAccessControlList != null) {
            contentValues.put("canned_acl", cannedAccessControlList.toString());
        }
        if (transferUtilityOptions2 != null) {
            contentValues.put("transfer_utility_options", this.f4119a.r(transferUtilityOptions2));
        }
        return contentValues;
    }

    public List<UploadPartRequest> g(int i10, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor f10 = f4118d.f(h(i10), (String[]) null, (String) null, (String[]) null, (String) null);
            while (f10.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.getState(f10.getString(f10.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest O = new UploadPartRequest().J(f10.getInt(f10.getColumnIndexOrThrow("_id"))).M(f10.getInt(f10.getColumnIndexOrThrow("main_upload_id"))).G(f10.getString(f10.getColumnIndexOrThrow("bucket_name"))).K(f10.getString(f10.getColumnIndexOrThrow("key"))).P(str).H(new File(f10.getString(f10.getColumnIndexOrThrow("file")))).I(f10.getLong(f10.getColumnIndexOrThrow("file_offset"))).N(f10.getInt(f10.getColumnIndexOrThrow("part_num"))).O(f10.getLong(f10.getColumnIndexOrThrow("bytes_total")));
                    boolean z9 = true;
                    if (1 != f10.getInt(f10.getColumnIndexOrThrow("is_last_part"))) {
                        z9 = false;
                    }
                    arrayList.add(O.L(z9));
                }
            }
            f10.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public Uri h(int i10) {
        return Uri.parse(f4118d.d() + "/part/" + i10);
    }

    public Uri i(int i10) {
        return Uri.parse(f4118d.d() + "/" + i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord j(int r4) {
        /*
            r3 = this;
            r0 = 0
            android.database.Cursor r1 = r3.n(r4)     // Catch:{ all -> 0x001a }
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0013
            com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord r0 = new com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord     // Catch:{ all -> 0x0017 }
            r0.<init>(r4)     // Catch:{ all -> 0x0017 }
            r0.j(r1)     // Catch:{ all -> 0x0017 }
        L_0x0013:
            r1.close()
            return r0
        L_0x0017:
            r4 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r4 = move-exception
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()
        L_0x0020:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil.j(int):com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord");
    }

    public Uri k(TransferType transferType, String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        ContentValues f10 = f(transferType, str, str2, file, objectMetadata, cannedAccessControlList, transferUtilityOptions);
        TransferDBBase transferDBBase = f4118d;
        return transferDBBase.e(transferDBBase.d(), f10);
    }

    public long l(int i10) {
        Cursor cursor = null;
        try {
            Cursor f10 = f4118d.f(h(i10), (String[]) null, (String) null, (String[]) null, (String) null);
            long j10 = 0;
            while (f10.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.getState(f10.getString(f10.getColumnIndexOrThrow("state"))))) {
                    j10 += f10.getLong(f10.getColumnIndexOrThrow("bytes_total"));
                }
            }
            f10.close();
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<PartETag> m(int i10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor f10 = f4118d.f(h(i10), (String[]) null, (String) null, (String[]) null, (String) null);
            while (f10.moveToNext()) {
                arrayList.add(new PartETag(f10.getInt(f10.getColumnIndexOrThrow("part_num")), f10.getString(f10.getColumnIndexOrThrow("etag"))));
            }
            f10.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public Cursor n(int i10) {
        return f4118d.f(i(i10), (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public Cursor o(TransferType transferType, TransferState[] transferStateArr) {
        String[] strArr;
        String str;
        int length = transferStateArr.length;
        String b10 = b(length);
        int i10 = 0;
        if (transferType == TransferType.ANY) {
            String str2 = "state in (" + b10 + ")";
            String[] strArr2 = new String[length];
            while (i10 < length) {
                strArr2[i10] = transferStateArr[i10].toString();
                i10++;
            }
            str = str2;
            strArr = strArr2;
        } else {
            String str3 = "state in (" + b10 + ") and " + "type" + "=?";
            String[] strArr3 = new String[(length + 1)];
            while (i10 < length) {
                strArr3[i10] = transferStateArr[i10].toString();
                i10++;
            }
            strArr3[i10] = transferType.toString();
            str = str3;
            strArr = strArr3;
        }
        TransferDBBase transferDBBase = f4118d;
        return transferDBBase.f(transferDBBase.d(), (String[]) null, str, strArr, (String) null);
    }

    public int p(int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j10));
        return f4118d.g(i(i10), contentValues, (String) null, (String[]) null);
    }

    public int q(int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        return f4118d.g(i(i10), contentValues, (String) null, (String[]) null);
    }

    public int r(int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        return f4118d.g(i(i10), contentValues, (String) null, (String[]) null);
    }

    public int s(int i10, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (!TransferState.FAILED.equals(transferState)) {
            return f4118d.g(i(i10), contentValues, (String) null, (String[]) null);
        }
        return f4118d.g(i(i10), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
    }

    public int t(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(transferRecord.f4139a));
        contentValues.put("state", transferRecord.f4153o.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f4146h));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f4147i));
        return f4118d.g(i(transferRecord.f4139a), contentValues, (String) null, (String[]) null);
    }
}
