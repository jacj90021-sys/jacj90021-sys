package com.cmaster.cloner;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class uo2 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ us2 OooO0o0;

    public /* synthetic */ uo2(us2 us2Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = us2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClient;
        int i = this.OooO0Oo;
        us2 us2Var = this.OooO0o0;
        switch (i) {
            case 0:
                WebView webView = us2Var.OooO00o;
                try {
                    a73 a73Var = ya3.OooOooO.OooO0OO;
                    if (Build.VERSION.SDK_INT < 26) {
                        if (u53.OooO00o("GET_WEB_VIEW_CLIENT")) {
                            try {
                                int i2 = ey1.OooO00o;
                                oOO00OO ooo00oo = hy1.OooO0O0;
                                if (ooo00oo.OooO00o()) {
                                    webViewClient = oOO0O000.OooO0Oo(webView);
                                } else {
                                    if (!ooo00oo.OooO0O0()) {
                                        throw hy1.OooO00o();
                                    }
                                    webViewClient = ((WebViewProviderBoundaryInterface) ey1.OooO0O0(webView).OooO0o0).getWebViewClient();
                                }
                            } catch (RuntimeException e) {
                                ya3.OooOooO.OooO0oo.zzw(e, "AdUtil.getWebViewClient");
                            }
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClient = webView.getWebViewClient();
                    if (webViewClient == us2Var) {
                        return;
                    }
                    if (webViewClient != null) {
                        us2Var.OooO0Oo = webViewClient;
                    }
                    webView.setWebViewClient(us2Var);
                    us2Var.OooO00o();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                us2Var.OooO0OO.execute(new uo2(us2Var, 0));
                return;
        }
    }
}
