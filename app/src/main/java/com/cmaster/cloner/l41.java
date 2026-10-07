package com.cmaster.cloner;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l41 {
    public final int OooO00o;
    public final int OooO0O0;
    public final String OooO0OO;

    public l41(Preference preference) {
        this.OooO0OO = preference.getClass().getName();
        this.OooO00o = preference.Oooo00O;
        this.OooO0O0 = preference.Oooo00o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l41)) {
            return false;
        }
        l41 l41Var = (l41) obj;
        return this.OooO00o == l41Var.OooO00o && this.OooO0O0 == l41Var.OooO0O0 && TextUtils.equals(this.OooO0OO, l41Var.OooO0OO);
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode() + ((((527 + this.OooO00o) * 31) + this.OooO0O0) * 31);
    }
}
