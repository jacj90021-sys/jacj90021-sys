package com.cmaster.cloner;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n20 extends yt1 {
    public static final m20 OooOO0O = new m20(0);
    public final boolean OooO0oo;
    public final HashMap OooO0o0 = new HashMap();
    public final HashMap OooO0o = new HashMap();
    public final HashMap OooO0oO = new HashMap();
    public boolean OooO = false;
    public boolean OooOO0 = false;

    public n20(boolean z) {
        this.OooO0oo = z;
    }

    @Override // com.cmaster.cloner.yt1
    public final void OooO0O0() {
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.OooO = true;
    }

    public final void OooO0OO(o10 o10Var) {
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + o10Var);
        }
        OooO0o0(o10Var.OooO0oo);
    }

    public final void OooO0o0(String str) {
        HashMap map = this.OooO0o;
        n20 n20Var = (n20) map.get(str);
        if (n20Var != null) {
            n20Var.OooO0O0();
            map.remove(str);
        }
        HashMap map2 = this.OooO0oO;
        du1 du1Var = (du1) map2.get(str);
        if (du1Var != null) {
            du1Var.OooO00o();
            map2.remove(str);
        }
    }

    public final void OooO0oO(o10 o10Var) {
        if (this.OooOO0) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.OooO0o0.remove(o10Var.OooO0oo) == null || !k20.Oooo000(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + o10Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n20.class == obj.getClass()) {
            n20 n20Var = (n20) obj;
            if (this.OooO0o0.equals(n20Var.OooO0o0) && this.OooO0o.equals(n20Var.OooO0o) && this.OooO0oO.equals(n20Var.OooO0oO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0oO.hashCode() + ((this.OooO0o.hashCode() + (this.OooO0o0.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.OooO0o0.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.OooO0o.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.OooO0oO.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
