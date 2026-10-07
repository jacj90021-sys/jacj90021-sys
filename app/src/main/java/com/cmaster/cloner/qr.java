package com.cmaster.cloner;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qr implements in {
    public final Resources.Theme OooO0Oo;
    public final rr OooO0o;
    public final Resources OooO0o0;
    public final int OooO0oO;
    public Object OooO0oo;

    public qr(Resources.Theme theme, Resources resources, rr rrVar, int i) {
        this.OooO0Oo = theme;
        this.OooO0o0 = resources;
        this.OooO0o = rrVar;
        this.OooO0oO = i;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return this.OooO0o.OooO00o();
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        Object obj = this.OooO0oo;
        if (obj != null) {
            try {
                this.OooO0o.OooO0O0(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        return 1;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        try {
            Object objOooO0OO = this.OooO0o.OooO0OO(this.OooO0oO, this.OooO0Oo, this.OooO0o0);
            this.OooO0oo = objOooO0OO;
            hnVar.OooO0oO(objOooO0OO);
        } catch (Resources.NotFoundException e) {
            hnVar.OooO0O0(e);
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
    }
}
