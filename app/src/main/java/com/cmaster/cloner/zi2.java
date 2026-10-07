package com.cmaster.cloner;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzbpm;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zi2 {
    public o0OOo000 OooO0o;
    public e32 OooO0o0;
    public oO000O0O[] OooO0oO;
    public e1 OooO0oo;
    public ws1 OooOO0;
    public String OooOO0O;
    public final f6 OooOO0o;
    public hz0 OooOOO;
    public boolean OooOOO0;
    public final zzbpm OooO00o = new zzbpm();
    public final ss1 OooO0OO = new ss1();
    public final xi2 OooO0Oo = new xi2(this);
    public final AtomicLong OooOOOO = new AtomicLong();
    public final w43 OooO0O0 = w43.OooO00o;
    public sa2 OooO = null;

    public zi2(f6 f6Var) {
        this.OooOO0o = f6Var;
        new AtomicBoolean(false);
    }

    public static w53 OooO00o(Context context, oO000O0O[] oo000o0oArr) {
        for (oO000O0O oo000o0o : oo000o0oArr) {
            if (oo000o0o.equals(oO000O0O.OooOO0O)) {
                return new w53("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        w53 w53Var = new w53(context, oo000o0oArr);
        w53Var.OooOOO0 = false;
        return w53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: RemoteException -> 0x00d3, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d3, blocks: (B:28:0x00a0, B:30:0x00a6, B:32:0x00b4, B:34:0x00c6, B:37:0x00d5), top: B:54:0x00a0, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(com.cmaster.cloner.ti2 r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zi2.OooO0O0(com.cmaster.cloner.ti2):void");
    }

    public final void OooO0OO(e32 e32Var) {
        try {
            this.OooO0o0 = e32Var;
            sa2 sa2Var = this.OooO;
            if (sa2Var != null) {
                sa2Var.zzD(e32Var != null ? new d72(e32Var) : null);
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public final void OooO0Oo(oO000O0O... oo000o0oArr) {
        f6 f6Var = this.OooOO0o;
        this.OooO0oO = oo000o0oArr;
        try {
            sa2 sa2Var = this.OooO;
            if (sa2Var != null) {
                sa2Var.zzG(OooO00o(f6Var.getContext(), this.OooO0oO));
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
        f6Var.requestLayout();
    }

    public final void OooO0o0(e1 e1Var) {
        try {
            this.OooO0oo = e1Var;
            sa2 sa2Var = this.OooO;
            if (sa2Var != null) {
                sa2Var.zzH(e1Var != null ? new zzazr(e1Var) : null);
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }
}
