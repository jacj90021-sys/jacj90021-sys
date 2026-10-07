package com.cmaster.cloner;

import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iv1 {
    public final fj1 OooO00o;
    public final ye1 OooO0Oo;
    public final ConditionVariable OooO0O0 = new ConditionVariable();
    public final LinkedHashMap OooO0OO = new LinkedHashMap();
    public volatile boolean OooO0o0 = false;

    public iv1(File file) {
        fj1 fj1Var = new fj1(e2.OooO.OooO00o, file.getAbsolutePath(), null, 1, 0);
        fj1Var.setWriteAheadLoggingEnabled(true);
        this.OooO00o = fj1Var;
        ye1 ye1Var = new ye1(1);
        this.OooO0Oo = ye1Var;
        ye1Var.execute(new u91(this, 3));
    }

    public static String OooO0OO(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            char c = obj instanceof String ? 'S' : obj instanceof Boolean ? 'B' : obj instanceof Byte ? 'b' : obj instanceof Character ? 'c' : obj instanceof Double ? 'd' : obj instanceof Float ? 'f' : obj instanceof Integer ? 'i' : obj instanceof Long ? 'l' : obj instanceof Short ? 's' : (char) 0;
            if (c != 0) {
                sb.append(c);
                sb.append('.');
                sb.append(Uri.encode(str));
                sb.append('=');
                sb.append(Uri.encode(obj.toString()));
                sb.append(';');
            }
        }
        return sb.toString();
    }

    public final qj0 OooO00o(String str, byte[] bArr) {
        int iIndexOf;
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        Bundle bundle = new Bundle();
        int i = 0;
        while (i <= str2.length() && (iIndexOf = str2.indexOf(61, i)) >= 0) {
            int iIndexOf2 = str2.indexOf(59, i);
            String strDecode = iIndexOf < iIndexOf2 ? Uri.decode(str2.substring(iIndexOf + 1, iIndexOf2)) : "";
            String strDecode2 = Uri.decode(str2.substring(i + 2, iIndexOf));
            if (str2.startsWith("S.", i)) {
                bundle.putString(strDecode2, strDecode);
            } else if (str2.startsWith("B.", i)) {
                bundle.putBoolean(strDecode2, Boolean.parseBoolean(strDecode));
            } else if (str2.startsWith("b.", i)) {
                bundle.putByte(strDecode2, Byte.parseByte(strDecode));
            } else if (str2.startsWith("c.", i)) {
                bundle.putChar(strDecode2, strDecode.charAt(0));
            } else if (str2.startsWith("d.", i)) {
                bundle.putDouble(strDecode2, Double.parseDouble(strDecode));
            } else if (str2.startsWith("f.", i)) {
                bundle.putFloat(strDecode2, Float.parseFloat(strDecode));
            } else if (str2.startsWith("i.", i)) {
                bundle.putInt(strDecode2, Integer.parseInt(strDecode));
            } else if (str2.startsWith("l.", i)) {
                bundle.putLong(strDecode2, Long.parseLong(strDecode));
            } else if (str2.startsWith("s.", i)) {
                bundle.putShort(strDecode2, Short.parseShort(strDecode));
            }
            i = iIndexOf2 + 1;
        }
        return new qj0(str, bundle);
    }

    public final void OooO0O0(String str, String str2) {
        ye1 ye1Var = this.OooO0Oo;
        ye1Var.getClass();
        if (((Executor) ye1.OooO0oo.get()) != ye1Var) {
            this.OooO0O0.block();
        }
        synchronized (this.OooO0OO) {
            try {
                Map map = (Map) this.OooO0OO.get(str);
                if (map != null && map.remove(str2) != null) {
                    this.OooO0Oo.execute(new l1(this, str, str2, 10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object OooO0Oo(String str, String str2, qj0 qj0Var) {
        Object objPut;
        ye1 ye1Var = this.OooO0Oo;
        ye1Var.getClass();
        if (((Executor) ye1.OooO0oo.get()) != ye1Var) {
            this.OooO0O0.block();
        }
        synchronized (this.OooO0OO) {
            try {
                Map linkedHashMap = (Map) this.OooO0OO.get(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.OooO0OO.put(str, linkedHashMap);
                }
                objPut = linkedHashMap.put(str2, qj0Var);
                this.OooO0Oo.execute(new sb(this, str, str2, qj0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
        return objPut;
    }
}
