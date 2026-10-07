package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yn0 {
    public final r31 OooO00o;
    public final List OooO0O0;
    public final String OooO0OO;

    public yn0(Class cls, Class cls2, Class cls3, List list, r31 r31Var) {
        this.OooO00o = r31Var;
        if (list.isEmpty()) {
            ra.OooOOO("Must not be empty.");
            throw null;
        }
        this.OooO0O0 = list;
        this.OooO0OO = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final fa1 OooO00o(int i, int i2, oOo000Oo ooo000oo, nn nnVar, xz0 xz0Var) {
        r31 r31Var = this.OooO00o;
        Object objOooO0oo = r31Var.OooO0oo();
        zx2.OooO0OO(objOooO0oo, "Argument must not be null");
        List list = (List) objOooO0oo;
        try {
            List list2 = this.OooO0O0;
            int size = list2.size();
            fa1 fa1VarOooO00o = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    fa1VarOooO00o = ((wn) list2.get(i3)).OooO00o(i, i2, ooo000oo, nnVar, xz0Var);
                } catch (n50 e) {
                    list.add(e);
                }
                if (fa1VarOooO00o != null) {
                    break;
                }
            }
            if (fa1VarOooO00o != null) {
                return fa1VarOooO00o;
            }
            throw new n50(this.OooO0OO, new ArrayList(list));
        } finally {
            r31Var.OooO0O0(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.OooO0O0.toArray()) + '}';
    }
}
