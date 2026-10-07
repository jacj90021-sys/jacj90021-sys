package com.bumptech.matrix.business;

import com.cmaster.cloner.e81;
import com.cmaster.cloner.mj0;
import com.cmaster.cloner.n9;
import com.cmaster.cloner.pu;
import com.cmaster.cloner.sn2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class BusinessDatabase_Impl extends BusinessDatabase {
    public volatile e81 OooOO0o;

    @Override // com.cmaster.cloner.tb1
    public final mj0 OooO0Oo() {
        return new mj0(this, new HashMap(0), new HashMap(0), sn2.OooO00o("B3p+iuk=\n", "ZBUX5JqzpZs=\n"));
    }

    @Override // com.cmaster.cloner.tb1
    public final pu OooO0o0() {
        return new n9(this, sn2.OooO00o("WRnECMFftFFdGpQMxFmwUVgdw17BA7BSUh6VUpcP5Qc=\n", "ayulaqU7gzc=\n"), sn2.OooO00o("Fj6ypp6ATHNCarChl4IZcxFutqaZ0RxzTz3h9Z3RTng=\n", "d1iAlK+0fUo=\n"));
    }

    @Override // com.cmaster.cloner.tb1
    public final List OooO0oO(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // com.cmaster.cloner.tb1
    public final Set OooOO0() {
        return new HashSet();
    }

    @Override // com.cmaster.cloner.tb1
    public final Map OooOO0O() {
        HashMap map = new HashMap();
        map.put(e81.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.bumptech.matrix.business.BusinessDatabase
    public final e81 OooOOo() {
        e81 e81Var;
        if (this.OooOO0o != null) {
            return this.OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.OooOO0o == null) {
                    this.OooOO0o = new e81(this);
                }
                e81Var = this.OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e81Var;
    }
}
