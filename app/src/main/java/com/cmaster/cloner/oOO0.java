package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO0 extends o00000OO {
    public static final Parcelable.Creator<oOO0> CREATOR = new b41(20);
    public final List OooO0Oo;
    public final String OooO0o;
    public final boolean OooO0o0;
    public final String OooO0oO;

    public oOO0(ArrayList arrayList, boolean z, String str, String str2) {
        by2.OooO0oo(arrayList);
        this.OooO0Oo = arrayList;
        this.OooO0o0 = z;
        this.OooO0o = str;
        this.OooO0oO = str2;
    }

    public static oOO0 OooO00o(List list, boolean z) {
        TreeSet treeSet = new TreeSet(p12.OooO0o0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((uz0) it.next()).OooO0OO());
        }
        return new oOO0(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof oOO0)) {
            return false;
        }
        oOO0 ooo0 = (oOO0) obj;
        return this.OooO0o0 == ooo0.OooO0o0 && uw2.OooO00o(this.OooO0Oo, ooo0.OooO0Oo) && uw2.OooO00o(this.OooO0o, ooo0.OooO0o) && uw2.OooO00o(this.OooO0oO, ooo0.OooO0oO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.OooO0o0), this.OooO0Oo, this.OooO0o, this.OooO0oO});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO(parcel, this.OooO0Oo, 1);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0o0(parcel, 4, this.OooO0oO);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
