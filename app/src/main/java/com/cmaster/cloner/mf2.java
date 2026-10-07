package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mf2 extends cf2 {
    public static final mf2 OooOOO;
    public static final Object[] OooOOO0;
    public final transient int OooO;
    public final transient Object[] OooO0oo;
    public final transient Object[] OooOO0;
    public final transient int OooOO0O;
    public final transient int OooOO0o;

    static {
        Object[] objArr = new Object[0];
        OooOOO0 = objArr;
        OooOOO = new mf2(objArr, 0, objArr, 0, 0);
    }

    public mf2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(1);
        this.OooO0oo = objArr;
        this.OooO = i;
        this.OooOO0 = objArr2;
        this.OooOO0O = i2;
        this.OooOO0o = i3;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO00o(Object[] objArr) {
        Object[] objArr2 = this.OooO0oo;
        int i = this.OooOO0o;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0O0() {
        return this.OooOO0o;
    }

    @Override // com.cmaster.cloner.m32
    public final int OooO0OO() {
        return 0;
    }

    @Override // com.cmaster.cloner.m32
    public final Object[] OooO0Oo() {
        return this.OooO0oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.OooOO0;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = iRotateLeft & this.OooOO0O;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // com.cmaster.cloner.cf2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.OooO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        bf2 if2Var = this.OooO0oO;
        if (if2Var == null) {
            ue2 ue2Var = bf2.OooO0oO;
            int i = this.OooOO0o;
            if2Var = i == 0 ? if2.OooOO0 : new if2(this.OooO0oo, i);
            this.OooO0oO = if2Var;
        }
        return if2Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.OooOO0o;
    }
}
