package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class av0 extends c41 {
    public static final Parcelable.Creator<av0> CREATOR = new o0O0000O(24);
    public HashSet OooO0Oo;

    public av0(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.OooO0Oo = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.OooO0Oo, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0Oo.size());
        HashSet hashSet = this.OooO0Oo;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public av0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
