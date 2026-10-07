package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class cw1 extends hw1 {
    public final /* synthetic */ int OooOOOo;
    public final /* synthetic */ Object OooOOo;
    public final /* synthetic */ String OooOOo0;
    public final /* synthetic */ Bundle OooOOoo;

    static {
        DexUtils.classesInit0(66);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, boolean z, String str, Account account, String str2, Bundle bundle) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, z, true, str, false, true);
        this.OooOOOo = 2;
        this.OooOOo = account;
        this.OooOOo0 = str2;
        this.OooOOoo = bundle;
    }

    @Override // com.cmaster.cloner.hw1
    public final native void o00();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, boolean z, String str, String[] strArr, Bundle bundle, int i2) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, z, true, null, false, true);
        this.OooOOOo = i2;
        this.OooOOo0 = str;
        this.OooOOo = strArr;
        this.OooOOoo = bundle;
    }
}
