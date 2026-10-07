package com.cmaster.cloner;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hk1 implements mc1 {
    public final c30 OooO0Oo;

    public hk1(c30 c30Var) {
        c30Var.getClass();
        this.OooO0Oo = c30Var;
    }

    @Override // com.cmaster.cloner.mc1
    /* renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final rk1 OooOOo0(String str) {
        int i;
        str.getClass();
        c30 c30Var = this.OooO0Oo;
        c30Var.getClass();
        String upperCase = uj1.OooO(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iIndexOf = 0;
            loop0: while (iIndexOf < length) {
                char cCharAt = upperCase.charAt(iIndexOf);
                if (cCharAt >= ' ' && cCharAt != ' ') {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iIndexOf2 = iIndexOf + 1;
                            if (upperCase.charAt(iIndexOf2) == '*') {
                                do {
                                    iIndexOf2 = upperCase.indexOf(42, iIndexOf2 + 1);
                                    if (iIndexOf2 >= 0) {
                                        i = iIndexOf2 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iIndexOf = iIndexOf2 + 2;
                            }
                        }
                        i2 = iIndexOf;
                        break;
                    }
                    if (upperCase.charAt(iIndexOf + 1) == '-') {
                        iIndexOf = upperCase.indexOf(10, iIndexOf + 2);
                        if (iIndexOf < 0) {
                            break;
                        }
                    } else {
                        i2 = iIndexOf;
                        break;
                    }
                }
                iIndexOf++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new qk1(c30Var, str);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new qk1(c30Var, str);
        }
        pk1 pk1Var = new pk1(c30Var, str);
        pk1Var.OooO0oO = new int[0];
        pk1Var.OooO0oo = new long[0];
        pk1Var.OooO = new double[0];
        pk1Var.OooOO0 = new String[0];
        pk1Var.OooOO0O = new byte[0][];
        return pk1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.OooO0Oo.close();
    }
}
