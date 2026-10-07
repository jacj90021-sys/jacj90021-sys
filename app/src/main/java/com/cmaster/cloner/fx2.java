package com.cmaster.cloner;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fx2 {
    public static boolean OooO0OO;
    public static boolean OooO0Oo;
    public final List OooO00o;
    public static final Object OooO0O0 = new Object();
    public static final HashSet OooO0o0 = new HashSet(Arrays.asList(new String[0]));

    public fx2() {
        this.OooO00o = !OooO0OO() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean OooO0OO() {
        boolean z;
        synchronized (OooO0O0) {
            try {
                z = false;
                if (OooO0OO && OooO0Oo) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static void OooO0o0(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!OooO0o0.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        uh2.OooO0oO("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void OooO00o(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (OooO0OO()) {
            OooO0Oo("onNetworkRequest", new ho1(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr, 27));
        }
    }

    public final void OooO0O0(HttpURLConnection httpURLConnection, int i) throws IOException {
        if (OooO0OO()) {
            String responseMessage = null;
            OooO0Oo("onNetworkResponse", new oOo000Oo(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    uh2.OooOO0("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e.getMessage())));
                }
                OooO0Oo("onNetworkRequestError", new uk1(responseMessage, 1));
            }
        }
    }

    public final void OooO0Oo(String str, av2 av2Var) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.OooO00o.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            av2Var.OooO0oO(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            uh2.OooO0oo("unable to log", e);
        }
        String string = stringWriter.toString();
        synchronized (fx2.class) {
            try {
                uh2.OooO("GMA Debug BEGIN");
                int i = 0;
                while (i < string.length()) {
                    int i2 = i + 4000;
                    uh2.OooO("GMA Debug CONTENT ".concat(string.substring(i, Math.min(i2, string.length()))));
                    i = i2;
                }
                uh2.OooO("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
