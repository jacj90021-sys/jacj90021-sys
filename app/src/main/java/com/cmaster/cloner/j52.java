package com.cmaster.cloner;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j52 extends l72 {
    public final /* synthetic */ Context OooO0O0;
    public final /* synthetic */ w53 OooO0OO;
    public final /* synthetic */ String OooO0Oo;
    public final /* synthetic */ t62 OooO0o0;

    public j52(t62 t62Var, Context context, w53 w53Var, String str) {
        this.OooO0O0 = context;
        this.OooO0OO = w53Var;
        this.OooO0Oo = str;
        Objects.requireNonNull(t62Var);
        this.OooO0o0 = t62Var;
    }

    @Override // com.cmaster.cloner.l72
    public final Object OooO00o() {
        t62.OooOOOo(this.OooO0O0, "search");
        return new cl2();
    }

    @Override // com.cmaster.cloner.l72
    public final Object OooO0O0(jd2 jd2Var) {
        return jd2Var.o0000oO(new ey0(this.OooO0O0), this.OooO0OO, this.OooO0Oo, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.cmaster.cloner.l72
    public final /* bridge */ /* synthetic */ Object OooO0OO() {
        return ((zu2) this.OooO0o0.OooO0Oo).OooO00o(this.OooO0O0, this.OooO0OO, this.OooO0Oo, null, 3);
    }
}
