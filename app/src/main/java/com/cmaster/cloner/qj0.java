package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qj0 {
    public static final String OooOO0O;
    public final String OooO00o;
    public final String OooO0O0;
    public final int OooO0OO;
    public final Bundle OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public static final String OooO0oO = sn2.OooO00o("JN1VHIWgJGAy0U4DyuImdyTJ\n", "QaUhbuSORxU=\n");
    public static final String OooO0oo = sn2.OooO00o("kM2NyM97S/6GwZbXgDxL5Js=\n", "9bX5uq5VKIs=\n");
    public static final String OooO = sn2.OooO00o("5xL7DWm2lVb3GOwaJvyPSw==\n", "gmqPfwiY5jk=\n");
    public static final String OooOO0 = sn2.OooO00o("Q/njAmZG5ndT8/QVKQT0ekPt\n", "JoGXcAdolRg=\n");

    static {
        sn2.OooO00o("kk9vEjEdYyeEQ3QNfl1vJpI=\n", "9zcbYFAzAFI=\n");
        sn2.OooO00o("1USqbkhK\n", "pjDYBys+q00=\n");
        sn2.OooO00o("1+mCfJ4bgMOc+JFgkEeE\n", "spH2Dv814ac=\n");
        OooOO0O = sn2.OooO00o("hDnpOwGSjQ2QIeo=\n", "90yZS27g+VI=\n");
    }

    public qj0(String str, int i, Bundle bundle) {
        StringBuilder sbOooOO0 = rj.OooOO0(str);
        sbOooOO0.append(sn2.OooO00o("fQ==\n", "PfHtOm5FeLQ=\n"));
        sbOooOO0.append(i);
        this.OooO00o = sbOooOO0.toString();
        this.OooO0Oo = bundle;
        this.OooO0O0 = str;
        this.OooO0OO = i;
        bundle.putString(sn2.OooO00o("72cL\n", "nwxs1VnPEek=\n"), str);
        bundle.putInt(sn2.OooO00o("7NbR1S8=\n", "n6awtkoZHgs=\n"), i);
        this.OooO0o0 = 0;
        this.OooO0o = 0;
    }

    public final String OooO00o(String str) {
        String string;
        synchronized (this.OooO0Oo) {
            string = this.OooO0Oo.getString(str, null);
        }
        return string;
    }

    public final int OooO0O0() {
        int i;
        String strOooO00o = sn2.OooO00o("7ORkkfjk\n", "n5AF5Y2Xdgw=\n");
        synchronized (this.OooO0Oo) {
            i = this.OooO0Oo.getInt(strOooO00o, 0);
        }
        return i;
    }

    public final void OooO0OO() {
        synchronized (this.OooO0Oo) {
            try {
                int i = this.OooO0o;
                if (i == this.OooO0o0) {
                    return;
                }
                this.OooO0o0 = i;
                this.OooO0Oo.putInt(sn2.OooO00o("ofAa/Q==\n", "/oZ/j+P+Xis=\n"), this.OooO0o0);
                jv1 jv1Var = jv1.OooO0O0;
                synchronized (jv1Var) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(String str, String str2) {
        synchronized (this.OooO0Oo) {
            this.OooO0o++;
            this.OooO0Oo.putString(str, str2);
        }
    }

    public final void OooO0o0(int i) {
        String strOooO00o = sn2.OooO00o("ErKh18UV\n", "YcbAo7BmypA=\n");
        synchronized (this.OooO0Oo) {
            this.OooO0o++;
            this.OooO0Oo.putInt(strOooO00o, i);
        }
    }

    public qj0(String str, Bundle bundle) {
        this.OooO00o = str;
        this.OooO0Oo = bundle;
        this.OooO0O0 = bundle.getString(sn2.OooO00o("YvpF\n", "EpEi8p2zzlk=\n"));
        this.OooO0OO = bundle.getInt(sn2.OooO00o("R7HZlP0=\n", "NMG495gsVKc=\n"));
        int i = bundle.getInt(sn2.OooO00o("nQHsOA==\n", "wneJSrpqEmI=\n"));
        this.OooO0o0 = i;
        this.OooO0o = i;
    }
}
