package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r7 {
    public static final byte[] OooO0o0 = new byte[1792];
    public final String OooO00o;
    public final int OooO0O0;
    public int OooO0OO;
    public char OooO0Oo;

    static {
        for (int i = 0; i < 1792; i++) {
            OooO0o0[i] = Character.getDirectionality(i);
        }
    }

    public r7(String str) {
        this.OooO00o = str;
        this.OooO0O0 = str.length();
    }

    public final byte OooO00o() {
        int i = this.OooO0OO - 1;
        String str = this.OooO00o;
        char cCharAt = str.charAt(i);
        this.OooO0Oo = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.OooO0OO;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(str, i2);
            this.OooO0OO -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.OooO0OO = i2 - 1;
        char c = this.OooO0Oo;
        return c < 1792 ? OooO0o0[c] : Character.getDirectionality(c);
    }
}
