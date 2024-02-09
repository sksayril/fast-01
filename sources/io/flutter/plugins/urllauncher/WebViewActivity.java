package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WebViewActivity extends Activity {

    /* renamed from: m  reason: collision with root package name */
    private final BroadcastReceiver f10624m = new a();

    /* renamed from: n  reason: collision with root package name */
    private final WebViewClient f10625n = new b();

    /* renamed from: o  reason: collision with root package name */
    WebView f10626o;

    /* renamed from: p  reason: collision with root package name */
    private final IntentFilter f10627p = new IntentFilter("close action");

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f10626o.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f10626o.loadUrl(str);
                return true;
            }
        }

        c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f10626o.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z9, boolean z10, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z9).putExtra("enableDomStorage", z10).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f10626o = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f10626o.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f10626o.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f10626o.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f10626o.setWebViewClient(this.f10625n);
        this.f10626o.getSettings().setSupportMultipleWindows(true);
        this.f10626o.setWebChromeClient(new c());
        androidx.core.content.a.j(this, this.f10624m, this.f10627p, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f10624m);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.f10626o.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f10626o.goBack();
        return true;
    }
}
