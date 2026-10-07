package com.cmaster.cloner;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p4 extends o0O000O {
    public int OooO;
    public final WeakHashMap OooO0oo;

    public p4() {
        super(9);
        this.OooO0oo = new WeakHashMap();
    }

    @Override // com.cmaster.cloner.o0O000O
    public final int OooOoo(int i, Object obj) {
        WeakHashMap weakHashMap = this.OooO0oo;
        Integer numValueOf = (Integer) weakHashMap.get(obj);
        int iOooOoo = super.OooOoo(i, obj);
        if (numValueOf == null) {
            int i2 = this.OooO + 1;
            this.OooO = i2;
            numValueOf = Integer.valueOf(((iOooOoo + 1) * 10000) + i2);
            weakHashMap.put(obj, numValueOf);
        }
        return numValueOf.intValue();
    }

    @Override // com.cmaster.cloner.o0O000O
    public final c2 Oooo0O0(int i) {
        return super.Oooo0O0((i / 10000) - 1);
    }
}
