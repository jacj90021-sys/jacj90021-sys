package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oOO0O000 {
    public static PackageInfo OooO00o() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean OooO0O0(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient OooO0OO(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient OooO0Oo(WebView webView) {
        return webView.getWebViewClient();
    }

    public static void OooO0o0(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
