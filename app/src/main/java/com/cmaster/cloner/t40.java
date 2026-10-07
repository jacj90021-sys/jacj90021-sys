package com.cmaster.cloner;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t40 extends o00000OO {
    public static final Parcelable.Creator<t40> CREATOR = new e13(0);
    public static final Scope[] OooOOo = new Scope[0];
    public static final iz[] OooOOoo = new iz[0];
    public Scope[] OooO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public String OooO0oO;
    public IBinder OooO0oo;
    public Bundle OooOO0;
    public Account OooOO0O;
    public iz[] OooOO0o;
    public final boolean OooOOO;
    public iz[] OooOOO0;
    public final int OooOOOO;
    public boolean OooOOOo;
    public final String OooOOo0;

    public t40(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, iz[] izVarArr, iz[] izVarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? OooOOo : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        iz[] izVarArr3 = OooOOoo;
        iz[] izVarArr4 = izVarArr == null ? izVarArr3 : izVarArr;
        izVarArr3 = izVarArr2 != null ? izVarArr2 : izVarArr3;
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.OooO0oO = "com.google.android.gms";
        } else {
            this.OooO0oO = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = o00O0000.OooO0o0;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface yb3Var = iInterfaceQueryLocalInterface instanceof w80 ? (w80) iInterfaceQueryLocalInterface : new yb3(1, iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        yb3 yb3Var2 = (yb3) yb3Var;
                        Parcel parcelO000oooo = yb3Var2.o000oooo(2, yb3Var2.o00());
                        Account account3 = (Account) eb2.OooO00o(parcelO000oooo, Account.CREATOR);
                        parcelO000oooo.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.OooO0oo = iBinder;
            account2 = account;
        }
        this.OooOO0O = account2;
        this.OooO = scopeArr2;
        this.OooOO0 = bundle2;
        this.OooOO0o = izVarArr4;
        this.OooOOO0 = izVarArr3;
        this.OooOOO = z;
        this.OooOOOO = i4;
        this.OooOOOo = z2;
        this.OooOOo0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        e13.OooO00o(this, parcel, i);
    }
}
