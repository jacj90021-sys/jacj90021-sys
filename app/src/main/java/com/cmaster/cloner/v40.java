package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v40 {
    public final boolean OooO00o;

    public v40(boolean z) {
        this.OooO00o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v40) && this.OooO00o == ((v40) obj).OooO00o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.OooO00o) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.OooO00o;
    }
}
