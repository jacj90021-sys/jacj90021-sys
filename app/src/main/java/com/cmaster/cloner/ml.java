package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ml extends eq1 {
    public final String OooO0Oo;
    public final oOo000Oo OooO0o0;

    static {
        new ml("");
    }

    public ml(String str) {
        if (str == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-13, 28, -51, 49, 54, 38, -123, 89, -67, 72, -47, 45, 52, 45}, new byte[]{-128, 104, -65, 88, 88, 65, -91, 100}));
            throw null;
        }
        this.OooO0Oo = str.intern();
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((cCharAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | 224);
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((cCharAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.OooO0o0 = new oOo000Oo(bArr2);
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        String str = this.OooO0Oo;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append(u7.OooO00o(new byte[]{65, 56}, new byte[]{29, 77, 58, 17, -51, 71, -14, 31}));
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append(u7.OooO00o(new byte[]{-91, 10}, new byte[]{-7, 126, -126, -58, 6, 30, 95, -13}));
            } else if (cCharAt == '\n') {
                sb.append(u7.OooO00o(new byte[]{84, 119}, new byte[]{8, 25, 103, -3, -16, 13, 91, -56}));
            } else if (cCharAt != '\r') {
                char cCharAt2 = i < length + (-1) ? str.charAt(i + 1) : (char) 0;
                boolean z = cCharAt2 >= '0' && cCharAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((cCharAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            } else {
                sb.append(u7.OooO00o(new byte[]{-101, -127}, new byte[]{-57, -13, 109, 32, 121, 117, 55, 38}));
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        return this.OooO0Oo.compareTo(((ml) ohVar).OooO0Oo);
    }

    public final String OooO0o() {
        return "\"" + OooO00o() + '\"';
    }

    @Override // com.cmaster.cloner.oh
    public final String OooO0o0() {
        return u7.OooO00o(new byte[]{-117, -53, 85, -82}, new byte[]{-2, -65, 51, -106, 58, -108, -6, 114});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ml)) {
            return false;
        }
        return this.OooO0Oo.equals(((ml) obj).OooO0Oo);
    }

    @Override // com.cmaster.cloner.wp1
    public final vp1 getType() {
        return vp1.OooOoO0;
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{78, 13, 26, -42, -57, -33, 113, -40}, new byte[]{61, 121, 104, -65, -87, -72, 10, -6}));
        sb.append(OooO00o());
        return rj.OooO0oo(new byte[]{69, -49}, new byte[]{103, -78, -123, 80, 46, -56, 97, -62}, sb);
    }
}
