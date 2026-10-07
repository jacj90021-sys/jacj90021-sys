package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k50 implements in {
    public final Resources OooO0Oo;
    public final ApplicationInfo OooO0o;
    public final l50 OooO0o0;
    public Object OooO0oO;

    public k50(Resources.Theme theme, Resources resources, l50 l50Var, ApplicationInfo applicationInfo) {
        this.OooO0Oo = resources;
        this.OooO0o0 = l50Var;
        this.OooO0o = applicationInfo;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return this.OooO0o0.OooO00o();
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        Object obj = this.OooO0oO;
        if (obj != null) {
            try {
                this.OooO0o0.OooO0O0(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        return 2;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        try {
            Object objOooOO0o = this.OooO0o0.OooOO0o(this.OooO0Oo, this.OooO0o);
            this.OooO0oO = objOooOO0o;
            hnVar.OooO0oO(objOooOO0o);
        } catch (Resources.NotFoundException e) {
            hnVar.OooO0O0(e);
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
    }
}
