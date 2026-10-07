package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ey1 {
    public static final /* synthetic */ int OooO00o = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo OooO00o() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static vk1 OooO0O0(WebView webView) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceCreateWebView = iy1.OooO00o.createWebView(webView);
        vk1 vk1Var = new vk1(2);
        vk1Var.OooO0o0 = webViewProviderBoundaryInterfaceCreateWebView;
        return vk1Var;
    }

    public static String OooO0OO() {
        if (hy1.OooO0o.OooO0O0()) {
            return iy1.OooO00o.getStatics().getVariationsHeader();
        }
        throw hy1.OooO00o();
    }
}
