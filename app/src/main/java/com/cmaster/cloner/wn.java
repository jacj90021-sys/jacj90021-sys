package com.cmaster.cloner;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wn {
    public final Class OooO00o;
    public final List OooO0O0;
    public final qa1 OooO0OO;
    public final r31 OooO0Oo;
    public final String OooO0o0;

    public wn(Class cls, Class cls2, Class cls3, List list, qa1 qa1Var, r31 r31Var) {
        this.OooO00o = cls;
        this.OooO0O0 = list;
        this.OooO0OO = qa1Var;
        this.OooO0Oo = r31Var;
        this.OooO0o0 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final fa1 OooO00o(int i, int i2, oOo000Oo ooo000oo, nn nnVar, xz0 xz0Var) {
        fa1 fa1VarOooO0O0;
        no1 no1Var;
        int iOooO0o;
        la1 la1VarOooO00o;
        fa1 fa1Var;
        boolean z;
        Object gnVar;
        r31 r31Var = this.OooO0Oo;
        Object objOooO0oo = r31Var.OooO0oo();
        zx2.OooO0OO(objOooO0oo, "Argument must not be null");
        List list = (List) objOooO0oo;
        try {
            fa1 fa1VarOooO0O02 = OooO0O0(nnVar, i, i2, xz0Var, list);
            r31Var.OooO0O0(list);
            vn vnVar = (vn) ooo000oo.OooO0o0;
            int i3 = ooo000oo.OooO0Oo;
            tn tnVar = vnVar.OooO0Oo;
            Class<?> cls = fa1VarOooO0O02.get().getClass();
            if (i3 != 4) {
                no1 no1VarOooO0o0 = tnVar.OooO0o0(cls);
                no1Var = no1VarOooO0o0;
                fa1VarOooO0O0 = no1VarOooO0o0.OooO0O0(vnVar.OooOO0O, fa1VarOooO0O02, vnVar.OooOOOO, vnVar.OooOOOo);
            } else {
                fa1VarOooO0O0 = fa1VarOooO0O02;
                no1Var = null;
            }
            if (!fa1VarOooO0O02.equals(fa1VarOooO0O0)) {
                fa1VarOooO0O02.OooO0O0();
            }
            if (tnVar.OooO0OO.OooO00o().OooO0Oo.OooO00o(fa1VarOooO0O0.OooO0o0()) != null) {
                la1VarOooO00o = tnVar.OooO0OO.OooO00o().OooO0Oo.OooO00o(fa1VarOooO0O0.OooO0o0());
                if (la1VarOooO00o == null) {
                    throw new x81(fa1VarOooO0O0.OooO0o0());
                }
                iOooO0o = la1VarOooO00o.OooO0o(vnVar.OooOOo);
            } else {
                iOooO0o = 3;
                la1VarOooO00o = null;
            }
            zk0 zk0Var = vnVar.OooOo;
            ArrayList arrayListOooO0O0 = tnVar.OooO0O0();
            int size = arrayListOooO0O0.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    fa1Var = null;
                    z = false;
                    break;
                }
                fa1Var = null;
                if (((hu0) arrayListOooO0O0.get(i4)).OooO00o.equals(zk0Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (vnVar.OooOOo0.OooO0Oo(i3, iOooO0o, !z)) {
                if (la1VarOooO00o == null) {
                    throw new x81(fa1VarOooO0O0.get().getClass());
                }
                int iOooOOoo = rj.OooOOoo(iOooO0o);
                if (iOooOOoo == 0) {
                    gnVar = new gn(vnVar.OooOo, vnVar.OooOO0o);
                } else {
                    if (iOooOOoo != 1) {
                        ra.OooOOO("Unknown strategy: ".concat(iOooO0o != 1 ? iOooO0o != 2 ? iOooO0o != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return fa1Var;
                    }
                    gnVar = new ha1(tnVar.OooO0OO.OooO00o, vnVar.OooOo, vnVar.OooOO0o, vnVar.OooOOOO, vnVar.OooOOOo, no1Var, cls, vnVar.OooOOo);
                }
                zo0 zo0Var = (zo0) zo0.OooO0oo.OooO0oo();
                zo0Var.OooO0oO = false;
                zo0Var.OooO0o = true;
                zo0Var.OooO0o0 = fa1VarOooO0O0;
                a02 a02Var = vnVar.OooO;
                a02Var.OooO0o0 = gnVar;
                a02Var.OooO0o = la1VarOooO00o;
                a02Var.OooO0oO = zo0Var;
                fa1VarOooO0O0 = zo0Var;
            }
            return this.OooO0OO.OooOO0(fa1VarOooO0O0, xz0Var);
        } catch (Throwable th) {
            r31Var.OooO0O0(list);
            throw th;
        }
    }

    public final fa1 OooO0O0(nn nnVar, int i, int i2, xz0 xz0Var, List list) throws n50 {
        List list2 = this.OooO0O0;
        int size = list2.size();
        fa1 fa1VarOooO00o = null;
        for (int i3 = 0; i3 < size; i3++) {
            ia1 ia1Var = (ia1) list2.get(i3);
            try {
                if (ia1Var.OooO0O0(nnVar.OooO(), xz0Var)) {
                    fa1VarOooO00o = ia1Var.OooO00o(nnVar.OooO(), i, i2, xz0Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + ia1Var, e);
                }
                list.add(e);
            }
            if (fa1VarOooO00o != null) {
                break;
            }
        }
        if (fa1VarOooO00o != null) {
            return fa1VarOooO00o;
        }
        throw new n50(this.OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.OooO00o + ", decoders=" + this.OooO0O0 + ", transcoder=" + this.OooO0OO + '}';
    }
}
