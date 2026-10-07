package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zv1 extends hw1 {
    public final /* synthetic */ int OooOOOo = 1;
    public final Object OooOOo;
    public final Account OooOOo0;

    static {
        DexUtils.classesInit0(16);
    }

    public zv1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, Account account, String[] strArr) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, false, true, account.name, false, false);
        this.OooOOo = strArr;
        this.OooOOo0 = account;
    }

    @Override // com.cmaster.cloner.hw1
    public final native void o00();

    @Override // com.cmaster.cloner.hw1
    public native void onResult(Bundle bundle);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, Account account, boolean z) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, z, true, account.name, false, false);
        this.OooOOo = jw1Var;
        this.OooOOo0 = account;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, boolean z, String str, Account account, Bundle bundle) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, z, true, str, true, true);
        this.OooOOo0 = account;
        this.OooOOo = bundle;
    }
}
