package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bu0 extends Exception {
    public final int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(String str, Exception exc) {
        super(str, exc);
        by2.OooO0o(str, "Provided message must not be empty.");
        this.OooO0Oo = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(String str, int i) {
        super(str);
        by2.OooO0o(str, "Provided message must not be empty.");
        this.OooO0Oo = i;
    }
}
