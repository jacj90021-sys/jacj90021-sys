package com.cmaster.cloner;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fn implements kn, hn {
    public List OooO;
    public final List OooO0Oo;
    public final jn OooO0o;
    public final tn OooO0o0;
    public int OooO0oO = -1;
    public zk0 OooO0oo;
    public int OooOO0;
    public volatile hu0 OooOO0O;
    public File OooOO0o;

    public fn(List list, tn tnVar, jn jnVar) {
        this.OooO0Oo = list;
        this.OooO0o0 = tnVar;
        this.OooO0o = jnVar;
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0O0(Exception exc) {
        this.OooO0o.OooO0O0(this.OooO0oo, exc, this.OooOO0O.OooO0OO, 3);
    }

    @Override // com.cmaster.cloner.kn
    public final boolean OooO0OO() {
        while (true) {
            List list = this.OooO;
            boolean z = false;
            if (list != null && this.OooOO0 < list.size()) {
                this.OooOO0O = null;
                while (!z && this.OooOO0 < this.OooO.size()) {
                    List list2 = this.OooO;
                    int i = this.OooOO0;
                    this.OooOO0 = i + 1;
                    iu0 iu0Var = (iu0) list2.get(i);
                    File file = this.OooOO0o;
                    tn tnVar = this.OooO0o0;
                    this.OooOO0O = iu0Var.OooO0O0(file, tnVar.OooO0o0, tnVar.OooO0o, tnVar.OooO);
                    if (this.OooOO0O != null && this.OooO0o0.OooO0OO(this.OooOO0O.OooO0OO.OooO00o()) != null) {
                        this.OooOO0O.OooO0OO.OooO0o0(this.OooO0o0.OooOOOO, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.OooO0oO + 1;
            this.OooO0oO = i2;
            if (i2 >= this.OooO0Oo.size()) {
                return false;
            }
            zk0 zk0Var = (zk0) this.OooO0Oo.get(this.OooO0oO);
            tn tnVar2 = this.OooO0o0;
            File fileOooO0oO = tnVar2.OooO0oo.OooO00o().OooO0oO(new gn(zk0Var, tnVar2.OooOOO));
            this.OooOO0o = fileOooO0oO;
            if (fileOooO0oO != null) {
                this.OooO0oo = zk0Var;
                this.OooO = this.OooO0o0.OooO0OO.OooO00o().OooO0o(fileOooO0oO);
                this.OooOO0 = 0;
            }
        }
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0oO(Object obj) {
        this.OooO0o.OooO00o(this.OooO0oo, obj, this.OooOO0O.OooO0OO, 3, this.OooO0oo);
    }

    @Override // com.cmaster.cloner.kn
    public final void cancel() {
        hu0 hu0Var = this.OooOO0O;
        if (hu0Var != null) {
            hu0Var.OooO0OO.cancel();
        }
    }
}
