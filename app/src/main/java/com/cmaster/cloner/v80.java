package com.cmaster.cloner;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v80 implements in {
    public final s50 OooO0Oo;
    public HttpURLConnection OooO0o;
    public final int OooO0o0;
    public InputStream OooO0oO;
    public volatile boolean OooO0oo;

    public v80(s50 s50Var, int i) {
        this.OooO0Oo = s50Var;
        this.OooO0o0 = i;
    }

    public static int OooO0O0(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return InputStream.class;
    }

    public final InputStream OooO0OO(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new t80(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new t80(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.OooO0o0;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.OooO0o = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.OooO0oO = this.OooO0o.getInputStream();
                if (this.OooO0oo) {
                    return null;
                }
                int iOooO0O0 = OooO0O0(this.OooO0o);
                int i3 = iOooO0O0 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.OooO0o;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.OooO0oO = new si(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.OooO0oO = httpURLConnection2.getInputStream();
                        }
                        return this.OooO0oO;
                    } catch (IOException e) {
                        throw new t80(OooO0O0(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (iOooO0O0 == -1) {
                        throw new t80(iOooO0O0, null, "Http request failed");
                    }
                    try {
                        throw new t80(iOooO0O0, null, this.OooO0o.getResponseMessage());
                    } catch (IOException e2) {
                        throw new t80(iOooO0O0, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.OooO0o.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new t80(iOooO0O0, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    OooO0Oo();
                    return OooO0OO(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new t80(iOooO0O0, e3, rj.OooO0OO("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new t80(OooO0O0(this.OooO0o), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new t80(0, e5, "URL.openConnection threw");
        }
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() throws IOException {
        InputStream inputStream = this.OooO0oO;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.OooO0o;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.OooO0o = null;
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        return 2;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        s50 s50Var = this.OooO0Oo;
        int i = cp0.OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                hnVar.OooO0oO(OooO0OO(s50Var.OooO0Oo(), 0, null, s50Var.OooO0O0.OooO00o()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + cp0.OooO00o(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                hnVar.OooO0O0(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + cp0.OooO00o(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + cp0.OooO00o(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        this.OooO0oo = true;
    }
}
