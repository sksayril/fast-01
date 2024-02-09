package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JsonUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final AwsJsonFactory f4779a = new GsonFactory();

    public static AwsJsonReader a(Reader reader) {
        return f4779a.b(reader);
    }

    public static AwsJsonWriter b(Writer writer) {
        return f4779a.a(writer);
    }

    public static Map<String, String> c(Reader reader) {
        AwsJsonReader a10 = a(reader);
        try {
            if (a10.f() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            a10.a();
            while (a10.hasNext()) {
                String g10 = a10.g();
                if (a10.e()) {
                    a10.d();
                } else {
                    hashMap.put(g10, a10.c());
                }
            }
            a10.b();
            a10.close();
            return Collections.unmodifiableMap(hashMap);
        } catch (IOException e10) {
            throw new AmazonClientException("Unable to parse JSON String.", e10);
        }
    }

    public static Map<String, String> d(String str) {
        return (str == null || str.isEmpty()) ? Collections.EMPTY_MAP : c(new StringReader(str));
    }

    public static String e(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "{}";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter b10 = b(stringWriter);
            b10.a();
            for (Map.Entry next : map.entrySet()) {
                b10.d((String) next.getKey()).c((String) next.getValue());
            }
            b10.b();
            b10.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AmazonClientException("Unable to serialize to JSON String.", e10);
        }
    }
}
