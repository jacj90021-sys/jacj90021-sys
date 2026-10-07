package com.cmaster.cloner;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dd1 implements gd1 {
    public final o0O000O OooO00o;
    public boolean OooO0O0;
    public Bundle OooO0OO;
    public final cl1 OooO0Oo;

    public dd1(o0O000O o0o000o, eu1 eu1Var) {
        o0o000o.getClass();
        this.OooO00o = o0o000o;
        this.OooO0Oo = new cl1(new wf(eu1Var, 4));
    }

    @Override // com.cmaster.cloner.gd1
    public final Bundle OooO00o() {
        Bundle bundleOooO00o = co2.OooO00o((k21[]) Arrays.copyOf(new k21[0], 0));
        Bundle bundle = this.OooO0OO;
        if (bundle != null) {
            bundleOooO00o.putAll(bundle);
        }
        for (Map.Entry entry : ((ed1) this.OooO0Oo.getValue()).OooO0o0.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleOooO00o2 = ((c20) ((bd1) entry.getValue()).OooO00o.OooO0oo).OooO00o();
            if (!bundleOooO00o2.isEmpty()) {
                str.getClass();
                bundleOooO00o.putBundle(str, bundleOooO00o2);
            }
        }
        this.OooO0O0 = false;
        return bundleOooO00o;
    }

    public final void OooO0O0() {
        if (this.OooO0O0) {
            return;
        }
        Bundle bundleOooO0o = this.OooO00o.OooO0o("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleOooO00o = co2.OooO00o((k21[]) Arrays.copyOf(new k21[0], 0));
        Bundle bundle = this.OooO0OO;
        if (bundle != null) {
            bundleOooO00o.putAll(bundle);
        }
        if (bundleOooO0o != null) {
            bundleOooO00o.putAll(bundleOooO0o);
        }
        this.OooO0OO = bundleOooO00o;
        this.OooO0O0 = true;
    }
}
