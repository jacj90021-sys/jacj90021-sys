package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s5 implements Parcelable {
    public static final Parcelable.Creator<s5> CREATOR = new o0O0000O(7);
    public String OooO0Oo;
    public int OooO0o;
    public long OooO0o0;

    public s5(int i, long j, String str) {
        this.OooO0Oo = str;
        this.OooO0o0 = j;
        this.OooO0o = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return TextUtils.equals(this.OooO0Oo, s5Var.OooO0Oo) && this.OooO0o == s5Var.OooO0o;
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode() + this.OooO0o;
    }

    public final String toString() {
        String str;
        String str2;
        long j = this.OooO0o0;
        String strOooO00o = sn2.OooO00o("m0zmepjE4f23S/sZ0tOkz/xetByEiKHH8FA=\n", "2S2UOfeghLQ=\n");
        int i = this.OooO0o;
        if (i == 16 || i == 256 || i == 2048 || i == 4096) {
            str = "NG0SN8Mm\n";
            str2 = "ZT9ReIdjyFE=\n";
        } else {
            str = "WFOR1Sh1Gw==\n";
            str2 = "GhLDlmcxXjw=\n";
        }
        return String.format(strOooO00o, sn2.OooO00o(str, str2), this.OooO0Oo, new SimpleDateFormat(sn2.OooO00o("0KXBGf0MPPLNuJgomHscsg==\n", "qdy4YNBBcd8=\n"), Locale.getDefault()).format(new Date(j)), Long.valueOf(j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO0Oo);
        parcel.writeLong(this.OooO0o0);
        parcel.writeInt(this.OooO0o);
    }
}
