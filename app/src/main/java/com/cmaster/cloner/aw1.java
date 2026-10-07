package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class aw1 extends hw1 {
    public final /* synthetic */ Bundle OooOOOo;
    public final /* synthetic */ String OooOOo;
    public final /* synthetic */ Account OooOOo0;
    public final /* synthetic */ boolean OooOOoo;
    public final /* synthetic */ String OooOo0;
    public final /* synthetic */ boolean OooOo00;
    public final /* synthetic */ jw1 OooOo0O;

    static {
        DexUtils.classesInit0(68);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, boolean z, String str, Bundle bundle, Account account, String str2, boolean z2, boolean z3, String str3) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, z, false, str, false, false);
        this.OooOo0O = jw1Var;
        this.OooOOOo = bundle;
        this.OooOOo0 = account;
        this.OooOOo = str2;
        this.OooOOoo = z2;
        this.OooOo00 = z3;
        this.OooOo0 = str3;
    }

    @Override // com.cmaster.cloner.hw1
    public final native void o00();

    @Override // com.cmaster.cloner.hw1
    public final native void onResult(Bundle bundle);
}
