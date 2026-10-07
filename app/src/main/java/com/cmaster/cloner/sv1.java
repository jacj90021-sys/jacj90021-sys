package com.cmaster.cloner;

import android.accounts.Account;
import android.os.Parcel;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class sv1 {
    public final String OooO;
    public final int OooO00o;
    public String OooO0O0;
    public final String OooO0OO;
    public String OooO0Oo;
    public final HashMap OooO0o;
    public String OooO0o0;
    public long OooO0oO;
    public final HashMap OooO0oo;
    public final HashMap OooOO0;

    public sv1(Parcel parcel) {
        this.OooO0o = new HashMap();
        this.OooO0oo = new HashMap();
        this.OooOO0 = new HashMap();
        this.OooO00o = parcel.readInt();
        this.OooO0O0 = parcel.readString();
        this.OooO0OO = parcel.readString();
        this.OooO0Oo = parcel.readString();
        this.OooO0o0 = parcel.readString();
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO0o.put(parcel.readString(), parcel.readString());
        }
        this.OooO0oO = parcel.readLong();
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.OooO0oo.put(parcel.readString(), parcel.readString());
        }
        this.OooO = parcel.readString();
        int i5 = parcel.readInt();
        for (int i6 = 0; i6 < i5; i6++) {
            this.OooOO0.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
        }
    }

    public sv1(int i, Account account) {
        this.OooO0o = new HashMap();
        this.OooO0oo = new HashMap();
        this.OooOO0 = new HashMap();
        this.OooO00o = i;
        this.OooO0O0 = account.name;
        this.OooO0OO = account.type;
        this.OooO = null;
    }
}
