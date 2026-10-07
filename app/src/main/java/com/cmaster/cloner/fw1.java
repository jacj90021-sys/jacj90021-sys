package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fw1 extends hw1 {
    public final String[] OooOOOo;
    public volatile ArrayList OooOOo;
    public volatile Account[] OooOOo0;
    public volatile int OooOOoo;
    public final /* synthetic */ jw1 OooOo00;

    static {
        DexUtils.classesInit0(25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, String[] strArr) {
        super(jw1Var, w90Var, iAccountManagerResponse, i, ew1Var, false, true, null, false, false);
        this.OooOo00 = jw1Var;
        this.OooOOo0 = null;
        this.OooOOo = null;
        this.OooOOoo = 0;
        this.OooOOOo = strArr;
    }

    @Override // com.cmaster.cloner.hw1
    public final native void o00();

    public final native void o00O0000();

    @Override // com.cmaster.cloner.hw1
    public final native void onResult(Bundle bundle);
}
