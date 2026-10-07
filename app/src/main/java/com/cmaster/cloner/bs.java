package com.cmaster.cloner;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bs implements sr {
    public final File OooO0o0;
    public as OooO0oo;
    public final e81 OooO0oO = new e81(13);
    public final long OooO0o = 262144000;
    public final e81 OooO0Oo = new e81(26);

    public bs(File file) {
        this.OooO0o0 = file;
    }

    public final synchronized as OooO00o() {
        try {
            if (this.OooO0oo == null) {
                this.OooO0oo = as.OooOOoo(this.OooO0o0, this.OooO0o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.OooO0oo;
    }

    @Override // com.cmaster.cloner.sr
    public final File OooO0oO(zk0 zk0Var) {
        String strOooOOOO = this.OooO0Oo.OooOOOO(zk0Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strOooOOOO + " for for Key: " + zk0Var);
        }
        try {
            ay1 ay1VarOooOOOO = OooO00o().OooOOOO(strOooOOOO);
            if (ay1VarOooOOOO != null) {
                return ((File[]) ay1VarOooOOOO.OooO0o0)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.sr
    public final void OooOOOO(zk0 zk0Var, hx2 hx2Var) {
        wr wrVar;
        boolean z;
        String strOooOOOO = this.OooO0Oo.OooOOOO(zk0Var);
        e81 e81Var = this.OooO0oO;
        synchronized (e81Var) {
            wrVar = (wr) ((HashMap) e81Var.OooO0o0).get(strOooOOOO);
            if (wrVar == null) {
                o00OO000 o00oo000 = (o00OO000) e81Var.OooO0o;
                synchronized (((ArrayDeque) o00oo000.OooO0o0)) {
                    wrVar = (wr) ((ArrayDeque) o00oo000.OooO0o0).poll();
                }
                if (wrVar == null) {
                    wrVar = new wr();
                }
                ((HashMap) e81Var.OooO0o0).put(strOooOOOO, wrVar);
            }
            wrVar.OooO0O0++;
        }
        wrVar.OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strOooOOOO + " for for Key: " + zk0Var);
            }
            try {
                as asVarOooO00o = OooO00o();
                if (asVarOooO00o.OooOOOO(strOooOOOO) == null) {
                    km kmVarOooO = asVarOooO00o.OooO(strOooOOOO);
                    if (kmVarOooO == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strOooOOOO));
                    }
                    try {
                        if (((zv) hx2Var.OooO0o0).OooOO0O(hx2Var.OooO0o, kmVarOooO.OooO0OO(), (xz0) hx2Var.OooO0oO)) {
                            as.OooO0OO((as) kmVarOooO.OooO0Oo, kmVarOooO, true);
                            kmVarOooO.OooO00o = true;
                        }
                        if (!z) {
                            try {
                                kmVarOooO.OooO00o();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!kmVarOooO.OooO00o) {
                            try {
                                kmVarOooO.OooO00o();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.OooO0oO.OooOo(strOooOOOO);
        }
    }
}
