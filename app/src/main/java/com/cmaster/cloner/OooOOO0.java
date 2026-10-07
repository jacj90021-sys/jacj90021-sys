package com.cmaster.cloner;

import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements a40 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ OooOOO0(e81 e81Var, Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) throws Exception {
        rc1 rc1VarOooOOo0;
        int i = this.OooO0Oo;
        vq1 vq1Var = vq1.OooO00o;
        int i2 = 1;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                return obj == ((o0OOO0o) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                yu1 yu1Var = ((h80) obj2).OooO0o;
                Intent intent = (Intent) obj;
                if (TextUtils.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    yu1Var.OooO.execute(new xu1(yu1Var, i2));
                } else if (TextUtils.equals(intent.getAction(), "android.intent.action.PACKAGE_REPLACED") && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    yu1Var.OooO.execute(new xu1(yu1Var, i2));
                } else if (TextUtils.equals(intent.getAction(), "android.intent.action.PACKAGE_REMOVED") && intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false)) {
                    yu1Var.OooO.execute(new xu1(yu1Var, i2));
                }
                return vq1Var;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                mc1 mc1Var = (mc1) obj;
                mc1Var.getClass();
                rc1VarOooOOo0 = mc1Var.OooOOo0(sn2.OooO00o("v7eeTTsY6iapvZ8oDz6lCZWBsig4FY8yvtKyVwY5qkDG0u0=\n", "+/LSCG9dymA=\n"));
                try {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        if (obj3 != null) {
                            rc1VarOooOOo0.OooO00o(1, ((c81) obj3).OooO00o);
                            rc1VarOooOOo0.OooOOOo();
                            rc1VarOooOOo0.reset();
                            rc1VarOooOOo0 = mc1Var.OooOOo0("SELECT changes()");
                            try {
                                rc1VarOooOOo0.OooOOOo();
                                rc1VarOooOOo0.getLong(0);
                                in2.OooO00o(rc1VarOooOOo0, null);
                            } finally {
                            }
                        }
                    }
                    in2.OooO00o(rc1VarOooOOo0, null);
                    return null;
                } finally {
                }
            case 3:
                c81 c81Var = (c81) obj2;
                mc1 mc1Var2 = (mc1) obj;
                mc1Var2.getClass();
                rc1VarOooOOo0 = mc1Var2.OooOOo0(sn2.OooO00o("I1lmp89UEf84N2enzUxw8y83fKzJTxHQCXhcjO5gEZgKSFyG/SxR0wV+W4KxYEPVB3ZcjPRuVtBG\nd0GN9mVf0EZ3Vo30bm7EE2dQgrFgU9UNflu96Wlc1Qo7VYflcFjCD3NqlvRtVNBGd1CM+V9F2Qdy\nVc79c17FGHRQgrFgVMgeZVSCsWBCxAtjQJH9KRHmK1tgp84gGY9GKBndsT8dj0YoGd2xPx2PRigZ\n3bQ=\n", "ahc14p0AMbA=\n"));
                try {
                    v03.OooOOOo(rc1VarOooOOo0, c81Var);
                    rc1VarOooOOo0.OooOOOo();
                    in2.OooO00o(rc1VarOooOOo0, null);
                    return null;
                } finally {
                }
            case 4:
                String str = (String) obj2;
                rc1 rc1VarOooOOo02 = ((mc1) obj).OooOOo0(sn2.OooO00o("v22nCSTRAG/MbrkDKqVDKoVGmGwQ7UU3iQifIwzgTmXRCNRsCPdEIJ4IiTVH50UihUa0OA7oRWWt\ne6hsK8xtDLgI2nxXtRB1zA==\n", "7CjrTGeFIEU=\n"));
                try {
                    if (str == null) {
                        rc1VarOooOOo02.OooO0O0(1);
                    } else {
                        rc1VarOooOOo02.OooO0oO(1, str);
                    }
                    int iOooO0O0 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("Lgy7\n", "cWXfYEHizf0=\n"));
                    int iOooO0O02 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("8iAsjw==\n", "kU9F4dPVjmk=\n"));
                    int iOooO0O03 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("8qHTwg/iSjnn\n", "gMS+o2aMI1c=\n"));
                    int iOooO0O04 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("f5kvPiU=\n", "C/ZEW0vOKtU=\n"));
                    int iOooO0O05 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("9HQRAUqqprLy\n", "lxt4bxXe38I=\n"));
                    int iOooO0O06 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("zdJjitJGuYjC0g==\n", "r7cE47wZzeE=\n"));
                    int iOooO0O07 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("VtO5cJI5y0dHwqR8\n", "M6vJGeBcrxg=\n"));
                    int iOooO0O08 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("2ZvuQk6c2Q8=\n", "vPWKHTr1tGo=\n"));
                    int iOooO0O09 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("2KuwgZjC\n", "q8TF8/un3Jo=\n"));
                    int iOooO0O010 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("tgxTz5Y=\n", "03Qnvff3EkQ=\n"));
                    int iOooO0O011 = p03.OooO0O0(rc1VarOooOOo02, sn2.OooO00o("sJFgRJsT\n", "w+UBMO5gGvE=\n"));
                    ArrayList arrayList2 = new ArrayList();
                    while (rc1VarOooOOo02.OooOOOo()) {
                        c81 c81Var2 = new c81();
                        int i4 = iOooO0O05;
                        c81Var2.OooO00o = (int) rc1VarOooOOo02.getLong(iOooO0O0);
                        c81Var2.OooO0O0 = (int) rc1VarOooOOo02.getLong(iOooO0O02);
                        c81Var2.OooO0OO = (int) rc1VarOooOOo02.getLong(iOooO0O03);
                        if (rc1VarOooOOo02.isNull(iOooO0O04)) {
                            c81Var2.OooO0Oo = null;
                        } else {
                            c81Var2.OooO0Oo = rc1VarOooOOo02.OooOO0o(iOooO0O04);
                        }
                        if (rc1VarOooOOo02.isNull(i4)) {
                            c81Var2.OooO0o0 = null;
                        } else {
                            c81Var2.OooO0o0 = rc1VarOooOOo02.OooOO0o(i4);
                        }
                        int i5 = iOooO0O02;
                        int i6 = iOooO0O03;
                        c81Var2.OooO0o = rc1VarOooOOo02.getLong(iOooO0O06);
                        c81Var2.OooO0oO = rc1VarOooOOo02.getLong(iOooO0O07);
                        c81Var2.OooO0oo = rc1VarOooOOo02.getLong(iOooO0O08);
                        if (rc1VarOooOOo02.isNull(iOooO0O09)) {
                            c81Var2.OooO = null;
                        } else {
                            c81Var2.OooO = rc1VarOooOOo02.OooOO0o(iOooO0O09);
                        }
                        if (rc1VarOooOOo02.isNull(iOooO0O010)) {
                            c81Var2.OooOO0 = null;
                        } else {
                            c81Var2.OooOO0 = rc1VarOooOOo02.OooOO0o(iOooO0O010);
                        }
                        c81Var2.OooOO0O = (int) rc1VarOooOOo02.getLong(iOooO0O011);
                        arrayList2.add(c81Var2);
                        iOooO0O02 = i5;
                        iOooO0O03 = i6;
                        iOooO0O05 = i4;
                    }
                    rc1VarOooOOo02.close();
                    return arrayList2;
                } catch (Throwable th) {
                    rc1VarOooOOo02.close();
                    throw th;
                }
            case 5:
                c30 c30Var = (c30) obj;
                c30Var.getClass();
                ((pb1) obj2).OooO0oO = c30Var;
                return vq1Var;
            default:
                on onVar = (on) obj;
                onVar.getClass();
                return ((tb1) obj2).OooO0o(onVar);
        }
    }

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }
}
