package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fy0 extends r6 implements Parcelable, Serializable {
    public static final Parcelable.Creator<fy0> CREATOR = new o0O0000O(26);
    public boolean OooO0o0;

    public fy0(boolean z) {
        this.OooO0o0 = z;
    }

    public final void OooO0Oo(boolean z) {
        if (z != this.OooO0o0) {
            this.OooO0o0 = z;
            synchronized (this) {
                try {
                    l51 l51Var = this.OooO0Oo;
                    if (l51Var == null) {
                        return;
                    }
                    l51Var.OooO0O0(0, this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
    }
}
