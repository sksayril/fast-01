package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCredentials implements AWSCredentials {

    /* renamed from: a  reason: collision with root package name */
    private final String f4024a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4025b;

    public PropertiesCredentials(File file) {
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                    throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
                }
                this.f4024a = properties.getProperty("accessKey");
                this.f4025b = properties.getProperty("secretKey");
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
        }
    }

    public PropertiesCredentials(InputStream inputStream) {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            if (properties.getProperty("accessKey") == null || properties.getProperty("secretKey") == null) {
                throw new IllegalArgumentException("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            }
            this.f4024a = properties.getProperty("accessKey");
            this.f4025b = properties.getProperty("secretKey");
        } finally {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public String a() {
        return this.f4025b;
    }

    public String c() {
        return this.f4024a;
    }
}
