package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class us2 extends zzbla {
    public final WebView OooO00o;
    public final ak2 OooO0O0;
    public final zzgdy OooO0OO;
    public WebViewClient OooO0Oo;

    public us2(WebView webView, ak2 ak2Var, zzgdy zzgdyVar) {
        this.OooO00o = webView;
        this.OooO0O0 = ak2Var;
        this.OooO0OO = zzgdyVar;
    }

    public static boolean OooO0O0() {
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z = false;
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(us2.class.getName())) {
                        if (!z || !z2) {
                            z = true;
                        }
                    } else if (z) {
                        z2 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void OooO00o() {
        this.OooO00o.evaluateJavascript(String.format(Locale.getDefault(), (String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzkj), this.OooO0O0.OooO00o()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (OooO0O0()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final WebViewClient getDelegate() {
        return this.OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (OooO0O0()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (OooO0O0()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (OooO0O0()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (OooO0O0()) {
            return;
        }
        OooO00o();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (OooO0O0()) {
            return;
        }
        OooO00o();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (OooO0O0()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (OooO0O0()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (OooO0O0()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (OooO0O0()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (OooO0O0()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (OooO0O0()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (OooO0O0()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (OooO0O0()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (OooO0O0()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (OooO0O0()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbla, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (OooO0O0()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
