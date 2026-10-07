package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l5 implements Parcelable {
    public static final Parcelable.Creator<l5> CREATOR = new o0O0000O(5);
    public final String OooO;
    public final int[] OooO0Oo;
    public final int[] OooO0o;
    public final ArrayList OooO0o0;
    public final int[] OooO0oO;
    public final int OooO0oo;
    public final int OooOO0;
    public final int OooOO0O;
    public final CharSequence OooOO0o;
    public final CharSequence OooOOO;
    public final int OooOOO0;
    public final ArrayList OooOOOO;
    public final ArrayList OooOOOo;
    public final boolean OooOOo0;

    public l5(k5 k5Var) {
        int size = k5Var.OooO00o.size();
        this.OooO0Oo = new int[size * 6];
        if (!k5Var.OooO0oO) {
            qa.OooO0o("Not on back stack");
            throw null;
        }
        this.OooO0o0 = new ArrayList(size);
        this.OooO0o = new int[size];
        this.OooO0oO = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v20 v20Var = (v20) k5Var.OooO00o.get(i2);
            int i3 = i + 1;
            this.OooO0Oo[i] = v20Var.OooO00o;
            ArrayList arrayList = this.OooO0o0;
            o10 o10Var = v20Var.OooO0O0;
            arrayList.add(o10Var != null ? o10Var.OooO0oo : null);
            int[] iArr = this.OooO0Oo;
            iArr[i3] = v20Var.OooO0OO ? 1 : 0;
            iArr[i + 2] = v20Var.OooO0Oo;
            iArr[i + 3] = v20Var.OooO0o0;
            int i4 = i + 5;
            iArr[i + 4] = v20Var.OooO0o;
            i += 6;
            iArr[i4] = v20Var.OooO0oO;
            this.OooO0o[i2] = v20Var.OooO0oo.ordinal();
            this.OooO0oO[i2] = v20Var.OooO.ordinal();
        }
        this.OooO0oo = k5Var.OooO0o;
        this.OooO = k5Var.OooO;
        this.OooOO0 = k5Var.OooOOoo;
        this.OooOO0O = k5Var.OooOO0;
        this.OooOO0o = k5Var.OooOO0O;
        this.OooOOO0 = k5Var.OooOO0o;
        this.OooOOO = k5Var.OooOOO0;
        this.OooOOOO = k5Var.OooOOO;
        this.OooOOOo = k5Var.OooOOOO;
        this.OooOOo0 = k5Var.OooOOOo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.OooO0Oo);
        parcel.writeStringList(this.OooO0o0);
        parcel.writeIntArray(this.OooO0o);
        parcel.writeIntArray(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeString(this.OooO);
        parcel.writeInt(this.OooOO0);
        parcel.writeInt(this.OooOO0O);
        TextUtils.writeToParcel(this.OooOO0o, parcel, 0);
        parcel.writeInt(this.OooOOO0);
        TextUtils.writeToParcel(this.OooOOO, parcel, 0);
        parcel.writeStringList(this.OooOOOO);
        parcel.writeStringList(this.OooOOOo);
        parcel.writeInt(this.OooOOo0 ? 1 : 0);
    }

    public l5(Parcel parcel) {
        this.OooO0Oo = parcel.createIntArray();
        this.OooO0o0 = parcel.createStringArrayList();
        this.OooO0o = parcel.createIntArray();
        this.OooO0oO = parcel.createIntArray();
        this.OooO0oo = parcel.readInt();
        this.OooO = parcel.readString();
        this.OooOO0 = parcel.readInt();
        this.OooOO0O = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.OooOO0o = (CharSequence) creator.createFromParcel(parcel);
        this.OooOOO0 = parcel.readInt();
        this.OooOOO = (CharSequence) creator.createFromParcel(parcel);
        this.OooOOOO = parcel.createStringArrayList();
        this.OooOOOo = parcel.createStringArrayList();
        this.OooOOo0 = parcel.readInt() != 0;
    }
}
