package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo00OO0 {
    public final String OooO00o;
    public final boolean OooO0O0;

    public oOo00OO0(String str, boolean z) {
        this.OooO00o = str;
        this.OooO0O0 = z;
    }

    public final String toString() {
        String str = this.OooO00o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.OooO0O0);
        return sb.toString();
    }
}
