package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a90 extends x80 {
    public final /* synthetic */ int OooO00o;

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        switch (this.OooO00o) {
            case 0:
                Object[] objArr = yqVar.OooO0o;
                IAccountManagerResponse iAccountManagerResponse = (IAccountManagerResponse) objArr[0];
                Account account = (Account) objArr[1];
                String str = (String) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                Bundle bundle = (Bundle) objArr[4];
                vv1 vv1VarOooO00o = vv1.OooO00o();
                vv1VarOooO00o.getClass();
                try {
                    vv1VarOooO00o.OooO00o.OooOoo0(qx1.OooO0oO(), iAccountManagerResponse.asBinder(), account, str, zBooleanValue, bundle);
                } catch (Exception e) {
                    vv1.OooO0OO(e);
                }
                yqVar.OooO0oo(null);
                break;
            default:
                Object[] objArr2 = yqVar.OooO0o;
                Account account2 = (Account) objArr2[0];
                String str2 = (String) objArr2[1];
                String str3 = (String) objArr2[2];
                vv1 vv1VarOooO00o2 = vv1.OooO00o();
                vv1VarOooO00o2.getClass();
                try {
                    vv1VarOooO00o2.OooO00o.o0000OO(qx1.OooO0oO(), account2, str2, str3);
                } catch (Exception e2) {
                    vv1.OooO0OO(e2);
                }
                yqVar.OooO0oo(null);
                break;
        }
    }
}
