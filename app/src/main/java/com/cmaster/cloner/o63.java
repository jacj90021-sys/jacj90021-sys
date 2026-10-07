package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o63 {
    public static Method OooO00o;
    public static ClassLoader OooO0O0;

    public static Bundle OooO00o(String str, String str2, Bundle bundle) {
        try {
            return (Bundle) OooO00o.invoke(null, 10005, new Object[]{str, str2, bundle});
        } catch (Throwable th) {
            th.printStackTrace();
            return Bundle.EMPTY;
        }
    }

    public static ClassLoader OooO0O0(Context context) throws PackageManager.NameNotFoundException, IOException {
        String str;
        JSONObject jSONObject;
        ApplicationInfo applicationInfo;
        String strOooO00o = qn2.OooO00o("oDaT0erMOw==\n", "9nzQ/4u8UFA=\n");
        if (!oOO0O0O0.OooO0oO(context)) {
            return oOO0O0O0.class.getClassLoader();
        }
        File file = new File(context.getFilesDir().getParentFile(), qn2.OooO00o("V0FBEg==\n", "EhMRUM5qCvk=\n"));
        File file2 = new File(file, strOooO00o.concat(qn2.OooO00o("kjdEDOI=\n", "vF03Y4zCkk0=\n")));
        Charset charset = StandardCharsets.UTF_8;
        FileOutputStream fileOutputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                oOO0O0O0.OooO0O0(fileInputStream, byteArrayOutputStream);
                str = charset != null ? new String(byteArrayOutputStream.toByteArray(), charset) : byteArrayOutputStream.toString();
            } catch (Throwable unused) {
                str = null;
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        File file3 = new File(file, qn2.OooO00o("kPSnnA==\n", "45DMs+G0uJI=\n").concat("0"));
        String strOptString = jSONObject.optString(qn2.OooO00o("tR/v0A==\n", "xX6buIvDXRg=\n"));
        int iOptInt = jSONObject.optInt(qn2.OooO00o("75AI\n", "mfV6G6psBOg=\n"), 0);
        long jOptLong = jSONObject.optLong(qn2.OooO00o("dLTWHQ==\n", "AN27eH9m3Wk=\n"));
        if (oOO0O0O0.OooO0oO(context)) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(qn2.OooO00o("ySUU+R0XSV7eLwv5HRZHQ884\n", "qkp51356KC0=\n"), 0);
            } catch (Exception unused3) {
                applicationInfo = context.getApplicationInfo();
            }
        } else {
            applicationInfo = context.getApplicationInfo();
        }
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        if (iOptInt != 0 || TextUtils.isEmpty(strOptString) || jOptLong != jLastModified) {
            if (!TextUtils.isEmpty(strOptString)) {
                oOO0O0O0.OooO0o0(new File(strOptString));
            }
            File file4 = new File(file3, qn2.OooO00o("4lPKN7DxOoo=\n", "gDK5Up6QSuE=\n"));
            try {
                if (oOO0O0O0.OooO0oO(context)) {
                    qn2.OooO00o("ojQ2f/kDPRS1Pil/+QIzCaQp\n", "wVtbUZpuXGc=\n");
                    oOO0O0O0.OooO0OO(applicationInfo, file4);
                } else {
                    String strOooO00o2 = qn2.OooO00o("YeAfQAFHow==\n", "N6pcbmA3yIA=\n");
                    file4.getParentFile().mkdirs();
                    oOO0O0O0.OooO0Oo(context.getAssets().open(strOooO00o2), new FileOutputStream(file4));
                }
                oOO0O0O0.OooO0o(file4, qn2.OooO00o("MxX3wg==\n", "X3yV7W+vcZY=\n"), file3);
                if (Build.VERSION.SDK_INT >= 34) {
                    file4.setReadOnly();
                }
                jSONObject.putOpt(qn2.OooO00o("wFrFrw==\n", "sDuxx5bh+ls=\n"), file3.getPath());
                jSONObject.putOpt(qn2.OooO00o("kpyEKQ==\n", "5vXpTFgnLhA=\n"), Long.valueOf(jLastModified));
                jSONObject.putOpt(qn2.OooO00o("EfOF\n", "Z5b3xg+QWCU=\n"), 0);
                String string = jSONObject.toString();
                try {
                    file2.getParentFile().mkdirs();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        fileOutputStream2.write(string.getBytes());
                        oOO0O0O0.OooO00o(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        oOO0O0O0.OooO00o(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
                return oOO0O0O0.class.getClassLoader();
            }
        }
        File file5 = new File(file3, qn2.OooO00o("OPEBXxrx1Aw=\n", "WpByOjSQpGc=\n"));
        File file6 = new File(file3, qn2.OooO00o("utht\n", "1rEPMPsPiI0=\n"));
        ArrayList arrayList = new ArrayList();
        if (Process.is64Bit()) {
            for (String str2 : Build.SUPPORTED_64_BIT_ABIS) {
                File file7 = new File(file6, str2);
                if (file7.exists()) {
                    arrayList.add(file7.getAbsolutePath());
                }
            }
        } else {
            for (String str3 : Build.SUPPORTED_32_BIT_ABIS) {
                File file8 = new File(file6, str3);
                if (file8.exists()) {
                    arrayList.add(file8.getAbsolutePath());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) arrayList.get(i));
            if (i != size - 1) {
                sb.append(File.pathSeparator);
            }
        }
        return new DexClassLoader(file5.getPath(), file5.getParent(), sb.toString(), Context.class.getClassLoader());
    }

    public static void OooO0OO(Context context, Intent intent, int i) {
        try {
            ((Boolean) OooO00o.invoke(null, 10001, new Object[]{context, intent, Integer.valueOf(i)})).getClass();
        } catch (Throwable unused) {
        }
    }
}
