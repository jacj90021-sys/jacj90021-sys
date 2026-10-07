package com.cmaster.cloner;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO implements gd1 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public oOO(o0O000O o0o000o) {
        this.OooO00o = 1;
        this.OooO0O0 = new LinkedHashSet();
        o0o000o.o000oOoO("androidx.savedstate.Restarter", this);
    }

    @Override // com.cmaster.cloner.gd1
    public final Bundle OooO00o() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((oOOO00) obj).OooOO0o().getClass();
                return bundle;
            default:
                Bundle bundleOooO00o = co2.OooO00o((k21[]) Arrays.copyOf(new k21[0], 0));
                List listOooO0oo = se.OooO0oo((LinkedHashSet) obj);
                bundleOooO00o.putStringArrayList("classes_to_restore", listOooO0oo instanceof ArrayList ? (ArrayList) listOooO0oo : new ArrayList<>(listOooO0oo));
                return bundleOooO00o;
        }
    }

    public oOO(oOOO00 oooo00) {
        this.OooO00o = 0;
        this.OooO0O0 = oooo00;
    }
}
