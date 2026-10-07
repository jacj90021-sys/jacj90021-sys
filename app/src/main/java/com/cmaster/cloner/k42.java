package com.cmaster.cloner;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k42 implements ge2 {
    public static k42 OooOO0o;
    public final Object OooO;
    public final Object OooO0Oo;
    public final Object OooO0o;
    public final Object OooO0o0;
    public final Object OooO0oO;
    public final Object OooO0oo;
    public final Object OooOO0;
    public final Object OooOO0O;

    public k42(Application application) {
        this.OooO0Oo = this;
        uf ufVar = new uf(application);
        this.OooO0o0 = ufVar;
        int i = 17;
        zf2 zf2VarOooO00o = zf2.OooO00o(new nz0(ufVar, i));
        this.OooO0o = zf2VarOooO00o;
        zf2 zf2VarOooO00o2 = zf2.OooO00o(y92.OooO00o);
        this.OooO0oO = zf2VarOooO00o2;
        zf2 zf2VarOooO00o3 = zf2.OooO00o(new vk1(new nz0(this, 16), 10));
        this.OooO0oo = zf2VarOooO00o3;
        er1 er1Var = new er1(ufVar, zf2VarOooO00o, 11);
        zf2 zf2VarOooO00o4 = zf2.OooO00o(new je(i));
        this.OooO = zf2VarOooO00o4;
        n52 n52Var = new n52(ufVar, zf2VarOooO00o, zf2.OooO00o(new vr1(ufVar, zf2.OooO00o(new vk1(ufVar, 7)), 9)));
        this.OooOO0O = n52Var;
        hx2 hx2Var = new hx2(zf2VarOooO00o4, n52Var, zf2VarOooO00o, 22);
        t62 t62Var = new t62();
        t62Var.OooO0Oo = ufVar;
        t62Var.OooO0o0 = zf2VarOooO00o2;
        t62Var.OooO0o = zf2VarOooO00o;
        t62Var.OooO0oO = zf2VarOooO00o3;
        t62Var.OooO0oo = er1Var;
        t62Var.OooO = hx2Var;
        t62Var.OooOO0 = zf2VarOooO00o4;
        this.OooOO0 = zf2.OooO00o(new hx2(zf2VarOooO00o, t62Var, zf2VarOooO00o3, 26));
    }

    public static k42 OooO00o(Context context) {
        k42 k42Var;
        synchronized (k42.class) {
            try {
                if (OooOO0o == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    OooOO0o = new k42(application);
                }
                k42Var = OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k42Var;
    }

    public eh0 OooO0O0(o0O00000 o0o00000) throws hm2, IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.OooO0Oo));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = (String) o0o00000.OooO0Oo;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    o00Oo00 o00oo00 = (o00Oo00) o0o00000.OooO0o0;
                    if (o00oo00 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = o00oo00.OooO0o0;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = (String) o00oo00.OooO0o;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = (Integer) o00oo00.OooO0oO;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = (String) o0o00000.OooO0o;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = (Boolean) o0o00000.OooO0oO;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = (Map) o0o00000.OooO0oo;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    ho1 ho1Var = (ho1) o0o00000.OooO;
                    if (ho1Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) ho1Var.OooO0o0;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) ho1Var.OooO0o;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) ho1Var.OooO0oO;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zb2> list = (List) ho1Var.OooO0oo;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zb2 zb2Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zb2Var.OooO00o;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zb2Var.OooO0O0;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zb2Var.OooO0OO;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zb2Var.OooO0Oo;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    a02 a02Var = (a02) o0o00000.OooOO0;
                    if (a02Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = (String) a02Var.OooO0o;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = (String) a02Var.OooO0o0;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) a02Var.OooO0oO;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    if (((gu0) o0o00000.OooOO0O) != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("3.2.0");
                        jsonWriter.endObject();
                    }
                    List list2 = (List) o0o00000.OooOO0o;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((ub2) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        eh0 eh0VarOooO00o = eh0.OooO00o(new JsonReader(new StringReader(headerField)));
                        eh0VarOooO00o.OooO0O0 = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return eh0VarOooO00o;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            eh0 eh0VarOooO00o2 = eh0.OooO00o(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return eh0VarOooO00o2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e) {
            throw new hm2(4, e, "The server timed out.");
        } catch (IOException e2) {
            throw new hm2(2, e2, "Error making request.");
        }
    }

    public void OooO0OO(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        ge2[] ge2VarArr = {this, (ho1) this.OooO};
        qh2 qh2Var = (qh2) this.OooO0oo;
        qh2Var.getClass();
        qh2Var.OooO00o.execute(new l1(queryParameter, queryParameter2, ge2VarArr, 19, false));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r4.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r4.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r4.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    @Override // com.cmaster.cloner.ge2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooO0Oo(java.lang.String r5, org.json.JSONObject r6) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k42.OooO0Oo(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // com.cmaster.cloner.ge2
    public Executor zza() {
        Handler handler = (Handler) this.OooO0o;
        Objects.requireNonNull(handler);
        return new v3(handler, 3);
    }

    public /* synthetic */ k42(Application application, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.OooO0Oo = application;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
        this.OooO0oo = obj4;
        this.OooO = obj5;
        this.OooOO0 = obj6;
        this.OooOO0O = obj7;
    }
}
