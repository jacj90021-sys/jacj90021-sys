package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pa0 extends x7 {
    public final HashMap OooOO0O;

    public pa0() {
        super(qa0.OooO00o, yi.OooO00o);
        this.OooOO0O = new HashMap();
    }

    @Override // com.cmaster.cloner.x7
    public final boolean OooO(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        WeakHashMap weakHashMap = po0.OooO00o;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(iBinder);
        }
        w7 w7Var = (w7) obj;
        if ((w7Var == null ? null : w7Var.OooO00o) == null) {
            return false;
        }
        return super.OooO(iBinder, i, parcel, parcel2, i2);
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        n80 n80Var;
        t43.OooO0Oo(yqVar.OooO0o, true);
        vi viVar = (vi) po0.OooO00o(rq.OooO0O0());
        if (viVar == null || viVar.OooO0Oo == null || (n80Var = (n80) this.OooOO0O.get(viVar.OooO0o0)) == null) {
            return;
        }
        n80Var.OooO00o(yqVar);
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        String strOooO00o = u7.OooO00o(new byte[]{117, -107, -39, -85, -86, 1, 120, -52}, new byte[]{6, -16, -83, -33, -61, 111, 31, -65});
        vf1 vf1Var = new vf1();
        HashMap map = this.OooOO0O;
        map.put(strOooO00o, vf1Var);
        map.put(u7.OooO00o(new byte[]{21, 89, -52, -23, 33, -110, 62, 19, 2}, new byte[]{113, 54, -69, -121, 77, -3, 95, 119}), new rs());
        map.put(u7.OooO00o(new byte[]{101, 120, 11, -126, -58, 115, 91, 93, 105, 126, 2, -126, -60, 114, 81, 91, 103, 116, 18, -33}, new byte[]{6, 23, 102, -84, -89, 29, 63, 47}), new ie1());
    }

    @Override // com.cmaster.cloner.x7
    public final z7 OooO0o() {
        return new oa0(this, wq.OooO00o);
    }

    @Override // com.cmaster.cloner.x7
    public final Pair OooO0o0(Class cls) {
        return a8.OooO00o(this.OooO0Oo, true);
    }

    @Override // com.cmaster.cloner.x7
    public final IInterface OooO0oO(IBinder iBinder) {
        Object obj;
        WeakHashMap weakHashMap = po0.OooO00o;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(iBinder);
        }
        w7 w7Var = (w7) obj;
        if (w7Var == null) {
            return null;
        }
        return w7Var.OooO00o;
    }
}
