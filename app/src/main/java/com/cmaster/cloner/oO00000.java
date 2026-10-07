package com.cmaster.cloner;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00000 extends f6 {
    public oO00000(Context context) {
        super(context);
        by2.OooO(context, "Context cannot be null");
    }

    public oO000O0O[] getAdSizes() {
        return this.OooO0Oo.OooO0oO;
    }

    public e1 getAppEventListener() {
        return this.OooO0Oo.OooO0oo;
    }

    public ss1 getVideoController() {
        return this.OooO0Oo.OooO0OO;
    }

    public ws1 getVideoOptions() {
        return this.OooO0Oo.OooOO0;
    }

    public void setAdSizes(oO000O0O... oo000o0oArr) {
        if (oo000o0oArr == null || oo000o0oArr.length <= 0) {
            ra.OooOOO("The supported ad sizes must contain at least one valid ad size.");
        } else {
            this.OooO0Oo.OooO0Oo(oo000o0oArr);
        }
    }

    public void setAppEventListener(e1 e1Var) {
        this.OooO0Oo.OooO0o0(e1Var);
    }

    public void setManualImpressionsEnabled(boolean z) {
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.OooOOO0 = z;
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzO(z);
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(ws1 ws1Var) {
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.OooOO0 = ws1Var;
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzW(ws1Var == null ? null : new wm2(ws1Var));
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }
}
