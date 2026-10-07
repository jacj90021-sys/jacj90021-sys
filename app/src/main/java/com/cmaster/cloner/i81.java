package com.cmaster.cloner;

import android.os.ConditionVariable;
import com.bumptech.matrix.business.BusinessDatabase;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i81 {
    public static final i81 OooO0oo = new i81();
    public final e81 OooO00o;
    public c81 OooO0OO;
    public int OooO0o;
    public final ye1 OooO0o0;
    public final Random OooO0oO;
    public final eb1 OooO0O0 = new eb1();
    public final ConditionVariable OooO0Oo = new ConditionVariable();

    public i81() {
        ye1 ye1Var = new ye1(1);
        this.OooO0o0 = ye1Var;
        this.OooO00o = ((BusinessDatabase) BusinessDatabase.OooOO0O.OooO0O0()).OooOOo();
        this.OooO0oO = new Random();
        ye1Var.execute(new o00OOO00(this, 29));
    }

    public final void OooO00o(c81 c81Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = c81Var.OooO0o;
        if (j > jCurrentTimeMillis) {
            long j2 = j - jCurrentTimeMillis;
            long j3 = c81Var.OooO0oO;
            if (j3 > j2) {
                c81Var.OooO0o = jCurrentTimeMillis;
                c81Var.OooO0oO = j3 - j2;
            } else {
                c81Var.OooO0o = j - j3;
                c81Var.OooO0oO = 0L;
            }
        }
        if (c81Var.OooO0oo < System.currentTimeMillis()) {
            c81Var.OooO0o = System.currentTimeMillis() - 1;
            c81Var.OooO0oo = System.currentTimeMillis();
        }
        c81Var.OooO0oo += c81Var.OooO0oO;
        c81Var.OooO0Oo = null;
        c81Var.OooO0oO = 0L;
        c81Var.OooO0OO -= c81Var.OooO0O0;
        c81Var.OooO0O0 = 0;
        this.OooO00o.OooOOo0(c81Var);
        ye1 ye1Var = this.OooO0o0;
        ye1Var.getClass();
        if (((Executor) ye1.OooO0oo.get()) != ye1Var) {
            qa.OooO0o(sn2.OooO00o("Z+hTclJS+3dj8wBjClX9In7yUg==\n", "Cp0gBnIwnlc=\n"));
        } else {
            this.OooO0OO = c81Var;
            this.OooO0O0.OooOO0(c81Var);
        }
    }

    public final boolean OooO0O0() {
        this.OooO0Oo.block();
        c81 c81Var = this.OooO0OO;
        if (c81Var == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > c81Var.OooO0o && jCurrentTimeMillis < c81Var.OooO0oo;
    }

    public final List OooO0OO(c81 c81Var) {
        String str = c81Var.OooO0Oo;
        e81 e81Var = this.OooO00o;
        e81Var.getClass();
        sn2.OooO00o("KJyTToZjTKVbn41EiBcP4BK3rCuyXwn9HvmrZK5SAq9G+eArqkUI6gn5vXLlVQnoEreAf6xaCa86\nipwriX4hxi/57jv1B1y/Ww==\n", "e9nfC8U3bI8=\n");
        tb1 tb1Var = (tb1) e81Var.OooO0o0;
        List list = (List) aq2.OooO0O0(tb1Var, true, false, new OooOOO0(str, 4));
        if (list.size() > 1) {
            OooO00o(c81Var);
            OooO0o0(list);
            return list;
        }
        sn2.OooO00o("cg/+Ed9w8EQBDOAb0QSzAUgkwXTzVrQLU2rQLbxGtQlIJO0g9Um1TmAZ8XTQbZ0ndWqDZKwU4F4B\n", "IUqyVJwk0G4=\n");
        int i = 2;
        List list2 = (List) aq2.OooO0O0(tb1Var, true, false, new d81(2));
        ArrayList arrayList = new ArrayList();
        int i2 = c81Var.OooO0O0;
        int size = list2.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            c81 c81Var2 = (c81) list2.get(size);
            if (c81Var2.OooO00o != 0) {
                c81 c81VarOooO00o = c81Var2.OooO00o();
                i2 -= c81VarOooO00o.OooO0OO;
                c81VarOooO00o.OooO0Oo = c81Var.OooO0Oo;
                if (i2 < 0) {
                    c81VarOooO00o.OooO0OO = -i2;
                    c81VarOooO00o.OooOO0O = 1;
                    arrayList.add(c81VarOooO00o);
                    i2 = 0;
                    break;
                }
                c81VarOooO00o.OooOO0O = 1;
                c81VarOooO00o.OooO0OO = 0;
                arrayList.add(c81VarOooO00o);
                if (i2 == 0) {
                    break;
                }
            }
            size--;
        }
        if (i2 > 0) {
            qa.OooO0o(sn2.OooO00o("5y187LC0af3uKg==\n", "iUIIzNXaBog=\n"));
            return null;
        }
        aq2.OooO0O0(tb1Var, false, true, new b80(e81Var, arrayList, i));
        OooO00o(c81Var);
        OooO0o0(arrayList);
        return arrayList;
    }

    public final void OooO0Oo(int i, String str) {
        int iNextInt;
        int i2 = i % zzbcj.zzq.zzf;
        int i3 = i / zzbcj.zzq.zzf;
        if (i2 >= i3 && (iNextInt = this.OooO0oO.nextInt(i2 - i3) + i3) > 0) {
            new g81(this, iNextInt, str).OooOOo0(this.OooO0o0);
        }
    }

    public final void OooO0o0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c81 c81Var = (c81) it.next();
            if (c81Var.OooO0OO == 0) {
                arrayList.add(c81Var);
            }
        }
        e81 e81Var = this.OooO00o;
        aq2.OooO0O0((tb1) e81Var.OooO0o0, false, true, new OooOOO0(e81Var, arrayList, 2));
    }
}
