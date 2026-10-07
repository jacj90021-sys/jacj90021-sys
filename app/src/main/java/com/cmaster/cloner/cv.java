package com.cmaster.cloner;

import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cv implements bv, ok1 {
    public static cv OooO0o0;
    public String OooO0Oo;

    @Override // com.cmaster.cloner.ok1
    public void OooO(nk1 nk1Var) {
    }

    @Override // com.cmaster.cloner.bv
    public boolean OooO00o(CharSequence charSequence, int i, int i2, nq1 nq1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.OooO0Oo)) {
            return true;
        }
        nq1Var.OooO0OO = (nq1Var.OooO0OO & 3) | 4;
        return false;
    }

    @Override // com.cmaster.cloner.ok1
    public String OooOOOO() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.bv
    public Object getResult() {
        return this;
    }
}
