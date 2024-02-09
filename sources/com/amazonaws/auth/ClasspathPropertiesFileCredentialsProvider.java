package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
public class ClasspathPropertiesFileCredentialsProvider implements AWSCredentialsProvider {

    /* renamed from: b  reason: collision with root package name */
    private static String f4016b = "AwsCredentials.properties";

    /* renamed from: a  reason: collision with root package name */
    private final String f4017a;

    public ClasspathPropertiesFileCredentialsProvider() {
        this(f4016b);
    }

    public ClasspathPropertiesFileCredentialsProvider(String str) {
        if (str != null) {
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            this.f4017a = str;
            return;
        }
        throw new IllegalArgumentException("Credentials file path cannot be null");
    }

    public AWSCredentials a() {
        InputStream resourceAsStream = getClass().getResourceAsStream(this.f4017a);
        if (resourceAsStream != null) {
            try {
                return new PropertiesCredentials(resourceAsStream);
            } catch (IOException e10) {
                throw new AmazonClientException("Unable to load AWS credentials from the " + this.f4017a + " file on the classpath", e10);
            }
        } else {
            throw new AmazonClientException("Unable to load AWS credentials from the " + this.f4017a + " file on the classpath");
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f4017a + ")";
    }
}
