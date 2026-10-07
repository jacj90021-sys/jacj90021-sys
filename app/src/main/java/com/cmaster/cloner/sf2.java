package com.cmaster.cloner;

import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sf2 implements jv0 {
    public final String OooO00o;
    public final pf2 OooO0O0;

    public sf2(pf2 pf2Var) {
        String strZze;
        this.OooO0O0 = pf2Var;
        try {
            strZze = pf2Var.zze();
        } catch (RemoteException e) {
            uh2.OooO0oo("", e);
            strZze = null;
        }
        this.OooO00o = strZze;
    }

    public final String toString() {
        return this.OooO00o;
    }
}
