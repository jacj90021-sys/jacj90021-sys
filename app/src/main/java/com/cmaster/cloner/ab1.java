package com.cmaster.cloner;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ab1 extends al2 {
    public final Set OooO00o;
    public final Set OooO0O0;
    public final Set OooO0OO;
    public final Set OooO0Oo;
    public final al2 OooO0o0;

    public ab1(vf vfVar, al2 al2Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<pp> set = vfVar.OooO0O0;
        Set set2 = vfVar.OooO0o0;
        for (pp ppVar : set) {
            int i = ppVar.OooO0OO;
            int i2 = ppVar.OooO0O0;
            boolean z = i == 0;
            Class cls = ppVar.OooO00o;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i == 2) {
                hashSet3.add(cls);
            } else if (i2 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(u51.class);
        }
        this.OooO00o = Collections.unmodifiableSet(hashSet);
        this.OooO0O0 = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.OooO0OO = Collections.unmodifiableSet(hashSet4);
        this.OooO0Oo = Collections.unmodifiableSet(hashSet5);
        this.OooO0o0 = al2Var;
    }

    @Override // com.cmaster.cloner.al2
    public final Object OooO00o(Class cls) {
        if (!this.OooO00o.contains(cls)) {
            qa.OooO0o0(cls, "Attempting to request an undeclared dependency ", ".");
            return null;
        }
        Object objOooO00o = this.OooO0o0.OooO00o(cls);
        if (!cls.equals(u51.class)) {
            return objOooO00o;
        }
        return new za1();
    }

    @Override // com.cmaster.cloner.al2
    public final r51 OooO0O0(Class cls) {
        if (this.OooO0O0.contains(cls)) {
            return this.OooO0o0.OooO0O0(cls);
        }
        qa.OooO0o0(cls, "Attempting to request an undeclared dependency Provider<", ">.");
        return null;
    }

    @Override // com.cmaster.cloner.al2
    public final Set OooO0OO(Class cls) {
        if (this.OooO0OO.contains(cls)) {
            return this.OooO0o0.OooO0OO(cls);
        }
        qa.OooO0o0(cls, "Attempting to request an undeclared dependency Set<", ">.");
        return null;
    }

    @Override // com.cmaster.cloner.al2
    public final r51 OooO0Oo(Class cls) {
        if (this.OooO0Oo.contains(cls)) {
            return this.OooO0o0.OooO0Oo(cls);
        }
        qa.OooO0o0(cls, "Attempting to request an undeclared dependency Provider<Set<", ">>.");
        return null;
    }
}
