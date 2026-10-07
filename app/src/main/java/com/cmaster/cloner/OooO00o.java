package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO00o extends j41 {
    public static Intent OoooOOo(String str) {
        Intent intent = new Intent(sn2.OooO00o("wqa9QjZM9cjKpq1VN1G/h8C8sF83C8ev5p8=\n", "o8jZMFklkeY=\n"));
        intent.setData(Uri.parse(str));
        return intent;
    }

    @Override // com.cmaster.cloner.j41
    public final void OoooOOO() {
        oOOO00 oooo00Oooo0oO = Oooo0oO();
        m1 m1Var = oooo00Oooo0oO instanceof m1 ? (m1) oooo00Oooo0oO : null;
        if (m1Var != null) {
            m1Var.setTitle(m1Var.getString(R.string.title_about));
        }
        Preference preference = new Preference(Oooo(), null);
        PackageInfo packageInfoOooO00o = e2.OooO00o();
        ApplicationInfo applicationInfo = packageInfoOooO00o.applicationInfo;
        preference.OooOo0o(applicationInfo != null ? applicationInfo.loadLabel(e2.OooO0O0()) : null);
        ApplicationInfo applicationInfo2 = packageInfoOooO00o.applicationInfo;
        preference.OooOo0(applicationInfo2 != null ? applicationInfo2.loadIcon(e2.OooO0O0()) : null);
        preference.OooOo0O("version : " + packageInfoOooO00o.versionCode + "\nversion code : " + packageInfoOooO00o.versionName);
        n41 n41Var = this.OoooOoo;
        Context contextOooo = Oooo();
        n41Var.getClass();
        PreferenceScreen preferenceScreen = new PreferenceScreen(contextOooo, null);
        preferenceScreen.OooOO0(n41Var);
        n41 n41Var2 = this.OoooOoo;
        PreferenceScreen preferenceScreen2 = n41Var2.OooO0o0;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.OooOOO0();
            }
            n41Var2.OooO0o0 = preferenceScreen;
            this.Ooooo0o = true;
            if (this.OooooO0) {
                oOo00o0o ooo00o0o = this.OooooOo;
                if (!ooo00o0o.hasMessages(1)) {
                    ooo00o0o.obtainMessage(1).sendToTarget();
                }
            }
        }
        this.OoooOoo.OooO0o0.OooOoO(preference);
        Preference preference2 = new Preference(Oooo(), null);
        preference2.OooOo0o(sn2.OooO00o("qI0TucawRjrcrw2z1LI=\n", "/Oh/3KHCJ1c=\n"));
        preference2.OooOo0O(sn2.OooO00o("X3ZsqyuL4QRDLHW+d9KjSkR2fak1xKJfXg==\n", "NwIY21ixzis=\n"));
        preference2.OooOOOO = OoooOOo(sn2.OooO00o("e7ogUDjuu6Bn4DlFZLf57mC6MVImofj7eg==\n", "E85UIEvUlI8=\n"));
        preference2.OooOo0(Oooo().getDrawable(R.drawable.baseline_groups_24));
        this.OoooOoo.OooO0o0.OooOoO(preference2);
        String strOooO00o = sn2.OooO00o("1HWw9k7YKCvLdrOoW4NkYd5uq+0TgWhpk2a26UiSdCuIOfW3CtQ+MIQw8LQM0TYrg3Oh4ACRb2XO\nZOLrVIBifMhooLtzsUpT/lU=\n", "vAHEhj3iBwQ=\n");
        Preference preference3 = new Preference(Oooo(), null);
        preference3.OooOo0o(sn2.OooO00o("9H7k5s7GXnCSWPXs2dk=\n", "sh+Hg6ypMRs=\n"));
        preference3.OooOOOO = OoooOOo(strOooO00o);
        preference3.OooOo0(Oooo().getDrawable(R.drawable.baseline_groups_24));
        this.OoooOoo.OooO0o0.OooOoO(preference3);
        String strOooO00o2 = sn2.OooO00o("36S4gljsC6XAuK2GWLdU+pmzo58EtUzr2b6pngTmFLiOhq2jep5Hsv6Iop5bux3MzbKKw0k=\n", "t9DM8ivWJIo=\n");
        Preference preference4 = new Preference(Oooo(), null);
        preference4.OooOo0o(sn2.OooO00o("fDVQl8yiTPoLGkOMypM=\n", "K10x47/jPIo=\n"));
        preference4.OooOOOO = OoooOOo(strOooO00o2);
        preference4.OooOo0(Oooo().getDrawable(R.drawable.baseline_groups_24));
        this.OoooOoo.OooO0o0.OooOoO(preference4);
        Preference preference5 = new Preference(Oooo(), null);
        preference5.OooOo0o(sn2.OooO00o("FR1RRdA=\n", "UHAwLLwKnfM=\n"));
        preference5.OooOo0O(sn2.OooO00o("nSRwSGj9ZOGKLW0IZfVp4r4vckdk/CvxkSU=\n", "/kgfJg2QBZI=\n"));
        this.OoooOoo.OooO0o0.OooOoO(preference5);
        preference5.OooOo0(Oooo().getDrawable(R.drawable.baseline_email_24));
        Preference preference6 = new Preference(Oooo(), null);
        preference6.OooOo0o(sn2.OooO00o("X41KPi5rLEArnUs2Lw==\n", "C+g4U11LQyY=\n"));
        preference6.OooOOOO = OoooOOo(sn2.OooO00o("ITXqfKaX8KAqLfFisMC+/D0k7Giw2/HoIDX2ebeDtuBmNft+uN7y4C9s7Wmn27bsLG/2eLjB\n", "SUGeDNWt348=\n"));
        preference6.OooOo0(Oooo().getDrawable(R.drawable.terms));
        this.OoooOoo.OooO0o0.OooOoO(preference6);
        Preference preference7 = new Preference(Oooo(), null);
        preference7.OooOo0o(sn2.OooO00o("dZmdHCnU7x1VhJgDK84=\n", "Jev0aki3lj0=\n"));
        preference7.OooOOOO = OoooOOo(sn2.OooO00o("7KAiPPs6AnfnuDki7W1MK/CxJCjtdgM/7aA+OeouRDerpCQl/mFOIaq8IiHk\n", "hNRWTIgALVg=\n"));
        preference7.OooOo0(Oooo().getDrawable(R.drawable.privacy));
        this.OoooOoo.OooO0o0.OooOoO(preference7);
        if (Oooo0oo().getBoolean(sn2.OooO00o("Gi9LcVHCfd8bL1lxStVnxQY8\n", "SGoaJBiQOIA=\n"), false)) {
            oOo000Oo ooo000oo = new oOo000Oo(Oooo());
            oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
            oo00o0.OooO0o = oo00o0.OooO00o.getText(R.string.app_secure_env_content);
            oo00o0.OooO0oO = oo00o0.OooO00o.getText(R.string.privacy_positive);
            oo00o0.OooO0oo = null;
            ooo000oo.OooO0OO().show();
        }
    }
}
