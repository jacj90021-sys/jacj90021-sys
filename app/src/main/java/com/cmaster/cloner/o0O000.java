package com.cmaster.cloner;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O000 extends ee {
    public static final Parcelable.Creator<o0O000> CREATOR = new o0O0000O(0);
    public int OooO;
    public Intent OooO0Oo;
    public IBinder OooO0o;
    public String OooO0o0;
    public String OooO0oO;
    public int OooO0oo;
    public Bundle OooOO0;
    public o0O00OOO OooOO0O;

    public static o0O000 OooO0OO(Intent intent, String str, IBinder iBinder, String str2, int i, Bundle bundle) {
        o0O000 o0o000 = (o0O000) cy0.OooO00o(o0O000.class);
        if (o0o000 == null) {
            o0o000 = new o0O000();
        }
        o0o000.OooO0Oo = intent;
        o0o000.OooO0o0 = str;
        o0o000.OooO0o = iBinder;
        o0o000.OooO0oO = str2;
        o0o000.OooO0oo = i;
        o0o000.OooO = 0;
        o0o000.OooOO0 = bundle;
        return o0o000;
    }

    @Override // com.cmaster.cloner.ee
    public final void OooO00o() {
        pi1.OooO00o(this);
    }

    public final ce OooO0O0() {
        ce ceVar = (ce) cy0.OooO00o(ce.class);
        if (ceVar == null) {
            ceVar = new ce();
            ceVar.OooO0Oo = new ArrayList();
        }
        if (ceVar.OooO0Oo == null) {
            ceVar.OooO0Oo = new ArrayList();
        }
        ceVar.OooO0Oo.add(this);
        return ceVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO0Oo, i);
        parcel.writeString(this.OooO0o0);
        parcel.writeStrongBinder(this.OooO0o);
        parcel.writeString(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeInt(this.OooO);
        parcel.writeBundle(this.OooOO0);
    }
}
