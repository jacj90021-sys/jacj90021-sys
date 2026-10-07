package com.cmaster.cloner;

import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zr {
    public final String OooO00o;
    public final long[] OooO0O0;
    public final File[] OooO0OO;
    public final File[] OooO0Oo;
    public km OooO0o;
    public boolean OooO0o0;
    public final /* synthetic */ as OooO0oO;

    public zr(as asVar, String str) {
        this.OooO0oO = asVar;
        this.OooO00o = str;
        int i = asVar.OooOO0;
        File file = asVar.OooO0Oo;
        this.OooO0O0 = new long[i];
        this.OooO0OO = new File[i];
        this.OooO0Oo = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.OooO0OO[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.OooO0Oo[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String OooO00o() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.OooO0O0) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
