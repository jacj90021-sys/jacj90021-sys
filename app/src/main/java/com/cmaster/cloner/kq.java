package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class kq extends q1 {
    public final fy0 OooOO0;
    public final gy0 OooOO0O;
    public final gy0 OooOO0o;
    public final gy0 OooOOO;
    public final gy0 OooOOO0;
    public final gv0 OooOOOO;
    public final gv0 OooOOOo;
    public bq OooOOo0;
    public final fy0 OooO0o = new fy0(false);
    public final gy0 OooO0oO = new gy0();
    public final String[] OooO0oo = e2.OooO.OooO00o.getResources().getStringArray(R.array.enable_popups);
    public final fy0 OooO = new fy0(false);

    public kq() {
        fy0 fy0Var = new fy0();
        this.OooOO0 = fy0Var;
        gy0 gy0Var = new gy0(Build.PRODUCT);
        this.OooOO0O = gy0Var;
        gy0 gy0Var2 = new gy0(Build.DEVICE);
        this.OooOO0o = gy0Var2;
        gy0 gy0Var3 = new gy0(Build.BRAND);
        this.OooOOO0 = gy0Var3;
        gy0 gy0Var4 = new gy0(Build.MODEL);
        this.OooOOO = gy0Var4;
        this.OooOOOO = new gv0();
        this.OooOOOo = new gv0();
        jq jqVar = new jq(this);
        fy0Var.OooO0O0(jqVar);
        gy0Var.OooO0O0(jqVar);
        gy0Var2.OooO0O0(jqVar);
        gy0Var3.OooO0O0(jqVar);
        gy0Var4.OooO0O0(jqVar);
    }

    public final boolean OooO0OO() {
        bq bqVar = this.OooOOo0;
        if (bqVar == null) {
            return true;
        }
        if (this.OooOO0.OooO0o0 != bqVar.OooO00o()) {
            return false;
        }
        if (!TextUtils.equals((CharSequence) this.OooOOO0.OooO0o0, this.OooOOo0.OooO00o.getString(sn2.OooO00o("fToJOegkj9NsIQkr6CqFwg==\n", "D1UnSZpL66Y=\n"), Build.BRAND))) {
            return false;
        }
        if (!TextUtils.equals((CharSequence) this.OooOOO.OooO0o0, this.OooOOo0.OooO00o.getString(sn2.OooO00o("sc/YAXZHkoWg1Ngca0yTnA==\n", "w6D2cQQo9vA=\n"), Build.MODEL))) {
            return false;
        }
        if (TextUtils.equals((CharSequence) this.OooOO0O.OooO0o0, this.OooOOo0.OooO00o.getString(sn2.OooO00o("vzGmCEtxfpiuKqYWWHN/\n", "zV6IeDkeGu0=\n"), Build.PRODUCT))) {
            return TextUtils.equals((CharSequence) this.OooOO0o.OooO0o0, this.OooOOo0.OooO00o.getString(sn2.OooO00o("4dj7DoKh4c3ww/salbjs2/Y=\n", "k7fVfvDOhbg=\n"), Build.DEVICE));
        }
        return false;
    }

    public final gv0 OooO0o0(int i, String str) {
        CharSequence charSequenceLoadLabel;
        Bundle bundleOooOOo0 = null;
        if (str != null) {
            PackageInfo packageInfoOooO00o = k63.OooO00o(i, 0, str);
            charSequenceLoadLabel = packageInfoOooO00o != null ? packageInfoOooO00o.applicationInfo.loadLabel(e2.OooO0O0()) : null;
        } else {
            charSequenceLoadLabel = "" + i + 1;
        }
        try {
            bundleOooOOo0 = a02.OooO0oo.OooOOo0(i, str);
        } catch (Exception unused) {
        }
        this.OooOOOO.OooOO0(charSequenceLoadLabel);
        bq bqVar = new bq(bundleOooOOo0);
        gv0 gv0Var = this.OooOOOo;
        gv0Var.OooOO0(bqVar);
        this.OooOO0.OooO0Oo(bqVar.OooO00o());
        boolean zOooO00o = bqVar.OooO00o();
        String[] strArr = this.OooO0oo;
        this.OooO0oO.OooO0Oo(zOooO00o ? strArr[0] : strArr[1]);
        String strOooO00o = sn2.OooO00o("ytNoHWzKMezbyGgPbMQ7/Q==\n", "uLxGbR6lVZk=\n");
        String str2 = Build.BRAND;
        Bundle bundle = bqVar.OooO00o;
        this.OooOOO0.OooO0Oo(bundle.getString(strOooO00o, str2));
        this.OooOO0o.OooO0Oo(bundle.getString(sn2.OooO00o("EqklzltzInQDsiXaTGovYgU=\n", "YMYLvikcRgE=\n"), Build.DEVICE));
        this.OooOO0O.OooO0Oo(bundle.getString(sn2.OooO00o("Qi10bm3sqxpTNnRwfu6q\n", "MEJaHh+Dz28=\n"), Build.PRODUCT));
        this.OooOOO.OooO0Oo(bundle.getString(sn2.OooO00o("qd2bH1lNByi4xpsCREYGMQ==\n", "27K1bysiY10=\n"), Build.MODEL));
        this.OooOOo0 = bqVar;
        if (!OooO0OO()) {
            this.OooO.OooO0Oo(true);
        }
        return gv0Var;
    }

    public final void OooO0oO(int i, String str) {
        String str2 = bq.OooO0Oo;
        fy0 fy0Var = this.OooO;
        try {
            a02.OooO0oo.OoooO0(i, str, str2, fy0Var.OooO0o0 ? bq.OooO0O0 : bq.OooO0OO);
        } catch (Exception unused) {
        }
        try {
            a02.OooO0oo.OoooO0(i, str, sn2.OooO00o("IYswVgimLV8wkDBECKgnTg==\n", "U+QeJnrJSSo=\n"), (String) this.OooOOO0.OooO0o0);
        } catch (Exception unused2) {
        }
        try {
            a02.OooO0oo.OoooO0(i, str, sn2.OooO00o("fL+ULxVgrzZtpJQyCGuuLw==\n", "DtC6X2cPy0M=\n"), (String) this.OooOOO.OooO0o0);
        } catch (Exception unused3) {
        }
        try {
            a02.OooO0oo.OoooO0(i, str, sn2.OooO00o("qt3iV8xSpkK7xuJJ31Cn\n", "2LLMJ749wjc=\n"), (String) this.OooOO0O.OooO0o0);
        } catch (Exception unused4) {
        }
        try {
            a02.OooO0oo.OoooO0(i, str, sn2.OooO00o("kWbGGHzcJN+AfcYMa8UpyYY=\n", "4wnoaA6zQKo=\n"), (String) this.OooOO0o.OooO0o0);
        } catch (Exception unused5) {
        }
        OooO0o0(i, str);
        this.OooO0o.OooO0Oo(false);
        fy0Var.OooO0Oo(false);
    }
}
