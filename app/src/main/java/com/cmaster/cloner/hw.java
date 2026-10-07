package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hw {
    public int OooO00o;
    public int OooO0O0;
    public final Object OooO0OO;
    public final Object OooO0Oo;

    public hw(iw iwVar, a02 a02Var) {
        this.OooO0OO = new SparseArray();
        this.OooO0Oo = iwVar;
        TypedArray typedArray = (TypedArray) a02Var.OooO0o;
        this.OooO00o = typedArray.getResourceId(28, 0);
        this.OooO0O0 = typedArray.getResourceId(53, 0);
    }

    public aa OooO00o() throws hm2 {
        String str;
        String str2;
        eh0 eh0Var = (eh0) this.OooO0Oo;
        int i = eh0Var.OooO0o0;
        boolean z = i == 8;
        hx2 hx2Var = (hx2) this.OooO0OO;
        ((s52) hx2Var.OooO0oO).OooO0O0.edit().putBoolean("is_pub_misconfigured", z).commit();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.OooO00o = 3;
                break;
            case 4:
                this.OooO00o = 2;
                break;
            case 5:
                this.OooO00o = 1;
                break;
            case 6:
                throw new hm2(1, "Invalid response from server: ".concat(String.valueOf(eh0Var.OooO0Oo)));
            case 7:
                throw new hm2(3, "Publisher misconfiguration: ".concat(String.valueOf(eh0Var.OooO0Oo)));
            default:
                throw new hm2(1, "Invalid response from server.");
        }
        int i3 = eh0Var.OooO0o;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.OooO0O0 = 3;
        } else {
            if (i4 != 2) {
                throw new hm2(1, "Invalid response from server.");
            }
            this.OooO0O0 = 2;
        }
        String str3 = eh0Var.OooO0O0;
        o92 o92Var = str3 == null ? null : new o92(eh0Var.OooO0OO, str3);
        ((s52) hx2Var.OooO0oO).OooO0O0.edit().putStringSet("stored_info", new HashSet((List) eh0Var.OooO0oO)).commit();
        for (mc2 mc2Var : (List) eh0Var.OooO0oo) {
            int i5 = mc2Var.OooO0O0;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                str = null;
            } else {
                if (i6 != 1) {
                    str2 = i6 == 2 ? "clear" : "write";
                    str = null;
                }
                str = str2;
            }
            if (str != null) {
                qh2 qh2Var = (qh2) hx2Var.OooO0o0;
                String str4 = mc2Var.OooO00o;
                ge2[] ge2VarArr = {(ho1) hx2Var.OooO0o};
                qh2Var.getClass();
                qh2Var.OooO00o.execute(new l1(str, str4, ge2VarArr, 19, false));
            }
        }
        return new aa(this.OooO00o, this.OooO0O0, o92Var);
    }

    public hw(hx2 hx2Var, eh0 eh0Var) {
        this.OooO00o = 0;
        this.OooO0O0 = 1;
        this.OooO0OO = hx2Var;
        this.OooO0Oo = eh0Var;
    }
}
