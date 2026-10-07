package com.cmaster.cloner;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0oO0O0o implements Parcelable {
    public static final Parcelable.Creator<o0oO0O0o> CREATOR = new o0O0000O(1);
    public final int OooO0Oo;
    public final Intent OooO0o0;

    public o0oO0O0o(Parcel parcel) {
        this.OooO0Oo = parcel.readInt();
        this.OooO0o0 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.OooO0Oo;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.OooO0o0);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo);
        Intent intent = this.OooO0o0;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public o0oO0O0o(int i, Intent intent) {
        this.OooO0Oo = i;
        this.OooO0o0 = intent;
    }
}
