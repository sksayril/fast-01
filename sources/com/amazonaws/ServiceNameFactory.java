package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

enum ServiceNameFactory {
    ;

    static String getServiceName(String str) {
        HttpClientConfig h10 = InternalConfig.Factory.a().h(str);
        if (h10 == null) {
            return null;
        }
        return h10.a();
    }
}
