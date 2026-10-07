package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class uj1 extends tj1 {
    public static CharSequence OooO(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = str.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean OooO0Oo(String str, String str2) {
        return str.indexOf(str2, 0) >= 0;
    }

    public static List OooO0o(String str) {
        wm0 wm0Var = new wm0(str);
        if (!wm0Var.hasNext()) {
            return nv.OooO0Oo;
        }
        Object next = wm0Var.next();
        if (!wm0Var.hasNext()) {
            return te.OooO0O0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (wm0Var.hasNext()) {
            arrayList.add(wm0Var.next());
        }
        return arrayList;
    }

    public static boolean OooO0o0(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static String OooO0oO(String str, String str2, String str3) {
        int i = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iIndexOf);
            sb.append(str3);
            i = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = str.indexOf(str2, iIndexOf + i2);
        } while (iIndexOf > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static boolean OooO0oo(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }
}
