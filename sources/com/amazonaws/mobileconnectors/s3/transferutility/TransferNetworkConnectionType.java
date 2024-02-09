package com.amazonaws.mobileconnectors.s3.transferutility;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;

public enum TransferNetworkConnectionType {
    ANY {
        /* access modifiers changed from: protected */
        public boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected();
        }
    },
    WIFI {
        /* access modifiers changed from: protected */
        public boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
        }
    },
    MOBILE {
        /* access modifiers changed from: protected */
        public boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
        }
    };
    
    private static final Log LOGGER = null;
    private static final Map<String, TransferNetworkConnectionType> MAP = null;

    static {
        int i10;
        MAP = new HashMap();
        for (TransferNetworkConnectionType transferNetworkConnectionType : values()) {
            MAP.put(transferNetworkConnectionType.toString(), transferNetworkConnectionType);
        }
        LOGGER = LogFactory.b(TransferNetworkConnectionType.class);
    }

    public static TransferNetworkConnectionType getConnectionType(String str) {
        Map<String, TransferNetworkConnectionType> map = MAP;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Log log = LOGGER;
        log.g("Unknown connection type " + str + " transfer will have connection type set to ANY.");
        return ANY;
    }

    /* access modifiers changed from: package-private */
    public boolean isConnected(ConnectivityManager connectivityManager) {
        return verify(connectivityManager.getActiveNetworkInfo());
    }

    /* access modifiers changed from: protected */
    public abstract boolean verify(NetworkInfo networkInfo);
}
