package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s60 implements jy1, bz0, ju0, oy, jy, ig, xl, eu, qo1 {
    public static s60 OooO0Oo;
    public static final String[] OooO0o0 = new String[0];
    public static final /* synthetic */ s60 OooO0o = new s60();

    public static ByteArrayInputStream OooO00o(String str) {
        if (!str.startsWith("data:image")) {
            ra.OooOOO("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            ra.OooOOO("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        ra.OooOOO("Not a base64 image data URL.");
        return null;
    }

    public static final vs2 OooO0O0(PackageInfo packageInfo, vs2... vs2VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            bv2 bv2Var = new bv2(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < vs2VarArr.length; i++) {
                if (vs2VarArr[i].equals(bv2Var)) {
                    return vs2VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean OooO0Oo(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
            goto L1c
        L19:
            r2 = r4
        L1a:
            r3 = r0
            goto L2e
        L1c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L22
        L20:
            r2 = r1
            goto L29
        L22:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L20
            r2 = r0
        L29:
            r3 = r2
            r2 = r4
            goto L2e
        L2c:
            r2 = 0
            goto L1a
        L2e:
            if (r4 == 0) goto L4c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3d
            com.cmaster.cloner.vs2[] r4 = com.cmaster.cloner.oz2.OooO00o
            com.cmaster.cloner.vs2 r4 = OooO0O0(r2, r4)
            goto L49
        L3d:
            com.cmaster.cloner.vs2[] r4 = com.cmaster.cloner.oz2.OooO00o
            r4 = r4[r1]
            com.cmaster.cloner.vs2[] r4 = new com.cmaster.cloner.vs2[]{r4}
            com.cmaster.cloner.vs2 r4 = OooO0O0(r2, r4)
        L49:
            if (r4 == 0) goto L4c
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.s60.OooO0Oo(android.content.pm.PackageInfo):boolean");
    }

    @Override // com.cmaster.cloner.jy1
    public String[] OooO() {
        return OooO0o0;
    }

    @Override // com.cmaster.cloner.oy
    public py OooO0OO(float f, float f2, float f3) {
        return new py(255, dp1.OooO0o0(f2, f3, f, 0, 255), true);
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        return new gu0(0);
    }

    @Override // com.cmaster.cloner.jy
    public Object OooO0oO() {
        try {
            return new xc1(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.eu
    public du OooO0oo(Context context, String str, cu cuVar) {
        du duVar = new du();
        int iOooOOO0 = cuVar.OooOOO0(context, str);
        duVar.OooO00o = iOooOOO0;
        if (iOooOOO0 != 0) {
            duVar.OooO0OO = -1;
            return duVar;
        }
        int iOooOO0o = cuVar.OooOO0o(context, str, true);
        duVar.OooO0O0 = iOooOO0o;
        if (iOooOO0o != 0) {
            duVar.OooO0OO = 1;
        }
        return duVar;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new wq1(1);
    }

    @Override // com.cmaster.cloner.qo1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // com.cmaster.cloner.jy1
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.cmaster.cloner.jy1
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        du0.OooO0oo.OooOo("MobileVisionBase", "Error preloading model resource", exc);
    }
}
