package com.amazonaws.services.s3.internal;

import com.amazonaws.Request;
import com.amazonaws.util.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RestUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f4299a = Arrays.asList(new String[]{"acl", "torrent", "logging", "location", "policy", "requestPayment", "versioning", "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website", "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate", "inventory", "analytics", "metrics", "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires"});

    public static <T> String a(String str, String str2, Request<T> request, String str3, Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "\n");
        Map<String, String> l10 = request.l();
        TreeMap treeMap = new TreeMap();
        if (l10 != null && l10.size() > 0) {
            for (Map.Entry next : l10.entrySet()) {
                String str4 = (String) next.getKey();
                String str5 = (String) next.getValue();
                if (str4 != null) {
                    String b10 = StringUtils.b(str4);
                    if ("content-type".equals(b10) || "content-md5".equals(b10) || "date".equals(b10) || b10.startsWith("x-amz-")) {
                        treeMap.put(b10, str5);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (str3 != null) {
            treeMap.put("date", str3);
        }
        if (!treeMap.containsKey("content-type")) {
            treeMap.put("content-type", "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        for (Map.Entry next2 : request.getParameters().entrySet()) {
            if (((String) next2.getKey()).startsWith("x-amz-")) {
                treeMap.put(next2.getKey(), next2.getValue());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String str6 = (String) entry.getKey();
            String str7 = (String) entry.getValue();
            if (str6.startsWith("x-amz-")) {
                sb.append(str6);
                sb.append(':');
                if (str7 == null) {
                    sb.append("\n");
                }
            } else if (str7 == null) {
                sb.append("\n");
            }
            sb.append(str7);
            sb.append("\n");
        }
        sb.append(str2);
        String[] strArr = (String[]) request.getParameters().keySet().toArray(new String[request.getParameters().size()]);
        Arrays.sort(strArr);
        char c10 = '?';
        for (String str8 : strArr) {
            if (f4299a.contains(str8) || (collection != null && collection.contains(str8))) {
                if (sb.length() == 0) {
                    sb.append(c10);
                }
                sb.append(str8);
                String str9 = request.getParameters().get(str8);
                if (str9 != null) {
                    sb.append("=");
                    sb.append(str9);
                }
                c10 = '&';
            }
        }
        return sb.toString();
    }
}
